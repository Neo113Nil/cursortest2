package ru.ozon.app.android.payment.ui.fastPay;

import W10.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayResponse;
import ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayResponse;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/FastPayRepository;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "body", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayResponse;", "linkFastPay", "(Ljava/lang/String;LW10/c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse;", "checkFastPay", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FastPayRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public FastPayRepository(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    public final Object checkFastPay(@NotNull String str, c cVar, Map<String, String> map, @NotNull d<? super ActionV2Response<CheckFastPayResponse>> dVar) {
        ActionV2Repository actionV2Repository = this.actionV2Repository;
        ActionV2Request actionV2Request = new ActionV2Request(map, str, false, 4, null);
        if (cVar == null) {
            cVar = new c(null, null, null);
        }
        return actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, CheckFastPayResponse.class, dVar);
    }

    public final Object linkFastPay(@NotNull String str, @NotNull c cVar, Map<String, String> map, @NotNull d<? super ActionV2Response<LinkFastPayResponse>> dVar) {
        return this.actionV2Repository.callActionWithTrackingSuspend(new ActionV2Request(map, str, false, 4, null), cVar, LinkFastPayResponse.class, dVar);
    }
}
