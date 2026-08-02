package y9;

import o9.C8659a;

/* loaded from: classes9.dex */
final class x {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f106352c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    private final v f106353a = new v();

    /* renamed from: b, reason: collision with root package name */
    private final w f106354b = new w();

    x() {
    }

    final h9.q a(int i11, int i12, C8659a c8659a) throws h9.m {
        int[] m11 = y.m(c8659a, i12, false, f106352c);
        try {
            return this.f106354b.a(i11, c8659a, m11);
        } catch (h9.p unused) {
            return this.f106353a.a(i11, c8659a, m11);
        }
    }
}
