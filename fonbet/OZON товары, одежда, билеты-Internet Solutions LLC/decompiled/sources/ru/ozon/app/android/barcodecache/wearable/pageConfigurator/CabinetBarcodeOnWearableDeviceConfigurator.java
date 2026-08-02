package ru.ozon.app.android.barcodecache.wearable.pageConfigurator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcodecache.wearable.WearableBarcodeSyncer;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/barcodecache/wearable/pageConfigurator/CabinetBarcodeOnWearableDeviceConfigurator;", "Lru/ozon/app/android/barcodecache/wearable/pageConfigurator/BaseUpdateBarcodeOnWearableDeviceConfigurator;", "wearableBarcodeSyncer", "Lru/ozon/app/android/barcodecache/wearable/WearableBarcodeSyncer;", "authManager", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "appType", "Lru/ozon/app/android/utils/AppType;", "<init>", "(Lru/ozon/app/android/barcodecache/wearable/WearableBarcodeSyncer;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/utils/AppType;)V", "allowEmptyBarcodeNotification", "", "getAllowEmptyBarcodeNotification", "()Z", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CabinetBarcodeOnWearableDeviceConfigurator extends BaseUpdateBarcodeOnWearableDeviceConfigurator {
    private final boolean allowEmptyBarcodeNotification;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CabinetBarcodeOnWearableDeviceConfigurator(@NotNull WearableBarcodeSyncer wearableBarcodeSyncer, @NotNull AuthStateStorage authManager, @NotNull AppType appType) {
        super(wearableBarcodeSyncer, authManager, appType);
        Intrinsics.checkNotNullParameter(wearableBarcodeSyncer, "wearableBarcodeSyncer");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
    }

    @Override // ru.ozon.app.android.barcodecache.wearable.pageConfigurator.BaseUpdateBarcodeOnWearableDeviceConfigurator
    protected boolean getAllowEmptyBarcodeNotification() {
        return this.allowEmptyBarcodeNotification;
    }
}
