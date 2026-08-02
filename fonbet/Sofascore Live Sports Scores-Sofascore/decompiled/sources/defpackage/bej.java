package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bej {
    public final aej a;
    public dma b = null;
    public dma c;

    public bej(aej aejVar, dma dmaVar) {
        this.a = aejVar;
        this.c = dmaVar;
    }

    public final long a(long j) {
        oqf oqfVar;
        dma dmaVar = this.b;
        oqf oqfVar2 = oqf.e;
        if (dmaVar != null) {
            if (dmaVar.f()) {
                dma dmaVar2 = this.c;
                oqfVar = dmaVar2 != null ? dmaVar2.p(dmaVar, true) : null;
            } else {
                oqfVar = oqfVar2;
            }
            if (oqfVar != null) {
                oqfVar2 = oqfVar;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = oqfVar2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = oqfVar2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = oqfVar2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = oqfVar2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        aej aejVar = this.a;
        int e = aejVar.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        return Float.intBitsToFloat(i) >= aejVar.f(e) && Float.intBitsToFloat(i) <= aejVar.g(e);
    }

    public final long d(long j) {
        dma dmaVar;
        dma dmaVar2 = this.b;
        if (dmaVar2 != null) {
            if (!dmaVar2.f()) {
                dmaVar2 = null;
            }
            if (dmaVar2 != null && (dmaVar = this.c) != null) {
                dma dmaVar3 = dmaVar.f() ? dmaVar : null;
                if (dmaVar3 != null) {
                    return dmaVar2.l(dmaVar3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        dma dmaVar;
        dma dmaVar2 = this.b;
        if (dmaVar2 != null) {
            if (!dmaVar2.f()) {
                dmaVar2 = null;
            }
            if (dmaVar2 != null && (dmaVar = this.c) != null) {
                dma dmaVar3 = dmaVar.f() ? dmaVar : null;
                if (dmaVar3 != null) {
                    return dmaVar3.l(dmaVar2, j);
                }
            }
        }
        return j;
    }
}
