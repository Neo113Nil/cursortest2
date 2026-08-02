package com.vk.stickers.keyboard.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.stickers.PromoColor;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.keyboard.navigation.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.baf0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.f4m;
import xsna.h1;
import xsna.h9l0;
import xsna.mdl0;
import xsna.vfz;

/* compiled from: KeyboardNavigationVmojiPackHolder.kt */
/* loaded from: classes6.dex */
public final class g extends vfz<KeyboardNavigationVmojiPackItem> {
    public final a.InterfaceC1801a l;
    public final VKImageView m;
    public final ImageView n;
    public final View o;

    public g(ViewGroup viewGroup, com.vk.stickers.keyboard.c cVar) {
        super(R.layout.stickers_keyboard_navigation_vmoji_holder, viewGroup);
        this.l = cVar;
        this.m = (VKImageView) this.itemView.findViewById(R.id.sticker_nav_image);
        this.n = (ImageView) this.itemView.findViewById(R.id.sticker_nav_new_badge);
        this.o = this.itemView.findViewById(R.id.selected);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(KeyboardNavigationVmojiPackItem keyboardNavigationVmojiPackItem) {
        int Y;
        KeyboardNavigationVmojiPackItem keyboardNavigationVmojiPackItem2 = keyboardNavigationVmojiPackItem;
        keyboardNavigationVmojiPackItem2.getClass();
        boolean z = keyboardNavigationVmojiPackItem2.e;
        PromoColor promoColor = keyboardNavigationVmojiPackItem2.g;
        boolean z2 = keyboardNavigationVmojiPackItem2.d;
        ImageView imageView = this.n;
        if (!z2 || promoColor == null) {
            f4m.j(imageView);
        } else {
            Drawable a = dhr0.t.a(R.drawable.ic_stickers_new_style_badge_large);
            Context context = this.itemView.getContext();
            int i = mdl0.$EnumSwitchMapping$0[promoColor.ordinal()];
            if (i == 1) {
                Y = dhr0.Y(R.attr.vk_ui_icon_accent, context);
            } else if (i == 2) {
                Y = dhr0.Y(R.attr.vk_ui_accent_red, context);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Y = dhr0.Y(R.attr.vk_ui_icon_medium, context);
            }
            imageView.setBackground(new baf0(a, Y));
            imageView.setVisibility(0);
        }
        NotificationImage notificationImage = keyboardNavigationVmojiPackItem2.c;
        String Db = notificationImage != null ? NotificationImage.Db(notificationImage, h9l0.a) : null;
        VKImageView vKImageView = this.m;
        vKImageView.load(Db);
        vKImageView.setContentDescription(keyboardNavigationVmojiPackItem2.b.d);
        vKImageView.setSelected(z);
        vKImageView.setBackgroundResource(R.drawable.sticker_tab);
        bwt0.i0(vKImageView, new h1(20, this, keyboardNavigationVmojiPackItem2));
        bwt0.p0(this.o, false);
        this.itemView.setBackgroundResource(R.drawable.sticker_tab);
    }
}
