package com.inmobi.media;

import android.view.ViewGroup;
import defpackage.b98;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.ku3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.yda;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.d7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3361d7 implements b98 {
    public final ku3 a;
    public final ViewGroup b;
    public final long c;
    public final f1d d;
    public final InterfaceC3880x9 e;
    public yda f;

    public C3361d7(long j, ViewGroup viewGroup, InterfaceC3880x9 interfaceC3880x9, ku3 ku3Var, f1d f1dVar) {
        ku3Var.getClass();
        viewGroup.getClass();
        f1dVar.getClass();
        this.a = ku3Var;
        this.b = viewGroup;
        this.c = j;
        this.d = f1dVar;
        this.e = interfaceC3880x9;
    }

    public final Unit a(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.e;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("WindowLifecycleHandler", com.appsflyer.internal.i.j("FocusStateCollector - window focus changed: ", z));
        }
        InterfaceC3880x9 interfaceC3880x92 = this.e;
        if (z) {
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("WindowLifecycleHandler", "FocusStateCollector - window gained focus, stopping polling");
            }
            P6.a(this.f);
            this.f = null;
        } else {
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("WindowLifecycleHandler", "FocusStateCollector - window lost focus, starting polling");
            }
            this.f = xw3.L(this.a, null, null, new C3335c7(this, null), 3);
        }
        boolean z2 = this.b.getWindowVisibility() == 0;
        InterfaceC3880x9 interfaceC3880x93 = this.e;
        if (interfaceC3880x93 != null) {
            ((C3906y9) interfaceC3880x93).a("WindowLifecycleHandler", com.appsflyer.internal.i.j("FocusStateCollector - setting visibility state: ", z2));
        }
        f1d f1dVar = this.d;
        Boolean valueOf = Boolean.valueOf(z2);
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
