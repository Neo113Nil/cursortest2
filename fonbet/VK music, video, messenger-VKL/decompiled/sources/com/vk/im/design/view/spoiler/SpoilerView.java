package com.vk.im.design.view.spoiler;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import xsna.amk0;
import xsna.f550;

/* compiled from: SpoilerView.kt */
/* loaded from: classes2.dex */
public final class SpoilerView extends View {
    public static final /* synthetic */ int c = 0;
    public final amk0 b;

    public SpoilerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.d();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.e();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.a(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.c(getWidth(), getHeight());
    }

    public SpoilerView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = new amk0(new f550(this, 29));
    }
}
