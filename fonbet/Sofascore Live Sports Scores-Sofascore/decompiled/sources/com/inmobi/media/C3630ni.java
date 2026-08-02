package com.inmobi.media;

import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ni, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3630ni extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3630ni(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str, long j, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = gestureDetectorOnGestureListenerC3889xi;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3630ni c3630ni = new C3630ni(this.b, this.c, this.d, this.e, rq3Var);
        c3630ni.a = obj;
        return c3630ni;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3630ni) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ku3 ku3Var = (ku3) this.a;
        if (this.b.N.get() || !s9a.w(ku3Var)) {
            InterfaceC3880x9 interfaceC3880x9 = this.b.i;
            if (interfaceC3880x9 != null) {
                String str = GestureDetectorOnGestureListenerC3889xi.i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).a(str, "Skipping loadHtmlUrl, RenderView destroyed");
            }
            return Unit.a;
        }
        String str2 = this.c;
        if (str2 == null || str2.length() == 0) {
            InterfaceC3880x9 interfaceC3880x92 = this.b.i;
            if (interfaceC3880x92 != null) {
                String str3 = GestureDetectorOnGestureListenerC3889xi.i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).a(str3, "Prefetch empty/failed, signaling ad load failure");
            }
            Hi renderViewTelemetry = this.b.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(this.d, new Short((short) this.e));
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.b;
            int i = this.e;
            gestureDetectorOnGestureListenerC3889xi.getClass();
            gestureDetectorOnGestureListenerC3889xi.d(GestureDetectorOnGestureListenerC3889xi.d(i));
        } else {
            InterfaceC3880x9 interfaceC3880x93 = this.b.i;
            if (interfaceC3880x93 != null) {
                String str4 = GestureDetectorOnGestureListenerC3889xi.i1;
                str4.getClass();
                ((C3906y9) interfaceC3880x93).a(str4, "Prefetch succeeded, loading HTML content in WebView");
            }
            Hi renderViewTelemetry2 = this.b.getRenderViewTelemetry();
            if (renderViewTelemetry2 != null) {
                renderViewTelemetry2.a(this.d, (Short) null);
            }
            this.b.i(this.c);
        }
        return Unit.a;
    }
}
