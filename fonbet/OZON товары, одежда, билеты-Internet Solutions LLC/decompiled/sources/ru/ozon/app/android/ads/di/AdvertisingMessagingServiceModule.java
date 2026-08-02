package ru.ozon.app.android.ads.di;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.FirebaseAdvertisingMessagingService;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/ads/di/AdvertisingMessagingServiceModule;", "", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdvertisingMessagingServiceModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/di/AdvertisingMessagingServiceModule$Companion;", "", "<init>", "()V", "provideAdvertisingMessagingService", "Lru/ozon/app/android/ads/FirebaseAdvertisingMessagingService;", "context", "Landroid/content/Context;", "isFirebaseAvailable", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private final boolean isFirebaseAvailable(Context context) {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
        }

        public final FirebaseAdvertisingMessagingService provideAdvertisingMessagingService(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (isFirebaseAvailable(context)) {
                return new FirebaseAdvertisingMessagingService();
            }
            return null;
        }
    }
}
