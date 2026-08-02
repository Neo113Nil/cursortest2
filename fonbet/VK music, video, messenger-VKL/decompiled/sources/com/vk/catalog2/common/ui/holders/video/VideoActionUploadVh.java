package com.vk.catalog2.common.ui.holders.video;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.mot0;

/* compiled from: VideoActionUploadVh.kt */
/* loaded from: classes16.dex */
public final class VideoActionUploadVh extends SimpleTextIconButtonVh {
    public final mot0 i;

    public VideoActionUploadVh() {
        super(R.drawable.vk_icon_upload_outline_24, R.layout.vk_catalog_action_list_item, 2);
        this.i = mot0.a.a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockAction uIBlockAction;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockAction = this.h) == null) {
            return;
        }
        mot0.b(this.i, h, uIBlockAction.g, 0, null, 28);
    }
}
