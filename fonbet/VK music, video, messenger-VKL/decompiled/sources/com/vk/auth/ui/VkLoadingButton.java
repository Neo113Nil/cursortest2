package com.vk.auth.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.vk.auth.common.R$styleable;
import com.vkontakte.android.R;
import xsna.anj;
import xsna.hnj;
import xsna.ozl;
import xsna.sp;

/* compiled from: VkLoadingButton.kt */
@ozl
/* loaded from: classes.dex */
public final class VkLoadingButton extends FrameLayout {
    public final VkAuthTextView b;
    public final ProgressWheel c;
    public final boolean d;

    public VkLoadingButton(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0, R.style.VkAuth_Button_Primary);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_loader_button_layout, (ViewGroup) this, true);
        VkAuthTextView vkAuthTextView = (VkAuthTextView) inflate.findViewById(R.id.vk_loading_btn_textView);
        this.b = vkAuthTextView;
        this.c = (ProgressWheel) inflate.findViewById(R.id.vk_loading_btn_progress);
        setPadding(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f, 0, R.style.VkAuth_Button_Primary);
        try {
            setText(obtainStyledAttributes.getText(1));
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(2, -1);
            boolean z = obtainStyledAttributes.getBoolean(3, false);
            this.d = z;
            obtainStyledAttributes.recycle();
            vkAuthTextView.setText(getText());
            if (resourceId2 != -1) {
                vkAuthTextView.setTextAppearance(getContext(), resourceId2);
            }
            if (resourceId != -1) {
                setTextColor(resourceId);
            }
            if (z) {
                sp.t(this);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        ProgressWheel progressWheel = this.c;
        int barColor = progressWheel.getBarColor();
        super.dispatchRestoreInstanceState(sparseArray);
        progressWheel.setBarColor(barColor);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.b.setEllipsize(truncateAt);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.d) {
            setAlpha(sp.s(z));
        }
    }

    public void setLoading(boolean z) {
        VkAuthTextView vkAuthTextView = this.b;
        ProgressWheel progressWheel = this.c;
        if (z) {
            progressWheel.setVisibility(0);
            vkAuthTextView.setVisibility(4);
            setClickable(false);
        } else {
            progressWheel.setVisibility(4);
            vkAuthTextView.setVisibility(0);
            setClickable(true);
        }
    }

    public final void setMaxLines(int i) {
        this.b.setMaxLines(i);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTextColor(int i) {
        this.b.setTextColorStateList(i);
        ColorStateList b = anj.b(i, getContext());
        this.c.setBarColor(b.getColorForState(new int[]{android.R.attr.state_enabled}, b.getDefaultColor()));
    }
}
