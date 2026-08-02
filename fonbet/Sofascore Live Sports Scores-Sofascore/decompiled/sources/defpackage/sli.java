package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sli implements ll6 {
    public final zli a;
    public final b b;
    public final ArrayList c;
    public vsj f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = nik.b;
    public final j9e d = new j9e();

    public sli(zli zliVar, b bVar) {
        b bVar2;
        this.a = zliVar;
        if (bVar != null) {
            qm8 a = bVar.a();
            a.n = sjc.p("application/x-media3-cues");
            a.j = bVar.o;
            a.L = zliVar.l();
            bVar2 = new b(a);
        } else {
            bVar2 = null;
        }
        this.b = bVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = nik.c;
        this.j = C.TIME_UNSET;
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r20.g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r2 == (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007b, code lost:
    
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007f, code lost:
    
        if (r4 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0081, code lost:
    
        r2 = new defpackage.yli(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008c, code lost:
    
        r20.a.h(r20.e, 0, r20.g, r2, new defpackage.imf(r20, 18));
        java.util.Collections.sort(r11);
        r20.i = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r2 >= r11.size()) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        r20.i[r2] = ((defpackage.rli) r11.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c4, code lost:
    
        r20.e = defpackage.nik.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
    
        r20.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0089, code lost:
    
        r2 = defpackage.yli.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d2, code lost:
    
        throw defpackage.s9e.a(r0, "SubtitleParser failed.");
     */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        int i;
        int i2 = this.h;
        z1a.E((i2 == 0 || i2 == 5) ? false : true);
        int i3 = this.h;
        if (i3 == 1) {
            int s = nl6Var.getLength() != -1 ? jaa.s(nl6Var.getLength()) : 1024;
            if (s > this.e.length) {
                this.e = new byte[s];
            }
            this.g = 0;
            this.h = 2;
            i3 = 2;
        }
        ArrayList arrayList = this.c;
        if (i3 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                bArr = Arrays.copyOf(bArr, bArr.length + 1024);
                this.e = bArr;
            }
            int i4 = this.g;
            int read = nl6Var.read(bArr, i4, bArr.length - i4);
            if (read != -1) {
                this.g += read;
            }
            long length = nl6Var.getLength();
            if (length != -1) {
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (this.h == 3) {
            if (nl6Var.skip(nl6Var.getLength() != -1 ? jaa.s(nl6Var.getLength()) : 1024) == -1) {
                long j = this.j;
                for (int f = j == C.TIME_UNSET ? i : nik.f(this.i, j, true); f < arrayList.size(); f++) {
                    f((rli) arrayList.get(f));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        z1a.E(this.h == 0);
        vsj mo2track = pl6Var.mo2track(0, 3);
        this.f = mo2track;
        b bVar = this.b;
        if (bVar != null) {
            mo2track.d(bVar);
            pl6Var.endTracks();
            pl6Var.m(new x0a(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        }
        this.h = 1;
    }

    public final void f(rli rliVar) {
        this.f.getClass();
        byte[] bArr = rliVar.b;
        int length = bArr.length;
        int length2 = bArr.length;
        j9e j9eVar = this.d;
        j9eVar.L(bArr, length2);
        this.f.g(length, j9eVar);
        this.f.a(rliVar.a, 1, length, 0, null);
    }

    @Override // defpackage.ll6
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        int i = this.h;
        int i2 = 1;
        z1a.E((i == 0 || i == 5) ? false : true);
        this.j = j2;
        int i3 = this.h;
        if (i3 == 2) {
            this.h = 1;
        } else {
            i2 = i3;
        }
        if (i2 == 4) {
            this.h = 3;
        }
    }
}
