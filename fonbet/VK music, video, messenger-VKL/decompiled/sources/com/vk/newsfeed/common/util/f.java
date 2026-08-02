package com.vk.newsfeed.common.util;

import android.content.Context;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.fave.entities.FavePage;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.util.a;
import com.vkontakte.android.R;
import xsna.ba60;

/* compiled from: FavePageActionsMenuBuilder.kt */
/* loaded from: classes4.dex */
public final class f extends c {
    public final FavePage c;

    public f(FavePage favePage) {
        this.c = favePage;
    }

    @Override // com.vk.newsfeed.common.util.c
    public final boolean c(ba60 ba60Var) {
        ba60.L0(ba60Var, PostActions.ACTION_CUSTOMIZE_TAGS.h(), R.string.menu_item_customize_tags, R.drawable.vk_icon_tag_outline_28, 0, 24);
        boolean z = this.c.h;
        ba60.L0(ba60Var, PostActions.ACTION_TOGGLE_FAVE.h(), z ? R.string.fave_remove_title : R.string.menu_item_fave_add_title, z ? R.drawable.vk_icon_bookmark_slash_outline_24 : R.drawable.vk_icon_bookmark_outline_24, 0, 24);
        return true;
    }

    @Override // com.vk.newsfeed.common.util.c
    public final VkContextMenu d(Context context, a.AbstractC1374a abstractC1374a) {
        return null;
    }
}
