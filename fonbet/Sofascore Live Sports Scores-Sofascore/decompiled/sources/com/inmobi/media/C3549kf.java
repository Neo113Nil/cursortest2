package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3549kf extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3705qf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3549kf(C3705qf c3705qf, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = c3705qf;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3549kf c3549kf = new C3549kf(this.c, rq3Var);
        c3549kf.b = obj;
        return c3549kf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3549kf c3549kf = new C3549kf(this.c, (rq3) obj2);
        c3549kf.b = (C3628ng) obj;
        return c3549kf.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            C3628ng c3628ng = (C3628ng) this.b;
            C3705qf c3705qf = this.c;
            this.a = 1;
            Object a = c3705qf.b.a(c3628ng, this);
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
