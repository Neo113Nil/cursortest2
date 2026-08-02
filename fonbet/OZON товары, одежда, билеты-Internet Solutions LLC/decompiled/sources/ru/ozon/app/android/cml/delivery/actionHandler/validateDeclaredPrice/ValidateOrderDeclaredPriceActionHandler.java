package ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainViewModel;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/ValidateOrderDeclaredPriceActionHandler;", "Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/BaseValidateDeclaredPriceActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;", "inputCurtainViewModelProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LPc/a;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValidateOrderDeclaredPriceActionHandler extends BaseValidateDeclaredPriceActionHandler {

    @NotNull
    private final String actionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateOrderDeclaredPriceActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull a<InputCurtainViewModel> inputCurtainViewModelProvider) {
        super(actionV2Repository, inputCurtainViewModelProvider);
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(inputCurtainViewModelProvider, "inputCurtainViewModelProvider");
        this.actionId = "validateOrderDeclaredPrice";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }
}
