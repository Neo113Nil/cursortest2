package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.data;

import androidx.collection.C5155y;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.CachedWidgetSize;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.WidgetSizeCacheRepository;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.WidgetSizeCacheable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/data/WidgetSizeCacheRepositoryImpl;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheRepository;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheable;", "key", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/CachedWidgetSize;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "cacheWidgetSize", "(Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheable;Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/CachedWidgetSize;)V", "getWidgetSize", "(Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/WidgetSizeCacheable;)Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/domain/CachedWidgetSize;", "Landroidx/collection/y;", "cache", "Landroidx/collection/y;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WidgetSizeCacheRepositoryImpl implements WidgetSizeCacheRepository {

    @NotNull
    private final C5155y<WidgetSizeCacheable, CachedWidgetSize> cache = new C5155y<>(50);

    @Override // ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.WidgetSizeCacheRepository
    public void cacheWidgetSize(@NotNull WidgetSizeCacheable key, @NotNull CachedWidgetSize value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.cache.put(key, value);
    }

    @Override // ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.domain.WidgetSizeCacheRepository
    public CachedWidgetSize getWidgetSize(@NotNull WidgetSizeCacheable key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.cache.get(key);
    }
}
