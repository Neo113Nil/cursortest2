package com.orkestapay.orkestapay.client.apirequest;

import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
import com.orkestapay.orkestapay.client.model.PaymentMethod;
import com.orkestapay.orkestapay.client.model.PaymentMethodData;
import com.orkestapay.orkestapay.client.model.PaymentMethodResponse;
import com.orkestapay.orkestapay.client.model.PromotionsResponse;
import com.orkestapay.orkestapay.client.model.googlepay.PaymentMethodGooglePay;
import com.orkestapay.orkestapay.core.networking.CoreConfig;
import com.orkestapay.orkestapay.core.networking.HttpMethod;
import com.orkestapay.orkestapay.core.networking.HttpResponse;
import com.orkestapay.orkestapay.core.networking.NetworkingClient;
import com.orkestapay.orkestapay.core.networking.OrkestapayError;
import com.orkestapay.orkestapay.core.networking.RestRequest;
import com.orkestapay.orkestapay.core.networking.model.ErrorResponse;
import com.orkestapay.orkestapay.core.networking.model.FieldError;
import di.C4087f;
import ei.AbstractC4212b;
import ei.C4214d;
import ei.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ1\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/orkestapay/orkestapay/client/apirequest/OrkestapayAPI;", "", "coreConfig", "Lcom/orkestapay/orkestapay/core/networking/CoreConfig;", "(Lcom/orkestapay/orkestapay/core/networking/CoreConfig;)V", "networkingClient", "Lcom/orkestapay/orkestapay/core/networking/NetworkingClient;", "createPaymentMethod", "", "body", "", "listener", "Lcom/orkestapay/orkestapay/client/apirequest/PaymentMethodListener;", "(Ljava/lang/String;Lcom/orkestapay/orkestapay/client/apirequest/PaymentMethodListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethodCard", "paymentMethod", "Lcom/orkestapay/orkestapay/client/model/PaymentMethod;", "(Lcom/orkestapay/orkestapay/client/model/PaymentMethod;Lcom/orkestapay/orkestapay/client/apirequest/PaymentMethodListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethodGooglePay", "paymentMethodGooglePay", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;", "(Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;Lcom/orkestapay/orkestapay/client/apirequest/PaymentMethodListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentMethodInfo", "type", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "Lcom/orkestapay/orkestapay/client/apirequest/PaymentMethodDataListener;", "(Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/apirequest/PaymentMethodDataListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPromotions", "binNumber", "currency", "totalAmount", "Lcom/orkestapay/orkestapay/client/apirequest/PromotionsListener;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/apirequest/PromotionsListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrkestapayAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrkestapayAPI.kt\ncom/orkestapay/orkestapay/client/apirequest/OrkestapayAPI\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,100:1\n113#2:101\n113#2:102\n96#3:103\n96#3:104\n96#3:105\n96#3:106\n96#3:107\n96#3:108\n*S KotlinDebug\n*F\n+ 1 OrkestapayAPI.kt\ncom/orkestapay/orkestapay/client/apirequest/OrkestapayAPI\n*L\n23#1:101\n31#1:102\n44#1:103\n47#1:104\n70#1:105\n73#1:106\n88#1:107\n91#1:108\n*E\n"})
/* loaded from: classes3.dex */
public final class OrkestapayAPI {

    @NotNull
    private final CoreConfig coreConfig;

    @NotNull
    private NetworkingClient networkingClient;

