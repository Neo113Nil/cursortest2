package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Timer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bo4 {
    public final long a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;

    public bo4(long j, Function1 function1, Function0 function0) {
        this.a = j;
        this.c = function1;
        this.d = function0;
        this.e = rcg.a;
        this.f = new Timer();
    }

    public bo4 a(long j, ozf ozfVar) {
        long j2;
        long j3;
        jd4 b = ((ozf) this.d).b();
        jd4 b2 = ozfVar.b();
        Object obj = this.c;
        if (b == null) {
            return new bo4(j, ozfVar, (o71) this.e, (l72) obj, this.b, b);
        }
        if (!b.n()) {
            return new bo4(j, ozfVar, (o71) this.e, (l72) obj, this.b, b2);
        }
        long l = b.l(j);
        if (l == 0) {
            return new bo4(j, ozfVar, (o71) this.e, (l72) obj, this.b, b2);
        }
        b2.getClass();
        long p = b.p();
        long timeUs = b.getTimeUs(p);
        long j4 = l + p;
        long j5 = j4 - 1;
        long e = b.e(j5, j) + b.getTimeUs(j5);
        long p2 = b2.p();
        long timeUs2 = b2.getTimeUs(p2);
        long j6 = this.b;
        if (e == timeUs2) {
            j2 = j4 - p2;
        } else {
            if (e < timeUs2) {
                throw new xt1();
            }
            if (timeUs2 < timeUs) {
                j3 = j6 - (b2.j(timeUs, j) - p);
                return new bo4(j, ozfVar, (o71) this.e, (l72) obj, j3, b2);
            }
            j2 = b.j(timeUs2, j) - p2;
        }
        j3 = j2 + j6;
        return new bo4(j, ozfVar, (o71) this.e, (l72) obj, j3, b2);
    }

    public long b(long j) {
        jd4 jd4Var = (jd4) this.f;
        jd4Var.getClass();
        long j2 = this.a;
        long g = jd4Var.g(j2, j) + this.b;
        jd4Var.getClass();
        return (jd4Var.q(j2, j) + g) - 1;
    }

    public long c() {
        jd4 jd4Var = (jd4) this.f;
        jd4Var.getClass();
        return jd4Var.l(this.a);
    }

    public long d(long j) {
        long e = e(j);
        jd4 jd4Var = (jd4) this.f;
        jd4Var.getClass();
        return jd4Var.e(j - this.b, this.a) + e;
    }

    public long e(long j) {
        jd4 jd4Var = (jd4) this.f;
        jd4Var.getClass();
        return jd4Var.getTimeUs(j - this.b);
    }

    public boolean f(long j, long j2) {
        jd4 jd4Var = (jd4) this.f;
        jd4Var.getClass();
        return jd4Var.n() || j2 == C.TIME_UNSET || d(j) <= j2;
    }

    public void g() {
        rcg rcgVar = (rcg) this.e;
        if (rcgVar == rcg.c) {
            rcgVar = rcg.b;
            this.e = rcgVar;
        }
        if (rcgVar == rcg.a) {
            this.e = rcg.b;
            this.b = this.a;
            ((Timer) this.f).schedule(new scg(this, 0), 250L, 250L);
        }
    }

    public bo4(long j, ozf ozfVar, o71 o71Var, l72 l72Var, long j2, jd4 jd4Var) {
        this.a = j;
        this.d = ozfVar;
        this.e = o71Var;
        this.b = j2;
        this.c = l72Var;
        this.f = jd4Var;
    }
}
