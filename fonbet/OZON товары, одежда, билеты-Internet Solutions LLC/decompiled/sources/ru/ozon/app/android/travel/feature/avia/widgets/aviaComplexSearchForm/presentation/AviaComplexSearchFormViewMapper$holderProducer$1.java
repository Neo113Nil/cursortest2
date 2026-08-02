package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

import Pc.a;
import Vg.c;
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
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithRefresh.ComposerActionWithRefreshCustomActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormWidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AviaComplexSearchFormViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AviaComplexSearchFormWidgetViewHolder> {
    final /* synthetic */ AviaComplexSearchFormViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaComplexSearchFormViewMapper$holderProducer$1(AviaComplexSearchFormViewMapper aviaComplexSearchFormViewMapper) {
        super(2);
        this.this$0 = aviaComplexSearchFormViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AviaComplexSearchFormWidgetViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        c create = this.this$0.component().getCustomActionHandlersStoreFactory().create(TravelResultActionV2Handler.class, ComposerActionWithRefreshCustomActionHandler.class);
        HandlersInhibitor handlersInhibitor = this.this$0.component().getHandlersInhibitor();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final a<AviaComplexSearchFormViewModel> viewModel = this.this$0.component().getViewModel();
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AviaComplexSearchFormViewModel aviaComplexSearchFormViewModel = (AviaComplexSearchFormViewModel) a.this.get();
                Intrinsics.g(aviaComplexSearchFormViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return aviaComplexSearchFormViewModel;
            }
        }).a(AviaComplexSearchFormViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new AviaComplexSearchFormWidgetViewHolder(view, create, handlersInhibitor, references, tokenizedAnalytics, (AviaComplexSearchFormViewModel) a11);
    }
}
