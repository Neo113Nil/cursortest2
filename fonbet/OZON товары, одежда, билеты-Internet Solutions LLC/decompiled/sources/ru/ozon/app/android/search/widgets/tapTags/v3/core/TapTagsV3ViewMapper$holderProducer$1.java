package ru.ozon.app.android.search.widgets.tapTags.v3.core;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.widgets.commonTapTags.ApplyTapTagActionHandlerFactory;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3View;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewHolder;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TapTagsV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TapTagsV3ViewHolder> {
    final /* synthetic */ TapTagsV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapTagsV3ViewMapper$holderProducer$1(TapTagsV3ViewMapper tapTagsV3ViewMapper) {
        super(2);
        this.this$0 = tapTagsV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TapTagsV3ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final TapTagsV3ViewMapper tapTagsV3ViewMapper = this.this$0;
        TapTagsV3View tapTagsV3View = (TapTagsV3View) view;
        TapTagsV3ViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0 tapTagsV3ViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0 = new TapTagsV3ViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default((ActiveSearchBarViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ActiveSearchBarViewModel activeSearchBarViewModel = TapTagsV3ViewMapper.this.component().getActiveSearchBarViewModel();
                Intrinsics.g(activeSearchBarViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return activeSearchBarViewModel;
            }
        }).a(ActiveSearchBarViewModel.class), null, 1, null));
        ApplyTapTagActionHandlerFactory applyTapTagActionHandlerFactory = new ApplyTapTagActionHandlerFactory(refs, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getCustomActionHandlersStoreFactory());
        FeatureChecker featureChecker = this.this$0.component().getFeatureChecker();
        B0 a12 = refs.getViewModelOwnerProvider().a();
        final TapTagsV3ViewMapper tapTagsV3ViewMapper2 = this.this$0;
        return new TapTagsV3ViewHolder(refs, tapTagsV3ViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0, applyTapTagActionHandlerFactory, (TapTagsV3ViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3ViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TapTagsV3ViewModel tapTagsV3ViewModel = TapTagsV3ViewMapper.this.component().getTapTagsV3ViewModel();
                Intrinsics.g(tapTagsV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tapTagsV3ViewModel;
            }
        }).a(TapTagsV3ViewModel.class), tapTagsV3View, featureChecker);
    }
}
