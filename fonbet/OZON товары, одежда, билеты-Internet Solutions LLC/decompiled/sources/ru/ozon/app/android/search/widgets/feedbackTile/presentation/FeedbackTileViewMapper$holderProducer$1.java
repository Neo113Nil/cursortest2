package ru.ozon.app.android.search.widgets.feedbackTile.presentation;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackSharedViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FeedbackTileViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, FeedbackTileViewHolder> {
    final /* synthetic */ FeedbackTileViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackTileViewMapper$holderProducer$1(FeedbackTileViewMapper feedbackTileViewMapper) {
        super(2);
        this.this$0 = feedbackTileViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final FeedbackTileViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FeedbackTileView feedbackTileView = (FeedbackTileView) view;
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final FeedbackTileViewMapper feedbackTileViewMapper = this.this$0;
        return new FeedbackTileViewHolder(feedbackTileView, (FeedbackSharedViewModel) new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.feedbackTile.presentation.FeedbackTileViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FeedbackSharedViewModel sharedViewModel = FeedbackTileViewMapper.this.component().getSharedViewModel();
                Intrinsics.g(sharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sharedViewModel;
            }
        }).a(FeedbackSharedViewModel.class), this.this$0.component().getTokenizedAnalytics(), refs, this.this$0.component().getAnalyticDelegate());
    }
}
