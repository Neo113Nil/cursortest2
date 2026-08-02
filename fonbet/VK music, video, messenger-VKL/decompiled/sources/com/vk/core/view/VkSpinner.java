package com.vk.core.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.jjc;
import xsna.too0;

@Deprecated
/* loaded from: classes17.dex */
public class VkSpinner extends AppCompatSpinner implements too0 {
    public VkSpinner(Context context) {
        this(context, null);
    }

    @Override // xsna.too0
    public final void Ng() {
        setPopupBackgroundDrawable(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_modal)));
        SpinnerAdapter adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
        setAdapter((SpinnerAdapter) null);
        setOnItemSelectedListener(null);
        setAdapter(adapter);
        setSelection(selectedItemPosition, false);
        setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner, android.view.View
    public final boolean performClick() {
        if (jjc.b()) {
            return false;
        }
        return super.performClick();
    }

    public VkSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public VkSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public VkSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
