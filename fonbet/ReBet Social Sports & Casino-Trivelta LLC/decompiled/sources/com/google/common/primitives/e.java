package com.google.common.primitives;

import Ra.n;
import java.io.Serializable;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class e implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final e f36876c = new e(new int[0]);

    /* renamed from: a, reason: collision with root package name */
    public final transient int f36877a;
    private final int[] array;

    /* renamed from: b, reason: collision with root package name */
    public final int f36878b;

    public e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e a(int[] iArr) {
        return iArr.length == 0 ? f36876c : new e(Arrays.copyOf(iArr, iArr.length));
    }

    public static e f() {
        return f36876c;
    }

    public int b(int i10) {
        n.i(i10, e());
        return this.array[this.f36877a + i10];
    }

    public boolean c() {
        return this.f36878b == this.f36877a;
    }

    public final boolean d() {
        return this.f36877a > 0 || this.f36878b < this.array.length;
    }

    public int e() {
        return this.f36878b - this.f36877a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (e() != eVar.e()) {
            return false;
        }
        for (int i10 = 0; i10 < e(); i10++) {
            if (b(i10) != eVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int[] g() {
        return Arrays.copyOfRange(this.array, this.f36877a, this.f36878b);
    }

    public e h() {
        return d() ? new e(g()) : this;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = this.f36877a; i11 < this.f36878b; i11++) {
            i10 = (i10 * 31) + f.j(this.array[i11]);
        }
        return i10;
    }

    public Object readResolve() {
        return c() ? f36876c : this;
    }

    public String toString() {
        if (c()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(e() * 5);
        sb2.append('[');
        sb2.append(this.array[this.f36877a]);
        int i10 = this.f36877a;
        while (true) {
            i10++;
            if (i10 >= this.f36878b) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.array[i10]);
        }
    }

    public Object writeReplace() {
        return h();
    }

    public e(int[] iArr, int i10, int i11) {
        this.array = iArr;
        this.f36877a = i10;
        this.f36878b = i11;
    }
}
