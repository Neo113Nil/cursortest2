package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends C3016g {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f30435a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30437c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f30438d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f30439e;

    public h(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f30435a = new Matrix();
        this.f30436b = i10 - (i10 % 90);
        this.f30437c = (i11 < 0 || i11 > 8) ? 0 : i11;
        this.f30438d = new Matrix();
        this.f30439e = new RectF();
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f30436b <= 0 && ((i10 = this.f30437c) == 0 || i10 == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f30435a);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = this.f30437c;
        return (i10 == 5 || i10 == 7 || this.f30436b % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = this.f30437c;
        return (i10 == 5 || i10 == 7 || this.f30436b % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.C3016g, com.facebook.drawee.drawable.E
    public void getTransform(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        getParentTransform(transform);
        if (this.f30435a.isIdentity()) {
            return;
        }
        transform.preConcat(this.f30435a);
    }

    @Override // com.facebook.drawee.drawable.C3016g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        int i10;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i11 = this.f30436b;
        if (i11 <= 0 && ((i10 = this.f30437c) == 0 || i10 == 1)) {
            current.setBounds(bounds);
            return;
        }
        int i12 = this.f30437c;
        if (i12 == 2) {
            this.f30435a.setScale(-1.0f, 1.0f);
        } else if (i12 == 7) {
            this.f30435a.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f30435a.postScale(-1.0f, 1.0f);
        } else if (i12 == 4) {
            this.f30435a.setScale(1.0f, -1.0f);
        } else if (i12 != 5) {
            this.f30435a.setRotate(i11, bounds.centerX(), bounds.centerY());
        } else {
            this.f30435a.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f30435a.postScale(1.0f, -1.0f);
        }
        this.f30438d.reset();
        this.f30435a.invert(this.f30438d);
        this.f30439e.set(bounds);
        this.f30438d.mapRect(this.f30439e);
        RectF rectF = this.f30439e;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
