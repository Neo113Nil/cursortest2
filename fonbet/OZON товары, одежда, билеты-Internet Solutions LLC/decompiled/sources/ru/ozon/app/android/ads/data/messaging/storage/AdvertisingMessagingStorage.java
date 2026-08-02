package ru.ozon.app.android.ads.data.messaging.storage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0018\u0010\u000b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ads/data/messaging/storage/AdvertisingMessagingStorage;", "", "advertisingId", "", "getAdvertisingId", "()Ljava/lang/String;", "setAdvertisingId", "(Ljava/lang/String;)V", "isAdvertisingIdExist", "", "()Z", "isLimitAdTrackingEnabled", "setLimitAdTrackingEnabled", "(Z)V", "isLimitAdTrackingEnabledExist", "initWithDefaultValues", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdvertisingMessagingStorage {
    @NotNull
    String getAdvertisingId();

    void initWithDefaultValues();

    boolean isAdvertisingIdExist();

    boolean isLimitAdTrackingEnabled();

    boolean isLimitAdTrackingEnabledExist();

    void setAdvertisingId(@NotNull String str);

    void setLimitAdTrackingEnabled(boolean z11);
}
