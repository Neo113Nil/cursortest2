package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f35750a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35751b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f35750a;
            f10 += ((b) dVar).f35751b;
        }
        this.f35750a = dVar;
        this.f35751b = f10;
    }

    @Override // com.google.android.material.shape.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f35750a.a(rectF) + this.f35751b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35750a.equals(bVar.f35750a) && this.f35751b == bVar.f35751b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35750a, Float.valueOf(this.f35751b)});
    }
}
