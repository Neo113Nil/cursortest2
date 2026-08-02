package ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class RelatedProductsBottomSheetView$screenStateView$2 extends AbstractC7737t implements Function0<PageIssueStateView> {
    final /* synthetic */ RelatedProductsBottomSheetView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RelatedProductsBottomSheetView$screenStateView$2(RelatedProductsBottomSheetView relatedProductsBottomSheetView) {
        super(0);
        this.this$0 = relatedProductsBottomSheetView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PageIssueStateView invoke() {
        i iVar;
        iVar = this.this$0.container;
        return ComposerViewExtensionKt.composerScreenStateView(iVar.Y());
    }
}
