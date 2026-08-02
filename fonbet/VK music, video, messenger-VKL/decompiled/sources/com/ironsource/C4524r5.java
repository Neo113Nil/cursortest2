package com.ironsource;

import com.ironsource.C4467o1;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.r5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4524r5 {
    private final InterfaceC4538s1 a;

    public C4524r5(InterfaceC4538s1 interfaceC4538s1, String str, Ed ed) {
        this.a = interfaceC4538s1;
        interfaceC4538s1.a(new C4467o1.s(ed.value()), new C4467o1.b(str));
    }

    public final void a() {
        InterfaceC4413l1.c.a.a().a(this.a);
    }

    public final void a(IronSourceError ironSourceError) {
        InterfaceC4413l1.c.a.a(new C4467o1.j(ironSourceError.getErrorCode()), new C4467o1.k(ironSourceError.getErrorMessage()), new C4467o1.f(0L)).a(this.a);
    }
}
