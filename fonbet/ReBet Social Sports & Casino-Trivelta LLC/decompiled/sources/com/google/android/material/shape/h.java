package com.google.android.material.shape;

/* loaded from: classes3.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final float f35754a;

    public h(float f10) {
        this.f35754a = f10 - 0.001f;
    }

    @Override // com.google.android.material.shape.g
    public boolean a() {
        return true;
    }

    @Override // com.google.android.material.shape.g
    public void b(float f10, float f11, float f12, p pVar) {
        float sqrt = (float) ((this.f35754a * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f35754a, 2.0d) - Math.pow(sqrt, 2.0d));
        pVar.n(f11 - sqrt, ((float) (-((this.f35754a * Math.sqrt(2.0d)) - this.f35754a))) + sqrt2);
        pVar.m(f11, (float) (-((this.f35754a * Math.sqrt(2.0d)) - this.f35754a)));
        pVar.m(f11 + sqrt, ((float) (-((this.f35754a * Math.sqrt(2.0d)) - this.f35754a))) + sqrt2);
    }
}
