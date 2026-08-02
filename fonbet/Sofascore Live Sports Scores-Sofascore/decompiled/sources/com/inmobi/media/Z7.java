package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.vg6;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Z7 extends hoi implements Function2 {
    public final /* synthetic */ C3284a8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z7(C3284a8 c3284a8, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = c3284a8;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Z7(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z7(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        boolean e = this.a.d.e();
        C3284a8 c3284a8 = this.a;
        if (e) {
            ((vg6) c3284a8.b).setVolume(1.0f);
            X4.a(c3284a8.c, c3284a8.a, new W1(1.0f, false));
            c3284a8.e = false;
        } else {
            c3284a8.a();
        }
        return Unit.a;
    }
}
