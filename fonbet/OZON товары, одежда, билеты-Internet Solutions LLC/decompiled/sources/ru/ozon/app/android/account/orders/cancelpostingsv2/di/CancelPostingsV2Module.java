package ru.ozon.app.android.account.orders.cancelpostingsv2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancelpostingsv2.core.CancelPostingsV2Config;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.annotation.CancelPostingsV2AnnotationViewMapper;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingsV2ButtonViewMapper;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewMapper;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.posting.CancelPostingsV2PostingViewMapper;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.selectall.CancelPostingsV2SelectAllViewMapper;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.shipment.CancelPostingsV2ShipmentViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/di/CancelPostingsV2Module;", "", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CancelPostingsV2Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/di/CancelPostingsV2Module$Companion;", "", "<init>", "()V", "provideCancelPostingsV2", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/account/orders/cancelpostingsv2/core/CancelPostingsV2Config;", "annotationViewMapper", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/annotation/CancelPostingsV2AnnotationViewMapper;", "selectAllViewMapper", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/selectall/CancelPostingsV2SelectAllViewMapper;", "shipmentViewMapper", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/shipment/CancelPostingsV2ShipmentViewMapper;", "monopostingViewMapper", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/CancelPostingsV2MonopostingViewMapper;", "postingViewMapper", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/posting/CancelPostingsV2PostingViewMapper;", "buttonViewMapper", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/CancelPostingsV2ButtonViewMapper;", "provideCancelPostingsV2$cs_orders_prodGoogleAllVendorsRelease", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Widget2 provideCancelPostingsV2$cs_orders_prodGoogleAllVendorsRelease(@NotNull CancelPostingsV2Config config, @NotNull CancelPostingsV2AnnotationViewMapper annotationViewMapper, @NotNull CancelPostingsV2SelectAllViewMapper selectAllViewMapper, @NotNull CancelPostingsV2ShipmentViewMapper shipmentViewMapper, @NotNull CancelPostingsV2MonopostingViewMapper monopostingViewMapper, @NotNull CancelPostingsV2PostingViewMapper postingViewMapper, @NotNull CancelPostingsV2ButtonViewMapper buttonViewMapper) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(annotationViewMapper, "annotationViewMapper");
            Intrinsics.checkNotNullParameter(selectAllViewMapper, "selectAllViewMapper");
            Intrinsics.checkNotNullParameter(shipmentViewMapper, "shipmentViewMapper");
            Intrinsics.checkNotNullParameter(monopostingViewMapper, "monopostingViewMapper");
            Intrinsics.checkNotNullParameter(postingViewMapper, "postingViewMapper");
            Intrinsics.checkNotNullParameter(buttonViewMapper, "buttonViewMapper");
            return new Widget2("csma", "cancelPostings", config, new ViewMapper2[]{annotationViewMapper, selectAllViewMapper, shipmentViewMapper, monopostingViewMapper, postingViewMapper, buttonViewMapper});
        }

        private Companion() {
        }
    }
}
