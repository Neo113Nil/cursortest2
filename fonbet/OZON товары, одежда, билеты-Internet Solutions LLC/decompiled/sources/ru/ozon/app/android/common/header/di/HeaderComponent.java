package ru.ozon.app.android.common.header.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.header.core.HeaderMapper;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.platform.customActionHandlers.commonActionHandlersFactory.CommonActionHandlersFactoryComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\tJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/common/header/di/HeaderComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/android/composerCommonViewKit/header/core/HeaderMapper;", "getMapper", "()Lru/ozon/android/composerCommonViewKit/header/core/HeaderMapper;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "getActionHandlersFactory", "()Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "Factory", "header_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HeaderComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/header/di/HeaderComponent$Factory;", "", "create", "Lru/ozon/app/android/common/header/di/HeaderComponent;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "commonActionHandlersFactoryComponentApi", "Lru/ozon/app/android/platform/customActionHandlers/commonActionHandlersFactory/CommonActionHandlersFactoryComponentApi;", "header_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        HeaderComponent create(@NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi);
    }

    @NotNull
    ActionHandlersFactory getActionHandlersFactory();

    @NotNull
    HeaderMapper getMapper();
}
