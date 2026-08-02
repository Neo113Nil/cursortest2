package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.core.view.components.text.VkText;
import com.vk.log.L;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.b5a;
import xsna.c98;
import xsna.eda;
import xsna.epx;
import xsna.f4m;
import xsna.iah0;
import xsna.nda;

/* compiled from: HeaderIconShowAllBadgeVh.kt */
/* loaded from: classes16.dex */
public class HeaderIconShowAllBadgeVh extends HeaderShowAllVh {
    public final boolean B;

    public /* synthetic */ HeaderIconShowAllBadgeVh(a aVar, nda ndaVar, eda edaVar, b5a b5aVar, com.vk.catalog2.common.ui.mvp.util.a aVar2, SearchStatInfoProvider searchStatInfoProvider, boolean z) {
        this(aVar, ndaVar, edaVar, b5aVar, aVar2, searchStatInfoProvider, z, R.layout.catalog_header_large);
    }

    public static Integer b(Context context, String str) {
        Integer num;
        if (str == null) {
            return null;
        }
        if (str.equals("chevron_right_circle_28")) {
            return Integer.valueOf(R.drawable.vk_icon_chevron_right_circle_28);
        }
        try {
            num = Integer.valueOf(context.getResources().getIdentifier("vk_icon_".concat(str), "drawable", context.getPackageName()));
        } catch (Throwable th) {
            L.e(th);
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            return null;
        }
        return num;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        CatalogBadge catalogBadge;
        super.N6(uIBlock);
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader == null) {
            return;
        }
        UIBlockBadge uIBlockBadge = uIBlockHeader.C;
        if (uIBlockBadge != null && (catalogBadge = uIBlockBadge.y) != null) {
            if (epx.f(catalogBadge.c, X3.i.T)) {
                VkText vkText = this.i;
                if (vkText != null) {
                    awt0.x(vkText, 0, 0, 0, 0, 6);
                }
            } else {
                VkText vkText2 = this.i;
                if (vkText2 != null) {
                    float f = 6;
                    float f2 = 2;
                    vkText2.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
                }
            }
        }
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
        if (uIBlockActionOpenSection != null) {
            View view = this.f;
            if (view == null) {
                view = null;
            }
            view.setOnClickListener(new c98(this, 1));
            String str = uIBlockActionOpenSection.D;
            View view2 = this.f;
            Integer b = b((view2 != null ? view2 : null).getContext(), str);
            if (b != null) {
                c(b.intValue());
                return;
            }
            ImageView imageView = this.y;
            if (imageView != null) {
                f4m.j(imageView);
            }
            TextView textView = this.j;
            if (textView != null) {
                textView.setText(textView.getContext().getString(R.string.catalog_button_show_all));
                textView.setVisibility(0);
                textView.setClickable(false);
                return;
            }
            return;
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockHeader.J;
        if (uIBlockActionOpenUrl != null) {
            View view3 = this.f;
            if (view3 == null) {
                view3 = null;
            }
            view3.setOnClickListener(new c98(this, 1));
            String str2 = uIBlockActionOpenUrl.C;
            View view4 = this.f;
            Integer b2 = b((view4 != null ? view4 : null).getContext(), str2);
            if (b2 != null) {
                c(b2.intValue());
                return;
            }
            ImageView imageView2 = this.y;
            if (imageView2 != null) {
                f4m.j(imageView2);
            }
            TextView textView2 = this.j;
            if (textView2 != null) {
                textView2.setText(textView2.getContext().getString(R.string.catalog_button_show_all));
                textView2.setVisibility(0);
                textView2.setClickable(false);
                return;
            }
            return;
        }
        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlockHeader.G;
        if (uIBlockActionOpenSearchTab != null) {
            View view5 = this.f;
            if (view5 == null) {
                view5 = null;
            }
            view5.setOnClickListener(new c98(this, 1));
            String str3 = uIBlockActionOpenSearchTab.C;
            View view6 = this.f;
            if (view6 == null) {
                view6 = null;
            }
            Integer b3 = b(view6.getContext(), str3);
            if (b3 != null) {
                c(b3.intValue());
                return;
            }
            View view7 = this.f;
            (view7 != null ? view7 : null).setClickable(false);
            ImageView imageView3 = this.y;
            if (imageView3 != null) {
                f4m.j(imageView3);
            }
            TextView textView3 = this.j;
            if (textView3 != null) {
                textView3.setText(uIBlockActionOpenSearchTab.z);
                textView3.setVisibility(0);
                textView3.setOnClickListener(new c98(this, 1));
                return;
            }
            return;
        }
        UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockHeader.F;
        if (uIBlockActionSwitchSection == null) {
            ImageView imageView4 = this.y;
            if (imageView4 != null) {
                f4m.j(imageView4);
            }
            TextView textView4 = this.j;
            if (textView4 != null) {
                f4m.j(textView4);
                return;
            }
            return;
        }
        View view8 = this.f;
        if (view8 == null) {
            view8 = null;
        }
        view8.setOnClickListener(new c98(this, 1));
        String str4 = uIBlockActionSwitchSection.E;
        View view9 = this.f;
        if (view9 == null) {
            view9 = null;
        }
        Integer b4 = b(view9.getContext(), str4);
        if (b4 != null) {
            c(b4.intValue());
            return;
        }
        View view10 = this.f;
        (view10 != null ? view10 : null).setClickable(false);
        ImageView imageView5 = this.y;
        if (imageView5 != null) {
            f4m.j(imageView5);
        }
        TextView textView5 = this.j;
        if (textView5 != null) {
            textView5.setText(uIBlockActionSwitchSection.z);
            textView5.setVisibility(0);
            textView5.setOnClickListener(new c98(this, 1));
        }
    }

    public final void c(int i) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setImageResource(i);
            imageView.setClickable(false);
            imageView.setVisibility(0);
        }
        TextView textView = this.j;
        if (textView != null) {
            f4m.j(textView);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        if (!this.B) {
            TextView textView = this.g;
            if (textView == null) {
                textView = null;
            }
            textView.setTextSize(16.0f);
        }
        return k5;
    }

    public HeaderIconShowAllBadgeVh(CatalogConfiguration catalogConfiguration, nda ndaVar, eda edaVar, b5a b5aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z, int i) {
        super(catalogConfiguration, ndaVar, edaVar, b5aVar, aVar, i, searchStatInfoProvider);
        this.B = z;
    }
}
