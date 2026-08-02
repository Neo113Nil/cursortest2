package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.utils.x;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public float f29105a;

    /* renamed from: b, reason: collision with root package name */
    public float f29106b;

    /* renamed from: c, reason: collision with root package name */
    public float f29107c;

    /* renamed from: d, reason: collision with root package name */
    public int f29108d;
    private float[] vecs = null;

    public d(float f10, float f11, float f12, int i10) {
        this.f29105a = f10;
        this.f29106b = f11;
        this.f29107c = f12;
        this.f29108d = i10;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f29108d) > 0) {
            paint.setShadowLayer(Math.max(this.f29105a, Float.MIN_VALUE), this.f29106b, this.f29107c, this.f29108d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(x.b bVar) {
        if (Color.alpha(this.f29108d) > 0) {
            bVar.f29161d = this;
        } else {
            bVar.f29161d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int l10 = z.l(Color.alpha(this.f29108d), l.c(i10, 0, 255));
        if (l10 <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f29105a, Float.MIN_VALUE), this.f29106b, this.f29107c, Color.argb(l10, Color.red(this.f29108d), Color.green(this.f29108d), Color.blue(this.f29108d)));
        }
    }

    public void d(int i10, x.b bVar) {
        d dVar = new d(this);
        bVar.f29161d = dVar;
        dVar.i(i10);
    }

    public int e() {
        return this.f29108d;
    }

    public float f() {
        return this.f29106b;
    }

    public float g() {
        return this.f29107c;
    }

    public float h() {
        return this.f29105a;
    }

    public void i(int i10) {
        this.f29108d = Color.argb(Math.round((Color.alpha(this.f29108d) * l.c(i10, 0, 255)) / 255.0f), Color.red(this.f29108d), Color.green(this.f29108d), Color.blue(this.f29108d));
    }

    public boolean j(d dVar) {
        return this.f29105a == dVar.f29105a && this.f29106b == dVar.f29106b && this.f29107c == dVar.f29107c && this.f29108d == dVar.f29108d;
    }

    public void k(Matrix matrix) {
        if (this.vecs == null) {
            this.vecs = new float[2];
        }
        float[] fArr = this.vecs;
        fArr[0] = this.f29106b;
        fArr[1] = this.f29107c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.vecs;
        this.f29106b = fArr2[0];
        this.f29107c = fArr2[1];
        this.f29105a = matrix.mapRadius(this.f29105a);
    }

    public d(d dVar) {
        this.f29105a = 0.0f;
        this.f29106b = 0.0f;
        this.f29107c = 0.0f;
        this.f29108d = 0;
        this.f29105a = dVar.f29105a;
        this.f29106b = dVar.f29106b;
        this.f29107c = dVar.f29107c;
        this.f29108d = dVar.f29108d;
    }
}
