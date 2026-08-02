package com.vk.catalog2.common.ui.holders.sticker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.ui.core.analytics.tracking.StickerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackSliderItemVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackBadge;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPrice;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.b5a;
import xsna.bhu;
import xsna.btz;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.f9l0;
import xsna.izs;

/* compiled from: StickerPackSliderItemVh.kt */
/* loaded from: classes16.dex */
public class StickerPackSliderItemVh implements CatalogViewHolder {
    public final f9l0 b;
    public final String c;
    public final GiftData d;
    public final ContextUser e;
    public final b5a f;
    public final SearchStatInfoProvider g;
    public final boolean h;
    public View i;
    public VKStickerPackView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public FrameLayout n;

    public /* synthetic */ StickerPackSliderItemVh(f9l0 f9l0Var, String str, GiftData giftData, ContextUser contextUser, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this(f9l0Var, str, giftData, contextUser, b5aVar, searchStatInfoProvider, false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        Pair pair;
        Pair pair2;
        Integer num;
        if (uIBlock instanceof UIBlockStickerPackPreview) {
            final UIBlockStickerPackPreview uIBlockStickerPackPreview = (UIBlockStickerPackPreview) uIBlock;
            StickerPackPreview stickerPackPreview = uIBlockStickerPackPreview.y;
            VKStickerPackView vKStickerPackView = this.j;
            if (vKStickerPackView == null) {
                vKStickerPackView = null;
            }
            View view = this.i;
            if (view == null) {
                view = null;
            }
            f4m.p(view.getContext().getResources().getDimensionPixelSize(this.h ? R.dimen.stickers_catalog_large_slider_image_bg_width : R.dimen.stickers_catalog_small_slider_image_bg_size), vKStickerPackView);
            VKStickerPackView vKStickerPackView2 = this.j;
            if (vKStickerPackView2 == null) {
                vKStickerPackView2 = null;
            }
            vKStickerPackView2.a(new btz(stickerPackPreview, stickerPackPreview.b, 2), stickerPackPreview.f, epx.f(stickerPackPreview.s, Boolean.TRUE));
            final int i = stickerPackPreview.b;
            View view2 = this.i;
            if (view2 == null) {
                view2 = null;
            }
            bwt0.i0(view2, new izs() { // from class: xsna.m5l0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    StickerPackSliderItemVh stickerPackSliderItemVh = StickerPackSliderItemVh.this;
                    b5a b5aVar = stickerPackSliderItemVh.f;
                    StickerAnalyticsInfo stickerAnalyticsInfo = new StickerAnalyticsInfo(StickerAnalyticsInfo.ClickTarget.Tap);
                    UIBlockStickerPackPreview uIBlockStickerPackPreview2 = uIBlockStickerPackPreview;
                    b5aVar.a(new cfp0(uIBlockStickerPackPreview2, stickerAnalyticsInfo));
                    SearchStatInfoProvider searchStatInfoProvider = stickerPackSliderItemVh.g;
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.STICKERS;
                    String r = uIBlockStickerPackPreview2.r();
                    if (r == null) {
                        r = "";
                    }
                    SearchStatsLoggingInfo b = searchStatInfoProvider.b(type, r, false);
                    f9l0 f9l0Var = stickerPackSliderItemVh.b;
                    View view3 = stickerPackSliderItemVh.i;
                    if (view3 == null) {
                        view3 = null;
                    }
                    f9l0Var.b(view3.getContext(), i, stickerPackSliderItemVh.c, stickerPackSliderItemVh.d, stickerPackSliderItemVh.e, b);
                    return s3q0.a;
                }
            });
            TextView textView = this.k;
            if (textView == null) {
                textView = null;
            }
            StickerPackBadge stickerPackBadge = stickerPackPreview.n;
            if (stickerPackBadge != null) {
                Context context = textView.getContext();
                ColorStateList c = stickerPackBadge instanceof StickerPackBadge.New ? e3m.c(R.attr.vk_ui_background_accent, context) : e3m.c(R.attr.vk_ui_accent_red, context);
                textView.setText(stickerPackBadge.getText());
                textView.setBackgroundTintList(c);
                textView.setVisibility(0);
            } else {
                f4m.j(textView);
            }
            StickerPackPrice stickerPackPrice = stickerPackPreview.o;
            boolean z = stickerPackPreview.g;
            boolean z2 = ((stickerPackPrice != null ? stickerPackPrice.c : null) == null || !bhu.e(stickerPackPreview) || z) ? false : true;
            if (!z2) {
                FrameLayout frameLayout = this.n;
                if (frameLayout == null) {
                    frameLayout = null;
                }
                f4m.j(frameLayout);
            } else if (stickerPackPrice != null && (num = stickerPackPrice.c) != null) {
                int intValue = num.intValue();
                FrameLayout frameLayout2 = this.n;
                if (frameLayout2 == null) {
                    frameLayout2 = null;
                }
                frameLayout2.setVisibility(0);
                TextView textView2 = this.m;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(String.valueOf(intValue));
            }
            int i2 = R.attr.vk_ui_text_secondary;
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_text_secondary);
            if (stickerPackPrice == null || stickerPackPrice.b != 0) {
                if (!z || stickerPackPreview.i) {
                    if (stickerPackPrice != null) {
                        int i3 = stickerPackPrice.b;
                        View view3 = this.i;
                        if (view3 == null) {
                            view3 = null;
                        }
                        str = enj.f(R.plurals.pack_price, i3, view3.getContext());
                    } else {
                        str = "";
                    }
                    if (z2) {
                        i2 = R.attr.vk_ui_text_accent;
                    }
                    pair = new Pair(str, Integer.valueOf(i2));
                    pair2 = pair;
                } else {
                    View view4 = this.i;
                    if (view4 == null) {
                        view4 = null;
                    }
                    pair2 = new Pair(view4.getContext().getString(R.string.sticker_added), valueOf);
                }
            } else if (z) {
                View view5 = this.i;
                if (view5 == null) {
                    view5 = null;
                }
                pair2 = new Pair(view5.getContext().getString(R.string.sticker_added), valueOf);
            } else {
                View view6 = this.i;
                if (view6 == null) {
                    view6 = null;
                }
                pair = new Pair(view6.getContext().getString(R.string.price_free), Integer.valueOf(R.attr.vk_ui_text_positive));
                pair2 = pair;
            }
            String str2 = (String) pair2.d();
            int intValue2 = ((Number) pair2.g()).intValue();
            TextView textView3 = this.l;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(str2);
            TextView textView4 = this.l;
            (textView4 != null ? textView4 : null).setTextColor(dhr0.t.c(intValue2));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_stickers_slider_item, viewGroup, false);
        this.i = inflate;
        this.j = (VKStickerPackView) inflate.findViewById(R.id.pack_image);
        this.k = (TextView) inflate.findViewById(R.id.badge);
        this.l = (TextView) inflate.findViewById(R.id.price);
        this.m = (TextView) inflate.findViewById(R.id.old_price);
        this.n = (FrameLayout) inflate.findViewById(R.id.old_price_layout);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    public StickerPackSliderItemVh(f9l0 f9l0Var, String str, GiftData giftData, ContextUser contextUser, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z) {
        this.b = f9l0Var;
        this.c = str;
        this.d = giftData;
        this.e = contextUser;
        this.f = b5aVar;
        this.g = searchStatInfoProvider;
        this.h = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
