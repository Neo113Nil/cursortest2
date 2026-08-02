package com.vk.catalog2.common.ui.mvp.holder.container;

import android.database.DataSetObserver;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;

/* compiled from: VkTabsVh.kt */
/* loaded from: classes16.dex */
public final class c extends DataSetObserver {
    public final /* synthetic */ VkTabsVh a;

    public c(VkTabsVh vkTabsVh) {
        this.a = vkTabsVh;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        VkTabsVh vkTabsVh = this.a;
        UIBlockCatalog uIBlockCatalog = vkTabsVh.s;
        if (uIBlockCatalog != null) {
            vkTabsVh.k.b(uIBlockCatalog);
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        super.onInvalidated();
        VkTabsVh vkTabsVh = this.a;
        UIBlockCatalog uIBlockCatalog = vkTabsVh.s;
        if (uIBlockCatalog != null) {
            vkTabsVh.k.b(uIBlockCatalog);
        }
    }
}
