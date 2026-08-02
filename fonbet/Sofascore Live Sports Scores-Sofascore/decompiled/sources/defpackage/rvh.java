package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rvh implements Comparable {
    public boolean a;
    public float e;
    public int l;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public fh0[] i = new fh0[16];
    public int j = 0;
    public int k = 0;

    public rvh(int i) {
        this.l = i;
    }

    public final void a(fh0 fh0Var) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            fh0[] fh0VarArr = this.i;
            if (i >= i2) {
                if (i2 >= fh0VarArr.length) {
                    fh0VarArr = (fh0[]) Arrays.copyOf(fh0VarArr, fh0VarArr.length * 2);
                    this.i = fh0VarArr;
                }
                int i3 = this.j;
                fh0VarArr[i3] = fh0Var;
                this.j = i3 + 1;
                return;
            }
            if (fh0VarArr[i] == fh0Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(fh0 fh0Var) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == fh0Var) {
                while (i2 < i - 1) {
                    fh0[] fh0VarArr = this.i;
                    int i3 = i2 + 1;
                    fh0VarArr[i2] = fh0VarArr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.k = 0;
        this.a = false;
        Arrays.fill(this.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((rvh) obj).b;
    }

    public final void d(h8b h8bVar, float f) {
        this.e = f;
        this.f = true;
        int i = this.j;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(h8bVar, this, false);
        }
        this.j = 0;
    }

    public final void e(h8b h8bVar, fh0 fh0Var) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(h8bVar, fh0Var, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
