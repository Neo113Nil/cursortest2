package ru.ozon.app.android.delivery.customActionsHandlers.cleanCncAddress;

import Tg.b;
import Vg.f;
import androidx.lifecycle.K;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/cleanCncAddress/CleanCncAddressActionHandler;", "LVg/f;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lk20/g;", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "(Lk20/g;)Lru/ozon/app/android/composer/ComposerNavigator;", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "widgetComponentStorage", "", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CleanCncAddressActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public CleanCncAddressActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.actionId = "cleanCncAddress";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerNavigator getNavigator(C7475g c7475g) {
        return ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getComposerNavigator();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (action instanceof AtomAction.ComposerAction) {
            C10727i.c(K.a(widgetInfo.a().e()), null, null, new CleanCncAddressActionHandler$processWidgetAction$1(action, this, widgetComponentStorage, null), 3);
        }
    }
}
