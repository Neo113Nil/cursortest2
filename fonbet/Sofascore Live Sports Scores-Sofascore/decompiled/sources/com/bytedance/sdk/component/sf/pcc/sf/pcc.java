package com.bytedance.sdk.component.sf.pcc.sf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import defpackage.a70;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.ilg;
import defpackage.lnb;
import defpackage.ogj;
import defpackage.yhk;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pcc implements gm, sf, Cloneable, ByteChannel {
    private static final byte[] gm = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    vj pcc;
    long sf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcc)) {
            return false;
        }
        pcc pccVar = (pcc) obj;
        long j = this.sf;
        if (j != pccVar.sf) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        vj vjVar = this.pcc;
        vj vjVar2 = pccVar.pcc;
        int i = vjVar.sf;
        int i2 = vjVar2.sf;
        while (j2 < this.sf) {
            long min = Math.min(vjVar.gm - i, vjVar2.gm - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (vjVar.pcc[i] != vjVar2.pcc[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == vjVar.gm) {
                vjVar = vjVar.wh;
                i = vjVar.sf;
            }
            if (i2 == vjVar2.gm) {
                vjVar2 = vjVar2.wh;
                i2 = vjVar2.sf;
            }
            j2 += min;
        }
        return true;
    }

    public vj gm(int i) {
        if (i <= 0 || i > 8192) {
            ilg.c();
            return null;
        }
        vj vjVar = this.pcc;
        if (vjVar != null) {
            vj vjVar2 = vjVar.qf;
            return (vjVar2.gm + i > 8192 || !vjVar2.vj) ? vjVar2.pcc(wh.pcc()) : vjVar2;
        }
        vj pcc = wh.pcc();
        this.pcc = pcc;
        pcc.qf = pcc;
        pcc.wh = pcc;
        return pcc;
    }

    public int hashCode() {
        vj vjVar = this.pcc;
        if (vjVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vjVar.gm;
            for (int i3 = vjVar.sf; i3 < i2; i3++) {
                i = (i * 31) + vjVar.pcc[i3];
            }
            vjVar = vjVar.wh;
        } while (vjVar != this.pcc);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public pcc clone() {
        pcc pccVar = new pcc();
        if (this.sf == 0) {
            return pccVar;
        }
        vj pcc = this.pcc.pcc();
        pccVar.pcc = pcc;
        pcc.qf = pcc;
        pcc.wh = pcc;
        vj vjVar = this.pcc;
        while (true) {
            vjVar = vjVar.wh;
            if (vjVar == this.pcc) {
                pccVar.sf = this.sf;
                return pccVar;
            }
            pccVar.pcc.qf.pcc(vjVar.pcc());
        }
    }

    public pcc pcc(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            a70.p("string == null");
            return null;
        }
        if (i < 0) {
            a70.p("beginIndex < 0: ".concat(String.valueOf(i)));
            return null;
        }
        if (i2 < i) {
            a70.p(dmi.k(i2, i, "endIndex < beginIndex: ", " < "));
            return null;
        }
        if (i2 > str.length()) {
            yhk.h(str.length(), lnb.t(i2, "endIndex > string.length: ", " > "));
            return null;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                vj gm2 = gm(1);
                byte[] bArr = gm2.pcc;
                int i3 = gm2.gm - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = gm2.gm;
                int i6 = (i3 + i) - i5;
                gm2.gm = i5 + i6;
                this.sf += i6;
            } else {
                if (charAt2 < 2048) {
                    sf((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    sf((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    sf((charAt2 >> '\f') | 224);
                    sf(((charAt2 >> 6) & 63) | 128);
                    sf((charAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        sf(63);
                        i = i7;
                    } else {
                        int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        sf((i8 >> 18) | 240);
                        sf(((i8 >> 12) & 63) | 128);
                        sf(((i8 >> 6) & 63) | 128);
                        sf((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        vj vjVar = this.pcc;
        if (vjVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vjVar.gm - vjVar.sf);
        byteBuffer.put(vjVar.pcc, vjVar.sf, min);
        int i = vjVar.sf + min;
        vjVar.sf = i;
        this.sf -= min;
        if (i == vjVar.gm) {
            this.pcc = vjVar.sf();
            wh.pcc(vjVar);
        }
        return min;
    }

    public pcc sf(long j) {
        if (j == 0) {
            return sf(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        vj gm2 = gm(numberOfTrailingZeros);
        byte[] bArr = gm2.pcc;
        int i = gm2.gm;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = gm[(int) (15 & j)];
            j >>>= 4;
        }
        gm2.gm += numberOfTrailingZeros;
        this.sf += numberOfTrailingZeros;
        return this;
    }

    public String toString() {
        return vj().toString();
    }

    public final oo vj() {
        long j = this.sf;
        if (j <= 2147483647L) {
            return oo((int) j);
        }
        ogj.f(this.sf, "size > Integer.MAX_VALUE: ");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            a70.p("source == null");
            return 0;
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            vj gm2 = gm(1);
            int min = Math.min(i, 8192 - gm2.gm);
            byteBuffer.get(gm2.pcc, gm2.gm, min);
            i -= min;
            gm2.gm += min;
        }
        this.sf += remaining;
        return remaining;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public String gm() {
        try {
            return pcc(this.sf, vy.pcc);
        } catch (EOFException e) {
            a70.j(e);
            return null;
        }
    }

    public final oo oo(int i) {
        if (i == 0) {
            return oo.gm;
        }
        return new qf(this, i);
    }

    public pcc sf(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            vy.pcc(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                vj gm2 = gm(1);
                int min = Math.min(i3 - i, 8192 - gm2.gm);
                System.arraycopy(bArr, i, gm2.pcc, gm2.gm, min);
                i += min;
                gm2.gm += min;
            }
            this.sf += j;
            return this;
        }
        a70.p("source == null");
        return null;
    }

    public pcc sf(int i) {
        vj gm2 = gm(1);
        byte[] bArr = gm2.pcc;
        int i2 = gm2.gm;
        gm2.gm = i2 + 1;
        bArr[i2] = (byte) i;
        this.sf++;
        return this;
    }

    public byte sf() {
        long j = this.sf;
        if (j != 0) {
            vj vjVar = this.pcc;
            int i = vjVar.sf;
            int i2 = vjVar.gm;
            int i3 = i + 1;
            byte b = vjVar.pcc[i];
            this.sf = j - 1;
            if (i3 == i2) {
                this.pcc = vjVar.sf();
                wh.pcc(vjVar);
                return b;
            }
            vjVar.sf = i3;
            return b;
        }
        a70.r("size == 0");
        return (byte) 0;
    }

    public String pcc(long j, Charset charset) throws EOFException {
        vy.pcc(this.sf, 0L, j);
        if (charset == null) {
            a70.p("charset == null");
            return null;
        }
        if (j > 2147483647L) {
            a70.p("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
            return null;
        }
        if (j == 0) {
            return "";
        }
        vj vjVar = this.pcc;
        int i = vjVar.sf;
        if (i + j > vjVar.gm) {
            return new String(pcc(j), charset);
        }
        String str = new String(vjVar.pcc, i, (int) j, charset);
        int i2 = (int) (vjVar.sf + j);
        vjVar.sf = i2;
        this.sf -= j;
        if (i2 == vjVar.gm) {
            this.pcc = vjVar.sf();
            wh.pcc(vjVar);
        }
        return str;
    }

    public byte[] pcc(long j) throws EOFException {
        vy.pcc(this.sf, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            pcc(bArr);
            return bArr;
        }
        a70.p("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        return null;
    }

    public void pcc(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int pcc = pcc(bArr, i, bArr.length - i);
            if (pcc == -1) {
                a70.q();
                return;
            }
            i += pcc;
        }
    }

    public int pcc(byte[] bArr, int i, int i2) {
        vy.pcc(bArr.length, i, i2);
        vj vjVar = this.pcc;
        if (vjVar == null) {
            return -1;
        }
        int min = Math.min(i2, vjVar.gm - vjVar.sf);
        System.arraycopy(vjVar.pcc, vjVar.sf, bArr, i, min);
        int i3 = vjVar.sf + min;
        vjVar.sf = i3;
        this.sf -= min;
        if (i3 == vjVar.gm) {
            this.pcc = vjVar.sf();
            wh.pcc(vjVar);
        }
        return min;
    }

    public pcc pcc(String str) {
        return pcc(str, 0, str.length());
    }

    public boolean pcc() {
        return this.sf == 0;
    }

    public pcc pcc(int i) {
        if (i < 128) {
            sf(i);
            return this;
        }
        if (i < 2048) {
            sf((i >> 6) | PsExtractor.AUDIO_STREAM);
            sf((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                sf(63);
                return this;
            }
            sf((i >> 12) | 224);
            sf(((i >> 6) & 63) | 128);
            sf((i & 63) | 128);
            return this;
        }
        if (i <= 1114111) {
            sf((i >> 18) | 240);
            sf(((i >> 12) & 63) | 128);
            sf(((i >> 6) & 63) | 128);
            sf((i & 63) | 128);
            return this;
        }
        a70.p(bf3.i(i, new StringBuilder("Unexpected code point: ")));
        return null;
    }

    public pcc pcc(String str, int i, int i2, Charset charset) {
        if (str == null) {
            a70.p("string == null");
            return null;
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                yhk.h(str.length(), lnb.t(i2, "endIndex > string.length: ", " > "));
                return null;
            }
            if (charset != null) {
                if (charset.equals(vy.pcc)) {
                    return pcc(str, i, i2);
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                return sf(bytes, 0, bytes.length);
            }
            a70.p("charset == null");
            return null;
        }
        a70.p(dmi.k(i2, i, "endIndex < beginIndex: ", " < "));
        return null;
    }
}
