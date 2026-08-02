package ru.ozon.app.android.monetization.widgets.matchShoppingCards.core;

import WZ.l;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$3$1 extends AbstractC7737t implements Function1<TokenizedTrackingInfo, Unit> {
    final /* synthetic */ i<MatchShoppingCardsVI> $this_content;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$3$1(l lVar, i<MatchShoppingCardsVI> iVar) {
        super(1);
        this.$tokenizedAnalytics = lVar;
        this.$this_content = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TokenizedTrackingInfo tokenizedTrackingInfo) {
        invoke2(tokenizedTrackingInfo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TokenizedTrackingInfo trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        String actionType = trackingInfo.getActionType();
        l lVar = this.$tokenizedAnalytics;
        Map i11 = U.i(new Pair(actionType, trackingInfo));
        Long valueOf = Long.valueOf(this.$this_content.b().getId());
        Intrinsics.checkNotNullParameter(i11, "<this>");
        TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar, x.b(i11, valueOf, actionType), null, 2, null);
    }
}
