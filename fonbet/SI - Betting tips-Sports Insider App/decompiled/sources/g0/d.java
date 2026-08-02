package g0;

import android.graphics.Insets;
import com.google.firebase.messaging.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f9675e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f9676a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9677b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9678c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9679d;

    public d(int i5, int i10, int i11, int i12) {
        this.f9676a = i5;
        this.f9677b = i10;
        this.f9678c = i11;
        this.f9679d = i12;
    }

    public static d a(d dVar, d dVar2) {
        return c(Math.max(dVar.f9676a, dVar2.f9676a), Math.max(dVar.f9677b, dVar2.f9677b), Math.max(dVar.f9678c, dVar2.f9678c), Math.max(dVar.f9679d, dVar2.f9679d));
    }

    public static d b(d dVar, d dVar2) {
        return c(Math.min(dVar.f9676a, dVar2.f9676a), Math.min(dVar.f9677b, dVar2.f9677b), Math.min(dVar.f9678c, dVar2.f9678c), Math.min(dVar.f9679d, dVar2.f9679d));
    }

    public static d c(int i5, int i10, int i11, int i12) {
        return (i5 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f9675e : new d(i5, i10, i11, i12);
    }

    public static d d(Insets insets) {
        int i5;
        int i10;
        int i11;
        int i12;
        i5 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return c(i5, i10, i11, i12);
    }

    public final Insets e() {
        return u.i(this.f9676a, this.f9677b, this.f9678c, this.f9679d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9679d == dVar.f9679d && this.f9676a == dVar.f9676a && this.f9678c == dVar.f9678c && this.f9677b == dVar.f9677b;
    }

    public final int hashCode() {
        return (((((this.f9676a * 31) + this.f9677b) * 31) + this.f9678c) * 31) + this.f9679d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f9676a);
        sb2.append(", top=");
        sb2.append(this.f9677b);
        sb2.append(", right=");
        sb2.append(this.f9678c);
        sb2.append(", bottom=");
        return d9.e.i(sb2, this.f9679d, '}');
    }
}
