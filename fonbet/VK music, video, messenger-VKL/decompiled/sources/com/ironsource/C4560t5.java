package com.ironsource;

import com.ironsource.C4467o1;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4560t5 implements Bb {
    private final IronSourceError a;
    private final C4254c3 b;
    private final InterfaceC4538s1 c;

    public C4560t5(IronSourceError ironSourceError, C4254c3 c4254c3, InterfaceC4538s1 interfaceC4538s1) {
        this.a = ironSourceError;
        this.b = c4254c3;
        this.c = interfaceC4538s1;
    }

    public final IronSourceError a() {
        return this.a;
    }

    @Override // com.ironsource.Bb
    public void start() {
        InterfaceC4413l1.c.a aVar = InterfaceC4413l1.c.a;
        aVar.a().a(this.c);
        aVar.a(new C4467o1.j(this.a.getErrorCode()), new C4467o1.k(this.a.getErrorMessage()), new C4467o1.f(0L)).a(this.c);
        this.b.b(this.a);
    }
}
