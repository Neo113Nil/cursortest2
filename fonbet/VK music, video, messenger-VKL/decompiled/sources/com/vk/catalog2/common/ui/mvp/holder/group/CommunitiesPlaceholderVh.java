package com.vk.catalog2.common.ui.mvp.holder.group;

import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import java.util.ArrayList;
import xsna.j5g;

/* compiled from: CommunitiesPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class CommunitiesPlaceholderVh extends PlaceholderVh {
    @Override // com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh
    public final void a(UIBlockPlaceholder uIBlockPlaceholder) {
        this.r = null;
        this.s = null;
        ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder.G;
        if (arrayList.size() == 1) {
            this.s = (UIBlockAction) j5g.Y(arrayList);
        } else {
            super.a(uIBlockPlaceholder);
        }
    }
}
