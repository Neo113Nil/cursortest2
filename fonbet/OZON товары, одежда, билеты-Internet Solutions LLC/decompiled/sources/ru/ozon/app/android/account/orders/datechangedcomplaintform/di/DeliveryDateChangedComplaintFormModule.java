package ru.ozon.app.android.account.orders.datechangedcomplaintform.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.DeliveryDateChangedComplaintFormConfig;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input.DeliveryDateChangedComplaintFormInputViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.reason.DeliveryDateChangedComplaintFormReasonViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.title.DeliveryDateChangedComplaintFormTitleViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/di/DeliveryDateChangedComplaintFormModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/DeliveryDateChangedComplaintFormConfig;", "titleViewMapper", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/title/DeliveryDateChangedComplaintFormTitleViewMapper;", "reasonViewMapper", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/reason/DeliveryDateChangedComplaintFormReasonViewMapper;", "inputViewMapper", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/DeliveryDateChangedComplaintFormInputViewMapper;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryDateChangedComplaintFormModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull DeliveryDateChangedComplaintFormConfig config, @NotNull DeliveryDateChangedComplaintFormTitleViewMapper titleViewMapper, @NotNull DeliveryDateChangedComplaintFormReasonViewMapper reasonViewMapper, @NotNull DeliveryDateChangedComplaintFormInputViewMapper inputViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(titleViewMapper, "titleViewMapper");
        Intrinsics.checkNotNullParameter(reasonViewMapper, "reasonViewMapper");
        Intrinsics.checkNotNullParameter(inputViewMapper, "inputViewMapper");
        return new Widget2("csma", "deliveryDateChangedComplaintForm", config, new ViewMapper2[]{titleViewMapper, reasonViewMapper, inputViewMapper});
    }
}
