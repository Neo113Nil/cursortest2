package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f19097e = new e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f19098a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19099b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19101d;

    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f19098a = i10;
        this.f19099b = i11;
        this.f19100c = i12;
        this.f19101d = i13;
    }

    public static e a(e eVar, e eVar2) {
        return c(eVar.f19098a + eVar2.f19098a, eVar.f19099b + eVar2.f19099b, eVar.f19100c + eVar2.f19100c, eVar.f19101d + eVar2.f19101d);
    }

    public static e b(e eVar, e eVar2) {
        return c(Math.max(eVar.f19098a, eVar2.f19098a), Math.max(eVar.f19099b, eVar2.f19099b), Math.max(eVar.f19100c, eVar2.f19100c), Math.max(eVar.f19101d, eVar2.f19101d));
    }

    public static e c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f19097e : new e(i10, i11, i12, i13);
    }

    public static e d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static e e(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return c(i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f19101d == eVar.f19101d && this.f19098a == eVar.f19098a && this.f19100c == eVar.f19100c && this.f19099b == eVar.f19099b;
    }

    public Insets f() {
        return a.a(this.f19098a, this.f19099b, this.f19100c, this.f19101d);
    }

    public int hashCode() {
        return (((((this.f19098a * 31) + this.f19099b) * 31) + this.f19100c) * 31) + this.f19101d;
    }

    public String toString() {
        return "Insets{left=" + this.f19098a + ", top=" + this.f19099b + ", right=" + this.f19100c + ", bottom=" + this.f19101d + '}';
    }
}
