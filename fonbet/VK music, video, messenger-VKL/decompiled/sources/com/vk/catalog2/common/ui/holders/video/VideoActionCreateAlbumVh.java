package com.vk.catalog2.common.ui.holders.video;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.fkq0;
import xsna.fxc0;
import xsna.g7s0;

/* compiled from: VideoActionCreateAlbumVh.kt */
/* loaded from: classes16.dex */
public final class VideoActionCreateAlbumVh extends SimpleTextIconButtonVh {
    public final UserId i;
    public final g7s0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoActionCreateAlbumVh(UserId userId, int i) {
        super((i & 8) != 0 ? R.drawable.vk_icon_add_outline_24 : R.drawable.vk_icon_add_24, (i & 4) != 0 ? R.layout.vk_catalog_action_list_item : R.layout.catalog2_action_list_item_tablet, 2);
        g7s0 B = fxc0.B();
        this.i = userId;
        this.j = B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        UserId userId = this.i;
        fkq0.b(userId);
        int i = g7s0.G7;
        this.j.n(context, userId);
    }
}
