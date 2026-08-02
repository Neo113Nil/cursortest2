package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.holders.ComposeHeaderVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.util.a;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ams;
import xsna.b5a;
import xsna.cfp0;
import xsna.czt0;
import xsna.dhr0;
import xsna.e43;
import xsna.eda;
import xsna.fpf0;
import xsna.i4a;
import xsna.kd;
import xsna.ld;
import xsna.mo3;
import xsna.nda;
import xsna.ppi;
import xsna.q3a;
import xsna.qcy;
import xsna.u9;
import xsna.ysg0;

/* compiled from: ComposeHeaderShowAllVh.kt */
/* loaded from: classes16.dex */
public class ComposeHeaderShowAllVh extends ComposeHeaderVh {
    public static final /* synthetic */ qcy<Object>[] x;
    public final CatalogConfiguration o;
    public final nda p;
    public final eda q;
    public final b5a r;
    public final a s;
    public final SearchStatInfoProvider t;
    public final czt0 u;
    public final ppi v;
    public View w;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ComposeHeaderShowAllVh.class, "showAllBtn", "getShowAllBtn()Lcom/vk/core/view/components/group/header/VkGroupHeader$Right;", 0);
        fpf0.a.getClass();
        x = new qcy[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeHeaderShowAllVh(CatalogConfiguration catalogConfiguration, nda ndaVar, eda edaVar, b5a b5aVar, a aVar, SearchStatInfoProvider searchStatInfoProvider, czt0 czt0Var, boolean z, q3a q3aVar, int i) {
        super((i & 256) != 0 ? null : q3aVar, b5aVar, (i & 128) != 0 ? false : z, 4);
        czt0Var = (i & 64) != 0 ? null : czt0Var;
        this.o = catalogConfiguration;
        this.p = ndaVar;
        this.q = edaVar;
        this.r = b5aVar;
        this.s = aVar;
        this.t = searchStatInfoProvider;
        this.u = czt0Var;
        this.v = new ppi(this);
    }

    @Override // com.vk.catalog2.common.ui.holders.ComposeHeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        czt0 czt0Var;
        super.N6(uIBlock);
        boolean z = (uIBlock instanceof UIBlockHeader) && ((UIBlockHeader) uIBlock).L != null;
        VkGroupHeader a = a();
        if (z) {
            a.setOnClickListener(new mo3(this, 5));
        }
        a.setClickable(z);
        a.setFocusable(z);
        a.setForeground(z ? dhr0.t.d(R.attr.selectableItemBackground) : null);
        View view = this.w;
        if (view == null || (czt0Var = this.u) == null) {
            return;
        }
        czt0Var.a(view, uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.ComposeHeaderVh
    public void b(ClickType clickType) {
        Context context = a().getContext();
        UIBlockHeader uIBlockHeader = this.k;
        if (uIBlockHeader != null && e43.l(ClickType.SHOW_ITEM, ClickType.SHOW_ALL, ClickType.SHOW_ALL_CHEVRON).contains(clickType)) {
            UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockHeader.D;
            b5a b5aVar = this.r;
            if (uIBlockActionShowFilters != null) {
                b5aVar.a(new cfp0(uIBlockActionShowFilters, null));
                i4a.b(context, uIBlockActionShowFilters.A, null, new u9(7, this, context));
                return;
            }
            UIBlockActionOpenScreen uIBlockActionOpenScreen = uIBlockHeader.I;
            if (uIBlockActionOpenScreen != null) {
                String str = uIBlockActionOpenScreen.A;
                switch (str.hashCode()) {
                    case -2048372074:
                        if (!str.equals("recommendations_perhaps_you_know")) {
                            return;
                        }
                        break;
                    case -1822967846:
                        if (!str.equals("recommendations")) {
                            return;
                        }
                        break;
                    case -1209078378:
                        if (str.equals("birthdays")) {
                            ams.a().h(context);
                            return;
                        }
                        return;
                    case -1004912850:
                        if (str.equals("friends_requests")) {
                            ams.a().m(context);
                            return;
                        }
                        return;
                    case 163411945:
                        if (str.equals("myfollowers")) {
                            UiTracker uiTracker = UiTracker.a;
                            UiTracker.i.j(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE_ALL_FOLLOWERS), true);
                            ams.a().k(context);
                            return;
                        }
                        return;
                    default:
                        return;
                }
                ams.a().a(context, true);
                return;
            }
            UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
            if (uIBlockActionOpenSection != null) {
                SearchStatsLoggingInfo b = this.t.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true);
                b5aVar.a(new cfp0(uIBlockActionOpenSection, null));
                String str2 = uIBlockActionOpenSection.B;
                String str3 = uIBlockHeader.y;
                nda.e(this.p, context, this.o, str2, str3 == null ? "" : str3, uIBlockActionOpenSection.E, b, null, PsExtractor.AUDIO_STREAM);
                return;
            }
            UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockHeader.F;
            if (uIBlockActionSwitchSection != null) {
                b5aVar.a(new cfp0(uIBlockActionSwitchSection, null));
                a.e(this.s, context, uIBlockHeader, uIBlockActionSwitchSection, null, 56);
                return;
            }
            UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlockHeader.G;
            if (uIBlockActionOpenSearchTab != null) {
                b5aVar.a(new cfp0(uIBlockActionOpenSearchTab, null));
                ysg0.b.a(new UIBlockActionOpenSearchTab.a(uIBlockActionOpenSearchTab.A));
                return;
            }
            UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockHeader.J;
            if (uIBlockActionOpenUrl != null) {
                b5aVar.a(new cfp0(uIBlockActionOpenUrl, null));
                a.e(this.s, context, uIBlockHeader, uIBlockActionOpenUrl, null, 56);
            }
        }
    }

    public final void d(VkGroupHeader.Right right) {
        this.v.setValue(this, x[0], right);
    }

    @Override // com.vk.catalog2.common.ui.holders.ComposeHeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        String str = this.l;
        if (str == null) {
            str = "";
        }
        int i = 28;
        c(new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(str, new kd(this, i)), null, null, 6));
        d(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.C0841a(2, new ld(this, i)), 3));
        this.w = a().findViewById(R.id.ds_internal_group_header_title);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.holders.ComposeHeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        a().getGlobalVisibleRect(rect);
        return true;
    }

    @Override // com.vk.catalog2.common.ui.holders.ComposeHeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
