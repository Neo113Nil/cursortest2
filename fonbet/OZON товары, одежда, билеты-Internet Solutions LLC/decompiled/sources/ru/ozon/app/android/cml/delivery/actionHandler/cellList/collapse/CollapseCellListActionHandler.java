package ru.ozon.app.android.cml.delivery.actionHandler.cellList.collapse;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.base.AddStrategy;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.base.BaseToggleCellListActionHandler;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/collapse/CollapseCellListActionHandler;", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/BaseToggleCellListActionHandler;", "actionV2Repository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "addStrategy", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/AddStrategy;", "getAddStrategy$delivery_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/AddStrategy;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollapseCellListActionHandler extends BaseToggleCellListActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final AddStrategy addStrategy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapseCellListActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        super(actionV2Repository);
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionId = "collapseCellList";
        this.addStrategy = AddStrategy.REPLACE;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.cml.delivery.actionHandler.cellList.base.BaseToggleCellListActionHandler
    @NotNull
    /* renamed from: getAddStrategy$delivery_prodGoogleAllVendorsRelease, reason: from getter */
    public AddStrategy getAddStrategy() {
        return this.addStrategy;
    }
}
