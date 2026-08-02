package com.vk.photo.editor.features.collage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.bxj0;
import xsna.f0g;
import xsna.peu;
import xsna.w0g;

/* compiled from: CollageBorderView.kt */
/* loaded from: classes4.dex */
public final class CollageBorderView extends View {
    public w0g b;
    public float c;
    public float d;
    public f0g e;
    public Paint f;
    public Path g;

    public CollageBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = peu.a;
        this.e = f0g.e;
        Paint paint = new Paint();
        paint.setColor(-1);
        this.f = paint;
        setClickable(false);
        setImportantForAccessibility(2);
    }

    public final void a() {
        this.g = this.c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? null : this.b.b(new Size(getWidth(), getHeight()), this.c, this.d);
    }

    public final void b() {
        float f = this.c;
        float f2 = this.d;
        String str = this.e.a;
        StringBuilder a = bxj0.a("borderWidth:", f, ", cornerRadius:", f2, ", color:");
        a.append(str);
        setContentDescription(a.toString());
    }

    public final float getBorderWidth() {
        return this.c;
    }

    public final f0g getColor() {
        return this.e;
    }

    public final float getCornerRadius() {
        return this.d;
    }

    public final w0g getGrid() {
        return this.b;
    }

    @Override // android.view.View
    public final void invalidate() {
        a();
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.g;
        if (path != null) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.f);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
        }
    }

    public final void setBorderWidth(float f) {
        this.c = f;
        b();
    }

    public final void setColor(f0g f0gVar) {
        this.e = f0gVar;
        Paint paint = new Paint();
        paint.setColor(f0gVar.b);
        this.f = paint;
        b();
    }

    public final void setCornerRadius(float f) {
        this.d = f;
        b();
    }

    public final void setGrid(w0g w0gVar) {
        this.b = w0gVar;
    }
}
