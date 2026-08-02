package com.google.android.material.shape;

/* loaded from: classes3.dex */
public class m extends e {

    /* renamed from: a, reason: collision with root package name */
    public float f35813a = -1.0f;

    @Override // com.google.android.material.shape.e
    public void a(p pVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        pVar.o(0.0f, f13, 180.0f, 180.0f - f10);
        float f14 = f13 * 2.0f;
        pVar.a(0.0f, 0.0f, f14, f14, 180.0f, f10);
    }
}
