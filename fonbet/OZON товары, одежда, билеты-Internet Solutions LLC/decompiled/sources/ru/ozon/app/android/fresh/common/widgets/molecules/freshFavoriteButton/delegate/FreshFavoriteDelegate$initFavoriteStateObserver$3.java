package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isFavorite", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$3", f = "FreshFavoriteDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshFavoriteDelegate$initFavoriteStateObserver$3 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ FreshFavoriteDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshFavoriteDelegate$initFavoriteStateObserver$3(FreshFavoriteDelegate freshFavoriteDelegate, d<? super FreshFavoriteDelegate$initFavoriteStateObserver$3> dVar) {
        super(2, dVar);
        this.this$0 = freshFavoriteDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FreshFavoriteDelegate$initFavoriteStateObserver$3 freshFavoriteDelegate$initFavoriteStateObserver$3 = new FreshFavoriteDelegate$initFavoriteStateObserver$3(this.this$0, dVar);
        freshFavoriteDelegate$initFavoriteStateObserver$3.Z$0 = ((Boolean) obj).booleanValue();
        return freshFavoriteDelegate$initFavoriteStateObserver$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FreshFavoriteState freshFavoriteState;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        FreshFavoriteDelegate freshFavoriteDelegate = this.this$0;
        freshFavoriteState = freshFavoriteDelegate.currentState;
        freshFavoriteDelegate.setState(freshFavoriteState, Boolean.valueOf(z11));
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((FreshFavoriteDelegate$initFavoriteStateObserver$3) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
