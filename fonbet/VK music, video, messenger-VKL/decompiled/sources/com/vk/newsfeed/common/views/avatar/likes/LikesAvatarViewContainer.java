package com.vk.newsfeed.common.views.avatar.likes;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.newsfeed.common.R$styleable;
import xsna.cq5;
import xsna.o9r0;
import xsna.s6z;
import xsna.t6z;
import xsna.z66;

/* compiled from: LikesAvatarViewContainer.kt */
/* loaded from: classes4.dex */
public final class LikesAvatarViewContainer extends z66<t6z> implements t6z {
    public LikesAvatarViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        setBorderParams(new o9r0(false, null, dimensionPixelSize != -1 ? Float.valueOf(dimensionPixelSize) : null, null, obtainStyledAttributes.getBoolean(1, false), null, null, null, null, 2027));
    }

    @Override // xsna.t6z
    public final void a(String str, AvatarBorderType avatarBorderType, cq5 cq5Var) {
        getDelegate().a(str, avatarBorderType, cq5Var);
    }

    @Override // xsna.z66
    public final t6z b(Context context, AttributeSet attributeSet, int i) {
        return new s6z(context, attributeSet, i);
    }

    @Override // xsna.t6z
    public o9r0 getBorderParams() {
        return getDelegate().getBorderParams();
    }

    @Override // xsna.ts5
    public View getView() {
        return getDelegate().getView();
    }

    @Override // xsna.t6z
    public void setBorderParams(o9r0 o9r0Var) {
        getDelegate().setBorderParams(o9r0Var);
    }
}
