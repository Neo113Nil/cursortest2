package com.vk.im.ui.views.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.auth.ui.VkAuthTextView;
import com.vk.im.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.hnj;
import xsna.hno0;

/* compiled from: VkButtonWithSmallScreenSupport.kt */
/* loaded from: classes2.dex */
public class VkButtonWithSmallScreenSupport extends FrameLayout {
    public final VkAuthTextView b;

    public VkButtonWithSmallScreenSupport(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0, R.style.VkAuth_Button_Primary);
        VkAuthTextView vkAuthTextView = (VkAuthTextView) LayoutInflater.from(getContext()).inflate(R.layout.vk_button_with_small_screen_support_layout, (ViewGroup) this, true).findViewById(R.id.vk_btn_textView);
        this.b = vkAuthTextView;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.e, 0, R.style.VkAuth_Button_Primary);
        try {
            CharSequence text = obtainStyledAttributes.getText(3);
            int resourceId = obtainStyledAttributes.getResourceId(2, -1);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            Integer valueOf = obtainStyledAttributes.hasValue(5) ? Integer.valueOf(obtainStyledAttributes.getColor(5, 0)) : null;
            setEnabled(obtainStyledAttributes.getBoolean(0, true));
            obtainStyledAttributes.recycle();
            vkAuthTextView.setText(text);
            if (resourceId != -1) {
                vkAuthTextView.setTextColorStateList(resourceId);
            }
            if (dimensionPixelSize != -1) {
                vkAuthTextView.setTextSize(0, dimensionPixelSize);
            }
            vkAuthTextView.setCompoundDrawablesWithIntrinsicBounds(resourceId2, 0, 0, 0);
            vkAuthTextView.setCompoundDrawablePadding(dimensionPixelSize2);
            hno0.a(vkAuthTextView, valueOf != null ? ColorStateList.valueOf(valueOf.intValue()) : null);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        VkAuthTextView vkAuthTextView = this.b;
        Layout layout = vkAuthTextView.getLayout();
        int lineCount = layout != null ? layout.getLineCount() : 0;
        if (lineCount <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        vkAuthTextView.setCompoundDrawables(null, null, null, null);
    }
}
