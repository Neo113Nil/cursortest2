package com.vk.photos.ui.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import xsna.iah0;

/* compiled from: AddPhotoContentFrameLayout.kt */
/* loaded from: classes3.dex */
public final class AddPhotoContentFrameLayout extends FrameLayout {
    public AddPhotoContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i2) * 0.777f) - iah0.a(48)), 1073741824));
    }
}
