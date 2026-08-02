package com.vk.reactions.view.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.vk.feature.reactions.R$styleable;
import xsna.kjd;
import xsna.kr5;
import xsna.ljd;
import xsna.o9r0;
import xsna.z66;

/* compiled from: ClipsAvatarViewContainer.kt */
/* loaded from: classes5.dex */
public final class ClipsAvatarViewContainer extends z66<ljd> implements ljd {
    public ClipsAvatarViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        setRoundAvatarSize(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        setBorderParams(new o9r0(false, null, dimensionPixelSize != -1 ? Float.valueOf(dimensionPixelSize) : null, null, obtainStyledAttributes.getBoolean(1, false), null, null, null, null, 2027));
    }

    @Override // xsna.z66
    public final ljd b(Context context, AttributeSet attributeSet, int i) {
        return new kjd(context, attributeSet, i);
    }

    @Override // xsna.ljd
    public final void c(kr5 kr5Var) {
        getDelegate().c(kr5Var);
    }

    @Override // xsna.ljd
    public o9r0 getBorderParams() {
        return getDelegate().getBorderParams();
    }

    @Override // xsna.ljd
    public ImageView getImageView() {
        return getDelegate().getImageView();
    }

    @Override // xsna.ljd
    public int getRoundAvatarSize() {
        return getDelegate().getRoundAvatarSize();
    }

    @Override // xsna.ts5
    public View getView() {
        return getDelegate().getView();
    }

    @Override // xsna.ljd
    public void setBorderParams(o9r0 o9r0Var) {
        getDelegate().setBorderParams(o9r0Var);
    }

    @Override // xsna.ljd
    public void setRoundAvatarSize(int i) {
        getDelegate().setRoundAvatarSize(i);
    }
}
