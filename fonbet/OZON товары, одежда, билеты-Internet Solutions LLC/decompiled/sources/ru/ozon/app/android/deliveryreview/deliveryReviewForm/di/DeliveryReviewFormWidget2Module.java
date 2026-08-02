package ru.ozon.app.android.deliveryreview.deliveryReviewForm.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormConfig;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer.DeliveryReviewFormFooterViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header.DeliveryReviewFormHeaderViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/di/DeliveryReviewFormWidget2Module;", "", "<init>", "()V", "provideDeliveryReviewFormWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormConfig;", "headerViewMapper", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderViewMapper;", "itemViewMapper", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemViewMapper;", "footerViewMapper", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/footer/DeliveryReviewFormFooterViewMapper;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryReviewFormWidget2Module {
    @NotNull
    public final Widget2 provideDeliveryReviewFormWidget(@NotNull DeliveryReviewFormConfig config, @NotNull DeliveryReviewFormHeaderViewMapper headerViewMapper, @NotNull DeliveryReviewFormItemViewMapper itemViewMapper, @NotNull DeliveryReviewFormFooterViewMapper footerViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(itemViewMapper, "itemViewMapper");
        Intrinsics.checkNotNullParameter(footerViewMapper, "footerViewMapper");
        return new Widget2("csma", "deliveryReviewForm", config, new ViewMapper2[]{headerViewMapper, itemViewMapper, footerViewMapper});
    }
}
