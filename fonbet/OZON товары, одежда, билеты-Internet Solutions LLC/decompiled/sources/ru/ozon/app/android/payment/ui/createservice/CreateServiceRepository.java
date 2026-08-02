package ru.ozon.app.android.payment.ui.createservice;

import Bc.r;
import Ge.f;
import Sc.s;
import Ue0.C4066a;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceRepository;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "body", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO;", "createService", "(Ljava/lang/String;LW10/c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateServiceRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public CreateServiceRepository(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateServiceDO createService$lambda$1$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CreateServiceDO) function1.invoke(p02);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createService(@NotNull String str, @NotNull c cVar, Map<String, String> map, @NotNull d<? super Result<CreateServiceDO>> dVar) {
        CreateServiceRepository$createService$1 createServiceRepository$createService$1;
        int i11;
        try {
            if (dVar instanceof CreateServiceRepository$createService$1) {
                createServiceRepository$createService$1 = (CreateServiceRepository$createService$1) dVar;
                int i12 = createServiceRepository$createService$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    createServiceRepository$createService$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = createServiceRepository$createService$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = createServiceRepository$createService$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        y callActionWithTracking = this.actionV2Repository.callActionWithTracking(new ActionV2Request(map, str, false, 4, null), cVar, CreateServiceDTO.class);
                        C4066a c4066a = new C4066a(CreateServiceRepository$createService$2$1.INSTANCE, 3);
                        callActionWithTracking.getClass();
                        r rVar = new r(callActionWithTracking, c4066a);
                        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
                        createServiceRepository$createService$1.label = 1;
                        obj = f.b(rVar, createServiceRepository$createService$1);
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
                    return new Result.Success((CreateServiceDO) obj);
                }
            }
            if (i11 != 0) {
            }
            Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
            return new Result.Success((CreateServiceDO) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        createServiceRepository$createService$1 = new CreateServiceRepository$createService$1(this, dVar);
        Object obj2 = createServiceRepository$createService$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = createServiceRepository$createService$1.label;
    }
}
