package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.work.OverwritingInputMerger;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lcl {
    public static final yhk z;
    public final String a;
    public sbl b;
    public final String c;
    public final String d;
    public md4 e;
    public final md4 f;
    public long g;
    public long h;
    public long i;
    public zm3 j;
    public final int k;
    public zy0 l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public pwd r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        rik.x("WorkSpec");
        z = new yhk();
    }

    public /* synthetic */ lcl(String str, sbl sblVar, String str2, String str3, md4 md4Var, md4 md4Var2, long j, long j2, long j3, zm3 zm3Var, int i, zy0 zy0Var, long j4, long j5, long j6, long j7, boolean z2, pwd pwdVar, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? sbl.a : sblVar, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? md4.b : md4Var, (i5 & 32) != 0 ? md4.b : md4Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0L : j3, (i5 & 512) != 0 ? zm3.j : zm3Var, (i5 & 1024) != 0 ? 0 : i, (i5 & a.o) != 0 ? zy0.a : zy0Var, (i5 & 4096) != 0 ? CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? pwd.a : pwdVar, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? Boolean.FALSE : bool);
    }

    public static lcl b(lcl lclVar, String str, sbl sblVar, md4 md4Var, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str2 = (i5 & 1) != 0 ? lclVar.a : str;
        sbl sblVar2 = (i5 & 2) != 0 ? lclVar.b : sblVar;
        String str3 = (i5 & 4) != 0 ? lclVar.c : "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
        String str4 = lclVar.d;
        md4 md4Var2 = (i5 & 16) != 0 ? lclVar.e : md4Var;
        md4 md4Var3 = lclVar.f;
        long j3 = lclVar.g;
        long j4 = lclVar.h;
        long j5 = lclVar.i;
        zm3 zm3Var = lclVar.j;
        int i6 = (i5 & 1024) != 0 ? lclVar.k : i;
        zy0 zy0Var = lclVar.l;
        long j6 = lclVar.m;
        long j7 = (i5 & 8192) != 0 ? lclVar.n : j;
        long j8 = lclVar.o;
        long j9 = lclVar.p;
        boolean z2 = lclVar.q;
        pwd pwdVar = lclVar.r;
        int i7 = (i5 & 262144) != 0 ? lclVar.s : i2;
        int i8 = (i5 & 524288) != 0 ? lclVar.t : i3;
        long j10 = (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? lclVar.u : j2;
        int i9 = (i5 & 2097152) != 0 ? lclVar.v : i4;
        int i10 = lclVar.w;
        String str5 = lclVar.x;
        Boolean bool = lclVar.y;
        str2.getClass();
        sblVar2.getClass();
        str3.getClass();
        str4.getClass();
        md4Var2.getClass();
        md4Var3.getClass();
        zm3Var.getClass();
        zy0Var.getClass();
        pwdVar.getClass();
        return new lcl(str2, sblVar2, str3, str4, md4Var2, md4Var3, j3, j4, j5, zm3Var, i6, zy0Var, j6, j7, j8, j9, z2, pwdVar, i7, i8, j10, i9, i10, str5, bool);
    }

    public final long a() {
        return qha.n(this.b == sbl.a && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcl)) {
            return false;
        }
        lcl lclVar = (lcl) obj;
        return Intrinsics.c(this.a, lclVar.a) && this.b == lclVar.b && Intrinsics.c(this.c, lclVar.c) && Intrinsics.c(this.d, lclVar.d) && Intrinsics.c(this.e, lclVar.e) && Intrinsics.c(this.f, lclVar.f) && this.g == lclVar.g && this.h == lclVar.h && this.i == lclVar.i && Intrinsics.c(this.j, lclVar.j) && this.k == lclVar.k && this.l == lclVar.l && this.m == lclVar.m && this.n == lclVar.n && this.o == lclVar.o && this.p == lclVar.p && this.q == lclVar.q && this.r == lclVar.r && this.s == lclVar.s && this.t == lclVar.t && this.u == lclVar.u && this.v == lclVar.v && this.w == lclVar.w && Intrinsics.c(this.x, lclVar.x) && Intrinsics.c(this.y, lclVar.y);
    }

    public final int hashCode() {
        int a = wv8.a(this.w, wv8.a(this.v, ljg.c(wv8.a(this.t, wv8.a(this.s, (this.r.hashCode() + dmi.e(ljg.c(ljg.c(ljg.c(ljg.c((this.l.hashCode() + wv8.a(this.k, (this.j.hashCode() + ljg.c(ljg.c(ljg.c((this.f.hashCode() + ((this.e.hashCode() + dmi.c(dmi.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return lnb.q(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public lcl(String str, sbl sblVar, String str2, String str3, md4 md4Var, md4 md4Var2, long j, long j2, long j3, zm3 zm3Var, int i, zy0 zy0Var, long j4, long j5, long j6, long j7, boolean z2, pwd pwdVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        sblVar.getClass();
        str2.getClass();
        str3.getClass();
        md4Var.getClass();
        md4Var2.getClass();
        zm3Var.getClass();
        zy0Var.getClass();
        pwdVar.getClass();
        this.a = str;
        this.b = sblVar;
        this.c = str2;
        this.d = str3;
        this.e = md4Var;
        this.f = md4Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = zm3Var;
        this.k = i;
        this.l = zy0Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = pwdVar;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
