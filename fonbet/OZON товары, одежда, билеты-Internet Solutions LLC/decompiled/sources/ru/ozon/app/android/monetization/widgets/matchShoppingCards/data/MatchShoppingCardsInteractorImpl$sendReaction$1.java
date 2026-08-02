package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsInteractorImpl", f = "MatchShoppingCardsInteractorImpl.kt", l = {28}, m = "sendReaction-gIAlu-s")
/* loaded from: classes12.dex */
final class MatchShoppingCardsInteractorImpl$sendReaction$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MatchShoppingCardsInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsInteractorImpl$sendReaction$1(MatchShoppingCardsInteractorImpl matchShoppingCardsInteractorImpl, d<? super MatchShoppingCardsInteractorImpl$sendReaction$1> dVar) {
        super(dVar);
        this.this$0 = matchShoppingCardsInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo810sendReactiongIAlus = this.this$0.mo810sendReactiongIAlus(null, this);
        return mo810sendReactiongIAlus == a.COROUTINE_SUSPENDED ? mo810sendReactiongIAlus : r.a(mo810sendReactiongIAlus);
    }
}
