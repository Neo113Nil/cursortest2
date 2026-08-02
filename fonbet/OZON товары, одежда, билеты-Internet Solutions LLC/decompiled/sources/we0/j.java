package we0;

import B0.C2454a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f104435a;

    /* renamed from: b, reason: collision with root package name */
    private final int f104436b;

    /* renamed from: c, reason: collision with root package name */
    private final int f104437c;

    /* renamed from: d, reason: collision with root package name */
    private final int f104438d;

    public j() {
        this(0, 0, 0, 0);
    }

    public final int a() {
        return this.f104435a;
    }

    public final int b() {
        return this.f104436b;
    }

    public final int c() {
        return this.f104437c;
    }

    public final int d() {
        return this.f104438d;
    }

    public final int e() {
        return this.f104438d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f104435a == jVar.f104435a && this.f104436b == jVar.f104436b && this.f104437c == jVar.f104437c && this.f104438d == jVar.f104438d;
    }

    public final int f() {
        return this.f104435a;
    }

    public final int g() {
        return this.f104437c;
    }

    public final int h() {
        return this.f104436b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104438d) + C2454a.a(this.f104437c, C2454a.a(this.f104436b, Integer.hashCode(this.f104435a) * 31, 31), 31);
    }

    public final boolean i() {
        Integer[] numArr = {Integer.valueOf(this.f104435a), Integer.valueOf(this.f104436b), Integer.valueOf(this.f104437c), Integer.valueOf(this.f104438d)};
        for (int i11 = 0; i11 < 4; i11++) {
            if (numArr[i11].intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraVisibleAreaPadding(left=");
        sb2.append(this.f104435a);
        sb2.append(", top=");
        sb2.append(this.f104436b);
        sb2.append(", right=");
        sb2.append(this.f104437c);
        sb2.append(", bottom=");
        return K00.b.e(this.f104438d, ")", sb2);
    }

    public j(int i11, int i12, int i13, int i14) {
        this.f104435a = i11;
        this.f104436b = i12;
        this.f104437c = i13;
        this.f104438d = i14;
    }
}
