package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.p;
import java.nio.ByteBuffer;
import java.util.Arrays;
import xsna.fxc0;
import xsna.rgp0;
import xsna.tjk;
import xsna.vu1;
import xsna.xi90;
import xsna.xu1;
import xsna.y2r0;

/* compiled from: SampleDataQueue.java */
/* loaded from: classes12.dex */
public final class o {
    public final xu1 a;
    public final int b;
    public final xi90 c;
    public a d;
    public a e;
    public a f;
    public long g;

    /* compiled from: SampleDataQueue.java */
    public static final class a implements xu1.a {
        public long a;
        public long b;

        @Nullable
        public vu1 c;

        @Nullable
        public a d;

        public a(long j, int i) {
            fxc0.z(this.c == null);
            this.a = j;
            this.b = j + i;
        }
    }

    public o(xu1 xu1Var) {
        this.a = xu1Var;
        int individualAllocationLength = xu1Var.getIndividualAllocationLength();
        this.b = individualAllocationLength;
        this.c = new xi90(32);
        a aVar = new a(0L, individualAllocationLength);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public static a c(a aVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (aVar.b - j));
            vu1 vu1Var = aVar.c;
            byteBuffer.put(vu1Var.a, ((int) (j - aVar.a)) + vu1Var.b, min);
            i -= min;
            j += min;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a d(a aVar, long j, byte[] bArr, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (aVar.b - j));
            vu1 vu1Var = aVar.c;
            System.arraycopy(vu1Var.a, ((int) (j - aVar.a)) + vu1Var.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, DecoderInputBuffer decoderInputBuffer, p.a aVar2, xi90 xi90Var) {
        if (decoderInputBuffer.b(1073741824)) {
            long j = aVar2.b;
            int i = 1;
            xi90Var.M(1);
            a d = d(aVar, j, xi90Var.a, 1);
            long j2 = j + 1;
            byte b = xi90Var.a[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            tjk tjkVar = decoderInputBuffer.d;
            byte[] bArr = tjkVar.a;
            if (bArr == null) {
                tjkVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = d(d, j2, tjkVar.a, i2);
            long j3 = j2 + i2;
            if (z) {
                xi90Var.M(2);
                aVar = d(aVar, j3, xi90Var.a, 2);
                j3 += 2;
                i = xi90Var.J();
            }
            int[] iArr = tjkVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = tjkVar.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                xi90Var.M(i3);
                aVar = d(aVar, j3, xi90Var.a, i3);
                j3 += i3;
                xi90Var.P(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = xi90Var.J();
                    iArr2[i4] = xi90Var.G();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.a - ((int) (j3 - aVar2.b));
            }
            rgp0.a aVar3 = aVar2.c;
            String str = y2r0.a;
            byte[] bArr2 = aVar3.b;
            byte[] bArr3 = tjkVar.a;
            int i5 = aVar3.a;
            int i6 = aVar3.c;
            int i7 = aVar3.d;
            tjkVar.f = i;
            tjkVar.d = iArr;
            tjkVar.e = iArr2;
            tjkVar.b = bArr2;
            tjkVar.a = bArr3;
            tjkVar.c = i5;
            tjkVar.g = i6;
            tjkVar.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = tjkVar.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            tjk.a aVar4 = tjkVar.j;
            aVar4.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = aVar4.b;
            pattern.set(i6, i7);
            aVar4.a.setPattern(pattern);
            long j4 = aVar2.b;
            int i8 = (int) (j3 - j4);
            aVar2.b = j4 + i8;
            aVar2.a -= i8;
        }
        if (!decoderInputBuffer.b(268435456)) {
            decoderInputBuffer.e(aVar2.a);
            return c(aVar, aVar2.b, decoderInputBuffer.e, aVar2.a);
        }
        xi90Var.M(4);
        a d2 = d(aVar, aVar2.b, xi90Var.a, 4);
        int G = xi90Var.G();
        aVar2.b += 4;
        aVar2.a -= 4;
        decoderInputBuffer.e(G);
        a c = c(d2, aVar2.b, decoderInputBuffer.e, G);
        aVar2.b += G;
        int i9 = aVar2.a - G;
        aVar2.a = i9;
        ByteBuffer byteBuffer = decoderInputBuffer.h;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            decoderInputBuffer.h = ByteBuffer.allocate(i9);
        } else {
            decoderInputBuffer.h.clear();
        }
        return c(c, aVar2.b, decoderInputBuffer.h, aVar2.a);
    }

    public final void a(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.b) {
                break;
            }
            this.a.a(aVar.c);
            a aVar2 = this.d;
            aVar2.c = null;
            a aVar3 = aVar2.d;
            aVar2.d = null;
            this.d = aVar3;
        }
        if (this.e.a < aVar.a) {
            this.e = aVar;
        }
    }

    public final int b(int i) {
        a aVar = this.f;
        if (aVar.c == null) {
            vu1 allocate = this.a.allocate();
            a aVar2 = new a(this.f.b, this.b);
            aVar.c = allocate;
            aVar.d = aVar2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
