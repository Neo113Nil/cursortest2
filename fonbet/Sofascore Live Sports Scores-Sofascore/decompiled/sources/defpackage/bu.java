package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bu implements ll6 {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final q35 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public pl6 j;
    public vsj k;
    public vsj l;
    public b0h m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = nik.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public bu() {
        q35 q35Var = new q35();
        this.b = q35Var;
        this.l = q35Var;
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        return g(nl6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        nl6 nl6Var2;
        this.k.getClass();
        String str = nik.a;
        if (nl6Var.getPosition() == 0 && !g(nl6Var)) {
            throw s9e.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str2 = MimeTypes.AUDIO_AMR_WB;
            String str3 = z ? MimeTypes.AUDIO_AMR_WB : "audio/amr";
            if (!z) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            }
            int i = z ? 16000 : 8000;
            int i2 = z ? r[8] : q[7];
            vsj vsjVar = this.k;
            qm8 qm8Var = new qm8();
            qm8Var.m = sjc.p(str3);
            qm8Var.n = sjc.p(str2);
            qm8Var.o = i2;
            qm8Var.F = 1;
            qm8Var.G = i;
            w1l.r(qm8Var, vsjVar);
        }
        int i3 = 0;
        if (this.f == 0) {
            try {
                int f = f(nl6Var);
                this.e = f;
                this.f = f;
                int i4 = this.g;
                if (i4 == -1) {
                    nl6Var.getPosition();
                    f = this.e;
                    this.g = f;
                    i4 = f;
                }
                if (i4 == f) {
                    this.h++;
                }
                b0h b0hVar = this.m;
                if (b0hVar instanceof x0a) {
                    x0a x0aVar = (x0a) b0hVar;
                    long j = this.i + this.d + 20000;
                    long position = nl6Var.getPosition() + this.e;
                    ojb ojbVar = x0aVar.b;
                    int i5 = ojbVar.b;
                    if (i5 == 0 || j - ojbVar.d(i5 - 1) >= 100000) {
                        ojb ojbVar2 = x0aVar.a;
                        ojb ojbVar3 = x0aVar.b;
                        if (ojbVar3.b == 0 && j > 0) {
                            ojbVar2.a(0L);
                            ojbVar3.a(0L);
                        }
                        ojbVar2.a(position);
                        ojbVar3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
            } catch (EOFException unused) {
                nl6Var2 = nl6Var;
            }
        }
        nl6Var2 = nl6Var;
        int c = this.l.c(nl6Var2, this.f, true);
        if (c != -1) {
            int i6 = this.f - c;
            this.f = i6;
            if (i6 <= 0) {
                this.l.a(this.d + this.i, 1, this.e, 0, null);
                this.d += 20000;
            }
            nl6Var2.getLength();
            if (this.m == null) {
                bw0 bw0Var = new bw0(C.TIME_UNSET);
                this.m = bw0Var;
                this.j.m(bw0Var);
            }
            if (i3 == -1) {
                b0h b0hVar2 = this.m;
                if (b0hVar2 instanceof x0a) {
                    long j2 = this.i + this.d;
                    ((x0a) b0hVar2).c = j2;
                    this.j.m(b0hVar2);
                    this.k.f(j2);
                }
            }
            return i3;
        }
        i3 = -1;
        nl6Var2.getLength();
        if (this.m == null) {
        }
        if (i3 == -1) {
        }
        return i3;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.j = pl6Var;
        vsj mo2track = pl6Var.mo2track(0, 1);
        this.k = mo2track;
        this.l = mo2track;
        pl6Var.endTracks();
    }

    public final int f(nl6 nl6Var) {
        boolean z;
        nl6Var.resetPeekPosition();
        byte[] bArr = this.a;
        nl6Var.peekFully(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw s9e.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw s9e.a(null, sb.toString());
    }

    public final boolean g(nl6 nl6Var) {
        nl6Var.resetPeekPosition();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        nl6Var.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            nl6Var.skipFully(bArr.length);
            return true;
        }
        nl6Var.resetPeekPosition();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        nl6Var.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        nl6Var.skipFully(bArr3.length);
        return true;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        b0h b0hVar = this.m;
        if (!(b0hVar instanceof x0a)) {
            if (j == 0 || !(b0hVar instanceof dl3)) {
                this.i = 0L;
                return;
            } else {
                this.i = (Math.max(0L, j - ((dl3) b0hVar).b) * 8000000) / r7.e;
                return;
            }
        }
        x0a x0aVar = (x0a) b0hVar;
        ojb ojbVar = x0aVar.b;
        long d = ojbVar.b == 0 ? C.TIME_UNSET : ojbVar.d(nik.c(x0aVar.a, j));
        this.i = d;
        if (Math.abs(this.o - d) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
