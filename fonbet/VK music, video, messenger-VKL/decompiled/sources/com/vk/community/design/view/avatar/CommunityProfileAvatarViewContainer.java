package com.vk.community.design.view.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.profile.community.impl.R$styleable;
import xsna.nz70;
import xsna.o9r0;
import xsna.qeh;
import xsna.z66;

/* compiled from: CommunityProfileAvatarViewContainer.kt */
/* loaded from: classes17.dex */
public final class CommunityProfileAvatarViewContainer extends z66<qeh> implements qeh {
    public CommunityProfileAvatarViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        n(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        boolean z = obtainStyledAttributes.getBoolean(4, false);
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        w(new o9r0(z, null, dimensionPixelSize > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.valueOf(dimensionPixelSize) : null, null, obtainStyledAttributes.getBoolean(1, false), null, null, null, null, CommonConstant.RETCODE.INDEPENDENT_AUTH_NOT_ALLOW));
        obtainStyledAttributes.recycle();
    }

    @Override // xsna.qeh
    public final void E() {
        getDelegate().E();
    }

    @Override // xsna.z66
    public final qeh b(Context context, AttributeSet attributeSet, int i) {
        return new nz70(context, attributeSet, i);
    }

    @Override // xsna.qeh
    public final void e() {
        getDelegate().e();
    }

    @Override // xsna.ts5
    public View getView() {
        return getDelegate().getView();
    }

    @Override // xsna.qeh
    public final void n(int i) {
        getDelegate().n(i);
    }

    @Override // xsna.qeh
    public void setSolidFillColor(int i) {
        getDelegate().setSolidFillColor(i);
    }

    @Override // xsna.qeh
    public final void u(qeh.a aVar, String str, boolean z, boolean z2, StoriesContainer storiesContainer, String str2) {
        getDelegate().u(aVar, str, z, z2, storiesContainer, str2);
    }

    @Override // xsna.qeh
    public final void w(o9r0 o9r0Var) {
        getDelegate().w(o9r0Var);
    }
}
