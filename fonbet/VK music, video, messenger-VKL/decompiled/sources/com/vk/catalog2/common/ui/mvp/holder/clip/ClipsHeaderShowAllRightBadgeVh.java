package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllRightBadgeVh;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.epx;
import xsna.iah0;
import xsna.omw;

/* compiled from: ClipsHeaderShowAllRightBadgeVh.kt */
/* loaded from: classes16.dex */
public final class ClipsHeaderShowAllRightBadgeVh extends HeaderShowAllRightBadgeVh {
    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllRightBadgeVh, com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockHeader) {
            VkText vkText = this.i;
            if (vkText != null) {
                bwt0.p0(vkText, false);
            }
            TextView textView = this.j;
            if (textView != null) {
                bwt0.p0(textView, false);
            }
            ImageView imageView = this.y;
            if (imageView != null) {
                bwt0.p0(imageView, true);
            }
            ImageView imageView2 = this.y;
            if (imageView2 != null) {
                View view = this.f;
                if (view == null) {
                    view = null;
                }
                imageView2.setContentDescription(view.getContext().getString(R.string.catalog_button_show_all));
            }
            ImageView imageView3 = this.y;
            if (imageView3 != null) {
                omw.b(imageView3, R.attr.vk_ui_icon_secondary);
            }
            if (!epx.f(((UIBlockHeader) uIBlock).M, "flash_12")) {
                TextView textView2 = this.h;
                if (textView2 != null) {
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                TextView textView3 = this.h;
                if (textView3 != null) {
                    textView3.setCompoundDrawablePadding(0);
                    return;
                }
                return;
            }
            TextView textView4 = this.h;
            if (textView4 != null) {
                View view2 = this.f;
                if (view2 == null) {
                    view2 = null;
                }
                Context context = view2.getContext();
                Drawable drawable = context.getDrawable(R.drawable.vk_icon_flash_12);
                if (drawable == null) {
                    return;
                }
                drawable.setTint(e3m.f(R.attr.vk_ui_icon_secondary, context));
                textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textView4.setCompoundDrawablePadding(iah0.a(4));
            }
        }
    }
}
