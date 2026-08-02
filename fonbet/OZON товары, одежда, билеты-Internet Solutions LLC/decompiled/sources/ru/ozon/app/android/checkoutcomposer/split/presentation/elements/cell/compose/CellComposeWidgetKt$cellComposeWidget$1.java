package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.flags.CheckoutSplitComposeUiEnabled;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CellComposeWidgetKt$cellComposeWidget$1 extends AbstractC7737t implements Function1<Object, Boolean> {
    final /* synthetic */ SplitWidgetComponent $component;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellComposeWidgetKt$cellComposeWidget$1(SplitWidgetComponent splitWidgetComponent) {
        super(1);
        this.$component = splitWidgetComponent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf((obj instanceof SplitElementDTO.SplitCellDTO) && this.$component.getFeatureChecker().isEnabled(CheckoutSplitComposeUiEnabled.INSTANCE));
    }
}
