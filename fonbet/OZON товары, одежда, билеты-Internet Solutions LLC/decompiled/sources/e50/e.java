package e50;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f62015a;

    private /* synthetic */ e(int i11) {
        this.f62015a = i11;
    }

    public static final /* synthetic */ e a(int i11) {
        return new e(i11);
    }

    public final /* synthetic */ int b() {
        return this.f62015a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f62015a == ((e) obj).f62015a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62015a);
    }

    public final String toString() {
        return K00.b.e(this.f62015a, ")", new StringBuilder("PdfPageState(countItems="));
    }
}
