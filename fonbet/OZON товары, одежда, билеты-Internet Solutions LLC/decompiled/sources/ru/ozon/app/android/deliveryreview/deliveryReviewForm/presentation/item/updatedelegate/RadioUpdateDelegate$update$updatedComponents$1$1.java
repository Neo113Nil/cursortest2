package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.updatedelegate;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateRadio;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "element", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Radio;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RadioUpdateDelegate$update$updatedComponents$1$1 extends AbstractC7737t implements Function1<ElementVO.Radio, ElementVO> {
    final /* synthetic */ UpdateRadio $update;
    final /* synthetic */ String $updatedRadioId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RadioUpdateDelegate$update$updatedComponents$1$1(String str, UpdateRadio updateRadio) {
        super(1);
        this.$updatedRadioId = str;
        this.$update = updateRadio;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ElementVO invoke(ElementVO.Radio element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ElementVO.Radio.copy$default(element, null, Intrinsics.d(this.$updatedRadioId, this.$update.getComponentId()), 1, null);
    }
}
