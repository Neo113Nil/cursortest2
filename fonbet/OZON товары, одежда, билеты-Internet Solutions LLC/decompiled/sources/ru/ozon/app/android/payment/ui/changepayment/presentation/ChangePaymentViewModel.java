package ru.ozon.app.android.payment.ui.changepayment.presentation;

import BT.b;
import Bc.e;
import Bc.i;
import Dp.C2877a;
import Lz.d;
import Mc.a;
import W10.c;
import android.content.Context;
import androidx.lifecycle.w0;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.payment.ui.changepayment.data.ChangePaymentApi;
import ru.ozon.app.android.payment.ui.changepayment.data.CsmaErrorBody;
import ru.ozon.app.android.payment.ui.changepayment.presentation.ChangePaymentViewModel;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0015j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u00162\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010$\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00122\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\n\u0010#\u001a\u00060!j\u0002`\"¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010+8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentViewModel;", "Landroidx/lifecycle/w0;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/payment/ui/changepayment/data/ChangePaymentApi;", "changePaymentApi", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "moshi", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "googlePayAvailabilityStorage", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/payment/ui/changepayment/data/ChangePaymentApi;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/account/orders/OrderChangePreferences;Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "", "", "actionParam", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "resolveNativePaymentParams", "(Ljava/util/Map;)Ljava/util/HashMap;", "errorBody", "getErrorMessage", "(Ljava/lang/String;)Ljava/lang/String;", "", "onCleared", "()V", "actionName", "params", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "onButtonClick", "(Ljava/lang/String;Ljava/util/Map;LW10/c;)V", "Lru/ozon/app/android/payment/ui/changepayment/data/ChangePaymentApi;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "clickableAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getClickableAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction;", "singleAction", "getSingleAction", "Lnc/a;", "disposable", "Lnc/a;", "errror", "Ljava/lang/String;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChangePaymentViewModel extends w0 {

    @NotNull
    private final ChangePaymentApi changePaymentApi;

    @NotNull
    private final SingleLiveEvent<Boolean> clickableAction;

    @NotNull
    private final C8486a disposable;

    @NotNull
    private final String errror;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final GooglePayAvailabilityStorage googlePayAvailabilityStorage;

    @NotNull
    private final JsonParser moshi;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    @NotNull
    private final SingleLiveEvent<ChangePaymentMethodAction> singleAction;

    public ChangePaymentViewModel(@NotNull Context context, @NotNull ChangePaymentApi changePaymentApi, @NotNull JsonParser moshi, @NotNull OrderChangePreferences orderChangePreferences, @NotNull GooglePayAvailabilityStorage googlePayAvailabilityStorage, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(changePaymentApi, "changePaymentApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        Intrinsics.checkNotNullParameter(googlePayAvailabilityStorage, "googlePayAvailabilityStorage");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.changePaymentApi = changePaymentApi;
        this.moshi = moshi;
        this.orderChangePreferences = orderChangePreferences;
        this.googlePayAvailabilityStorage = googlePayAvailabilityStorage;
        this.featureChecker = featureChecker;
        this.clickableAction = new SingleLiveEvent<>();
        this.singleAction = new SingleLiveEvent<>();
        this.disposable = new C8486a();
        this.errror = StringProvider.getString(R$string.error_common_message_service_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getErrorMessage(String errorBody) {
        return ((CsmaErrorBody) this.moshi.fromJson(errorBody, CsmaErrorBody.class)).getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onButtonClick$lambda$1(ChangePaymentViewModel changePaymentViewModel) {
        changePaymentViewModel.clickableAction.setValue(Boolean.TRUE);
    }

    private final HashMap<String, Object> resolveNativePaymentParams(Map<String, ? extends Object> actionParam) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.putAll(actionParam);
        hashMap.put("nativePaymentConfigured", String.valueOf(this.googlePayAvailabilityStorage.getIsGooglePayReady()));
        hashMap.put("nativePaymentEnabled", String.valueOf(this.googlePayAvailabilityStorage.getIsGooglePaySupported()));
        return hashMap;
    }

    @NotNull
    public final SingleLiveEvent<Boolean> getClickableAction() {
        return this.clickableAction;
    }

    @NotNull
    public final SingleLiveEvent<ChangePaymentMethodAction> getSingleAction() {
        return this.singleAction;
    }

    public final void onButtonClick(@NotNull String actionName, @NotNull Map<String, ? extends Object> params, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        C8486a c8486a = this.disposable;
        InterfaceC8487b h11 = new e(new i(this.changePaymentApi.callAction(actionName, resolveNativePaymentParams(params)).j(a.b()).g(C8125a.a()), new b(new ChangePaymentViewModel$onButtonClick$1(this), 7)), new InterfaceC9019a() { // from class: iC.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                ChangePaymentViewModel.onButtonClick$lambda$1(ChangePaymentViewModel.this);
            }
        }).h(new d(new ChangePaymentViewModel$onButtonClick$3(this, trackingData), 5), new C2877a(new ChangePaymentViewModel$onButtonClick$4(this), 9));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposable.d();
    }
}
