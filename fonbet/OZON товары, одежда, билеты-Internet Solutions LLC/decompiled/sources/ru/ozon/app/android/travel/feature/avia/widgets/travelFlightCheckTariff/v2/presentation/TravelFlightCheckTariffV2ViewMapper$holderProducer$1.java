package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation;

import Pc.a;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2WidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TravelFlightCheckTariffV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelFlightCheckTariffV2WidgetViewHolder> {
    final /* synthetic */ TravelFlightCheckTariffV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelFlightCheckTariffV2ViewMapper$holderProducer$1(TravelFlightCheckTariffV2ViewMapper travelFlightCheckTariffV2ViewMapper) {
        super(2);
        this.this$0 = travelFlightCheckTariffV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelFlightCheckTariffV2WidgetViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final a<TravelFlightCheckTariffV2ViewModel> travelFlightCheckTariffV2ViewModelProvider = this.this$0.component().getTravelFlightCheckTariffV2ViewModelProvider();
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TravelFlightCheckTariffV2ViewModel travelFlightCheckTariffV2ViewModel = (TravelFlightCheckTariffV2ViewModel) a.this.get();
                Intrinsics.g(travelFlightCheckTariffV2ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return travelFlightCheckTariffV2ViewModel;
            }
        }).a(TravelFlightCheckTariffV2ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new TravelFlightCheckTariffV2WidgetViewHolder(view, (TravelFlightCheckTariffV2ViewModel) a11, references);
    }
}
