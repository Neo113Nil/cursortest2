package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentApi;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TravelPersonalAccountReplenishmentComponent$Companion$create$1$1$travelPersonalAccountReplenishmentViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<TravelPersonalAccountReplenishmentViewModel>> {
    final /* synthetic */ TravelPersonalAccountReplenishmentComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentComponent$Companion$create$1$1$travelPersonalAccountReplenishmentViewModelProvider$2(TravelPersonalAccountReplenishmentComponent$Companion$create$1$1 travelPersonalAccountReplenishmentComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = travelPersonalAccountReplenishmentComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TravelPersonalAccountReplenishmentViewModel invoke$lambda$0(TravelPersonalAccountReplenishmentComponent$Companion$create$1$1 travelPersonalAccountReplenishmentComponent$Companion$create$1$1) {
        TravelPersonalAccountReplenishmentApi travelPersonalAccountReplenishmentApi;
        travelPersonalAccountReplenishmentApi = travelPersonalAccountReplenishmentComponent$Companion$create$1$1.getTravelPersonalAccountReplenishmentApi();
        Intrinsics.checkNotNullExpressionValue(travelPersonalAccountReplenishmentApi, "access$getTravelPersonal…ountReplenishmentApi(...)");
        return new TravelPersonalAccountReplenishmentViewModel(travelPersonalAccountReplenishmentApi, travelPersonalAccountReplenishmentComponent$Companion$create$1$1.getTravelPersonalAccountReplenishmentMapper());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<TravelPersonalAccountReplenishmentViewModel> invoke() {
        final TravelPersonalAccountReplenishmentComponent$Companion$create$1$1 travelPersonalAccountReplenishmentComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.di.a
            @Override // Pc.a
            public final Object get() {
                TravelPersonalAccountReplenishmentViewModel invoke$lambda$0;
                invoke$lambda$0 = TravelPersonalAccountReplenishmentComponent$Companion$create$1$1$travelPersonalAccountReplenishmentViewModelProvider$2.invoke$lambda$0(TravelPersonalAccountReplenishmentComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
