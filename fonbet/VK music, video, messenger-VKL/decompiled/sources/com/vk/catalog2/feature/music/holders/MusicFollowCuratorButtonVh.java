package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionCuratorSubscription;
import com.vk.catalog2.common.ui.holders.SimpleTextVkUiIconButtonVh;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.music.Curator;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.Collections;
import xsna.brj0;
import xsna.c750;
import xsna.ca10;
import xsna.du0;
import xsna.dw20;
import xsna.ff3;
import xsna.hs00;
import xsna.ue40;

/* compiled from: MusicFollowCuratorButtonVh.kt */
/* loaded from: classes16.dex */
public final class MusicFollowCuratorButtonVh extends SimpleTextVkUiIconButtonVh {
    public final c750 d;
    public UIBlockActionCuratorSubscription e;
    public c f;
    public dw20 g;

    public MusicFollowCuratorButtonVh(c750 c750Var) {
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
        UIBlockActionCuratorSubscription uIBlockActionCuratorSubscription = uIBlock instanceof UIBlockActionCuratorSubscription ? (UIBlockActionCuratorSubscription) uIBlock : null;
        if (uIBlockActionCuratorSubscription == null) {
            return;
        }
        b(uIBlockActionCuratorSubscription.A);
        this.e = uIBlockActionCuratorSubscription;
    }

    public final void b(boolean z) {
        if (z) {
            VkButton vkButton = this.c;
            (vkButton != null ? vkButton : null).setText(R.string.music_curator_followed);
            a(R.drawable.vk_icon_done_outline_24);
        } else {
            VkButton vkButton2 = this.c;
            (vkButton2 != null ? vkButton2 : null).setText(R.string.music_follow_curator);
            a(R.drawable.vk_icon_add_24);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlockActionCuratorSubscription uIBlockActionCuratorSubscription = this.e;
        if (uIBlockActionCuratorSubscription == null || view == null || (context = view.getContext()) == null || this.f != null) {
            return;
        }
        if (uIBlockActionCuratorSubscription.A) {
            this.g = new dw20.b(context, null).P(Collections.singletonList(new brj0(0, 0, null, 0, context.getString(R.string.music_unfollow_curator), true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126894)), new du0(18, this, uIBlockActionCuratorSubscription)).I0(null);
        } else {
            this.f = this.d.c(new Curator(uIBlockActionCuratorSubscription.z, null, null, null, null, false, false, null, 254, null)).subscribe(new ca10(new ue40(1, this, uIBlockActionCuratorSubscription), 3), new ff3(new hs00(this, 9), 21));
        }
    }
}
