package T7;

import T7.d0;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import g6.AsyncTaskC4337I;
import g6.C4331C;
import g6.C4333E;
import g6.C4339K;
import g6.C4355o;
import g6.C4357q;
import g6.C4358s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import v8.C6663l;
import z6.AbstractC6932b;
import z6.AbstractC6935e;
import z6.AbstractC6936f;

/* loaded from: classes2.dex */
public class d0 extends Dialog {

    /* renamed from: m, reason: collision with root package name */
    public static final b f11079m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f11080n = AbstractC6936f.f68617a;

    /* renamed from: o, reason: collision with root package name */
    public static volatile int f11081o;

    /* renamed from: a, reason: collision with root package name */
    public String f11082a;

    /* renamed from: b, reason: collision with root package name */
    public String f11083b;

    /* renamed from: c, reason: collision with root package name */
    public d f11084c;

    /* renamed from: d, reason: collision with root package name */
    public WebView f11085d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressDialog f11086e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f11087f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f11088g;

    /* renamed from: h, reason: collision with root package name */
    public e f11089h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11090i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11091j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11092k;

    /* renamed from: l, reason: collision with root package name */
    public WindowManager.LayoutParams f11093l;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            Z.o();
            return d0.f11081o;
        }

        public final void b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && d0.f11081o == 0) {
                    e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final d0 c(Context context, String str, Bundle bundle, int i10, d dVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            d0.s(context);
            return new d0(context, str, bundle, i10, d8.y.FACEBOOK, dVar, null);
        }

        public final d0 d(Context context, String str, Bundle bundle, int i10, d8.y targetApp, d dVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            d0.s(context);
            return new d0(context, str, bundle, i10, targetApp, dVar, null);
        }

        public final void e(int i10) {
            if (i10 == 0) {
                i10 = d0.f11080n;
            }
            d0.f11081o = i10;
        }

        public b() {
        }
    }

    public final class c extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f11101a;

        public c(d0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f11101a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            if (!this.f11101a.f11091j && (progressDialog = this.f11101a.f11086e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f11101a.f11088g;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView r10 = this.f11101a.r();
            if (r10 != null) {
                r10.setVisibility(0);
            }
            ImageView imageView = this.f11101a.f11087f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f11101a.f11092k = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Y y10 = Y.f11042a;
            Y.k0("FacebookSDK.WebDialog", Intrinsics.stringPlus("Webview loading URL: ", url));
            super.onPageStarted(view, url, bitmap);
            if (this.f11101a.f11091j || (progressDialog = this.f11101a.f11086e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int i10, String description, String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i10, description, failingUrl);
            this.f11101a.y(new C4355o(description, i10, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f11101a.y(new C4355o(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            int i10;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Y y10 = Y.f11042a;
            Y.k0("FacebookSDK.WebDialog", Intrinsics.stringPlus("Redirect URL: ", url));
            Uri parse = Uri.parse(url);
            boolean z10 = parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath());
            if (!StringsKt.startsWith$default(url, this.f11101a.f11083b, false, 2, (Object) null)) {
                if (StringsKt.startsWith$default(url, "fbconnect://cancel", false, 2, (Object) null)) {
                    this.f11101a.cancel();
                    return true;
                }
                if (!z10 && !StringsKt.contains$default((CharSequence) url, (CharSequence) PointerEventHelper.POINTER_TYPE_TOUCH, false, 2, (Object) null)) {
                    try {
                        this.f11101a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return false;
            }
            Bundle w10 = this.f11101a.w(url);
            String string = w10.getString("error");
            if (string == null) {
                string = w10.getString("error_type");
            }
            String string2 = w10.getString("error_msg");
            if (string2 == null) {
                string2 = w10.getString(EventKeys.ERROR_MESSAGE_KEY);
            }
            if (string2 == null) {
                string2 = w10.getString("error_description");
            }
            String string3 = w10.getString(EventKeys.ERROR_CODE_KEY);
            if (string3 != null && !Y.d0(string3)) {
                try {
                    i10 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                }
                if (!Y.d0(string) && Y.d0(string2) && i10 == -1) {
                    this.f11101a.z(w10);
                } else if (string == null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                    this.f11101a.cancel();
                } else if (i10 != 4201) {
                    this.f11101a.cancel();
                } else {
                    this.f11101a.y(new C4333E(new FacebookRequestError(i10, string, string2), string2));
                }
                return true;
            }
            i10 = -1;
            if (!Y.d0(string)) {
            }
            if (string == null) {
            }
            if (i10 != 4201) {
            }
            return true;
        }
    }

    public interface d {
        void a(Bundle bundle, C4357q c4357q);
    }

    public final class e extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final String f11102a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f11103b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f11104c;

        @NotNull
        private Exception[] exceptions;

        public e(d0 this$0, String action, Bundle parameters) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f11104c = this$0;
            this.f11102a = action;
            this.f11103b = parameters;
            this.exceptions = new Exception[0];
        }

        public static final void c(String[] results, int i10, e this$0, CountDownLatch latch, C4339K response) {
            FacebookRequestError b10;
            String str;
            Intrinsics.checkNotNullParameter(results, "$results");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(latch, "$latch");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                b10 = response.b();
                str = "Error staging photo.";
            } catch (Exception e10) {
                this$0.exceptions[i10] = e10;
            }
            if (b10 != null) {
                String d10 = b10.d();
                if (d10 != null) {
                    str = d10;
                }
                throw new g6.r(response, str);
            }
            JSONObject c10 = response.c();
            if (c10 == null) {
                throw new C4357q("Error staging photo.");
            }
            String optString = c10.optString("uri");
            if (optString == null) {
                throw new C4357q("Error staging photo.");
            }
            results[i10] = optString;
            latch.countDown();
        }

        public String[] b(Void... p02) {
            if (Y7.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(p02, "p0");
                String[] stringArray = this.f11103b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.exceptions = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken e10 = AccessToken.INSTANCE.e();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((AsyncTaskC4337I) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i10]);
                            if (Y.f0(uri)) {
                                strArr[i10] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                GraphRequest.b bVar = new GraphRequest.b() { // from class: T7.e0
                                    @Override // com.facebook.GraphRequest.b
                                    public final void a(C4339K c4339k) {
                                        d0.e.c(strArr, i10, this, countDownLatch, c4339k);
                                    }
                                };
                                C6663l c6663l = C6663l.f67094a;
                                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                                concurrentLinkedQueue.add(C6663l.u(e10, uri, bVar).l());
                            }
                            if (i11 > length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTaskC4337I) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return null;
            }
        }

        public void d(String[] strArr) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = this.f11104c.f11086e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.exceptions;
                int length = excArr.length;
                int i10 = 0;
                while (i10 < length) {
                    Exception exc = excArr[i10];
                    i10++;
                    if (exc != null) {
                        this.f11104c.y(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    this.f11104c.y(new C4357q("Failed to stage photos for web dialog"));
                    return;
                }
                List asList = ArraysKt.asList(strArr);
                if (asList.contains(null)) {
                    this.f11104c.y(new C4357q("Failed to stage photos for web dialog"));
                    return;
                }
                Y y10 = Y.f11042a;
                Y.r0(this.f11103b, "media", new JSONArray((Collection) asList));
                this.f11104c.f11082a = Y.g(P.b(), C4331C.w() + "/dialog/" + this.f11102a, this.f11103b).toString();
                ImageView imageView = this.f11104c.f11087f;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.f11104c.C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (Y7.a.d(this)) {
                return null;
            }
            try {
                return b((Void[]) objArr);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                d((String[]) obj);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }
    }

    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d8.y.valuesCustom().length];
            iArr[d8.y.INSTAGRAM.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class g extends WebView {
        public g(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    public /* synthetic */ d0(Context context, String str, Bundle bundle, int i10, d8.y yVar, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i10, yVar, dVar);
    }

    public static final boolean D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    public static final void p(d0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    public static final void s(Context context) {
        f11079m.b(context);
    }

    public static final void v(d0 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    public final void A(String expectedRedirectUrl) {
        Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
        this.f11083b = expectedRedirectUrl;
    }

    public final void B(d dVar) {
        this.f11084c = dVar;
    }

    public final void C(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        g gVar = new g(getContext());
        this.f11085d = gVar;
        gVar.setVerticalScrollBarEnabled(false);
        WebView webView = this.f11085d;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.f11085d;
        if (webView2 != null) {
            webView2.setWebViewClient(new c(this));
        }
        WebView webView3 = this.f11085d;
        WebSettings settings = webView3 == null ? null : webView3.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.f11085d;
        if (webView4 != null) {
            String str = this.f11082a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            webView4.loadUrl(str);
        }
        WebView webView5 = this.f11085d;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.f11085d;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.f11085d;
        WebSettings settings2 = webView7 == null ? null : webView7.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView8 = this.f11085d;
        WebSettings settings3 = webView8 != null ? webView8.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView9 = this.f11085d;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.f11085d;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.f11085d;
        if (webView11 != null) {
            webView11.setOnTouchListener(new View.OnTouchListener() { // from class: T7.a0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean D10;
                    D10 = d0.D(view, motionEvent);
                    return D10;
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f11085d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f11088g;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f11084c == null || this.f11090i) {
            return;
        }
        y(new C4358s());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f11085d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f11091j && (progressDialog = this.f11086e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void o() {
        ImageView imageView = new ImageView(getContext());
        this.f11087f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: T7.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.p(d0.this, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(AbstractC6932b.f68599b);
        ImageView imageView2 = this.f11087f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f11087f;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f11091j = false;
        Y y10 = Y.f11042a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (Y.o0(context) && (layoutParams = this.f11093l) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f11093l;
                Y.k0("FacebookSDK.WebDialog", Intrinsics.stringPlus("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f11086e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f11086e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(AbstractC6935e.f68613d));
        }
        ProgressDialog progressDialog3 = this.f11086e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f11086e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: T7.b0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    d0.v(d0.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f11088g = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        o();
        if (this.f11082a != null) {
            ImageView imageView = this.f11087f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f11088g;
        if (frameLayout != null) {
            frameLayout.addView(this.f11087f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f11088g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f11091j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 == 4) {
            WebView webView = this.f11085d;
            if (webView != null) {
                if (Intrinsics.areEqual(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.f11085d;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        e eVar = this.f11089h;
        if (eVar != null) {
            if ((eVar == null ? null : eVar.getStatus()) == AsyncTask.Status.PENDING) {
                e eVar2 = this.f11089h;
                if (eVar2 != null) {
                    eVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f11086e;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        x();
    }

    @Override // android.app.Dialog
    public void onStop() {
        e eVar = this.f11089h;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.f11086e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.f11093l = params;
        }
        super.onWindowAttributesChanged(params);
    }

    public final int q(int i10, float f10, int i11, int i12) {
        int i13 = (int) (i10 / f10);
        return (int) (i10 * (i13 <= i11 ? 1.0d : i13 >= i12 ? 0.5d : (((i12 - i13) / (i12 - i11)) * 0.5d) + 0.5d));
    }

    public final WebView r() {
        return this.f11085d;
    }

    public final boolean t() {
        return this.f11090i;
    }

    public final boolean u() {
        return this.f11092k;
    }

    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        Y y10 = Y.f11042a;
        Bundle p02 = Y.p0(parse.getQuery());
        p02.putAll(Y.p0(parse.getFragment()));
        return p02;
    }

    public final void x() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 < i11) {
            i10 = i11;
        }
        int min = Math.min(q(i12, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(q(i10, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    public final void y(Throwable th2) {
        if (this.f11084c == null || this.f11090i) {
            return;
        }
        this.f11090i = true;
        C4357q c4357q = th2 instanceof C4357q ? (C4357q) th2 : new C4357q(th2);
        d dVar = this.f11084c;
        if (dVar != null) {
            dVar.a(null, c4357q);
        }
        dismiss();
    }

    public final void z(Bundle bundle) {
        d dVar = this.f11084c;
        if (dVar == null || this.f11090i) {
            return;
        }
        this.f11090i = true;
        if (dVar != null) {
            dVar.a(bundle, null);
        }
        dismiss();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(Context context, String url) {
        this(context, url, f11079m.a());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public d0(Context context, String str, int i10) {
        super(context, i10 == 0 ? f11079m.a() : i10);
        this.f11083b = "fbconnect://success";
        this.f11082a = str;
    }

    public d0(Context context, String str, Bundle bundle, int i10, d8.y yVar, d dVar) {
        super(context, i10 == 0 ? f11079m.a() : i10);
        Uri g10;
        this.f11083b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = Y.X(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f11083b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString(ViewProps.DISPLAY, PointerEventHelper.POINTER_TYPE_TOUCH);
        bundle.putString("client_id", C4331C.m());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{C4331C.B()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f11084c = dVar;
        if (Intrinsics.areEqual(str, "share") && bundle.containsKey("media")) {
            this.f11089h = new e(this, str, bundle);
            return;
        }
        if (f.$EnumSwitchMapping$0[yVar.ordinal()] == 1) {
            g10 = Y.g(P.k(), "oauth/authorize", bundle);
        } else {
            g10 = Y.g(P.b(), C4331C.w() + "/dialog/" + ((Object) str), bundle);
        }
        this.f11082a = g10.toString();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Context f11094a;

        /* renamed from: b, reason: collision with root package name */
        public String f11095b;

        /* renamed from: c, reason: collision with root package name */
        public String f11096c;

        /* renamed from: d, reason: collision with root package name */
        public int f11097d;

        /* renamed from: e, reason: collision with root package name */
        public d f11098e;

        /* renamed from: f, reason: collision with root package name */
        public Bundle f11099f;

        /* renamed from: g, reason: collision with root package name */
        public AccessToken f11100g;

        public a(Context context, String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            AccessToken.Companion companion = AccessToken.INSTANCE;
            this.f11100g = companion.e();
            if (!companion.g()) {
                String J10 = Y.J(context);
                if (J10 == null) {
                    throw new C4357q("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f11095b = J10;
            }
            b(context, action, bundle);
        }

        public d0 a() {
            AccessToken accessToken = this.f11100g;
            if (accessToken != null) {
                Bundle bundle = this.f11099f;
                if (bundle != null) {
                    bundle.putString(PublisherMetadata.APP_ID, accessToken == null ? null : accessToken.getApplicationId());
                }
                Bundle bundle2 = this.f11099f;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.f11100g;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.getToken() : null);
                }
            } else {
                Bundle bundle3 = this.f11099f;
                if (bundle3 != null) {
                    bundle3.putString(PublisherMetadata.APP_ID, this.f11095b);
                }
            }
            b bVar = d0.f11079m;
            Context context = this.f11094a;
            if (context != null) {
                return bVar.c(context, this.f11096c, this.f11099f, this.f11097d, this.f11098e);
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final void b(Context context, String str, Bundle bundle) {
            this.f11094a = context;
            this.f11096c = str;
            if (bundle != null) {
                this.f11099f = bundle;
            } else {
                this.f11099f = new Bundle();
            }
        }

        public final String c() {
            return this.f11095b;
        }

        public final Context d() {
            return this.f11094a;
        }

        public final d e() {
            return this.f11098e;
        }

        public final Bundle f() {
            return this.f11099f;
        }

        public final int g() {
            return this.f11097d;
        }

        public final a h(d dVar) {
            this.f11098e = dVar;
            return this;
        }

        public a(Context context, String str, String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f11095b = Z.n(str == null ? Y.J(context) : str, "applicationId");
            b(context, action, bundle);
        }
    }
}
