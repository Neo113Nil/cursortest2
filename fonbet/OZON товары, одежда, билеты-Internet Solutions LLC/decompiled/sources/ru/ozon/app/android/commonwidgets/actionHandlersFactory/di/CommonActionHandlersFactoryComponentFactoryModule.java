package ru.ozon.app.android.commonwidgets.actionHandlersFactory.di;

import OA.a;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u001e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u0004j\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u0006`\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/commonwidgets/actionHandlersFactory/di/CommonActionHandlersFactoryComponentFactoryModule;", "", "<init>", "()V", "Lii/a;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "bindCommonActionStoreComponentFactory$widgets_prodGoogleAllVendorsRelease", "()Lii/a;", "bindCommonActionStoreComponentFactory", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonActionHandlersFactoryComponentFactoryModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonActionHandlersFactoryComponent bindCommonActionStoreComponentFactory$lambda$0(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        CommonActionHandlersFactoryComponent.Factory factory = DaggerCommonActionHandlersFactoryComponent.factory();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) componentStorage.b(CustomActionHandlersComponentApi.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        return factory.create(customActionHandlersComponentApi, (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class));
    }

    @NotNull
    public final InterfaceC7081a<? extends InterfaceC6958a> bindCommonActionStoreComponentFactory$widgets_prodGoogleAllVendorsRelease() {
        return new a(1);
    }
}
