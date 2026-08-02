package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Th extends hoi implements Function1 {
    public final /* synthetic */ Xh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Th(Xh xh, rq3 rq3Var) {
        super(1, rq3Var);
        this.a = xh;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new Th(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Th(this.a, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.a.k.getAndIncrement();
        this.a.getClass();
        this.a.a(false);
        return Unit.a;
    }
}
