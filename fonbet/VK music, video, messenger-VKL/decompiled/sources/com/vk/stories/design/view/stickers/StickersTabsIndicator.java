package com.vk.stories.design.view.stickers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import xsna.dhr0;

/* compiled from: StickersTabsIndicator.kt */
/* loaded from: classes6.dex */
public final class StickersTabsIndicator extends View {
    public final Paint b;

    public StickersTabsIndicator(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(getLeft(), getTop(), getRight(), getBottom(), this.b);
    }

    public StickersTabsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public StickersTabsIndicator(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ StickersTabsIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public StickersTabsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(dhr0.Y(R.attr.vk_ui_background_secondary, context));
        this.b = paint;
    }
}
