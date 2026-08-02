package ru.ozon.app.android.monetization.widgets.matchShoppingCards.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewIntent;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$2$1 extends C7735q implements Function1<MatchShoppingCardsViewIntent, Unit> {
    MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$2$1(Object obj) {
        super(1, obj, MatchShoppingCardsViewModel.class, "onViewIntent", "onViewIntent(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewIntent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MatchShoppingCardsViewIntent matchShoppingCardsViewIntent) {
        invoke2(matchShoppingCardsViewIntent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MatchShoppingCardsViewIntent p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((MatchShoppingCardsViewModel) this.receiver).onViewIntent(p02);
    }
}
