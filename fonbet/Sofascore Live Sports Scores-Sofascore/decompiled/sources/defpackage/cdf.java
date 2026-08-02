package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cdf implements v6c, ol6, ufb, zfb {
    public static final Map L;
    public static final sm8 M;
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public long F;
    public long G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public final Uri a;
    public final qe4 b;
    public final jc5 c;
    public final k03 d;
    public final bc5 e;
    public final bc5 f;
    public final idf g;
    public final zz0 h;
    public final long i = 1048576;
    public final sx2 j;
    public final l2a k;
    public final r0a l;
    public final rcf m;
    public final rcf n;
    public final Handler o;
    public t6c p;
    public IcyHeaders q;
    public gpg[] r;
    public adf[] s;
    public boolean t;
    public boolean u;
    public boolean v;
    public ujg w;
    public a0h x;
    public long y;
    public boolean z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        L = Collections.unmodifiableMap(hashMap);
        pm8 pm8Var = new pm8();
        pm8Var.a = "icy";
        pm8Var.k = "application/x-icy";
        M = new sm8(pm8Var);
    }

    public cdf(Uri uri, qe4 qe4Var, l2a l2aVar, jc5 jc5Var, bc5 bc5Var, k03 k03Var, bc5 bc5Var2, idf idfVar, zz0 zz0Var) {
        this.a = uri;
        this.b = qe4Var;
        this.c = jc5Var;
        this.f = bc5Var;
        this.d = k03Var;
        this.e = bc5Var2;
        this.g = idfVar;
        this.h = zz0Var;
        sx2 sx2Var = new sx2();
        String concat = "ExoPlayer:Loader:".concat("ProgressiveMediaPeriod");
        int i = lik.a;
        sx2Var.a = Executors.newSingleThreadExecutor(new rh3(concat, 1));
        this.j = sx2Var;
        this.k = l2aVar;
        this.l = new r0a(1);
        this.m = new rcf(this, 0);
        this.n = new rcf(this, 1);
        this.o = lik.j(null);
        this.s = new adf[0];
        this.r = new gpg[0];
        this.G = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.A = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    @Override // defpackage.v6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, c0h c0hVar) {
        i();
        if (!this.x.isSeekable()) {
            return 0L;
        }
        yzg seekPoints = this.x.getSeekPoints(j);
        long j2 = seekPoints.a.a;
        long j3 = seekPoints.b.a;
        long j4 = c0hVar.b;
        long j5 = c0hVar.a;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        int i = lik.a;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j3 : j6;
            }
            return j2;
        }
        if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        }
    }

    @Override // defpackage.ufb
    public final void b(wcf wcfVar) {
        a0h a0hVar;
        if (this.y == C.TIME_UNSET && (a0hVar = this.x) != null) {
            boolean isSeekable = a0hVar.isSeekable();
            long k = k(true);
            long j = k == Long.MIN_VALUE ? 0L : k + Ua.s;
            this.y = j;
            this.g.s(j, isSeekable, this.z);
        }
        Uri uri = wcfVar.b.c;
        kfb kfbVar = new kfb();
        long j2 = wcfVar.i;
        long j3 = this.y;
        bc5 bc5Var = this.e;
        bc5Var.d(kfbVar, new l6c(1, -1, null, bc5Var.a(j2), bc5Var.a(j3)));
        this.J = true;
        t6c t6cVar = this.p;
        t6cVar.getClass();
        t6cVar.b(this);
    }

    @Override // defpackage.v6c
    public final long c(mh6[] mh6VarArr, boolean[] zArr, ipg[] ipgVarArr, boolean[] zArr2, long j) {
        mh6 mh6Var;
        i();
        ujg ujgVar = this.w;
        psj psjVar = (psj) ujgVar.b;
        boolean[] zArr3 = (boolean[]) ujgVar.d;
        int i = this.D;
        for (int i2 = 0; i2 < mh6VarArr.length; i2++) {
            ipg ipgVar = ipgVarArr[i2];
            if (ipgVar != null && (mh6VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((ycf) ipgVar).a;
                qx9.t(zArr3[i3]);
                this.D--;
                zArr3[i3] = false;
                ipgVarArr[i2] = null;
            }
        }
        boolean z = !this.B ? j == 0 : i != 0;
        for (int i4 = 0; i4 < mh6VarArr.length; i4++) {
            if (ipgVarArr[i4] == null && (mh6Var = mh6VarArr[i4]) != null) {
                qx9.t(mh6Var.length() == 1);
                qx9.t(mh6Var.getIndexInTrackGroup(0) == 0);
                int indexOf = psjVar.b.indexOf(mh6Var.getTrackGroup());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                qx9.t(!zArr3[indexOf]);
                this.D++;
                zArr3[indexOf] = true;
                ipgVarArr[i4] = new ycf(this, indexOf);
                zArr2[i4] = true;
                if (!z) {
                    gpg gpgVar = this.r[indexOf];
                    z = (gpgVar.m(j, true) || gpgVar.q + gpgVar.s == 0) ? false : true;
                }
            }
        }
        if (this.D == 0) {
            this.H = false;
            this.C = false;
            sx2 sx2Var = this.j;
            boolean G = sx2Var.G();
            gpg[] gpgVarArr = this.r;
            if (G) {
                for (gpg gpgVar2 : gpgVarArr) {
                    gpgVar2.f();
                }
                wfb wfbVar = (wfb) sx2Var.b;
                qx9.u(wfbVar);
                wfbVar.a(false);
            } else {
                for (gpg gpgVar3 : gpgVarArr) {
                    gpgVar3.l(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            for (int i5 = 0; i5 < ipgVarArr.length; i5++) {
                if (ipgVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.B = true;
        return j;
    }

    @Override // defpackage.z4h
    public final boolean continueLoading(long j) {
        if (this.J) {
            return false;
        }
        sx2 sx2Var = this.j;
        if (((IOException) sx2Var.c) != null || this.H) {
            return false;
        }
        if (this.u && this.D == 0) {
            return false;
        }
        boolean j2 = this.l.j();
        if (sx2Var.G()) {
            return j2;
        }
        q();
        return true;
    }

    @Override // defpackage.ol6
    public final void d(a0h a0hVar) {
        this.o.post(new gjc(19, this, a0hVar));
    }

    @Override // defpackage.v6c
    public final void e(long j) {
        long j2;
        long j3;
        int i;
        i();
        if (l()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.w.d;
        int length = this.r.length;
        int i2 = 0;
        while (i2 < length) {
            gpg gpgVar = this.r[i2];
            boolean z = zArr[i2];
            ei3 ei3Var = gpgVar.a;
            synchronized (gpgVar) {
                try {
                    int i3 = gpgVar.p;
                    j2 = -1;
                    if (i3 != 0) {
                        long[] jArr = gpgVar.n;
                        int i4 = gpgVar.r;
                        if (j >= jArr[i4]) {
                            j3 = j;
                            int g = gpgVar.g(i4, (!z || (i = gpgVar.s) == i3) ? i3 : i + 1, j3, false);
                            if (g != -1) {
                                j2 = gpgVar.e(g);
                            }
                        }
                    }
                    j3 = j;
                } finally {
                }
            }
            ei3Var.b(j2);
            i2++;
            j = j3;
        }
    }

    @Override // defpackage.ol6, defpackage.pl6
    public final void endTracks() {
        this.t = true;
        this.o.post(this.m);
    }

    @Override // defpackage.ufb
    public final void f(wcf wcfVar, boolean z) {
        Uri uri = wcfVar.b.c;
        kfb kfbVar = new kfb();
        long j = wcfVar.i;
        long j2 = this.y;
        bc5 bc5Var = this.e;
        bc5Var.c(kfbVar, new l6c(1, -1, null, bc5Var.a(j), bc5Var.a(j2)));
        if (z) {
            return;
        }
        for (gpg gpgVar : this.r) {
            gpgVar.l(false);
        }
        if (this.D > 0) {
            t6c t6cVar = this.p;
            t6cVar.getClass();
            t6cVar.b(this);
        }
    }

    @Override // defpackage.v6c
    public final void g(t6c t6cVar, long j) {
        this.p = t6cVar;
        this.l.j();
        q();
    }

    @Override // defpackage.z4h
    public final long getBufferedPositionUs() {
        long j;
        boolean z;
        long j2;
        i();
        if (this.J || this.D == 0) {
            return Long.MIN_VALUE;
        }
        if (l()) {
            return this.G;
        }
        if (this.v) {
            int length = this.r.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                ujg ujgVar = this.w;
                if (((boolean[]) ujgVar.c)[i] && ((boolean[]) ujgVar.d)[i]) {
                    gpg gpgVar = this.r[i];
                    synchronized (gpgVar) {
                        z = gpgVar.w;
                    }
                    if (z) {
                        continue;
                    } else {
                        gpg gpgVar2 = this.r[i];
                        synchronized (gpgVar2) {
                            j2 = gpgVar2.v;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = k(false);
        }
        return j == Long.MIN_VALUE ? this.F : j;
    }

    @Override // defpackage.z4h
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // defpackage.v6c
    public final psj getTrackGroups() {
        i();
        return (psj) this.w.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    @Override // defpackage.ufb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r5a h(wcf wcfVar, IOException iOException, int i) {
        long j;
        r5a r5aVar;
        a0h a0hVar;
        Uri uri = wcfVar.b.c;
        kfb kfbVar = new kfb();
        int i2 = lik.a;
        if (!(iOException instanceof r9e) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof li9) && !(iOException instanceof bgb)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof se4) || ((se4) th).a != 2008) {
                }
            }
            j = Math.min((i - 1) * 1000, 5000);
            if (j != C.TIME_UNSET) {
                r5aVar = sx2.g;
            } else {
                int j2 = j();
                int i3 = j2 > this.I ? 1 : 0;
                if (this.E || !((a0hVar = this.x) == null || a0hVar.getDurationUs() == C.TIME_UNSET)) {
                    this.I = j2;
                } else if (!this.u || r()) {
                    this.C = this.u;
                    this.F = 0L;
                    this.I = 0;
                    for (gpg gpgVar : this.r) {
                        gpgVar.l(false);
                    }
                    wcfVar.f.a = 0L;
                    wcfVar.i = 0L;
                    wcfVar.h = true;
                    wcfVar.l = false;
                } else {
                    this.H = true;
                    r5aVar = sx2.f;
                }
                r5aVar = new r5a(j, i3, false);
            }
            int i4 = r5aVar.a;
            boolean z = i4 != 0 || i4 == 1;
            long j3 = wcfVar.i;
            long j4 = this.y;
            bc5 bc5Var = this.e;
            bc5Var.e(kfbVar, new l6c(1, -1, null, bc5Var.a(j3), bc5Var.a(j4)), iOException, !z);
            return r5aVar;
        }
        j = -9223372036854775807L;
        if (j != C.TIME_UNSET) {
        }
        int i42 = r5aVar.a;
        if (i42 != 0) {
        }
        long j32 = wcfVar.i;
        long j42 = this.y;
        bc5 bc5Var2 = this.e;
        bc5Var2.e(kfbVar, new l6c(1, -1, null, bc5Var2.a(j32), bc5Var2.a(j42)), iOException, !z);
        return r5aVar;
    }

    public final void i() {
        qx9.t(this.u);
        this.w.getClass();
        this.x.getClass();
    }

    @Override // defpackage.z4h
    public final boolean isLoading() {
        boolean z;
        if (!this.j.G()) {
            return false;
        }
        r0a r0aVar = this.l;
        synchronized (r0aVar) {
            z = r0aVar.b;
        }
        return z;
    }

    public final int j() {
        int i = 0;
        for (gpg gpgVar : this.r) {
            i += gpgVar.q + gpgVar.p;
        }
        return i;
    }

    public final long k(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.r.length; i++) {
            if (!z) {
                ujg ujgVar = this.w;
                ujgVar.getClass();
                if (!((boolean[]) ujgVar.d)[i]) {
                    continue;
                }
            }
            gpg gpgVar = this.r[i];
            synchronized (gpgVar) {
                j = gpgVar.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final boolean l() {
        return this.G != C.TIME_UNSET;
    }

    public final void m() {
        sm8 sm8Var;
        if (this.K || this.u || !this.t || this.x == null) {
            return;
        }
        gpg[] gpgVarArr = this.r;
        int length = gpgVarArr.length;
        int i = 0;
        while (true) {
            sm8 sm8Var2 = null;
            if (i >= length) {
                this.l.i();
                int length2 = this.r.length;
                nsj[] nsjVarArr = new nsj[length2];
                boolean[] zArr = new boolean[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    gpg gpgVar = this.r[i2];
                    synchronized (gpgVar) {
                        sm8Var = gpgVar.y ? null : gpgVar.z;
                    }
                    sm8Var.getClass();
                    String str = sm8Var.l;
                    boolean g = rjc.g(str);
                    boolean z = g || rjc.i(str);
                    zArr[i2] = z;
                    this.v = z | this.v;
                    IcyHeaders icyHeaders = this.q;
                    if (icyHeaders != null) {
                        int i3 = icyHeaders.a;
                        if (g || this.s[i2].b) {
                            Metadata metadata = sm8Var.j;
                            Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders);
                            pm8 a = sm8Var.a();
                            a.i = metadata2;
                            sm8Var = new sm8(a);
                        }
                        if (g && sm8Var.f == -1 && sm8Var.g == -1 && i3 != -1) {
                            pm8 a2 = sm8Var.a();
                            a2.f = i3;
                            sm8Var = new sm8(a2);
                        }
                    }
                    int d = this.c.d(sm8Var);
                    pm8 a3 = sm8Var.a();
                    a3.D = d;
                    nsjVarArr[i2] = new nsj(Integer.toString(i2), new sm8(a3));
                }
                this.w = new ujg(new psj(nsjVarArr), zArr);
                this.u = true;
                t6c t6cVar = this.p;
                t6cVar.getClass();
                t6cVar.d(this);
                return;
            }
            gpg gpgVar2 = gpgVarArr[i];
            synchronized (gpgVar2) {
                if (!gpgVar2.y) {
                    sm8Var2 = gpgVar2.z;
                }
            }
            if (sm8Var2 == null) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.v6c
    public final void maybeThrowPrepareError() {
        int o = this.d.o(this.A);
        sx2 sx2Var = this.j;
        IOException iOException = (IOException) sx2Var.c;
        if (iOException != null) {
            throw iOException;
        }
        wfb wfbVar = (wfb) sx2Var.b;
        if (wfbVar != null) {
            if (o == Integer.MIN_VALUE) {
                o = wfbVar.a;
            }
            IOException iOException2 = wfbVar.d;
            if (iOException2 != null && wfbVar.e > o) {
                throw iOException2;
            }
        }
        if (this.J && !this.u) {
            throw r9e.a("Loading finished before preparation is complete.", null);
        }
    }

    public final void n(int i) {
        i();
        ujg ujgVar = this.w;
        boolean[] zArr = (boolean[]) ujgVar.e;
        if (zArr[i]) {
            return;
        }
        sm8 sm8Var = ((psj) ujgVar.b).a(i).d[0];
        int f = rjc.f(sm8Var.l);
        long j = this.F;
        bc5 bc5Var = this.e;
        bc5Var.b(new l6c(1, f, sm8Var, bc5Var.a(j), C.TIME_UNSET));
        zArr[i] = true;
    }

    public final void o(int i) {
        i();
        boolean[] zArr = (boolean[]) this.w.c;
        if (this.H && zArr[i] && !this.r[i].i(false)) {
            this.G = 0L;
            this.H = false;
            this.C = true;
            this.F = 0L;
            this.I = 0;
            for (gpg gpgVar : this.r) {
                gpgVar.l(false);
            }
            t6c t6cVar = this.p;
            t6cVar.getClass();
            t6cVar.b(this);
        }
    }

    public final gpg p(adf adfVar) {
        int length = this.r.length;
        for (int i = 0; i < length; i++) {
            if (adfVar.equals(this.s[i])) {
                return this.r[i];
            }
        }
        gpg gpgVar = new gpg(this.h, this.c, this.f);
        gpgVar.f = this;
        int i2 = length + 1;
        adf[] adfVarArr = (adf[]) Arrays.copyOf(this.s, i2);
        adfVarArr[length] = adfVar;
        int i3 = lik.a;
        this.s = adfVarArr;
        gpg[] gpgVarArr = (gpg[]) Arrays.copyOf(this.r, i2);
        gpgVarArr[length] = gpgVar;
        this.r = gpgVarArr;
        return gpgVar;
    }

    public final void q() {
        wcf wcfVar = new wcf(this, this.a, this.b, this.k, this, this.l);
        if (this.u) {
            qx9.t(l());
            long j = this.y;
            if (j != C.TIME_UNSET && this.G > j) {
                this.J = true;
                this.G = C.TIME_UNSET;
                return;
            }
            a0h a0hVar = this.x;
            a0hVar.getClass();
            long j2 = a0hVar.getSeekPoints(this.G).a.b;
            long j3 = this.G;
            wcfVar.f.a = j2;
            wcfVar.i = j3;
            wcfVar.h = true;
            wcfVar.l = false;
            for (gpg gpgVar : this.r) {
                gpgVar.t = this.G;
            }
            this.G = C.TIME_UNSET;
        }
        this.I = j();
        int o = this.d.o(this.A);
        sx2 sx2Var = this.j;
        sx2Var.getClass();
        Looper myLooper = Looper.myLooper();
        qx9.u(myLooper);
        sx2Var.c = null;
        wfb wfbVar = new wfb(sx2Var, myLooper, wcfVar, this, o, SystemClock.elapsedRealtime());
        qx9.t(((wfb) sx2Var.b) == null);
        sx2Var.b = wfbVar;
        wfbVar.d = null;
        ((ExecutorService) sx2Var.a).execute(wfbVar);
        Uri uri = wcfVar.j.a;
        Map map = Collections.EMPTY_MAP;
        kfb kfbVar = new kfb();
        long j4 = wcfVar.i;
        long j5 = this.y;
        bc5 bc5Var = this.e;
        bc5Var.f(kfbVar, new l6c(1, -1, null, bc5Var.a(j4), bc5Var.a(j5)));
    }

    public final boolean r() {
        return this.C || l();
    }

    @Override // defpackage.v6c
    public final long readDiscontinuity() {
        if (!this.C) {
            return C.TIME_UNSET;
        }
        if (!this.J && j() <= this.I) {
            return C.TIME_UNSET;
        }
        this.C = false;
        return this.F;
    }

    @Override // defpackage.v6c
    public final long seekToUs(long j) {
        int i;
        i();
        boolean[] zArr = (boolean[]) this.w.c;
        if (!this.x.isSeekable()) {
            j = 0;
        }
        this.C = false;
        this.F = j;
        if (l()) {
            this.G = j;
            return j;
        }
        if (this.A != 7) {
            int length = this.r.length;
            for (0; i < length; i + 1) {
                i = (this.r[i].m(j, false) || (!zArr[i] && this.v)) ? i + 1 : 0;
            }
            return j;
        }
        this.H = false;
        this.G = j;
        this.J = false;
        sx2 sx2Var = this.j;
        if (!sx2Var.G()) {
            sx2Var.c = null;
            for (gpg gpgVar : this.r) {
                gpgVar.l(false);
            }
            return j;
        }
        for (gpg gpgVar2 : this.r) {
            gpgVar2.f();
        }
        wfb wfbVar = (wfb) sx2Var.b;
        qx9.u(wfbVar);
        wfbVar.a(false);
        return j;
    }

    @Override // defpackage.ol6
    public final usj track(int i, int i2) {
        return p(new adf(i, false));
    }

    @Override // defpackage.z4h
    public final void reevaluateBuffer(long j) {
    }
}
