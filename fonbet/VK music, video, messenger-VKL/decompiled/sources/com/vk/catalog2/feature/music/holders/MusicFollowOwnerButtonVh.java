package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicFollowOwnerButton;
import com.vk.catalog2.common.ui.holders.SimpleTextVkUiIconButtonVh;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.components.button.VkButton;
import com.vk.libvideo.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.Collections;
import xsna.brj0;
import xsna.c750;
import xsna.dw20;
import xsna.h440;
import xsna.ju;
import xsna.uk40;
import xsna.vk40;

/* compiled from: MusicFollowOwnerButtonVh.kt */
/* loaded from: classes16.dex */
public final class MusicFollowOwnerButtonVh extends SimpleTextVkUiIconButtonVh {
    public final c750 d;
    public UIBlockMusicFollowOwnerButton e;
    public c f;
    public dw20 g;

    public MusicFollowOwnerButtonVh(c750 c750Var) {
        this.d = c750Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
        dw20 dw20Var = this.g;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.g = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockMusicFollowOwnerButton uIBlockMusicFollowOwnerButton = uIBlock instanceof UIBlockMusicFollowOwnerButton ? (UIBlockMusicFollowOwnerButton) uIBlock : null;
        this.e = uIBlockMusicFollowOwnerButton;
        b(uIBlockMusicFollowOwnerButton != null ? uIBlockMusicFollowOwnerButton.A : false);
    }

    public final void b(boolean z) {
        if (z) {
            VkButton vkButton = this.c;
            (vkButton != null ? vkButton : null).setText(R.string.music_owner_followed);
            a(R.drawable.vk_icon_done_outline_24);
        } else {
            VkButton vkButton2 = this.c;
            (vkButton2 != null ? vkButton2 : null).setText(R.string.music_follow_owner);
            a(R.drawable.vk_icon_add_24);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlockMusicFollowOwnerButton uIBlockMusicFollowOwnerButton = this.e;
        if (uIBlockMusicFollowOwnerButton == null || view == null || (context = view.getContext()) == null || this.f != null) {
            return;
        }
        if (uIBlockMusicFollowOwnerButton.A) {
            this.g = new dw20.b(context, null).P(Collections.singletonList(new brj0(0, 0, null, 0, context.getString(R.string.music_unfollow_owner), true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126894)), new b(21, this, uIBlockMusicFollowOwnerButton)).I0(null);
        } else {
            this.f = this.d.d(uIBlockMusicFollowOwnerButton.z).subscribe(new uk40(new ju(14, this, uIBlockMusicFollowOwnerButton), 0), new vk40(new h440(this, 1), 0));
        }
    }
}
