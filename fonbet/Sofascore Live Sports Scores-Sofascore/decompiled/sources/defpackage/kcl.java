package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kcl {
    public final String a;
    public final sbl b;
    public final md4 c;
    public final long d;
    public final long e;
    public final long f;
    public final zm3 g;
    public final int h;
    public final zy0 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public kcl(String str, sbl sblVar, md4 md4Var, long j, long j2, long j3, zm3 zm3Var, int i, zy0 zy0Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        md4Var.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = sblVar;
        this.c = md4Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = zm3Var;
        this.h = i;
        this.i = zy0Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcl)) {
            return false;
        }
        kcl kclVar = (kcl) obj;
        return Intrinsics.c(this.a, kclVar.a) && this.b == kclVar.b && Intrinsics.c(this.c, kclVar.c) && this.d == kclVar.d && this.e == kclVar.e && this.f == kclVar.f && this.g.equals(kclVar.g) && this.h == kclVar.h && this.i == kclVar.i && this.j == kclVar.j && this.k == kclVar.k && this.l == kclVar.l && this.m == kclVar.m && this.n == kclVar.n && this.o == kclVar.o && Intrinsics.c(this.p, kclVar.p) && Intrinsics.c(this.q, kclVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + dmi.d(wv8.a(this.o, ljg.c(wv8.a(this.m, wv8.a(this.l, ljg.c(ljg.c((this.i.hashCode() + wv8.a(this.h, (this.g.hashCode() + ljg.c(ljg.c(ljg.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", output=");
        sb.append(this.c);
        sb.append(", initialDelay=");
        sb.append(this.d);
        sb.append(", intervalDuration=");
        sb.append(this.e);
        sb.append(", flexDuration=");
        sb.append(this.f);
        sb.append(", constraints=");
        sb.append(this.g);
        sb.append(", runAttemptCount=");
        sb.append(this.h);
        sb.append(", backoffPolicy=");
        sb.append(this.i);
        sb.append(", backoffDelayDuration=");
        sb.append(this.j);
        sb.append(", lastEnqueueTime=");
        sb.append(this.k);
        sb.append(", periodCount=");
        sb.append(this.l);
        sb.append(", generation=");
        sb.append(this.m);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.n);
        sb.append(", stopReason=");
        sb.append(this.o);
        sb.append(", tags=");
        sb.append(this.p);
        sb.append(", progress=");
        return fc6.p(sb, this.q, ')');
    }
}
