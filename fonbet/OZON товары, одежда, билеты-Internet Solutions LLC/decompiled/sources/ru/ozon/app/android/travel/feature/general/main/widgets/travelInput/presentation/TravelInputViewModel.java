package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation.TravelInputViewIntent;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "newText", "", "updateText", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", AppMeasurementSdk.ConditionalUserProperty.NAME, "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;", "item", "bindData", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputViewIntent;", "intent", "onViewIntent", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputViewIntent;)V", "LAe/x0;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/WidgetState;", "stateFlow", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "LAe/w0;", "eventFlow", "LAe/w0;", "LAe/B0;", "event", "LAe/B0;", "getEvent", "()LAe/B0;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelInputViewModel extends w0 {

    @NotNull
    private final B0<AtomAction> event;

    @NotNull
    private final Ae.w0<AtomAction> eventFlow;

    @NotNull
    private final M0<WidgetState> state;

    @NotNull
    private final x0<WidgetState> stateFlow;

    public TravelInputViewModel() {
        x0<WidgetState> a11 = O0.a(new WidgetState(null, null, 3, null));
        this.stateFlow = a11;
        this.state = C2399j.b(a11);
        C0 b11 = E0.b(0, 0, null, 7);
        this.eventFlow = b11;
        this.event = C2399j.a(b11);
    }

    private final void handleAction(AtomAction action, String name) {
        if (action instanceof AtomAction.ComposerAction) {
            Map<String, String> params = ((AtomAction.ComposerAction) action).getParams();
            LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
            u11.put(name, this.stateFlow.getValue().getInputText());
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new TravelInputViewModel$handleAction$1(this, action, u11, null), 3);
        }
    }

    private final void updateText(String newText) {
        WidgetState value;
        WidgetState value2;
        CommonInputV2VO.TextInputV2 input;
        TravelInputVI data = this.stateFlow.getValue().getData();
        Integer maxLength = (data == null || (input = data.getInput()) == null) ? null : input.getMaxLength();
        if (maxLength == null) {
            x0<WidgetState> x0Var = this.stateFlow;
            do {
                value2 = x0Var.getValue();
            } while (!x0Var.b(value2, WidgetState.copy$default(value2, null, newText, 1, null)));
        } else {
            if (newText.length() > maxLength.intValue()) {
                newText = newText.substring(0, maxLength.intValue());
                Intrinsics.checkNotNullExpressionValue(newText, "substring(...)");
            }
            x0<WidgetState> x0Var2 = this.stateFlow;
            do {
                value = x0Var2.getValue();
            } while (!x0Var2.b(value, WidgetState.copy$default(value, null, newText, 1, null)));
        }
    }

    public final void bindData(@NotNull TravelInputVI item) {
        WidgetState value;
        String str;
        Intrinsics.checkNotNullParameter(item, "item");
        x0<WidgetState> x0Var = this.stateFlow;
        do {
            value = x0Var.getValue();
            CommonInputV2VO.TextInputV2 input = item.getInput();
            if (input == null || (str = input.getValue()) == null) {
                str = "";
            }
        } while (!x0Var.b(value, new WidgetState(item, str)));
    }

    @NotNull
    public final B0<AtomAction> getEvent() {
        return this.event;
    }

    @NotNull
    public final M0<WidgetState> getState() {
        return this.state;
    }

    public final void onViewIntent(@NotNull TravelInputViewIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof TravelInputViewIntent.TextChanged) {
            updateText(((TravelInputViewIntent.TextChanged) intent).getNewText());
        } else {
            if (!(intent instanceof TravelInputViewIntent.ButtonClicked)) {
                throw new o();
            }
            TravelInputViewIntent.ButtonClicked buttonClicked = (TravelInputViewIntent.ButtonClicked) intent;
            handleAction(buttonClicked.getAction(), buttonClicked.getInputName());
        }
    }
}
