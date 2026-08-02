package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.CarouselUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.CheckboxUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.GroupCollapseUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.RadioUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.TextAreaUpdateDelegate;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate.ToggleUpdateDelegate;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemUpdateConsumer;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "T", "Lkotlin/Function2;", "LA00/a$J$a;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/GroupCollapseUpdateDelegate;", "groupCollapseUpdateDelegate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/CheckboxUpdateDelegate;", "checkboxUpdateDelegate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/RadioUpdateDelegate;", "radioUpdateDelegate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/CarouselUpdateDelegate;", "carouselUpdateDelegate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/TextAreaUpdateDelegate;", "textAreaUpdateDelegate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/ToggleUpdateDelegate;", "toggleUpdateDelegate", "<init>", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/GroupCollapseUpdateDelegate;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/CheckboxUpdateDelegate;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/RadioUpdateDelegate;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/CarouselUpdateDelegate;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/TextAreaUpdateDelegate;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/ToggleUpdateDelegate;)V", "update", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/GroupCollapseUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/CheckboxUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/RadioUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/CarouselUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/TextAreaUpdateDelegate;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/updatedelegate/ToggleUpdateDelegate;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewFormItemUpdateConsumer<T extends DeliveryReviewItemVO> implements Function2<a.J.InterfaceC0007a, T, T> {

    @NotNull
    private final CarouselUpdateDelegate carouselUpdateDelegate;

    @NotNull
    private final CheckboxUpdateDelegate checkboxUpdateDelegate;

    @NotNull
    private final GroupCollapseUpdateDelegate groupCollapseUpdateDelegate;

    @NotNull
    private final RadioUpdateDelegate radioUpdateDelegate;

    @NotNull
    private final TextAreaUpdateDelegate textAreaUpdateDelegate;

    @NotNull
    private final ToggleUpdateDelegate toggleUpdateDelegate;

    public DeliveryReviewFormItemUpdateConsumer(@NotNull GroupCollapseUpdateDelegate groupCollapseUpdateDelegate, @NotNull CheckboxUpdateDelegate checkboxUpdateDelegate, @NotNull RadioUpdateDelegate radioUpdateDelegate, @NotNull CarouselUpdateDelegate carouselUpdateDelegate, @NotNull TextAreaUpdateDelegate textAreaUpdateDelegate, @NotNull ToggleUpdateDelegate toggleUpdateDelegate) {
        Intrinsics.checkNotNullParameter(groupCollapseUpdateDelegate, "groupCollapseUpdateDelegate");
        Intrinsics.checkNotNullParameter(checkboxUpdateDelegate, "checkboxUpdateDelegate");
        Intrinsics.checkNotNullParameter(radioUpdateDelegate, "radioUpdateDelegate");
        Intrinsics.checkNotNullParameter(carouselUpdateDelegate, "carouselUpdateDelegate");
        Intrinsics.checkNotNullParameter(textAreaUpdateDelegate, "textAreaUpdateDelegate");
        Intrinsics.checkNotNullParameter(toggleUpdateDelegate, "toggleUpdateDelegate");
        this.groupCollapseUpdateDelegate = groupCollapseUpdateDelegate;
        this.checkboxUpdateDelegate = checkboxUpdateDelegate;
        this.radioUpdateDelegate = radioUpdateDelegate;
        this.carouselUpdateDelegate = carouselUpdateDelegate;
        this.textAreaUpdateDelegate = textAreaUpdateDelegate;
        this.toggleUpdateDelegate = toggleUpdateDelegate;
    }

    @Override // kotlin.jvm.functions.Function2
    public T invoke(@NotNull a.J.InterfaceC0007a update, @NotNull T oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if ((update instanceof UpdateComponent) && ((UpdateComponent) update).getGroupId() != oldVO.getGroupId()) {
            return null;
        }
        T t2 = update instanceof UpdateGroupCollapse ? (T) this.groupCollapseUpdateDelegate.update(oldVO, (UpdateGroupCollapse) update) : update instanceof UpdateCheckbox ? (T) this.checkboxUpdateDelegate.update(oldVO, (UpdateCheckbox) update) : update instanceof UpdateRadio ? (T) this.radioUpdateDelegate.update(oldVO, (UpdateRadio) update) : update instanceof UpdateCarousel ? (T) this.carouselUpdateDelegate.update(oldVO, (UpdateCarousel) update) : update instanceof UpdateTextarea ? (T) this.textAreaUpdateDelegate.update(oldVO, (UpdateTextarea) update) : update instanceof UpdateToggle ? (T) this.toggleUpdateDelegate.update(oldVO, (UpdateToggle) update) : null;
        if (t2 == null) {
            return null;
        }
        return t2;
    }
}
