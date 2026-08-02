package com.vk.catalog2.common.ui.mvp.holder.market;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.market.CatalogMarketGroupInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.market.MarketGroupItemSmallVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.dto.common.Good;
import com.vk.dto.common.VerifyInfo;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e530;
import xsna.f4m;
import xsna.f530;
import xsna.iah0;
import xsna.j5g;
import xsna.p530;
import xsna.q530;
import xsna.tzx0;
import xsna.u4a;
import xsna.v9b;
import xsna.z410;

/* compiled from: MarketGroupItemSmallVh.kt */
/* loaded from: classes16.dex */
public final class MarketGroupItemSmallVh implements CatalogViewHolder, f530 {
    public final u4a b;
    public final q530 c;
    public UIBlockMarketGroupInfoItem d;
    public ViewGroup e;
    public VKImageView f;
    public TextViewEllipsizeEnd g;
    public TextView h;
    public VKImageView i;
    public VKImageView j;
    public VKImageView k;
    public TextView l;

    public MarketGroupItemSmallVh(u4a u4aVar) {
        this.b = u4aVar;
        this.c = u4aVar.b.G;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = uIBlock instanceof UIBlockMarketGroupInfoItem ? (UIBlockMarketGroupInfoItem) uIBlock : null;
        if (uIBlockMarketGroupInfoItem == null) {
            return;
        }
        CatalogMarketGroupInfo catalogMarketGroupInfo = uIBlockMarketGroupInfoItem.y;
        this.d = uIBlockMarketGroupInfoItem;
        VKImageView vKImageView = this.f;
        if (vKImageView == null) {
            vKImageView = null;
        }
        CatalogLink catalogLink = catalogMarketGroupInfo.c;
        CatalogLink catalogLink2 = catalogMarketGroupInfo.c;
        bwt0.L(vKImageView, catalogLink.f);
        TextViewEllipsizeEnd textViewEllipsizeEnd = this.g;
        if (textViewEllipsizeEnd == null) {
            textViewEllipsizeEnd = null;
        }
        String str = catalogLink2.c;
        int i = TextViewEllipsizeEnd.d;
        textViewEllipsizeEnd.b(str, null, false, false);
        if (uIBlockMarketGroupInfoItem.z.y.b) {
            TextViewEllipsizeEnd textViewEllipsizeEnd2 = this.g;
            if (textViewEllipsizeEnd2 == null) {
                textViewEllipsizeEnd2 = null;
            }
            Drawable j = VerifyInfoHelper.j(VerifyInfoHelper.a, textViewEllipsizeEnd2.getContext(), new VerifyInfo(true, false, false, false, false, false, 62, null), false, null, 12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) " ");
            textViewEllipsizeEnd2.getContext();
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            j.setBounds(0, 0, j.getIntrinsicWidth(), j.getIntrinsicHeight());
            newSpannable.setSpan(new tzx0(j, 3, -1.0f, false, 0, 0, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) newSpannable);
            textViewEllipsizeEnd2.b(textViewEllipsizeEnd2.b.b, new SpannedString(spannableStringBuilder), true, false);
        }
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        textView.setText(catalogLink2.d);
        List<Good> list = ((UIBlockMarketGroupInfoItem) uIBlock).A;
        a(0, list);
        a(1, list);
        a(2, list);
        ViewGroup viewGroup = this.e;
        (viewGroup != null ? viewGroup : null).setOnClickListener(new v9b(this, 7));
    }

    public final void a(int i, List<? extends Good> list) {
        q530 q530Var = this.c;
        if (q530Var == null) {
            o1(Integer.valueOf(i));
            return;
        }
        VKImageView b = b(i);
        Good good = (Good) j5g.b0(i, list);
        if (good == null) {
            f4m.j(b);
        } else {
            q530Var.c(e530.b(good, Integer.valueOf(i)), this, new z410(3));
        }
    }

    public final VKImageView b(int i) {
        if (i == 0) {
            VKImageView vKImageView = this.i;
            if (vKImageView == null) {
                return null;
            }
            return vKImageView;
        }
        if (i == 1) {
            VKImageView vKImageView2 = this.j;
            if (vKImageView2 == null) {
                return null;
            }
            return vKImageView2;
        }
        if (i != 2) {
            throw new IllegalStateException("Provide view to new position");
        }
        VKImageView vKImageView3 = this.k;
        if (vKImageView3 == null) {
            return null;
        }
        return vKImageView3;
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        if (num == null) {
            throw new IllegalStateException("Position cannot be null in this case");
        }
        VKImageView b = b(num.intValue());
        return new p530(b, b, (TextView) null, (TextView) null, (TextView) null, 60);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_market_group_item_small_vh, viewGroup, false);
        this.e = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        VKImageView vKImageView = (VKImageView) viewGroup2.findViewById(R.id.group_icon);
        this.f = vKImageView;
        float b = iah0.b(0.5f);
        ViewGroup viewGroup3 = this.e;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        vKImageView.y0(b, e3m.f(R.attr.vk_ui_image_border_alpha, viewGroup3.getContext()));
        ViewGroup viewGroup4 = this.e;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.g = (TextViewEllipsizeEnd) viewGroup4.findViewById(R.id.group_title);
        ViewGroup viewGroup5 = this.e;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.h = (TextView) viewGroup5.findViewById(R.id.group_subtitle);
        ViewGroup viewGroup6 = this.e;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.i = (VKImageView) viewGroup6.findViewById(R.id.good_image_1);
        ViewGroup viewGroup7 = this.e;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.j = (VKImageView) viewGroup7.findViewById(R.id.good_image_2);
        ViewGroup viewGroup8 = this.e;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        this.k = (VKImageView) viewGroup8.findViewById(R.id.good_image_3);
        ViewGroup viewGroup9 = this.e;
        if (viewGroup9 == null) {
            viewGroup9 = null;
        }
        this.l = (TextView) viewGroup9.findViewById(R.id.good_image_3_overlay_text);
        ViewGroup viewGroup10 = this.e;
        if (viewGroup10 == null) {
            viewGroup10 = null;
        }
        viewGroup10.setBackgroundTintList(dhr0.M() ? ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_background_modal)) : null);
        ViewGroup viewGroup11 = this.e;
        if (viewGroup11 == null) {
            return null;
        }
        return viewGroup11;
    }

    @Override // xsna.f530
    public final void o1(final Integer num) {
        if (num == null) {
            throw new IllegalStateException("Position cannot be null at this case");
        }
        VKImageView b = b(num.intValue());
        UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = this.d;
        if (uIBlockMarketGroupInfoItem == null) {
            uIBlockMarketGroupInfoItem = null;
        }
        CatalogLink catalogLink = (CatalogLink) j5g.b0(num.intValue(), uIBlockMarketGroupInfoItem.y.e);
        UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem2 = this.d;
        if (uIBlockMarketGroupInfoItem2 == null) {
            uIBlockMarketGroupInfoItem2 = null;
        }
        final Good good = (Good) j5g.b0(num.intValue(), uIBlockMarketGroupInfoItem2.A);
        if (good == null) {
            f4m.j(b);
            return;
        }
        String str = catalogLink != null ? catalogLink.e : null;
        b.setVisibility(0);
        bwt0.L(b, good.n);
        b.setContentDescription(good.d);
        if (str != null) {
            b.setOnClickListener(new View.OnClickListener() { // from class: xsna.uz00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MarketGroupItemSmallVh marketGroupItemSmallVh = MarketGroupItemSmallVh.this;
                    m3a m3aVar = marketGroupItemSmallVh.b.b.d;
                    UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem3 = marketGroupItemSmallVh.d;
                    if (uIBlockMarketGroupInfoItem3 == null) {
                        uIBlockMarketGroupInfoItem3 = null;
                    }
                    m3aVar.j(new tu00(uIBlockMarketGroupInfoItem3, good, num));
                }
            });
        }
        if (num.intValue() == 2) {
            if (catalogLink != null) {
                String str2 = catalogLink.c;
                if (str2.length() > 0) {
                    VKImageView vKImageView = this.k;
                    VKImageView vKImageView2 = vKImageView == null ? null : vKImageView;
                    if (vKImageView == null) {
                        vKImageView = null;
                    }
                    vKImageView2.setColorFilter(vKImageView.getContext().getColor(R.color.vk_black_alpha35));
                    TextView textView = this.l;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setVisibility(0);
                    TextView textView2 = this.l;
                    (textView2 != null ? textView2 : null).setText(str2);
                    return;
                }
            }
            VKImageView vKImageView3 = this.k;
            if (vKImageView3 == null) {
                vKImageView3 = null;
            }
            vKImageView3.clearColorFilter();
            TextView textView3 = this.l;
            f4m.j(textView3 != null ? textView3 : null);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
