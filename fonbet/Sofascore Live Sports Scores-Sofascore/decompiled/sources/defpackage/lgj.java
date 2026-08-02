package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lgj {
    public final uzc a;
    public kgj b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public lgj() {
        uzc uzcVar = q6a.a;
        this.a = new uzc();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(kgj kgjVar, long j, long j2, float[] fArr, long j3) {
        long j4 = kgjVar.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            kgjVar.g = j3;
            kgjVar.a(kgjVar.e, kgjVar.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (r6a.b(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!r6a.b(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
