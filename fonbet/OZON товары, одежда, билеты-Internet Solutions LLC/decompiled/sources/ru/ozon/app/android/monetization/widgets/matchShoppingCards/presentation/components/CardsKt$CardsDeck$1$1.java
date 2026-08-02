package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CardsKt$CardsDeck$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ MatchShoppingCardsVI.Card $firstCard;
    final /* synthetic */ Function1<TokenizedTrackingInfo, Unit> $onEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CardsKt$CardsDeck$1$1(MatchShoppingCardsVI.Card card, Function1<? super TokenizedTrackingInfo, Unit> function1) {
        super(0);
        this.$firstCard = card;
        this.$onEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MatchShoppingCardsVI.Card.TrackingInfo trackingInfo;
        TokenizedTrackingInfo view;
        MatchShoppingCardsVI.Card card = this.$firstCard;
        if (card == null || (trackingInfo = card.getTrackingInfo()) == null || (view = trackingInfo.getView()) == null) {
            return;
        }
        this.$onEvent.invoke(view);
    }
}
