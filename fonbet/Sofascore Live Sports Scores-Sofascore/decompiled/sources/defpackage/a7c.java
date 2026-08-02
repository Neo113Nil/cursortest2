package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a7c {
    public final rcc a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public a7c(rcc rccVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        qx9.r(!z4 || z2);
        qx9.r(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        qx9.r(z5);
        this.a = rccVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final a7c a(long j) {
        if (j == this.c) {
            return this;
        }
        return new a7c(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final a7c b(long j) {
        if (j == this.b) {
            return this;
        }
        return new a7c(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a7c.class != obj.getClass()) {
            return false;
        }
        a7c a7cVar = (a7c) obj;
        if (this.b != a7cVar.b || this.c != a7cVar.c || this.d != a7cVar.d || this.e != a7cVar.e || this.f != a7cVar.f || this.g != a7cVar.g || this.h != a7cVar.h || this.i != a7cVar.i) {
            return false;
        }
        rcc rccVar = a7cVar.a;
        int i = lik.a;
        return this.a.equals(rccVar);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
