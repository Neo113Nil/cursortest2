package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.B0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewModel$handleSwipeOutEnd$2", f = "MatchShoppingCardsViewModel.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewModel$handleSwipeOutEnd$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ MatchShoppingCardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewModel$handleSwipeOutEnd$2(MatchShoppingCardsViewModel matchShoppingCardsViewModel, d<? super MatchShoppingCardsViewModel$handleSwipeOutEnd$2> dVar) {
        super(2, dVar);
        this.this$0 = matchShoppingCardsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MatchShoppingCardsViewModel$handleSwipeOutEnd$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B0 b02;
        x0 x0Var;
        Object value;
        LinkedList linkedList;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            b02 = this.this$0.currentSwipeAction;
            if (b02 != null) {
                this.label = 1;
                if (b02.r0(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.currentSwipeAction = null;
        this.this$0.nextCardSwipeAttempts = 0;
        x0Var = this.this$0.mutableViewState;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, MatchShoppingCardsViewState.copy$default((MatchShoppingCardsViewState) value, null, false, false, true, true, null, false, 103, null)));
        linkedList = this.this$0.cards;
        if (linkedList.isEmpty()) {
            this.this$0.refreshWidget();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MatchShoppingCardsViewModel$handleSwipeOutEnd$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
