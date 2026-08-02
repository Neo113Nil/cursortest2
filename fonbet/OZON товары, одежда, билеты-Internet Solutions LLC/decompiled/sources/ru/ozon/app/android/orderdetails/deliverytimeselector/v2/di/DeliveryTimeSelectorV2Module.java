package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.core.DeliveryTimeSelectorV2Config;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.viewMapper.ConfirmDateButtonViewMapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewMapper.DeliveryTimeSelectorV2ViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/di/DeliveryTimeSelectorV2Module;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "deliveryTimeSelectorV2Config", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/core/DeliveryTimeSelectorV2Config;", "deliveryTimeSelectorViewMapper", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewMapper/DeliveryTimeSelectorV2ViewMapper;", "cellListViewMapper", "Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;", "confirmDateButtonViewMapper", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/viewMapper/ConfirmDateButtonViewMapper;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryTimeSelectorV2Module {

    @NotNull
    public static final DeliveryTimeSelectorV2Module INSTANCE = new DeliveryTimeSelectorV2Module();

    private DeliveryTimeSelectorV2Module() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull DeliveryTimeSelectorV2Config deliveryTimeSelectorV2Config, @NotNull DeliveryTimeSelectorV2ViewMapper deliveryTimeSelectorViewMapper, @NotNull CellListV2ViewMapper cellListViewMapper, @NotNull ConfirmDateButtonViewMapper confirmDateButtonViewMapper) {
        Intrinsics.checkNotNullParameter(deliveryTimeSelectorV2Config, "deliveryTimeSelectorV2Config");
        Intrinsics.checkNotNullParameter(deliveryTimeSelectorViewMapper, "deliveryTimeSelectorViewMapper");
        Intrinsics.checkNotNullParameter(cellListViewMapper, "cellListViewMapper");
        Intrinsics.checkNotNullParameter(confirmDateButtonViewMapper, "confirmDateButtonViewMapper");
        return new Widget2("csma", "deliveryTimeSelector", deliveryTimeSelectorV2Config, new ViewMapper2[]{deliveryTimeSelectorViewMapper, cellListViewMapper, confirmDateButtonViewMapper});
    }
}
