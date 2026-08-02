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
public final class R4 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R4(long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new R4(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new R4(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            K4 k4 = (K4) S4.b.getValue();
            int maxAdRecords = S4.c().getContextualData().getMaxAdRecords();
            long j = this.b;
            this.a = 1;
            if (k4.a(maxAdRecords, j, this) == lu3Var) {
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
