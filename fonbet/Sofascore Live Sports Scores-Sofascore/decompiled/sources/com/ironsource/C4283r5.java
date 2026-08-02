package com.ironsource;

import com.ironsource.C4190m1;
import com.ironsource.InterfaceC4136j1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.r5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4283r5 implements InterfaceC4433zb {

    @NotNull
    private final IronSourceError a;

    @NotNull
    private final C3952a3 b;

    @NotNull
    private final InterfaceC4262q1 c;

    public C4283r5(@NotNull IronSourceError ironSourceError, @NotNull C3952a3 c3952a3, @NotNull InterfaceC4262q1 interfaceC4262q1) {
        ironSourceError.getClass();
        c3952a3.getClass();
        interfaceC4262q1.getClass();
        this.a = ironSourceError;
        this.b = c3952a3;
        this.c = interfaceC4262q1;
    }

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4433zb
    public void start() {
        InterfaceC4136j1.c.a aVar = InterfaceC4136j1.c.a;
        aVar.a().a(this.c);
        aVar.a(new C4190m1.j(this.a.getErrorCode()), new C4190m1.k(this.a.getErrorMessage()), new C4190m1.f(0L)).a(this.c);
        this.b.a(this.a);
    }
}
