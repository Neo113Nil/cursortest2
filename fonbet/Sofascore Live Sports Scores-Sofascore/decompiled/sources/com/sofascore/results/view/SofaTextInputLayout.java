package com.sofascore.results.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.qzb;
import defpackage.ujf;
import defpackage.xah;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/sofascore/results/view/SofaTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "", "boxBackgroundColor", "", "setBoxBackgroundColor", "(I)V", "Landroid/content/res/ColorStateList;", "boxStrokeColorStateList", "setBoxStrokeColorStateList", "(Landroid/content/res/ColorStateList;)V", "", "errorText", "setError", "(Ljava/lang/CharSequence;)V", "text", "setTextNoAnimation", "", "getOutlineStrokeWidth", "()F", "outlineStrokeWidth", "", "getText", "()Ljava/lang/String;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SofaTextInputLayout extends TextInputLayout {
    public final AttributeSet E0;
    public final xah F0;
    public qzb G0;
    public int H0;
    public int I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SofaTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.E0 = attributeSet;
        xah a = xah.h(context, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout).a();
        this.F0 = a;
        qzb qzbVar = new qzb(a);
        qzbVar.t(ColorStateList.valueOf(getBoxBackgroundColor()));
        qzbVar.A(getOutlineStrokeWidth());
        this.G0 = qzbVar;
    }

    private final float getOutlineStrokeWidth() {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.E0, ujf.p, 0, 0);
        obtainStyledAttributes.getClass();
        getContext().getClass();
        float dimension = obtainStyledAttributes.getDimension(0, ao2.s(1, r4));
        obtainStyledAttributes.recycle();
        return dimension;
    }

    public final void A() {
        int i;
        EditText editText;
        EditText editText2;
        if (this.G0 == null) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = getEditText()) != null && editText2.hasFocus());
        if (isHovered() || ((editText = getEditText()) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            setAlpha(0.7f);
        }
        if (getError() != null) {
            ColorStateList boxStrokeErrorColor = getBoxStrokeErrorColor();
            if (boxStrokeErrorColor == null) {
                return;
            } else {
                i = boxStrokeErrorColor.getDefaultColor();
            }
        } else {
            i = z2 ? this.H0 : z ? this.H0 : this.I0;
        }
        setBoxStrokeColor(i);
        qzb qzbVar = this.G0;
        if (qzbVar != null) {
            qzbVar.y(ColorStateList.valueOf(getBoxStrokeColor()));
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        if (view instanceof EditText) {
            ((EditText) view).setBackground(this.G0);
            if (!this.D) {
                Context context = getContext();
                context.getClass();
                int s = ao2.s(0, context);
                Context context2 = getContext();
                context2.getClass();
                view.setPadding(view.getPaddingLeft(), s, view.getPaddingRight(), ao2.s(0, context2));
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A();
    }

    @Nullable
    public final String getText() {
        Editable text;
        EditText editText = getEditText();
        if (editText == null || (text = editText.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setBoxBackgroundColor(int boxBackgroundColor) {
        qzb qzbVar = new qzb(this.F0);
        qzbVar.t(ColorStateList.valueOf(boxBackgroundColor));
        qzbVar.A(getOutlineStrokeWidth());
        this.G0 = qzbVar;
        EditText editText = getEditText();
        if (editText != null) {
            editText.setBackground(this.G0);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setBoxStrokeColorStateList(@NotNull ColorStateList boxStrokeColorStateList) {
        boxStrokeColorStateList.getClass();
        if (boxStrokeColorStateList.isStateful()) {
            this.I0 = boxStrokeColorStateList.getDefaultColor();
            this.H0 = boxStrokeColorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.H0 != boxStrokeColorStateList.getDefaultColor()) {
            this.H0 = boxStrokeColorStateList.getDefaultColor();
        }
        A();
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(@Nullable CharSequence errorText) {
        setErrorEnabled(true ^ (errorText == null || errorText.length() == 0));
        super.setError(errorText);
        A();
    }

    public final void setTextNoAnimation(@Nullable CharSequence text) {
        setHintAnimationEnabled(false);
        EditText editText = getEditText();
        if (editText != null) {
            editText.setText(text);
        }
        setHintAnimationEnabled(true);
    }
}
