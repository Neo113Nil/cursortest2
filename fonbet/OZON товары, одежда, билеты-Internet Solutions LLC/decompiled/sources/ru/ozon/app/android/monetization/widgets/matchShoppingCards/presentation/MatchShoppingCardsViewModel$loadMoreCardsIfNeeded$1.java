package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewModel", f = "MatchShoppingCardsViewModel.kt", l = {164}, m = "loadMoreCardsIfNeeded")
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewModel$loadMoreCardsIfNeeded$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MatchShoppingCardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewModel$loadMoreCardsIfNeeded$1(MatchShoppingCardsViewModel matchShoppingCardsViewModel, d<? super MatchShoppingCardsViewModel$loadMoreCardsIfNeeded$1> dVar) {
        super(dVar);
        this.this$0 = matchShoppingCardsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object loadMoreCardsIfNeeded;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        loadMoreCardsIfNeeded = this.this$0.loadMoreCardsIfNeeded(this);
        return loadMoreCardsIfNeeded;
    }
}
