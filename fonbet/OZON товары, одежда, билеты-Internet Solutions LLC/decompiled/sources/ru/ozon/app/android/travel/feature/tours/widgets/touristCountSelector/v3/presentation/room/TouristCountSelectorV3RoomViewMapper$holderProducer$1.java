package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room;

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
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TouristCountSelectorV3RoomViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TouristCountSelectorV3RoomWidgetViewHolder> {
    final /* synthetic */ TouristCountSelectorV3RoomViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3RoomViewMapper$holderProducer$1(TouristCountSelectorV3RoomViewMapper touristCountSelectorV3RoomViewMapper) {
        super(2);
        this.this$0 = touristCountSelectorV3RoomViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TouristCountSelectorV3RoomWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        final a<TouristCountSelectorV3ViewModel> viewModelProvider = this.this$0.component().getViewModelProvider();
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TouristCountSelectorV3ViewModel touristCountSelectorV3ViewModel = (TouristCountSelectorV3ViewModel) a.this.get();
                Intrinsics.g(touristCountSelectorV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return touristCountSelectorV3ViewModel;
            }
        }).a(TouristCountSelectorV3ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new TouristCountSelectorV3RoomWidgetViewHolder(view, ref, (TouristCountSelectorV3ViewModel) a11);
    }
}
