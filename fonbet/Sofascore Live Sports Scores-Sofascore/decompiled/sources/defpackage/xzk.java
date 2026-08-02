package defpackage;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xzk implements kl6 {
    public ol6 a;
    public usj b;
    public int c;
    public long d;
    public uzk e;
    public int f;
    public long g;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x015f, code lost:
    
        if (r13 != 65534) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        if (r17 == 32) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        byte[] bArr;
        int i;
        qx9.u(this.b);
        int i2 = lik.a;
        int i3 = this.c;
        int i4 = 4;
        if (i3 == 0) {
            qx9.t(((ap4) ml6Var).d == 0);
            int i5 = this.f;
            if (i5 != -1) {
                ((ap4) ml6Var).skipFully(i5);
                this.c = 4;
                return 0;
            }
            if (!x2a.v(ml6Var)) {
                throw r9e.a("Unsupported or unrecognized wav file type.", null);
            }
            ap4 ap4Var = (ap4) ml6Var;
            ap4Var.skipFully((int) (ap4Var.getPeekPosition() - ap4Var.d));
            this.c = 1;
            return 0;
        }
        long j = -1;
        if (i3 == 1) {
            nkk nkkVar = new nkk(8);
            r5a d = r5a.d(ml6Var, nkkVar);
            if (d.a != 1685272116) {
                ((ap4) ml6Var).f = 0;
            } else {
                ap4 ap4Var2 = (ap4) ml6Var;
                ap4Var2.b(8, false);
                nkkVar.E(0);
                ap4Var2.peekFully(nkkVar.a, 0, 8, false);
                j = nkkVar.i();
                ap4Var2.skipFully(((int) d.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    zzl.s();
                    return 0;
                }
                qx9.t(this.g != -1);
                long j2 = this.g - ((ap4) ml6Var).d;
                uzk uzkVar = this.e;
                uzkVar.getClass();
                return uzkVar.g(ml6Var, j2) ? -1 : 0;
            }
            ((ap4) ml6Var).f = 0;
            r5a R = x2a.R(1684108385, ml6Var, new nkk(8));
            ap4 ap4Var3 = (ap4) ml6Var;
            ap4Var3.skipFully(8);
            Pair create = Pair.create(Long.valueOf(ap4Var3.d), Long.valueOf(R.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j3 = this.d;
            if (j3 != -1 && longValue == 4294967295L) {
                longValue = j3;
            }
            long j4 = this.f + longValue;
            this.g = j4;
            long j5 = ap4Var3.c;
            if (j5 != -1 && j4 > j5) {
                m6k.f0();
                this.g = j5;
            }
            uzk uzkVar2 = this.e;
            uzkVar2.getClass();
            uzkVar2.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        nkk nkkVar2 = new nkk(16);
        long j6 = x2a.R(1718449184, ml6Var, nkkVar2).b;
        qx9.t(j6 >= 16);
        ap4 ap4Var4 = (ap4) ml6Var;
        ap4Var4.peekFully(nkkVar2.a, 0, 16, false);
        nkkVar2.E(0);
        int l = nkkVar2.l();
        int l2 = nkkVar2.l();
        int k = nkkVar2.k();
        nkkVar2.k();
        int l3 = nkkVar2.l();
        int l4 = nkkVar2.l();
        int i6 = ((int) j6) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            ap4Var4.peekFully(bArr, 0, i6, false);
        } else {
            bArr = lik.e;
        }
        byte[] bArr2 = bArr;
        ap4Var4.skipFully((int) (ap4Var4.getPeekPosition() - ap4Var4.d));
        k9e k9eVar = new k9e(l, l2, k, l3, l4, bArr2);
        if (l == 17) {
            this.e = new tzk(this.a, this.b, k9eVar);
        } else if (l == 6) {
            this.e = new wzk(this.a, this.b, k9eVar, MimeTypes.AUDIO_ALAW, -1);
        } else if (l == 7) {
            this.e = new wzk(this.a, this.b, k9eVar, MimeTypes.AUDIO_MLAW, -1);
        } else {
            if (l != 1) {
                if (l != 3) {
                }
                i = 0;
                if (i != 0) {
                    throw r9e.b("Unsupported WAV format type: " + l);
                }
                this.e = new wzk(this.a, this.b, k9eVar, MimeTypes.AUDIO_RAW, i);
            }
            i4 = lik.o(l4);
            i = i4;
            if (i != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.a = ol6Var;
        this.b = ol6Var.track(0, 1);
        ol6Var.endTracks();
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        return x2a.v(ml6Var);
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        uzk uzkVar = this.e;
        if (uzkVar != null) {
            uzkVar.b(j2);
        }
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
