package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bp4 implements nl6 {
    public final ge4 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
    public final byte[] a = new byte[4096];

    static {
        i6c.a("media3.extractor");
    }

    public bp4(ge4 ge4Var, long j, long j2) {
        this.b = ge4Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.nl6
    public final int a(int i, int i2, byte[] bArr) {
        bp4 bp4Var;
        int min;
        d(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            bp4Var = this;
            min = bp4Var.e(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            bp4Var.g += min;
        } else {
            bp4Var = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(bp4Var.e, bp4Var.f, bArr, i, min);
        bp4Var.f += min;
        return min;
    }

    @Override // defpackage.nl6
    public final void advancePeekPosition(int i) {
        c(i, false);
    }

    public final boolean c(int i, boolean z) {
        d(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            bp4 bp4Var = this;
            int i3 = i;
            boolean z2 = z;
            i2 = bp4Var.e(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            bp4Var.g = bp4Var.f + i2;
            this = bp4Var;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void d(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, nik.j(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i2, i2 + 524288));
        }
    }

    public final int e(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        a70.q();
        return 0;
    }

    public final void g(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.nl6
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.nl6
    public final long getPeekPosition() {
        return this.d + this.f;
    }

    @Override // defpackage.nl6
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.nl6
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        if (!c(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        bp4 bp4Var;
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            g(min);
            i4 = min;
        }
        if (i4 == 0) {
            bp4Var = this;
            i4 = bp4Var.e(bArr, i, i2, 0, true);
        } else {
            bp4Var = this;
        }
        if (i4 != -1) {
            bp4Var.d += i4;
        }
        return i4;
    }

    @Override // defpackage.nl6
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            g(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = e(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4 != -1;
    }

    @Override // defpackage.nl6
    public final void resetPeekPosition() {
        this.f = 0;
    }

    @Override // defpackage.nl6
    public final int skip(int i) {
        bp4 bp4Var;
        int min = Math.min(this.g, i);
        g(min);
        if (min == 0) {
            byte[] bArr = this.a;
            bp4Var = this;
            min = bp4Var.e(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            bp4Var = this;
        }
        if (min != -1) {
            bp4Var.d += min;
        }
        return min;
    }

    @Override // defpackage.nl6
    public final boolean skipFully(int i, boolean z) {
        int min = Math.min(this.g, i);
        g(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = e(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.d += i2;
        }
        return i2 != -1;
    }

    @Override // defpackage.nl6
    public final void peekFully(byte[] bArr, int i, int i2) {
        peekFully(bArr, i, i2, false);
    }

    @Override // defpackage.nl6
    public final void skipFully(int i) {
        skipFully(i, false);
    }

    @Override // defpackage.nl6
    public final void readFully(byte[] bArr, int i, int i2) {
        readFully(bArr, i, i2, false);
    }
}
