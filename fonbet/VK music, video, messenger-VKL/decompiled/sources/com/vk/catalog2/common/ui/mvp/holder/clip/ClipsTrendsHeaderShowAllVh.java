package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllRightBadgeVh;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.b5a;
import xsna.bwt0;
import xsna.cqm0;
import xsna.e3m;
import xsna.eda;
import xsna.epx;
import xsna.iah0;
import xsna.iid0;
import xsna.nda;
import xsna.omw;
import xsna.oqc;
import xsna.peq0;
import xsna.sdd;

/* compiled from: ClipsTrendsHeaderShowAllVh.kt */
/* loaded from: classes16.dex */
public final class ClipsTrendsHeaderShowAllVh extends HeaderShowAllRightBadgeVh {
    public final oqc B;

    public ClipsTrendsHeaderShowAllVh(sdd sddVar, nda ndaVar, eda edaVar, com.vk.catalog2.common.ui.mvp.util.a aVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, oqc oqcVar) {
        super(sddVar, ndaVar, edaVar, b5aVar, aVar, searchStatInfoProvider);
        this.B = oqcVar;
    }

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

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        UIBlockHeader uIBlockHeader;
        UIBlockActionOpenUrl uIBlockActionOpenUrl;
        ActionOpenUrl actionOpenUrl;
        String str;
        String str2;
        Uri parse;
        Pair pair;
        String d;
        int i;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (((valueOf != null && valueOf.intValue() == R.id.header_show_all) || ((valueOf != null && valueOf.intValue() == R.id.show_all_btn) || (valueOf != null && valueOf.intValue() == R.id.show_all_btn_icon))) && (uIBlockHeader = this.k) != null && (uIBlockActionOpenUrl = uIBlockHeader.J) != null && (actionOpenUrl = uIBlockActionOpenUrl.A) != null && (str = actionOpenUrl.c) != null) {
            oqc oqcVar = this.B;
            oqcVar.getClass();
            Uri parse2 = Uri.parse(str);
            if (parse2 != null) {
                peq0 peq0Var = new peq0(parse2);
                if (peq0.p(peq0Var, (Regex) oqcVar.c.getValue(), null, null, 14)) {
                    str2 = "#".concat(peq0Var.c.group(1));
                    parse = Uri.parse(str);
                    if (parse != null) {
                        peq0 peq0Var2 = new peq0(parse);
                        if (peq0.p(peq0Var2, (Regex) oqcVar.d.getValue(), null, null, 14) && (d = peq0Var2.d(1)) != null) {
                            long l = cqm0.l(d);
                            String d2 = peq0Var2.d(2);
                            if (d2 != null) {
                                try {
                                    i = Integer.parseInt(d2);
                                } catch (Throwable unused) {
                                    i = 0;
                                }
                                pair = new Pair(Long.valueOf(l), Integer.valueOf(i));
                                if (pair == null) {
                                    pair = new Pair(null, null);
                                }
                                new iid0(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TRENDS_CATALOG, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem(MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.EventType.OPEN_TREND_GRID, (Long) pair.d(), (Integer) pair.g(), str2, null), 3)).q();
                            }
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                    new iid0(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TRENDS_CATALOG, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem(MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.EventType.OPEN_TREND_GRID, (Long) pair.d(), (Integer) pair.g(), str2, null), 3)).q();
                }
            }
            str2 = null;
            parse = Uri.parse(str);
            if (parse != null) {
            }
            pair = null;
            if (pair == null) {
            }
            new iid0(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TRENDS_CATALOG, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem(MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.EventType.OPEN_TREND_GRID, (Long) pair.d(), (Integer) pair.g(), str2, null), 3)).q();
        }
        super.onClick(view);
    }
}
