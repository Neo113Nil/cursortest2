package com.google.android.material.floatingactionbutton;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes9.dex */
final class e implements TypeEvaluator<Float> {

    /* renamed from: a, reason: collision with root package name */
    FloatEvaluator f58417a;

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f7, Float f11, Float f12) {
        float floatValue = this.f58417a.evaluate(f7, (Number) f11, (Number) f12).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
