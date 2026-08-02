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
public final class Q4 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3385e6 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(C3385e6 c3385e6, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3385e6;
        this.c = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Q4(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Q4(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            S4 s4 = S4.a;
            C3385e6 c3385e6 = this.b;
            int maxAdRecords = S4.c().getContextualData().getMaxAdRecords();
            long j = this.c;
            this.a = 1;
            K4 k4 = (K4) S4.b.getValue();
            C3724r9 c3724r9 = k4.a;
            J4 j4 = new J4(k4, c3385e6, j, maxAdRecords, null);
            c3724r9.getClass();
            Object a = c3724r9.a(new C3699q9(c3724r9, j4, null), this);
            if (a != lu3Var) {
                a = Unit.a;
            }
            if (a != lu3Var) {
                a = Unit.a;
            }
            if (a == lu3Var) {
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
