package r6;

/* renamed from: r6.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9177c {

    /* renamed from: a, reason: collision with root package name */
    private int f82929a;

    /* renamed from: b, reason: collision with root package name */
    private long f82930b;

    C9177c(long j11, int i11) {
        this.f82930b = j11;
        this.f82929a = i11;
    }

    static C9177c b(int i11, int i12, String str) {
        if (i11 >= i12) {
            return null;
        }
        long j11 = 0;
        int i13 = i11;
        while (i13 < i12) {
            char charAt = str.charAt(i13);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j11 = (j11 * 10) + (charAt - '0');
            if (j11 > 2147483647L) {
                return null;
            }
            i13++;
        }
        if (i13 == i11) {
            return null;
        }
        return new C9177c(j11, i13);
    }

    final int a() {
        return this.f82929a;
    }

    public final int c() {
        return (int) this.f82930b;
    }
}
