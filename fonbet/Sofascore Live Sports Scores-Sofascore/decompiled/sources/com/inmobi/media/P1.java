package com.inmobi.media;

import defpackage.b98;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class P1 implements b98 {
    public final /* synthetic */ Q1 a;

    public P1(Q1 q1) {
        this.a = q1;
    }

    public final Unit a(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.a.e;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("WindowLifecycleHandler", com.appsflyer.internal.i.j("startObservingVisibility - Window visibility changed: ", z));
        }
        f1d f1dVar = this.a.c;
        Boolean valueOf = Boolean.valueOf(z);
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, valueOf);
        return Unit.a;
    }

    @Override // defpackage.b98
    public final /* bridge */ /* synthetic */ Object emit(Object obj, rq3 rq3Var) {
        return a(((Boolean) obj).booleanValue());
    }
}
