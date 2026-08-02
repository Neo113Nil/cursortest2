package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;
import s0.AbstractC6307a;

/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f35752a;

    public c(float f10) {
        this.f35752a = f10;
    }

    public static float b(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.google.android.material.shape.d
    public float a(RectF rectF) {
        return AbstractC6307a.a(this.f35752a, 0.0f, b(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f35752a == ((c) obj).f35752a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f35752a)});
    }
}
