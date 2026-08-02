package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ij extends hoi implements Function2 {
    public C3322bk a;
    public int b;
    public final /* synthetic */ Mj c;
    public final /* synthetic */ Qi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ij(Mj mj, Qi qi, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = mj;
        this.d = qi;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ij(this.c, this.d, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ij(this.c, this.d, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C3322bk c3322bk = this.a;
            y6a.M(obj);
            return c3322bk;
        }
        y6a.M(obj);
        C3322bk c3322bk2 = new C3322bk(this.c.a);
        Mj mj = this.c;
        String str = this.d.a;
        this.a = c3322bk2;
        this.b = 1;
        return Mj.a(mj, str, c3322bk2, this) == lu3Var ? lu3Var : c3322bk2;
    }
}
