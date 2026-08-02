package net.time4j.history;

import net.time4j.F;
import oi.EnumC5900A;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f58185a;

    /* renamed from: b, reason: collision with root package name */
    public final c f58186b;

    /* renamed from: c, reason: collision with root package name */
    public final h f58187c;

    /* renamed from: d, reason: collision with root package name */
    public final h f58188d;

    public f(long j10, c cVar, c cVar2) {
        this.f58185a = j10;
        this.f58186b = cVar2;
        if (j10 != Long.MIN_VALUE) {
            this.f58187c = cVar2.c(j10);
            this.f58188d = cVar.c(j10 - 1);
        } else {
            h hVar = new h(j.BC, 1000000000, 1, 1);
            this.f58187c = hVar;
            this.f58188d = hVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f58185a == fVar.f58185a && this.f58186b == fVar.f58186b && this.f58188d.equals(fVar.f58188d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f58185a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return f.class.getName() + "[start=" + this.f58185a + " (" + F.G0(this.f58185a, EnumC5900A.MODIFIED_JULIAN_DATE) + "),algorithm=" + this.f58186b + ",date-before-cutover=" + this.f58188d + ",date-at-cutover=" + this.f58187c + ']';
    }
}
