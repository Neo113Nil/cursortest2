package defpackage;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yzk implements ll6 {
    public pl6 a;
    public vsj b;
    public vzk e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        return j72.w(nl6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0218, code lost:
    
        if (r13 != 65534) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021f, code lost:
    
        if (r2 == 32) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0243  */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        byte[] bArr;
        int i;
        this.b.getClass();
        String str = nik.a;
        int i2 = this.c;
        int i3 = 4;
        if (i2 == 0) {
            z1a.E(nl6Var.getPosition() == 0);
            int i4 = this.f;
            if (i4 != -1) {
                nl6Var.skipFully(i4);
                this.c = 4;
                return 0;
            }
            if (!j72.w(nl6Var)) {
                throw s9e.a(null, "Unsupported or unrecognized wav file type.");
            }
            nl6Var.skipFully((int) (nl6Var.getPeekPosition() - nl6Var.getPosition()));
            this.c = 1;
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            j9e j9eVar = new j9e(8);
            r5a e = r5a.e(nl6Var, j9eVar);
            if (e.a != 1685272116) {
                nl6Var.resetPeekPosition();
            } else {
                nl6Var.advancePeekPosition(8);
                j9eVar.N(0);
                nl6Var.peekFully(j9eVar.a, 0, 8);
                j = j9eVar.p();
                nl6Var.skipFully(((int) e.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    zzl.s();
                    return 0;
                }
                z1a.E(this.g != -1);
                long position = this.g - nl6Var.getPosition();
                vzk vzkVar = this.e;
                vzkVar.getClass();
                return vzkVar.f(nl6Var, position) ? -1 : 0;
            }
            nl6Var.resetPeekPosition();
            r5a H = j72.H(1684108385, nl6Var, new j9e(8));
            nl6Var.skipFully(8);
            Pair create = Pair.create(Long.valueOf(nl6Var.getPosition()), Long.valueOf(H.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j2 = this.d;
            if (j2 != -1 && longValue == 4294967295L) {
                longValue = j2;
            }
            this.g = this.f + longValue;
            long length = nl6Var.getLength();
            if (length != -1 && this.g > length) {
                tgj.d0("Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            vzk vzkVar2 = this.e;
            vzkVar2.getClass();
            vzkVar2.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        j9e j9eVar2 = new j9e(16);
        long j3 = j72.H(1718449184, nl6Var, j9eVar2).b;
        z1a.E(j3 >= 16);
        nl6Var.peekFully(j9eVar2.a, 0, 16);
        j9eVar2.N(0);
        int t = j9eVar2.t();
        int t2 = j9eVar2.t();
        int s = j9eVar2.s();
        j9eVar2.s();
        int t3 = j9eVar2.t();
        int t4 = j9eVar2.t();
        int i5 = ((int) j3) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            nl6Var.peekFully(bArr, 0, i5);
            if (t == 65534 && i5 == 24) {
                j9e j9eVar3 = new j9e(bArr);
                j9eVar3.t();
                int t5 = j9eVar3.t();
                if (t5 != 0 && t5 != t4) {
                    throw s9e.c("validBits ( " + t5 + ")  != bitsPerSample( " + t4 + ") are not supported");
                }
                int s2 = j9eVar3.s();
                if ((s2 >> 18) != 0) {
                    throw s9e.c("invalid channel mask " + s2);
                }
                if (s2 != 0 && Integer.bitCount(s2) != t2) {
                    throw s9e.c("invalid number of channels (" + Integer.bitCount(s2) + ") in channel mask " + s2);
                }
                t = j9eVar3.t();
                byte[] bArr2 = new byte[14];
                j9eVar3.k(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, j72.g) && !Arrays.equals(bArr2, j72.h)) {
                    throw s9e.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = nik.b;
        }
        byte[] bArr3 = bArr;
        int i6 = t;
        nl6Var.skipFully((int) (nl6Var.getPeekPosition() - nl6Var.getPosition()));
        k9e k9eVar = new k9e(i6, t2, s, t3, t4, bArr3);
        if (i6 == 17) {
            this.e = new tzk(this.a, this.b, k9eVar);
        } else if (i6 == 6) {
            this.e = new wzk(this.a, this.b, k9eVar, MimeTypes.AUDIO_ALAW, -1);
        } else if (i6 == 7) {
            this.e = new wzk(this.a, this.b, k9eVar, MimeTypes.AUDIO_MLAW, -1);
        } else {
            if (i6 != 1) {
                if (i6 != 3) {
                }
                i = 0;
                if (i != 0) {
                    throw s9e.c("Unsupported WAV format type: " + i6);
                }
                this.e = new wzk(this.a, this.b, k9eVar, MimeTypes.AUDIO_RAW, i);
            }
            i3 = nik.E(t4, ByteOrder.LITTLE_ENDIAN);
            i = i3;
            if (i != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.a = pl6Var;
        this.b = pl6Var.mo2track(0, 1);
        pl6Var.endTracks();
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        vzk vzkVar = this.e;
        if (vzkVar != null) {
            vzkVar.b(j2);
        }
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
