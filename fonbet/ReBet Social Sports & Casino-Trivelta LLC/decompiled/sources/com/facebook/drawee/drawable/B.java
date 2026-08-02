package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public class B extends q {

    /* renamed from: l, reason: collision with root package name */
    public static final r f30402l = new B();

    @Override // com.facebook.drawee.drawable.q
    public void getTransformImpl(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float width = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
        float f14 = rect.top;
        matrix.setScale(f13, f13);
        matrix.postTranslate((int) (width + 0.5f), (int) (f14 + 0.5f));
    }

    public String toString() {
        return "fit_y";
    }
}
