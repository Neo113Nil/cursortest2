package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class f extends b {
    public f(K k10, e eVar) {
        super(k10, eVar);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void v(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
    }
}
