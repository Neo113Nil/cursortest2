package ru.ozon.app.android.cart.domain.async;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.domain.async.AsyncCartService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartService$waitNewInputsAndFetchBatch$2", f = "AsyncCartService.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AsyncCartService$waitNewInputsAndFetchBatch$2 extends j implements Function2<M, d<? super AsyncCartService.FetchData>, Object> {
    final /* synthetic */ UiAction $uiAction;
    int label;
    final /* synthetic */ AsyncCartService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncCartService$waitNewInputsAndFetchBatch$2(AsyncCartService asyncCartService, UiAction uiAction, d<? super AsyncCartService$waitNewInputsAndFetchBatch$2> dVar) {
        super(2, dVar);
        this.this$0 = asyncCartService;
        this.$uiAction = uiAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AsyncCartService$waitNewInputsAndFetchBatch$2(this.this$0, this.$uiAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object fetch;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        AsyncCartService asyncCartService = this.this$0;
        String pageUrl = this.$uiAction.getPageUrl();
        this.label = 1;
        fetch = asyncCartService.fetch(pageUrl, this);
        return fetch == aVar ? aVar : fetch;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AsyncCartService.FetchData> dVar) {
        return ((AsyncCartService$waitNewInputsAndFetchBatch$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
