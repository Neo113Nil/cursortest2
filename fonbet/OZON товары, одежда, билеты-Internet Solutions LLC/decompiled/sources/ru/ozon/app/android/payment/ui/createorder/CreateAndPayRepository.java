package ru.ozon.app.android.payment.ui.createorder;

import Bc.r;
import DJ.e;
import Ge.f;
import Hs.b;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.AuthorizePaymentDO;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.AuthorizePaymentDTO;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.AuthorizePaymentRequest;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.MobilePaymentToken;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDTO;
import ru.ozon.app.android.payment.ui.createOrderV2.CreateOrderV2Response;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0010J8\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "body", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "createOrderOrPay", "(Ljava/lang/String;LW10/c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response;", "createOrderV2", "orderNumber", "paymentToken", "authorizeComposerActionName", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "googlePayToken", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentDO;", "processGooglePay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateAndPayRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository$Companion;", "", "<init>", "()V", "DEFAULT_AUTHORIZE_ACTION", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CreateAndPayRepository(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object createOrderOrPay$default(CreateAndPayRepository createAndPayRepository, String str, c cVar, Map map, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            map = null;
        }
        return createAndPayRepository.createOrderOrPay(str, cVar, map, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDO createOrderOrPay$lambda$1$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (OrderDO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateOrderV2Response createOrderV2$lambda$3$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CreateOrderV2Response) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorizePaymentDTO processGooglePay$lambda$5$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AuthorizePaymentDTO) function1.invoke(p02);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createOrderOrPay(@NotNull String str, @NotNull c cVar, Map<String, String> map, @NotNull d<? super Result<OrderDO>> dVar) {
        CreateAndPayRepository$createOrderOrPay$1 createAndPayRepository$createOrderOrPay$1;
        int i11;
        try {
            if (dVar instanceof CreateAndPayRepository$createOrderOrPay$1) {
                createAndPayRepository$createOrderOrPay$1 = (CreateAndPayRepository$createOrderOrPay$1) dVar;
                int i12 = createAndPayRepository$createOrderOrPay$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    createAndPayRepository$createOrderOrPay$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = createAndPayRepository$createOrderOrPay$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = createAndPayRepository$createOrderOrPay$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        y callActionWithTracking = this.actionV2Repository.callActionWithTracking(new ActionV2Request(map, str, false, 4, null), cVar, OrderDTO.class);
                        e eVar = new e(CreateAndPayRepository$createOrderOrPay$2$1.INSTANCE, 10);
                        callActionWithTracking.getClass();
                        r rVar = new r(callActionWithTracking, eVar);
                        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
                        createAndPayRepository$createOrderOrPay$1.label = 1;
                        obj = f.b(rVar, createAndPayRepository$createOrderOrPay$1);
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
                    return new Result.Success((OrderDO) obj);
                }
            }
            if (i11 != 0) {
            }
            Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
            return new Result.Success((OrderDO) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        createAndPayRepository$createOrderOrPay$1 = new CreateAndPayRepository$createOrderOrPay$1(this, dVar);
        Object obj2 = createAndPayRepository$createOrderOrPay$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = createAndPayRepository$createOrderOrPay$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createOrderV2(@NotNull String str, c cVar, Map<String, String> map, @NotNull d<? super Result<CreateOrderV2Response>> dVar) {
        CreateAndPayRepository$createOrderV2$1 createAndPayRepository$createOrderV2$1;
        int i11;
        try {
            if (dVar instanceof CreateAndPayRepository$createOrderV2$1) {
                createAndPayRepository$createOrderV2$1 = (CreateAndPayRepository$createOrderV2$1) dVar;
                int i12 = createAndPayRepository$createOrderV2$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    createAndPayRepository$createOrderV2$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = createAndPayRepository$createOrderV2$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = createAndPayRepository$createOrderV2$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        ActionV2Repository actionV2Repository = this.actionV2Repository;
                        ActionV2Request actionV2Request = new ActionV2Request(map, str, false, 4, null);
                        if (cVar == null) {
                            cVar = new c(null, null, null);
                        }
                        y callActionWithTracking = actionV2Repository.callActionWithTracking(actionV2Request, cVar, CreateOrderV2Response.class);
                        b bVar = new b(CreateAndPayRepository$createOrderV2$2$1.INSTANCE, 10);
                        callActionWithTracking.getClass();
                        r rVar = new r(callActionWithTracking, bVar);
                        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
                        createAndPayRepository$createOrderV2$1.label = 1;
                        obj = f.b(rVar, createAndPayRepository$createOrderV2$1);
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
                    return new Result.Success((CreateOrderV2Response) obj);
                }
            }
            if (i11 != 0) {
            }
            Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
            return new Result.Success((CreateOrderV2Response) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        createAndPayRepository$createOrderV2$1 = new CreateAndPayRepository$createOrderV2$1(this, dVar);
        Object obj2 = createAndPayRepository$createOrderV2$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = createAndPayRepository$createOrderV2$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processGooglePay(@NotNull String str, @NotNull String str2, String str3, @NotNull MobilePaymentToken mobilePaymentToken, @NotNull d<? super Result<AuthorizePaymentDO>> dVar) {
        CreateAndPayRepository$processGooglePay$1 createAndPayRepository$processGooglePay$1;
        int i11;
        try {
            if (dVar instanceof CreateAndPayRepository$processGooglePay$1) {
                createAndPayRepository$processGooglePay$1 = (CreateAndPayRepository$processGooglePay$1) dVar;
                int i12 = createAndPayRepository$processGooglePay$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    createAndPayRepository$processGooglePay$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = createAndPayRepository$processGooglePay$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = createAndPayRepository$processGooglePay$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        AuthorizePaymentRequest authorizePaymentRequest = new AuthorizePaymentRequest(new AuthorizePaymentRequest.GooglePayRequest(mobilePaymentToken), str2);
                        if (str3 == null) {
                            str3 = "payfacadeGatewayAuthorizePayment";
                        }
                        y callAction = this.actionV2Repository.callAction(new ActionV2Request(authorizePaymentRequest, str3, false, 4, null), AuthorizePaymentDTO.class);
                        Hs.c cVar = new Hs.c(CreateAndPayRepository$processGooglePay$2$payment$1.INSTANCE, 8);
                        callAction.getClass();
                        r rVar = new r(callAction, cVar);
                        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
                        createAndPayRepository$processGooglePay$1.L$0 = str;
                        createAndPayRepository$processGooglePay$1.label = 1;
                        obj = f.b(rVar, createAndPayRepository$processGooglePay$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) createAndPayRepository$processGooglePay$1.L$0;
                        s.b(obj);
                    }
                    return new Result.Success(new AuthorizePaymentDO(str, ((AuthorizePaymentDTO) obj).getRedirect3dsUrl()));
                }
            }
            if (i11 != 0) {
            }
            return new Result.Success(new AuthorizePaymentDO(str, ((AuthorizePaymentDTO) obj).getRedirect3dsUrl()));
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        createAndPayRepository$processGooglePay$1 = new CreateAndPayRepository$processGooglePay$1(this, dVar);
        Object obj2 = createAndPayRepository$processGooglePay$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = createAndPayRepository$processGooglePay$1.label;
    }
}
