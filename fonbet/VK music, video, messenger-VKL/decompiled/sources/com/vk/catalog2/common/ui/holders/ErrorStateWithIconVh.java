package com.vk.catalog2.common.ui.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.view.CatalogErrorViewWithIcon;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vkontakte.android.R;
import xsna.d3m;
import xsna.dhh;
import xsna.om1;
import xsna.y6;

/* compiled from: ErrorStateWithIconVh.kt */
/* loaded from: classes16.dex */
public final class ErrorStateWithIconVh extends ErrorStateVh {
    public final AuthorsCatalogRootVh f;
    public final y6 g;
    public io.reactivex.rxjava3.disposables.c h;
    public CatalogErrorViewWithIcon i;

    public ErrorStateWithIconVh(AuthorsCatalogRootVh authorsCatalogRootVh, y6 y6Var) {
        super(authorsCatalogRootVh, y6Var);
        this.f = authorsCatalogRootVh;
        this.g = y6Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        try {
            io.reactivex.rxjava3.disposables.c cVar = this.h;
            if (cVar != null) {
                cVar.dispose();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh
    public final void b(Throwable th) {
        CatalogErrorViewWithIcon catalogErrorViewWithIcon = this.i;
        if (catalogErrorViewWithIcon == null) {
            catalogErrorViewWithIcon = null;
        }
        catalogErrorViewWithIcon.setVisibility(0);
        CatalogErrorViewWithIcon catalogErrorViewWithIcon2 = this.i;
        CatalogErrorViewWithIcon catalogErrorViewWithIcon3 = catalogErrorViewWithIcon2 == null ? null : catalogErrorViewWithIcon2;
        String string = (catalogErrorViewWithIcon2 != null ? catalogErrorViewWithIcon2 : null).getContext().getString(R.string.vk_video_authors_screen_error_state_text);
        catalogErrorViewWithIcon3.getClass();
        catalogErrorViewWithIcon3.b.setImageResource(R.drawable.vk_icon_illustration_antenna_light_56);
        d3m.c(catalogErrorViewWithIcon3.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (string != null) {
            catalogErrorViewWithIcon3.c.setText(string);
            d3m.c(catalogErrorViewWithIcon3.c, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        d3m.c(catalogErrorViewWithIcon3.d, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.vk.core.utils.newtork.b.a.getClass();
        this.h = com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new om1(new dhh(this, 10), 16));
        View inflate = layoutInflater.inflate(R.layout.vk_video_catalog_error_with_icon_layout, viewGroup, false);
        inflate.getContext();
        CatalogErrorViewWithIcon catalogErrorViewWithIcon = (CatalogErrorViewWithIcon) inflate.findViewById(R.id.error_view);
        catalogErrorViewWithIcon.setOnRetryClickListener(this.g);
        this.i = catalogErrorViewWithIcon;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.ErrorStateVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }
}
