package com.vk.catalog2.common.ui.holders.sticker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPrice;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.d05;
import xsna.drm0;
import xsna.enj;
import xsna.f4m;
import xsna.fo6;

/* compiled from: BaseStickerPackWithBuyVh.kt */
/* loaded from: classes16.dex */
public abstract class BaseStickerPackWithBuyVh extends BaseStickerPackVh {
    public View o;
    public TextView p;

    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh
    public final void a(UIBlock uIBlock, StickerStockItem stickerStockItem) {
        Price price = stickerStockItem.n;
        boolean z = stickerStockItem.h;
        super.a(uIBlock, stickerStockItem);
        TextView textView = this.m;
        if (textView == null) {
            textView = null;
        }
        textView.setText(stickerStockItem.e);
        if (z) {
            TextView textView2 = this.p;
            if (textView2 == null) {
                textView2 = null;
            }
            f4m.j(textView2);
            View view = this.o;
            if (view == null) {
                view = null;
            }
            view.setVisibility(0);
        } else if (stickerStockItem.m) {
            TextView textView3 = this.p;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setVisibility(0);
            View view2 = this.o;
            if (view2 == null) {
                view2 = null;
            }
            f4m.j(view2);
            TextView textView4 = this.p;
            if (textView4 == null) {
                textView4 = null;
            }
            Context context = this.i;
            if (context == null) {
                context = null;
            }
            textView4.setText(context.getString(R.string.price_free));
        } else {
            View view3 = this.o;
            if (view3 == null) {
                view3 = null;
            }
            f4m.j(view3);
            Price.PriceInfo Eb = price.Eb();
            String Ab = Eb != null ? Eb.Ab() : null;
            if (Ab == null || drm0.N(Ab)) {
                TextView textView5 = this.p;
                if (textView5 == null) {
                    textView5 = null;
                }
                f4m.j(textView5);
            } else {
                TextView textView6 = this.p;
                if (textView6 == null) {
                    textView6 = null;
                }
                textView6.setVisibility(0);
                TextView textView7 = this.p;
                if (textView7 == null) {
                    textView7 = null;
                }
                Price.PriceInfo Eb2 = price.Eb();
                textView7.setText(Eb2 != null ? Eb2.Ab() : null);
            }
        }
        TextView textView8 = this.p;
        if (textView8 == null) {
            textView8 = null;
        }
        bwt0.i0(textView8, new fo6(0, this, stickerStockItem));
        TextView textView9 = this.p;
        (textView9 != null ? textView9 : null).setEnabled(!z);
    }

    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh
    public final void b(UIBlock uIBlock, StickerPackPreview stickerPackPreview) {
        String str;
        Integer num;
        boolean z = stickerPackPreview.g;
        StickerPackPrice stickerPackPrice = stickerPackPreview.o;
        super.b(uIBlock, stickerPackPreview);
        TextView textView = this.m;
        if (textView == null) {
            textView = null;
        }
        textView.setText(stickerPackPreview.e);
        if (z) {
            TextView textView2 = this.p;
            if (textView2 == null) {
                textView2 = null;
            }
            f4m.j(textView2);
            View view = this.o;
            if (view == null) {
                view = null;
            }
            view.setVisibility(0);
        } else if (stickerPackPrice == null || (num = stickerPackPrice.c) == null || num.intValue() != 0) {
            View view2 = this.o;
            if (view2 == null) {
                view2 = null;
            }
            f4m.j(view2);
            if ((stickerPackPrice != null ? Integer.valueOf(stickerPackPrice.b) : null) != null) {
                TextView textView3 = this.p;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setVisibility(0);
                TextView textView4 = this.p;
                if (textView4 == null) {
                    textView4 = null;
                }
                if (stickerPackPrice != null) {
                    int i = stickerPackPrice.b;
                    Context context = this.i;
                    if (context == null) {
                        context = null;
                    }
                    str = enj.f(R.plurals.pack_price, i, context);
                } else {
                    str = "";
                }
                textView4.setText(str);
            } else {
                TextView textView5 = this.p;
                if (textView5 == null) {
                    textView5 = null;
                }
                f4m.j(textView5);
            }
        } else {
            TextView textView6 = this.p;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setVisibility(0);
            View view3 = this.o;
            if (view3 == null) {
                view3 = null;
            }
            f4m.j(view3);
            TextView textView7 = this.p;
            if (textView7 == null) {
                textView7 = null;
            }
            Context context2 = this.i;
            if (context2 == null) {
                context2 = null;
            }
            textView7.setText(context2.getString(R.string.price_free));
        }
        TextView textView8 = this.p;
        if (textView8 == null) {
            textView8 = null;
        }
        bwt0.i0(textView8, new d05(2, this, stickerPackPreview));
        TextView textView9 = this.p;
        (textView9 != null ? textView9 : null).setEnabled(!z);
    }

    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        this.p = (TextView) k5.findViewById(R.id.pack_buy);
        this.o = k5.findViewById(R.id.pack_added);
        return k5;
    }
}
