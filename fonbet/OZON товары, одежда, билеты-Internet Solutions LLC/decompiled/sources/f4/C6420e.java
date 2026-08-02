package f4;

import N3.C3659j;
import java.io.IOException;

/* renamed from: f4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6420e {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f62727d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f62728a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f62729b;

    /* renamed from: c, reason: collision with root package name */
    private int f62730c;

    public static long a(byte[] bArr, int i11, boolean z11) {
        long j11 = bArr[0] & 255;
        if (z11) {
            j11 &= ~f62727d[i11 - 1];
        }
        for (int i12 = 1; i12 < i11; i12++) {
            j11 = (j11 << 8) | (bArr[i12] & 255);
        }
        return j11;
    }

    public static int c(int i11) {
        for (int i12 = 0; i12 < 8; i12++) {
            if ((f62727d[i12] & i11) != 0) {
                return i12 + 1;
            }
        }
        return -1;
    }

    public final int b() {
        return this.f62730c;
    }

    public final long d(C3659j c3659j, boolean z11, boolean z12, int i11) throws IOException {
        int i12 = this.f62729b;
        byte[] bArr = this.f62728a;
        if (i12 == 0) {
            if (!c3659j.b(bArr, 0, 1, z11)) {
                return -1L;
            }
            int c11 = c(bArr[0] & 255);
            this.f62730c = c11;
            if (c11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f62729b = 1;
        }
        int i13 = this.f62730c;
        if (i13 > i11) {
            this.f62729b = 0;
            return -2L;
        }
        if (i13 != 1) {
            c3659j.b(bArr, 1, i13 - 1, false);
        }
        this.f62729b = 0;
        return a(bArr, this.f62730c, z12);
    }

    public final void e() {
        this.f62729b = 0;
        this.f62730c = 0;
    }
}
