package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3322bk extends ImageView {
    public static final /* synthetic */ int b = 0;
    public double a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3322bk(Context context) {
        super(context);
        context.getClass();
        this.a = 1.0d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (size == 0) {
            setMeasuredDimension((int) (size2 * this.a), size2);
            return;
        }
        double d = this.a;
        if (size2 == 0) {
            setMeasuredDimension(size, (int) (size / d));
            return;
        }
        int i3 = (int) (size / d);
        if (i3 <= size2) {
            setMeasuredDimension(size, i3);
        } else {
            setMeasuredDimension((int) (size2 * d), size2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null || bitmap.getHeight() <= 0) {
            return;
        }
        this.a = bitmap.getWidth() / bitmap.getHeight();
        requestLayout();
    }
}
