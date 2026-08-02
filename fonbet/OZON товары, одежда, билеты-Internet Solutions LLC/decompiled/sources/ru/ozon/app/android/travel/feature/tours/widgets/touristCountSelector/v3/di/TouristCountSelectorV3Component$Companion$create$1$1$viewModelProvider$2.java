package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TouristCountSelectorV3Component$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<TouristCountSelectorV3ViewModel>> {
    final /* synthetic */ TouristCountSelectorV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3Component$Companion$create$1$1$viewModelProvider$2(TouristCountSelectorV3Component$Companion$create$1$1 touristCountSelectorV3Component$Companion$create$1$1) {
        super(0);
        this.this$0 = touristCountSelectorV3Component$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TouristCountSelectorV3ViewModel invoke$lambda$0(TouristCountSelectorV3Component$Companion$create$1$1 touristCountSelectorV3Component$Companion$create$1$1) {
        ActionComponentApi actionComponentApi;
        RetainComposerComponentApi retainComposerComponentApi;
        actionComponentApi = touristCountSelectorV3Component$Companion$create$1$1.actionComponentApi;
        ActionV2Repository actionRepository = actionComponentApi.getActionRepository();
        retainComposerComponentApi = touristCountSelectorV3Component$Companion$create$1$1.retainComposerComponentApi;
        return new TouristCountSelectorV3ViewModel(actionRepository, retainComposerComponentApi.getComposerController());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<TouristCountSelectorV3ViewModel> invoke() {
        final TouristCountSelectorV3Component$Companion$create$1$1 touristCountSelectorV3Component$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.a
            @Override // Pc.a
            public final Object get() {
                TouristCountSelectorV3ViewModel invoke$lambda$0;
                invoke$lambda$0 = TouristCountSelectorV3Component$Companion$create$1$1$viewModelProvider$2.invoke$lambda$0(TouristCountSelectorV3Component$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
