package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qv {
    public final long a;
    public final mij b;
    public final int c;
    public final scc d;
    public final long e;
    public final mij f;
    public final int g;
    public final scc h;
    public final long i;
    public final long j;

    public qv(long j, mij mijVar, int i, scc sccVar, long j2, mij mijVar2, int i2, scc sccVar2, long j3, long j4) {
        this.a = j;
        this.b = mijVar;
        this.c = i;
        this.d = sccVar;
        this.e = j2;
        this.f = mijVar2;
        this.g = i2;
        this.h = sccVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qv.class != obj.getClass()) {
            return false;
        }
        qv qvVar = (qv) obj;
        return this.a == qvVar.a && this.c == qvVar.c && this.e == qvVar.e && this.g == qvVar.g && this.i == qvVar.i && this.j == qvVar.j && this.b.equals(qvVar.b) && Objects.equals(this.d, qvVar.d) && Objects.equals(this.f, qvVar.f) && Objects.equals(this.h, qvVar.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
