package com.inmobi.media;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import defpackage.a70;
import defpackage.hoi;
import defpackage.jod;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.pof;
import defpackage.qzf;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.z9a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class E4 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ jod b;
    public final /* synthetic */ qzf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4(jod jodVar, qzf qzfVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = jodVar;
        this.c = qzfVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new E4(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E4(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        pof b = this.b.b(this.c);
        this.a = 1;
        lj2 lj2Var = new lj2(1, z9a.b(this));
        lj2Var.t();
        lj2Var.v(new Bl(b));
        FirebasePerfOkHttpClient.enqueue(b, new Cl(lj2Var));
        Object q = lj2Var.q();
        return q == lu3Var ? lu3Var : q;
    }
}
