package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M3 extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ hoi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M3(Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = (hoi) function1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new M3(this.b, rq3Var);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new M3(this.b, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ?? r4 = this.b;
            this.a = 1;
            if (r4.invoke(this) == lu3Var) {
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
