package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3838vj extends hoi implements Function1 {
    public int a;

    public C3838vj(rq3 rq3Var) {
        super(1, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3838vj(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3838vj((rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            AbstractC3890xj.b.getClass();
            C3605mj c3605mj = C3605mj.a;
            boolean sessionEnabled = AbstractC3890xj.a().getSessionEnabled();
            c3605mj.getClass();
            C3605mj.e = sessionEnabled;
            if (!sessionEnabled) {
                C3605mj.d = null;
            }
            C3605mj.c();
            if (AbstractC3424fj.b() == null || AbstractC3890xj.a().getLocationEnabled()) {
                C3934zb c3934zb = C3934zb.a;
                this.a = 1;
                if (c3934zb.a(this) == lu3Var) {
                    return lu3Var;
                }
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
