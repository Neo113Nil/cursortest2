package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import androidx.compose.ui.platform.P1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j1.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation.TravelInputViewIntent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "onAction", "Lru/ozon/uni/atoms/af/AtomAction;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelInputContentKt$TravelInputContent$3$3$1 extends AbstractC7737t implements Function2<AtomAction, String, Unit> {
    final /* synthetic */ i $focusManager;
    final /* synthetic */ P1 $keyboardController;
    final /* synthetic */ TravelInputViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelInputContentKt$TravelInputContent$3$3$1(TravelInputViewModel travelInputViewModel, i iVar, P1 p12) {
        super(2);
        this.$viewModel = travelInputViewModel;
        this.$focusManager = iVar;
        this.$keyboardController = p12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, String str) {
        invoke2(atomAction, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction onAction, String name) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(name, "name");
        TravelInputContentKt.TravelInputContent$hideKeyboardAndClearFocus(this.$focusManager, this.$keyboardController);
        this.$viewModel.onViewIntent(new TravelInputViewIntent.ButtonClicked(onAction, name));
    }
}
