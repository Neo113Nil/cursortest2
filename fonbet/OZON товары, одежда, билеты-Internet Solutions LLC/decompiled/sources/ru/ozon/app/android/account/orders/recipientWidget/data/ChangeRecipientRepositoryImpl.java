package ru.ozon.app.android.account.orders.recipientWidget.data;

import Sc.r;
import Sc.s;
import Wc.a;
import We.M;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.net.ConnectException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientException;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.ChangeRecipientModel;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel;
import ru.ozon.app.android.network.error.OzonError;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientRepositoryImpl;", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientRepository;", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientApi;", "changeRecipientApi", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientApi;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/ChangeRecipientModel;", "changeRecipientModel", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult$Success;", "changeRecipientForOrder", "(Lru/ozon/app/android/account/orders/recipientWidget/presentation/ChangeRecipientModel;Lkotlin/coroutines/d;)Ljava/lang/Object;", "changeRecipientForRegularDelivery", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientException;", "createServerError", "()Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientException;", "", "errorBody", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientErrorResponse;", "getErrorData", "(Ljava/lang/String;)Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientErrorResponse;", "", "e", "getChangeRecipientException", "(Ljava/lang/Throwable;)Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientException;", "changeRecipient", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientApi;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeRecipientRepositoryImpl implements ChangeRecipientRepository {

    @NotNull
    private final ChangeRecipientApi changeRecipientApi;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ChangeRecipientRepositoryImpl(@NotNull ChangeRecipientApi changeRecipientApi, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(changeRecipientApi, "changeRecipientApi");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.changeRecipientApi = changeRecipientApi;
        this.jsonDeserializer = jsonDeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object changeRecipientForOrder(ChangeRecipientModel changeRecipientModel, d<? super RecipientViewModel.ChangeRecipientResult.Success> dVar) {
        ChangeRecipientRepositoryImpl$changeRecipientForOrder$1 changeRecipientRepositoryImpl$changeRecipientForOrder$1;
        int i11;
        ChangeRecipientRepositoryImpl changeRecipientRepositoryImpl;
        ChangeOrderRecipientRequest orderRequest;
        Object obj;
        Throwable b11;
        if (dVar instanceof ChangeRecipientRepositoryImpl$changeRecipientForOrder$1) {
            changeRecipientRepositoryImpl$changeRecipientForOrder$1 = (ChangeRecipientRepositoryImpl$changeRecipientForOrder$1) dVar;
            int i12 = changeRecipientRepositoryImpl$changeRecipientForOrder$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                changeRecipientRepositoryImpl$changeRecipientForOrder$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = changeRecipientRepositoryImpl$changeRecipientForOrder$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = changeRecipientRepositoryImpl$changeRecipientForOrder$1.label;
                if (i11 != 0) {
                    s.b(obj2);
                    try {
                        r.Companion companion = r.INSTANCE;
                        orderRequest = ChangeRecipientRepositoryKt.toOrderRequest(changeRecipientModel);
                    } catch (Throwable th2) {
                        th = th2;
                        changeRecipientRepositoryImpl = this;
                        r.Companion companion2 = r.INSTANCE;
                        obj = s.a(th);
                        b11 = r.b(obj);
                        if (b11 != null) {
                        }
                    }
                    if (orderRequest == null) {
                        changeRecipientRepositoryImpl = this;
                        obj = null;
                        r.Companion companion3 = r.INSTANCE;
                        b11 = r.b(obj);
                        if (b11 != null) {
                            throw changeRecipientRepositoryImpl.getChangeRecipientException(b11);
                        }
                        ChangeRecipientResponse changeRecipientResponse = (ChangeRecipientResponse) (obj instanceof r.b ? null : obj);
                        if (changeRecipientResponse != null) {
                            return new RecipientViewModel.ChangeRecipientResult.Success(changeRecipientResponse.getMessage());
                        }
                        throw changeRecipientRepositoryImpl.createServerError();
                    }
                    ChangeRecipientApi changeRecipientApi = this.changeRecipientApi;
                    changeRecipientRepositoryImpl$changeRecipientForOrder$1.L$0 = this;
                    changeRecipientRepositoryImpl$changeRecipientForOrder$1.label = 1;
                    obj2 = changeRecipientApi.changeRecipientForOrder(orderRequest, changeRecipientRepositoryImpl$changeRecipientForOrder$1);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    changeRecipientRepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    changeRecipientRepositoryImpl = (ChangeRecipientRepositoryImpl) changeRecipientRepositoryImpl$changeRecipientForOrder$1.L$0;
                    try {
                        s.b(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        r.Companion companion22 = r.INSTANCE;
                        obj = s.a(th);
                        b11 = r.b(obj);
                        if (b11 != null) {
                        }
                    }
                }
                obj = (ChangeRecipientResponse) obj2;
                r.Companion companion32 = r.INSTANCE;
                b11 = r.b(obj);
                if (b11 != null) {
                }
            }
        }
        changeRecipientRepositoryImpl$changeRecipientForOrder$1 = new ChangeRecipientRepositoryImpl$changeRecipientForOrder$1(this, dVar);
        Object obj22 = changeRecipientRepositoryImpl$changeRecipientForOrder$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = changeRecipientRepositoryImpl$changeRecipientForOrder$1.label;
        if (i11 != 0) {
        }
        obj = (ChangeRecipientResponse) obj22;
        r.Companion companion322 = r.INSTANCE;
        b11 = r.b(obj);
        if (b11 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object changeRecipientForRegularDelivery(ChangeRecipientModel changeRecipientModel, d<? super RecipientViewModel.ChangeRecipientResult.Success> dVar) {
        ChangeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1 changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1;
        int i11;
        ChangeRecipientRepositoryImpl changeRecipientRepositoryImpl;
        ChangeRegularRecipientRequest regularRequest;
        Object obj;
        Throwable b11;
        if (dVar instanceof ChangeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1) {
            changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1 = (ChangeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1) dVar;
            int i12 = changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.label;
                if (i11 != 0) {
                    s.b(obj2);
                    try {
                        r.Companion companion = r.INSTANCE;
                        regularRequest = ChangeRecipientRepositoryKt.toRegularRequest(changeRecipientModel);
                    } catch (Throwable th2) {
                        th = th2;
                        changeRecipientRepositoryImpl = this;
                        r.Companion companion2 = r.INSTANCE;
                        obj = s.a(th);
                        b11 = r.b(obj);
                        if (b11 != null) {
                        }
                    }
                    if (regularRequest == null) {
                        changeRecipientRepositoryImpl = this;
                        obj = null;
                        r.Companion companion3 = r.INSTANCE;
                        b11 = r.b(obj);
                        if (b11 != null) {
                            throw changeRecipientRepositoryImpl.getChangeRecipientException(b11);
                        }
                        ChangeRecipientResponse changeRecipientResponse = (ChangeRecipientResponse) (obj instanceof r.b ? null : obj);
                        if (changeRecipientResponse != null) {
                            return new RecipientViewModel.ChangeRecipientResult.Success(changeRecipientResponse.getMessage());
                        }
                        throw changeRecipientRepositoryImpl.createServerError();
                    }
                    ChangeRecipientApi changeRecipientApi = this.changeRecipientApi;
                    changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.L$0 = this;
                    changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.label = 1;
                    obj2 = changeRecipientApi.changeRecipientForRegularDelivery(regularRequest, changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    changeRecipientRepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    changeRecipientRepositoryImpl = (ChangeRecipientRepositoryImpl) changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.L$0;
                    try {
                        s.b(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        r.Companion companion22 = r.INSTANCE;
                        obj = s.a(th);
                        b11 = r.b(obj);
                        if (b11 != null) {
                        }
                    }
                }
                obj = (ChangeRecipientResponse) obj2;
                r.Companion companion32 = r.INSTANCE;
                b11 = r.b(obj);
                if (b11 != null) {
                }
            }
        }
        changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1 = new ChangeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1(this, dVar);
        Object obj22 = changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = changeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1.label;
        if (i11 != 0) {
        }
        obj = (ChangeRecipientResponse) obj22;
        r.Companion companion322 = r.INSTANCE;
        b11 = r.b(obj);
        if (b11 != null) {
        }
    }

    private final ChangeRecipientException createServerError() {
        ChangeRecipientException changeRecipientException;
        changeRecipientException = ChangeRecipientRepositoryKt.toChangeRecipientException(StringProvider.getString(R$string.error_common_message_service_error));
        return changeRecipientException;
    }

    private final ChangeRecipientException getChangeRecipientException(Throwable e11) {
        ChangeRecipientException changeRecipientException;
        ChangeRecipientException changeRecipientException2;
        M errorBody;
        ChangeRecipientException changeRecipientException3;
        ChangeRecipientException changeRecipientException4;
        ChangeRecipientException changeRecipientException5;
        if (e11 instanceof UnknownHostException) {
            changeRecipientException5 = ChangeRecipientRepositoryKt.toChangeRecipientException(StringProvider.getString(ru.ozon.app.android.account.R$string.common_message_not_internet));
            return changeRecipientException5;
        }
        if (e11 instanceof ConnectException) {
            changeRecipientException4 = ChangeRecipientRepositoryKt.toChangeRecipientException(StringProvider.getString(ru.ozon.app.android.account.R$string.common_message_no_connection));
            return changeRecipientException4;
        }
        if (e11 instanceof OzonError.NetworkError.ServerError) {
            String message = ((OzonError.NetworkError.ServerError) e11).getMessage();
            if (message == null) {
                message = StringProvider.getString(R$string.error_common_message_service_error);
            }
            changeRecipientException3 = ChangeRecipientRepositoryKt.toChangeRecipientException(message);
            return changeRecipientException3;
        }
        if (!(e11 instanceof HttpException)) {
            changeRecipientException = ChangeRecipientRepositoryKt.toChangeRecipientException(StringProvider.getString(R$string.error_common_message_service_error));
            return changeRecipientException;
        }
        Response<?> response = ((HttpException) e11).response();
        if (response == null || (errorBody = response.errorBody()) == null) {
            changeRecipientException2 = ChangeRecipientRepositoryKt.toChangeRecipientException(StringProvider.getString(R$string.error_common_message_service_error));
            return changeRecipientException2;
        }
        ChangeRecipientErrorResponse errorData = getErrorData(errorBody.string());
        String toastMessage = errorData.getToastMessage();
        if (toastMessage == null && (toastMessage = errorData.getError()) == null) {
            toastMessage = StringProvider.getString(R$string.error_common_message_service_error);
        }
        String toastMessage2 = errorData.getToastMessage();
        if (toastMessage2 == null && (toastMessage2 = errorData.getError()) == null) {
            toastMessage2 = StringProvider.getString(R$string.error_common_message_service_error);
        }
        return new ChangeRecipientException(toastMessage, new ChangeRecipientException.ErrorData(toastMessage2, errorData.getNameMessage(), errorData.getPhoneMessage()));
    }

    private final ChangeRecipientErrorResponse getErrorData(String errorBody) {
        return (ChangeRecipientErrorResponse) this.jsonDeserializer.fromJson(errorBody, ChangeRecipientErrorResponse.class);
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientRepository
    public Object changeRecipient(@NotNull ChangeRecipientModel changeRecipientModel, @NotNull d<? super RecipientViewModel.ChangeRecipientResult.Success> dVar) {
        String orderNumber = changeRecipientModel.getOrderNumber();
        if (orderNumber != null && orderNumber.length() != 0) {
            return changeRecipientForOrder(changeRecipientModel, dVar);
        }
        String regularId = changeRecipientModel.getRegularId();
        if (regularId == null || regularId.length() == 0) {
            throw createServerError();
        }
        return changeRecipientForRegularDelivery(changeRecipientModel, dVar);
    }
}
