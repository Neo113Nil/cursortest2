package com.inmobi.media;

import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.yn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3920yn extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b1d c;
    public final /* synthetic */ An d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3920yn(b1d b1dVar, rq3 rq3Var, An an) {
        super(2, rq3Var);
        this.c = b1dVar;
        this.d = an;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3920yn c3920yn = new C3920yn(this.c, rq3Var, this.d);
        c3920yn.b = obj;
        return c3920yn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3920yn) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.b;
            b1d b1dVar = this.c;
            C3894xn c3894xn = new C3894xn(ku3Var, this.d);
            this.a = 1;
            if (b1dVar.collect(c3894xn, this) == lu3Var) {
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
