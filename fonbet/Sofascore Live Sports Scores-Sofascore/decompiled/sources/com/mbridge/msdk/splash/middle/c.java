package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.mbridge.msdk.setting.m;
import com.mbridge.msdk.splash.manager.e;
import com.mbridge.msdk.splash.manager.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private static String D = "SplashProvider";
    private CampaignEx A;
    private MBSplashPopView B;
    private String a;
    private String b;
    private MBridgeIds c;
    private long e;
    private e f;
    private f g;
    private b h;
    private MBSplashShowListener i;
    private d j;
    private MBSplashView k;
    private ViewGroup l;
    private View m;
    private m n;
    private boolean o;
    private ViewGroup p;
    private k q;
    private boolean r;
    private Activity y;
    private boolean z;
    private int d = 5;
    private int s = 1;
    private int t = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
    private int u = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
    private Object v = new Object();
    private Object w = new Object();
    public boolean x = false;
    private boolean C = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ CampaignEx a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;

        public a(CampaignEx campaignEx, int i, boolean z) {
            this.a = campaignEx;
            this.b = i;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.a, this.b - 1, this.c);
        }
    }

    public c(Activity activity, String str, String str2) {
        this.b = TextUtils.isEmpty(str) ? "" : str;
        this.a = str2;
        this.c = new MBridgeIds(str, str2);
        this.y = activity;
        b(activity);
    }

    private void a(String str, int i) {
        boolean z;
        synchronized (this.v) {
            try {
                if (this.o) {
                    if (this.h != null) {
                        this.h.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i);
                        this.o = true;
                    }
                    return;
                }
                this.o = true;
                int i2 = this.d;
                if (i2 < 2 || i2 > 10) {
                    if (this.h != null) {
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880037);
                        bVar.c("countDownTime must in 2 - 10");
                        this.h.a(bVar, i);
                        return;
                    }
                    return;
                }
                if (this.t == 0 || this.u == 0) {
                    if (this.h != null) {
                        this.h.a(new com.mbridge.msdk.foundation.error.b(880028), i);
                        return;
                    }
                    return;
                }
                try {
                    z = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                } catch (Exception unused) {
                    z = false;
                }
                if (!z) {
                    if (this.h != null) {
                        this.h.a(new com.mbridge.msdk.foundation.error.b(880029), i);
                        return;
                    }
                    return;
                }
                this.k.clearResState();
                this.n = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.a);
                if (this.f == null) {
                    this.f = new e(this.b, this.a, this.e * 1000);
                }
                b bVar2 = this.h;
                if (bVar2 != null) {
                    bVar2.a(str);
                    this.f.a(this.h);
                }
                this.k.resetLoadState();
                this.f.a(this.d);
                this.f.a(this.k);
                this.f.a(this.n);
                this.f.a(this.t, this.u);
                this.f.a(this.r);
                this.f.b(this.s);
                this.f.a(str, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(Activity activity) {
        if (this.g == null) {
            if (activity != null) {
                this.g = new f(activity, this.b, this.a);
            } else {
                this.g = new f(com.mbridge.msdk.foundation.controller.c.n().d(), this.b, this.a);
            }
        }
        if (this.k == null) {
            if (activity != null) {
                this.k = new MBSplashView(activity);
            } else {
                this.k = new MBSplashView(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        }
        k kVar = this.q;
        if (kVar == null) {
            kVar = new k();
            this.q = kVar;
        }
        kVar.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.a);
    }

    public void c(String str, ViewGroup viewGroup) {
        this.l = viewGroup;
        MBSplashView mBSplashView = this.k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx a2 = com.mbridge.msdk.splash.manager.d.a(this.k, this.b, this.a, str, this.r, this.d, true, false);
        if (a2 == null) {
            MBSplashShowListener mBSplashShowListener = this.i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.c, "campaignEx is vali");
                return;
            }
            return;
        }
        if (this.n == null) {
            this.n = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.a);
        }
        d dVar = new d(this, this.i, a2);
        this.j = dVar;
        if (this.t == 0 || this.u == 0) {
            dVar.a(this.c, "width or height is 0  or width or height is too small");
            return;
        }
        int i = this.d;
        if (i >= 2 && i <= 10) {
            b(a2, this.n.E(), false);
            return;
        }
        dVar.a(this.c, "countDownTime must in 2 - 10 ,but now is " + this.d);
    }

    public void d(String str, Activity activity) {
        ViewGroup a2 = a(activity);
        if (a2 != null) {
            d(str, a2);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.c, "activity is except,please check it");
        }
    }

    public long e() {
        return this.e;
    }

    public boolean f() {
        return this.r;
    }

    public boolean g() {
        return this.o;
    }

    public void h() {
        f fVar = this.g;
        if (fVar != null) {
            fVar.f();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.g;
        if (fVar != null) {
            fVar.g();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public void j() {
        this.C = true;
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.C = false;
        MBSplashShowListener mBSplashShowListener = this.i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.b, this.a));
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public int d() {
        return this.d;
    }

    public void d(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.c, "token is null or empty");
                return;
            }
            return;
        }
        c(str, viewGroup);
    }

    public void d(boolean z) {
        this.z = z;
    }

    public void b(String str) {
        a(str, 1);
    }

    public void b(String str, Activity activity) {
        ViewGroup a2 = a(activity);
        if (a2 == null) {
            if (this.h != null) {
                this.h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        b(str, a2);
    }

    public void b(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.h != null) {
                this.h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
                return;
            }
            return;
        }
        a(str, viewGroup);
    }

    public void b(int i) {
        this.d = i;
    }

    public void b(int i, int i2) {
        a(i2, i);
    }

    public String b() {
        if (!this.x) {
            e eVar = this.f;
            if (eVar != null) {
                return eVar.c();
            }
            return "";
        }
        f fVar = this.g;
        if (fVar != null) {
            return fVar.c();
        }
        return "";
    }

    public void b(CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx != null && z) {
            if (this.n == null) {
                this.n = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.a);
            }
            this.j = new d(this, this.i, campaignEx);
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            d dVar = this.j;
            if (dVar != null) {
                dVar.a(this.c, "container is null");
                return;
            }
            return;
        }
        if (this.g == null) {
            this.g = new f(viewGroup.getContext(), this.b, this.a);
        }
        this.A = campaignEx;
        a(campaignEx, i, z);
    }

    public void c(boolean z) {
        this.r = z;
    }

    public String c() {
        if (!this.x) {
            e eVar = this.f;
            if (eVar != null) {
                return eVar.d();
            }
            return "";
        }
        f fVar = this.g;
        if (fVar != null) {
            return fVar.d();
        }
        return "";
    }

    public void b(boolean z) {
        this.o = z;
    }

    public void c(String str, Activity activity) {
        ViewGroup a2 = a(activity);
        if (a2 == null) {
            MBSplashShowListener mBSplashShowListener = this.i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.c, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, a2);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.h != null) {
                this.h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
                return;
            }
            return;
        }
        b(str);
    }

    public void a(ViewGroup viewGroup) {
        this.p = viewGroup;
    }

    public void a(int i) {
        this.s = i;
    }

    public void a(long j) {
        this.e = j;
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        b bVar = this.h;
        if (bVar == null) {
            bVar = new b(this, this.c);
            this.h = bVar;
        }
        bVar.a(mBSplashLoadListener);
    }

    public void a(MBSplashShowListener mBSplashShowListener) {
        this.i = mBSplashShowListener;
    }

    public void a(String str, Activity activity) {
        ViewGroup a2 = a(activity);
        if (a2 == null) {
            if (this.h != null) {
                this.h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        a(str, a2);
    }

    public void a(String str, ViewGroup viewGroup) {
        this.l = viewGroup;
        MBSplashView mBSplashView = this.k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public boolean a(String str) {
        return com.mbridge.msdk.splash.manager.d.a(this.k, this.b, this.a, str, this.r, this.d, false, true) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i, boolean z) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.k, campaignEx)) {
            if (i > 0) {
                this.g.y.postDelayed(new a(campaignEx, i, z), 1L);
                return;
            }
            d dVar = this.j;
            if (dVar != null) {
                dVar.a(this.c, "campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.l.setLayoutParams(layoutParams);
        this.l.removeAllViews();
        this.g.c(this.d);
        this.g.a(this.p);
        this.g.a(this.j);
        q0.b(D, "start show process");
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            f1.a(this.k);
            this.l.addView(this.k);
        }
        this.g.a(this.r);
        this.g.a(campaignEx, this.k);
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.m = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.n().d(), new BaseSplashPopView.i(this.b, this.a, zoomOutTypeEnum.getIndex(), this.A), this.j);
        this.B = mBSplashPopView;
        return mBSplashPopView;
    }

    private void a(int i, int i2) {
        int n = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
        int m = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
        int i3 = this.s;
        if (i3 == 1) {
            if (m >= i2 * 4) {
                this.u = m - i2;
                this.t = n;
                return;
            } else {
                this.u = 0;
                this.t = 0;
                return;
            }
        }
        if (i3 == 2) {
            if (n >= i * 4) {
                this.t = n - i;
                this.u = m;
            } else {
                this.u = 0;
                this.t = 0;
            }
        }
    }

    public void a(boolean z) {
        MBSplashView mBSplashView = this.k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z);
        }
    }

    private ViewGroup a(Activity activity) {
        ViewGroup viewGroup;
        Throwable th;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            q0.d(D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Throwable th2) {
            viewGroup = null;
            th = th2;
        }
        try {
            try {
                return (ViewGroup) viewGroup.getChildAt(0);
            } catch (Exception e) {
                e.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
            return viewGroup;
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        try {
            MBSplashView mBSplashView = this.k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i, i2, i3, i4);
            }
        } catch (Throwable th) {
            q0.b(D, th.getMessage());
        }
    }

    public void a() {
        this.A = null;
        if (this.i != null) {
            this.i = null;
        }
        if (this.h != null) {
            this.h = null;
        }
        if (this.j != null) {
            this.j = null;
        }
        e eVar = this.f;
        if (eVar != null) {
            eVar.e();
        }
        f fVar = this.g;
        if (fVar != null) {
            fVar.h();
        }
        if (this.y != null) {
            this.y = null;
        }
    }
}
