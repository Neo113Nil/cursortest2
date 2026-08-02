package com.google.android.material.loadingindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.shape.MaterialShapes;
import com.google.android.play.core.appupdate.b;
import hf.e;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import p1.c;
import p1.k;
import p1.o;
import p1.p;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class LoadingIndicatorDrawingDelegate {

    @NonNull
    final Path indicatorPath = new Path();

    @NonNull
    final Matrix indicatorPathTransform = new Matrix();

    @NonNull
    LoadingIndicatorSpec specs;
    private static final o[] INDETERMINATE_SHAPES = {MaterialShapes.normalize(MaterialShapes.SOFT_BURST, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.COOKIE_9, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.PENTAGON, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.PILL, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.SUNNY, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.COOKIE_4, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.OVAL, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
    private static final k[] INDETERMINATE_MORPH_SEQUENCE = new k[7];

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class IndicatorState {
        int color;
        float morphFraction;
        float rotationDegree;
    }

    static {
        int i5 = 0;
        while (true) {
            o[] oVarArr = INDETERMINATE_SHAPES;
            if (i5 >= oVarArr.length) {
                return;
            }
            int i10 = i5 + 1;
            INDETERMINATE_MORPH_SEQUENCE[i5] = new k(oVarArr[i5], oVarArr[i10 % oVarArr.length]);
            i5 = i10;
        }
    }

    public LoadingIndicatorDrawingDelegate(@NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        this.specs = loadingIndicatorSpec;
    }

    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect) {
        canvas.translate(rect.centerX(), rect.centerY());
        if (this.specs.scaleToFit) {
            float min = Math.min(rect.width() / getPreferredWidth(), rect.height() / getPreferredHeight());
            canvas.scale(min, min);
        }
        canvas.clipRect((-getPreferredWidth()) / 2.0f, (-getPreferredHeight()) / 2.0f, getPreferredWidth() / 2.0f, getPreferredHeight() / 2.0f);
        canvas.rotate(-90.0f);
    }

    public void drawContainer(@NonNull Canvas canvas, @NonNull Paint paint, int i5, int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        float min = Math.min(loadingIndicatorSpec.containerWidth, loadingIndicatorSpec.containerHeight) / 2.0f;
        paint.setColor(MaterialColors.compositeARGBWithAlpha(i5, i10));
        paint.setStyle(Paint.Style.FILL);
        LoadingIndicatorSpec loadingIndicatorSpec2 = this.specs;
        canvas.drawRoundRect(new RectF((-r2) / 2.0f, (-r9) / 2.0f, loadingIndicatorSpec2.containerWidth / 2.0f, loadingIndicatorSpec2.containerHeight / 2.0f), min, min, paint);
    }

    public void drawIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull IndicatorState indicatorState, int i5) {
        paint.setColor(MaterialColors.compositeARGBWithAlpha(indicatorState.color, i5));
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        canvas.rotate(indicatorState.rotationDegree);
        this.indicatorPath.rewind();
        int floor = (int) Math.floor(indicatorState.morphFraction);
        k[] kVarArr = INDETERMINATE_MORPH_SEQUENCE;
        int floorMod = MathUtils.floorMod(floor, kVarArr.length);
        float f6 = indicatorState.morphFraction - floor;
        k kVar = kVarArr[floorMod];
        Path path = this.indicatorPath;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        kVar.getClass();
        e b10 = t.b();
        ArrayList arrayList = kVar.f21426a;
        int size = arrayList.size();
        c cVar = null;
        c cVar2 = null;
        int i10 = 0;
        while (i10 < size) {
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = p.c(((c) ((Pair) arrayList.get(i10)).f19192a).f21410a[i11], ((c) ((Pair) arrayList.get(i10)).f19193b).f21410a[i11], f6);
            }
            c cVar3 = new c(fArr);
            if (cVar2 == null) {
                cVar2 = cVar3;
            }
            if (cVar != null) {
                b10.add(cVar);
            }
            i10++;
            cVar = cVar3;
        }
        if (cVar != null && cVar2 != null) {
            float[] fArr2 = cVar.f21410a;
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            float f12 = fArr2[2];
            float f13 = fArr2[3];
            float f14 = fArr2[4];
            float f15 = fArr2[5];
            float[] fArr3 = cVar2.f21410a;
            b10.add(h.a(f10, f11, f12, f13, f14, f15, fArr3[0], fArr3[1]));
        }
        b.C(path, t.a(b10));
        float f16 = this.specs.indicatorSize / 2.0f;
        this.indicatorPathTransform.setScale(f16, f16);
        this.indicatorPath.transform(this.indicatorPathTransform);
        canvas.drawPath(this.indicatorPath, paint);
        canvas.restore();
    }

    public int getPreferredHeight() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        return Math.max(loadingIndicatorSpec.containerWidth, loadingIndicatorSpec.indicatorSize);
    }

    public int getPreferredWidth() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        return Math.max(loadingIndicatorSpec.containerHeight, loadingIndicatorSpec.indicatorSize);
    }
}
