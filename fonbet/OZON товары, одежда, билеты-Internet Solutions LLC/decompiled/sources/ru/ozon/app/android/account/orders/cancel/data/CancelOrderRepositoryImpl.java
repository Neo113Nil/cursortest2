package ru.ozon.app.android.account.orders.cancel.data;

import Sc.s;
import W10.c;
import Wc.a;
import We.M;
import Y9.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.D;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.data.model.errors.CancelOrderError;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.CsmaErrorBody;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJR\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/account/orders/cancel/data/CancelOrderRepositoryImpl;", "Lru/ozon/app/android/account/orders/cancel/data/CancelOrderRepository;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "transform", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "", "link", "reasonId", "comment", "", "returnItemsToCart", "", "body", "LW10/c;", "trackingData", "Lru/ozon/app/android/account/orders/cancel/data/CancelOrderResponse;", "cancelOrder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/account/orders/cancel/data/FetchCancelPostingsAction;", "fetchCancelPostings", "(Ljava/lang/String;Ljava/util/Map;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/account/orders/cancel/data/AcceptPointsResponse;", "declineCancelPostings", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelOrderRepositoryImpl implements CancelOrderRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final JsonParser jsonDeserializer;

    public CancelOrderRepositoryImpl(@NotNull ActionV2Repository actionV2Repository, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.actionV2Repository = actionV2Repository;
        this.jsonDeserializer = jsonDeserializer;
    }

    private final Throwable transform(Throwable th2) {
        M errorBody;
        if (!(th2 instanceof HttpException)) {
            return th2;
        }
        b e11 = D.e(ActionV2Response.class, CsmaErrorBody.class);
        JsonParser jsonParser = this.jsonDeserializer;
        Response<?> response = ((HttpException) th2).response();
        String string = (response == null || (errorBody = response.errorBody()) == null) ? null : errorBody.string();
        Intrinsics.f(string);
        CsmaErrorBody csmaErrorBody = (CsmaErrorBody) ((ActionV2Response) jsonParser.fromJson(string, e11)).getData();
        return new CancelOrderError(csmaErrorBody != null ? csmaErrorBody.getError() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0088, B:16:0x0093, B:17:0x009a), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object cancelOrder(@NotNull String str, @NotNull String str2, String str3, Boolean bool, Map<String, String> map, @NotNull c cVar, @NotNull d<? super CancelOrderResponse> dVar) {
        CancelOrderRepositoryImpl$cancelOrder$1 cancelOrderRepositoryImpl$cancelOrder$1;
        int i11;
        Map<String, String> c11;
        Exception exc;
        CancelOrderRepositoryImpl cancelOrderRepositoryImpl;
        CancelOrderResponse cancelOrderResponse;
        if (dVar instanceof CancelOrderRepositoryImpl$cancelOrder$1) {
            cancelOrderRepositoryImpl$cancelOrder$1 = (CancelOrderRepositoryImpl$cancelOrder$1) dVar;
            int i12 = cancelOrderRepositoryImpl$cancelOrder$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cancelOrderRepositoryImpl$cancelOrder$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cancelOrderRepositoryImpl$cancelOrder$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = cancelOrderRepositoryImpl$cancelOrder$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (map == null) {
                        try {
                            c11 = U.c();
                        } catch (Exception e11) {
                            exc = e11;
                            cancelOrderRepositoryImpl = this;
                            throw cancelOrderRepositoryImpl.transform(exc);
                        }
                    } else {
                        c11 = map;
                    }
                    LinkedHashMap u11 = U.u(c11);
                    u11.put("reasonId", str2);
                    if (str3 != null) {
                    }
                    u11.put("isCheckboxChecked", String.valueOf(bool != null ? bool.booleanValue() : false));
                    ActionV2Request actionV2Request = new ActionV2Request(u11, str, false, 4, null);
                    ActionV2Repository actionV2Repository = this.actionV2Repository;
                    cancelOrderRepositoryImpl$cancelOrder$1.L$0 = this;
                    cancelOrderRepositoryImpl$cancelOrder$1.label = 1;
                    obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, CancelOrderResponse.class, cancelOrderRepositoryImpl$cancelOrder$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cancelOrderRepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cancelOrderRepositoryImpl = (CancelOrderRepositoryImpl) cancelOrderRepositoryImpl$cancelOrder$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        throw cancelOrderRepositoryImpl.transform(exc);
                    }
                }
                cancelOrderResponse = (CancelOrderResponse) ((ActionV2Response) obj).getData();
                if (cancelOrderResponse == null) {
                    return cancelOrderResponse;
                }
                throw new IllegalArgumentException("empty response");
            }
        }
        cancelOrderRepositoryImpl$cancelOrder$1 = new CancelOrderRepositoryImpl$cancelOrder$1(this, dVar);
        Object obj2 = cancelOrderRepositoryImpl$cancelOrder$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = cancelOrderRepositoryImpl$cancelOrder$1.label;
        if (i11 != 0) {
        }
        cancelOrderResponse = (CancelOrderResponse) ((ActionV2Response) obj2).getData();
        if (cancelOrderResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0053, B:14:0x005f, B:16:0x0067, B:19:0x006b, B:20:0x0072), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0053, B:14:0x005f, B:16:0x0067, B:19:0x006b, B:20:0x0072), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0053, B:14:0x005f, B:16:0x0067, B:19:0x006b, B:20:0x0072), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object declineCancelPostings(@NotNull String str, Map<String, String> map, @NotNull c cVar, @NotNull d<? super AcceptPointsResponse> dVar) {
        CancelOrderRepositoryImpl$declineCancelPostings$1 cancelOrderRepositoryImpl$declineCancelPostings$1;
        int i11;
        Exception exc;
        CancelOrderRepositoryImpl cancelOrderRepositoryImpl;
        NotificationDTO notification;
        if (dVar instanceof CancelOrderRepositoryImpl$declineCancelPostings$1) {
            cancelOrderRepositoryImpl$declineCancelPostings$1 = (CancelOrderRepositoryImpl$declineCancelPostings$1) dVar;
            int i12 = cancelOrderRepositoryImpl$declineCancelPostings$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cancelOrderRepositoryImpl$declineCancelPostings$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cancelOrderRepositoryImpl$declineCancelPostings$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = cancelOrderRepositoryImpl$declineCancelPostings$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        ActionV2Repository actionV2Repository = this.actionV2Repository;
                        ActionV2Request actionV2Request = new ActionV2Request(map, str, false, 4, null);
                        cancelOrderRepositoryImpl$declineCancelPostings$1.L$0 = this;
                        cancelOrderRepositoryImpl$declineCancelPostings$1.label = 1;
                        obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, AcceptPointsResponse.class, cancelOrderRepositoryImpl$declineCancelPostings$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Exception e11) {
                        exc = e11;
                        cancelOrderRepositoryImpl = this;
                        throw cancelOrderRepositoryImpl.transform(exc);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cancelOrderRepositoryImpl = (CancelOrderRepositoryImpl) cancelOrderRepositoryImpl$declineCancelPostings$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        throw cancelOrderRepositoryImpl.transform(exc);
                    }
                }
                AcceptPointsResponse acceptPointsResponse = (AcceptPointsResponse) ((ActionV2Response) obj).getData();
                notification = acceptPointsResponse == null ? acceptPointsResponse.getNotification() : null;
                if (notification == null) {
                    return new AcceptPointsResponse(notification);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        cancelOrderRepositoryImpl$declineCancelPostings$1 = new CancelOrderRepositoryImpl$declineCancelPostings$1(this, dVar);
        Object obj2 = cancelOrderRepositoryImpl$declineCancelPostings$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = cancelOrderRepositoryImpl$declineCancelPostings$1.label;
        if (i11 != 0) {
        }
        AcceptPointsResponse acceptPointsResponse2 = (AcceptPointsResponse) ((ActionV2Response) obj2).getData();
        if (acceptPointsResponse2 == null) {
        }
        if (notification == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0053, B:14:0x0060, B:16:0x0068, B:18:0x0070, B:19:0x0074, B:22:0x0078, B:23:0x007f), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0053, B:14:0x0060, B:16:0x0068, B:18:0x0070, B:19:0x0074, B:22:0x0078, B:23:0x007f), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0053, B:14:0x0060, B:16:0x0068, B:18:0x0070, B:19:0x0074, B:22:0x0078, B:23:0x007f), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchCancelPostings(@NotNull String str, Map<String, String> map, @NotNull c cVar, @NotNull d<? super FetchCancelPostingsAction> dVar) {
        CancelOrderRepositoryImpl$fetchCancelPostings$1 cancelOrderRepositoryImpl$fetchCancelPostings$1;
        int i11;
        Exception exc;
        CancelOrderRepositoryImpl cancelOrderRepositoryImpl;
        AtomActionDTO nextAction;
        if (dVar instanceof CancelOrderRepositoryImpl$fetchCancelPostings$1) {
            cancelOrderRepositoryImpl$fetchCancelPostings$1 = (CancelOrderRepositoryImpl$fetchCancelPostings$1) dVar;
            int i12 = cancelOrderRepositoryImpl$fetchCancelPostings$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cancelOrderRepositoryImpl$fetchCancelPostings$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cancelOrderRepositoryImpl$fetchCancelPostings$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = cancelOrderRepositoryImpl$fetchCancelPostings$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        ActionV2Repository actionV2Repository = this.actionV2Repository;
                        ActionV2Request actionV2Request = new ActionV2Request(map, str, false, 4, null);
                        cancelOrderRepositoryImpl$fetchCancelPostings$1.L$0 = this;
                        cancelOrderRepositoryImpl$fetchCancelPostings$1.label = 1;
                        obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, FetchCancelPostingsAction.class, cancelOrderRepositoryImpl$fetchCancelPostings$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Exception e11) {
                        exc = e11;
                        cancelOrderRepositoryImpl = this;
                        throw cancelOrderRepositoryImpl.transform(exc);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cancelOrderRepositoryImpl = (CancelOrderRepositoryImpl) cancelOrderRepositoryImpl$fetchCancelPostings$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        throw cancelOrderRepositoryImpl.transform(exc);
                    }
                }
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                FetchCancelPostingsAction fetchCancelPostingsAction = (FetchCancelPostingsAction) actionV2Response.getData();
                nextAction = fetchCancelPostingsAction == null ? fetchCancelPostingsAction.getNextAction() : null;
                if (nextAction != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                FetchCancelPostingsAction fetchCancelPostingsAction2 = (FetchCancelPostingsAction) actionV2Response.getData();
                return new FetchCancelPostingsAction(nextAction, fetchCancelPostingsAction2 != null ? fetchCancelPostingsAction2.getPopover() : null);
            }
        }
        cancelOrderRepositoryImpl$fetchCancelPostings$1 = new CancelOrderRepositoryImpl$fetchCancelPostings$1(this, dVar);
        Object obj2 = cancelOrderRepositoryImpl$fetchCancelPostings$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = cancelOrderRepositoryImpl$fetchCancelPostings$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        FetchCancelPostingsAction fetchCancelPostingsAction3 = (FetchCancelPostingsAction) actionV2Response2.getData();
        if (fetchCancelPostingsAction3 == null) {
        }
        if (nextAction != null) {
        }
    }
}
