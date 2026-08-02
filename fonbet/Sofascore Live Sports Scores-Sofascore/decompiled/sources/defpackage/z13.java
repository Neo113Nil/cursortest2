package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z13 extends d7e {
    public final long f;
    public float g = 1.0f;
    public ay1 h;

    public z13(long j) {
        this.f = j;
    }

    @Override // defpackage.d7e
    public final boolean c(float f) {
        this.g = f;
        return true;
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        this.h = ay1Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z13)) {
            return false;
        }
        long j = ((z13) obj).f;
        int i = r13.j;
        return e8k.a(this.f, j);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.f);
    }

    @Override // defpackage.d7e
    public final long i() {
        return 9205357640488583168L;
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        ha5.o0(ha5Var, this.f, 0L, 0L, this.g, null, this.h, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) r13.i(this.f)) + ')';
    }
}
