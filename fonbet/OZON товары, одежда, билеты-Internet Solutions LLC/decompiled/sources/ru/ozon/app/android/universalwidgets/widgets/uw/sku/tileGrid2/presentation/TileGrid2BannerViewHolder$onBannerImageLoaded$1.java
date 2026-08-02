package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import WZ.e;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class TileGrid2BannerViewHolder$onBannerImageLoaded$1 extends C7735q implements Function2<t, e, Unit> {
    TileGrid2BannerViewHolder$onBannerImageLoaded$1(Object obj) {
        super(2, obj, TokenizedAnalyticsExtensionsKt.class, "processViewEvents", "processViewEvents(Lru/ozon/composer/analytics/tokenized/TokenizedAnalytics;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Lru/ozon/composer/analytics/tokenized/CustomParamsModifier;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(t tVar, e eVar) {
        invoke2(tVar, eVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t p02, e eVar) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        TokenizedAnalyticsExtensionsKt.processViewEvents((l) this.receiver, p02, eVar);
    }
}
