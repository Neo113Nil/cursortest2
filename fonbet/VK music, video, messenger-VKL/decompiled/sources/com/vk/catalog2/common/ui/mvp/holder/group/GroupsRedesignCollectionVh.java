package com.vk.catalog2.common.ui.mvp.holder.group;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.bn1;
import xsna.bwt0;
import xsna.c98;
import xsna.gxg;
import xsna.msy;
import xsna.n1i;
import xsna.oq;
import xsna.tlo0;
import xsna.u6k;
import xsna.w8i;

/* compiled from: GroupsRedesignCollectionVh.kt */
/* loaded from: classes16.dex */
public final class GroupsRedesignCollectionVh implements CatalogViewHolder, w8i {
    public gxg b;
    public UIBlockGroupsCollection c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new n1i(this, 16));

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockGroupsCollection) {
            UIBlockGroupsCollection uIBlockGroupsCollection = (UIBlockGroupsCollection) uIBlock;
            this.c = uIBlockGroupsCollection;
            gxg gxgVar = this.b;
            if (gxgVar == null) {
                gxgVar = null;
            }
            gxgVar.setTitle(new gxg.c(oq.d(tlo0.Companion, uIBlockGroupsCollection.z)));
            gxg gxgVar2 = this.b;
            if (gxgVar2 == null) {
                gxgVar2 = null;
            }
            gxgVar2.setSubtitle(new gxg.b(new tlo0.h(uIBlockGroupsCollection.B)));
            gxg gxgVar3 = this.b;
            bwt0.S(gxgVar3 != null ? gxgVar3 : null, new u6k(uIBlockGroupsCollection, 10));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gxg gxgVar = new gxg(layoutInflater.getContext());
        gxgVar.setOnClickListener(new c98(new bn1(this, 5), 1));
        this.b = gxgVar;
        return gxgVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
