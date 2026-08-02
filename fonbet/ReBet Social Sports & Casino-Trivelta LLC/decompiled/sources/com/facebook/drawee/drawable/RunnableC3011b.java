package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: com.facebook.drawee.drawable.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC3011b extends C3016g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f30412a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30413b;

    /* renamed from: c, reason: collision with root package name */
    public float f30414c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30415d;

    public RunnableC3011b(Drawable drawable, int i10) {
        this(drawable, i10, true);
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i10 = bounds.right - bounds.left;
        int i11 = bounds.bottom - bounds.top;
        float f10 = this.f30414c;
        if (!this.f30413b) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, r3 + (i10 / 2), r1 + (i11 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        j();
    }

    public final int i() {
        return (int) ((20.0f / this.f30412a) * 360.0f);
    }

    public final void j() {
        if (this.f30415d) {
            return;
        }
        this.f30415d = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30415d = false;
        this.f30414c += i();
        invalidateSelf();
    }

    public RunnableC3011b(Drawable drawable, int i10, boolean z10) {
        super((Drawable) D6.k.g(drawable));
        this.f30414c = 0.0f;
        this.f30415d = false;
        this.f30412a = i10;
        this.f30413b = z10;
    }
}
