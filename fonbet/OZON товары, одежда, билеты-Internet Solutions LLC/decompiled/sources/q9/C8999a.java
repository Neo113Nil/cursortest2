package q9;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: q9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8999a {

    /* renamed from: h, reason: collision with root package name */
    public static final C8999a f81741h = new C8999a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final C8999a f81742i = new C8999a(1033, UserVerificationMethods.USER_VERIFY_ALL, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C8999a f81743j;

    /* renamed from: k, reason: collision with root package name */
    public static final C8999a f81744k;

    /* renamed from: l, reason: collision with root package name */
    public static final C8999a f81745l;

    /* renamed from: m, reason: collision with root package name */
    public static final C8999a f81746m;

    /* renamed from: n, reason: collision with root package name */
    public static final C8999a f81747n;

    /* renamed from: o, reason: collision with root package name */
    public static final C8999a f81748o;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f81749a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f81750b;

    /* renamed from: c, reason: collision with root package name */
    private final b f81751c;

    /* renamed from: d, reason: collision with root package name */
    private final b f81752d;

    /* renamed from: e, reason: collision with root package name */
    private final int f81753e;

    /* renamed from: f, reason: collision with root package name */
    private final int f81754f;

    /* renamed from: g, reason: collision with root package name */
    private final int f81755g;

    static {
        C8999a c8999a = new C8999a(67, 64, 1);
        f81743j = c8999a;
        f81744k = new C8999a(19, 16, 1);
        f81745l = new C8999a(285, 256, 0);
        C8999a c8999a2 = new C8999a(301, 256, 1);
        f81746m = c8999a2;
        f81747n = c8999a2;
        f81748o = c8999a;
    }

    public C8999a(int i11, int i12, int i13) {
        this.f81754f = i11;
        this.f81753e = i12;
        this.f81755g = i13;
        this.f81749a = new int[i12];
        this.f81750b = new int[i12];
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            this.f81749a[i15] = i14;
            i14 <<= 1;
            if (i14 >= i12) {
                i14 = (i14 ^ i11) & (i12 - 1);
            }
        }
        for (int i16 = 0; i16 < i12 - 1; i16++) {
            this.f81750b[this.f81749a[i16]] = i16;
        }
        this.f81751c = new b(this, new int[]{0});
        this.f81752d = new b(this, new int[]{1});
    }

    final b a(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.f81751c;
        }
        int[] iArr = new int[i11 + 1];
        iArr[0] = i12;
        return new b(this, iArr);
    }

    final int b(int i11) {
        return this.f81749a[i11];
    }

    public final int c() {
        return this.f81755g;
    }

    final b d() {
        return this.f81752d;
    }

    public final int e() {
        return this.f81753e;
    }

    final b f() {
        return this.f81751c;
    }

    final int g(int i11) {
        if (i11 == 0) {
            throw new ArithmeticException();
        }
        return this.f81749a[(this.f81753e - this.f81750b[i11]) - 1];
    }

    final int h(int i11) {
        if (i11 != 0) {
            return this.f81750b[i11];
        }
        throw new IllegalArgumentException();
    }

    final int i(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f81750b;
        return this.f81749a[(iArr[i11] + iArr[i12]) % (this.f81753e - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f81754f));
        sb2.append(',');
        return Ek.a.d(sb2, this.f81753e, ')');
    }
}
