package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.android.ozonLogger.core.h;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import sj.d;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.api.SPayStage;
import spay.sdk.api.model.SPaymentRequest;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u00020\u0001:\u0001.B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010 \u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManagerImpl;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "Landroid/content/Context;", "context", "Landroid/app/Application;", "application", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferences;", "sberPayPreferences", "<init>", "(Landroid/content/Context;Landroid/app/Application;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferences;)V", "Lspay/sdk/api/SPayStage;", "getSPayStage", "()Lspay/sdk/api/SPayStage;", "", "checkIsReadyForSPaySdk", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "logException", "(Ljava/lang/Exception;)V", "initialize", "", "isSberPayReady", "()Z", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "payInfo", "Lkotlin/Function0;", "onSuccess", "onFailure", "payWithBankInvoiceId", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "Landroid/app/Application;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferences;", "Lsj/d;", "logger$delegate", "LSc/j;", "getLogger", "()Lsj/d;", "logger", "isReadyForSPaySdk", "Z", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SberPayManagerImpl implements SberPayManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Application application;

    @NotNull
    private final Context context;

    @NotNull
    private final EnvironmentService environmentService;
    private boolean isReadyForSPaySdk;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j logger;

    @NotNull
    private final SberPayPreferences sberPayPreferences;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManagerImpl$Companion;", "", "<init>", "()V", "DEFAULT_IS_READY_FOR_SPAY_SDK", "", "LOG_TEAM", "", "LOG_GROUP", "LOG_RESULT", "LOG_SPAY_INIT_RESULT", "LOG_DEFAULT_EXCEPTION_MESSAGE", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SberPayManagerImpl(@NotNull Context context, @NotNull Application application, @NotNull EnvironmentService environmentService, @NotNull SberPayPreferences sberPayPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(sberPayPreferences, "sberPayPreferences");
        this.context = context;
        this.application = application;
        this.environmentService = environmentService;
        this.sberPayPreferences = sberPayPreferences;
        this.logger = k.b(SberPayManagerImpl$logger$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIsReadyForSPaySdk() {
        SPaySdkApp.INSTANCE.getInstance().isReadyForSPaySdk(this.context, new SberPayManagerImpl$checkIsReadyForSPaySdk$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d getLogger() {
        return (d) this.logger.getValue();
    }

    private final SPayStage getSPayStage() {
        return this.environmentService.isProd() ? SPayStage.Prod : (this.environmentService.isStage() && this.sberPayPreferences.isWithRealBankApp()) ? SPayStage.SandboxRealBankApp : (!this.environmentService.isStage() || this.sberPayPreferences.isWithRealBankApp()) ? SPayStage.SandBoxWithoutBankApp : SPayStage.SandBoxWithoutBankApp;
    }

    private final void logException(Exception exception) {
        d logger = getLogger();
        c cVar = c.ERROR;
        String message = exception.getMessage();
        if (message == null) {
            message = "SPay method call error";
        }
        h.a.d(logger, cVar, message, null, Boolean.FALSE, 4);
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager
    public void initialize() {
        try {
            SPaySdkApp.INSTANCE.getInstance().initialize(this.application, new SPaySdkInitConfig(false, getSPayStage(), null, false, true, false, false, null, new SberPayManagerImpl$initialize$config$1(this), 205, null));
        } catch (Exception e11) {
            logException(e11);
        }
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager
    /* renamed from: isSberPayReady, reason: from getter */
    public boolean getIsReadyForSPaySdk() {
        return this.isReadyForSPaySdk;
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager
    public void payWithBankInvoiceId(@NotNull OrderDO.PayBySberPay.SberPayInfo payInfo, @NotNull Context context, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onFailure) {
        Intrinsics.checkNotNullParameter(payInfo, "payInfo");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        try {
            SPaySdkApp companion = SPaySdkApp.INSTANCE.getInstance();
            SPayMethod.WithBankInvoiceId withBankInvoiceId = SPayMethod.WithBankInvoiceId.INSTANCE;
            String apiKey = payInfo.getApiKey();
            String merchant = payInfo.getMerchant();
            String bankInvoiceId = payInfo.getBankInvoiceId();
            String orderNumber = payInfo.getOrderNumber();
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            companion.pay(withBankInvoiceId, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchant, packageName, null, new SberPayManagerImpl$payWithBankInvoiceId$1(onSuccess, onFailure), 64, null));
        } catch (Exception e11) {
            logException(e11);
            onFailure.invoke();
        }
    }
}
