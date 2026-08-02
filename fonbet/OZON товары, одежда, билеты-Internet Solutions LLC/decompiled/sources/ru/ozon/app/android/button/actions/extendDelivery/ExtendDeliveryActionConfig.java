package ru.ozon.app.android.button.actions.extendDelivery;

import Pc.a;
import WZ.l;
import a00.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.actions.BaseActionConfig;
import ru.ozon.app.android.button.data.ActionButtonDTO;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.cscore.actionButton.presentation.ActionButtonViewModel;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/button/actions/extendDelivery/ExtendDeliveryActionConfig;", "Lru/ozon/app/android/button/actions/BaseActionConfig;", "Lru/ozon/app/android/button/actions/extendDelivery/ExtendDeliveryActionDTO;", "LPc/a;", "Lru/ozon/app/android/cscore/actionButton/presentation/ActionButtonViewModel;", "actionViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "LWZ/l;", "tokenizedAnalytics", "<init>", "(LPc/a;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LWZ/l;)V", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "action", "La00/h;", "viewModelOwnerProvider", "", "widgetId", "", "onAction", "(Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;La00/h;Ljava/lang/Long;)V", "LPc/a;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "LWZ/l;", "Companion", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendDeliveryActionConfig implements BaseActionConfig<ExtendDeliveryActionDTO> {

    @NotNull
    private final a<ActionButtonViewModel> actionViewModel;

    @NotNull
    private final HandlersInhibitor inhibitor;

    @NotNull
    private final l tokenizedAnalytics;

    public ExtendDeliveryActionConfig(@NotNull a<ActionButtonViewModel> actionViewModel, @NotNull HandlersInhibitor inhibitor, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(actionViewModel, "actionViewModel");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.actionViewModel = actionViewModel;
        this.inhibitor = inhibitor;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* renamed from: action, reason: merged with bridge method [inline-methods] */
    public ExtendDeliveryActionDTO m494action(ActionButtonDTO.ButtonsItem.Action action) {
        return (ExtendDeliveryActionDTO) BaseActionConfig.DefaultImpls.action(this, action);
    }

    @Override // ru.ozon.app.android.button.actions.BaseActionConfig
    public void onAction(ActionButtonDTO.ButtonsItem.Action action, @NotNull h viewModelOwnerProvider, Long widgetId) {
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        this.inhibitor.run(1000L, new ExtendDeliveryActionConfig$onAction$1(this, action, viewModelOwnerProvider, widgetId));
    }
}
