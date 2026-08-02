package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateTextarea;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TextareaVH$textWatcher$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ TextareaVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextareaVH$textWatcher$1(TextareaVH textareaVH) {
        super(1);
        this.this$0 = textareaVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String text) {
        ComposerReferences composerReferences;
        int i11;
        ComponentVO componentVO;
        ComponentVO componentVO2;
        DeliveryReviewFormViewModel deliveryReviewFormViewModel;
        String selectControllingComponentId;
        DeliveryReviewFormViewModel deliveryReviewFormViewModel2;
        ComponentVO componentVO3;
        Intrinsics.checkNotNullParameter(text, "text");
        composerReferences = this.this$0.refs;
        InterfaceC7851b controller = composerReferences.getController();
        i11 = this.this$0.groupId;
        componentVO = this.this$0.component;
        String id2 = componentVO != null ? componentVO.getId() : null;
        if (id2 == null) {
            id2 = "";
        }
        controller.update(new UpdateTextarea(i11, id2, text));
        componentVO2 = this.this$0.component;
        if (componentVO2 != null && (selectControllingComponentId = componentVO2.getSelectControllingComponentId()) != null) {
            TextareaVH textareaVH = this.this$0;
            deliveryReviewFormViewModel2 = textareaVH.deliveryReviewFormViewModel;
            componentVO3 = textareaVH.component;
            String id3 = componentVO3 != null ? componentVO3.getId() : null;
            deliveryReviewFormViewModel2.updateToggleSelection(id3 != null ? id3 : "", selectControllingComponentId, !h.K(text));
        }
        deliveryReviewFormViewModel = this.this$0.deliveryReviewFormViewModel;
        deliveryReviewFormViewModel.updateAnnotationAfterUseTextArea(text);
    }
}
