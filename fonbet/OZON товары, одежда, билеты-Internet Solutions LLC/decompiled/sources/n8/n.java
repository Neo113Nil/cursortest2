package n8;

import C.o0;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import x8.InterfaceC10676a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final w<?> f76603a;

    /* renamed from: b, reason: collision with root package name */
    private final int f76604b;

    /* renamed from: c, reason: collision with root package name */
    private final int f76605c;

    private n(int i11, int i12, Class cls) {
        this((w<?>) w.a(cls), i11, i12);
    }

    @Deprecated
    public static n f() {
        return new n(0, 0, InterfaceC10676a.class);
    }

    public static n g(Class<?> cls) {
        return new n(0, 1, cls);
    }

    public static n h(w<?> wVar) {
        return new n(wVar, 0, 1);
    }

    public static n i(Class<?> cls) {
        return new n(1, 0, cls);
    }

    public static n j(w<?> wVar) {
        return new n(wVar, 1, 0);
    }

    public static n k(Class<?> cls) {
        return new n(1, 1, cls);
    }

    public static n l(Class<?> cls) {
        return new n(2, 0, cls);
    }

    public final w<?> a() {
        return this.f76603a;
    }

    public final boolean b() {
        return this.f76605c == 2;
    }

    public final boolean c() {
        return this.f76605c == 0;
    }

    public final boolean d() {
        return this.f76604b == 1;
    }

    public final boolean e() {
        return this.f76604b == 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f76603a.equals(nVar.f76603a) && this.f76604b == nVar.f76604b && this.f76605c == nVar.f76605c;
    }

    public final int hashCode() {
        return ((((this.f76603a.hashCode() ^ 1000003) * 1000003) ^ this.f76604b) * 1000003) ^ this.f76605c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f76603a);
        sb2.append(", type=");
        int i11 = this.f76604b;
        sb2.append(i11 == 1 ? "required" : i11 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i12 = this.f76605c;
        if (i12 == 0) {
            str = DevicePublicKeyStringDef.DIRECT;
        } else if (i12 == 1) {
            str = "provider";
        } else {
            if (i12 != 2) {
                throw new AssertionError(Ej.b.a(i12, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return o0.c(sb2, str, "}");
    }

    private n(w<?> wVar, int i11, int i12) {
        this.f76603a = wVar;
        this.f76604b = i11;
        this.f76605c = i12;
    }
}
