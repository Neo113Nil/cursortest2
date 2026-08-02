package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton;

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
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.FeedbackFormV2ViewModel;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/sendButton/FeedbackSendButtonV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FeedbackSendButtonV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, FeedbackSendButtonV2ViewHolder> {
    final /* synthetic */ FeedbackSendButtonV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackSendButtonV2ViewMapper$holderProducer$1(FeedbackSendButtonV2ViewMapper feedbackSendButtonV2ViewMapper) {
        super(2);
        this.this$0 = feedbackSendButtonV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final FeedbackSendButtonV2ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ButtonV3View buttonV3View = (ButtonV3View) view;
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final FeedbackSendButtonV2ViewMapper feedbackSendButtonV2ViewMapper = this.this$0;
        FeedbackFormV2ViewModel feedbackFormV2ViewModel = (FeedbackFormV2ViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton.FeedbackSendButtonV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FeedbackFormV2ViewModel viewModel = FeedbackSendButtonV2ViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(FeedbackFormV2ViewModel.class);
        h viewModelOwnerProvider2 = refs.getViewModelOwnerProvider();
        final FeedbackSendButtonV2ViewMapper feedbackSendButtonV2ViewMapper2 = this.this$0;
        return new FeedbackSendButtonV2ViewHolder(refs, buttonV3View, this.this$0.component().getNavigator(), feedbackFormV2ViewModel, (FeedbackSharedViewModel) new z0(viewModelOwnerProvider2.b(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton.FeedbackSendButtonV2ViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FeedbackSharedViewModel sharedViewModel = FeedbackSendButtonV2ViewMapper.this.component().getSharedViewModel();
                Intrinsics.g(sharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sharedViewModel;
            }
        }).a(FeedbackSharedViewModel.class), this.this$0.component().getAnalyticDelegate(), this.this$0.component().getTokenizedAnalytics());
    }
}
