package com.moloco.sdk.internal.services;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ r s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = rVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        r rVar = this.s;
        switch (i) {
            case 0:
                return new q(rVar, rq3Var, 0);
            default:
                return new q(rVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((q) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        r rVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (!rVar.d) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Observing application lifecycle events", false, 4, null);
                    rVar.a.a(rVar.b);
                    rVar.d = true;
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.debug$default(molocoLogger, "AnalyticsApplicationLifecycleTrackerImpl", "Tracking next bg / fg of the application", false, 4, null);
                boolean z = rVar.d;
                k kVar = rVar.b;
                if (!z) {
                    MolocoLogger.debug$default(molocoLogger, "AnalyticsApplicationLifecycleTrackerImpl", "Observing application lifecycle events", false, 4, null);
                    rVar.a.a(kVar);
                    rVar.d = true;
                }
                kVar.d = true;
                break;
        }
        return Unit.a;
    }
}
