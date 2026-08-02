package com.vk.catalog2.common.ui.holders.video;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.fxc0;
import xsna.w8i;
import xsna.zvr0;

/* compiled from: VideoActionStartLiveStreamVh.kt */
/* loaded from: classes16.dex */
public final class VideoActionStartLiveStreamVh extends SimpleTextIconButtonVh implements w8i {
    public final zvr0 i;

    public VideoActionStartLiveStreamVh(zvr0 zvr0Var) {
        super(R.drawable.vk_icon_add_outline_24, R.layout.vk_catalog_action_list_item, 2);
        this.i = zvr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockAction uIBlockAction = this.h;
        if (uIBlockAction == null) {
            return;
        }
        UserId userId = uIBlockAction.g;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null) {
            return;
        }
        this.i.getClass();
        fxc0.B().a0(h, userId, null, null, "catalog_add", t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_CATALOG));
    }
}
