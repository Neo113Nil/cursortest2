package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import W10.c;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponseV2;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3UiState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\t*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\bJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "showError", "()V", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;", "action", "setAction", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;)V", "", "buttonId", "showButtonLoader", "(Ljava/lang/String;)V", "hideButtonLoader", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResponseV2;", "toAction", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResponseV2;)Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "LW10/c;", "trackingData", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;LW10/c;Ljava/lang/String;)V", "clearErrorState", "clearButtonIdLoader", "clearActionState", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/x0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState;", "_uiState", "LAe/x0;", "LAe/M0;", "uiState", "LAe/M0;", "getUiState", "()LAe/M0;", "Lxe/B0;", "job", "Lxe/B0;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV3ViewModel extends w0 {

    @NotNull
    private final x0<EmptyStateV3UiState> _uiState;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 job;

    @NotNull
    private final M0<EmptyStateV3UiState> uiState;

    public EmptyStateV3ViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        x0<EmptyStateV3UiState> a11 = O0.a(new EmptyStateV3UiState(null, false, null, false, 15, null));
        this._uiState = a11;
        this.uiState = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideButtonLoader(String buttonId) {
        x0<EmptyStateV3UiState> x0Var = this._uiState;
        while (true) {
            EmptyStateV3UiState value = x0Var.getValue();
            String str = buttonId;
            if (x0Var.b(value, EmptyStateV3UiState.copy$default(value, null, false, str, false, 9, null))) {
                return;
            } else {
                buttonId = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAction(EmptyStateV3UiState.Action action) {
        x0<EmptyStateV3UiState> x0Var = this._uiState;
        while (true) {
            EmptyStateV3UiState value = x0Var.getValue();
            EmptyStateV3UiState.Action action2 = action;
            if (x0Var.b(value, EmptyStateV3UiState.copy$default(value, action2, false, null, false, 14, null))) {
                return;
            } else {
                action = action2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showButtonLoader(String buttonId) {
        x0<EmptyStateV3UiState> x0Var = this._uiState;
        while (true) {
            EmptyStateV3UiState value = x0Var.getValue();
            String str = buttonId;
            if (x0Var.b(value, EmptyStateV3UiState.copy$default(value, null, true, str, false, 9, null))) {
                return;
            } else {
                buttonId = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        EmptyStateV3UiState value;
        x0<EmptyStateV3UiState> x0Var = this._uiState;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, EmptyStateV3UiState.copy$default(value, null, false, null, true, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyStateV3UiState.Action toAction(TravelCommonActionResponseV2 travelCommonActionResponseV2) {
        return new EmptyStateV3UiState.Action(AtomActionMapperKt.toAtomAction(travelCommonActionResponseV2.getAction(), null), travelCommonActionResponseV2.getNotification());
    }

    public final void clearActionState() {
        EmptyStateV3UiState value;
        x0<EmptyStateV3UiState> x0Var = this._uiState;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, EmptyStateV3UiState.copy$default(value, null, false, null, false, 14, null)));
    }

    public final void clearButtonIdLoader() {
        EmptyStateV3UiState value;
        x0<EmptyStateV3UiState> x0Var = this._uiState;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, EmptyStateV3UiState.copy$default(value, null, false, null, false, 11, null)));
    }

    public final void clearErrorState() {
        EmptyStateV3UiState value;
        x0<EmptyStateV3UiState> x0Var = this._uiState;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, EmptyStateV3UiState.copy$default(value, null, false, null, false, 7, null)));
    }

    @NotNull
    public final M0<EmptyStateV3UiState> getUiState() {
        return this.uiState;
    }

    public final void handleAction(@NotNull AtomAction action, @NotNull c trackingData, String buttonId) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (action instanceof AtomAction.ComposerAction) {
            B0 b02 = this.job;
            if (b02 != null) {
                b02.j(null);
            }
            this.job = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new EmptyStateV3ViewModel$handleAction$1(this, buttonId, action, trackingData, null), 3);
        }
    }
}
