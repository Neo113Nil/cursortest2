package com.vk.photo.editor.markup.view.tools.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.photo.editor.markup.R$styleable;
import com.vkontakte.android.R;

/* compiled from: RemoveButton.kt */
/* loaded from: classes4.dex */
public final class RemoveButton extends FrameLayout {
    public final ImageView b;
    public final int c;
    public final int d;
    public boolean e;

    public RemoveButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 14803942;
        this.d = 16735324;
        LayoutInflater.from(context).inflate(R.layout.internal_remove_button, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.image_remove);
        this.b = imageView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f, 0, R.style.RemoveButtonStyle);
        setActive(obtainStyledAttributes.getBoolean(2, this.e));
        this.c = obtainStyledAttributes.getColor(0, 14803942);
        this.d = obtainStyledAttributes.getColor(1, 16735324);
        obtainStyledAttributes.recycle();
        imageView.setColorFilter(new PorterDuffColorFilter(this.e ? this.c : this.d, PorterDuff.Mode.SRC_ATOP));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void setActive(boolean z) {
        if (this.e != z) {
            this.e = z;
            float f = z ? 1.3f : 1.0f;
            animate().scaleX(f).scaleY(f).start();
            this.b.setColorFilter(new PorterDuffColorFilter(this.e ? this.c : this.d, PorterDuff.Mode.SRC_ATOP));
        }
    }
}
