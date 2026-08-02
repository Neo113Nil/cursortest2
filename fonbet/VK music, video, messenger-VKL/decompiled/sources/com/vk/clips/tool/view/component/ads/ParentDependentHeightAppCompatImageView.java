package com.vk.clips.tool.view.component.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import xsna.iah0;

/* compiled from: ParentDependentHeightAppCompatImageView.kt */
/* loaded from: classes17.dex */
public final class ParentDependentHeightAppCompatImageView extends AppCompatImageView {
    public float b;
    public int c;

    public ParentDependentHeightAppCompatImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 0.05f;
        this.c = iah0.a(40);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), Math.max((int) (View.MeasureSpec.getSize(i2) * this.b), this.c));
    }
}
