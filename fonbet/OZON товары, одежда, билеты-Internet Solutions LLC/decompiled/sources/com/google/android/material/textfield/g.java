package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import y7.C10856g;

/* loaded from: classes9.dex */
final class g extends C10856g {

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    private final RectF f58716y;

    g() {
        this(null);
    }

    final boolean O() {
        return !this.f58716y.isEmpty();
    }

    final void P(float f7, float f11, float f12, float f13) {
        RectF rectF = this.f58716y;
        if (f7 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f7, f11, f12, f13);
        invalidateSelf();
    }

    @Override // y7.C10856g
    protected final void l(@NonNull Canvas canvas) {
        RectF rectF = this.f58716y;
        if (rectF.isEmpty()) {
            super.l(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(rectF);
        super.l(canvas);
        canvas.restore();
    }

    g(y7.k kVar) {
        super(kVar == null ? new y7.k() : kVar);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f58716y = new RectF();
    }
}
