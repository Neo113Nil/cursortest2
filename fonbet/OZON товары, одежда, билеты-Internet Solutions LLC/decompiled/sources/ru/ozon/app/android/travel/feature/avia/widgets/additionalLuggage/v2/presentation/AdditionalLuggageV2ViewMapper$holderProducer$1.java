package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2WidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AdditionalLuggageV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AdditionalLuggageV2WidgetViewHolder> {
    final /* synthetic */ AdditionalLuggageV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2ViewMapper$holderProducer$1(AdditionalLuggageV2ViewMapper additionalLuggageV2ViewMapper) {
        super(2);
        this.this$0 = additionalLuggageV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AdditionalLuggageV2WidgetViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final AdditionalLuggageV2ViewMapper additionalLuggageV2ViewMapper = this.this$0;
        return new AdditionalLuggageV2WidgetViewHolder(view, references, (AdditionalLuggageV2ViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AdditionalLuggageV2ViewModel additionalLuggageV2ViewModel = AdditionalLuggageV2ViewMapper.this.component().getAdditionalLuggageV2ViewModel();
                Intrinsics.g(additionalLuggageV2ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return additionalLuggageV2ViewModel;
            }
        }).a(AdditionalLuggageV2ViewModel.class), this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getCustomActionHandlersStoreFactory());
    }
}
