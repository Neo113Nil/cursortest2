package com.vk.catalog2.common.ui.mvp.holder.friends;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import xsna.cfp0;
import xsna.cn70;
import xsna.enh;
import xsna.gko;
import xsna.i4a;
import xsna.oq;
import xsna.q5f;
import xsna.tlo0;
import xsna.u9;
import xsna.x7g;

/* compiled from: FriendsComposeHeaderIconShowAllBadgeVh.kt */
/* loaded from: classes16.dex */
public final class FriendsComposeHeaderIconShowAllBadgeVh extends ComposeHeaderIconShowAllBadgeVh {
    public static final /* synthetic */ int B = 0;

    /* compiled from: FriendsComposeHeaderIconShowAllBadgeVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickType.values().length];
            try {
                iArr[ClickType.SHOW_ALL_CHEVRON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClickType.SHOW_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh, com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh, com.vk.catalog2.common.ui.holders.ComposeHeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader == null || uIBlockHeader.D == null || !(uIBlockHeader.L instanceof UIBlockActionShowFilters)) {
            return;
        }
        x7g x7gVar = new x7g(R.attr.vk_ui_icon_primary);
        d(new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(oq.d(tlo0.Companion, ""), new q5f(this, 23), null, null, null, new VkGroupHeader.Right.ExtraContent.a.C0840a(new gko(R.drawable.vk_icon_list_24), Integer.valueOf(cn70.b(24)), x7gVar), 476), new VkGroupHeader.Right.b(new gko(R.drawable.vk_icon_sort_outline_24), x7gVar, new enh(this, 17), 4), null, 4));
        a().setOnClickListener(null);
        a().setClickable(false);
        a().setFocusable(false);
        a().setForeground(null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh, com.vk.catalog2.common.ui.holders.ComposeHeaderVh
    public final void b(ClickType clickType) {
        Serializer.StreamParcelableAdapter streamParcelableAdapter;
        UIBlockHeader uIBlockHeader = this.k;
        if (uIBlockHeader == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[clickType.ordinal()];
        if ((i != 1 || (streamParcelableAdapter = uIBlockHeader.L) == null) && (i != 2 || (streamParcelableAdapter = uIBlockHeader.D) == null)) {
            streamParcelableAdapter = null;
        }
        if (streamParcelableAdapter == null) {
            super.b(clickType);
            return;
        }
        Context context = a().getContext();
        UIBlockActionShowFilters uIBlockActionShowFilters = (UIBlockActionShowFilters) streamParcelableAdapter;
        this.r.a(new cfp0(uIBlockActionShowFilters, null));
        i4a.b(context, uIBlockActionShowFilters.A, null, new u9(7, this, context));
    }
}
