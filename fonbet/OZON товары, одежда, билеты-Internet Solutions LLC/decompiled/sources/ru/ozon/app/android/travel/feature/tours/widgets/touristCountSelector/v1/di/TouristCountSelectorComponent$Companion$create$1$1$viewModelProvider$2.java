package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorApi;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TouristCountSelectorComponent$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<TouristCountSelectorViewModel>> {
    final /* synthetic */ TouristCountSelectorComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorComponent$Companion$create$1$1$viewModelProvider$2(TouristCountSelectorComponent$Companion$create$1$1 touristCountSelectorComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = touristCountSelectorComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TouristCountSelectorViewModel invoke$lambda$0(TouristCountSelectorComponent$Companion$create$1$1 touristCountSelectorComponent$Companion$create$1$1) {
        TouristCountSelectorApi touristCountSelectorApi;
        touristCountSelectorApi = touristCountSelectorComponent$Companion$create$1$1.getTouristCountSelectorApi();
        Intrinsics.checkNotNullExpressionValue(touristCountSelectorApi, "access$getTouristCountSelectorApi(...)");
        return new TouristCountSelectorViewModel(touristCountSelectorApi);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<TouristCountSelectorViewModel> invoke() {
        final TouristCountSelectorComponent$Companion$create$1$1 touristCountSelectorComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.di.a
            @Override // Pc.a
            public final Object get() {
                TouristCountSelectorViewModel invoke$lambda$0;
                invoke$lambda$0 = TouristCountSelectorComponent$Companion$create$1$1$viewModelProvider$2.invoke$lambda$0(TouristCountSelectorComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
