package com.google.android.material.shape;

/* loaded from: classes3.dex */
public final class k extends g {

    /* renamed from: a, reason: collision with root package name */
    public final g f35810a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35811b;

    public k(g gVar, float f10) {
        this.f35810a = gVar;
        this.f35811b = f10;
    }

    @Override // com.google.android.material.shape.g
    public boolean a() {
        return this.f35810a.a();
    }

    @Override // com.google.android.material.shape.g
    public void b(float f10, float f11, float f12, p pVar) {
        this.f35810a.b(f10, f11 - this.f35811b, f12, pVar);
    }
}
