package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dfj {
    public static final dfj d = new dfj(0, 0, null, null, 0, 0, 0, 0, 16777215);
    public final pwh a;
    public final g8e b;
    public final tje c;

    public dfj(long j, long j2, wg8 wg8Var, tf8 tf8Var, long j3, int i, int i2, long j4, int i3) {
        this(new pwh((i3 & 1) != 0 ? r13.i : j, (i3 & 2) != 0 ? lfj.c : j2, (i3 & 4) != 0 ? null : wg8Var, (rg8) null, (sg8) null, (i3 & 32) != 0 ? null : tf8Var, (String) null, (i3 & 128) != 0 ? lfj.c : j3, (sn1) null, (zcj) null, (eib) null, r13.i, (v8j) null, (qah) null, (mje) null), new g8e((32768 & i3) != 0 ? 0 : i, (65536 & i3) == 0 ? i2 : 0, (i3 & 131072) != 0 ? lfj.c : j4, null, null, null, 0, 0, null), null);
    }

    public static dfj a(dfj dfjVar, long j, long j2, wg8 wg8Var, tf8 tf8Var, long j3, v8j v8jVar, int i, int i2, long j4, tje tjeVar, r7b r7bVar, int i3, int i4) {
        qah qahVar;
        ja5 ja5Var;
        long j5;
        long b = (i4 & 1) != 0 ? dfjVar.a.a.b() : j;
        long j6 = (i4 & 2) != 0 ? dfjVar.a.b : j2;
        wg8 wg8Var2 = (i4 & 4) != 0 ? dfjVar.a.c : wg8Var;
        pwh pwhVar = dfjVar.a;
        rg8 rg8Var = pwhVar.d;
        sg8 sg8Var = pwhVar.e;
        tf8 tf8Var2 = (i4 & 32) != 0 ? pwhVar.f : tf8Var;
        String str = pwhVar.g;
        long j7 = (i4 & 128) != 0 ? pwhVar.h : j3;
        sn1 sn1Var = pwhVar.i;
        zcj zcjVar = pwhVar.j;
        eib eibVar = pwhVar.k;
        long j8 = pwhVar.l;
        v8j v8jVar2 = (i4 & 4096) != 0 ? pwhVar.m : v8jVar;
        qah qahVar2 = pwhVar.n;
        ja5 ja5Var2 = pwhVar.p;
        int i5 = (i4 & 32768) != 0 ? dfjVar.b.a : i;
        int i6 = (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? dfjVar.b.b : i2;
        if ((i4 & 131072) != 0) {
            qahVar = qahVar2;
            ja5Var = ja5Var2;
            j5 = dfjVar.b.c;
        } else {
            qahVar = qahVar2;
            ja5Var = ja5Var2;
            j5 = j4;
        }
        g8e g8eVar = dfjVar.b;
        bdj bdjVar = g8eVar.d;
        tje tjeVar2 = (i4 & 524288) != 0 ? dfjVar.c : tjeVar;
        r7b r7bVar2 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? g8eVar.f : r7bVar;
        int i7 = (i4 & 2097152) != 0 ? g8eVar.g : i3;
        int i8 = (i4 & 4194304) != 0 ? g8eVar.h : 2;
        lej lejVar = g8eVar.i;
        long b2 = pwhVar.a.b();
        int i9 = r13.j;
        return new dfj(new pwh(e8k.a(b, b2) ? pwhVar.a : b != 16 ? new n23(b) : xcj.a, j6, wg8Var2, rg8Var, sg8Var, tf8Var2, str, j7, sn1Var, zcjVar, eibVar, j8, v8jVar2, qahVar, tjeVar2 != null ? tjeVar2.a : null, ja5Var), new g8e(i5, i6, j5, bdjVar, tjeVar2 != null ? tjeVar2.b : null, r7bVar2, i7, i8, lejVar), tjeVar2);
    }

    public static dfj f(dfj dfjVar, long j, long j2, wg8 wg8Var, tf8 tf8Var, long j3, v8j v8jVar, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? r13.i : j;
        long j6 = (i2 & 2) != 0 ? lfj.c : j2;
        wg8 wg8Var2 = (i2 & 4) != 0 ? null : wg8Var;
        tf8 tf8Var2 = (i2 & 32) != 0 ? null : tf8Var;
        long j7 = (i2 & 128) != 0 ? lfj.c : j3;
        long j8 = r13.i;
        v8j v8jVar2 = (i2 & 4096) != 0 ? null : v8jVar;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (i2 & 131072) != 0 ? lfj.c : j4;
        pwh a = qwh.a(dfjVar.a, j5, null, Float.NaN, j6, wg8Var2, null, null, tf8Var2, null, j7, null, null, null, j8, v8jVar2, null, null, null);
        g8e a2 = h8e.a(dfjVar.b, i3, 0, j9, null, null, null, 0, 0, null);
        return (dfjVar.a == a && dfjVar.b == a2) ? dfjVar : new dfj(a, a2);
    }

    public final n52 b() {
        return this.a.a.c();
    }

    public final long c() {
        return this.a.a.b();
    }

    public final boolean d(dfj dfjVar) {
        if (this != dfjVar) {
            return Intrinsics.c(this.b, dfjVar.b) && this.a.b(dfjVar.a);
        }
        return true;
    }

    public final dfj e(dfj dfjVar) {
        return (dfjVar == null || dfjVar.equals(d)) ? this : new dfj(this.a.d(dfjVar.a), this.b.a(dfjVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfj)) {
            return false;
        }
        dfj dfjVar = (dfj) obj;
        return Intrinsics.c(this.a, dfjVar.a) && Intrinsics.c(this.b, dfjVar.b) && Intrinsics.c(this.c, dfjVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tje tjeVar = this.c;
        return hashCode + (tjeVar != null ? tjeVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) r13.i(c()));
        sb.append(", brush=");
        sb.append(b());
        sb.append(", alpha=");
        pwh pwhVar = this.a;
        sb.append(pwhVar.a.a());
        sb.append(", fontSize=");
        sb.append((Object) lfj.e(pwhVar.b));
        sb.append(", fontWeight=");
        sb.append(pwhVar.c);
        sb.append(", fontStyle=");
        sb.append(pwhVar.d);
        sb.append(", fontSynthesis=");
        sb.append(pwhVar.e);
        sb.append(", fontFamily=");
        sb.append(pwhVar.f);
        sb.append(", fontFeatureSettings=");
        sb.append(pwhVar.g);
        sb.append(", letterSpacing=");
        sb.append((Object) lfj.e(pwhVar.h));
        sb.append(", baselineShift=");
        sb.append(pwhVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(pwhVar.j);
        sb.append(", localeList=");
        sb.append(pwhVar.k);
        sb.append(", background=");
        vxd.q(pwhVar.l, ", textDecoration=", sb);
        sb.append(pwhVar.m);
        sb.append(", shadow=");
        sb.append(pwhVar.n);
        sb.append(", drawStyle=");
        sb.append(pwhVar.p);
        sb.append(", textAlign=");
        g8e g8eVar = this.b;
        sb.append((Object) p7j.a(g8eVar.a));
        sb.append(", textDirection=");
        sb.append((Object) z8j.a(g8eVar.b));
        sb.append(", lineHeight=");
        sb.append((Object) lfj.e(g8eVar.c));
        sb.append(", textIndent=");
        sb.append(g8eVar.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(g8eVar.f);
        sb.append(", lineBreak=");
        sb.append((Object) l7b.a(g8eVar.g));
        sb.append(", hyphens=");
        sb.append((Object) ql9.a(g8eVar.h));
        sb.append(", textMotion=");
        sb.append(g8eVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dfj(pwh pwhVar, g8e g8eVar) {
        this(pwhVar, g8eVar, (r0 == null && r1 == null) ? null : new tje(r0, r1));
        mje mjeVar = pwhVar.o;
        aje ajeVar = g8eVar.e;
    }

    public dfj(pwh pwhVar, g8e g8eVar, tje tjeVar) {
        this.a = pwhVar;
        this.b = g8eVar;
        this.c = tjeVar;
    }
}
