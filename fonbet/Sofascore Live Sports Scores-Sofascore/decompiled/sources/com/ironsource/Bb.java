package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Bb implements P5<Ab> {

    @NotNull
    private final String a;

    @NotNull
    private final Dd b;

    @NotNull
    private final InterfaceC4047e1 c;
    private final boolean d;

    public Bb(@NotNull String str, @NotNull Dd dd, @NotNull InterfaceC4047e1 interfaceC4047e1, boolean z) {
        str.getClass();
        dd.getClass();
        interfaceC4047e1.getClass();
        this.a = str;
        this.b = dd;
        this.c = interfaceC4047e1;
        this.d = z;
    }

    @Override // com.ironsource.P5
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Ab a() throws C4257pe, Exception {
        InterfaceC4198m9 a = this.c.a(this.b);
        new U(this.a, a, this.d).a();
        if (a != null) {
            return new Ab(a.f(), a.e(), a.b(), a.d(), false, 16, null);
        }
        return null;
    }
}
