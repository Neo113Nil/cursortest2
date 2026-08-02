package Mb;

import com.plaid.internal.EnumC3631g;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f7594f = new a(4201, 4096, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final a f7595g = new a(1033, 1024, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final a f7596h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f7597i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f7598j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f7599k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f7600l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f7601m;

    /* renamed from: a, reason: collision with root package name */
    public final b f7602a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7603b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7604c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7605d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7606e;
    private final int[] expTable;
    private final int[] logTable;

    static {
        a aVar = new a(67, 64, 1);
        f7596h = aVar;
        f7597i = new a(19, 16, 1);
        f7598j = new a(EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f7599k = aVar2;
        f7600l = aVar2;
        f7601m = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f7605d = i10;
        this.f7604c = i11;
        this.f7606e = i12;
        this.expTable = new int[i11];
        this.logTable = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.expTable[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.logTable[this.expTable[i15]] = i15;
        }
        this.f7602a = new b(this, new int[]{0});
        this.f7603b = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f7602a;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    public int c(int i10) {
        return this.expTable[i10];
    }

    public int d() {
        return this.f7606e;
    }

    public b e() {
        return this.f7602a;
    }

    public int f(int i10) {
        if (i10 != 0) {
            return this.expTable[(this.f7604c - this.logTable[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int g(int i10) {
        if (i10 != 0) {
            return this.logTable[i10];
        }
        throw new IllegalArgumentException();
    }

    public int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.expTable;
        int[] iArr2 = this.logTable;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f7604c - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f7605d) + ',' + this.f7604c + ')';
    }
}
