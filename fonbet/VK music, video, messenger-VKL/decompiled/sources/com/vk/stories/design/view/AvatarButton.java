package com.vk.stories.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.iah0;
import xsna.s0w0;

/* compiled from: AvatarButton.kt */
/* loaded from: classes6.dex */
public final class AvatarButton extends LinearLayout {
    public final TextView b;
    public final VkAvatar c;

    public AvatarButton(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void setAvatarVisibility(boolean z) {
        bwt0.p0(this.c, z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setBackgroundColor(z ? getContext().getColor(R.color.vk_white) : getContext().getColor(R.color.vk_white_alpha60));
    }

    public final void setTitle(String str) {
        this.b.setText(str);
    }

    public AvatarButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public final void setTitle(int i) {
        this.b.setText(i);
    }

    public AvatarButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ AvatarButton(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public AvatarButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(0);
        setOutlineProvider(new s0w0(iah0.b(48.0f), 6));
        setClipToOutline(true);
        setForeground(dhr0.t.d(R.attr.selectableItemBackground));
        setGravity(16);
        setPadding(iah0.a(8), 0, 0, 0);
        setBackgroundColor(context.getColor(R.color.vk_white));
        View.inflate(context, R.layout.pds_avatar_button, this);
        TextView textView = (TextView) findViewById(R.id.title);
        this.b = textView;
        this.c = (VkAvatar) findViewById(R.id.avatar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.text}, i, i2);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null) {
            textView.setText(text);
        }
        obtainStyledAttributes.recycle();
    }
}
