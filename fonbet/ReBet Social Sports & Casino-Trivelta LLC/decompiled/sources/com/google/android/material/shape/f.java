package com.google.android.material.shape;

/* loaded from: classes3.dex */
public class f extends e {

    /* renamed from: a, reason: collision with root package name */
    public float f35753a = -1.0f;

    @Override // com.google.android.material.shape.e
    public void a(p pVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        pVar.o(0.0f, f13, 180.0f, 180.0f - f10);
        double d10 = f13;
        pVar.m((float) (Math.sin(Math.toRadians(f10)) * d10), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10));
    }
}
