package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ja extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hoi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Ja(Function2 function2, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = (hoi) function2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hoi, kotlin.jvm.functions.Function2] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Ja ja = new Ja(this.c, rq3Var);
        ja.b = obj;
        return ja;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hoi, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Ja ja = new Ja(this.c, (rq3) obj2);
        ja.b = (ku3) obj;
        return ja.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hoi, kotlin.jvm.functions.Function2] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.b;
            ?? r1 = this.c;
            this.a = 1;
            if (r1.invoke(ku3Var, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
