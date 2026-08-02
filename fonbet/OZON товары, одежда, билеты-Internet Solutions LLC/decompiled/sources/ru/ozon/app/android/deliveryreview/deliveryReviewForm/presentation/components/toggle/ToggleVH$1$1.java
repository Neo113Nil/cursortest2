package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.toggle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateToggle;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ToggleVH$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ ToggleVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToggleVH$1$1(ToggleVH toggleVH) {
        super(1);
        this.this$0 = toggleVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ComposerReferences composerReferences;
        int i11;
        composerReferences = this.this$0.refs;
        InterfaceC7851b controller = composerReferences.getController();
        i11 = this.this$0.groupId;
        ComponentVO componentVO = this.this$0.component;
        String id2 = componentVO != null ? componentVO.getId() : null;
        if (id2 == null) {
            id2 = "";
        }
        controller.update(new UpdateToggle(i11, id2, z11));
    }
}
