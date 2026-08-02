package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.b;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ddf implements w6c, pl6, vfb, agb, fpg {
    public static final Map S;
    public static final b T;
    public boolean A;
    public g7h B;
    public b0h C;
    public long D;
    public boolean E;
    public int F;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public long M;
    public long N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public final Uri a;
    public final re4 b;
    public final kc5 c;
    public final it7 d;
    public final b10 e;
    public final cc5 f;
    public final jdf g;
    public final l2a h;
    public final String i;
    public final b k;
    public final long l;
    public final x6k m;
    public final hcc n;
    public final yh3 o;
    public final scf p;
    public final scf q;
    public final Handler r;
    public u6c s;
    public sq9 t;
    public vcf[] u;
    public hpg[] v;
    public bdf[] w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final long j = 1048576;
    public final long G = Long.MIN_VALUE;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        S = Collections.unmodifiableMap(hashMap);
        qm8 qm8Var = new qm8();
        qm8Var.a = "icy";
        qm8Var.n = sjc.p("application/x-icy");
        T = new b(qm8Var);
    }

    public ddf(Uri uri, re4 re4Var, hcc hccVar, kc5 kc5Var, cc5 cc5Var, it7 it7Var, b10 b10Var, jdf jdfVar, l2a l2aVar, String str, b bVar, long j, irb irbVar) {
        this.a = uri;
        this.b = re4Var;
        this.c = kc5Var;
        this.f = cc5Var;
        this.d = it7Var;
        this.e = b10Var;
        this.g = jdfVar;
        this.h = l2aVar;
        this.i = str;
        this.k = bVar;
        this.m = irbVar != null ? new x6k(irbVar, 1) : new x6k("ProgressiveMediaPeriod");
        this.n = hccVar;
        this.l = j;
        this.o = new yh3(0);
        this.p = new scf(this, 1);
        this.q = new scf(this, 2);
        this.r = nik.q(null);
        this.w = new bdf[0];
        this.v = new hpg[0];
        this.u = new vcf[0];
        this.N = C.TIME_UNSET;
        this.F = 1;
    }

    @Override // defpackage.w6c
    public final long a(nh6[] nh6VarArr, boolean[] zArr, jpg[] jpgVarArr, boolean[] zArr2, long j) {
        nh6 nh6Var;
        h();
        g7h g7hVar = this.B;
        qsj qsjVar = (qsj) g7hVar.b;
        boolean[] zArr3 = (boolean[]) g7hVar.d;
        int i = this.K;
        int i2 = 0;
        for (int i3 = 0; i3 < nh6VarArr.length; i3++) {
            jpg jpgVar = jpgVarArr[i3];
            if (jpgVar != null && (nh6VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((zcf) jpgVar).a;
                z1a.E(zArr3[i4]);
                this.K--;
                zArr3[i4] = false;
                jpgVarArr[i3] = null;
            }
        }
        boolean z = !this.H ? j == 0 || this.A : i != 0;
        for (int i5 = 0; i5 < nh6VarArr.length; i5++) {
            if (jpgVarArr[i5] == null && (nh6Var = nh6VarArr[i5]) != null) {
                z1a.E(nh6Var.length() == 1);
                z1a.E(nh6Var.getIndexInTrackGroup(0) == 0);
                int b = qsjVar.b(nh6Var.getTrackGroup());
                z1a.E(!zArr3[b]);
                this.K++;
                zArr3[b] = true;
                this.J = nh6Var.getSelectedFormat().u | this.J;
                jpgVarArr[i5] = new zcf(this, b);
                zArr2[i5] = true;
                if (!z) {
                    hpg hpgVar = this.v[b];
                    z = (hpgVar.u() == 0 || hpgVar.H(j, true)) ? false : true;
                }
            }
        }
        if (this.K == 0) {
            this.O = false;
            this.I = false;
            this.J = false;
            x6k x6kVar = this.m;
            if (x6kVar.l()) {
                hpg[] hpgVarArr = this.v;
                int length = hpgVarArr.length;
                while (i2 < length) {
                    hpgVarArr[i2].k();
                    i2++;
                }
                x6kVar.a();
            } else {
                this.Q = false;
                for (hpg hpgVar2 : this.v) {
                    hpgVar2.F(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < jpgVarArr.length) {
                if (jpgVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.H = true;
        return j;
    }

    @Override // defpackage.vfb
    public final void b(yfb yfbVar, long j, long j2, boolean z) {
        xcf xcfVar = (xcf) yfbVar;
        tei teiVar = xcfVar.b;
        this.e.u(new lfb(xcfVar.j, teiVar.c, teiVar.d, j, j2, teiVar.b), 1, -1, null, 0, null, xcfVar.i, this.D);
        if (z) {
            return;
        }
        for (hpg hpgVar : this.v) {
            hpgVar.F(false);
        }
        if (this.K > 0) {
            u6c u6cVar = this.s;
            u6cVar.getClass();
            u6cVar.b(this);
        }
    }

    @Override // defpackage.w6c
    public final long c(long j, d0h d0hVar) {
        h();
        if (!this.C.isSeekable()) {
            return 0L;
        }
        zzg seekPoints = this.C.getSeekPoints(j);
        return d0hVar.a(j, seekPoints.a.a, seekPoints.b.a);
    }

    @Override // defpackage.vfb
    public final void d(yfb yfbVar, long j, long j2) {
        xcf xcfVar = (xcf) yfbVar;
        if (this.D == C.TIME_UNSET && this.C != null) {
            long j3 = j(true);
            long j4 = j3 == Long.MIN_VALUE ? 0L : j3 + Ua.s;
            this.D = j4;
            this.g.t(j4, this.C, this.E);
        }
        tei teiVar = xcfVar.b;
        this.e.v(new lfb(xcfVar.j, teiVar.c, teiVar.d, j, j2, teiVar.b), 1, -1, null, 0, null, xcfVar.i, this.D);
        this.Q = true;
        u6c u6cVar = this.s;
        u6cVar.getClass();
        u6cVar.b(this);
    }

    @Override // defpackage.w6c
    public final void discardBuffer(long j, boolean z) {
        if (this.A) {
            return;
        }
        h();
        if (k()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.B.d;
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            this.v[i].j(j, z, zArr[i]);
        }
    }

    @Override // defpackage.fpg
    public final void e() {
        this.r.post(this.p);
    }

    @Override // defpackage.pl6
    public final void endTracks() {
        this.x = true;
        this.r.post(this.p);
    }

    @Override // defpackage.w6c
    public final void f(u6c u6cVar, long j) {
        this.s = u6cVar;
        b bVar = this.k;
        if (bVar == null) {
            this.o.c();
            t();
        } else {
            mo2track(0, 3).d(bVar);
            s(new x0a(new long[]{0}, new long[]{0}, C.TIME_UNSET));
            endTracks();
            this.N = j;
        }
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        if (this.Q) {
            return false;
        }
        x6k x6kVar = this.m;
        if (x6kVar.c() || this.O) {
            return false;
        }
        if ((this.y || this.k != null) && this.K == 0) {
            return false;
        }
        boolean c = this.o.c();
        if (x6kVar.l()) {
            return c;
        }
        t();
        return true;
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        long j;
        boolean z;
        h();
        if (this.Q || this.K == 0) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.N;
        }
        if (this.z) {
            int length = this.v.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                g7h g7hVar = this.B;
                if (((boolean[]) g7hVar.c)[i] && ((boolean[]) g7hVar.d)[i]) {
                    hpg hpgVar = this.v[i];
                    synchronized (hpgVar) {
                        z = hpgVar.y;
                    }
                    if (!z) {
                        j = Math.min(j, this.v[i].r());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        return j == Long.MIN_VALUE ? this.M : j;
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // defpackage.w6c
    public final qsj getTrackGroups() {
        h();
        return (qsj) this.B.b;
    }

    public final void h() {
        z1a.E(this.y);
        this.B.getClass();
        this.C.getClass();
    }

    public final int i() {
        int i = 0;
        for (hpg hpgVar : this.v) {
            i += hpgVar.q + hpgVar.p;
        }
        return i;
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        boolean z;
        if (this.Q || !this.m.l()) {
            return false;
        }
        yh3 yh3Var = this.o;
        synchronized (yh3Var) {
            z = yh3Var.b;
        }
        return z;
    }

    public final long j(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (i < this.v.length) {
            if (!z) {
                g7h g7hVar = this.B;
                g7hVar.getClass();
                i = ((boolean[]) g7hVar.d)[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.v[i].r());
        }
        return j;
    }

    public final boolean k() {
        return this.N != C.TIME_UNSET;
    }

    @Override // defpackage.vfb
    public final void l(yfb yfbVar, long j, long j2, int i) {
        xcf xcfVar = (xcf) yfbVar;
        tei teiVar = xcfVar.b;
        this.e.y(i == 0 ? new lfb(xcfVar.j, j) : new lfb(xcfVar.j, teiVar.c, teiVar.d, j, j2, teiVar.b), 1, -1, null, 0, null, xcfVar.i, this.D, i);
    }

    @Override // defpackage.pl6
    public final void m(b0h b0hVar) {
        this.r.post(new gjc(20, this, b0hVar));
    }

    @Override // defpackage.w6c
    public final void maybeThrowPrepareError() {
        int n = this.d.n(this.F);
        x6k x6kVar = this.m;
        IOException iOException = (IOException) x6kVar.d;
        if (iOException != null) {
            throw iOException;
        }
        xfb xfbVar = (xfb) x6kVar.c;
        if (xfbVar != null) {
            if (n == Integer.MIN_VALUE) {
                n = xfbVar.a;
            }
            IOException iOException2 = xfbVar.e;
            if (iOException2 != null && xfbVar.f > n) {
                throw iOException2;
            }
        }
        if (this.Q && !this.y) {
            throw s9e.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final void n() {
        ric a;
        long j = this.l;
        if (this.R || this.y || !this.x || this.C == null) {
            return;
        }
        boolean z = false;
        for (hpg hpgVar : this.v) {
            if (hpgVar.x() == null) {
                return;
            }
        }
        yh3 yh3Var = this.o;
        synchronized (yh3Var) {
            yh3Var.b = false;
        }
        int length = this.v.length;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c = 1;
            if (i2 >= length) {
                break;
            }
            b x = this.v[i2].x();
            x.getClass();
            int i4 = sjc.i(x.o);
            char c2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i == 1) {
                c = 3;
            } else if (i == 2) {
                c = 4;
            } else if (i != 3) {
                c = i != 4 ? (char) 0 : (char) 2;
            }
            if (c2 > c) {
                i3 = i2;
                i = i4;
            }
            i2++;
        }
        osj[] osjVarArr = new osj[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        while (i5 < length) {
            b x2 = this.v[i5].x();
            x2.getClass();
            String str = x2.o;
            boolean k = sjc.k(str);
            boolean z2 = (k || sjc.o(str)) ? true : z;
            zArr[i5] = z2;
            boolean z3 = z;
            this.z |= z2;
            this.A = (j != C.TIME_UNSET && length == 1 && sjc.m(str)) ? true : z3 ? 1 : 0;
            sq9 sq9Var = this.t;
            if (sq9Var != null) {
                int i6 = sq9Var.a;
                if (k || this.w[i5].b) {
                    ric ricVar = x2.l;
                    if (ricVar == null) {
                        lic[] licVarArr = new lic[1];
                        licVarArr[z3 ? 1 : 0] = sq9Var;
                        a = new ric(licVarArr);
                    } else {
                        lic[] licVarArr2 = new lic[1];
                        licVarArr2[z3 ? 1 : 0] = sq9Var;
                        a = ricVar.a(licVarArr2);
                    }
                    qm8 a2 = x2.a();
                    a2.k = a;
                    x2 = new b(a2);
                }
                if (k && x2.h == -1 && x2.i == -1 && i6 != -1) {
                    qm8 a3 = x2.a();
                    a3.h = i6;
                    x2 = new b(a3);
                }
            }
            int e = this.c.e(x2);
            qm8 a4 = x2.a();
            a4.O = e;
            b bVar = new b(a4);
            if (i5 != i3) {
                qm8 a5 = bVar.a();
                a5.l = Integer.toString(i3);
                bVar = new b(a5);
            }
            osjVarArr[i5] = new osj(Integer.toString(i5), bVar);
            this.J = bVar.u | this.J;
            this.v[i5].I(this.G);
            i5++;
            z = z3 ? 1 : 0;
        }
        this.B = new g7h(new qsj(osjVarArr), zArr);
        if (this.A && this.D == C.TIME_UNSET) {
            this.D = j;
            this.C = new tcf(this, this.C);
        }
        this.g.t(this.D, this.C, this.E);
        this.y = true;
        u6c u6cVar = this.s;
        u6cVar.getClass();
        u6cVar.d(this);
    }

    public final void o(int i) {
        h();
        g7h g7hVar = this.B;
        boolean[] zArr = (boolean[]) g7hVar.e;
        if (zArr[i]) {
            return;
        }
        b bVar = ((qsj) g7hVar.b).a(i).d[0];
        this.e.i(sjc.i(bVar.o), bVar, 0, null, this.M);
        zArr[i] = true;
    }

    @Override // defpackage.agb
    public final void onLoaderReleased() {
        for (hpg hpgVar : this.v) {
            hpgVar.F(true);
            xb5 xb5Var = hpgVar.h;
            if (xb5Var != null) {
                xb5Var.d(hpgVar.e);
                hpgVar.h = null;
                hpgVar.g = null;
            }
        }
        hcc hccVar = this.n;
        ll6 ll6Var = (ll6) hccVar.c;
        if (ll6Var != null) {
            ll6Var.release();
            hccVar.c = null;
        }
        hccVar.d = null;
    }

    public final void p(int i) {
        h();
        if (this.O) {
            if ((!this.z || ((boolean[]) this.B.c)[i]) && !this.v[i].z(false)) {
                this.N = 0L;
                this.O = false;
                this.I = true;
                this.M = 0L;
                this.P = 0;
                for (hpg hpgVar : this.v) {
                    hpgVar.F(false);
                }
                u6c u6cVar = this.s;
                u6cVar.getClass();
                u6cVar.b(this);
            }
        }
    }

    public final vsj q(bdf bdfVar) {
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            if (bdfVar.equals(this.w[i])) {
                return this.v[i];
            }
        }
        if (this.x) {
            tgj.d0("Extractor added new track (id=" + bdfVar.a + ") after finishing tracks.");
            return new q35();
        }
        hpg hpgVar = new hpg(this.h, this.c, this.f);
        vcf vcfVar = new vcf(hpgVar);
        hpgVar.f = this;
        int i2 = length + 1;
        bdf[] bdfVarArr = (bdf[]) Arrays.copyOf(this.w, i2);
        bdfVarArr[length] = bdfVar;
        String str = nik.a;
        this.w = bdfVarArr;
        hpg[] hpgVarArr = (hpg[]) Arrays.copyOf(this.v, i2);
        hpgVarArr[length] = hpgVar;
        this.v = hpgVarArr;
        vcf[] vcfVarArr = (vcf[]) Arrays.copyOf(this.u, i2);
        vcfVarArr[length] = vcfVar;
        this.u = vcfVarArr;
        return vcfVar;
    }

    @Override // defpackage.vfb
    public final r5a r(yfb yfbVar, long j, long j2, IOException iOException, int i) {
        long min;
        r5a r5aVar;
        b0h b0hVar;
        xcf xcfVar = (xcf) yfbVar;
        tei teiVar = xcfVar.b;
        lfb lfbVar = new lfb(xcfVar.j, teiVar.c, teiVar.d, j, j2, teiVar.b);
        String str = nik.a;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof s9e) || (th instanceof FileNotFoundException) || (th instanceof mi9) || (th instanceof cgb) || ((th instanceof te4) && ((te4) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == C.TIME_UNSET) {
            r5aVar = x6k.g;
        } else {
            int i2 = i();
            int i3 = i2 > this.P ? 1 : 0;
            if (this.L || !((b0hVar = this.C) == null || b0hVar.getDurationUs() == C.TIME_UNSET)) {
                this.P = i2;
            } else if (!this.y || u()) {
                this.I = this.y;
                this.M = 0L;
                this.P = 0;
                for (hpg hpgVar : this.v) {
                    hpgVar.F(false);
                }
                xcfVar.f.a = 0L;
                xcfVar.i = 0L;
                xcfVar.h = true;
                xcfVar.l = false;
            } else {
                this.O = true;
                r5aVar = x6k.f;
            }
            r5aVar = new r5a(min, i3, false);
        }
        this.e.w(lfbVar, 1, -1, null, 0, null, xcfVar.i, this.D, iOException, !r5aVar.b());
        return r5aVar;
    }

    @Override // defpackage.w6c
    public final long readDiscontinuity() {
        if (this.J) {
            this.J = false;
            return this.M;
        }
        if (!this.I) {
            return C.TIME_UNSET;
        }
        if (!this.Q && i() <= this.P) {
            return C.TIME_UNSET;
        }
        this.I = false;
        return this.M;
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        if (this.K <= 0 || k()) {
            return;
        }
        int i = 0;
        if (this.G != Long.MIN_VALUE) {
            h();
            int i2 = 1;
            while (true) {
                hpg[] hpgVarArr = this.v;
                if (i >= hpgVarArr.length) {
                    break;
                }
                g7h g7hVar = this.B;
                if (((boolean[]) g7hVar.d)[i] && (((boolean[]) g7hVar.c)[i] || !this.z)) {
                    i2 &= hpgVarArr[i].y() ? 1 : 0;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            this.Q = true;
        }
    }

    public final void s(b0h b0hVar) {
        this.C = this.t == null ? b0hVar : new bw0(C.TIME_UNSET);
        this.D = b0hVar.getDurationUs();
        boolean z = !this.L && b0hVar.getDurationUs() == C.TIME_UNSET;
        this.E = z;
        this.F = z ? 7 : 1;
        if (this.y) {
            this.g.t(this.D, b0hVar, z);
        } else {
            n();
        }
    }

    @Override // defpackage.w6c
    public final long seekToUs(long j) {
        h();
        boolean[] zArr = (boolean[]) this.B.c;
        if (!this.C.isSeekable()) {
            j = 0;
        }
        this.I = false;
        boolean z = this.M == j;
        this.M = j;
        if (k()) {
            this.N = j;
            return j;
        }
        int i = this.F;
        x6k x6kVar = this.m;
        if (i != 7 && (this.Q || x6kVar.l())) {
            int length = this.v.length;
            for (int i2 = 0; i2 < length; i2++) {
                hpg hpgVar = this.v[i2];
                if (this.u[i2].d.get() == ucf.a && (hpgVar.u() != 0 || !z)) {
                    if (this.A ? hpgVar.G(hpgVar.q) : hpgVar.H(j, this.Q)) {
                        continue;
                    } else if (!zArr[i2] && this.z) {
                    }
                }
            }
            return j;
        }
        this.O = false;
        this.N = j;
        this.Q = false;
        this.J = false;
        if (x6kVar.l()) {
            for (hpg hpgVar2 : this.v) {
                hpgVar2.k();
            }
            x6kVar.a();
            return j;
        }
        x6kVar.d = null;
        for (hpg hpgVar3 : this.v) {
            hpgVar3.F(false);
        }
        return j;
    }

    public final void t() {
        xcf xcfVar = new xcf(this, this.a, this.b, this.n, this, this.o);
        if (this.y) {
            z1a.E(k());
            long j = this.G;
            if (j == Long.MIN_VALUE) {
                j = this.D;
            }
            if (j != C.TIME_UNSET && this.N > j) {
                this.Q = true;
                this.N = C.TIME_UNSET;
                return;
            }
            b0h b0hVar = this.C;
            b0hVar.getClass();
            long j2 = b0hVar.getSeekPoints(this.N).a.b;
            long j3 = this.N;
            xcfVar.f.a = j2;
            xcfVar.i = j3;
            xcfVar.h = true;
            xcfVar.l = false;
            for (hpg hpgVar : this.v) {
                hpgVar.t = this.N;
            }
            this.N = C.TIME_UNSET;
        }
        this.P = i();
        this.m.y(xcfVar, this, this.d.n(this.F));
    }

    @Override // defpackage.pl6
    /* renamed from: track */
    public final vsj mo2track(int i, int i2) {
        return q(new bdf(i, false));
    }

    public final boolean u() {
        return this.I || k();
    }
}
