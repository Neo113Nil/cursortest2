package ru.ozon.app.android.ads.data.messaging;

import Hl.C3165a;
import Mc.a;
import io.reactivex.p;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractorImpl;
import ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage;
import ru.ozon.app.android.ads.data.models.AdvertisingClientInfo;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R8\u0010\u0017\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\b0\b \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\b0\b\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingInteractorImpl;", "Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingInteractor;", "Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingService;", "service", "Lru/ozon/app/android/ads/data/messaging/storage/AdvertisingMessagingStorage;", "storage", "<init>", "(Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingService;Lru/ozon/app/android/ads/data/messaging/storage/AdvertisingMessagingStorage;)V", "Lru/ozon/app/android/ads/data/models/AdvertisingClientInfo;", "getCachedAdvertisingInfo", "()Lru/ozon/app/android/ads/data/models/AdvertisingClientInfo;", "", "advertisingInfoCacheMissed", "()Z", "loadAdvertisingInfo", "", "getAdvertisingId", "()Ljava/lang/String;", "getIsLimitAdTrackingEnabled", "Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingService;", "Lru/ozon/app/android/ads/data/messaging/storage/AdvertisingMessagingStorage;", "Lio/reactivex/p;", "kotlin.jvm.PlatformType", "advertisingInfoObservable", "Lio/reactivex/p;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvertisingMessagingInteractorImpl implements AdvertisingMessagingInteractor {
    private final p<AdvertisingClientInfo> advertisingInfoObservable;
    private final AdvertisingMessagingService service;

    @NotNull
    private final AdvertisingMessagingStorage storage;

    public AdvertisingMessagingInteractorImpl(AdvertisingMessagingService advertisingMessagingService, @NotNull AdvertisingMessagingStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.service = advertisingMessagingService;
        this.storage = storage;
        this.advertisingInfoObservable = p.fromCallable(new Callable() { // from class: wl.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AdvertisingClientInfo advertisingInfoObservable$lambda$0;
                advertisingInfoObservable$lambda$0 = AdvertisingMessagingInteractorImpl.advertisingInfoObservable$lambda$0(AdvertisingMessagingInteractorImpl.this);
                return advertisingInfoObservable$lambda$0;
            }
        }).subscribeOn(a.b()).timeout(2000L, TimeUnit.MILLISECONDS).onErrorReturn(new C3165a(new AdvertisingMessagingInteractorImpl$advertisingInfoObservable$2(this))).share();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean advertisingInfoCacheMissed() {
        return (this.storage.isAdvertisingIdExist() || this.storage.isLimitAdTrackingEnabledExist()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvertisingClientInfo advertisingInfoObservable$lambda$0(AdvertisingMessagingInteractorImpl advertisingMessagingInteractorImpl) {
        if (!advertisingMessagingInteractorImpl.advertisingInfoCacheMissed()) {
            return advertisingMessagingInteractorImpl.getCachedAdvertisingInfo();
        }
        try {
            return advertisingMessagingInteractorImpl.loadAdvertisingInfo();
        } catch (Throwable unused) {
            if (advertisingMessagingInteractorImpl.advertisingInfoCacheMissed()) {
                advertisingMessagingInteractorImpl.storage.initWithDefaultValues();
            }
            return advertisingMessagingInteractorImpl.getCachedAdvertisingInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvertisingClientInfo advertisingInfoObservable$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AdvertisingClientInfo) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvertisingClientInfo getCachedAdvertisingInfo() {
        return new AdvertisingClientInfo(this.storage.getAdvertisingId(), this.storage.isLimitAdTrackingEnabled());
    }

    @Override // ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor
    @NotNull
    public String getAdvertisingId() {
        if (this.storage.isAdvertisingIdExist()) {
            return this.storage.getAdvertisingId();
        }
        try {
            return this.advertisingInfoObservable.blockingFirst().getId();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor
    public boolean getIsLimitAdTrackingEnabled() {
        if (this.storage.isLimitAdTrackingEnabledExist()) {
            return this.storage.isLimitAdTrackingEnabled();
        }
        try {
            return this.advertisingInfoObservable.blockingFirst().getIsLimitAdTrackingEnabled();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor
    @NotNull
    public AdvertisingClientInfo loadAdvertisingInfo() {
        AdvertisingClientInfo loadAdvertisingInfo;
        AdvertisingMessagingService advertisingMessagingService = this.service;
        if (advertisingMessagingService == null || (loadAdvertisingInfo = advertisingMessagingService.loadAdvertisingInfo()) == null) {
            return getCachedAdvertisingInfo();
        }
        this.storage.setAdvertisingId(loadAdvertisingInfo.getId());
        this.storage.setLimitAdTrackingEnabled(loadAdvertisingInfo.getIsLimitAdTrackingEnabled());
        return loadAdvertisingInfo;
    }
}
