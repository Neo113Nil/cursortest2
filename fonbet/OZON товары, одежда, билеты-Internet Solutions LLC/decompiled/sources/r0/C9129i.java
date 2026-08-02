package r0;

import androidx.compose.foundation.gestures.J;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import r0.C9112M;
import xe.C10727i;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9129i implements InterfaceC9138r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC7976A<Float> f82613a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J.b f82614b;

    /* renamed from: c, reason: collision with root package name */
    private int f82615c;

    public C9129i() {
        throw null;
    }

    public C9129i(InterfaceC7976A interfaceC7976A) {
        J.b e11 = androidx.compose.foundation.gestures.J.e();
        this.f82613a = interfaceC7976A;
        this.f82614b = e11;
    }

    @Override // r0.InterfaceC9138r
    public final Object a(@NotNull C9112M.a aVar, float f7, @NotNull kotlin.coroutines.d dVar) {
        this.f82615c = 0;
        return C10727i.f(this.f82614b, new C9128h(f7, this, aVar, null), dVar);
    }

    @NotNull
    public final InterfaceC7976A<Float> c() {
        return this.f82613a;
    }

    public final int d() {
        return this.f82615c;
    }

    public final void e(@NotNull InterfaceC7976A<Float> interfaceC7976A) {
        this.f82613a = interfaceC7976A;
    }

    public final void f(int i11) {
        this.f82615c = i11;
    }
}
