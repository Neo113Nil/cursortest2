package com.vk.stickers.keyboard.navigation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.keyboard.navigation.a;
import com.vkontakte.android.R;
import xsna.ahn;
import xsna.bwt0;
import xsna.ewp0;
import xsna.ogy;
import xsna.vfz;

/* compiled from: KeyboardNavigationUgcPackHolder.kt */
/* loaded from: classes6.dex */
public final class e extends vfz<ogy> implements View.OnClickListener {
    public final a.InterfaceC1801a l;
    public final VKImageView m;
    public final ImageView n;
    public ewp0 o;

    public e(ViewGroup viewGroup, com.vk.stickers.keyboard.c cVar) {
        super(R.layout.stickers_keyboard_navigation_ugc_holder, viewGroup);
        this.l = cVar;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.sticker_nav_image);
        this.m = vKImageView;
        this.n = (ImageView) this.itemView.findViewById(R.id.sticker_nav_new_badge);
        bwt0.h0(this, vKImageView);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(ogy ogyVar) {
        ogy ogyVar2 = ogyVar;
        this.o = ogyVar2.b;
        String string = this.itemView.getContext().getString(R.string.stickers_ugc);
        VKImageView vKImageView = this.m;
        vKImageView.setContentDescription(string);
        bwt0.p0(this.n, ogyVar2.c);
        vKImageView.setImageDrawable(ahn.r(R.drawable.vk_icon_ugc_chat_sticker_outline_36));
        vKImageView.setSelected(ogyVar2.d);
        vKImageView.setBackgroundResource(R.drawable.sticker_tab);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ewp0 ewp0Var = this.o;
        UserId userId = (ewp0Var == null ? null : ewp0Var).a;
        if (ewp0Var == null) {
            ewp0Var = null;
        }
        this.l.d(ewp0Var.b, userId);
    }
}
