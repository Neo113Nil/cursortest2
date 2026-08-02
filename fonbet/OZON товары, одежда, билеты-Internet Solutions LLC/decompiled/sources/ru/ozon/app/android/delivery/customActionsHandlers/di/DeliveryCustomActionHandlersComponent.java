package ru.ozon.app.android.delivery.customActionsHandlers.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/di/DeliveryCustomActionHandlersComponent;", "Lru/ozon/app/android/delivery/customActionsHandlers/di/DeliveryCustomActionHandlersApi;", "Factory", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DeliveryCustomActionHandlersComponent extends DeliveryCustomActionHandlersApi {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/di/DeliveryCustomActionHandlersComponent$Factory;", "", "create", "Lru/ozon/app/android/delivery/customActionsHandlers/di/DeliveryCustomActionHandlersComponent;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        DeliveryCustomActionHandlersComponent create(@NotNull ActionComponentApi actionComponentApi);
    }
}
