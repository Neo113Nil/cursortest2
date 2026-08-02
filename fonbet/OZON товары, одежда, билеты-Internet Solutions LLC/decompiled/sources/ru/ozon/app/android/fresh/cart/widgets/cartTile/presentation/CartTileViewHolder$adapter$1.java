package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CartTileViewHolder$adapter$1 extends C7719a implements Function1<t, Unit> {
    CartTileViewHolder$adapter$1(Object obj) {
        super(1, obj, TokenizedAnalyticsExtensionsKt.class, "processViewEvents", "processViewEvents(Lru/ozon/composer/analytics/tokenized/TokenizedAnalytics;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Lru/ozon/composer/analytics/tokenized/CustomParamsModifier;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        TokenizedAnalyticsExtensionsKt.processViewEvents$default((l) this.receiver, p02, null, 2, null);
    }
}
