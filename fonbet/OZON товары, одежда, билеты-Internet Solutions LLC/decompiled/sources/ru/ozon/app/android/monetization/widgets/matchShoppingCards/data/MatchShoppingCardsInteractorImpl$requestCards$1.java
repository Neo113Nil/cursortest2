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
@e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsInteractorImpl", f = "MatchShoppingCardsInteractorImpl.kt", l = {19}, m = "requestCards-gIAlu-s")
/* loaded from: classes12.dex */
final class MatchShoppingCardsInteractorImpl$requestCards$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MatchShoppingCardsInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsInteractorImpl$requestCards$1(MatchShoppingCardsInteractorImpl matchShoppingCardsInteractorImpl, d<? super MatchShoppingCardsInteractorImpl$requestCards$1> dVar) {
        super(dVar);
        this.this$0 = matchShoppingCardsInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo809requestCardsgIAlus = this.this$0.mo809requestCardsgIAlus(null, this);
        return mo809requestCardsgIAlus == a.COROUTINE_SUSPENDED ? mo809requestCardsgIAlus : r.a(mo809requestCardsgIAlus);
    }
}
