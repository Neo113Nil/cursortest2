package com.orkestapay.orkestapay.core.googlepay;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.Q;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AbstractC3416d;
import com.google.android.gms.wallet.C3415c;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI;
import com.orkestapay.orkestapay.client.model.PaymentMethodData;
import com.orkestapay.orkestapay.client.model.PaymentMethodProperties;
import com.orkestapay.orkestapay.client.model.googlepay.GooglePayData;
import com.orkestapay.orkestapay.client.model.googlepay.PaymentMethodGooglePay;
import com.orkestapay.orkestapay.core.googlepay.GooglePayActivity;
import com.orkestapay.orkestapay.core.networking.CoreConfig;
import com.orkestapay.orkestapay.core.networking.Environment;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/orkestapay/orkestapay/core/googlepay/GooglePayClient;", "", "Lcom/orkestapay/orkestapay/core/networking/CoreConfig;", "coreConfig", "<init>", "(Lcom/orkestapay/orkestapay/core/networking/CoreConfig;)V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/wallet/c;", "createPaymentsClient", "(Landroid/content/Context;)Lcom/google/android/gms/wallet/c;", "", "fetchCanUseGooglePay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "possiblyShowGooglePayButton", "isSandbox", "()Z", "Lcom/orkestapay/orkestapay/core/googlepay/GooglePayCallback;", "callback", "googlePaySetup", "(Landroid/content/Context;Lcom/orkestapay/orkestapay/core/googlepay/GooglePayCallback;)V", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayData;", "googlePayData", "Lcom/orkestapay/orkestapay/client/apirequest/OrkestapayAPI;", "orkestapayAPI", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;", "googlePaymentMethodData", "googlePayCheckout", "(Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayData;Lcom/orkestapay/orkestapay/client/apirequest/OrkestapayAPI;Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/orkestapay/orkestapay/core/networking/CoreConfig;", "paymentsClient", "Lcom/google/android/gms/wallet/c;", "Lcom/orkestapay/orkestapay/core/googlepay/GooglePayCallback;", "Landroid/content/Context;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayClient.kt\ncom/orkestapay/orkestapay/core/googlepay/GooglePayClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes3.dex */
public final class GooglePayClient {
    private GooglePayCallback callback;
    private Context context;

    @NotNull
    private final CoreConfig coreConfig;
    private C3415c paymentsClient;

    public GooglePayClient(@NotNull CoreConfig coreConfig) {
        Intrinsics.checkNotNullParameter(coreConfig, "coreConfig");
        this.coreConfig = coreConfig;
    }

