package ru.ozon.app.android.checkoutcomposer.common.configurator;

import A00.a;
import L00.i;
import QZ.g;
import i10.h;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/configurator/InitCheckoutRequestConfigurator;", "LQZ/g;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoRepository", "Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;", "localGoodsRepo", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "googlePayAvailabilityStorage", "<init>", "(Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;)V", "", "isGooglePaySupported", "()Z", "isGooglePayReady", "Li10/h;", "state", "onInit", "(Li10/h;)Li10/h;", "LA00/a;", "trigger", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "", "initDeepLink", "Ljava/lang/String;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitCheckoutRequestConfigurator implements g {

    @NotNull
    private final ApplicationInfoDataSource applicationInfoRepository;

    @NotNull
    private final GooglePayAvailabilityStorage googlePayAvailabilityStorage;
    private volatile String initDeepLink;

    @NotNull
    private final LocalGoodsForCheckoutRepository localGoodsRepo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/configurator/InitCheckoutRequestConfigurator$Companion;", "", "<init>", "()V", "PARAMS_KEY_DEVICE_ID", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public InitCheckoutRequestConfigurator(@NotNull ApplicationInfoDataSource applicationInfoRepository, @NotNull LocalGoodsForCheckoutRepository localGoodsRepo, @NotNull GooglePayAvailabilityStorage googlePayAvailabilityStorage) {
        Intrinsics.checkNotNullParameter(applicationInfoRepository, "applicationInfoRepository");
        Intrinsics.checkNotNullParameter(localGoodsRepo, "localGoodsRepo");
        Intrinsics.checkNotNullParameter(googlePayAvailabilityStorage, "googlePayAvailabilityStorage");
        this.applicationInfoRepository = applicationInfoRepository;
        this.localGoodsRepo = localGoodsRepo;
        this.googlePayAvailabilityStorage = googlePayAvailabilityStorage;
    }

    private final boolean isGooglePayReady() {
        return this.googlePayAvailabilityStorage.getIsGooglePayReady();
    }

    private final boolean isGooglePaySupported() {
        return this.googlePayAvailabilityStorage.getIsGooglePaySupported();
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar) {
        g.a.a(hVar, gVar, iVar);
        return gVar;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (Intrinsics.d(this.initDeepLink, state.j())) {
            return state;
        }
        this.initDeepLink = null;
        return h.a(state, null, i10.g.POST, null, null, null, 61);
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.initDeepLink = state.j();
        ConcurrentHashMap<String, Object> f7 = state.f();
        f7.put("deviceId", this.applicationInfoRepository.getUniqueApplicationId());
        f7.put("nativePaymentEnabled", Boolean.valueOf(isGooglePaySupported()));
        f7.put("nativePaymentConfigured", Boolean.valueOf(isGooglePayReady()));
        h.a b11 = state.b();
        Map<String, Object> popLocalGoods = this.localGoodsRepo.popLocalGoods();
        if (popLocalGoods != null) {
            b11 = new h.a(popLocalGoods, !popLocalGoods.isEmpty() ? i10.g.POST : i10.g.GET);
        }
        return h.a(state, null, null, null, b11, null, 47);
    }
}
