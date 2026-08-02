package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class L1 extends hoi implements Function2 {
    public final /* synthetic */ M1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(M1 m1, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = m1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new L1(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new L1(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Unit] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            try {
                M1 m1 = this.a;
                m1.c = m1.a.invoke();
            } catch (Exception e) {
                e.getMessage();
            }
            this.a.d.set(false);
            this = Unit.a;
            return this;
        } catch (Throwable th) {
            this.a.d.set(false);
            throw th;
        }
    }
}
