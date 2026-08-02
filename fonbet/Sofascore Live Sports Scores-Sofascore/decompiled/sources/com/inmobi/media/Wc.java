package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import defpackage.lu3;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Wc extends Ej implements Ih, InterfaceC3323bl, InterfaceC3404f {
    public volatile Bj c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Wc(Rc rc) {
        super(r0.a.e);
        rc.getClass();
        C3870x c3870x = rc.a;
        c3870x.getClass();
        this.c = new C3470hd(rc, this);
    }

    @Override // com.inmobi.media.InterfaceC3404f
    public final Object a(rq3 rq3Var) {
        Bj bj = this.c;
        InterfaceC3404f interfaceC3404f = bj instanceof InterfaceC3404f ? (InterfaceC3404f) bj : null;
        if (interfaceC3404f == null) {
            return Unit.a;
        }
        Object a = interfaceC3404f.a(rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    @Override // com.inmobi.media.InterfaceC3323bl
    public final void d() {
        Bj bj = this.c;
        InterfaceC3323bl interfaceC3323bl = bj instanceof InterfaceC3323bl ? (InterfaceC3323bl) bj : null;
        if (interfaceC3323bl != null) {
            interfaceC3323bl.d();
        }
    }

    @Override // com.inmobi.media.Ej
    public final Bj a() {
        return this.c;
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
