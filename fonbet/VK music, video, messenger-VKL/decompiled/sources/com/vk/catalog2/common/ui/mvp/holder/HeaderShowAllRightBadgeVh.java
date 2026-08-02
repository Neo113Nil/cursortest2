package com.vk.catalog2.common.ui.mvp.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.eda;
import xsna.nda;

/* compiled from: HeaderShowAllRightBadgeVh.kt */
/* loaded from: classes16.dex */
public class HeaderShowAllRightBadgeVh extends HeaderShowAllVh {
    public HeaderShowAllRightBadgeVh(a aVar, nda ndaVar, eda edaVar, b5a b5aVar, com.vk.catalog2.common.ui.mvp.util.a aVar2, SearchStatInfoProvider searchStatInfoProvider) {
        super(aVar, ndaVar, edaVar, b5aVar, aVar2, R.layout.catalog_header_right_badge, searchStatInfoProvider);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        VkText vkText = this.i;
        if (vkText != null && bwt0.K(vkText)) {
            TextView textView = this.j;
            if (textView != null) {
                bwt0.p0(textView, false);
            }
            ImageView imageView = this.y;
            if (imageView != null) {
                bwt0.p0(imageView, false);
                return;
            }
            return;
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            bwt0.p0(imageView2, true);
        }
        ImageView imageView3 = this.y;
        if (imageView3 != null) {
            View view = this.f;
            if (view == null) {
                view = null;
            }
            imageView3.setContentDescription(view.getContext().getString(R.string.catalog_button_show_all));
        }
    }
}
