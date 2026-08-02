package com.inmobi.media;

import defpackage.ku3;
import defpackage.ndk;
import defpackage.xw3;
import defpackage.yda;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3649ob extends AbstractC3768t1 {
    public final C3665p1 b;
    public final Nc c;
    public yda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3649ob(C3665p1 c3665p1, Nc nc) {
        super(c3665p1);
        c3665p1.getClass();
        nc.getClass();
        this.b = c3665p1;
        this.c = nc;
    }

    @Override // com.inmobi.media.AbstractC3768t1
    public final void a() {
        P6.a(this.d);
        this.d = null;
    }

    @Override // com.inmobi.media.AbstractC3768t1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3768t1
    public final void d() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3768t1
    public final void e() {
        P6.a(this.d);
        this.d = null;
    }

    public final void g() {
        long j = this.a.c;
        ku3 ku3Var = this.b.e;
        ndk ndkVar = new ndk(this, 21);
        ku3Var.getClass();
        this.d = xw3.L(ku3Var, null, null, new Rk(j, ndkVar, null), 3);
    }

    public static final Unit a(C3649ob c3649ob) {
        c3649ob.c.e();
        return Unit.a;
    }
}
