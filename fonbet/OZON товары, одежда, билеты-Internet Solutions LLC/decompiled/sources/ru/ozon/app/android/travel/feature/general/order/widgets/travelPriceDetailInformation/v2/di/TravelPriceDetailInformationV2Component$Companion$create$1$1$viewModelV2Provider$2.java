package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationV2IsVisibleViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationV2IsVisibleViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TravelPriceDetailInformationV2Component$Companion$create$1$1$viewModelV2Provider$2 extends AbstractC7737t implements Function0<Pc.a<ButtonWithInformationV2IsVisibleViewModel>> {
    public static final TravelPriceDetailInformationV2Component$Companion$create$1$1$viewModelV2Provider$2 INSTANCE = new TravelPriceDetailInformationV2Component$Companion$create$1$1$viewModelV2Provider$2();

    TravelPriceDetailInformationV2Component$Companion$create$1$1$viewModelV2Provider$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonWithInformationV2IsVisibleViewModel invoke$lambda$0() {
        return new ButtonWithInformationV2IsVisibleViewModel();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<ButtonWithInformationV2IsVisibleViewModel> invoke() {
        return new b();
    }
}
