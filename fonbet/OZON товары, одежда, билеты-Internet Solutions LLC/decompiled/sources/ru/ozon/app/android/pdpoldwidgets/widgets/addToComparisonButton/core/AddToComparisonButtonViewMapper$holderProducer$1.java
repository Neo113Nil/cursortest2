package ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core;

import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.AddToComparisonViewModel;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetAddToComparisonButtonBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di.AddToComparisonWidgetComponent;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.presentation.AddToComparisonButtonViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AddToComparisonButtonViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddToComparisonButtonViewHolder> {
    final /* synthetic */ AddToComparisonButtonViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToComparisonButtonViewMapper$holderProducer$1(AddToComparisonButtonViewMapper addToComparisonButtonViewMapper) {
        super(2);
        this.this$0 = addToComparisonButtonViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddToComparisonButtonViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        final AddToComparisonWidgetComponent component = this.this$0.component();
        PdpWidgetAddToComparisonButtonBinding bind = PdpWidgetAddToComparisonButtonBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new AddToComparisonButtonViewHolder(bind, composerReferences, (AddToComparisonViewModel) new z0(composerReferences.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core.AddToComparisonButtonViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddToComparisonViewModel viewModel = AddToComparisonWidgetComponent.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(AddToComparisonViewModel.class), (ComparisonRefreshViewModel) new z0(composerReferences.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core.AddToComparisonButtonViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ComparisonRefreshViewModel refreshViewModel = AddToComparisonWidgetComponent.this.getRefreshViewModel();
                Intrinsics.g(refreshViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return refreshViewModel;
            }
        }).a(ComparisonRefreshViewModel.class), component.getHandlersInhibitor());
    }
}
