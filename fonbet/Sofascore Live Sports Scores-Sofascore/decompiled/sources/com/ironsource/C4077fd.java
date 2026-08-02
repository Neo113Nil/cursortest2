package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.fd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4077fd extends AbstractC4156k3 {

    @NotNull
    private String e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4077fd(@NotNull AbstractC4156k3 abstractC4156k3) {
        super(abstractC4156k3.b(), abstractC4156k3.c(), abstractC4156k3.d(), abstractC4156k3.a());
        abstractC4156k3.getClass();
        this.e = "";
    }

    public final int e() {
        return this.f;
    }

    @NotNull
    public final String f() {
        return this.e;
    }

    @Override // com.ironsource.AbstractC4156k3
    @NotNull
    public String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4077fd(int i, @NotNull String str, boolean z, @NotNull String str2, int i2, @Nullable C4095gd c4095gd) {
        super(i, str, z, c4095gd);
        str.getClass();
        str2.getClass();
        this.f = i2;
        this.e = str2;
    }
}
