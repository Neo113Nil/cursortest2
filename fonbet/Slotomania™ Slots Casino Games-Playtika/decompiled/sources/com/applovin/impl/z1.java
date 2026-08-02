package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.f6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class z1 extends y1 {
    private final a2 N;
    private i0 O;
    private long P;
    private final AtomicBoolean Q;

    public z1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.N = new a2(this.a, this.d, this.b);
        this.Q = new AtomicBoolean();
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float i1 = ((com.applovin.impl.sdk.ad.a) bVar).i1();
        if (i1 <= 0.0f) {
            i1 = this.a.s();
        }
        return (long) (q7.c(i1) * (this.a.z() / 100.0d));
    }

    private int D() {
        i0 i0Var;
        int i = 100;
        if (h()) {
            if (((Boolean) this.b.a(z4.l1)).booleanValue() && !this.a.hasShown()) {
                return 0;
            }
            if (!E() && (i0Var = this.O) != null) {
                i = (int) Math.min(100.0d, ((this.P - i0Var.b()) / this.P) * 100.0d);
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Ad engaged at " + i + "%");
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        y1.a(this.a, this.F, this.G, this.H, null, this.b, this.d, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.Q.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        this.r = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.k;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.y1
    protected void A() {
        this.N.a(this.l);
        this.r = SystemClock.elapsedRealtime();
        this.Q.set(true);
    }

    protected boolean E() {
        if (!(this.K && this.a.a1()) && h()) {
            return this.Q.get();
        }
        return true;
    }

    protected void J() {
        long R;
        long j = 0;
        if (this.a.Q() >= 0 || this.a.R() >= 0) {
            if (this.a.Q() >= 0) {
                R = this.a.Q();
            } else {
                if (this.a.W0()) {
                    int i1 = (int) ((com.applovin.impl.sdk.ad.a) this.a).i1();
                    if (i1 > 0) {
                        j = TimeUnit.SECONDS.toMillis(i1);
                    } else {
                        int s = (int) this.a.s();
                        if (s > 0) {
                            j = TimeUnit.SECONDS.toMillis(s);
                        }
                    }
                }
                R = (long) (j * (this.a.R() / 100.0d));
            }
            c(R);
        }
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        this.N.a(this.k, this.j, b(), viewGroup);
        if (((Boolean) this.b.a(z4.d6)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.j;
            if (kVar != null) {
                kVar.b();
            }
            SpecialsBridge.appLovinAdViewRenderAd(b(), this.a);
            a("javascript:al_onPoststitialShow();", this.a.y());
            if (h()) {
                long C = C();
                this.P = C;
                if (C > 0) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.P + "ms...");
                    }
                    this.O = i0.a(this.P, this.b, new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            z1.this.G();
                        }
                    });
                }
            }
            if (this.k != null) {
                if (this.a.s() >= 0) {
                    a(this.k, this.a.s(), new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            z1.this.H();
                        }
                    });
                } else {
                    this.k.setVisibility(0);
                }
            }
            J();
            this.b.s0().a(new u6(this.b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    z1.this.I();
                }
            }), f6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(q7.e(this.b));
        }
    }

    @Override // com.applovin.impl.y1
    public void b(long j) {
    }

    @Override // com.applovin.impl.y1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        int D = this.a.D();
        if (D <= 0 || !(this.d instanceof AppLovinFullscreenActivity)) {
            A();
            return;
        }
        if (this.a.U() >= D) {
            A();
            return;
        }
        e(true);
        this.a.F0();
        this.a.setHasShown(false);
        a("attempting_reshow_from_render_process_gone");
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                z1.this.F();
            }
        }, this.a.h());
    }

    @Override // com.applovin.impl.y1
    protected void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.y1
    public void v() {
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.y1
    protected void x() {
        super.x();
        this.Q.set(true);
    }

    class a implements y1.g {
        a() {
        }

        @Override // com.applovin.impl.y1.g
        public void a(y1 y1Var) {
            ((AppLovinFullscreenActivity) z1.this.d).setPresenter(y1Var);
            z1.this.r();
            y1Var.w();
        }

        @Override // com.applovin.impl.y1.g
        public void a(String str, Throwable th) {
            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", "recreateFullscreenAdPresenterAfterRenderProcessGone");
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            z1.this.b.g().a(f2.G, z1.this.a, hashMap);
            z1.this.e(false);
            z1.this.d.finish();
        }
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        if (!((Boolean) this.b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        i0 i0Var = this.O;
        if (i0Var != null) {
            i0Var.a();
            this.O = null;
        }
        super.a(str);
    }
}
