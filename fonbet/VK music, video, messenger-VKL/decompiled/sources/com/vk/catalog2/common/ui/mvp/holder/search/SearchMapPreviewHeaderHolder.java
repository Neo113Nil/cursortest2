package com.vk.catalog2.common.ui.mvp.holder.search;

import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.e43;
import xsna.eda;
import xsna.j5g;
import xsna.m3a;
import xsna.nda;
import xsna.yyh0;

/* compiled from: SearchMapPreviewHeaderHolder.kt */
/* loaded from: classes16.dex */
public final class SearchMapPreviewHeaderHolder extends HeaderIconShowAllBadgeVh {
    public final m3a C;

    public SearchMapPreviewHeaderHolder(com.vk.catalog2.common.ui.mvp.configuration.a aVar, nda ndaVar, eda edaVar, b5a b5aVar, com.vk.catalog2.common.ui.mvp.util.a aVar2, SearchStatInfoProvider searchStatInfoProvider, m3a m3aVar) {
        super(aVar, ndaVar, edaVar, b5aVar, aVar2, searchStatInfoProvider, true);
        this.C = m3aVar;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!j5g.P(e43.l(Integer.valueOf(R.id.show_all_btn), Integer.valueOf(R.id.header_show_all)), view != null ? Integer.valueOf(view.getId()) : null)) {
            super.onClick(view);
            return;
        }
        UIBlockHeader uIBlockHeader = this.k;
        if ((uIBlockHeader != null ? uIBlockHeader.E : null) != null) {
            this.C.j(yyh0.a);
        } else {
            super.onClick(view);
        }
    }
}
