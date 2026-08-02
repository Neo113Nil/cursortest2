package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.common;

import A00.a;
import A00.a.J.InterfaceC0007a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewComponentValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.DeliveryReviewGroupValidator;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/common/ComponentUpdateDelegate;", "LA00/a$J$a;", "T", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;", "componentsValidator", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;", "groupValidator", "<init>", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;)V", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewComponentValidator;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/DeliveryReviewGroupValidator;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ComponentUpdateDelegate<T extends a.J.InterfaceC0007a> {

    @NotNull
    private final DeliveryReviewComponentValidator componentsValidator;

    @NotNull
    private final DeliveryReviewGroupValidator groupValidator;

    public ComponentUpdateDelegate(@NotNull DeliveryReviewComponentValidator componentsValidator, @NotNull DeliveryReviewGroupValidator groupValidator) {
        Intrinsics.checkNotNullParameter(componentsValidator, "componentsValidator");
        Intrinsics.checkNotNullParameter(groupValidator, "groupValidator");
        this.componentsValidator = componentsValidator;
        this.groupValidator = groupValidator;
    }
}
