package ru.ozon.app.android.payment.ui.updateOrderC2C;

import Bc.r;
import Ge.f;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CRepository;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO;", "updateOrder", "(Ljava/lang/String;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateOrderC2CRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public UpdateOrderC2CRepository(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateOrderDO updateOrder$lambda$1$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (UpdateOrderDO) function1.invoke(p02);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateOrder(@NotNull String str, @NotNull c cVar, @NotNull d<? super Result<UpdateOrderDO>> dVar) {
        UpdateOrderC2CRepository$updateOrder$1 updateOrderC2CRepository$updateOrder$1;
        int i11;
        try {
            if (dVar instanceof UpdateOrderC2CRepository$updateOrder$1) {
                updateOrderC2CRepository$updateOrder$1 = (UpdateOrderC2CRepository$updateOrder$1) dVar;
                int i12 = updateOrderC2CRepository$updateOrder$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    updateOrderC2CRepository$updateOrder$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = updateOrderC2CRepository$updateOrder$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = updateOrderC2CRepository$updateOrder$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        y callActionWithTracking = this.actionV2Repository.callActionWithTracking(new ActionV2Request(null, str, false, 5, null), cVar, UpdateOrderDTO.class);
                        H2.c cVar2 = new H2.c(UpdateOrderC2CRepository$updateOrder$2$1.INSTANCE, 7);
                        callActionWithTracking.getClass();
                        r rVar = new r(callActionWithTracking, cVar2);
                        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
                        updateOrderC2CRepository$updateOrder$1.label = 1;
                        obj = f.b(rVar, updateOrderC2CRepository$updateOrder$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
                    return new Result.Success((UpdateOrderDO) obj);
                }
            }
            if (i11 != 0) {
            }
            Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
            return new Result.Success((UpdateOrderDO) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        updateOrderC2CRepository$updateOrder$1 = new UpdateOrderC2CRepository$updateOrder$1(this, dVar);
        Object obj2 = updateOrderC2CRepository$updateOrder$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = updateOrderC2CRepository$updateOrder$1.label;
    }
}
