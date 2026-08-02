package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nwf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final wtc g;

    public nwf(long j, long j2, long j3, long j4, long j5, float[] fArr, wtc wtcVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = wtcVar;
    }

    public final float a(int i, int i2, int i3, int i4) {
        long j = this.a;
        int i5 = (int) (j >> 32);
        int min = Math.min(Math.max(i5, i), i3);
        int i6 = (int) j;
        int min2 = Math.min(Math.max(i6, i2), i4);
        long j2 = this.b;
        int i7 = (int) (j2 >> 32);
        int max = Math.max(Math.min(i7, i3), i);
        int i8 = (int) j2;
        int max2 = Math.max(Math.min(i8, i4), i2);
        int i9 = i4 - i2;
        int i10 = (i8 - i6) * (i7 - i5);
        return Math.max((max2 - min2) * (max - min), 0) / Math.min(i9 * (i3 - i), i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && nwf.class == obj.getClass()) {
                nwf nwfVar = (nwf) obj;
                if (this.a == nwfVar.a && this.b == nwfVar.b && this.e == nwfVar.e && r6a.b(this.c, nwfVar.c) && r6a.b(this.d, nwfVar.d)) {
                    float[] fArr = nwfVar.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            equals = true;
                            if (equals && this.g.equals(nwfVar.g)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (fArr != null) {
                            equals = fArr2.equals(fArr);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = ljg.c(ljg.c(ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((c + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
