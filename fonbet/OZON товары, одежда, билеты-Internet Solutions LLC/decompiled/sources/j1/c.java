package j1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f68720a;

    private /* synthetic */ c(int i11) {
        this.f68720a = i11;
    }

    public static final /* synthetic */ c a(int i11) {
        return new c(i11);
    }

    public static final boolean b(int i11, int i12) {
        return i11 == i12;
    }

    @NotNull
    public static String c(int i11) {
        return i11 == 1 ? "Next" : i11 == 2 ? "Previous" : i11 == 3 ? "Left" : i11 == 4 ? "Right" : i11 == 5 ? "Up" : i11 == 6 ? "Down" : i11 == 7 ? "Enter" : i11 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final /* synthetic */ int d() {
        return this.f68720a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f68720a == ((c) obj).f68720a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68720a);
    }

    @NotNull
    public final String toString() {
        return c(this.f68720a);
    }
}
