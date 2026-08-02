package defpackage;

import android.media.MediaCodec;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cpg {
    public final l2a a;
    public final int b;
    public final j9e c;
    public c78 d;
    public c78 e;
    public c78 f;
    public long g;

    public cpg(l2a l2aVar) {
        this.a = l2aVar;
        synchronized (l2aVar) {
            ((yq4) l2aVar.d).c.getClass();
        }
        this.b = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.c = new j9e(32);
        c78 c78Var = new c78(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.d = c78Var;
        this.e = c78Var;
        this.f = c78Var;
    }

    public static c78 c(c78 c78Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c78Var.c) {
            c78Var = (c78) c78Var.e;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (c78Var.c - j));
            ap apVar = (ap) c78Var.d;
            byteBuffer.put(apVar.a, ((int) (j - c78Var.b)) + apVar.b, min);
            i -= min;
            j += min;
            if (j == c78Var.c) {
                c78Var = (c78) c78Var.e;
            }
        }
        return c78Var;
    }

    public static c78 d(c78 c78Var, long j, byte[] bArr, int i) {
        while (j >= c78Var.c) {
            c78Var = (c78) c78Var.e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c78Var.c - j));
            ap apVar = (ap) c78Var.d;
            System.arraycopy(apVar.a, ((int) (j - c78Var.b)) + apVar.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c78Var.c) {
                c78Var = (c78) c78Var.e;
            }
        }
        return c78Var;
    }

    public static c78 e(c78 c78Var, im4 im4Var, bm2 bm2Var, j9e j9eVar) {
        if (im4Var.i(1073741824)) {
            long j = bm2Var.b;
            int i = 1;
            j9eVar.K(1);
            c78 d = d(c78Var, j, j9eVar.a, 1);
            long j2 = j + 1;
            byte b = j9eVar.a[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            d74 d74Var = im4Var.h;
            byte[] bArr = d74Var.a;
            if (bArr == null) {
                d74Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c78Var = d(d, j2, d74Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                j9eVar.K(2);
                c78Var = d(c78Var, j3, j9eVar.a, 2);
                j3 += 2;
                i = j9eVar.H();
            }
            int[] iArr = d74Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = d74Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                j9eVar.K(i3);
                c78Var = d(c78Var, j3, j9eVar.a, i3);
                j3 += i3;
                j9eVar.N(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = j9eVar.H();
                    iArr2[i4] = j9eVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bm2Var.c - ((int) (j3 - bm2Var.b));
            }
            tsj tsjVar = (tsj) bm2Var.d;
            String str = nik.a;
            byte[] bArr2 = tsjVar.b;
            byte[] bArr3 = d74Var.a;
            int i5 = tsjVar.a;
            int i6 = tsjVar.c;
            int i7 = tsjVar.d;
            d74Var.f = i;
            d74Var.d = iArr;
            d74Var.e = iArr2;
            d74Var.b = bArr2;
            d74Var.a = bArr3;
            d74Var.c = i5;
            d74Var.g = i6;
            d74Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = d74Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            c74 c74Var = (c74) d74Var.j;
            MediaCodec.CryptoInfo.Pattern pattern = c74Var.b;
            pattern.set(i6, i7);
            c74Var.a.setPattern(pattern);
            long j4 = bm2Var.b;
            int i8 = (int) (j3 - j4);
            bm2Var.b = j4 + i8;
            bm2Var.c -= i8;
        }
        if (!im4Var.i(268435456)) {
            im4Var.C(bm2Var.c);
            return c(c78Var, bm2Var.b, im4Var.i, bm2Var.c);
        }
        j9eVar.K(4);
        c78 d2 = d(c78Var, bm2Var.b, j9eVar.a, 4);
        int E = j9eVar.E();
        bm2Var.b += 4;
        bm2Var.c -= 4;
        im4Var.C(E);
        c78 c = c(d2, bm2Var.b, im4Var.i, E);
        bm2Var.b += E;
        int i9 = bm2Var.c - E;
        bm2Var.c = i9;
        ByteBuffer byteBuffer = im4Var.l;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            im4Var.l = ByteBuffer.allocate(i9);
        } else {
            im4Var.l.clear();
        }
        return c(c, bm2Var.b, im4Var.l, bm2Var.c);
    }

    public final void a(long j) {
        c78 c78Var;
        if (j == -1) {
            return;
        }
        while (true) {
            c78Var = this.d;
            if (j < c78Var.c) {
                break;
            }
            l2a l2aVar = this.a;
            ap apVar = (ap) c78Var.d;
            synchronized (l2aVar) {
                zz0 zz0Var = ((yq4) l2aVar.d).c;
                synchronized (zz0Var) {
                    ap[] apVarArr = (ap[]) zz0Var.e;
                    int i = zz0Var.d;
                    zz0Var.d = i + 1;
                    apVarArr[i] = apVar;
                    zz0Var.c--;
                }
                l2aVar.G(apVar);
            }
            c78 c78Var2 = this.d;
            c78Var2.d = null;
            c78 c78Var3 = (c78) c78Var2.e;
            c78Var2.e = null;
            this.d = c78Var3;
        }
        if (this.e.b < c78Var.b) {
            this.e = c78Var;
        }
    }

    public final int b(int i) {
        ap c;
        c78 c78Var = this.f;
        if (((ap) c78Var.d) == null) {
            l2a l2aVar = this.a;
            synchronized (l2aVar) {
                c = ((yq4) l2aVar.d).c.c();
                ((HashMap) l2aVar.b).put(c, (cse) l2aVar.c);
                wq4 wq4Var = (wq4) ((yq4) l2aVar.d).q.get((cse) l2aVar.c);
                if (wq4Var != null) {
                    synchronized (wq4Var) {
                        wq4Var.d++;
                    }
                }
            }
            c78 c78Var2 = new c78(this.f.c, this.b);
            c78Var.d = c;
            c78Var.e = c78Var2;
        }
        return Math.min(i, (int) (this.f.c - this.g));
    }
}
