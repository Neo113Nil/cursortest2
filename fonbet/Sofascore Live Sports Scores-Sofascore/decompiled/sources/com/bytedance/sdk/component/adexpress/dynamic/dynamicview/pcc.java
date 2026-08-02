package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends sf {
    private final Bitmap gm;
    private final Rect sf = new Rect();
    private final Paint oo = new Paint(1);

    public pcc(Bitmap bitmap, sf sfVar) {
        this.gm = bitmap;
        if (sfVar != null) {
            this.pcc = sfVar.pcc;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        int width = rect.width();
        int width2 = this.gm.getWidth();
        int height2 = this.gm.getHeight();
        this.sf.set(0, 0, width2, height2);
        if (height2 >= height && width2 >= width) {
            if (width2 > width) {
                Rect rect2 = this.sf;
                int i = (width2 - width) / 2;
                rect2.left = i;
                rect2.right = i + width;
            }
            if (height2 > height) {
                Rect rect3 = this.sf;
                int i2 = (height2 - height) / 2;
                rect3.top = i2;
                rect3.bottom = i2 + height;
                return;
            }
            return;
        }
        float f = height;
        float f2 = f * 1.0f;
        float f3 = height2;
        float f4 = f2 / f3;
        float f5 = width;
        float f6 = 1.0f * f5;
        float f7 = width2;
        float max = Math.max(f4, f6 / f7);
        Rect rect4 = this.sf;
        if (max > f4) {
            int i3 = (int) ((f2 / f5) * f7);
            int i4 = (height2 - i3) / 2;
            rect4.top = i4;
            rect4.bottom = i4 + i3;
            return;
        }
        int i5 = (int) ((f6 / f) * f3);
        int i6 = (width2 - i5) / 2;
        rect4.left = i6;
        rect4.right = i6 + i5;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf
    public void pcc(Canvas canvas) {
        canvas.drawBitmap(this.gm, this.sf, getBounds(), this.oo);
    }
}
