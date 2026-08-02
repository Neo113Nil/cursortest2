package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f35749a;

    public a(float f10) {
        this.f35749a = f10;
    }

    @Override // com.google.android.material.shape.d
    public float a(RectF rectF) {
        return this.f35749a;
    }

    public float b() {
        return this.f35749a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f35749a == ((a) obj).f35749a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f35749a)});
    }

    public String toString() {
        return b() + "px";
    }
}
