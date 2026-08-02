package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.checkbox;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateCheckbox;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CheckboxVH$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ DeliveryReviewFormViewModel $deliveryReviewFormViewModel;
    final /* synthetic */ CheckboxVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckboxVH$1$1(CheckboxVH checkboxVH, DeliveryReviewFormViewModel deliveryReviewFormViewModel) {
        super(1);
        this.this$0 = checkboxVH;
        this.$deliveryReviewFormViewModel = deliveryReviewFormViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ComponentVO componentVO;
        ComposerReferences composerReferences;
        int i11;
        ComponentVO componentVO2;
        ComponentVO componentVO3;
        componentVO = this.this$0.component;
        if (componentVO == null) {
            Intrinsics.n("component");
            throw null;
        }
        if (componentVO.getDisabled()) {
            return;
        }
        composerReferences = this.this$0.refs;
        InterfaceC7851b controller = composerReferences.getController();
        i11 = this.this$0.groupId;
        componentVO2 = this.this$0.component;
        if (componentVO2 == null) {
            Intrinsics.n("component");
            throw null;
        }
        controller.update(new UpdateCheckbox(i11, componentVO2.getId(), z11));
        componentVO3 = this.this$0.component;
        if (componentVO3 == null) {
            Intrinsics.n("component");
            throw null;
        }
        ElementVO element = componentVO3.getElement();
        ElementVO.Checkbox checkbox = element instanceof ElementVO.Checkbox ? (ElementVO.Checkbox) element : null;
        if (checkbox != null) {
            DeliveryReviewFormViewModel deliveryReviewFormViewModel = this.$deliveryReviewFormViewModel;
            List<TextDTO> informers = checkbox.getInformers();
            if (informers == null) {
                informers = K.f71697a;
            }
            deliveryReviewFormViewModel.updateInformersList(informers, z11);
        }
    }
}
