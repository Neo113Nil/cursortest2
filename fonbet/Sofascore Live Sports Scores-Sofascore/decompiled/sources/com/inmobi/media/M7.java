package com.inmobi.media;

import defpackage.g51;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.vg6;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M7 extends hoi implements Function2 {
    public final /* synthetic */ V7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(rq3 rq3Var, V7 v7) {
        super(2, rq3Var);
        this.a = v7;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new M7(rq3Var, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new M7((rq3) obj2, this.a).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        if (this.a.b() == Jg.STATE_PLAYBACK_COMPLETED) {
            ((g51) this.a.p).M(5, 0L);
            V7 v7 = this.a;
            v7.l.set(Jg.STATE_PREPARED);
        }
        C3284a8 c3284a8 = this.a.y;
        if (c3284a8.e) {
            c3284a8.a();
            c3284a8.d.a();
        } else {
            X4.a(c3284a8.a, new Z7(c3284a8, null));
        }
        C6 c6 = this.a.x;
        if (!c6.d.getAndSet(true)) {
            ku3 ku3Var = c6.b;
            long j = c6.k;
            A6 a6 = new A6(c6, null);
            ku3Var.getClass();
            hs4 hs4Var = z45.a;
            r69 r69Var = rob.a;
            c6.e = xw3.L(ku3Var, r69Var.f, null, new K3(j, null, a6), 2);
            ku3 ku3Var2 = c6.b;
            long j2 = c6.l;
            B6 b6 = new B6(c6, null);
            ku3Var2.getClass();
            c6.f = xw3.L(ku3Var2, r69Var.f, null, new K3(j2, null, b6), 2);
        }
        ((g51) this.a.p).setPlayWhenReady(true);
        V7 v72 = this.a;
        v72.l.set(Jg.STATE_PLAYING);
        V7 v73 = this.a;
        v73.a(new Gn(((vg6) v73.p).getCurrentPosition()));
        return Unit.a;
    }
}
