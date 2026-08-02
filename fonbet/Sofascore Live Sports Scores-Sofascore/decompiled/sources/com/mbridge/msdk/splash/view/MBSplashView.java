package com.mbridge.msdk.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.U3;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.unity3d.ads.BuildConfig;
import defpackage.w1l;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBSplashView extends RelativeLayout {
    private static String u = "MBSplashView";
    private int a;
    private MBSplashWebview b;
    private com.mbridge.msdk.splash.view.a c;
    private ViewGroup d;
    private View e;
    private View f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private ViewGroup k;
    private View l;
    private boolean m;
    private boolean n;
    private RelativeLayout.LayoutParams o;
    private com.mbridge.msdk.splash.signal.b p;
    private DyCountDownListener q;
    private boolean r;
    private View.OnTouchListener s;
    private boolean t;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.r;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ CampaignEx a;

        public b(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.b(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBSplashView.u, "webviewshow");
                String str = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.b.getLocationOnScreen(iArr);
                    q0.b(MBSplashView.u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[1]));
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    q0.b(MBSplashView.u, th.getMessage(), th);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.b, iArr2[0], iArr2[1], MBSplashView.this.b.getWidth(), MBSplashView.this.b.getHeight());
                f.a().a((WebView) MBSplashView.this.b, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = true;
        this.s = new a();
        this.t = true;
        b();
    }

    private void a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.t = true;
        if (this.f != null) {
            if (this.d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.a == 2) {
                this.g = v0.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.d.getId());
                if (!this.m || (view2 = this.l) == null) {
                    MBSplashWebview mBSplashWebview = this.b;
                    if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                        addView(this.b, layoutParams);
                    }
                    b(campaignEx);
                } else {
                    if (view2.getParent() != null) {
                        f1.a(this.l);
                    }
                    addView(this.l, layoutParams);
                }
                ViewGroup viewGroup = this.d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i = this.o.width;
                    f1.a(this.f);
                    int i2 = this.g / 4;
                    ViewGroup viewGroup2 = this.d;
                    if (i > i2) {
                        viewGroup2.addView(this.f, i2, -1);
                        i = i2;
                    } else {
                        viewGroup2.addView(this.f, i, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.d, layoutParams2);
                }
            } else {
                this.g = v0.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.d.getId());
                if (!this.m || (view = this.l) == null) {
                    MBSplashWebview mBSplashWebview2 = this.b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.b, layoutParams3);
                    }
                    b(campaignEx);
                } else {
                    if (view.getParent() != null) {
                        f1.a(this.l);
                    }
                    addView(this.l, layoutParams3);
                }
                ViewGroup viewGroup3 = this.d;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i3 = this.o.height;
                    int i4 = this.g / 4;
                    if (i3 > i4) {
                        i3 = i4;
                    }
                    f1.a(this.f);
                    this.d.addView(this.f, -1, i3);
                    addView(this.d, w1l.c(-1, i3, 12));
                }
            }
        } else if (!this.m || (view3 = this.l) == null) {
            MBSplashWebview mBSplashWebview3 = this.b;
            if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                addView(this.b, new ViewGroup.LayoutParams(-1, -1));
            }
            b(campaignEx);
        } else {
            if (view3.getParent() != null) {
                f1.a(this.l);
            }
            addView(this.l, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.e;
        if (view4 != null) {
            if (view4.getParent() != null) {
                bringChildToFront(this.e);
                return;
            }
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v0.a(getContext(), 100.0f), v0.a(getContext(), 30.0f));
            layoutParams4.addRule(10);
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v0.a(getContext(), 10.0f);
            layoutParams4.topMargin = v0.a(getContext(), 10.0f);
            addView(this.e, layoutParams4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        MBSplashWebview mBSplashWebview = this.b;
        if (mBSplashWebview != null) {
            if (campaignEx != null ? h.b(campaignEx, null, mBSplashWebview, campaignEx.getImpReportType()) : true) {
                this.b.setObject(this.p);
                this.b.post(new c());
            } else if (this.t) {
                this.t = false;
                this.b.postDelayed(new b(campaignEx), 200L);
            }
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i2, int i3, int i4) {
        q0.b(u, "transInfoForMraid");
        try {
            int i5 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.n, i5 == 2 ? U3.i.C : i5 == 1 ? U3.i.D : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float n = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float m = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap v = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int intValue = ((Integer) v.get("width")).intValue();
            int intValue2 = ((Integer) v.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", BuildConfig.FLAVOR);
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, n, m);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th) {
            q0.b(u, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.e;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.j = false;
        this.i = false;
        this.h = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.b;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.b.finishAdSession();
        com.mbridge.msdk.splash.signal.c.a(this.b, "onSystemDestory", "");
        this.b.release();
        this.b = null;
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.s;
    }

    public View getCloseView() {
        return this.e;
    }

    public ViewGroup getDevContainer() {
        return this.k;
    }

    public View getIconVg() {
        return this.f;
    }

    public View getSplashNativeView() {
        return this.l;
    }

    public com.mbridge.msdk.splash.signal.b getSplashSignalCommunicationImpl() {
        return this.p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.b;
    }

    public boolean isAttach() {
        return this.n;
    }

    public boolean isDynamicView() {
        return this.m;
    }

    public boolean isH5Ready() {
        return this.h;
    }

    public boolean isImageReady() {
        return this.j;
    }

    public boolean isVideoReady() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.i = false;
        this.h = false;
    }

    public void setAllowClickSplash(boolean z) {
        this.r = z;
        setOnTouchListener(this.s);
    }

    public void setCloseView(View view) {
        this.e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.q = dyCountDownListener;
    }

    public void setDynamicView(boolean z) {
        this.m = z;
    }

    public void setH5Ready(boolean z) {
        this.h = z;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f = view;
        this.o = layoutParams;
    }

    public void setImageReady(boolean z) {
        this.j = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        View view = this.l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i, i2, i3, i4);
        }
        if (this.b != null) {
            f.a().a((WebView) this.b, "oncutoutfetched", Base64.encodeToString(d0.a(-999, i, i2, i3, i4).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(com.mbridge.msdk.splash.signal.b bVar) {
        this.p = bVar;
        MBSplashWebview mBSplashWebview = this.b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(bVar);
        }
    }

    public void setSplashWebView() {
        if (this.b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.b = mBSplashWebview;
                com.mbridge.msdk.splash.signal.b bVar = this.p;
                if (bVar != null) {
                    mBSplashWebview.setObject(bVar);
                }
                com.mbridge.msdk.splash.view.a aVar = this.c;
                if (aVar != null) {
                    this.b.setWebViewClient(aVar);
                    return;
                }
                com.mbridge.msdk.splash.view.a aVar2 = new com.mbridge.msdk.splash.view.a();
                this.c = aVar2;
                this.b.setWebViewClient(aVar2);
            } catch (Throwable th) {
                q0.b(u, th.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z) {
        this.i = z;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.p != null && (viewGroup = this.k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.p.a(this.k.getContext());
            com.mbridge.msdk.splash.view.a aVar = this.c;
            if (aVar != null) {
                aVar.a(this.p.a());
            }
        }
        a(campaignEx);
        clearResState();
    }

    public void updateCountdown(int i) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.b != null && !this.m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i);
                f.a().a((WebView) this.b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.m && (view = this.l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i);
        }
        if (!this.m || (dyCountDownListener = this.q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i);
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.a = getResources().getConfiguration().orientation;
    }
}
