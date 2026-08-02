package com.inmobi.media;

import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3743s2 extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f1d c;
    public final /* synthetic */ AbstractC3873x2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3743s2(f1d f1dVar, rq3 rq3Var, AbstractC3873x2 abstractC3873x2) {
        super(2, rq3Var);
        this.c = f1dVar;
        this.d = abstractC3873x2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3743s2 c3743s2 = new C3743s2(this.c, rq3Var, this.d);
        c3743s2.b = obj;
        return c3743s2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3743s2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return Unit.a;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ku3 ku3Var = (ku3) this.b;
        f1d f1dVar = this.c;
        C3717r2 c3717r2 = new C3717r2(ku3Var, this.d);
        this.a = 1;
        ((fdi) f1dVar).collect(c3717r2, this);
        return lu3Var;
    }
}
