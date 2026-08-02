package ru.ozon.app.android.checkoutgeo.di.payload;

import YZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutgeo/di/payload/CheckoutGeoAnalyticsPayloadTypesModule;", "", "<init>", "()V", "", "LYZ/a;", "provideSupportedPayloadTypes$checkout_geo_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideSupportedPayloadTypes", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutGeoAnalyticsPayloadTypesModule {
    @NotNull
    public final Set<a> provideSupportedPayloadTypes$checkout_geo_prodGoogleAllVendorsRelease() {
        String type = ActionType.INSTANCE.getByName("system_back").getType();
        Intrinsics.checkNotNullParameter(type, "type");
        return e0.a(a.a(type));
    }
}
