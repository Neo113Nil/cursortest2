package com.vk.catalog2.common.ui.holders.sticker;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPrice;
import com.vkontakte.android.R;
import defpackage.q0;
import xsna.b5a;
import xsna.bhu;
import xsna.dhr0;
import xsna.drm0;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.f9l0;
import xsna.nik0;
import xsna.shy;

/* compiled from: StickerPackSliderSmallItemVh.kt */
/* loaded from: classes16.dex */
public class StickerPackSliderSmallItemVh extends BaseStickerPackVh {
    public TextView o;

    /* compiled from: StickerPackSliderSmallItemVh.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final boolean c;

        public a(String str, int i, boolean z) {
            this.a = str;
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PriceInfo(priceAsStr=");
            sb.append(this.a);
            sb.append(", colorAttrRes=");
            sb.append(this.b);
            sb.append(", hideSubtitle=");
            return q0.a(sb, this.c, ')');
        }
    }

    public StickerPackSliderSmallItemVh(f9l0 f9l0Var, String str, GiftData giftData, ContextUser contextUser, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(R.layout.catalog_stickers_small_slider_item, f9l0Var, str, giftData, contextUser, b5aVar, searchStatInfoProvider);
    }

    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh
    public final void a(UIBlock uIBlock, StickerStockItem stickerStockItem) {
        super.a(uIBlock, stickerStockItem);
        Price.PriceInfo Bb = stickerStockItem.n.Bb();
        String Ab = Bb != null ? Bb.Ab() : null;
        if (Ab == null || drm0.N(Ab)) {
            TextView textView = this.m;
            if (textView == null) {
                textView = null;
            }
            c(stickerStockItem, textView);
            TextView textView2 = this.o;
            f4m.j(textView2 != null ? textView2 : null);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) Ab).setSpan(new StrikethroughSpan(), 0, Ab.length(), 33);
        TextView textView3 = this.m;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
        TextView textView4 = this.m;
        if (textView4 == null) {
            textView4 = null;
        }
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        textView4.setText(new SpannableString(spannableStringBuilder));
        TextView textView5 = this.o;
        if (textView5 == null) {
            textView5 = null;
        }
        if (c(stickerStockItem, textView5)) {
            TextView textView6 = this.m;
            f4m.j(textView6 != null ? textView6 : null);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh
    public final void b(UIBlock uIBlock, StickerPackPreview stickerPackPreview) {
        String str;
        Integer num;
        super.b(uIBlock, stickerPackPreview);
        StickerPackPrice stickerPackPrice = stickerPackPreview.o;
        if ((stickerPackPrice != null ? stickerPackPrice.c : null) == null || !bhu.e(stickerPackPreview) || stickerPackPrice == null || (num = stickerPackPrice.c) == null) {
            str = null;
        } else {
            int intValue = num.intValue();
            Context context = this.i;
            if (context == null) {
                context = null;
            }
            str = enj.f(R.plurals.pack_price, intValue, context);
        }
        if (str == null || drm0.N(str)) {
            TextView textView = this.m;
            if (textView == null) {
                textView = null;
            }
            d(stickerPackPreview, textView);
            TextView textView2 = this.o;
            f4m.j(textView2 != null ? textView2 : null);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str).setSpan(new StrikethroughSpan(), 0, str.length(), 33);
        TextView textView3 = this.m;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
        TextView textView4 = this.m;
        if (textView4 == null) {
            textView4 = null;
        }
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        textView4.setText(new SpannableString(spannableStringBuilder));
        TextView textView5 = this.o;
        if (textView5 == null) {
            textView5 = null;
        }
        if (d(stickerPackPreview, textView5)) {
            TextView textView6 = this.m;
            f4m.j(textView6 != null ? textView6 : null);
        }
    }

    public final boolean c(StickerStockItem stickerStockItem, TextView textView) {
        boolean z;
        String Ab;
        boolean z2 = stickerStockItem.m;
        boolean z3 = stickerStockItem.h;
        int i = R.attr.vk_ui_text_secondary;
        if (!z2) {
            z = true;
            if (!stickerStockItem.i) {
                if (z3) {
                    Context context = this.i;
                    Ab = (context != null ? context : null).getString(R.string.sticker_added);
                }
                Ab = "";
            } else if (!z3 || stickerStockItem.j) {
                Price.PriceInfo Eb = stickerStockItem.n.Eb();
                i = R.attr.vk_ui_text_accent;
                if (Eb == null || (Ab = Eb.Ab()) == null) {
                    z = false;
                    Ab = "";
                }
            } else {
                Context context2 = this.i;
                Ab = (context2 != null ? context2 : null).getString(R.string.sticker_added);
            }
            if (!z && Ab.length() == 0) {
                f4m.j(textView);
                return z;
            }
            textView.setVisibility(0);
            textView.setText(Ab);
            textView.setTextColor(dhr0.t.c(i));
            return z;
        }
        if (z3) {
            Context context3 = this.i;
            Ab = (context3 != null ? context3 : null).getString(R.string.sticker_added);
        } else {
            Context context4 = this.i;
            Ab = (context4 != null ? context4 : null).getString(R.string.price_free);
        }
        z = false;
        if (!z) {
        }
        textView.setVisibility(0);
        textView.setText(Ab);
        textView.setTextColor(dhr0.t.c(i));
        return z;
    }

    public final boolean d(StickerPackPreview stickerPackPreview, TextView textView) {
        a aVar;
        Integer num;
        String string;
        StickerPackPrice stickerPackPrice = stickerPackPreview.o;
        boolean z = stickerPackPreview.g;
        if (stickerPackPrice == null || (num = stickerPackPrice.c) == null || num.intValue() != 0) {
            String str = "";
            if (!stickerPackPreview.h) {
                if (z) {
                    Context context = this.i;
                    str = (context != null ? context : null).getString(R.string.sticker_added);
                }
                aVar = new a(str, R.attr.vk_ui_text_secondary, true);
            } else if (!z || stickerPackPreview.i) {
                StickerPackPrice stickerPackPrice2 = stickerPackPreview.o;
                if (stickerPackPrice2 != null) {
                    int i = stickerPackPrice2.b;
                    Context context2 = this.i;
                    str = enj.f(R.plurals.pack_price, i, context2 != null ? context2 : null);
                }
                aVar = new a(str, R.attr.vk_ui_text_accent, false);
            } else {
                Context context3 = this.i;
                aVar = new a((context3 != null ? context3 : null).getString(R.string.sticker_added), R.attr.vk_ui_text_secondary, true);
            }
        } else {
            if (z) {
                Context context4 = this.i;
                string = (context4 != null ? context4 : null).getString(R.string.sticker_added);
            } else {
                Context context5 = this.i;
                string = (context5 != null ? context5 : null).getString(R.string.price_free);
            }
            aVar = new a(string, R.attr.vk_ui_text_secondary, false);
        }
        String str2 = aVar.a;
        boolean z2 = aVar.c;
        if (z2 && str2.length() == 0) {
            f4m.j(textView);
            return z2;
        }
        textView.setVisibility(0);
        textView.setText(str2);
        textView.setTextColor(dhr0.t.c(aVar.b));
        return z2;
    }

    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        this.o = (TextView) k5.findViewById(R.id.pack_subsubtitle);
        return k5;
    }
}
