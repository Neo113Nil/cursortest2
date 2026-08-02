package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.holders.ActionOpenSliderVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vungle.ads.internal.protos.Sdk;
import xsna.b5a;
import xsna.cfp0;
import xsna.nda;

/* compiled from: ActionOpenSliderSectionVh.kt */
/* loaded from: classes16.dex */
public final class ActionOpenSliderSectionVh extends ActionOpenSliderVh {
    public final a e;
    public final nda f;
    public final b5a g;
    public final SearchStatInfoProvider h;

    public /* synthetic */ ActionOpenSliderSectionVh(a aVar, nda ndaVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this(aVar, ndaVar, b5aVar, searchStatInfoProvider, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.ActionOpenSliderVh
    public final String a(UIBlock uIBlock) {
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlock instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) uIBlock : null;
        if (uIBlockActionOpenSection != null) {
            return uIBlockActionOpenSection.z;
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.ActionOpenSliderVh
    public final void b(UIBlock uIBlock, Context context) {
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlock instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) uIBlock : null;
        if (uIBlockActionOpenSection == null) {
            return;
        }
        SearchStatsLoggingInfo b = this.h.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", uIBlockActionOpenSection.d != CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_VIDEOS);
        this.g.a(new cfp0(uIBlockActionOpenSection, null));
        nda.e(this.f, context, this.e, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, null, b, null, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
    }

    public ActionOpenSliderSectionVh(a aVar, nda ndaVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, Integer num) {
        super(num);
        this.e = aVar;
        this.f = ndaVar;
        this.g = b5aVar;
        this.h = searchStatInfoProvider;
    }
}