    private final C3415c createPaymentsClient(Context context) {
        AbstractC3416d.a a10 = new AbstractC3416d.a.C0493a().b(isSandbox() ? 3 : 1).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        C3415c a11 = AbstractC3416d.a(context, a10);
        Intrinsics.checkNotNullExpressionValue(a11, "getPaymentsClient(...)");
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchCanUseGooglePay(Continuation<? super Boolean> continuation) {
        GooglePayClient$fetchCanUseGooglePay$1 googlePayClient$fetchCanUseGooglePay$1;
        int i10;
        if (continuation instanceof GooglePayClient$fetchCanUseGooglePay$1) {
            googlePayClient$fetchCanUseGooglePay$1 = (GooglePayClient$fetchCanUseGooglePay$1) continuation;
            int i11 = googlePayClient$fetchCanUseGooglePay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                googlePayClient$fetchCanUseGooglePay$1.label = i11 - Integer.MIN_VALUE;
                Object obj = googlePayClient$fetchCanUseGooglePay$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = googlePayClient$fetchCanUseGooglePay$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    IsReadyToPayRequest g10 = IsReadyToPayRequest.g(String.valueOf(GooglePayUtil.INSTANCE.isReadyToPayRequest()));
                    Intrinsics.checkNotNullExpressionValue(g10, "fromJson(...)");
                    C3415c c3415c = this.paymentsClient;
                    if (c3415c == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("paymentsClient");
                        c3415c = null;
                    }
                    Task d10 = c3415c.d(g10);
                    Intrinsics.checkNotNullExpressionValue(d10, "isReadyToPay(...)");
                    googlePayClient$fetchCanUseGooglePay$1.label = 1;
                    obj = Xh.b.a(d10, googlePayClient$fetchCanUseGooglePay$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
                return obj;
            }
        }
        googlePayClient$fetchCanUseGooglePay$1 = new GooglePayClient$fetchCanUseGooglePay$1(this, continuation);
        Object obj2 = googlePayClient$fetchCanUseGooglePay$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = googlePayClient$fetchCanUseGooglePay$1.label;
        if (i10 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return obj2;
    }

    private final boolean isSandbox() {
        return this.coreConfig.getEnvironment() == Environment.SANDBOX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object possiblyShowGooglePayButton(Continuation<? super Unit> continuation) {
        GooglePayClient$possiblyShowGooglePayButton$1 googlePayClient$possiblyShowGooglePayButton$1;
        int i10;
        GooglePayClient googlePayClient;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        GooglePayCallback googlePayCallback;
        String message;
        GooglePayCallback googlePayCallback2;
        if (continuation instanceof GooglePayClient$possiblyShowGooglePayButton$1) {
            googlePayClient$possiblyShowGooglePayButton$1 = (GooglePayClient$possiblyShowGooglePayButton$1) continuation;
            int i11 = googlePayClient$possiblyShowGooglePayButton$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                googlePayClient$possiblyShowGooglePayButton$1.label = i11 - Integer.MIN_VALUE;
                Object obj = googlePayClient$possiblyShowGooglePayButton$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = googlePayClient$possiblyShowGooglePayButton$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        googlePayClient$possiblyShowGooglePayButton$1.L$0 = this;
                        googlePayClient$possiblyShowGooglePayButton$1.label = 1;
                        obj = fetchCanUseGooglePay(googlePayClient$possiblyShowGooglePayButton$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        googlePayClient = this;
                    } catch (Throwable th2) {
                        th = th2;
                        googlePayClient = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        GooglePayCallback googlePayCallback3 = null;
                        if (m150exceptionOrNullimpl != null) {
                        }
                        Boolean boxBoolean = Boxing.boxBoolean(false);
                        if (Result.m153isFailureimpl(m147constructorimpl)) {
                        }
                        boolean booleanValue = ((Boolean) m147constructorimpl).booleanValue();
                        googlePayCallback = googlePayClient.callback;
                        if (googlePayCallback != null) {
                        }
                        googlePayCallback3.onReady(booleanValue);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    googlePayClient = (GooglePayClient) googlePayClient$possiblyShowGooglePayButton$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion22 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        GooglePayCallback googlePayCallback32 = null;
                        if (m150exceptionOrNullimpl != null) {
                        }
                        Boolean boxBoolean2 = Boxing.boxBoolean(false);
                        if (Result.m153isFailureimpl(m147constructorimpl)) {
                        }
                        boolean booleanValue2 = ((Boolean) m147constructorimpl).booleanValue();
                        googlePayCallback = googlePayClient.callback;
                        if (googlePayCallback != null) {
                        }
                        googlePayCallback32.onReady(booleanValue2);
                        return Unit.INSTANCE;
                    }
                }
                m147constructorimpl = Result.m147constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                GooglePayCallback googlePayCallback322 = null;
                if (m150exceptionOrNullimpl != null && (message = m150exceptionOrNullimpl.getMessage()) != null) {
                    googlePayCallback2 = googlePayClient.callback;
                    if (googlePayCallback2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callback");
                        googlePayCallback2 = null;
                    }
                    googlePayCallback2.onError(message);
                }
                Boolean boxBoolean22 = Boxing.boxBoolean(false);
                if (Result.m153isFailureimpl(m147constructorimpl)) {
                    m147constructorimpl = boxBoolean22;
                }
                boolean booleanValue22 = ((Boolean) m147constructorimpl).booleanValue();
                googlePayCallback = googlePayClient.callback;
                if (googlePayCallback != null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                } else {
                    googlePayCallback322 = googlePayCallback;
                }
                googlePayCallback322.onReady(booleanValue22);
                return Unit.INSTANCE;
            }
        }
        googlePayClient$possiblyShowGooglePayButton$1 = new GooglePayClient$possiblyShowGooglePayButton$1(this, continuation);
        Object obj2 = googlePayClient$possiblyShowGooglePayButton$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = googlePayClient$possiblyShowGooglePayButton$1.label;
        if (i10 != 0) {
        }
        m147constructorimpl = Result.m147constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        GooglePayCallback googlePayCallback3222 = null;
        if (m150exceptionOrNullimpl != null) {
            googlePayCallback2 = googlePayClient.callback;
            if (googlePayCallback2 == null) {
            }
            googlePayCallback2.onError(message);
        }
        Boolean boxBoolean222 = Boxing.boxBoolean(false);
        if (Result.m153isFailureimpl(m147constructorimpl)) {
        }
        boolean booleanValue222 = ((Boolean) m147constructorimpl).booleanValue();
        googlePayCallback = googlePayClient.callback;
        if (googlePayCallback != null) {
        }
        googlePayCallback3222.onReady(booleanValue222);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object googlePayCheckout(@NotNull GooglePayData googlePayData, @NotNull final OrkestapayAPI orkestapayAPI, @Nullable PaymentMethodData paymentMethodData, @NotNull Continuation<? super Unit> continuation) {
        PaymentMethodProperties properties;
        PaymentMethodProperties properties2;
        GooglePayCallback googlePayCallback = this.callback;
        if (googlePayCallback == null) {
            return Unit.INSTANCE;
        }
        GooglePayActivity.Companion companion = GooglePayActivity.INSTANCE;
        Context context = null;
        if (googlePayCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            googlePayCallback = null;
        }
        companion.setListeners(googlePayCallback, new GooglePayAuthCallback() { // from class: com.orkestapay.orkestapay.core.googlepay.GooglePayClient$googlePayCheckout$2
            @Override // com.orkestapay.orkestapay.core.googlepay.GooglePayAuthCallback
            public void onSuccess(@NotNull PaymentMethodGooglePay paymentMethod, @NotNull GooglePayActivity activity) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                Intrinsics.checkNotNullParameter(activity, "activity");
                AbstractC1459k.d(Q.a(C1452g0.b()), null, null, new GooglePayClient$googlePayCheckout$2$onSuccess$1(OrkestapayAPI.this, paymentMethod, this, activity, null), 3, null);
            }
        });
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        Intent intent = new Intent(context2, (Class<?>) GooglePayActivity.class);
        intent.putExtra(GooglePayActivity.GOOGLE_PAY_DATA, googlePayData);
        intent.putExtra(GooglePayActivity.IS_SANDBOX, isSandbox());
        intent.putExtra("MERCHANT_ID", this.coreConfig.getMerchantId());
        intent.putExtra(GooglePayActivity.MERCHANT_NAME, (paymentMethodData == null || (properties2 = paymentMethodData.getProperties()) == null) ? null : properties2.getMerchantName());
        intent.putExtra(GooglePayActivity.GATEWAY, (paymentMethodData == null || (properties = paymentMethodData.getProperties()) == null) ? null : properties.getGateway());
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context3;
        }
        context.startActivity(intent);
        return Unit.INSTANCE;
    }

    public final void googlePaySetup(@NotNull Context context, @NotNull GooglePayCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        this.context = context;
        this.paymentsClient = createPaymentsClient(context);
        AbstractC1459k.d(Q.a(C1452g0.b()), null, null, new GooglePayClient$googlePaySetup$1(this, null), 3, null);
    }
}
