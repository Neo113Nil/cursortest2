package com.inmobi.media;

import defpackage.a70;
import defpackage.h2d;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ui, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3811ui extends hoi implements Function2 {
    public h2d a;
    public GestureDetectorOnGestureListenerC3889xi b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3811ui(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, rq3 rq3Var) {
        super(2, rq3Var);
        this.e = gestureDetectorOnGestureListenerC3889xi;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3811ui c3811ui = new C3811ui(this.e, rq3Var);
        c3811ui.d = obj;
        return c3811ui;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3811ui c3811ui = new C3811ui(this.e, (rq3) obj2);
        c3811ui.d = (ku3) obj;
        return c3811ui.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        h2d h2dVar;
        lu3 lu3Var = lu3.a;
        int i = this.c;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var2 = (ku3) this.d;
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.e;
            h2d h2dVar2 = gestureDetectorOnGestureListenerC3889xi2.y;
            this.d = ku3Var2;
            this.a = h2dVar2;
            this.b = gestureDetectorOnGestureListenerC3889xi2;
            this.c = 1;
            if (h2dVar2.e(this) == lu3Var) {
                return lu3Var;
            }
            ku3Var = ku3Var2;
            gestureDetectorOnGestureListenerC3889xi = gestureDetectorOnGestureListenerC3889xi2;
            h2dVar = h2dVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gestureDetectorOnGestureListenerC3889xi = this.b;
            h2dVar = this.a;
            ku3Var = (ku3) this.d;
            y6a.M(obj);
        }
        try {
            if ("Loading".equals(gestureDetectorOnGestureListenerC3889xi.A)) {
                InterfaceC3880x9 interfaceC3880x9 = gestureDetectorOnGestureListenerC3889xi.i;
                if (interfaceC3880x9 != null) {
                    String str = GestureDetectorOnGestureListenerC3889xi.i1;
                    str.getClass();
                    ((C3906y9) interfaceC3880x9).a(str, "updateWebViewLoaded " + ku3Var);
                }
                gestureDetectorOnGestureListenerC3889xi.getListener().g(gestureDetectorOnGestureListenerC3889xi);
                gestureDetectorOnGestureListenerC3889xi.setAndUpdateViewState("Default");
                InterfaceC3880x9 interfaceC3880x92 = gestureDetectorOnGestureListenerC3889xi.i;
                if (interfaceC3880x92 != null) {
                    String str2 = GestureDetectorOnGestureListenerC3889xi.i1;
                    str2.getClass();
                    ((C3906y9) interfaceC3880x92).a(str2, "updateWebViewLoaded state changed to " + gestureDetectorOnGestureListenerC3889xi.getViewState());
                }
            }
            Unit unit = Unit.a;
            h2dVar.f(null);
            return unit;
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
    }
}
