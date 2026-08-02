package u1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9920a {

    /* renamed from: a, reason: collision with root package name */
    private final int f99738a;

    private /* synthetic */ C9920a(int i11) {
        this.f99738a = i11;
    }

    public static final /* synthetic */ C9920a a(int i11) {
        return new C9920a(i11);
    }

    public final /* synthetic */ int b() {
        return this.f99738a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9920a) {
            return this.f99738a == ((C9920a) obj).f99738a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99738a);
    }

    @NotNull
    public final String toString() {
        int i11 = this.f99738a;
        return i11 == 1 ? "Touch" : i11 == 2 ? "Keyboard" : "Error";
    }
}
