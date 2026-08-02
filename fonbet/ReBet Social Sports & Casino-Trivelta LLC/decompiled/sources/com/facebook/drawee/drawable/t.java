package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public class t extends q {

    /* renamed from: l, reason: collision with root package name */
    public static final r f30532l = new t();

    @Override // com.facebook.drawee.drawable.q
    public void getTransformImpl(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float height;
        float f14;
        if (f13 > f12) {
            f14 = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
            height = rect.top;
            f12 = f13;
        } else {
            float f15 = rect.left;
            height = ((rect.height() - (i11 * f12)) * 0.5f) + rect.top;
            f14 = f15;
        }
        matrix.setScale(f12, f12);
        matrix.postTranslate((int) (f14 + 0.5f), (int) (height + 0.5f));
    }

    public String toString() {
        return "center_crop";
    }
}
