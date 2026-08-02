package ru.ozon.app.android.search.widgets.tapTags.v2.core;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.commonTapTags.ApplyTapTagActionHandlerFactory;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2View;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewHolder;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TapTagsV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TapTagsV2ViewHolder> {
    final /* synthetic */ TapTagsV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapTagsV2ViewMapper$holderProducer$1(TapTagsV2ViewMapper tapTagsV2ViewMapper) {
        super(2);
        this.this$0 = tapTagsV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TapTagsV2ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final TapTagsV2ViewMapper tapTagsV2ViewMapper = this.this$0;
        ActiveSearchBarViewModel activeSearchBarViewModel = (ActiveSearchBarViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ActiveSearchBarViewModel activeSearchBarViewModel2 = TapTagsV2ViewMapper.this.component().getActiveSearchBarViewModel();
                Intrinsics.g(activeSearchBarViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return activeSearchBarViewModel2;
            }
        }).a(ActiveSearchBarViewModel.class);
        TapTagsV2View tapTagsV2View = (TapTagsV2View) view;
        TapTagsV2ViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0 tapTagsV2ViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0 = new TapTagsV2ViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(activeSearchBarViewModel, null, 1, null));
        ApplyTapTagActionHandlerFactory applyTapTagActionHandlerFactory = new ApplyTapTagActionHandlerFactory(refs, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getCustomActionHandlersStoreFactory());
        B0 a12 = refs.getViewModelOwnerProvider().a();
        final TapTagsV2ViewMapper tapTagsV2ViewMapper2 = this.this$0;
        return new TapTagsV2ViewHolder(refs, tapTagsV2ViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0, applyTapTagActionHandlerFactory, activeSearchBarViewModel, (TapTagsV2ViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TapTagsV2ViewModel tapTagsV2ViewModel = TapTagsV2ViewMapper.this.component().getTapTagsV2ViewModel();
                Intrinsics.g(tapTagsV2ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tapTagsV2ViewModel;
            }
        }).a(TapTagsV2ViewModel.class), tapTagsV2View, this.this$0.component().getFeatureChecker());
    }
}
