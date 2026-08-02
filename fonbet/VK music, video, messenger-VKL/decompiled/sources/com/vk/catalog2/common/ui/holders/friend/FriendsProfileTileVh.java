package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.b5a;
import xsna.cks;
import xsna.cn70;
import xsna.enj;
import xsna.jjc;
import xsna.oq;
import xsna.pcg;
import xsna.tlo0;

/* compiled from: FriendsProfileTileVh.kt */
/* loaded from: classes16.dex */
public final class FriendsProfileTileVh implements CatalogViewHolder {
    public final b5a b;
    public final SearchStatInfoProvider c;
    public final cks d;
    public VkTile e;
    public UIBlockProfile f;

    /* compiled from: FriendsProfileTileVh.kt */
    public static final class a extends VkTile.a {
        @Override // com.vk.core.view.components.tile.VkTile.a
        public final int a(VkTile vkTile) {
            return cn70.b(4);
        }
    }

    public FriendsProfileTileVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, cks cksVar) {
        this.b = b5aVar;
        this.c = searchStatInfoProvider;
        this.d = cksVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkTile vkTile;
        Context context;
        VkTile.d dVar = null;
        UIBlockProfile uIBlockProfile = uIBlock instanceof UIBlockProfile ? (UIBlockProfile) uIBlock : null;
        if (uIBlockProfile == null) {
            return;
        }
        CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
        VkTile vkTile2 = this.e;
        if (vkTile2 == null) {
            return;
        }
        UserProfile userProfile = uIBlockProfile.A;
        this.f = uIBlockProfile;
        vkTile2.setVisualContent(new VkTile.f.a(new c.d(userProfile.g, null), new Size(cn70.b(72), cn70.b(72)), null, null, 0, 60));
        vkTile2.setTitle(new VkTile.e(oq.d(tlo0.Companion, userProfile.d), 1, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
        vkTile2.b();
        vkTile2.getContext();
        int i = uIBlockProfile.D;
        String str = catalogUserMeta.h;
        if (str == null) {
            str = (i <= 0 || (vkTile = this.e) == null || (context = vkTile.getContext()) == null) ? null : enj.f(R.plurals.friends_catalog_mutual_friends_2, i, context);
        }
        if (str != null && str.length() != 0) {
            dVar = new VkTile.d(new tlo0.h(str), 1, null, null, null, null, 60);
        }
        vkTile2.setSubtitle(dVar);
        cks cksVar = this.d;
        if (cksVar != null) {
            cksVar.c(catalogUserMeta, "friends_main_recommended_block");
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTile vkTile = new VkTile(layoutInflater.getContext(), null, 6);
        vkTile.setVisualContentType(VkTile.VisualContentType.Avatar);
        jjc.g(vkTile, new pcg(this, 24));
        vkTile.setDecorator(new a());
        vkTile.getContext();
        vkTile.setTextAlignment(VkTile.TextAlignment.Center);
        awt0.x(vkTile, 0, cn70.b(8), 0, cn70.b(8), 5);
        this.e = vkTile;
        return vkTile;
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
