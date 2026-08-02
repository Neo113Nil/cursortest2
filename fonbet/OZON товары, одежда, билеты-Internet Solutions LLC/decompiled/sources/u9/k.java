package u9;

/* loaded from: classes9.dex */
public class k {

    /* renamed from: i, reason: collision with root package name */
    private static k[] f100418i = {new k(false, 3, 5, 8, 8, 1, 3, 5), new k(false, 5, 7, 10, 10, 1, 5, 7), new k(true, 5, 7, 16, 6, 1, 5, 7), new k(false, 8, 10, 12, 12, 1, 8, 10), new k(true, 10, 11, 14, 6, 2, 10, 11), new k(false, 12, 12, 14, 14, 1, 12, 12), new k(true, 16, 14, 24, 10, 1, 16, 14), new k(false, 18, 14, 16, 16, 1, 18, 14), new k(false, 22, 18, 18, 18, 1, 22, 18), new k(true, 22, 18, 16, 10, 2, 22, 18), new k(false, 30, 20, 20, 20, 1, 30, 20), new k(true, 32, 24, 16, 14, 2, 32, 24), new k(false, 36, 24, 22, 22, 1, 36, 24), new k(false, 44, 28, 24, 24, 1, 44, 28), new k(true, 49, 28, 22, 14, 2, 49, 28), new k(false, 62, 36, 14, 14, 4, 62, 36), new k(false, 86, 42, 16, 16, 4, 86, 42), new k(false, 114, 48, 18, 18, 4, 114, 48), new k(false, 144, 56, 20, 20, 4, 144, 56), new k(false, 174, 68, 22, 22, 4, 174, 68), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d(false, 1558, 620, 22, 22, 36, -1, 62)};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f100419a;

    /* renamed from: b, reason: collision with root package name */
    private final int f100420b;

    /* renamed from: c, reason: collision with root package name */
    private final int f100421c;

    /* renamed from: d, reason: collision with root package name */
    public final int f100422d;

    /* renamed from: e, reason: collision with root package name */
    public final int f100423e;

    /* renamed from: f, reason: collision with root package name */
    private final int f100424f;

    /* renamed from: g, reason: collision with root package name */
    private final int f100425g;

    /* renamed from: h, reason: collision with root package name */
    private final int f100426h;

    k(boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f100419a = z11;
        this.f100420b = i11;
        this.f100421c = i12;
        this.f100422d = i13;
        this.f100423e = i14;
        this.f100424f = i15;
        this.f100425g = i16;
        this.f100426h = i17;
    }

    private int e() {
        int i11 = 1;
        int i12 = this.f100424f;
        if (i12 != 1) {
            i11 = 2;
            if (i12 != 2 && i12 != 4) {
                if (i12 == 16) {
                    return 4;
                }
                if (i12 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    private int k() {
        int i11 = this.f100424f;
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static k l(int i11, l lVar, h9.f fVar, h9.f fVar2) {
        k[] kVarArr = f100418i;
        for (int i12 = 0; i12 < 30; i12++) {
            k kVar = kVarArr[i12];
            if (!(lVar == l.FORCE_SQUARE && kVar.f100419a) && ((lVar != l.FORCE_RECTANGLE || kVar.f100419a) && ((fVar == null || (kVar.j() >= 0 && kVar.i() >= 0)) && ((fVar2 == null || (kVar.j() <= 0 && kVar.i() <= 0)) && i11 <= kVar.f100420b)))) {
                return kVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i11)));
    }

    public final int a() {
        return this.f100420b;
    }

    public int b(int i11) {
        return this.f100425g;
    }

    public final int c() {
        return this.f100421c;
    }

    public final int d() {
        return this.f100426h;
    }

    public int f() {
        return this.f100420b / this.f100425g;
    }

    public final int g() {
        return k() * this.f100423e;
    }

    public final int h() {
        return e() * this.f100422d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f100419a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f100422d);
        sb2.append('x');
        sb2.append(this.f100423e);
        sb2.append(", symbol size ");
        sb2.append(j());
        sb2.append('x');
        sb2.append(i());
        sb2.append(", symbol data size ");
        sb2.append(h());
        sb2.append('x');
        sb2.append(g());
        sb2.append(", codewords ");
        sb2.append(this.f100420b);
        sb2.append('+');
        sb2.append(this.f100421c);
        return sb2.toString();
    }
}
