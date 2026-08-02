package com.vk.notifications.core.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.notifications.core.R$styleable;
import xsna.a870;
import xsna.cq5;
import xsna.iah0;
import xsna.mk6;
import xsna.o9r0;
import xsna.z66;
import xsna.z770;

/* compiled from: NotificationAvatarViewContainer.kt */
/* loaded from: classes4.dex */
public final class NotificationAvatarViewContainer extends z66<a870> implements a870 {
    public static final RoundingParams c = RoundingParams.a();
    public static final RoundingParams d = RoundingParams.b(iah0.a(2.0f));

    public NotificationAvatarViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.a870
    public final void a(String str, AvatarBorderType avatarBorderType, cq5 cq5Var) {
        getDelegate().a(str, avatarBorderType, cq5Var);
    }

    @Override // xsna.z66
    public final a870 b(Context context, AttributeSet attributeSet, int i) {
        return new z770(context, attributeSet, i);
    }

    @Override // xsna.a870
    public final void clear() {
        getDelegate().clear();
    }

    @Override // xsna.a870
    public final void f(mk6 mk6Var, boolean z) {
        getDelegate().f(mk6Var, z);
    }

    @Override // xsna.a870
    public o9r0 getBorderParams() {
        return getDelegate().getBorderParams();
    }

    @Override // xsna.a870
    public int getRoundAvatarSize() {
        return getDelegate().getRoundAvatarSize();
    }

    @Override // xsna.ts5
    public View getView() {
        return getDelegate().getView();
    }

    @Override // xsna.a870
    public void setBorderParams(o9r0 o9r0Var) {
        getDelegate().setBorderParams(o9r0Var);
    }

    @Override // xsna.a870
    public void setOverlay(Drawable drawable) {
        getDelegate().setOverlay(drawable);
    }

    @Override // xsna.a870
    public void setPlaceholder(Drawable drawable) {
        getDelegate().setPlaceholder(drawable);
    }

    @Override // xsna.a870
    public void setRoundAvatarSize(int i) {
        getDelegate().setRoundAvatarSize(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationAvatarViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        setRoundAvatarSize(obtainStyledAttributes.getDimensionPixelSize(1, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        setBorderParams(new o9r0(false, null, dimensionPixelSize != -1 ? Float.valueOf(dimensionPixelSize) : null, null, false, null, null, null, null, 2043));
    }
}
