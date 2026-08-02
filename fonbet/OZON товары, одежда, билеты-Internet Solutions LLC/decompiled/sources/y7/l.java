package y7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.BitSet;
import y7.n;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final n[] f106163a = new n[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f106164b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f106165c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f106166d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f106167e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f106168f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final n f106169g = new n();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f106170h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f106171i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f106172j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f106173k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f106174l = true;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final l f106175a = new l();
    }

    public interface b {
    }

    public l() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f106163a[i11] = new n();
            this.f106164b[i11] = new Matrix();
            this.f106165c[i11] = new Matrix();
        }
    }

    @NonNull
    public static l b() {
        return a.f106175a;
    }

    private boolean c(Path path, int i11) {
        Path path2 = this.f106173k;
        path2.reset();
        this.f106163a[i11].c(this.f106164b[i11], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void a(k kVar, float f7, RectF rectF, b bVar, @NonNull Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        n[] nVarArr;
        int i11;
        float[] fArr;
        float f11;
        boolean z11;
        BitSet bitSet;
        n.f[] fVarArr;
        BitSet bitSet2;
        n.f[] fVarArr2;
        char c11;
        C10853d c10853d;
        int i12;
        char c12;
        l lVar = this;
        path.rewind();
        Path path2 = lVar.f106167e;
        path2.rewind();
        Path path3 = lVar.f106168f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i13 = 0;
        while (true) {
            matrixArr = lVar.f106165c;
            matrixArr2 = lVar.f106164b;
            nVarArr = lVar.f106163a;
            i11 = 4;
            fArr = lVar.f106170h;
            if (i13 >= 4) {
                break;
            }
            InterfaceC10852c interfaceC10852c = i13 != 1 ? i13 != 2 ? i13 != 3 ? kVar.f106144f : kVar.f106143e : kVar.f106146h : kVar.f106145g;
            if (i13 == 1) {
                c11 = 0;
                c10853d = kVar.f106141c;
            } else if (i13 == 2) {
                c11 = 0;
                c10853d = kVar.f106142d;
            } else if (i13 != 3) {
                c11 = 0;
                c10853d = kVar.f106140b;
            } else {
                c11 = 0;
                c10853d = kVar.f106139a;
            }
            n nVar = nVarArr[i13];
            c10853d.getClass();
            c10853d.a(nVar, f7, interfaceC10852c.a(rectF));
            int i14 = i13 + 1;
            float f12 = i14 * 90;
            matrixArr2[i13].reset();
            PointF pointF = lVar.f106166d;
            if (i13 != 1) {
                c12 = 1;
                if (i13 == 2) {
                    i12 = i14;
                    pointF.set(rectF.left, rectF.bottom);
                } else if (i13 != 3) {
                    i12 = i14;
                    pointF.set(rectF.right, rectF.top);
                } else {
                    i12 = i14;
                    pointF.set(rectF.left, rectF.top);
                }
            } else {
                i12 = i14;
                c12 = 1;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i13].setTranslate(pointF.x, pointF.y);
            matrixArr2[i13].preRotate(f12);
            n nVar2 = nVarArr[i13];
            fArr[c11] = nVar2.f106179b;
            fArr[c12] = nVar2.f106180c;
            matrixArr2[i13].mapPoints(fArr);
            matrixArr[i13].reset();
            matrixArr[i13].setTranslate(fArr[c11], fArr[c12]);
            matrixArr[i13].preRotate(f12);
            i13 = i12;
        }
        int i15 = 1;
        boolean z12 = 0;
        int i16 = 0;
        while (i16 < i11) {
            n nVar3 = nVarArr[i16];
            nVar3.getClass();
            fArr[z12] = 0.0f;
            fArr[i15] = nVar3.f106178a;
            matrixArr2[i16].mapPoints(fArr);
            if (i16 == 0) {
                path.moveTo(fArr[z12], fArr[i15]);
            } else {
                path.lineTo(fArr[z12], fArr[i15]);
            }
            nVarArr[i16].c(matrixArr2[i16], path);
            if (bVar != null) {
                n nVar4 = nVarArr[i16];
                Matrix matrix = matrixArr2[i16];
                C10856g c10856g = C10856g.this;
                bitSet2 = c10856g.f106100d;
                nVar4.getClass();
                f11 = 0.0f;
                bitSet2.set(i16, z12);
                fVarArr2 = c10856g.f106098b;
                fVarArr2[i16] = nVar4.d(matrix);
            } else {
                f11 = 0.0f;
            }
            int i17 = i16 + 1;
            int i18 = i17 % 4;
            n nVar5 = nVarArr[i16];
            fArr[0] = nVar5.f106179b;
            fArr[i15] = nVar5.f106180c;
            matrixArr2[i16].mapPoints(fArr);
            n nVar6 = nVarArr[i18];
            nVar6.getClass();
            float[] fArr2 = lVar.f106171i;
            fArr2[0] = f11;
            fArr2[i15] = nVar6.f106178a;
            matrixArr2[i18].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            Matrix[] matrixArr4 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[i15] - fArr2[i15])) - 0.001f, f11);
            n nVar7 = nVarArr[i16];
            fArr[0] = nVar7.f106179b;
            fArr[i15] = nVar7.f106180c;
            matrixArr4[i16].mapPoints(fArr);
            int i19 = i15;
            if (i16 == i19 || i16 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[i19]);
            }
            n nVar8 = lVar.f106169g;
            nVar8.f(0.0f, 270.0f, 0.0f);
            (i16 != 1 ? i16 != 2 ? i16 != 3 ? kVar.f106148j : kVar.f106147i : kVar.f106150l : kVar.f106149k).getClass();
            nVar8.e(max, 0.0f);
            Path path4 = lVar.f106172j;
            path4.reset();
            nVar8.c(matrixArr3[i16], path4);
            if (lVar.f106174l && (lVar.c(path4, i16) || lVar.c(path4, i18))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                i15 = 1;
                fArr[1] = nVar8.f106178a;
                matrixArr3[i16].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                nVar8.c(matrixArr3[i16], path2);
            } else {
                i15 = 1;
                nVar8.c(matrixArr3[i16], path);
            }
            if (bVar != null) {
                Matrix matrix2 = matrixArr3[i16];
                C10856g c10856g2 = C10856g.this;
                bitSet = c10856g2.f106100d;
                z11 = false;
                bitSet.set(i16 + 4, false);
                fVarArr = c10856g2.f106099c;
                fVarArr[i16] = nVar8.d(matrix2);
            } else {
                z11 = false;
            }
            z12 = z11;
            i16 = i17;
            matrixArr2 = matrixArr4;
            matrixArr = matrixArr3;
            i11 = 4;
            lVar = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
