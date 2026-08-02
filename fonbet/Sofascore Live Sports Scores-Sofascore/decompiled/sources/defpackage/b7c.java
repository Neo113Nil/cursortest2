package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b7c {
    public final scc a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public b7c(scc sccVar, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        z1a.s(!z5 || z3);
        z1a.s(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        z1a.s(z6);
        this.a = sccVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public final b7c a(long j) {
        if (j == this.d) {
            return this;
        }
        return new b7c(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final b7c b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new b7c(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b7c.class != obj.getClass()) {
            return false;
        }
        b7c b7cVar = (b7c) obj;
        return this.b == b7cVar.b && this.d == b7cVar.d && this.e == b7cVar.e && this.f == b7cVar.f && this.g == b7cVar.g && this.h == b7cVar.h && this.i == b7cVar.i && this.j == b7cVar.j && this.k == b7cVar.k && this.a.equals(b7cVar.a);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }
}
