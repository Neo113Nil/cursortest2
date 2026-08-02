package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.widget.MBAdChoice;
import com.unity3d.ads.BuildConfig;
import defpackage.lnb;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBNativeAdvancedView extends RelativeLayout {
    private static String i = "MBAdvancedNativeView";
    private MBNativeAdvancedWebview a;
    private View b;
    private boolean c;
    private boolean d;
    private boolean e;
    MBAdChoice f;
    private com.mbridge.msdk.advanced.signal.b g;
    private Context h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBNativeAdvancedView.i, "webviewshow");
                String str = "";
                try {
                    int[] iArr = new int[2];
                    MBNativeAdvancedView.this.a.getLocationOnScreen(iArr);
                    q0.b(MBNativeAdvancedView.i, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(c.n().d(), (float) iArr[1]));
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    q0.b(MBNativeAdvancedView.i, th.getMessage(), th);
                }
                f.a().a((WebView) MBNativeAdvancedView.this.a, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = context;
    }

    private void b() {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.a;
        if (mBNativeAdvancedWebview != null && mBNativeAdvancedWebview.getParent() == null) {
            addView(this.a, new ViewGroup.LayoutParams(-1, -1));
        }
        c();
        View view = this.b;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = v0.a(getContext(), 2.0f);
                layoutParams.topMargin = v0.a(getContext(), 2.0f);
                addView(this.b, layoutParams);
            } else {
                bringChildToFront(this.b);
            }
        }
        if (this.f == null) {
            MBAdChoice mBAdChoice = new MBAdChoice(getContext());
            this.f = mBAdChoice;
            mBAdChoice.setFeedbackDialogEventListener(new a());
        }
    }

    private void c() {
        int[] iArr = new int[2];
        this.a.getLocationInWindow(iArr);
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.a;
        transInfoForMraid(mBNativeAdvancedWebview, iArr[0], iArr[1], mBNativeAdvancedWebview.getWidth(), this.a.getHeight());
        MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.a;
        if (mBNativeAdvancedWebview2 != null) {
            mBNativeAdvancedWebview2.setObject(this.g);
            this.a.post(new b());
        }
    }

    public static void transInfoForMraid(WebView webView, int i2, int i3, int i4, int i5) {
        q0.b(i, "transInfoForMraid");
        try {
            int i6 = c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.n, i6 == 2 ? U3.i.C : i6 == 1 ? U3.i.D : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float n = m0.n(c.n().d());
            float m = m0.m(c.n().d());
            HashMap v = m0.v(c.n().d());
            int intValue = ((Integer) v.get("width")).intValue();
            int intValue2 = ((Integer) v.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "inline");
            hashMap.put("state", BuildConfig.FLAVOR);
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            float f = i2;
            float f2 = i3;
            float f3 = i4;
            float f4 = i5;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, n, m);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th) {
            q0.b(i, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i2) {
        View view = this.b;
        if (view != null) {
            if (i2 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.e = false;
        this.d = false;
        this.c = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.b;
        if (view != null && view.getParent() != null) {
            removeView(this.b);
        }
        MBAdChoice mBAdChoice = this.f;
        if (mBAdChoice == null || mBAdChoice.getParent() == null) {
            return;
        }
        removeView(this.f);
    }

    public void destroy() {
        removeAllViews();
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.a;
        if (mBNativeAdvancedWebview != null && !mBNativeAdvancedWebview.isDestoryed()) {
            this.a.release();
            com.mbridge.msdk.advanced.signal.a.a(this.a, "onSystemDestory", "");
        }
        if (this.h != null) {
            this.h = null;
        }
    }

    public com.mbridge.msdk.advanced.signal.b getAdvancedNativeSignalCommunicationImpl() {
        return this.g;
    }

    public MBNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.a;
    }

    public View getCloseView() {
        return this.b;
    }

    public boolean isEndCardReady() {
        return this.e;
    }

    public boolean isH5Ready() {
        return this.c;
    }

    public boolean isVideoReady() {
        return this.d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.e = false;
        this.d = false;
        this.c = false;
    }

    public void setAdChoiceCampaign(CampaignEx campaignEx) {
        MBAdChoice mBAdChoice = this.f;
        if (mBAdChoice != null) {
            mBAdChoice.setCampaign(campaignEx);
            if (this.f.getParent() != null) {
                bringChildToFront(this.f);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(lnb.c(6.0f), lnb.c(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            addView(this.f, layoutParams);
        }
    }

    public void setAdvancedNativeSignalCommunicationImpl(com.mbridge.msdk.advanced.signal.b bVar) {
        this.g = bVar;
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.a;
        if (mBNativeAdvancedWebview != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setAdvancedNativeWebview(MBNativeAdvancedWebview mBNativeAdvancedWebview) {
        this.a = mBNativeAdvancedWebview;
        com.mbridge.msdk.advanced.signal.b bVar = this.g;
        if (bVar != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setCloseView(View view) {
        this.b = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z) {
        this.e = z;
    }

    public void setH5Ready(boolean z) {
        this.c = z;
    }

    public void setVideoReady(boolean z) {
        this.d = z;
    }

    public void show() {
        b();
        clearResState();
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBNativeAdvancedView(Context context) {
        this(context, null);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBNativeAdvancedView.i, th.getMessage(), th);
                str = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBNativeAdvancedView.i, th.getMessage(), th);
                str = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String str2;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                str2 = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBNativeAdvancedView.i, th.getMessage(), th);
                str2 = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
        }
    }
}
