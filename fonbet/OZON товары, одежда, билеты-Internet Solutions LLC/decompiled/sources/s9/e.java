package s9;

import h9.h;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    private static final e[] f98373h = {new e(1, 10, 10, 8, 8, new b(5, new a(1, 3))), new e(2, 12, 12, 10, 10, new b(7, new a(1, 5))), new e(3, 14, 14, 12, 12, new b(10, new a(1, 8))), new e(4, 16, 16, 14, 14, new b(12, new a(1, 12))), new e(5, 18, 18, 16, 16, new b(14, new a(1, 18))), new e(6, 20, 20, 18, 18, new b(18, new a(1, 22))), new e(7, 22, 22, 20, 20, new b(20, new a(1, 30))), new e(8, 24, 24, 22, 22, new b(24, new a(1, 36))), new e(9, 26, 26, 24, 24, new b(28, new a(1, 44))), new e(10, 32, 32, 14, 14, new b(36, new a(1, 62))), new e(11, 36, 36, 16, 16, new b(42, new a(1, 86))), new e(12, 40, 40, 18, 18, new b(48, new a(1, 114))), new e(13, 44, 44, 20, 20, new b(56, new a(1, 144))), new e(14, 48, 48, 22, 22, new b(68, new a(1, 174))), new e(15, 52, 52, 24, 24, new b(42, new a(2, 102))), new e(16, 64, 64, 14, 14, new b(56, new a(2, 140))), new e(17, 72, 72, 16, 16, new b(36, new a(4, 92))), new e(18, 80, 80, 18, 18, new b(48, new a(4, 114))), new e(19, 88, 88, 20, 20, new b(56, new a(4, 144))), new e(20, 96, 96, 22, 22, new b(68, new a(4, 174))), new e(21, 104, 104, 24, 24, new b(56, new a(6, 136))), new e(22, 120, 120, 18, 18, new b(68, new a(6, 175))), new e(23, 132, 132, 20, 20, new b(62, new a(8, 163))), new e(24, 144, 144, 22, 22, new b(new a(8, 156), new a(2, 155))), new e(25, 8, 18, 6, 16, new b(7, new a(1, 5))), new e(26, 8, 32, 6, 14, new b(11, new a(1, 10))), new e(27, 12, 26, 10, 24, new b(14, new a(1, 16))), new e(28, 12, 36, 10, 16, new b(18, new a(1, 22))), new e(29, 16, 36, 14, 16, new b(24, new a(1, 32))), new e(30, 16, 48, 14, 22, new b(28, new a(1, 49)))};

    /* renamed from: a, reason: collision with root package name */
    private final int f98374a;

    /* renamed from: b, reason: collision with root package name */
    private final int f98375b;

    /* renamed from: c, reason: collision with root package name */
    private final int f98376c;

    /* renamed from: d, reason: collision with root package name */
    private final int f98377d;

    /* renamed from: e, reason: collision with root package name */
    private final int f98378e;

    /* renamed from: f, reason: collision with root package name */
    private final b f98379f;

    /* renamed from: g, reason: collision with root package name */
    private final int f98380g;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f98381a;

        /* renamed from: b, reason: collision with root package name */
        private final int f98382b;

        a(int i11, int i12) {
            this.f98381a = i11;
            this.f98382b = i12;
        }

        final int a() {
            return this.f98381a;
        }

        final int b() {
            return this.f98382b;
        }
    }

    private e(int i11, int i12, int i13, int i14, int i15, b bVar) {
        this.f98374a = i11;
        this.f98375b = i12;
        this.f98376c = i13;
        this.f98377d = i14;
        this.f98378e = i15;
        this.f98379f = bVar;
        int b11 = bVar.b();
        int i16 = 0;
        for (a aVar : bVar.a()) {
            i16 += (aVar.b() + b11) * aVar.a();
        }
        this.f98380g = i16;
    }

    public static e g(int i11, int i12) throws h {
        if ((i11 & 1) != 0 || (i12 & 1) != 0) {
            throw h.a();
        }
        for (e eVar : f98373h) {
            if (eVar.f98375b == i11 && eVar.f98376c == i12) {
                return eVar;
            }
        }
        throw h.a();
    }

    public final int a() {
        return this.f98378e;
    }

    public final int b() {
        return this.f98377d;
    }

    final b c() {
        return this.f98379f;
    }

    public final int d() {
        return this.f98376c;
    }

    public final int e() {
        return this.f98375b;
    }

    public final int f() {
        return this.f98380g;
    }

    public final int h() {
        return this.f98374a;
    }

    public final String toString() {
        return String.valueOf(this.f98374a);
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f98383a;

        /* renamed from: b, reason: collision with root package name */
        private final a[] f98384b;

        b(int i11, a aVar) {
            this.f98383a = i11;
            this.f98384b = new a[]{aVar};
        }

        final a[] a() {
            return this.f98384b;
        }

        final int b() {
            return this.f98383a;
        }

        b(a aVar, a aVar2) {
            this.f98383a = 62;
            this.f98384b = new a[]{aVar, aVar2};
        }
    }
}
