package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh;
import com.vkontakte.android.R;

/* compiled from: BorderlessWithIconButtonVh.kt */
/* loaded from: classes16.dex */
public final class BorderlessWithIconButtonVh extends SimpleTextIconButtonVh {
    public final com.vk.catalog2.common.ui.mvp.util.a i;

    /* compiled from: BorderlessWithIconButtonVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_CREATE_ALBUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BorderlessWithIconButtonVh(com.vk.catalog2.common.ui.mvp.util.a aVar, CatalogViewType catalogViewType) {
        super(a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1 ? R.drawable.vk_icon_list_add_outline_28 : 0, R.layout.catalog_borderless_layout, 10);
        this.i = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlockAction uIBlockAction = this.h;
        if (uIBlockAction == null || view == null || (context = view.getContext()) == null) {
            return;
        }
        com.vk.catalog2.common.ui.mvp.util.a.e(this.i, context, uIBlockAction, uIBlockAction, null, 56);
    }
}
