package com.ironsource;

import com.ironsource.C4190m1;
import com.ironsource.InterfaceC4136j1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4248p5 {

    @NotNull
    private final InterfaceC4262q1 a;

    public C4248p5(@NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull String str, @NotNull Dd dd) {
        interfaceC4262q1.getClass();
        str.getClass();
        dd.getClass();
        this.a = interfaceC4262q1;
        interfaceC4262q1.a(new C4190m1.s(dd.value()), new C4190m1.b(str));
    }

    public final void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        InterfaceC4136j1.c.a.a(new C4190m1.j(ironSourceError.getErrorCode()), new C4190m1.k(ironSourceError.getErrorMessage()), new C4190m1.f(0L)).a(this.a);
    }

    public final void a() {
        InterfaceC4136j1.c.a.a().a(this.a);
    }
}
