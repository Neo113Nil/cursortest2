package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.drm0;
import xsna.nda;

/* compiled from: ActionOpenSectionVh.kt */
/* loaded from: classes16.dex */
public final class ActionOpenSectionVh implements CatalogViewHolder, View.OnClickListener {
    public final a b;
    public final nda c;
    public final b5a d;
    public final SearchStatInfoProvider e;
    public VkGroupItem f;
    public UIBlockActionOpenSection g;

    public ActionOpenSectionVh(a aVar, nda ndaVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this.b = aVar;
        this.c = ndaVar;
        this.d = b5aVar;
        this.e = searchStatInfoProvider;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlock instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) uIBlock : null;
        if (uIBlockActionOpenSection == null) {
            return;
        }
        this.g = uIBlockActionOpenSection;
        VkGroupItem vkGroupItem = this.f;
        if (vkGroupItem == null) {
            return;
        }
        String str = ((UIBlockActionOpenSection) uIBlock).z;
        if (!drm0.N(str)) {
            vkGroupItem.setText(str);
        }
        vkGroupItem.setRightIconType(VkGroupItem.IconType.Chevron);
        VkGroupItem.b(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_chevron_16), null, 6);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_action_open_show_all, viewGroup, false);
        inflate.findViewById(R.id.button).setOnClickListener(new c98(this, 1));
        this.f = (VkGroupItem) inflate.findViewById(R.id.button_text);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlockActionOpenSection uIBlockActionOpenSection;
        if (view == null || (context = view.getContext()) == null || (uIBlockActionOpenSection = this.g) == null) {
            return;
        }
        SearchStatsLoggingInfo b = this.e.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true);
        this.d.a(new cfp0(uIBlockActionOpenSection, null));
        nda.e(this.c, context, this.b, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, null, b, null, PsExtractor.AUDIO_STREAM);
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
