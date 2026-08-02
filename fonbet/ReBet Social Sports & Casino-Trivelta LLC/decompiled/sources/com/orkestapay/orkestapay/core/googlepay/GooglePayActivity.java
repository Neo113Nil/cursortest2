package com.orkestapay.orkestapay.core.googlepay;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AbstractC3416d;
import com.google.android.gms.wallet.C3415c;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
import com.orkestapay.orkestapay.client.model.BillingAddress;
import com.orkestapay.orkestapay.client.model.googlepay.GooglePayData;
import com.orkestapay.orkestapay.client.model.googlepay.GooglePayDataResult;
import com.orkestapay.orkestapay.client.model.googlepay.PaymentMethodGooglePay;
import com.orkestapay.orkestapay.client.model.googlepay.PaymentMethodGooglePayDetails;
import com.twilio.voice.EventKeys;
import ei.AbstractC4212b;
import ei.C4214d;
import ei.v;
import ga.C4367a;
import ga.C4369c;
import j.AbstractC5086b;
import j.InterfaceC5085a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u001a\u001a\u00028\u0000\"\n\b\u0000\u0010\u0014*\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010-R>\u00102\u001a,\u0012(\u0012&\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00100\u0010 1*\u0012\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0013\u00107\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010;\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/orkestapay/orkestapay/core/googlepay/GooglePayActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/wallet/c;", "createPaymentsClient", "(Landroid/content/Context;)Lcom/google/android/gms/wallet/c;", "", "requestPayment", "", "amount", AppsFlyerProperties.CURRENCY_CODE, "countryCode", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "getLoadPaymentDataTask", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "Ljava/io/Serializable;", "T", "Landroid/app/Activity;", "activity", "name", "Ljava/lang/Class;", "clazz", "getSerializable", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "paymentsClient", "Lcom/google/android/gms/wallet/c;", "getPaymentsClient", "()Lcom/google/android/gms/wallet/c;", "setPaymentsClient", "(Lcom/google/android/gms/wallet/c;)V", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayData;", "googlePayData", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayData;", "", "isSandbox", "Z", "merchantId", "Ljava/lang/String;", EventKeys.GATEWAY, "merchantName", "Lj/b;", "kotlin.jvm.PlatformType", "paymentDataLauncher", "Lj/b;", "Lcom/orkestapay/orkestapay/core/googlepay/GooglePayCallback;", "getCallback", "()Lcom/orkestapay/orkestapay/core/googlepay/GooglePayCallback;", "callback", "Lcom/orkestapay/orkestapay/core/googlepay/GooglePayAuthCallback;", "getGooglePayAuthCallback", "()Lcom/orkestapay/orkestapay/core/googlepay/GooglePayAuthCallback;", "googlePayAuthCallback", "Companion", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayActivity.kt\ncom/orkestapay/orkestapay/core/googlepay/GooglePayActivity\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,130:1\n96#2:131\n*S KotlinDebug\n*F\n+ 1 GooglePayActivity.kt\ncom/orkestapay/orkestapay/core/googlepay/GooglePayActivity\n*L\n100#1:131\n*E\n"})
/* loaded from: classes3.dex */
public final class GooglePayActivity extends ComponentActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String GATEWAY = "GATEWAY";

    @NotNull
    public static final String GOOGLE_PAY_DATA = "GOOGLE_PAY_DATA";

    @NotNull
    public static final String IS_SANDBOX = "IS_SANDBOX";

    @NotNull
    public static final String MERCHANT_ID = "MERCHANT_ID";

    @NotNull
    public static final String MERCHANT_NAME = "MERCHANT_NAME";

    @Nullable
    private static GooglePayCallback listener;

    @Nullable
    private static GooglePayAuthCallback listenerAuth;
    private String gateway;
    private GooglePayData googlePayData;
    private String merchantId;
    private String merchantName;
    public C3415c paymentsClient;
    private boolean isSandbox = true;

    @NotNull
    private final AbstractC5086b paymentDataLauncher = registerForActivityResult(new C4369c(), new InterfaceC5085a() { // from class: com.orkestapay.orkestapay.core.googlepay.a
        @Override // j.InterfaceC5085a
        public final void a(Object obj) {
            GooglePayActivity.paymentDataLauncher$lambda$0(GooglePayActivity.this, (C4367a) obj);
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/orkestapay/orkestapay/core/googlepay/GooglePayActivity$Companion;", "", "()V", GooglePayActivity.GATEWAY, "", GooglePayActivity.GOOGLE_PAY_DATA, GooglePayActivity.IS_SANDBOX, "MERCHANT_ID", GooglePayActivity.MERCHANT_NAME, "listener", "Lcom/orkestapay/orkestapay/core/googlepay/GooglePayCallback;", "listenerAuth", "Lcom/orkestapay/orkestapay/core/googlepay/GooglePayAuthCallback;", "setListeners", "", "callback", "callbackAuth", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setListeners(@NotNull GooglePayCallback callback, @NotNull GooglePayAuthCallback callbackAuth) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(callbackAuth, "callbackAuth");
            GooglePayActivity.listener = callback;
            GooglePayActivity.listenerAuth = callbackAuth;
        }

        private Companion() {
        }
    }

    private final C3415c createPaymentsClient(Context context) {
        String.valueOf(this.isSandbox);
        AbstractC3416d.a a10 = new AbstractC3416d.a.C0493a().b(this.isSandbox ? 3 : 1).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        C3415c a11 = AbstractC3416d.a(context, a10);
        Intrinsics.checkNotNullExpressionValue(a11, "getPaymentsClient(...)");
        return a11;
    }

    private final Task<PaymentData> getLoadPaymentDataTask(String amount, String currencyCode, String countryCode) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        GooglePayUtil googlePayUtil = GooglePayUtil.INSTANCE;
        String str7 = this.gateway;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventKeys.GATEWAY);
            str = null;
        } else {
            str = str7;
        }
        String str8 = this.merchantId;
        if (str8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantId");
            str2 = null;
        } else {
            str2 = str8;
        }
        String str9 = this.merchantName;
        if (str9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantName");
            str3 = null;
            str6 = amount;
            str5 = countryCode;
            str4 = currencyCode;
        } else {
            str3 = str9;
            str4 = currencyCode;
            str5 = countryCode;
            str6 = amount;
        }
        JSONObject paymentDataRequest = googlePayUtil.getPaymentDataRequest(str6, str4, str5, str, str2, str3);
        paymentDataRequest.toString();
        PaymentDataRequest g10 = PaymentDataRequest.g(paymentDataRequest.toString());
        Intrinsics.checkNotNullExpressionValue(g10, "fromJson(...)");
        Task<PaymentData> e10 = getPaymentsClient().e(g10);
        Intrinsics.checkNotNullExpressionValue(e10, "loadPaymentData(...)");
        return e10;
    }

    private final <T extends Serializable> T getSerializable(Activity activity, String name, Class<T> clazz) {
        Serializable serializableExtra;
        if (Build.VERSION.SDK_INT < 33) {
            return (T) activity.getIntent().getSerializableExtra(name);
        }
        serializableExtra = activity.getIntent().getSerializableExtra(name, clazz);
        T t10 = (T) serializableExtra;
        Intrinsics.checkNotNull(t10);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void paymentDataLauncher$lambda$0(GooglePayActivity this$0, C4367a c4367a) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i10 = c4367a.b().i();
        if (i10 != 0) {
            if (i10 == 16) {
                GooglePayCallback callback = this$0.getCallback();
                if (callback != null) {
                    callback.onCancel();
                }
                this$0.finish();
                return;
            }
            GooglePayCallback callback2 = this$0.getCallback();
            if (callback2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Google Pay failed with error ");
                sb2.append(c4367a.b().i());
                sb2.append(": ");
                String j10 = c4367a.b().j();
                if (j10 == null) {
                    j10 = "";
                }
                sb2.append(j10);
                callback2.onError(sb2.toString());
                return;
            }
            return;
        }
        PaymentData paymentData = (PaymentData) c4367a.a();
        if (paymentData == null) {
            GooglePayCallback callback3 = this$0.getCallback();
            if (callback3 != null) {
                callback3.onError("Google Pay missing result data.");
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject(paymentData.h());
        AbstractC4212b b10 = v.b(null, new Function1<C4214d, Unit>() { // from class: com.orkestapay.orkestapay.core.googlepay.GooglePayActivity$paymentDataLauncher$1$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4214d c4214d) {
                invoke2(c4214d);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C4214d Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e(true);
            }
        }, 1, null);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        b10.a();
        GooglePayDataResult googlePayDataResult = (GooglePayDataResult) b10.d(GooglePayDataResult.INSTANCE.serializer(), jSONObject2);
        PaymentMethodType paymentMethodType = PaymentMethodType.GOOGLE_PAY;
        PaymentMethodGooglePay paymentMethodGooglePay = new PaymentMethodGooglePay(new PaymentMethodGooglePayDetails(paymentMethodType, paymentMethodType, googlePayDataResult.getApiVersionMinor(), googlePayDataResult.getApiVersion(), googlePayDataResult.getPaymentMethodData()), paymentMethodType, (String) null, (String) null, (BillingAddress) null, 28, (DefaultConstructorMarker) null);
        GooglePayAuthCallback googlePayAuthCallback = this$0.getGooglePayAuthCallback();
        if (googlePayAuthCallback != null) {
            googlePayAuthCallback.onSuccess(paymentMethodGooglePay, this$0);
        }
    }

    private final void requestPayment() {
        GooglePayData googlePayData = this.googlePayData;
        GooglePayData googlePayData2 = null;
        if (googlePayData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googlePayData");
            googlePayData = null;
        }
        String amount = googlePayData.getAmount();
        GooglePayData googlePayData3 = this.googlePayData;
        if (googlePayData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googlePayData");
            googlePayData3 = null;
        }
        String currencyCode = googlePayData3.getCurrencyCode();
        GooglePayData googlePayData4 = this.googlePayData;
        if (googlePayData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("googlePayData");
        } else {
            googlePayData2 = googlePayData4;
        }
        Task<PaymentData> loadPaymentDataTask = getLoadPaymentDataTask(amount, currencyCode, googlePayData2.getCountryCode());
        final AbstractC5086b abstractC5086b = this.paymentDataLauncher;
        loadPaymentDataTask.addOnCompleteListener(new OnCompleteListener() { // from class: com.orkestapay.orkestapay.core.googlepay.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractC5086b.this.b(task);
            }
        });
    }

    @Nullable
    public final GooglePayCallback getCallback() {
        return listener;
    }

    @Nullable
    public final GooglePayAuthCallback getGooglePayAuthCallback() {
        return listenerAuth;
    }

    @NotNull
    public final C3415c getPaymentsClient() {
        C3415c c3415c = this.paymentsClient;
        if (c3415c != null) {
            return c3415c;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentsClient");
        return null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setPaymentsClient(createPaymentsClient(this));
        this.googlePayData = (GooglePayData) getSerializable(this, GOOGLE_PAY_DATA, GooglePayData.class);
        this.isSandbox = getIntent().getBooleanExtra(IS_SANDBOX, true);
        String stringExtra = getIntent().getStringExtra("MERCHANT_ID");
        Intrinsics.checkNotNull(stringExtra);
        this.merchantId = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(MERCHANT_NAME);
        Intrinsics.checkNotNull(stringExtra2);
        this.merchantName = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra(GATEWAY);
        Intrinsics.checkNotNull(stringExtra3);
        this.gateway = stringExtra3;
        requestPayment();
    }

    public final void setPaymentsClient(@NotNull C3415c c3415c) {
        Intrinsics.checkNotNullParameter(c3415c, "<set-?>");
        this.paymentsClient = c3415c;
    }
}
