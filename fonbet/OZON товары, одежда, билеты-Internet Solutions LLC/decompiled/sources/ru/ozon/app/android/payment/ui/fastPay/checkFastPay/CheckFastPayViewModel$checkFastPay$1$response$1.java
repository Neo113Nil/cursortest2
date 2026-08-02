package ru.ozon.app.android.payment.ui.fastPay.checkFastPay;

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
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.payment.ui.fastPay.FastPayRepository;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/action/v2/models/ActionV2Response;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayViewModel$checkFastPay$1$response$1", f = "CheckFastPayViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CheckFastPayViewModel$checkFastPay$1$response$1 extends j implements Function2<M, d<? super ActionV2Response<CheckFastPayResponse>>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $body;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ CheckFastPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckFastPayViewModel$checkFastPay$1$response$1(CheckFastPayViewModel checkFastPayViewModel, String str, c cVar, Map<String, String> map, d<? super CheckFastPayViewModel$checkFastPay$1$response$1> dVar) {
        super(2, dVar);
        this.this$0 = checkFastPayViewModel;
        this.$actionName = str;
        this.$trackingData = cVar;
        this.$body = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CheckFastPayViewModel$checkFastPay$1$response$1(this.this$0, this.$actionName, this.$trackingData, this.$body, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FastPayRepository fastPayRepository;
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
        fastPayRepository = this.this$0.repository;
        String str = this.$actionName;
        c cVar = this.$trackingData;
        Map<String, String> map = this.$body;
        this.label = 1;
        Object checkFastPay = fastPayRepository.checkFastPay(str, cVar, map, this);
        return checkFastPay == aVar ? aVar : checkFastPay;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ActionV2Response<CheckFastPayResponse>> dVar) {
        return ((CheckFastPayViewModel$checkFastPay$1$response$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
