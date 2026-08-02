package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cx1 extends d7e {
    public final a10 f;
    public final long g;
    public int h;
    public final long i;
    public float j;
    public ay1 k;

    public cx1(a10 a10Var, long j) {
        int i;
        this.f = a10Var;
        this.g = j;
        this.h = 1;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > a10Var.a.getWidth() || i > a10Var.a.getHeight()) {
            a70.p("Failed requirement.");
            throw null;
        }
        this.i = j;
        this.j = 1.0f;
    }

    @Override // defpackage.d7e
    public final boolean c(float f) {
        this.j = f;
        return true;
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        this.k = ay1Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx1)) {
            return false;
        }
        cx1 cx1Var = (cx1) obj;
        return Intrinsics.c(this.f, cx1Var.f) && r6a.b(0L, 0L) && c7a.a(this.g, cx1Var.g) && this.h == cx1Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + ljg.c(ljg.c(this.f.hashCode() * 31, 31, 0L), 31, this.g);
    }

    @Override // defpackage.d7e
    public final long i() {
        return d7a.I(this.i);
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        int round = Math.round(Float.intBitsToFloat((int) (ha5Var.n() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)));
        ha5.H(ha5Var, this.f, this.g, (round << 32) | (round2 & 4294967295L), this.j, this.k, this.h, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append((Object) r6a.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) c7a.b(this.g));
        sb.append(", filterQuality=");
        int i = this.h;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public cx1(a10 a10Var) {
        this(a10Var, (a10Var.a.getHeight() & 4294967295L) | (a10Var.a.getWidth() << 32));
    }
}
