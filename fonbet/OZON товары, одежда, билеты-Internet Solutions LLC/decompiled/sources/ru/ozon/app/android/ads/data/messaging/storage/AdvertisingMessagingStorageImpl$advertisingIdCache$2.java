package ru.ozon.app.android.ads.data.messaging.storage;

import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/atomic/AtomicReference;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvertisingMessagingStorageImpl$advertisingIdCache$2 extends AbstractC7737t implements Function0<AtomicReference<String>> {
    final /* synthetic */ AdvertisingMessagingStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvertisingMessagingStorageImpl$advertisingIdCache$2(AdvertisingMessagingStorageImpl advertisingMessagingStorageImpl) {
        super(0);
        this.this$0 = advertisingMessagingStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AtomicReference<String> invoke() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.this$0.preferences;
        return new AtomicReference<>(sharedPreferences.getString("ADVERTISING_ID", ""));
    }
}
