package ej;

import fj.C6573b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ej.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6377f extends Od0.d<InterfaceC6376e> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6375d f62364a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<? extends InterfaceC6376e> f62365b;

    public C6377f(@NotNull C6375d params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f62364a = params;
        this.f62365b = InterfaceC6376e.class;
    }

    @Override // Od0.d
    public final InterfaceC6376e create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new C6573b(this.f62364a, store);
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends InterfaceC6376e> getKey() {
        return this.f62365b;
    }
}
