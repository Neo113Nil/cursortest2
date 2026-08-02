package ru.ozon.app.android.commonwidgets.actionHandlersFactory.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.CommonActionHandlersStore;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.platform.customActionHandlers.commonActionHandlersFactory.CommonActionHandlersFactoryComponentApi;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/commonwidgets/actionHandlersFactory/di/CommonActionHandlersFactoryComponent;", "Lru/ozon/app/android/platform/customActionHandlers/commonActionHandlersFactory/CommonActionHandlersFactoryComponentApi;", "getCommonActionHandlersStore", "Lru/ozon/app/android/commonwidgets/actionHandlersFactory/CommonActionHandlersStore;", "Factory", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CommonActionHandlersFactoryComponent extends CommonActionHandlersFactoryComponentApi {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/commonwidgets/actionHandlersFactory/di/CommonActionHandlersFactoryComponent$Factory;", "", "create", "Lru/ozon/app/android/commonwidgets/actionHandlersFactory/di/CommonActionHandlersFactoryComponent;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CommonActionHandlersFactoryComponent create(@NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull ContextComponentDependencies contextComponentDependencies);
    }

    @NotNull
    CommonActionHandlersStore getCommonActionHandlersStore();
}
