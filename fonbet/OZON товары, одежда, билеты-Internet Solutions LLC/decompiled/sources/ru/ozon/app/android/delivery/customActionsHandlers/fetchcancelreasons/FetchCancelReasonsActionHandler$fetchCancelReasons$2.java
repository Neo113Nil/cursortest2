package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons;

import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsRepository;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.FetchCancelReasonsActionHandler$fetchCancelReasons$2", f = "FetchCancelReasonsActionHandler.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class FetchCancelReasonsActionHandler$fetchCancelReasons$2 extends j implements Function2<M, d<? super CancelReasonsWithPayloads>, Object> {
    final /* synthetic */ Map<String, String> $body;
    final /* synthetic */ String $link;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ FetchCancelReasonsActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchCancelReasonsActionHandler$fetchCancelReasons$2(FetchCancelReasonsActionHandler fetchCancelReasonsActionHandler, String str, Map<String, String> map, c cVar, d<? super FetchCancelReasonsActionHandler$fetchCancelReasons$2> dVar) {
        super(2, dVar);
        this.this$0 = fetchCancelReasonsActionHandler;
        this.$link = str;
        this.$body = map;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FetchCancelReasonsActionHandler$fetchCancelReasons$2(this.this$0, this.$link, this.$body, this.$trackingData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CancelReasonsRepository cancelReasonsRepository;
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
        cancelReasonsRepository = this.this$0.cancelReasonsRepository;
        String str = this.$link;
        Map<String, String> map = this.$body;
        c cVar = this.$trackingData;
        this.label = 1;
        Object fetchCancelReasons = cancelReasonsRepository.fetchCancelReasons(str, map, cVar, this);
        return fetchCancelReasons == aVar ? aVar : fetchCancelReasons;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super CancelReasonsWithPayloads> dVar) {
        return ((FetchCancelReasonsActionHandler$fetchCancelReasons$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
