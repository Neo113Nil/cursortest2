package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentConfig;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.annotation.AnnotationOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.PositingOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.provider.StatusProviderOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.status.StatusOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.text.TextOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.title.TitleOrderShipmentViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/dl/OrderShipmentModule;", "", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class OrderShipmentModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/dl/OrderShipmentModule$Companion;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentConfig;", "postingOrderShipmentViewMapper", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/PositingOrderShipmentViewMapper;", "annotationOrderShipmentViewMapper", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/annotation/AnnotationOrderShipmentViewMapper;", "actionOrderShipmentViewMapper", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentViewMapper;", "statusOrderShipmentViewMapper", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/status/StatusOrderShipmentViewMapper;", "textOrderShipmentViewMapper", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/text/TextOrderShipmentViewMapper;", "titleOrderShipmentViewMapper", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/title/TitleOrderShipmentViewMapper;", "statusProviderOrderShipmentViewMapper", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/provider/StatusProviderOrderShipmentViewMapper;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Widget2 provideWidget(@NotNull OrderShipmentConfig config, @NotNull PositingOrderShipmentViewMapper postingOrderShipmentViewMapper, @NotNull AnnotationOrderShipmentViewMapper annotationOrderShipmentViewMapper, @NotNull ActionOrderShipmentViewMapper actionOrderShipmentViewMapper, @NotNull StatusOrderShipmentViewMapper statusOrderShipmentViewMapper, @NotNull TextOrderShipmentViewMapper textOrderShipmentViewMapper, @NotNull TitleOrderShipmentViewMapper titleOrderShipmentViewMapper, @NotNull StatusProviderOrderShipmentViewMapper statusProviderOrderShipmentViewMapper) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(postingOrderShipmentViewMapper, "postingOrderShipmentViewMapper");
            Intrinsics.checkNotNullParameter(annotationOrderShipmentViewMapper, "annotationOrderShipmentViewMapper");
            Intrinsics.checkNotNullParameter(actionOrderShipmentViewMapper, "actionOrderShipmentViewMapper");
            Intrinsics.checkNotNullParameter(statusOrderShipmentViewMapper, "statusOrderShipmentViewMapper");
            Intrinsics.checkNotNullParameter(textOrderShipmentViewMapper, "textOrderShipmentViewMapper");
            Intrinsics.checkNotNullParameter(titleOrderShipmentViewMapper, "titleOrderShipmentViewMapper");
            Intrinsics.checkNotNullParameter(statusProviderOrderShipmentViewMapper, "statusProviderOrderShipmentViewMapper");
            return new Widget2("csma", "shipmentWidget", config, new ViewMapper2[]{postingOrderShipmentViewMapper, actionOrderShipmentViewMapper, annotationOrderShipmentViewMapper, statusOrderShipmentViewMapper, titleOrderShipmentViewMapper, textOrderShipmentViewMapper, statusProviderOrderShipmentViewMapper});
        }

        private Companion() {
        }
    }
}
