package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ri, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3733ri extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3733ri(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = gestureDetectorOnGestureListenerC3889xi;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3733ri(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3733ri(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        InterfaceC3880x9 interfaceC3880x9;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            this.a = 1;
            if (n4o.y(1000L, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        if (!this.b.isAttachedToWindow() && (interfaceC3880x9 = this.b.i) != null) {
            ((C3906y9) interfaceC3880x9).a();
        }
        return Unit.a;
    }
}
