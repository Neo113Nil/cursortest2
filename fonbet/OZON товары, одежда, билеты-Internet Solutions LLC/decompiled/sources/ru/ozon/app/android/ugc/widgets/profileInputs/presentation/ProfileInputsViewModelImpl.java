package ru.ozon.app.android.ugc.widgets.profileInputs.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.ugc.widgets.profileInputs.data.ProfileInputsDTO;
import ru.ozon.app.android.ugc.widgets.profileInputs.presentation.InputResult;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModelImpl;", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "LAe/M0;", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/InputResult;", "observeResultFlow", "()LAe/M0;", "", "str", "Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "inputField", "", "checkInputLocally", "(Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "inputText", "changePublicName", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/String;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/x0;", "stateFlow", "LAe/x0;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileInputsViewModelImpl extends ProfileInputsViewModel {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final x0<InputResult> stateFlow;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModelImpl$Companion;", "", "<init>", "()V", "CHANGE_PUBLIC_NAME_ID", "", "CHANGE_NICKNAME_ID", "PARAM_INPUT", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ProfileInputsViewModelImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.stateFlow = O0.a(InputResult.Idle.INSTANCE);
    }

    @Override // ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewModel
    public void changePublicName(@NotNull AtomAction.Click action, @NotNull String inputText) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        String id2 = action.getId();
        if (id2 != null && (this.stateFlow.getValue() instanceof InputResult.InputSuccess)) {
            if (id2.equals("changeProfileNickname") || id2.equals("changeProfilePublicName")) {
                Map<String, String> params = action.getParams();
                if (params == null) {
                    params = U.c();
                }
                LinkedHashMap u11 = U.u(params);
                u11.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, inputText);
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ProfileInputsViewModelImpl$changePublicName$1(this, u11, id2, null), 3);
            }
        }
    }

    @Override // ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewModel
    public void checkInputLocally(@NotNull String str, @NotNull ProfileInputsDTO.InputField inputField) {
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ProfileInputsViewModelImpl$checkInputLocally$1(this, (str.length() != 0 || inputField.getEmptyError() == null) ? (str.length() >= inputField.getMinCount() || inputField.getCountError() == null) ? InputResult.InputSuccess.INSTANCE : new InputResult.InputError(inputField.getCountError()) : new InputResult.InputError(inputField.getEmptyError()), null), 3);
    }

    @Override // ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewModel
    @NotNull
    public M0<InputResult> observeResultFlow() {
        return C2399j.b(this.stateFlow);
    }
}
