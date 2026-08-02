package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pwh implements m80 {
    public final ycj a;
    public final long b;
    public final wg8 c;
    public final rg8 d;
    public final sg8 e;
    public final tf8 f;
    public final String g;
    public final long h;
    public final sn1 i;
    public final zcj j;
    public final eib k;
    public final long l;
    public final v8j m;
    public final qah n;
    public final mje o;
    public final ja5 p;

    public pwh(long j, long j2, wg8 wg8Var, rg8 rg8Var, sg8 sg8Var, tf8 tf8Var, String str, long j3, sn1 sn1Var, zcj zcjVar, eib eibVar, long j4, v8j v8jVar, qah qahVar, int i) {
        this((i & 1) != 0 ? r13.i : j, (i & 2) != 0 ? lfj.c : j2, (i & 4) != 0 ? null : wg8Var, (i & 8) != 0 ? null : rg8Var, (i & 16) != 0 ? null : sg8Var, (i & 32) != 0 ? null : tf8Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? lfj.c : j3, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : sn1Var, (i & 512) != 0 ? null : zcjVar, (i & 1024) != 0 ? null : eibVar, (i & a.o) != 0 ? r13.i : j4, (i & 4096) != 0 ? null : v8jVar, (i & 8192) != 0 ? null : qahVar, (mje) null);
    }

    public static pwh a(pwh pwhVar, long j, int i) {
        long b = pwhVar.a.b();
        long j2 = (i & 2) != 0 ? pwhVar.b : j;
        wg8 wg8Var = pwhVar.c;
        rg8 rg8Var = pwhVar.d;
        sg8 sg8Var = pwhVar.e;
        tf8 tf8Var = (i & 32) != 0 ? pwhVar.f : null;
        String str = pwhVar.g;
        long j3 = pwhVar.h;
        sn1 sn1Var = pwhVar.i;
        zcj zcjVar = pwhVar.j;
        eib eibVar = pwhVar.k;
        long j4 = pwhVar.l;
        v8j v8jVar = pwhVar.m;
        qah qahVar = pwhVar.n;
        mje mjeVar = pwhVar.o;
        ja5 ja5Var = pwhVar.p;
        ycj ycjVar = pwhVar.a;
        long b2 = ycjVar.b();
        int i2 = r13.j;
        if (!e8k.a(b, b2)) {
            ycjVar = b != 16 ? new n23(b) : xcj.a;
        }
        return new pwh(ycjVar, j2, wg8Var, rg8Var, sg8Var, tf8Var, str, j3, sn1Var, zcjVar, eibVar, j4, v8jVar, qahVar, mjeVar, ja5Var);
    }

    public final boolean b(pwh pwhVar) {
        if (this == pwhVar) {
            return true;
        }
        if (!lfj.a(this.b, pwhVar.b) || !Intrinsics.c(this.c, pwhVar.c) || !Intrinsics.c(this.d, pwhVar.d) || !Intrinsics.c(this.e, pwhVar.e) || !Intrinsics.c(this.f, pwhVar.f) || !Intrinsics.c(this.g, pwhVar.g) || !lfj.a(this.h, pwhVar.h) || !Intrinsics.c(this.i, pwhVar.i) || !Intrinsics.c(this.j, pwhVar.j) || !Intrinsics.c(this.k, pwhVar.k)) {
            return false;
        }
        long j = pwhVar.l;
        int i = r13.j;
        return e8k.a(this.l, j) && Intrinsics.c(this.o, pwhVar.o);
    }

    public final boolean c(pwh pwhVar) {
        return Intrinsics.c(this.a, pwhVar.a) && Intrinsics.c(this.m, pwhVar.m) && Intrinsics.c(this.n, pwhVar.n) && Intrinsics.c(this.p, pwhVar.p);
    }

    public final pwh d(pwh pwhVar) {
        if (pwhVar == null) {
            return this;
        }
        ycj ycjVar = pwhVar.a;
        return qwh.a(this, ycjVar.b(), ycjVar.c(), ycjVar.a(), pwhVar.b, pwhVar.c, pwhVar.d, pwhVar.e, pwhVar.f, pwhVar.g, pwhVar.h, pwhVar.i, pwhVar.j, pwhVar.k, pwhVar.l, pwhVar.m, pwhVar.n, pwhVar.o, pwhVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwh)) {
            return false;
        }
        pwh pwhVar = (pwh) obj;
        return b(pwhVar) && c(pwhVar);
    }

    public final int hashCode() {
        ycj ycjVar = this.a;
        long b = ycjVar.b();
        int i = r13.j;
        d8k d8kVar = e8k.b;
        int hashCode = Long.hashCode(b) * 31;
        n52 c = ycjVar.c();
        int hashCode2 = (Float.hashCode(ycjVar.a()) + ((hashCode + (c != null ? c.hashCode() : 0)) * 31)) * 31;
        mfj[] mfjVarArr = lfj.b;
        int c2 = ljg.c(hashCode2, 31, this.b);
        wg8 wg8Var = this.c;
        int i2 = (c2 + (wg8Var != null ? wg8Var.a : 0)) * 31;
        rg8 rg8Var = this.d;
        int hashCode3 = (i2 + (rg8Var != null ? Integer.hashCode(rg8Var.a) : 0)) * 31;
        sg8 sg8Var = this.e;
        int hashCode4 = (hashCode3 + (sg8Var != null ? Integer.hashCode(sg8Var.a) : 0)) * 31;
        tf8 tf8Var = this.f;
        int hashCode5 = (hashCode4 + (tf8Var != null ? tf8Var.hashCode() : 0)) * 31;
        String str = this.g;
        int c3 = ljg.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        sn1 sn1Var = this.i;
        int hashCode6 = (c3 + (sn1Var != null ? Float.hashCode(sn1Var.a) : 0)) * 31;
        zcj zcjVar = this.j;
        int hashCode7 = (hashCode6 + (zcjVar != null ? zcjVar.hashCode() : 0)) * 31;
        eib eibVar = this.k;
        int c4 = ljg.c((hashCode7 + (eibVar != null ? eibVar.a.hashCode() : 0)) * 31, 31, this.l);
        v8j v8jVar = this.m;
        int i3 = (c4 + (v8jVar != null ? v8jVar.a : 0)) * 31;
        qah qahVar = this.n;
        int hashCode8 = (i3 + (qahVar != null ? qahVar.hashCode() : 0)) * 31;
        mje mjeVar = this.o;
        int hashCode9 = (hashCode8 + (mjeVar != null ? mjeVar.hashCode() : 0)) * 31;
        ja5 ja5Var = this.p;
        return hashCode9 + (ja5Var != null ? ja5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        ycj ycjVar = this.a;
        sb.append((Object) r13.i(ycjVar.b()));
        sb.append(", brush=");
        sb.append(ycjVar.c());
        sb.append(", alpha=");
        sb.append(ycjVar.a());
        sb.append(", fontSize=");
        sb.append((Object) lfj.e(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) lfj.e(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        vxd.q(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public pwh(ycj ycjVar, long j, wg8 wg8Var, rg8 rg8Var, sg8 sg8Var, tf8 tf8Var, String str, long j2, sn1 sn1Var, zcj zcjVar, eib eibVar, long j3, v8j v8jVar, qah qahVar, mje mjeVar, ja5 ja5Var) {
        this.a = ycjVar;
        this.b = j;
        this.c = wg8Var;
        this.d = rg8Var;
        this.e = sg8Var;
        this.f = tf8Var;
        this.g = str;
        this.h = j2;
        this.i = sn1Var;
        this.j = zcjVar;
        this.k = eibVar;
        this.l = j3;
        this.m = v8jVar;
        this.n = qahVar;
        this.o = mjeVar;
        this.p = ja5Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pwh(long j, long j2, wg8 wg8Var, rg8 rg8Var, sg8 sg8Var, tf8 tf8Var, String str, long j3, sn1 sn1Var, zcj zcjVar, eib eibVar, long j4, v8j v8jVar, qah qahVar, mje mjeVar) {
        this(r2, j2, wg8Var, rg8Var, sg8Var, tf8Var, str, j3, sn1Var, zcjVar, eibVar, j4, v8jVar, qahVar, mjeVar, null);
        ycj ycjVar;
        if (j != 16) {
            ycjVar = new n23(j);
        } else {
            ycjVar = xcj.a;
        }
    }
}
