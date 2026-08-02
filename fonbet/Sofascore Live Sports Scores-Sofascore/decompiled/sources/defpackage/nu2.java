package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nu2 implements a0h {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public nu2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.f;
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        long[] jArr = this.e;
        int e = lik.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.c;
        e0h e0hVar = new e0h(j2, jArr2[e]);
        if (j2 >= j || e == this.a - 1) {
            return new yzg(e0hVar, e0hVar);
        }
        int i = e + 1;
        return new yzg(e0hVar, new e0h(jArr[i], jArr2[i]));
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
