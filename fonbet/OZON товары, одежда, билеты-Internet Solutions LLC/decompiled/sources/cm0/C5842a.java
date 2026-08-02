package cm0;

import B3.D;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: cm0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5842a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f57211a;

    public final boolean equals(Object obj) {
        if (obj instanceof C5842a) {
            return Intrinsics.d(this.f57211a, ((C5842a) obj).f57211a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57211a.hashCode();
    }

    public final String toString() {
        return D.c(new StringBuilder("PushToken(value="), this.f57211a, ')');
    }
}
