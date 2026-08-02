package o8;

import androidx.appcompat.widget.c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f21122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21124c;

    public h(int i5, int i10, Class cls) {
        this(p.a(cls), i5, i10);
    }

    public static h a(Class cls) {
        return new h(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f21122a.equals(hVar.f21122a) && this.f21123b == hVar.f21123b && this.f21124c == hVar.f21124c;
    }

    public final int hashCode() {
        return ((((this.f21122a.hashCode() ^ 1000003) * 1000003) ^ this.f21123b) * 1000003) ^ this.f21124c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f21122a);
        sb2.append(", type=");
        int i5 = this.f21123b;
        sb2.append(i5 == 1 ? "required" : i5 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.f21124c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(c1.i(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return d9.e.l(sb2, str, "}");
    }

    public h(p pVar, int i5, int i10) {
        this.f21122a = pVar;
        this.f21123b = i5;
        this.f21124c = i10;
    }
}
