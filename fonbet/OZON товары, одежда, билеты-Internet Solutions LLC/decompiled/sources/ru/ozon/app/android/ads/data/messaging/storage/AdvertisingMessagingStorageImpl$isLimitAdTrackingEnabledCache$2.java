package ru.ozon.app.android.ads.data.messaging.storage;

import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvertisingMessagingStorageImpl$isLimitAdTrackingEnabledCache$2 extends AbstractC7737t implements Function0<AtomicBoolean> {
    final /* synthetic */ AdvertisingMessagingStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvertisingMessagingStorageImpl$isLimitAdTrackingEnabledCache$2(AdvertisingMessagingStorageImpl advertisingMessagingStorageImpl) {
        super(0);
        this.this$0 = advertisingMessagingStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AtomicBoolean invoke() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.this$0.preferences;
        return new AtomicBoolean(sharedPreferences.getBoolean("IS_LIMIT_AD_TRACKING_ENABLED", false));
    }
}
