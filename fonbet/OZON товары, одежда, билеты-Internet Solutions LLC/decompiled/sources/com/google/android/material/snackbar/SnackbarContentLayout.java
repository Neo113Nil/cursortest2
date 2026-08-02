package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f58509a;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f58509a = (TextView) findViewById(R.id.snackbar_text);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        boolean z11 = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        if (this.f58509a.getLayout().getLineCount() <= 1) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        boolean z12 = false;
        if (getOrientation() != 0) {
            setOrientation(0);
            z12 = true;
        }
        if (this.f58509a.getPaddingTop() == dimensionPixelSize && this.f58509a.getPaddingBottom() == dimensionPixelSize) {
            z11 = z12;
        } else {
            TextView textView = this.f58509a;
            int i13 = Y.f42258g;
            if (textView.isPaddingRelative()) {
                textView.setPaddingRelative(textView.getPaddingStart(), dimensionPixelSize, textView.getPaddingEnd(), dimensionPixelSize);
            } else {
                textView.setPadding(textView.getPaddingLeft(), dimensionPixelSize, textView.getPaddingRight(), dimensionPixelSize);
            }
        }
        if (z11) {
            super.onMeasure(i11, i12);
        }
    }
}
