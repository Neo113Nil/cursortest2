package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CardsKt$CardsDeck$2$1$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ MatchShoppingCardsVI.Card $card;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ Function1<TokenizedTrackingInfo, Unit> $onEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CardsKt$CardsDeck$2$1$1$1(MatchShoppingCardsVI.Card card, Function1<? super TokenizedTrackingInfo, Unit> function1, Function1<? super AtomAction, Unit> function12) {
        super(1);
        this.$card = card;
        this.$onEvent = function1;
        this.$onAction = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        TokenizedTrackingInfo click;
        Intrinsics.checkNotNullParameter(action, "action");
        MatchShoppingCardsVI.Card.TrackingInfo trackingInfo = this.$card.getTrackingInfo();
        if (trackingInfo != null && (click = trackingInfo.getClick()) != null) {
            this.$onEvent.invoke(click);
        }
        this.$onAction.invoke(action);
    }
}
