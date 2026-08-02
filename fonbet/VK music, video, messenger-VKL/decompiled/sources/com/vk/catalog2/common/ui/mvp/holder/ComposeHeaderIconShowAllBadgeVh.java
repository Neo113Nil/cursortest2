package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.ComposeHeaderVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.util.a;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.log.L;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.dhr0;
import xsna.eda;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.jpf;
import xsna.kbe;
import xsna.lrs;
import xsna.nda;
import xsna.oq;
import xsna.sfg;
import xsna.tlo0;
import xsna.x7g;
import xsna.y01;

/* compiled from: ComposeHeaderIconShowAllBadgeVh.kt */
/* loaded from: classes16.dex */
public class ComposeHeaderIconShowAllBadgeVh extends ComposeHeaderShowAllVh {
    public static final /* synthetic */ int A = 0;
    public final boolean y;
    public final boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeHeaderIconShowAllBadgeVh(CatalogConfiguration catalogConfiguration, nda ndaVar, eda edaVar, b5a b5aVar, a aVar, SearchStatInfoProvider searchStatInfoProvider, lrs lrsVar, int i) {
        super(catalogConfiguration, ndaVar, edaVar, b5aVar, aVar, searchStatInfoProvider, (i & 256) != 0 ? null : lrsVar, false, null, 384);
        boolean z = (i & 64) == 0;
        boolean z2 = (i & 128) == 0;
        this.y = z;
        this.z = z2;
    }

    public static Integer e(Context context, String str) {
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

    @Override // com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh, com.vk.catalog2.common.ui.holders.ComposeHeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader == null) {
            return;
        }
        boolean z = this.z;
        if (!z) {
            this.h.setValue(this, ComposeHeaderVh.n[2], null);
        }
        a().setOnClickListener(new y01(this, 8));
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
        if (uIBlockActionOpenSection != null) {
            String str = uIBlockActionOpenSection.D;
            if (epx.f(str, "chevron_right_circle_28")) {
                d(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.C0841a(3, (gzs) null), 3));
                a().setBackground(dhr0.t.d(R.attr.selectableItemBackground));
                return;
            }
            Integer e = e(a().getContext(), str);
            if (e != null) {
                h(e.intValue());
                return;
            } else {
                d(null);
                g(a().getContext().getString(R.string.catalog_button_show_all));
                return;
            }
        }
        UIBlockActionOpenScreen uIBlockActionOpenScreen = uIBlockHeader.I;
        if (uIBlockActionOpenScreen != null) {
            if (!z) {
                a().setOnClickListener(null);
                d(null);
                c(null);
                return;
            }
            String str2 = uIBlockActionOpenScreen.B;
            if (epx.f(str2, "chevron_right_circle_28")) {
                d(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.C0841a(3, (gzs) null), 3));
                a().setBackground(dhr0.t.d(R.attr.selectableItemBackground));
                return;
            }
            Integer e2 = e(a().getContext(), str2);
            if (e2 != null) {
                h(e2.intValue());
                return;
            } else {
                d(null);
                g(uIBlockActionOpenScreen.z);
                return;
            }
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockHeader.J;
        if (uIBlockActionOpenUrl != null) {
            String str3 = uIBlockActionOpenUrl.C;
            if (epx.f(str3, "chevron_right_circle_28")) {
                d(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.C0841a(3, (gzs) null), 3));
                a().setBackground(dhr0.t.d(R.attr.selectableItemBackground));
                return;
            }
            Integer e3 = e(a().getContext(), str3);
            if (e3 != null) {
                h(e3.intValue());
                return;
            } else {
                d(null);
                g(uIBlockActionOpenUrl.z);
                return;
            }
        }
        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlockHeader.G;
        if (uIBlockActionOpenSearchTab != null) {
            String str4 = uIBlockActionOpenSearchTab.C;
            if (epx.f(str4, "chevron_right_circle_28")) {
                d(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.C0841a(3, (gzs) null), 3));
                a().setBackground(dhr0.t.d(R.attr.selectableItemBackground));
                return;
            }
            Integer e4 = e(a().getContext(), str4);
            if (e4 != null) {
                h(e4.intValue());
                return;
            }
            a().setClickable(false);
            d(null);
            g(uIBlockActionOpenSearchTab.z);
            return;
        }
        UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockHeader.F;
        if (uIBlockActionSwitchSection == null) {
            if (uIBlockHeader.D == null) {
                a().setOnClickListener(null);
                d(null);
                c(null);
                return;
            } else {
                if (z) {
                    return;
                }
                a().setOnClickListener(null);
                d(null);
                c(null);
                return;
            }
        }
        String str5 = uIBlockActionSwitchSection.E;
        if (epx.f(str5, "chevron_right_circle_28")) {
            d(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.C0841a(3, (gzs) null), 3));
            a().setBackground(dhr0.t.d(R.attr.selectableItemBackground));
            return;
        }
        Integer e5 = e(a().getContext(), str5);
        if (e5 != null) {
            h(e5.intValue());
            return;
        }
        a().setClickable(false);
        d(null);
        g(uIBlockActionSwitchSection.z);
    }

    public final void g(String str) {
        VkGroupHeader.Right.ExtraContent.a aVar;
        if (this.y) {
            aVar = new VkGroupHeader.Right.ExtraContent.a(oq.d(tlo0.Companion, str), new kbe(this, 11), null, null, VkButton.Appearance.Accent, null, 492);
        } else {
            aVar = new VkGroupHeader.Right.ExtraContent.a(str, new jpf(this, 8));
        }
        c(new VkGroupHeader.Right(aVar, null, null, 6));
    }

    public final void h(int i) {
        c(null);
        d(new VkGroupHeader.Right(null, new VkGroupHeader.Right.b(new gko(i), (x7g) null, new sfg(this, 5), 6), null, 5));
    }
}
