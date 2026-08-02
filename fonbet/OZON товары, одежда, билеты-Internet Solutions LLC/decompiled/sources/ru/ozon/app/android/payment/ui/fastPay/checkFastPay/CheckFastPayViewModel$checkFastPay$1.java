package ru.ozon.app.android.payment.ui.fastPay.checkFastPay;

import He.b;
import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayViewModel$checkFastPay$1", f = "CheckFastPayViewModel.kt", l = {42, 50, 51, 56}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CheckFastPayViewModel$checkFastPay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $body;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ CheckFastPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckFastPayViewModel$checkFastPay$1(CheckFastPayViewModel checkFastPayViewModel, String str, c cVar, Map<String, String> map, d<? super CheckFastPayViewModel$checkFastPay$1> dVar) {
        super(2, dVar);
        this.this$0 = checkFastPayViewModel;
        this.$actionName = str;
        this.$trackingData = cVar;
        this.$body = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CheckFastPayViewModel$checkFastPay$1(this.this$0, this.$actionName, this.$trackingData, this.$body, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r13 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (r13 != r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object processError;
        Object processError2;
        Object processCheckFastPay;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            Lm0.a.f17149a.e(e12);
            CheckFastPayViewModel checkFastPayViewModel = this.this$0;
            this.label = 4;
            processError = checkFastPayViewModel.processError(this);
        }
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            b bVar = b.f10879b;
            CheckFastPayViewModel$checkFastPay$1$response$1 checkFastPayViewModel$checkFastPay$1$response$1 = new CheckFastPayViewModel$checkFastPay$1$response$1(this.this$0, this.$actionName, this.$trackingData, this.$body, null);
            this.label = 1;
            obj = C10727i.f(bVar, checkFastPayViewModel$checkFastPay$1$response$1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    s.b(obj);
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        CheckFastPayResponse checkFastPayResponse = (CheckFastPayResponse) ((ActionV2Response) obj).getData();
        if (checkFastPayResponse != null) {
            CheckFastPayViewModel checkFastPayViewModel2 = this.this$0;
            this.label = 2;
            processCheckFastPay = checkFastPayViewModel2.processCheckFastPay(checkFastPayResponse, this);
            if (processCheckFastPay == aVar) {
                return aVar;
            }
            return Unit.f71690a;
        }
        CheckFastPayViewModel checkFastPayViewModel3 = this.this$0;
        this.label = 3;
        processError2 = checkFastPayViewModel3.processError(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CheckFastPayViewModel$checkFastPay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
