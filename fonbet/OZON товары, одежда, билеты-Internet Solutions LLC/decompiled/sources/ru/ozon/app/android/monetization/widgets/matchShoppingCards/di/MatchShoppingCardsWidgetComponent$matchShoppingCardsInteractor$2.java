package ru.ozon.app.android.monetization.widgets.matchShoppingCards.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsInteractorImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsInteractorImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsWidgetComponent$matchShoppingCardsInteractor$2 extends AbstractC7737t implements Function0<MatchShoppingCardsInteractorImpl> {
    final /* synthetic */ MatchShoppingCardsWidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsWidgetComponent$matchShoppingCardsInteractor$2(MatchShoppingCardsWidgetComponent matchShoppingCardsWidgetComponent) {
        super(0);
        this.this$0 = matchShoppingCardsWidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MatchShoppingCardsInteractorImpl invoke() {
        ActionComponentApi actionComponentApi;
        actionComponentApi = this.this$0.getActionComponentApi();
        return new MatchShoppingCardsInteractorImpl(actionComponentApi.getActionRepository(), this.this$0.getMapper());
    }
}
