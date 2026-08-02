package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class au implements kl6 {
    public static final int[] n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final int r;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public int h;
    public long i;
    public ol6 j;
    public usj k;
    public a0h l;
    public boolean m;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        o = iArr;
        int i = lik.a;
        Charset charset = xp2.c;
        p = "#!AMR\n".getBytes(charset);
        q = "#!AMR-WB\n".getBytes(charset);
        r = iArr[8];
    }

    public final int a(ml6 ml6Var) {
        boolean z;
        ml6Var.resetPeekPosition();
        byte[] bArr = this.a;
        ml6Var.peekFully(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw r9e.a("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.b) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? o[i] : n[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw r9e.a(sb.toString(), null);
    }

    @Override // defpackage.kl6
    public final int b(ml6 ml6Var, b78 b78Var) {
        qx9.u(this.k);
        int i = lik.a;
        if (((ap4) ml6Var).d == 0 && !e(ml6Var)) {
            throw r9e.a("Could not find AMR header.", null);
        }
        if (!this.m) {
            this.m = true;
            boolean z = this.b;
            String str = z ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB;
            int i2 = z ? 16000 : 8000;
            usj usjVar = this.k;
            pm8 pm8Var = new pm8();
            pm8Var.k = str;
            pm8Var.l = r;
            pm8Var.x = 1;
            pm8Var.y = i2;
            usjVar.a(new sm8(pm8Var));
        }
        int i3 = this.e;
        int i4 = -1;
        if (i3 == 0) {
            try {
                i3 = a(ml6Var);
                this.d = i3;
                this.e = i3;
                int i5 = this.g;
                if (i5 == -1) {
                    this.g = i3;
                    i5 = i3;
                }
                if (i5 == i3) {
                    this.h++;
                }
            } catch (EOFException unused) {
            }
        }
        int b = this.k.b(ml6Var, i3, true);
        if (b != -1) {
            int i6 = this.e - b;
            this.e = i6;
            i4 = 0;
            if (i6 <= 0) {
                this.k.c(this.c + this.i, 1, this.d, 0, null);
                this.c += 20000;
            }
        }
        if (!this.f) {
            aw0 aw0Var = new aw0(C.TIME_UNSET);
            this.l = aw0Var;
            this.j.d(aw0Var);
            this.f = true;
        }
        return i4;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.j = ol6Var;
        this.k = ol6Var.track(0, 1);
        ol6Var.endTracks();
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        return e(ml6Var);
    }

    public final boolean e(ml6 ml6Var) {
        ml6Var.resetPeekPosition();
        byte[] bArr = p;
        byte[] bArr2 = new byte[bArr.length];
        ml6Var.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            ml6Var.skipFully(bArr.length);
            return true;
        }
        ml6Var.resetPeekPosition();
        byte[] bArr3 = q;
        byte[] bArr4 = new byte[bArr3.length];
        ml6Var.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        ml6Var.skipFully(bArr3.length);
        return true;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        if (j != 0) {
            a0h a0hVar = this.l;
            if (a0hVar instanceof cl3) {
                this.i = (Math.max(0L, j - ((cl3) a0hVar).b) * 8000000) / r0.e;
                return;
            }
        }
        this.i = 0L;
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
