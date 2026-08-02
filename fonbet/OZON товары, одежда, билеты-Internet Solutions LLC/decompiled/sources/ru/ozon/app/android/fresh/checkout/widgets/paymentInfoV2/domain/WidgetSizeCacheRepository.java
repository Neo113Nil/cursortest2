package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheRepository;", "", "cacheWidgetSize", "", "key", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/CachedWidgetSize;", "getWidgetSize", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface WidgetSizeCacheRepository {
    void cacheWidgetSize(@NotNull WidgetSizeCacheable key, @NotNull CachedWidgetSize value);

    CachedWidgetSize getWidgetSize(@NotNull WidgetSizeCacheable key);
}
