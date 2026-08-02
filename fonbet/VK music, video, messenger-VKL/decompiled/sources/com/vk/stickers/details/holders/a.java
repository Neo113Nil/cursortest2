package com.vk.stickers.details.holders;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;
import xsna.bjs;
import xsna.dgr0;
import xsna.g3l0;
import xsna.jjc;
import xsna.l7v;
import xsna.p690;
import xsna.pla;
import xsna.q690;
import xsna.r690;
import xsna.yr6;

/* compiled from: PackInfoHolder.kt */
/* loaded from: classes6.dex */
public final class a extends yr6<p690> {
    public final g3l0 l;
    public final VKStickerPackView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final VkButton q;
    public final VkButton r;

    public a(g3l0 g3l0Var, ViewGroup viewGroup) {
        super(R.layout.sticker_details_info_item, viewGroup);
        this.l = g3l0Var;
        this.m = (VKStickerPackView) this.itemView.findViewById(R.id.pack_view);
        this.n = (TextView) this.itemView.findViewById(R.id.pack_title);
        this.o = (TextView) this.itemView.findViewById(R.id.pack_author);
        this.p = (TextView) this.itemView.findViewById(R.id.description);
        this.q = (VkButton) this.itemView.findViewById(R.id.wish_list_button);
        this.r = (VkButton) this.itemView.findViewById(R.id.subscription_button);
    }

    @Override // xsna.yr6
    /* renamed from: i6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void i6(p690 p690Var) {
        StickerStockItem stickerStockItem = p690Var.b;
        dgr0.a(this.m, stickerStockItem);
        this.n.setText(stickerStockItem.d);
        this.o.setText(stickerStockItem.e);
        this.p.setText(stickerStockItem.f);
        Boolean bool = p690Var.c;
        VkButton vkButton = this.q;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            vkButton.setVisibility(0);
            jjc.f(new bjs(this, stickerStockItem, 1), vkButton);
            if (booleanValue) {
                vkButton.setText(this.itemView.getContext().getString(R.string.stickers_wish_list_added));
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_list_like_fill_28));
                vkButton.setContentDescription(b6().getString(R.string.stickers_wish_list_added_content_descr));
            } else {
                vkButton.setText(this.itemView.getContext().getString(R.string.stickers_wish_list_add));
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_list_like_outline_28));
                vkButton.setContentDescription(b6().getString(R.string.stickers_wish_list_add_content_descr));
            }
        } else {
            vkButton.setVisibility(8);
        }
        Boolean bool2 = p690Var.d;
        VkButton vkButton2 = this.r;
        if (bool2 == null) {
            vkButton2.setVisibility(8);
            return;
        }
        boolean booleanValue2 = bool2.booleanValue();
        vkButton2.setVisibility(0);
        jjc.f(new q690(0, this, stickerStockItem), vkButton2);
        if (booleanValue2) {
            vkButton2.setText(this.itemView.getContext().getString(R.string.stickers_unsubscribe_author));
            vkButton2.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_check_outline_28));
        } else {
            vkButton2.setText(this.itemView.getContext().getString(R.string.stickers_subscribe_author));
            vkButton2.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_add_outline_28));
        }
        l7v b = pla.e().b();
        HintId hintId = HintId.STICKERS_AUTHORS_SUBSCRIPTION;
        Hint p = b.p(hintId.getId());
        if (!b.m(hintId) || p == null) {
            return;
        }
        vkButton2.postDelayed(new r690(vkButton2, p, b), 600L);
        b.b(p.b);
    }
}
