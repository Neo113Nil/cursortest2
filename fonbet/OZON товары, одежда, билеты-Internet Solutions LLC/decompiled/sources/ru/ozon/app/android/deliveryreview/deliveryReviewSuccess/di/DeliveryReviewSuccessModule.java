package ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.data.DeliveryReviewSuccessConfig;
import ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.presentation.DeliveryReviewSuccessViewMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewSuccess/di/DeliveryReviewSuccessModule;", "", "<init>", "()V", "provideDeliveryReviewSuccessWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/deliveryreview/deliveryReviewSuccess/data/DeliveryReviewSuccessConfig;", "viewMapper", "Lru/ozon/app/android/deliveryreview/deliveryReviewSuccess/presentation/DeliveryReviewSuccessViewMapper;", "provideDeliveryReviewSuccessWidget$deliveryreview_prodGoogleAllVendorsRelease", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryReviewSuccessModule {
    @NotNull
    public final Widget2 provideDeliveryReviewSuccessWidget$deliveryreview_prodGoogleAllVendorsRelease(@NotNull DeliveryReviewSuccessConfig config, @NotNull DeliveryReviewSuccessViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget2("csma", "deliveryReviewSuccess", config, new ViewMapper2[]{viewMapper});
    }
}
