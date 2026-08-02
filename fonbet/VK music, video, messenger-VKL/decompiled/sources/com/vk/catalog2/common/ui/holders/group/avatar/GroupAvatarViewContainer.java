package com.vk.catalog2.common.ui.holders.group.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import xsna.ahu;
import xsna.cq5;
import xsna.z66;
import xsna.zgu;

/* compiled from: GroupAvatarViewContainer.kt */
/* loaded from: classes16.dex */
public final class GroupAvatarViewContainer extends z66<zgu> implements zgu {
    public GroupAvatarViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // xsna.zgu
    public final void B(String str, boolean z, boolean z2, cq5 cq5Var) {
        getDelegate().B(str, z, z2, cq5Var);
    }

    @Override // xsna.zgu
    public final void L(int i) {
        getDelegate().L(i);
    }

    @Override // xsna.z66
    public final zgu b(Context context, AttributeSet attributeSet, int i) {
        return new ahu(context, attributeSet, i);
    }

    @Override // xsna.ts5
    public View getView() {
        return getDelegate().getView();
    }

    @Override // xsna.zgu
    public void setPlaceholderColor(int i) {
        getDelegate().setPlaceholderColor(i);
    }
}
