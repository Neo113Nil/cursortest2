package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Nc extends AbstractC3456h implements Ih, InterfaceC3323bl, Qo, InterfaceC3737rm {
    public volatile Bj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nc(C3665p1 c3665p1, Uc uc) {
        super(c3665p1.e);
        c3665p1.getClass();
        uc.getClass();
        this.c = new C3444gd(c3665p1, uc, this);
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        String a;
        Bj bj = this.c;
        Sc sc = bj instanceof Pd ? ((Pd) bj).j : bj instanceof Cd ? ((Cd) bj).h : bj instanceof Ge ? ((Ge) bj).f : bj instanceof Le ? ((Le) bj).a : null;
        return (sc == null || (a = sc.a(i, d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : a;
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void b() {
        Bj bj = this.c;
        InterfaceC3737rm interfaceC3737rm = bj instanceof InterfaceC3737rm ? (InterfaceC3737rm) bj : null;
        if (interfaceC3737rm != null) {
            interfaceC3737rm.b();
        }
    }

    @Override // com.inmobi.media.InterfaceC3323bl
    public final void d() {
        Bj bj = this.c;
        InterfaceC3323bl interfaceC3323bl = bj instanceof InterfaceC3323bl ? (InterfaceC3323bl) bj : null;
        if (interfaceC3323bl != null) {
            interfaceC3323bl.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void f() {
        Bj bj = this.c;
        InterfaceC3737rm interfaceC3737rm = bj instanceof InterfaceC3737rm ? (InterfaceC3737rm) bj : null;
        if (interfaceC3737rm != null) {
            interfaceC3737rm.f();
        }
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void h() {
        Bj bj = this.c;
        InterfaceC3737rm interfaceC3737rm = bj instanceof InterfaceC3737rm ? (InterfaceC3737rm) bj : null;
        if (interfaceC3737rm != null) {
            interfaceC3737rm.h();
        }
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void i() {
        Bj bj = this.c;
        InterfaceC3737rm interfaceC3737rm = bj instanceof InterfaceC3737rm ? (InterfaceC3737rm) bj : null;
        if (interfaceC3737rm != null) {
            interfaceC3737rm.i();
        }
    }

    @Override // com.inmobi.media.Ej
    public final Bj a() {
        return this.c;
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        Sc sc;
        String a;
        Bj bj = this.c;
        if (bj instanceof Pd) {
            sc = ((Pd) bj).j;
        } else if (bj instanceof Cd) {
            sc = ((Cd) bj).h;
        } else if (bj instanceof Ge) {
            sc = ((Ge) bj).f;
        } else {
            sc = bj instanceof Le ? ((Le) bj).a : null;
        }
        return (sc == null || (a = sc.a(d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : a;
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void a(boolean z) {
        Bj bj = this.c;
        InterfaceC3737rm interfaceC3737rm = bj instanceof InterfaceC3737rm ? (InterfaceC3737rm) bj : null;
        if (interfaceC3737rm != null) {
            interfaceC3737rm.a(z);
        }
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        Bj bj = this.c;
        Ih ih = bj instanceof Ih ? (Ih) bj : null;
        if (ih != null) {
            ih.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.Ej
    public final void a(Bj bj) {
        bj.getClass();
        this.c = bj;
    }
}
