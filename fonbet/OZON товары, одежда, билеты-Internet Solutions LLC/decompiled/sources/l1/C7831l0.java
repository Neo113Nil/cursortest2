package l1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: l1.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7831l0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f72269a;

    private /* synthetic */ C7831l0(int i11) {
        this.f72269a = i11;
    }

    public static final /* synthetic */ C7831l0 a(int i11) {
        return new C7831l0(i11);
    }

    public static boolean b(int i11, Object obj) {
        return (obj instanceof C7831l0) && i11 == ((C7831l0) obj).f72269a;
    }

    public final /* synthetic */ int c() {
        return this.f72269a;
    }

    public final boolean equals(Object obj) {
        return b(this.f72269a, obj);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72269a);
    }

    @NotNull
    public final String toString() {
        int i11 = this.f72269a;
        return i11 == 0 ? "Argb8888" : i11 == 1 ? "Alpha8" : i11 == 2 ? "Rgb565" : i11 == 3 ? "F16" : i11 == 4 ? "Gpu" : "Unknown";
    }
}
