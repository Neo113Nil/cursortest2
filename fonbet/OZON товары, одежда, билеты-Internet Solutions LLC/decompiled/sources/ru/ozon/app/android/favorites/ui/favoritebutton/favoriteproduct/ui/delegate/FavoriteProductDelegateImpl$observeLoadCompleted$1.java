package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegateImpl$observeLoadCompleted$1", f = "FavoriteProductDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class FavoriteProductDelegateImpl$observeLoadCompleted$1 extends j implements Function2<a, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavoriteProductDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteProductDelegateImpl$observeLoadCompleted$1(FavoriteProductDelegateImpl favoriteProductDelegateImpl, d<? super FavoriteProductDelegateImpl$observeLoadCompleted$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteProductDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavoriteProductDelegateImpl$observeLoadCompleted$1 favoriteProductDelegateImpl$observeLoadCompleted$1 = new FavoriteProductDelegateImpl$observeLoadCompleted$1(this.this$0, dVar);
        favoriteProductDelegateImpl$observeLoadCompleted$1.L$0 = obj;
        return favoriteProductDelegateImpl$observeLoadCompleted$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((FavoriteProductDelegateImpl$observeLoadCompleted$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a aVar2 = (a) this.L$0;
        if ((aVar2 instanceof a.o) && (((a.o) aVar2).g() instanceof a.u.c)) {
            this.this$0.needLocalFavStateUpdate = true;
        }
        return Unit.f71690a;
    }
}
