package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p5g implements j1a {
    public final boolean a;
    public final float b;
    public final long c;

    public p5g(long j, float f, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.j1a
    public final xv4 b(wzc wzcVar) {
        return new qw4(wzcVar, this.a, this.b, new pw4(this, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5g)) {
            return false;
        }
        p5g p5gVar = (p5g) obj;
        if (this.a != p5gVar.a || !p75.b(this.b, p5gVar.b)) {
            return false;
        }
        long j = p5gVar.c;
        int i = r13.j;
        return e8k.a(this.c, j);
    }

    @Override // defpackage.j1a
    public final int hashCode() {
        int a = fc6.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.c) + a;
    }
}
