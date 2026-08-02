package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.HeaderVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.util.a;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.ams;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.dhr0;
import xsna.eda;
import xsna.hrr0;
import xsna.i4a;
import xsna.mh4;
import xsna.nda;
import xsna.s3q0;
import xsna.ysg0;

/* compiled from: HeaderShowAllVh.kt */
/* loaded from: classes16.dex */
public class HeaderShowAllVh extends HeaderVh {
    public final long A;
    public final CatalogConfiguration s;
    public final nda t;
    public final eda u;
    public final b5a v;
    public final a w;
    public final SearchStatInfoProvider x;
    public ImageView y;
    public final hrr0 z;

    public HeaderShowAllVh(CatalogConfiguration catalogConfiguration, nda ndaVar, eda edaVar, b5a b5aVar, a aVar, int i, SearchStatInfoProvider searchStatInfoProvider) {
        super(i, null, b5aVar, 8);
        this.s = catalogConfiguration;
        this.t = ndaVar;
        this.u = edaVar;
        this.v = b5aVar;
        this.w = aVar;
        this.x = searchStatInfoProvider;
        this.z = new hrr0();
        this.A = SystemClock.elapsedRealtime();
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        boolean z = (uIBlock instanceof UIBlockHeader) && ((UIBlockHeader) uIBlock).L != null;
        View view = this.f;
        if (view == null) {
            view = null;
        }
        c98 c98Var = new c98(this, 1);
        if (!z) {
            c98Var = null;
        }
        view.setOnClickListener(c98Var);
        view.setClickable(z);
        view.setFocusable(z);
        view.setForeground(z ? dhr0.t.d(R.attr.selectableItemBackground) : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        TextView textView = this.j;
        if (textView != null) {
            textView.setOnClickListener(new c98(this, 1));
        }
        ImageView imageView = (ImageView) k5.findViewById(R.id.show_all_btn_icon);
        this.y = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new c98(this, 1));
        }
        this.z.a("HeaderShowAllVh", k5, this.A);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, android.view.View.OnClickListener
    public void onClick(View view) {
        Context context;
        UIBlockHeader uIBlockHeader;
        s3q0 s3q0Var;
        UIBlockHeader uIBlockHeader2;
        s3q0 s3q0Var2;
        s3q0 s3q0Var3;
        UIBlockActionOpenUrl uIBlockActionOpenUrl;
        if (view == null || (context = view.getContext()) == null || (uIBlockHeader = this.k) == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.header_show_all || id == R.id.show_all_btn || id == R.id.show_all_btn_icon) {
            UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockHeader.D;
            if (uIBlockActionShowFilters != null) {
                i4a.b(context, uIBlockActionShowFilters.A, null, new mh4(16, this, context));
                s3q0 s3q0Var4 = s3q0.a;
                return;
            }
            UIBlockActionOpenScreen uIBlockActionOpenScreen = uIBlockHeader.I;
            if (uIBlockActionOpenScreen != null) {
                String str = uIBlockActionOpenScreen.A;
                int hashCode = str.hashCode();
                if (hashCode != -1822967846) {
                    if (hashCode != -1209078378) {
                        if (hashCode == -1004912850 && str.equals("friends_requests")) {
                            ams.a().m(context);
                        }
                    } else if (str.equals("birthdays")) {
                        ams.a().h(context);
                    }
                } else if (str.equals("recommendations")) {
                    ams.a().a(context, true);
                }
                s3q0 s3q0Var5 = s3q0.a;
                return;
            }
            UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
            b5a b5aVar = this.v;
            if (uIBlockActionOpenSection != null) {
                SearchStatInfoProvider searchStatInfoProvider = this.x;
                SearchStatsLoggingInfo b = searchStatInfoProvider != null ? searchStatInfoProvider.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true) : null;
                b5aVar.a(new cfp0(uIBlockActionOpenSection, null));
                String str2 = uIBlockActionOpenSection.B;
                String str3 = uIBlockHeader.y;
                nda.e(this.t, context, this.s, str2, str3 == null ? "" : str3, uIBlockActionOpenSection.E, b, null, PsExtractor.AUDIO_STREAM);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var == null) {
                UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockHeader.F;
                if (uIBlockActionSwitchSection != null) {
                    b5aVar.a(new cfp0(uIBlockActionSwitchSection, null));
                    uIBlockHeader2 = uIBlockHeader;
                    a.e(this.w, context, uIBlockHeader2, uIBlockActionSwitchSection, null, 56);
                    s3q0Var2 = s3q0.a;
                } else {
                    uIBlockHeader2 = uIBlockHeader;
                    s3q0Var2 = null;
                }
                if (s3q0Var2 == null) {
                    UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlockHeader2.G;
                    if (uIBlockActionOpenSearchTab != null) {
                        b5aVar.a(new cfp0(uIBlockActionOpenSearchTab, null));
                        ysg0.b.a(new UIBlockActionOpenSearchTab.a(uIBlockActionOpenSearchTab.A));
                        s3q0Var3 = s3q0.a;
                    } else {
                        s3q0Var3 = null;
                    }
                    if (s3q0Var3 != null || (uIBlockActionOpenUrl = uIBlockHeader2.J) == null) {
                        return;
                    }
                    b5aVar.a(new cfp0(uIBlockActionOpenUrl, null));
                    a.e(this.w, context, uIBlockHeader2, uIBlockActionOpenUrl, null, 56);
                    s3q0 s3q0Var6 = s3q0.a;
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.getGlobalVisibleRect(rect);
        return true;
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
