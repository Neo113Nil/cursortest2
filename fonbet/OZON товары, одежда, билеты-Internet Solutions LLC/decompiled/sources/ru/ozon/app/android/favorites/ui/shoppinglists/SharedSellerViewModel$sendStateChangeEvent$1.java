package ru.ozon.app.android.favorites.ui.shoppinglists;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel$sendStateChangeEvent$1", f = "SharedSellerViewModel.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SharedSellerViewModel$sendStateChangeEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionSellerId;
    int label;
    final /* synthetic */ SharedSellerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedSellerViewModel$sendStateChangeEvent$1(SharedSellerViewModel sharedSellerViewModel, String str, d<? super SharedSellerViewModel$sendStateChangeEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = sharedSellerViewModel;
        this.$actionSellerId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SharedSellerViewModel$sendStateChangeEvent$1(this.this$0, this.$actionSellerId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List<Action> list2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            list = this.this$0.list;
            list.add(new Action(this.$actionSellerId));
            x0<List<Action>> shouldForceUnFavStateFlow = this.this$0.getShouldForceUnFavStateFlow();
            list2 = this.this$0.list;
            this.label = 1;
            if (shouldForceUnFavStateFlow.emit(list2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SharedSellerViewModel$sendStateChangeEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
