package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.n7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3619n7 extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3800u7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3619n7(C3800u7 c3800u7, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = c3800u7;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3619n7 c3619n7 = new C3619n7(this.c, rq3Var);
        c3619n7.b = obj;
        return c3619n7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3619n7 c3619n7 = new C3619n7(this.c, (rq3) obj2);
        c3619n7.b = (C3628ng) obj;
        return c3619n7.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            C3628ng c3628ng = (C3628ng) this.b;
            C3800u7 c3800u7 = this.c;
            this.a = 1;
            Object a = c3800u7.b.a(c3628ng, this);
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
