package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public class w extends q {

    /* renamed from: l, reason: collision with root package name */
    public static final r f30535l = new w();

    @Override // com.facebook.drawee.drawable.q
    public void getTransformImpl(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float min = Math.min(f12, f13);
        float width = rect.left + ((rect.width() - (i10 * min)) * 0.5f);
        float height = rect.top + ((rect.height() - (i11 * min)) * 0.5f);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
    }

    public String toString() {
        return "fit_center";
    }
}
