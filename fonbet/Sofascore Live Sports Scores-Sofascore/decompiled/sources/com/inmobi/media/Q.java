package com.inmobi.media;

import defpackage.ot8;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class Q extends ot8 implements Function0 {
    public Q(Object obj) {
        super(0, 0, U.class, obj, "calculateMetrics", "calculateMetrics()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        U u = (U) this.receiver;
        u.getClass();
        u.n = AbstractC3424fj.d.get();
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        O o = u.m;
        executorC3520jc.getClass();
        o.getClass();
        executorC3520jc.a.postAtFrontOfQueue(o);
        return Unit.a;
    }
}
