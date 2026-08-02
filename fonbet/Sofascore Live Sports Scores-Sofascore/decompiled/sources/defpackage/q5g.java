package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q5g implements j1a {
    public final boolean a;
    public final long b;

    public q5g(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.j1a
    public final xv4 b(wzc wzcVar) {
        return new qw4(wzcVar, this.a, new pw4(this, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5g)) {
            return false;
        }
        q5g q5gVar = (q5g) obj;
        if (this.a != q5gVar.a || !p75.b(Float.NaN, Float.NaN)) {
            return false;
        }
        long j = q5gVar.b;
        int i = r13.j;
        return e8k.a(this.b, j);
    }

    @Override // defpackage.j1a
    public final int hashCode() {
        int a = fc6.a(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.b) + a;
    }
}
