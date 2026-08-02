package w5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: w5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10432d implements InterfaceC10436h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10435g f103578a;

    public C10432d(@NotNull C10435g c10435g) {
        this.f103578a = c10435g;
    }

    @Override // w5.InterfaceC10436h
    public final Object a(@NotNull kotlin.coroutines.d<? super C10435g> dVar) {
        return this.f103578a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10432d) {
            return Intrinsics.d(this.f103578a, ((C10432d) obj).f103578a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f103578a.hashCode();
    }
}
