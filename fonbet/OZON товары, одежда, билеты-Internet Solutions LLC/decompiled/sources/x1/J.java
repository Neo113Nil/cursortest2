package x1;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final int f104831a;

    private /* synthetic */ J(int i11) {
        this.f104831a = i11;
    }

    public static final /* synthetic */ J a(int i11) {
        return new J(i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            return this.f104831a == ((J) obj).f104831a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104831a);
    }

    public final String toString() {
        return Ek.a.d(new StringBuilder("PointerKeyboardModifiers(packedValue="), this.f104831a, ')');
    }
}
