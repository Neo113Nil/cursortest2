package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.y0;
import defpackage.a70;
import defpackage.aal;
import defpackage.bea;
import defpackage.bf3;
import defpackage.bka;
import defpackage.bnk;
import defpackage.bsk;
import defpackage.h90;
import defpackage.joa;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.p2g;
import defpackage.pea;
import defpackage.srk;
import defpackage.u4a;
import defpackage.w2g;
import defpackage.x9l;
import defpackage.y9l;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z9l;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class l extends Activity {
    public static volatile y0 h;
    public static volatile com.vungle.ads.internal.presenter.a i;
    public com.vungle.ads.internal.presenter.r a;
    public r3 b;
    public Object c;
    public com.vungle.ads.internal.util.s e;
    public final com.vungle.ads.internal.util.w d = new com.vungle.ads.internal.util.w();
    public final b f = new b(this);
    public final AtomicBoolean g = new AtomicBoolean(false);

    static {
        new a();
    }

    public static final x9l a(l lVar, View view, x9l x9lVar) {
        lVar.getClass();
        view.getClass();
        x9lVar.getClass();
        if (!lVar.g.get()) {
            u4a i2 = x9lVar.a.i(647);
            i2.getClass();
            view.setPadding(i2.a, i2.b, i2.c, i2.d);
        }
        return x9lVar;
    }

    public static final void b(l lVar) {
        lVar.getClass();
        com.vungle.ads.internal.presenter.r rVar = lVar.a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", new c(i2, i3, intent));
        if (i2 == 10001) {
            this.g.set(false);
            com.vungle.ads.internal.presenter.r rVar = this.a;
            if (rVar != null) {
                String j = ljg.j(i3, "onActivityResultCode=");
                m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                m2Var.c = 1L;
                AnalyticsClient.INSTANCE.a(m2Var, rVar.b(), j);
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        try {
            super.onConfigurationChanged(configuration);
            int i2 = configuration.orientation;
            if (i2 == 2) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdActivity", U3.i.C);
            } else if (i2 == 1) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdActivity", U3.i.D);
            }
            com.vungle.ads.internal.presenter.r rVar = this.a;
            if (rVar != null) {
                rVar.f();
            }
        } catch (Exception e) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onConfigurationChanged: ");
            a.append(e.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("AdActivity", a.toString());
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
        y0 y0Var = h;
        com.vungle.ads.internal.presenter.a aVar = i;
        if (y0Var == null) {
            Intent intent = getIntent();
            intent.getClass();
            String b = a.b(intent);
            if (b == null) {
                b = "";
            }
            if (aVar != null) {
                aVar.a(new AdNotLoadedCantPlay(lnb.o("Can not play fullscreen ad. placement=", b, " pendingData is null")).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), b);
            }
            finish();
            return;
        }
        h0 a = y0Var.a();
        i3 b2 = y0Var.b();
        com.vungle.ads.internal.presenter.z c = y0Var.c();
        this.e = a.q();
        try {
            com.vungle.ads.internal.ui.view.k kVar = new com.vungle.ads.internal.ui.view.k(this, a.h());
            bea.L(getWindow(), false);
            long j = getIntent().getBooleanExtra("ad_invisible_logged", false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            m2Var.a(Long.valueOf(j));
            AnalyticsClient.a(analyticsClient, m2Var, this.e, 4);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdActivity", "Log metric AD_VISIBILITY: " + j);
            ysa ysaVar = ysa.a;
            joa a2 = ypa.a(ysaVar, new d(this));
            Intent intent2 = getIntent();
            intent2.getClass();
            String a3 = a.a(intent2);
            FrameLayout frameLayout = null;
            r3 r3Var = a3 != null ? new r3(a3) : null;
            this.b = r3Var;
            if (r3Var != null) {
                ((com.vungle.ads.internal.signals.j) a2.getValue()).a(r3Var);
            }
            kVar.setCloseDelegate(new h(this, a2));
            kVar.setOnViewTouchListener(new i(this));
            kVar.setOrientationDelegate(new j(this));
            joa a4 = ypa.a(ysaVar, new e(this));
            joa a5 = ypa.a(ysaVar, new f(this));
            com.vungle.ads.internal.executor.j f = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a4.getValue())).f();
            ReentrantLock reentrantLock = e0.a;
            z a6 = e0.a(a, b2, f, (com.vungle.ads.internal.platform.f) a5.getValue());
            com.vungle.ads.internal.omsdk.d dVar = (com.vungle.ads.internal.omsdk.d) ypa.a(ysaVar, new g(this)).getValue();
            boolean C = a.C();
            dVar.getClass();
            com.vungle.ads.internal.omsdk.e a7 = com.vungle.ads.internal.omsdk.d.a(C);
            com.vungle.ads.internal.executor.j d = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a4.getValue())).d();
            a6.a(a7);
            this.d.a(a6);
            com.vungle.ads.internal.presenter.r rVar = new com.vungle.ads.internal.presenter.r(kVar, a, b2, a6, d, a7, (com.vungle.ads.internal.platform.f) a5.getValue());
            rVar.a(aVar);
            rVar.a(c);
            rVar.a(new k(this));
            rVar.g();
            setContentView(kVar, kVar.getLayoutParams());
            try {
                p2g p2gVar = w2g.b;
                getWindow().getDecorView().setBackgroundColor(-16777216);
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                p2g p2gVar2 = w2g.b;
            }
            bnk bnkVar = new bnk(this, 15);
            WeakHashMap weakHashMap = bsk.a;
            srk.c(kVar, bnkVar);
            Window window = getWindow();
            bka bkaVar = new bka(getWindow().getDecorView());
            int i2 = Build.VERSION.SDK_INT;
            pea aalVar = i2 >= 35 ? new aal(window, bkaVar) : i2 >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
            aalVar.D();
            aalVar.x(519);
            AdConfig j2 = a.j();
            if (j2 != null && (watermark$vungle_ads_release = j2.getWatermark$vungle_ads_release()) != null) {
                Window window2 = getWindow();
                if (window2 != null && (decorView = window2.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    a0 a0Var = new a0(this, watermark$vungle_ads_release);
                    frameLayout.addView(a0Var);
                    a0Var.bringToFront();
                }
            }
            this.a = rVar;
            if (Build.VERSION.SDK_INT >= 33) {
                a();
            }
            com.vungle.ads.internal.util.d dVar2 = com.vungle.ads.internal.util.d.f;
            com.vungle.ads.internal.util.a.a(this.f);
            try {
                registerReceiver(this.d, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            } catch (Throwable unused2) {
                p2g p2gVar3 = w2g.b;
            }
        } catch (InstantiationException e) {
            if (aVar != null) {
                aVar.a(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), b2.b());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.c;
            OnBackInvokedCallback g = obj instanceof OnBackInvokedCallback ? a70.g(obj) : null;
            if (g != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(g);
            }
            this.c = null;
        }
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            rVar.a((isChangingConfigurations() ? 1 : 0) | 2);
        }
        com.vungle.ads.internal.presenter.r rVar2 = this.a;
        if (rVar2 != null) {
            rVar2.a((k) null);
        }
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.b(this.f);
        try {
            p2g p2gVar = w2g.b;
            unregisterReceiver(this.d);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
        this.a = null;
        i = null;
        h = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Intent intent2 = getIntent();
        intent2.getClass();
        String b = a.b(intent2);
        String b2 = a.b(intent);
        Intent intent3 = getIntent();
        intent3.getClass();
        String a = a.a(intent3);
        String a2 = a.a(intent);
        if ((b == null || b2 == null || b.equals(b2)) && (a == null || a2 == null || a.equals(a2))) {
            return;
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", "Tried to play another placement " + b2 + " while playing " + b);
        VungleError logError$vungle_ads_release = new ConcurrentPlaybackUnsupported(bf3.k("Trying to show ", b2, " but ", b, " is already showing")).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a aVar = i;
        if (aVar != null) {
            aVar.a(logError$vungle_ads_release, b2);
        }
        StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("onConcurrentPlaybackError: ");
        a3.append(logError$vungle_ads_release.getLocalizedMessage());
        com.vungle.ads.internal.util.t.b("AdActivity", a3.toString());
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "stop()");
            rVar.a.b();
            rVar.d.b(false);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "start()");
            rVar.a.d();
            rVar.d.b(true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            Window window = getWindow();
            bka bkaVar = new bka(getWindow().getDecorView());
            int i2 = Build.VERSION.SDK_INT;
            pea aalVar = i2 >= 35 ? new aal(window, bkaVar) : i2 >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
            aalVar.D();
            aalVar.x(519);
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i2) {
        super.setRequestedOrientation(i2);
    }

    public static final com.vungle.ads.internal.signals.j a(joa joaVar) {
        return (com.vungle.ads.internal.signals.j) joaVar.getValue();
    }

    public final void a() {
        h90 h90Var = new h90(this, 8);
        this.c = h90Var;
        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, h90Var);
    }
}
