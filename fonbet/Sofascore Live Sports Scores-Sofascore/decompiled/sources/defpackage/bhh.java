package defpackage;

import androidx.media3.common.b;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bhh implements jpg {
    public final long a;
    public boolean b;
    public long c;

    public bhh(long j) {
        b bVar = chh.j;
        String str = nik.a;
        this.a = 4 * nik.b0(j, 44100L, 1000000L, RoundingMode.UP);
    }

    @Override // defpackage.jpg
    public final int e(fp4 fp4Var, im4 im4Var, int i) {
        if (!this.b || (i & 2) != 0) {
            fp4Var.c = chh.j;
            this.b = true;
            return -5;
        }
        long j = this.c;
        long j2 = this.a - j;
        if (j2 == 0) {
            im4Var.b(4);
            return -4;
        }
        b bVar = chh.j;
        im4Var.k = nik.Z(44100, j / 4);
        im4Var.b(1);
        byte[] bArr = chh.l;
        int min = (int) Math.min(bArr.length, j2);
        if ((i & 4) == 0) {
            im4Var.C(min);
            im4Var.i.put(bArr, 0, min);
        }
        if ((i & 1) == 0) {
            this.c += min;
        }
        return -4;
    }

    @Override // defpackage.jpg
    public final boolean isReady() {
        return true;
    }

    @Override // defpackage.jpg
    public final int skipData(long j) {
        long j2 = this.c;
        b bVar = chh.j;
        String str = nik.a;
        long k = nik.k(4 * nik.b0(j, 44100L, 1000000L, RoundingMode.UP), 0L, this.a);
        this.c = k;
        return (int) ((k - j2) / chh.l.length);
    }

    @Override // defpackage.jpg
    public final void maybeThrowError() {
    }
}
