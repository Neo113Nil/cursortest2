package ru.ozon.app.android.ordertracking.v4.di;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.ordertracking.v4.OrderTrackingV4ViewMapper;
import ru.ozon.app.android.ordertracking.v4.data.OrderTrackingV4Config;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/di/OrderTrackingV4WidgetModule;", "", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class OrderTrackingV4WidgetModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/di/OrderTrackingV4WidgetModule$Companion;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "orderTrackingV4Config", "Lru/ozon/app/android/ordertracking/v4/data/OrderTrackingV4Config;", "orderTrackingV4ViewMapper", "Lru/ozon/app/android/ordertracking/v4/OrderTrackingV4ViewMapper;", "provideWidget$orderTracking_prodGoogleAllVendorsRelease", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Widget2 provideWidget$orderTracking_prodGoogleAllVendorsRelease(@NotNull OrderTrackingV4Config orderTrackingV4Config, @NotNull OrderTrackingV4ViewMapper orderTrackingV4ViewMapper) {
            Intrinsics.checkNotNullParameter(orderTrackingV4Config, "orderTrackingV4Config");
            Intrinsics.checkNotNullParameter(orderTrackingV4ViewMapper, "orderTrackingV4ViewMapper");
            return new Widget2("csma", "orderTracking", orderTrackingV4Config, new ViewMapper2[]{orderTrackingV4ViewMapper});
        }

        private Companion() {
        }
    }
}
