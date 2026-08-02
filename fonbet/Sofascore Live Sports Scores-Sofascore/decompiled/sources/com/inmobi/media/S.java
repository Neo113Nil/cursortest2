package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.w2g;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S extends hoi implements Function1 {
    public final /* synthetic */ U a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u, rq3 rq3Var) {
        super(1, rq3Var);
        this.a = u;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new S(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new S(this.a, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Object a = P3.a(new Q(this.a));
        U u = this.a;
        Throwable a2 = w2g.a(a);
        if (a2 != null) {
            u.a(a2);
        }
        return Unit.a;
    }
}
