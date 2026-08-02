package com.vk.photogallery.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.hv1;
import xsna.rl3;

/* compiled from: WrapContentAutoSizingTextView.kt */
/* loaded from: classes4.dex */
public final class WrapContentAutoSizingTextView extends AppCompatTextView {
    public int[] b;

    public WrapContentAutoSizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setText$lambda$0(WrapContentAutoSizingTextView wrapContentAutoSizingTextView) {
        int[] iArr = wrapContentAutoSizingTextView.b;
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                wrapContentAutoSizingTextView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int[] autoSizeTextAvailableSizes = getAutoSizeTextAvailableSizes();
        if (autoSizeTextAvailableSizes.length != 0) {
            this.b = autoSizeTextAvailableSizes;
        }
        int[] iArr = this.b;
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                setAutoSizeTextTypeWithDefaults(0);
                setTextSize(0, rl3.a0(iArr));
            }
        }
        super.setText(charSequence, bufferType);
        post(new hv1(this, 24));
    }
}
