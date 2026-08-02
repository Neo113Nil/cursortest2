package ru.ozon.app.android.ads.data.messaging;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage;
import ru.ozon.app.android.ads.data.models.AdvertisingClientInfo;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/data/models/AdvertisingClientInfo;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Throwable;)Lru/ozon/app/android/ads/data/models/AdvertisingClientInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvertisingMessagingInteractorImpl$advertisingInfoObservable$2 extends AbstractC7737t implements Function1<Throwable, AdvertisingClientInfo> {
    final /* synthetic */ AdvertisingMessagingInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvertisingMessagingInteractorImpl$advertisingInfoObservable$2(AdvertisingMessagingInteractorImpl advertisingMessagingInteractorImpl) {
        super(1);
        this.this$0 = advertisingMessagingInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdvertisingClientInfo invoke(Throwable it) {
        boolean advertisingInfoCacheMissed;
        AdvertisingClientInfo cachedAdvertisingInfo;
        AdvertisingMessagingStorage advertisingMessagingStorage;
        Intrinsics.checkNotNullParameter(it, "it");
        advertisingInfoCacheMissed = this.this$0.advertisingInfoCacheMissed();
        if (advertisingInfoCacheMissed) {
            advertisingMessagingStorage = this.this$0.storage;
            advertisingMessagingStorage.initWithDefaultValues();
        }
        cachedAdvertisingInfo = this.this$0.getCachedAdvertisingInfo();
        return cachedAdvertisingInfo;
    }
}
