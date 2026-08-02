package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateCheckbox;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "element", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Checkbox;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CheckboxUpdateDelegate$update$updatedComponents$1 extends AbstractC7737t implements Function1<ElementVO.Checkbox, ElementVO> {
    final /* synthetic */ UpdateCheckbox $update;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckboxUpdateDelegate$update$updatedComponents$1(UpdateCheckbox updateCheckbox) {
        super(1);
        this.$update = updateCheckbox;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ElementVO invoke(ElementVO.Checkbox element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ElementVO.Checkbox.copy$default(element, null, this.$update.getIsSelected(), null, 5, null);
    }
}
