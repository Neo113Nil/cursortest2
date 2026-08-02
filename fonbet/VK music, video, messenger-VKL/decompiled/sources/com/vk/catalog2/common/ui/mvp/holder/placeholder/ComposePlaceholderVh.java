package com.vk.catalog2.common.ui.mvp.holder.placeholder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionAddVideos;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.util.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import java.util.Iterator;
import xsna.m84;
import xsna.oq;
import xsna.tlo0;
import xsna.yk;

/* compiled from: ComposePlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class ComposePlaceholderVh implements CatalogViewHolder {
    public final a b;
    public VkPlaceholder c;
    public UIBlockAction d;
    public UIBlockAction e;

    public ComposePlaceholderVh(a aVar) {
        this.b = aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        a aVar;
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            VkPlaceholder vkPlaceholder = this.c;
            VkPlaceholder.a aVar2 = null;
            if (vkPlaceholder != null) {
                tlo0.h d = oq.d(tlo0.Companion, uIBlockPlaceholder.A);
                String str = uIBlockPlaceholder.D;
                if (str == null) {
                    str = "";
                }
                vkPlaceholder.setMiddle(new VkPlaceholder.b(d, new tlo0.h(str), (com.vk.core.compose.component.semantics.a) null, 10));
            }
            this.d = null;
            this.e = null;
            Iterator<T> it = uIBlockPlaceholder.G.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                aVar = this.b;
                if (!hasNext) {
                    break;
                }
                UIBlockAction uIBlockAction = (UIBlockAction) it.next();
                if (this.d == null) {
                    aVar.getClass();
                    if (a.d(uIBlockAction)) {
                        this.d = uIBlockAction;
                    }
                } else if (this.e == null) {
                    aVar.getClass();
                    if (a.d(uIBlockAction)) {
                        this.e = uIBlockAction;
                    }
                }
            }
            UIBlockAction uIBlockAction2 = this.d;
            aVar.getClass();
            String str2 = uIBlockAction2 instanceof UIBlockActionAddVideos ? ((UIBlockActionAddVideos) uIBlockAction2).z : null;
            UIBlockAction uIBlockAction3 = this.e;
            String str3 = uIBlockAction3 instanceof UIBlockActionAddVideos ? ((UIBlockActionAddVideos) uIBlockAction3).z : null;
            VkPlaceholder vkPlaceholder2 = this.c;
            if (vkPlaceholder2 != null) {
                if (str2 != null) {
                    aVar2 = new VkPlaceholder.a(new VkPlaceholder.a.C0854a(oq.d(tlo0.Companion, str2), new yk(4, this, uIBlockPlaceholder), null, null, null, null, null, false, null, 2044), str3 != null ? new VkPlaceholder.a.C0854a(new tlo0.h(str3), new m84(7, this, uIBlockPlaceholder), null, null, null, null, null, false, null, 2044) : null, 4);
                }
                vkPlaceholder2.setBottom(aVar2);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkPlaceholder vkPlaceholder = new VkPlaceholder(layoutInflater.getContext(), null, 6);
        this.c = vkPlaceholder;
        return vkPlaceholder;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
