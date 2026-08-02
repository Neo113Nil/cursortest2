package com.ironsource;

import android.app.Activity;
import com.ironsource.C4467o1;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import xsna.bv9;
import xsna.mhz0;
import xsna.tw3;
import xsna.xqc;
import xsna.zcl;
import xsna.zz9;

/* renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4618w9 implements InterfaceC4275d6 {
    private K9 a;
    private InterfaceC4251c0 b;
    private Z1 c;
    private InterfaceC4538s1 d;
    private InterfaceC4424lc e;
    private InterfaceC4357hg f;
    private M8 g;
    private M8.a h;
    private final Map<String, C4618w9> i;
    private InterstitialAdInfo j;
    private InterfaceC4636x9 k;

    public C4618w9(K9 k9, InterfaceC4251c0 interfaceC4251c0, Z1 z1, InterfaceC4538s1 interfaceC4538s1, InterfaceC4424lc interfaceC4424lc, InterfaceC4357hg interfaceC4357hg, M8 m8, M8.a aVar, Map<String, C4618w9> map) {
        this.a = k9;
        this.b = interfaceC4251c0;
        this.c = z1;
        this.d = interfaceC4538s1;
        this.e = interfaceC4424lc;
        this.f = interfaceC4357hg;
        this.g = m8;
        this.h = aVar;
        this.i = map;
        this.j = new InterstitialAdInfo(k9.f(), this.a.e());
        C4239b6 c4239b6 = new C4239b6();
        this.a.a(c4239b6);
        c4239b6.a(this);
    }

    public final void a(InterstitialAdInfo interstitialAdInfo) {
        this.j = interstitialAdInfo;
    }

    public final InterstitialAdInfo b() {
        return this.j;
    }

    public final InterfaceC4636x9 c() {
        return this.k;
    }

    public final boolean d() {
        boolean a = this.b.a(this.a);
        InterfaceC4413l1.a.a.a(a).a(this.d);
        return a;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4413l1.a.a.f(new InterfaceC4485p1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidClick() {
        InterfaceC4413l1.a.a.a().a(this.d);
        this.f.a(new mhz0(this, 0));
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4413l1.a.a.a(new InterfaceC4485p1[0]).a(this.d);
        this.f.a(new bv9(this, 20));
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidShow() {
        M8 m8 = this.g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC4413l1.a.a.b(new C4467o1.w(m8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new xqc(this, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4618w9 c4618w9) {
        InterfaceC4636x9 interfaceC4636x9 = c4618w9.k;
        if (interfaceC4636x9 != null) {
            interfaceC4636x9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4618w9 c4618w9) {
        InterfaceC4636x9 interfaceC4636x9 = c4618w9.k;
        if (interfaceC4636x9 != null) {
            interfaceC4636x9.onAdInstanceDidDismiss();
        }
    }

    public final void a(InterfaceC4636x9 interfaceC4636x9) {
        this.k = interfaceC4636x9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4618w9 c4618w9) {
        InterfaceC4636x9 interfaceC4636x9 = c4618w9.k;
        if (interfaceC4636x9 != null) {
            interfaceC4636x9.onAdInstanceDidShow();
        }
    }

    public final void a(Activity activity) {
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.a)) {
            a(C4578u5.a.t());
        } else {
            InterfaceC4413l1.a.a.d(new InterfaceC4485p1[0]).a(this.d);
            this.b.a(activity, this.a);
        }
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void a(String str) {
        a(C4578u5.a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4413l1.a.a.a(new C4467o1.j(ironSourceError.getErrorCode()), new C4467o1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new zz9(7, this, ironSourceError));
    }

    public /* synthetic */ C4618w9(K9 k9, InterfaceC4251c0 interfaceC4251c0, Z1 z1, InterfaceC4538s1 interfaceC4538s1, InterfaceC4424lc interfaceC4424lc, InterfaceC4357hg interfaceC4357hg, M8 m8, M8.a aVar, Map map, int i, zcl zclVar) {
        this(k9, interfaceC4251c0, z1, interfaceC4538s1, (i & 16) != 0 ? new C4442mc() : interfaceC4424lc, (i & 32) != 0 ? R7.a : interfaceC4357hg, (i & 64) != 0 ? Kb.u.d().s() : m8, (i & 128) != 0 ? Kb.u.a().i() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4618w9 c4618w9, IronSourceError ironSourceError) {
        InterfaceC4636x9 interfaceC4636x9 = c4618w9.k;
        if (interfaceC4636x9 != null) {
            interfaceC4636x9.onAdInstanceDidFailedToShow(ironSourceError);
        }
    }

    public final void a() {
        InterfaceC4357hg.a(this.f, new tw3(this, 29), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4618w9 c4618w9) {
        InterfaceC4413l1.d.a.b().a(c4618w9.d);
        c4618w9.e.a(c4618w9.a);
    }

    @Override // com.ironsource.InterfaceC4275d6
    public void onAdInstanceDidReward(String str, int i) {
    }
}
