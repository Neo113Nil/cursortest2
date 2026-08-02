package ru.ozon.app.android.orderdetails.orderTimeline.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderTimeline.data.OrderTimelineConfig;
import ru.ozon.app.android.orderdetails.orderTimeline.presentation.OrderTimelineViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTimeline/di/OrderTimelineV2Module;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/orderdetails/orderTimeline/data/OrderTimelineConfig;", "orderTimelineViewMapper", "Lru/ozon/app/android/orderdetails/orderTimeline/presentation/OrderTimelineViewMapper;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderTimelineV2Module {
    @NotNull
    public final Widget2 provideWidget(@NotNull OrderTimelineConfig config, @NotNull OrderTimelineViewMapper orderTimelineViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(orderTimelineViewMapper, "orderTimelineViewMapper");
        return new Widget2("csma", "orderTimeline", config, new ViewMapper2[]{orderTimelineViewMapper});
    }
}
