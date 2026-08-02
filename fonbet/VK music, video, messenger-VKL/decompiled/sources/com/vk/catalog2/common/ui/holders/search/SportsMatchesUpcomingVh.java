package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSportMatch;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bha;

/* compiled from: SportsMatchesUpcomingVh.kt */
/* loaded from: classes16.dex */
public final class SportsMatchesUpcomingVh implements CatalogViewHolder {
    public final b5a b;
    public bha c;
    public bha d;

    public SportsMatchesUpcomingVh(b5a b5aVar) {
        this.b = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            UIBlock uIBlock2 = uIBlockList.y.get(0);
            UIBlockSportMatch uIBlockSportMatch = uIBlock2 instanceof UIBlockSportMatch ? (UIBlockSportMatch) uIBlock2 : null;
            bha bhaVar = this.c;
            b5a b5aVar = this.b;
            if (bhaVar != null && uIBlockSportMatch != null) {
                bhaVar.setUiData(uIBlockSportMatch);
                bhaVar.setCatalogEventsBus(b5aVar);
            }
            UIBlock uIBlock3 = uIBlockList.y.get(1);
            UIBlockSportMatch uIBlockSportMatch2 = uIBlock3 instanceof UIBlockSportMatch ? (UIBlockSportMatch) uIBlock3 : null;
            bha bhaVar2 = this.d;
            if (bhaVar2 == null || uIBlockSportMatch2 == null) {
                return;
            }
            bhaVar2.setUiData(uIBlockSportMatch2);
            bhaVar2.setCatalogEventsBus(b5aVar);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        this.c = new bha(context);
        this.d = new bha(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.catalog_sport_matches_upcoming_vh);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(this.c);
        linearLayout.addView(this.d);
        return linearLayout;
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
