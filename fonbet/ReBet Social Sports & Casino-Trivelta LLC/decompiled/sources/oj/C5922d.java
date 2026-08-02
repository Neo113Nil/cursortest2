package oj;

import java.math.BigInteger;

/* renamed from: oj.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5922d {

    /* renamed from: a, reason: collision with root package name */
    public final BigInteger f61307a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f61308b;

    /* renamed from: c, reason: collision with root package name */
    public final BigInteger f61309c;

    /* renamed from: d, reason: collision with root package name */
    public final BigInteger f61310d;

    /* renamed from: e, reason: collision with root package name */
    public final BigInteger f61311e;

    /* renamed from: f, reason: collision with root package name */
    public final BigInteger f61312f;

    /* renamed from: g, reason: collision with root package name */
    public final BigInteger f61313g;

    /* renamed from: h, reason: collision with root package name */
    public final BigInteger f61314h;

    /* renamed from: i, reason: collision with root package name */
    public final int f61315i;

    public C5922d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i10) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.f61307a = bigInteger;
        this.f61308b = bigInteger2;
        this.f61309c = bigIntegerArr[0];
        this.f61310d = bigIntegerArr[1];
        this.f61311e = bigIntegerArr2[0];
        this.f61312f = bigIntegerArr2[1];
        this.f61313g = bigInteger3;
        this.f61314h = bigInteger4;
        this.f61315i = i10;
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    public BigInteger b() {
        return this.f61307a;
    }

    public int c() {
        return this.f61315i;
    }

    public BigInteger d() {
        return this.f61313g;
    }

    public BigInteger e() {
        return this.f61314h;
    }

    public BigInteger f() {
        return this.f61309c;
    }

    public BigInteger g() {
        return this.f61310d;
    }

    public BigInteger h() {
        return this.f61311e;
    }

    public BigInteger i() {
        return this.f61312f;
    }
}
