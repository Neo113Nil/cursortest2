package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.progressLadder;

import WZ.l;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderView;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SellerActionPreviewProgressLadderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SellerActionPreviewProgressLadderViewHolder> {
    final /* synthetic */ SellerActionPreviewProgressLadderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerActionPreviewProgressLadderViewMapper$holderProducer$1(SellerActionPreviewProgressLadderViewMapper sellerActionPreviewProgressLadderViewMapper) {
        super(2);
        this.this$0 = sellerActionPreviewProgressLadderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SellerActionPreviewProgressLadderViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final SellerActionPreviewProgressLadderViewMapper sellerActionPreviewProgressLadderViewMapper = this.this$0;
        return new SellerActionPreviewProgressLadderViewHolder((SellerActionPreviewProgressLadderView) view, tokenizedAnalytics, (SellerActionPreviewProgressLadderViewModel) new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.progressLadder.SellerActionPreviewProgressLadderViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SellerActionPreviewProgressLadderViewModel sellerActionPreviewProgressLadderViewModel = SellerActionPreviewProgressLadderViewMapper.this.component().getSellerActionPreviewProgressLadderViewModel();
                Intrinsics.g(sellerActionPreviewProgressLadderViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sellerActionPreviewProgressLadderViewModel;
            }
        }).a(SellerActionPreviewProgressLadderViewModel.class), refs);
    }
}
