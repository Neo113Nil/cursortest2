package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ca extends hoi implements Function2 {
    public final /* synthetic */ Ha a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ca(Ha ha, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = ha;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ca(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ca(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        InterfaceC3880x9 interfaceC3880x9 = this.a.c;
        if (interfaceC3880x9 != null) {
            String str = Ia.a;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "destroyVideoPlayer is called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a.a;
        gestureDetectorOnGestureListenerC3889xi.b1 = null;
        D8 d8 = gestureDetectorOnGestureListenerC3889xi.Z0;
        if (d8 != null) {
            d8.a();
        }
        return Unit.a;
    }
}
