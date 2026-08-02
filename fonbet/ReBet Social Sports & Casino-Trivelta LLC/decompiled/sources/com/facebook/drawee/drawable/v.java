package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public class v extends q {

    /* renamed from: l, reason: collision with root package name */
    public static final r f30534l = new v();

    @Override // com.facebook.drawee.drawable.q
    public void getTransformImpl(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float min = Math.min(f12, f13);
        float f14 = rect.left;
        float height = rect.top + (rect.height() - (i11 * min));
        matrix.setScale(min, min);
        matrix.postTranslate((int) (f14 + 0.5f), (int) (height + 0.5f));
    }

    public String toString() {
        return "fit_bottom_start";
    }
}
