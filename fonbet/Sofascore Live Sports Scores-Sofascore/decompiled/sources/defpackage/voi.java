package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class voi implements uah {
    public final b20 a;
    public final float[] b;
    public final b20 c;

    public voi() {
        p95 p95Var = new p95(1);
        ArrayList arrayList = p95Var.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            p95Var.a = arrayList;
        } else {
            arrayList.clear();
        }
        p95Var.b("M132.812 0.51001C132.812 0.51001 154.9 4.95592 202.747 17.3057C247.982 28.9497 263.86 33.6073 263.86 33.6073C263.86 33.6073 271.341 79.2661 250.805 163.668C234.221 231.768 179.953 275.592 132.812 291.823C85.7418 275.592 31.4029 231.838 14.819 163.668C-5.64631 79.3367 1.83411 33.6073 1.83411 33.6073C1.83411 33.6073 17.7124 28.9497 62.9477 17.3057C110.794 4.95592 132.812 0.51001 132.812 0.51001Z", arrayList);
        b20 a = e20.a();
        ArrayList arrayList2 = p95Var.a;
        this.a = arrayList2 != null ? wca.J(arrayList2, a) : e20.a();
        this.b = xzb.a();
        this.c = e20.a();
    }

    @Override // defpackage.uah
    public final pea a(long j, ema emaVar, kx4 kx4Var) {
        emaVar.getClass();
        kx4Var.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 266.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 293.0f;
        float[] fArr = this.b;
        xzb.d(fArr);
        xzb.e(fArr, intBitsToFloat, intBitsToFloat2);
        b20 b20Var = this.c;
        b20Var.i();
        b20.a(b20Var, this.a);
        Matrix matrix = b20Var.d;
        if (matrix == null) {
            matrix = new Matrix();
            b20Var.d = matrix;
        }
        pco.O(matrix, fArr);
        Path path = b20Var.a;
        Matrix matrix2 = b20Var.d;
        matrix2.getClass();
        path.transform(matrix2);
        return new cxd(b20Var);
    }
}
