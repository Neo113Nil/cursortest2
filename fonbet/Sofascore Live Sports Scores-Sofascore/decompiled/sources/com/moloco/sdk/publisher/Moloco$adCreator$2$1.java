package com.moloco.sdk.publisher;

import com.moloco.sdk.internal.h;
import com.moloco.sdk.internal.publisher.g1;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/moloco/sdk/internal/h;", "<anonymous>", "()Lcom/moloco/sdk/internal/h;"}, k = 3, mv = {2, 0, 0})
@il4(c = "com.moloco.sdk.publisher.Moloco$adCreator$2$1", f = "Moloco.kt", l = {563}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Moloco$adCreator$2$1 extends hoi implements Function1<rq3<? super h>, Object> {
    int label;

    public Moloco$adCreator$2$1(rq3<? super Moloco$adCreator$2$1> rq3Var) {
        super(1, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(rq3<?> rq3Var) {
        return new Moloco$adCreator$2$1(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(rq3<? super h> rq3Var) {
        return ((Moloco$adCreator$2$1) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        g1 initializationHandler;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        initializationHandler = Moloco.INSTANCE.getInitializationHandler();
        this.label = 1;
        Object a = initializationHandler.a(this);
        return a == lu3Var ? lu3Var : a;
    }
}
