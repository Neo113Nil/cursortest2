package ru.ozon.app.android.ads.data.messaging.storage;

import C.C2702w;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010 \"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 ¨\u0006&"}, d2 = {"Lru/ozon/app/android/ads/data/messaging/storage/AdvertisingMessagingStorageImpl;", "Lru/ozon/app/android/ads/data/messaging/storage/AdvertisingMessagingStorage;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "initWithDefaultValues", "()V", "Landroid/content/SharedPreferences;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "advertisingIdCache$delegate", "LSc/j;", "getAdvertisingIdCache", "()Ljava/util/concurrent/atomic/AtomicReference;", "advertisingIdCache", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLimitAdTrackingEnabledCache$delegate", "isLimitAdTrackingEnabledCache", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isAdvertisingIdExistAtomic", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLimitAdTrackingEnabledExistAtomic", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getAdvertisingId", "()Ljava/lang/String;", "setAdvertisingId", "(Ljava/lang/String;)V", "advertisingId", "", "isAdvertisingIdExist", "()Z", "isLimitAdTrackingEnabled", "setLimitAdTrackingEnabled", "(Z)V", "isLimitAdTrackingEnabledExist", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvertisingMessagingStorageImpl implements AdvertisingMessagingStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: advertisingIdCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j advertisingIdCache;

    @NotNull
    private final AtomicBoolean isAdvertisingIdExistAtomic;

    /* renamed from: isLimitAdTrackingEnabledCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isLimitAdTrackingEnabledCache;

    @NotNull
    private final AtomicBoolean isLimitAdTrackingEnabledExistAtomic;

    @NotNull
    private final SharedPreferences preferences;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/data/messaging/storage/AdvertisingMessagingStorageImpl$Companion;", "", "<init>", "()V", "PREF_ADVERTISING_ID", "", "PREF_IS_LIMIT_AD_TRACKING_ENABLED", "PREF_ADVERTISING_ID_DEFAULT_VALUE", "PREF_IS_LIMIT_AD_TRACKING_ENABLED_DEFAULT_VALUE", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdvertisingMessagingStorageImpl(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this.advertisingIdCache = k.b(new AdvertisingMessagingStorageImpl$advertisingIdCache$2(this));
        this.isLimitAdTrackingEnabledCache = k.b(new AdvertisingMessagingStorageImpl$isLimitAdTrackingEnabledCache$2(this));
        this.isAdvertisingIdExistAtomic = new AtomicBoolean(preferences.contains("ADVERTISING_ID"));
        this.isLimitAdTrackingEnabledExistAtomic = new AtomicBoolean(preferences.contains("IS_LIMIT_AD_TRACKING_ENABLED"));
    }

    private final AtomicReference<String> getAdvertisingIdCache() {
        return (AtomicReference) this.advertisingIdCache.getValue();
    }

    private final AtomicBoolean isLimitAdTrackingEnabledCache() {
        return (AtomicBoolean) this.isLimitAdTrackingEnabledCache.getValue();
    }

    @Override // ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage
    @NotNull
    public String getAdvertisingId() {
        String str = getAdvertisingIdCache().get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    @Override // ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage
    public void initWithDefaultValues() {
        setAdvertisingId("");
        setLimitAdTrackingEnabled(false);
    }

    @Override // ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage
    public boolean isAdvertisingIdExist() {
        return this.isAdvertisingIdExistAtomic.get();
    }

    @Override // ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage
    public boolean isLimitAdTrackingEnabled() {
        return isLimitAdTrackingEnabledCache().get();
    }

    @Override // ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage
    public boolean isLimitAdTrackingEnabledExist() {
        return this.isLimitAdTrackingEnabledExistAtomic.get();
    }

    @Override // ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage
    public void setAdvertisingId(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putString("ADVERTISING_ID", value);
        edit.apply();
        getAdvertisingIdCache().set(value);
        this.isAdvertisingIdExistAtomic.set(true);
    }

    @Override // ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage
    public void setLimitAdTrackingEnabled(boolean z11) {
        C2702w.e(this.preferences, "IS_LIMIT_AD_TRACKING_ENABLED", z11);
        isLimitAdTrackingEnabledCache().set(z11);
        this.isLimitAdTrackingEnabledExistAtomic.set(true);
    }
}
