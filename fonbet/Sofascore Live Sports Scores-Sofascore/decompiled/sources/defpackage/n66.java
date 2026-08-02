package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n66 implements jpg {
    public final b a;
    public long[] c;
    public boolean d;
    public dc6 e;
    public boolean f;
    public int g;
    public final u36 b = new u36(1);
    public long h = C.TIME_UNSET;

    public n66(dc6 dc6Var, b bVar, boolean z) {
        this.a = bVar;
        this.e = dc6Var;
        this.c = dc6Var.b;
        a(dc6Var, z);
    }

    public final void a(dc6 dc6Var, boolean z) {
        int i = this.g;
        long j = C.TIME_UNSET;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = dc6Var;
        long[] jArr = dc6Var.b;
        this.c = jArr;
        long j3 = this.h;
        if (j3 == C.TIME_UNSET) {
            if (j2 != C.TIME_UNSET) {
                this.g = nik.b(jArr, j2, false);
            }
        } else {
            int b = nik.b(jArr, j3, true);
            this.g = b;
            if (this.d && b == this.c.length) {
                j = j3;
            }
            this.h = j;
        }
    }

    @Override // defpackage.jpg
    public final int e(fp4 fp4Var, im4 im4Var, int i) {
        int i2 = this.g;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            im4Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            fp4Var.c = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] a = this.b.a(this.e.a[i2]);
            im4Var.C(a.length);
            im4Var.i.put(a);
        }
        im4Var.k = this.c[i2];
        im4Var.b = 1;
        return -4;
    }

    @Override // defpackage.jpg
    public final boolean isReady() {
        return true;
    }

    @Override // defpackage.jpg
    public final int skipData(long j) {
        int max = Math.max(this.g, nik.b(this.c, j, true));
        int i = max - this.g;
        this.g = max;
        return i;
    }

    @Override // defpackage.jpg
    public final void maybeThrowError() {
    }
}
