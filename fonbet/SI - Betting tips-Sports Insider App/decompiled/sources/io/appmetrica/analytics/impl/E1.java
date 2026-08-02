package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class E1 implements InterfaceC0108dk {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final D1 f12178b = new D1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f12179c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0467s0 f12180a;

    public E1(@NotNull InterfaceC0467s0 interfaceC0467s0) {
        this.f12180a = interfaceC0467s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0108dk
    public final void reportData(int i5, @NotNull Bundle bundle) {
        ((B1) this.f12180a).a(bundle);
    }
}
