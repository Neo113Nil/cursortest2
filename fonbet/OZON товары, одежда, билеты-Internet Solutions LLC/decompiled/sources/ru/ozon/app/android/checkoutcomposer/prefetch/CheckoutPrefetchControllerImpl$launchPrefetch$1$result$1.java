package ru.ozon.app.android.checkoutcomposer.prefetch;

import A00.a;
import Sc.s;
import Wc.a;
import i10.g;
import i10.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.checkoutcomposer.common.configurator.CheckoutRequestInterceptor;
import ru.ozon.app.android.checkoutcomposer.common.configurator.InitCheckoutRequestConfigurator;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Li10/h;", "<anonymous>", "(Lxe/M;)Li10/h;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.prefetch.CheckoutPrefetchControllerImpl$launchPrefetch$1$result$1", f = "CheckoutPrefetchControllerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CheckoutPrefetchControllerImpl$launchPrefetch$1$result$1 extends j implements Function2<M, d<? super h>, Object> {
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CheckoutPrefetchControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutPrefetchControllerImpl$launchPrefetch$1$result$1(Map<String, String> map, CheckoutPrefetchControllerImpl checkoutPrefetchControllerImpl, String str, d<? super CheckoutPrefetchControllerImpl$launchPrefetch$1$result$1> dVar) {
        super(2, dVar);
        this.$params = map;
        this.this$0 = checkoutPrefetchControllerImpl;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CheckoutPrefetchControllerImpl$launchPrefetch$1$result$1(this.$params, this.this$0, this.$url, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map<String, ? extends Object> map;
        InitCheckoutRequestConfigurator initCheckoutRequestConfigurator;
        AvailableNativePaymentInterceptor availableNativePaymentInterceptor;
        CheckoutRequestInterceptor checkoutRequestInterceptor;
        String str;
        JsonParser jsonParser;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Map<String, String> map2 = this.$params;
        if (map2 == null || (str = map2.get("postData")) == null) {
            map = null;
        } else {
            jsonParser = this.this$0.jsonDeserializer;
            map = (Map) jsonParser.fromJson(str, Map.class);
        }
        this.this$0.removeCacheForRequestIfNeeded(this.$url, map);
        initCheckoutRequestConfigurator = this.this$0.initCheckoutRequestConfigurator;
        h onInit = initCheckoutRequestConfigurator.onInit(new h(new h.c.a("", (String) null, (String) null, 14), g.GET));
        availableNativePaymentInterceptor = this.this$0.availableNativePaymentInterceptor;
        availableNativePaymentInterceptor.interceptState(onInit, a.t.f241a);
        checkoutRequestInterceptor = this.this$0.checkoutRequestInterceptor;
        checkoutRequestInterceptor.onInit(onInit);
        return onInit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super h> dVar) {
        return ((CheckoutPrefetchControllerImpl$launchPrefetch$1$result$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
