package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.appcompat.app.d;
import com.vk.ui.R$styleable;
import xsna.bwt0;
import xsna.n6f;

/* compiled from: EditTextSettingsView.kt */
/* loaded from: classes2.dex */
public final class EditTextSettingsView extends LabelSettingsView {
    public static final /* synthetic */ int C = 0;
    public Drawable A;
    public d B;
    public int y;
    public int z;

    /* compiled from: EditTextSettingsView.kt */
    public interface a {
    }

    public EditTextSettingsView(Context context) {
        super(context, null, 0, 14, 0);
        Q4(context, null, 0, 0);
    }

    public static void P4(EditTextSettingsView editTextSettingsView, EditText editText) {
        super.setSubtitle(editText.getText().toString());
        d dVar = editTextSettingsView.B;
        if (dVar != null) {
            dVar.dismiss();
        }
        editTextSettingsView.B = null;
    }

    public final void Q4(Context context, AttributeSet attributeSet, int i, int i2) {
        bwt0.i0(this, new n6f(this, 18));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k, i, i2);
        this.y = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.z = obtainStyledAttributes.getResourceId(5, 0);
        this.A = obtainStyledAttributes.getDrawable(3);
        obtainStyledAttributes.recycle();
    }

    public final Drawable getInputBackground() {
        return this.A;
    }

    public final int getInputHorizontalMargin() {
        return this.y;
    }

    public final int getInputTextAppearance() {
        return this.z;
    }

    public final a getOnValueChangeListener() {
        return null;
    }

    @Override // com.vk.im.ui.views.settings.LabelSettingsView
    public CharSequence getSubtitle() {
        return super.getSubtitle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.B;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.B = null;
    }

    public final void setInputBackground(Drawable drawable) {
        this.A = drawable;
    }

    public final void setInputHorizontalMargin(int i) {
        this.y = i;
    }

    public final void setInputTextAppearance(int i) {
        this.z = i;
    }

    @Override // com.vk.im.ui.views.settings.LabelSettingsView
    public void setSubtitle(CharSequence charSequence) {
        super.setSubtitle(charSequence);
    }

    public EditTextSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 12, 0);
        Q4(context, attributeSet, 0, 0);
    }

    public EditTextSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 8, 0);
        Q4(context, attributeSet, i, 0);
    }

    public EditTextSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Q4(context, attributeSet, i, i2);
    }

    public final void setOnValueChangeListener(a aVar) {
    }
}
