package ru.ozon.app.android.cart.domain.async;

import K00.i;
import L00.g;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.domain.async.AsyncCartService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartService$doRequest$2", f = "AsyncCartService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AsyncCartService$doRequest$2 extends j implements Function2<M, d<? super AsyncCartService.FetchData>, Object> {
    final /* synthetic */ Map<String, String> $requestBody;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ AsyncCartService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncCartService$doRequest$2(String str, Map<String, String> map, AsyncCartService asyncCartService, d<? super AsyncCartService$doRequest$2> dVar) {
        super(2, dVar);
        this.$url = str;
        this.$requestBody = map;
        this.this$0 = asyncCartService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AsyncCartService$doRequest$2(this.$url, this.$requestBody, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        g.a aVar2 = new g.a();
        aVar2.g(this.$url);
        aVar2.i();
        aVar2.h(this.$requestBody);
        g a11 = aVar2.a();
        iVar = this.this$0.repository;
        return new AsyncCartService.FetchData(iVar.c(a11));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AsyncCartService.FetchData> dVar) {
        return ((AsyncCartService$doRequest$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
