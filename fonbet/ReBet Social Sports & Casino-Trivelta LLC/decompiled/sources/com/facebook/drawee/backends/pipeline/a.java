package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class a implements G7.a {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f30360a;

    /* renamed from: b, reason: collision with root package name */
    public final G7.a f30361b;

    /* renamed from: c, reason: collision with root package name */
    public final G7.a f30362c;

    public a(Resources resources, G7.a aVar, G7.a aVar2) {
        this.f30360a = resources;
        this.f30361b = aVar;
        this.f30362c = aVar2;
    }

    public static boolean c(H7.f fVar) {
        return (fVar.K0() == 1 || fVar.K0() == 0) ? false : true;
    }

    public static boolean d(H7.f fVar) {
        return (fVar.Y0() == 0 || fVar.Y0() == -1) ? false : true;
    }

    @Override // G7.a
    public Drawable a(H7.e eVar) {
        try {
            if (N7.b.d()) {
                N7.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (eVar instanceof H7.f) {
                H7.f fVar = (H7.f) eVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f30360a, fVar.A1());
                if (!d(fVar) && !c(fVar)) {
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                    return bitmapDrawable;
                }
                com.facebook.drawee.drawable.h hVar = new com.facebook.drawee.drawable.h(bitmapDrawable, fVar.Y0(), fVar.K0());
                if (N7.b.d()) {
                    N7.b.b();
                }
                return hVar;
            }
            G7.a aVar = this.f30361b;
            if (aVar != null && aVar.b(eVar)) {
                Drawable a10 = this.f30361b.a(eVar);
                if (N7.b.d()) {
                    N7.b.b();
                }
                return a10;
            }
            G7.a aVar2 = this.f30362c;
            if (aVar2 == null || !aVar2.b(eVar)) {
                if (N7.b.d()) {
                    N7.b.b();
                }
                return null;
            }
            Drawable a11 = this.f30362c.a(eVar);
            if (N7.b.d()) {
                N7.b.b();
            }
            return a11;
        } catch (Throwable th2) {
            if (N7.b.d()) {
                N7.b.b();
            }
            throw th2;
        }
    }

    @Override // G7.a
    public boolean b(H7.e eVar) {
        return true;
    }
}
