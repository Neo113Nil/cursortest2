package com.vk.photo.editor.features.markup.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: TextAddButton.kt */
/* loaded from: classes4.dex */
public final class TextAddButton extends FrameLayout {
    public TextAddButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.feature_text_internal_add_button, (ViewGroup) this, true);
        setFocusable(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }
}
