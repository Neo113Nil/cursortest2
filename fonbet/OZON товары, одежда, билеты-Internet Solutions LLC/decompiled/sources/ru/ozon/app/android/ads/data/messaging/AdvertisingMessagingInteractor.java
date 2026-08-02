package ru.ozon.app.android.ads.data.messaging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.models.AdvertisingClientInfo;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingInteractor;", "", "loadAdvertisingInfo", "Lru/ozon/app/android/ads/data/models/AdvertisingClientInfo;", "getAdvertisingId", "", "getIsLimitAdTrackingEnabled", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdvertisingMessagingInteractor {
    @NotNull
    String getAdvertisingId();

    boolean getIsLimitAdTrackingEnabled();

    @NotNull
    AdvertisingClientInfo loadAdvertisingInfo();
}
