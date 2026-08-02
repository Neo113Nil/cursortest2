package z9;

import h9.s;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f107359a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f107360b;

    /* renamed from: c, reason: collision with root package name */
    private final s[] f107361c;

    public c(int i11, int i12, int i13, int i14, int[] iArr) {
        this.f107359a = i11;
        this.f107360b = iArr;
        float f7 = i14;
        this.f107361c = new s[]{new s(i12, f7), new s(i13, f7)};
    }

    public final s[] a() {
        return this.f107361c;
    }

    public final int[] b() {
        return this.f107360b;
    }

    public final int c() {
        return this.f107359a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && this.f107359a == ((c) obj).f107359a;
    }

    public final int hashCode() {
        return this.f107359a;
    }
}
