package com.vk.voip.ui.avatars;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.im.ImageList;
import com.vk.voip.ui.R$styleable;
import xsna.cq5;
import xsna.kr5;
import xsna.o9r0;
import xsna.sew0;
import xsna.tew0;
import xsna.uew0;
import xsna.z66;

/* compiled from: VoipAvatarViewContainer.kt */
/* loaded from: classes7.dex */
public final class VoipAvatarViewContainer extends z66<uew0> implements uew0 {
    public VoipAvatarViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k);
        setRoundAvatarSize(obtainStyledAttributes.getDimensionPixelSize(1, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        setBorderParams(new o9r0(false, null, dimensionPixelSize > 0 ? Float.valueOf(dimensionPixelSize) : null, null, false, null, null, null, null, 2043));
    }

    @Override // xsna.uew0
    public final void O(sew0 sew0Var) {
        getDelegate().O(sew0Var);
    }

    @Override // xsna.uew0
    public final void a(String str, AvatarBorderType avatarBorderType, cq5 cq5Var) {
        getDelegate().a(str, avatarBorderType, cq5Var);
    }

    @Override // xsna.z66
    public final uew0 b(Context context, AttributeSet attributeSet, int i) {
        return new tew0(context, attributeSet, i);
    }

    @Override // xsna.uew0
    public final void c(kr5 kr5Var) {
        getDelegate().c(kr5Var);
    }

    @Override // xsna.uew0
    public o9r0 getBorderParams() {
        return getDelegate().getBorderParams();
    }

    @Override // xsna.uew0
    public int getRoundAvatarSize() {
        return getDelegate().getRoundAvatarSize();
    }

    @Override // xsna.ts5
    public View getView() {
        return getDelegate().getView();
    }

    @Override // xsna.uew0
    public final void o(ImageList imageList, AvatarBorderType avatarBorderType, cq5 cq5Var, Drawable drawable) {
        getDelegate().o(imageList, avatarBorderType, cq5Var, drawable);
    }

    @Override // xsna.uew0
    public void setBorderParams(o9r0 o9r0Var) {
        getDelegate().setBorderParams(o9r0Var);
    }

    @Override // xsna.uew0
    public void setRoundAvatarSize(int i) {
        getDelegate().setRoundAvatarSize(i);
    }

    @Override // xsna.uew0
    public void setupOverlay(Drawable drawable) {
        getDelegate().setupOverlay(drawable);
    }
}
