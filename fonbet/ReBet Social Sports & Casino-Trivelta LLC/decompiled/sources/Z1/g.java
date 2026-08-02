package Z1;

import H1.InterfaceC1184q;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class g {
    private static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public int f14558a;

    /* renamed from: b, reason: collision with root package name */
    public int f14559b;
    private final byte[] scratch = new byte[8];

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~VARINT_LENGTH_MASKS[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = VARINT_LENGTH_MASKS;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & i10) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f14559b;
    }

    public long d(InterfaceC1184q interfaceC1184q, boolean z10, boolean z11, int i10) {
        if (this.f14558a == 0) {
            if (!interfaceC1184q.h(this.scratch, 0, 1, z10)) {
                return -1L;
            }
            int c10 = c(this.scratch[0] & UByte.MAX_VALUE);
            this.f14559b = c10;
            if (c10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f14558a = 1;
        }
        int i11 = this.f14559b;
        if (i11 > i10) {
            this.f14558a = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC1184q.readFully(this.scratch, 1, i11 - 1);
        }
        this.f14558a = 0;
        return a(this.scratch, this.f14559b, z11);
    }

    public void e() {
        this.f14558a = 0;
        this.f14559b = 0;
    }
}
