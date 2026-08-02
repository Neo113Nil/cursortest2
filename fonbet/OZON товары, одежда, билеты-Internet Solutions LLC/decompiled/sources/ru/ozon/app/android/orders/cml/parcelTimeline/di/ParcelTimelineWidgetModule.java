package ru.ozon.app.android.orders.cml.parcelTimeline.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/di/ParcelTimelineWidgetModule;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgetFactories$orders_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgetFactories", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParcelTimelineWidgetModule {

    @NotNull
    public static final ParcelTimelineWidgetModule INSTANCE = new ParcelTimelineWidgetModule();

    private ParcelTimelineWidgetModule() {
    }

    @NotNull
    public final Set<i> provideWidgetFactories$orders_prodGoogleAllVendorsRelease() {
        return e0.h(ParcelTimelineComposeWidgetCoreKt.parcelTimelineWidgetFactory());
    }
}
