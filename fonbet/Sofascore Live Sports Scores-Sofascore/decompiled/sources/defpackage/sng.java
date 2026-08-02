package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sng extends d2a {
    public final /* synthetic */ int f;
    public float g;
    public final float h;
    public final /* synthetic */ vng i;
    public final Object j;

    public sng(vng vngVar, float f, float f2) {
        this.f = 1;
        this.i = vngVar;
        this.j = new RectF();
        this.g = f;
        this.h = f2;
    }

    @Override // defpackage.d2a
    public final void B(String str) {
        String str2;
        int i = this.f;
        Object obj = this.j;
        vng vngVar = this.i;
        switch (i) {
            case 0:
                if (vngVar.u0()) {
                    Path path = new Path();
                    str2 = str;
                    ((tng) vngVar.c).d.getTextPath(str2, 0, str.length(), this.g, this.h, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.g = ((tng) vngVar.c).d.measureText(str2) + this.g;
                break;
            default:
                if (vngVar.u0()) {
                    Rect rect = new Rect();
                    ((tng) vngVar.c).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.g, this.h);
                    ((RectF) obj).union(rectF);
                }
                this.g = ((tng) vngVar.c).d.measureText(str) + this.g;
                break;
        }
    }

    @Override // defpackage.d2a
    public final boolean t(hng hngVar) {
        switch (this.f) {
            case 0:
                return !(hngVar instanceof ing);
            default:
                if (!(hngVar instanceof ing)) {
                    return true;
                }
                umg z = hngVar.a.z(((ing) hngVar).n);
                if (z == null) {
                    return false;
                }
                gmg gmgVar = (gmg) z;
                Path path = (Path) new png(gmgVar.o).c;
                Matrix matrix = gmgVar.n;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.j).union(rectF);
                return false;
        }
    }

    public sng(vng vngVar, float f, float f2, Path path) {
        this.f = 0;
        this.i = vngVar;
        this.g = f;
        this.h = f2;
        this.j = path;
    }
}
