package io.branch.referral;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import io.branch.referral.Defines;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class BranchViewHandler {
    public static final int BRANCH_VIEW_ERR_ALREADY_SHOWING = -200;
    public static final int BRANCH_VIEW_ERR_INVALID_VIEW = -201;
    public static final int BRANCH_VIEW_ERR_REACHED_LIMIT = -203;
    public static final int BRANCH_VIEW_ERR_TEMP_UNAVAILABLE = -202;
    private static final String BRANCH_VIEW_REDIRECT_ACTION_ACCEPT = "accept";
    private static final String BRANCH_VIEW_REDIRECT_ACTION_CANCEL = "cancel";
    private static final String BRANCH_VIEW_REDIRECT_SCHEME = "branch-cta";
    private static BranchViewHandler thisInstance_;
    private Dialog branchViewDialog_;
    private boolean isBranchViewAccepted_;
    private boolean isBranchViewDialogShowing_;
    private String parentActivityClassName_;
    private boolean webViewLoadError_;
    private BranchView openOrInstallPendingBranchView_ = null;
    private boolean loadingHtmlInBackGround_ = false;

    public interface IBranchViewEvents {
        void onBranchViewAccepted(String str, String str2);

        void onBranchViewCancelled(String str, String str2);

        void onBranchViewError(int i, String str, String str2);

        void onBranchViewVisible(String str, String str2);
    }

    private BranchViewHandler() {
    }

    public static BranchViewHandler getInstance() {
        if (thisInstance_ == null) {
            thisInstance_ = new BranchViewHandler();
        }
        return thisInstance_;
    }

    public boolean showPendingBranchView(Context context) {
        boolean showBranchView = showBranchView(this.openOrInstallPendingBranchView_, context, null);
        if (showBranchView) {
            this.openOrInstallPendingBranchView_ = null;
        }
        return showBranchView;
    }

    public boolean showBranchView(JSONObject jSONObject, String str, Context context, IBranchViewEvents iBranchViewEvents) {
        return showBranchView(new BranchView(jSONObject, str), context, iBranchViewEvents);
    }

    private boolean showBranchView(BranchView branchView, Context context, IBranchViewEvents iBranchViewEvents) {
        if (this.isBranchViewDialogShowing_ || this.loadingHtmlInBackGround_) {
            if (iBranchViewEvents != null) {
                iBranchViewEvents.onBranchViewError(-200, "Unable to create a Branch view. A Branch view is already showing", branchView.branchViewAction_);
            }
            return false;
        }
        this.isBranchViewDialogShowing_ = false;
        this.isBranchViewAccepted_ = false;
        if (context != null && branchView != null) {
            if (branchView.isAvailable(context)) {
                if (!TextUtils.isEmpty(branchView.webViewHtml_)) {
                    createAndShowBranchView(branchView, context, iBranchViewEvents);
                } else {
                    this.loadingHtmlInBackGround_ = true;
                    new loadBranchViewTask(branchView, context, iBranchViewEvents).execute(new Void[0]);
                }
                return true;
            }
            if (iBranchViewEvents != null) {
                iBranchViewEvents.onBranchViewError(-203, "Unable to create this Branch view. Reached maximum usage limit ", branchView.branchViewAction_);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndShowBranchView(final BranchView branchView, Context context, final IBranchViewEvents iBranchViewEvents) {
        if (context == null || branchView == null) {
            return;
        }
        final WebView webView = new WebView(context);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setLayerType(2, null);
        this.webViewLoadError_ = false;
        if (TextUtils.isEmpty(branchView.webViewHtml_)) {
            return;
        }
        webView.loadDataWithBaseURL(null, branchView.webViewHtml_, "text/html", "utf-8", null);
        webView.setWebViewClient(new WebViewClient() { // from class: io.branch.referral.BranchViewHandler.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                boolean handleUserActionRedirect = BranchViewHandler.this.handleUserActionRedirect(str);
                if (handleUserActionRedirect) {
                    if (BranchViewHandler.this.branchViewDialog_ != null) {
                        BranchViewHandler.this.branchViewDialog_.dismiss();
                    }
                    return handleUserActionRedirect;
                }
                webView2.loadUrl(str);
                return handleUserActionRedirect;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                super.onPageStarted(webView2, str, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView2, int i, String str, String str2) {
                super.onReceivedError(webView2, i, str, str2);
                BranchViewHandler.this.webViewLoadError_ = true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                BranchViewHandler.this.openBranchViewDialog(branchView, iBranchViewEvents, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openBranchViewDialog(final BranchView branchView, final IBranchViewEvents iBranchViewEvents, WebView webView) {
        if (!this.webViewLoadError_ && Branch.getInstance() != null && Branch.getInstance().currentActivityReference_ != null) {
            Activity activity = Branch.getInstance().currentActivityReference_.get();
            if (activity != null) {
                branchView.updateUsageCount(activity.getApplicationContext(), branchView.branchViewID_);
                this.parentActivityClassName_ = activity.getClass().getName();
                RelativeLayout relativeLayout = new RelativeLayout(activity);
                relativeLayout.setVisibility(8);
                relativeLayout.addView(webView, new RelativeLayout.LayoutParams(-1, -1));
                relativeLayout.setBackgroundColor(0);
                Dialog dialog = this.branchViewDialog_;
                if (dialog != null && dialog.isShowing()) {
                    if (iBranchViewEvents != null) {
                        iBranchViewEvents.onBranchViewError(-200, "Unable to create a Branch view. A Branch view is already showing", branchView.branchViewAction_);
                        return;
                    }
                    return;
                }
                Dialog dialog2 = new Dialog(activity, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
                this.branchViewDialog_ = dialog2;
                dialog2.setContentView(relativeLayout);
                relativeLayout.setVisibility(0);
                webView.setVisibility(0);
                this.branchViewDialog_.show();
                showViewWithAlphaAnimation(relativeLayout);
                showViewWithAlphaAnimation(webView);
                this.isBranchViewDialogShowing_ = true;
                if (iBranchViewEvents != null) {
                    iBranchViewEvents.onBranchViewVisible(branchView.branchViewAction_, branchView.branchViewID_);
                }
                this.branchViewDialog_.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.branch.referral.BranchViewHandler.2
                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        BranchViewHandler.this.isBranchViewDialogShowing_ = false;
                        BranchViewHandler.this.branchViewDialog_ = null;
                        if (iBranchViewEvents != null) {
                            if (BranchViewHandler.this.isBranchViewAccepted_) {
                                iBranchViewEvents.onBranchViewAccepted(branchView.branchViewAction_, branchView.branchViewID_);
                            } else {
                                iBranchViewEvents.onBranchViewCancelled(branchView.branchViewAction_, branchView.branchViewID_);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        this.isBranchViewDialogShowing_ = false;
        if (iBranchViewEvents != null) {
            iBranchViewEvents.onBranchViewError(-202, "Unable to create a Branch view due to a temporary network error", branchView.branchViewAction_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleUserActionRedirect(String str) {
        try {
            URI uri = new URI(str);
            if (uri.getScheme().equalsIgnoreCase(BRANCH_VIEW_REDIRECT_SCHEME)) {
                if (uri.getHost().equalsIgnoreCase(BRANCH_VIEW_REDIRECT_ACTION_ACCEPT)) {
                    this.isBranchViewAccepted_ = true;
                    return true;
                }
                if (uri.getHost().equalsIgnoreCase(BRANCH_VIEW_REDIRECT_ACTION_CANCEL)) {
                    this.isBranchViewAccepted_ = false;
                    return true;
                }
            }
        } catch (URISyntaxException unused) {
        }
        return false;
    }

    private void showViewWithAlphaAnimation(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setStartOffset(10L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    private void hideViewWithAlphaAnimation(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setStartOffset(10L);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        view.setVisibility(8);
        view.startAnimation(alphaAnimation);
    }

    public boolean markInstallOrOpenBranchViewPending(JSONObject jSONObject, String str) {
        Activity activity;
        BranchView branchView = new BranchView(jSONObject, str);
        if (Branch.getInstance().currentActivityReference_ == null || (activity = Branch.getInstance().currentActivityReference_.get()) == null || !branchView.isAvailable(activity)) {
            return false;
        }
        this.openOrInstallPendingBranchView_ = new BranchView(jSONObject, str);
        return true;
    }

    public boolean isInstallOrOpenBranchViewPending(Context context) {
        BranchView branchView = this.openOrInstallPendingBranchView_;
        return branchView != null && branchView.isAvailable(context);
    }

    private class loadBranchViewTask extends AsyncTask<Void, Void, Boolean> {
        private final BranchView branchView;
        private final IBranchViewEvents callback;
        private final Context context;
        private String htmlString;

        public loadBranchViewTask(BranchView branchView, Context context, IBranchViewEvents iBranchViewEvents) {
            this.branchView = branchView;
            this.context = context;
            this.callback = iBranchViewEvents;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0050  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Boolean doInBackground(Void... voidArr) {
            int i;
            int i2 = -1;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.branchView.webViewUrl_).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                i = httpURLConnection.getResponseCode();
                if (i == 200) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        this.branchView.webViewHtml_ = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        inputStream.close();
                    } catch (Exception unused) {
                        i2 = i;
                        i = i2;
                        return Boolean.valueOf(i == 200);
                    }
                }
            } catch (Exception unused2) {
            }
            return Boolean.valueOf(i == 200);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            super.onPostExecute((loadBranchViewTask) bool);
            if (bool.booleanValue()) {
                BranchViewHandler.this.createAndShowBranchView(this.branchView, this.context, this.callback);
            } else {
                IBranchViewEvents iBranchViewEvents = this.callback;
                if (iBranchViewEvents != null) {
                    iBranchViewEvents.onBranchViewError(-202, "Unable to create a Branch view due to a temporary network error", this.branchView.branchViewAction_);
                }
            }
            BranchViewHandler.this.loadingHtmlInBackGround_ = false;
        }
    }

    private class BranchView {
        private static final int USAGE_UNLIMITED = -1;
        private String branchViewAction_;
        private String branchViewID_;
        private int num_of_use_;
        private String webViewHtml_;
        private String webViewUrl_;

        private BranchView(JSONObject jSONObject, String str) {
            this.branchViewID_ = "";
            this.num_of_use_ = 1;
            this.webViewUrl_ = "";
            this.webViewHtml_ = "";
            try {
                this.branchViewAction_ = str;
                if (jSONObject.has(Defines.Jsonkey.BranchViewID.getKey())) {
                    this.branchViewID_ = jSONObject.getString(Defines.Jsonkey.BranchViewID.getKey());
                }
                if (jSONObject.has(Defines.Jsonkey.BranchViewNumOfUse.getKey())) {
                    this.num_of_use_ = jSONObject.getInt(Defines.Jsonkey.BranchViewNumOfUse.getKey());
                }
                if (jSONObject.has(Defines.Jsonkey.BranchViewUrl.getKey())) {
                    this.webViewUrl_ = jSONObject.getString(Defines.Jsonkey.BranchViewUrl.getKey());
                }
                if (jSONObject.has(Defines.Jsonkey.BranchViewHtml.getKey())) {
                    this.webViewHtml_ = jSONObject.getString(Defines.Jsonkey.BranchViewHtml.getKey());
                }
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isAvailable(Context context) {
            int branchViewUsageCount = PrefHelper.getInstance(context).getBranchViewUsageCount(this.branchViewID_);
            int i = this.num_of_use_;
            return i > branchViewUsageCount || i == -1;
        }

        public void updateUsageCount(Context context, String str) {
            PrefHelper.getInstance(context).updateBranchViewUsageCount(str);
        }
    }

    public void onCurrentActivityDestroyed(Activity activity) {
        String str = this.parentActivityClassName_;
        if (str == null || !str.equalsIgnoreCase(activity.getClass().getName())) {
            return;
        }
        this.isBranchViewDialogShowing_ = false;
    }
}
