package com.vk.stickers.keyboard.navigation;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.keyboard.navigation.a;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.bv1;
import xsna.bwt0;
import xsna.cn70;
import xsna.epx;
import xsna.f4m;
import xsna.h9l0;
import xsna.kgy;
import xsna.vfz;

/* compiled from: KeyboardNavigationStickerPackHolder.kt */
/* loaded from: classes6.dex */
public final class d extends vfz<kgy> {
    public final a.InterfaceC1801a l;
    public final VKImageView m;
    public final ImageView n;
    public final ImageView o;
    public String p;

    public d(ViewGroup viewGroup, com.vk.stickers.keyboard.c cVar) {
        super(R.layout.stickers_keyboard_navigation_pack_holder, viewGroup);
        this.l = cVar;
        this.m = (VKImageView) this.itemView.findViewById(R.id.sticker_nav_image);
        this.n = (ImageView) this.itemView.findViewById(R.id.sticker_nav_new_badge);
        this.o = (ImageView) this.itemView.findViewById(R.id.sticker_popup_badge);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(kgy kgyVar) {
        boolean z;
        kgy kgyVar2 = kgyVar;
        StickerStockItem stickerStockItem = kgyVar2.b;
        int i = h9l0.a;
        NotificationImage notificationImage = stickerStockItem.v;
        String Db = notificationImage != null ? NotificationImage.Db(notificationImage, i) : null;
        boolean f = epx.f(this.p, Db);
        VKImageView vKImageView = this.m;
        if (!f) {
            vKImageView.load(Db);
            vKImageView.setContentDescription(stickerStockItem.d);
            this.p = Db;
        }
        List<StickerItem> list = stickerStockItem.g;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((StickerItem) it.next()).k != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ImageView imageView = this.o;
        bwt0.p0(imageView, z);
        bwt0.e0(imageView, 0, cn70.b(6), 0, 0);
        f4m.m(8388661, imageView);
        bwt0.p0(this.n, kgyVar2.c);
        vKImageView.setSelected(kgyVar2.d);
        vKImageView.setBackgroundResource(R.drawable.sticker_tab);
        bwt0.i0(vKImageView, new bv1(20, this, kgyVar2));
    }
}
