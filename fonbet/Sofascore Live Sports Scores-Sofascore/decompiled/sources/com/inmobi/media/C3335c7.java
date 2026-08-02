package com.inmobi.media;

import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3335c7 extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3361d7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3335c7(C3361d7 c3361d7, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = c3361d7;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3335c7 c3335c7 = new C3335c7(this.c, rq3Var);
        c3335c7.b = obj;
        return c3335c7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3335c7 c3335c7 = new C3335c7(this.c, (rq3) obj2);
        c3335c7.b = (ku3) obj;
        return c3335c7.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ku3Var = (ku3) this.b;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku3Var = (ku3) this.b;
            y6a.M(obj);
        }
        while (s9a.w(ku3Var)) {
            C3361d7 c3361d7 = this.c;
            f1d f1dVar = c3361d7.d;
            Boolean valueOf = Boolean.valueOf(c3361d7.b.getWindowVisibility() == 0);
            fdi fdiVar = (fdi) f1dVar;
            fdiVar.getClass();
            fdiVar.m(null, valueOf);
            long j = this.c.c;
            this.b = ku3Var;
            this.a = 1;
            if (n4o.y(j, this) == lu3Var) {
                return lu3Var;
            }
        }
        return Unit.a;
    }
}