    public OrkestapayAPI(@NotNull CoreConfig coreConfig) {
        Intrinsics.checkNotNullParameter(coreConfig, "coreConfig");
        this.coreConfig = coreConfig;
        this.networkingClient = new NetworkingClient(coreConfig);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|(1:(1:9)(2:31|32))(2:33|(1:35))|10|11|12|(1:14)(5:18|(1:20)|21|(1:26)|27)|15|16))|36|6|(0)(0)|10|11|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        r12.onError(new com.orkestapay.orkestapay.core.networking.OrkestapayError(r13.getStatus(), java.lang.String.valueOf(r0.getMessage())));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:12:0x0051, B:14:0x005e, B:18:0x007d, B:20:0x009a, B:21:0x009e, B:23:0x00aa, B:26:0x00b1, B:27:0x00e0), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:12:0x0051, B:14:0x005e, B:18:0x007d, B:20:0x009a, B:21:0x009e, B:23:0x00aa, B:26:0x00b1, B:27:0x00e0), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentMethod(@NotNull String str, @NotNull PaymentMethodListener paymentMethodListener, @NotNull Continuation<? super Unit> continuation) {
        OrkestapayAPI$createPaymentMethod$1 orkestapayAPI$createPaymentMethod$1;
        int i10;
        HttpResponse httpResponse;
        if (continuation instanceof OrkestapayAPI$createPaymentMethod$1) {
            orkestapayAPI$createPaymentMethod$1 = (OrkestapayAPI$createPaymentMethod$1) continuation;
            int i11 = orkestapayAPI$createPaymentMethod$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                orkestapayAPI$createPaymentMethod$1.label = i11 - Integer.MIN_VALUE;
                Object obj = orkestapayAPI$createPaymentMethod$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = orkestapayAPI$createPaymentMethod$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    RestRequest restRequest = new RestRequest("/v1/payment-methods", HttpMethod.POST, str);
                    NetworkingClient networkingClient = this.networkingClient;
                    orkestapayAPI$createPaymentMethod$1.L$0 = paymentMethodListener;
                    orkestapayAPI$createPaymentMethod$1.label = 1;
                    obj = networkingClient.send(restRequest, orkestapayAPI$createPaymentMethod$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paymentMethodListener = (PaymentMethodListener) orkestapayAPI$createPaymentMethod$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                AbstractC4212b b10 = v.b(null, new Function1<C4214d, Unit>() { // from class: com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI$createPaymentMethod$json$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                        invoke2(c4214d);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C4214d Json) {
                        Intrinsics.checkNotNullParameter(Json, "$this$Json");
                        Json.e(true);
                        Json.c(true);
                    }
                }, 1, null);
                if (httpResponse.getIsSuccessful()) {
                    String valueOf = String.valueOf(httpResponse.getBody());
                    b10.a();
                    ErrorResponse errorResponse = (ErrorResponse) b10.d(ErrorResponse.INSTANCE.serializer(), valueOf);
                    String message = errorResponse.getMessage();
                    if (message == null) {
                        message = errorResponse.getError();
                    }
                    String valueOf2 = String.valueOf(message);
                    List<FieldError> validationErrors = errorResponse.getValidationErrors();
                    if (validationErrors != null && !validationErrors.isEmpty()) {
                        valueOf2 = valueOf2 + " [" + CollectionsKt.joinToString$default(errorResponse.getValidationErrors(), ", ", null, null, 0, null, new Function1<FieldError, CharSequence>() { // from class: com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI$createPaymentMethod$errors$1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final CharSequence invoke(@NotNull FieldError it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return it.getMessage();
                            }
                        }, 30, null) + ']';
                    }
                    paymentMethodListener.onError(new OrkestapayError(httpResponse.getStatus(), valueOf2));
                } else {
                    String valueOf3 = String.valueOf(httpResponse.getBody());
                    b10.a();
                    paymentMethodListener.onSuccess((PaymentMethodResponse) b10.d(PaymentMethodResponse.INSTANCE.serializer(), valueOf3));
                }
                return Unit.INSTANCE;
            }
        }
        orkestapayAPI$createPaymentMethod$1 = new OrkestapayAPI$createPaymentMethod$1(this, continuation);
        Object obj2 = orkestapayAPI$createPaymentMethod$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = orkestapayAPI$createPaymentMethod$1.label;
        if (i10 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        AbstractC4212b b102 = v.b(null, new Function1<C4214d, Unit>() { // from class: com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI$createPaymentMethod$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                invoke2(c4214d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C4214d Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e(true);
                Json.c(true);
            }
        }, 1, null);
        if (httpResponse.getIsSuccessful()) {
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object createPaymentMethodCard(@NotNull PaymentMethod paymentMethod, @NotNull PaymentMethodListener paymentMethodListener, @NotNull Continuation<? super Unit> continuation) {
        String deviceSessionId;
        String customerId = paymentMethod.getCustomerId();
        if ((customerId == null || customerId.length() == 0) && ((deviceSessionId = paymentMethod.getDeviceSessionId()) == null || deviceSessionId.length() == 0)) {
            paymentMethodListener.onError(new OrkestapayError(-1, "It is necessary to send customerId or deviceSessionId"));
        }
        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
        aVar.a();
        Object createPaymentMethod = createPaymentMethod(aVar.b(PaymentMethod.INSTANCE.serializer(), paymentMethod), paymentMethodListener, continuation);
        return createPaymentMethod == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? createPaymentMethod : Unit.INSTANCE;
    }

    @Nullable
    public final Object createPaymentMethodGooglePay(@NotNull PaymentMethodGooglePay paymentMethodGooglePay, @NotNull PaymentMethodListener paymentMethodListener, @NotNull Continuation<? super Unit> continuation) {
        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
        aVar.a();
        Object createPaymentMethod = createPaymentMethod(aVar.b(PaymentMethodGooglePay.INSTANCE.serializer(), paymentMethodGooglePay), paymentMethodListener, continuation);
        return createPaymentMethod == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? createPaymentMethod : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|(1:(1:9)(2:27|28))(2:29|(1:31))|10|11|12|(1:14)(3:18|(1:22)|23)|15|16))|32|6|(0)(0)|10|11|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r0.toString();
        r12.onError(new com.orkestapay.orkestapay.core.networking.OrkestapayError(r13.getStatus(), java.lang.String.valueOf(r0.getMessage())));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0063, B:14:0x0070, B:18:0x008e, B:20:0x00b1, B:23:0x00b9), top: B:11:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:12:0x0063, B:14:0x0070, B:18:0x008e, B:20:0x00b1, B:23:0x00b9), top: B:11:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPaymentMethodInfo(@NotNull PaymentMethodType paymentMethodType, @NotNull PaymentMethodDataListener paymentMethodDataListener, @NotNull Continuation<? super Unit> continuation) {
        OrkestapayAPI$getPaymentMethodInfo$1 orkestapayAPI$getPaymentMethodInfo$1;
        int i10;
        HttpResponse httpResponse;
        if (continuation instanceof OrkestapayAPI$getPaymentMethodInfo$1) {
            orkestapayAPI$getPaymentMethodInfo$1 = (OrkestapayAPI$getPaymentMethodInfo$1) continuation;
            int i11 = orkestapayAPI$getPaymentMethodInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                orkestapayAPI$getPaymentMethodInfo$1.label = i11 - Integer.MIN_VALUE;
                Object obj = orkestapayAPI$getPaymentMethodInfo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = orkestapayAPI$getPaymentMethodInfo$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    RestRequest restRequest = new RestRequest("/v1/merchants/payment-methods/" + paymentMethodType, HttpMethod.GET, null, 4, null);
                    NetworkingClient networkingClient = this.networkingClient;
                    orkestapayAPI$getPaymentMethodInfo$1.L$0 = paymentMethodDataListener;
                    orkestapayAPI$getPaymentMethodInfo$1.label = 1;
                    obj = networkingClient.send(restRequest, orkestapayAPI$getPaymentMethodInfo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paymentMethodDataListener = (PaymentMethodDataListener) orkestapayAPI$getPaymentMethodInfo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                AbstractC4212b b10 = v.b(null, new Function1<C4214d, Unit>() { // from class: com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI$getPaymentMethodInfo$json$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                        invoke2(c4214d);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C4214d Json) {
                        Intrinsics.checkNotNullParameter(Json, "$this$Json");
                        Json.e(true);
                        Json.c(true);
                    }
                }, 1, null);
                if (httpResponse.getIsSuccessful()) {
                    String valueOf = String.valueOf(httpResponse.getBody());
                    b10.a();
                    ErrorResponse errorResponse = (ErrorResponse) b10.d(ErrorResponse.INSTANCE.serializer(), valueOf);
                    int status = httpResponse.getStatus();
                    String message = errorResponse.getMessage();
                    if (message == null && (message = errorResponse.getError()) == null) {
                        message = "";
                    }
                    paymentMethodDataListener.onError(new OrkestapayError(status, message));
                } else {
                    String valueOf2 = String.valueOf(httpResponse.getBody());
                    b10.a();
                    paymentMethodDataListener.onSuccess((PaymentMethodData) b10.d(PaymentMethodData.INSTANCE.serializer(), valueOf2));
                }
                return Unit.INSTANCE;
            }
        }
        orkestapayAPI$getPaymentMethodInfo$1 = new OrkestapayAPI$getPaymentMethodInfo$1(this, continuation);
        Object obj2 = orkestapayAPI$getPaymentMethodInfo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = orkestapayAPI$getPaymentMethodInfo$1.label;
        if (i10 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        AbstractC4212b b102 = v.b(null, new Function1<C4214d, Unit>() { // from class: com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI$getPaymentMethodInfo$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                invoke2(c4214d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C4214d Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e(true);
                Json.c(true);
            }
        }, 1, null);
        if (httpResponse.getIsSuccessful()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|(1:(1:9)(2:27|28))(2:29|(1:31))|10|11|12|(1:14)(3:18|(1:22)|23)|15|16))|32|6|(0)(0)|10|11|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
    
        r14.onError(new com.orkestapay.orkestapay.core.networking.OrkestapayError(r15.getStatus(), java.lang.String.valueOf(r0.getMessage())));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:12:0x0081, B:14:0x008e, B:18:0x00b1, B:20:0x00d4, B:23:0x00dc), top: B:11:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:12:0x0081, B:14:0x008e, B:18:0x00b1, B:20:0x00d4, B:23:0x00dc), top: B:11:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPromotions(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PromotionsListener promotionsListener, @NotNull Continuation<? super Unit> continuation) {
        OrkestapayAPI$getPromotions$1 orkestapayAPI$getPromotions$1;
        int i10;
        HttpResponse httpResponse;
        if (continuation instanceof OrkestapayAPI$getPromotions$1) {
            orkestapayAPI$getPromotions$1 = (OrkestapayAPI$getPromotions$1) continuation;
            int i11 = orkestapayAPI$getPromotions$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                orkestapayAPI$getPromotions$1.label = i11 - Integer.MIN_VALUE;
                Object obj = orkestapayAPI$getPromotions$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = orkestapayAPI$getPromotions$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    RestRequest restRequest = new RestRequest("/v1/merchants/" + this.coreConfig.getMerchantId() + "/promotions?binNumber=" + str + "&currency=" + str2 + "&totalAmount=" + str3, HttpMethod.GET, null, 4, null);
                    NetworkingClient networkingClient = this.networkingClient;
                    orkestapayAPI$getPromotions$1.L$0 = promotionsListener;
                    orkestapayAPI$getPromotions$1.label = 1;
                    obj = networkingClient.send(restRequest, orkestapayAPI$getPromotions$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    promotionsListener = (PromotionsListener) orkestapayAPI$getPromotions$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                AbstractC4212b b10 = v.b(null, new Function1<C4214d, Unit>() { // from class: com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI$getPromotions$json$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                        invoke2(c4214d);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull C4214d Json) {
                        Intrinsics.checkNotNullParameter(Json, "$this$Json");
                        Json.e(true);
                        Json.c(true);
                    }
                }, 1, null);
                if (httpResponse.getIsSuccessful()) {
                    String valueOf = String.valueOf(httpResponse.getBody());
                    b10.a();
                    ErrorResponse errorResponse = (ErrorResponse) b10.d(ErrorResponse.INSTANCE.serializer(), valueOf);
                    int status = httpResponse.getStatus();
                    String message = errorResponse.getMessage();
                    if (message == null && (message = errorResponse.getError()) == null) {
                        message = "";
                    }
                    promotionsListener.onError(new OrkestapayError(status, message));
                } else {
                    String valueOf2 = String.valueOf(httpResponse.getBody());
                    b10.a();
                    promotionsListener.onSuccess((List) b10.d(new C4087f(PromotionsResponse.INSTANCE.serializer()), valueOf2));
                }
                return Unit.INSTANCE;
            }
        }
        orkestapayAPI$getPromotions$1 = new OrkestapayAPI$getPromotions$1(this, continuation);
        Object obj2 = orkestapayAPI$getPromotions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = orkestapayAPI$getPromotions$1.label;
        if (i10 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        AbstractC4212b b102 = v.b(null, new Function1<C4214d, Unit>() { // from class: com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI$getPromotions$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                invoke2(c4214d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C4214d Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e(true);
                Json.c(true);
            }
        }, 1, null);
        if (httpResponse.getIsSuccessful()) {
        }
        return Unit.INSTANCE;
    }
}
