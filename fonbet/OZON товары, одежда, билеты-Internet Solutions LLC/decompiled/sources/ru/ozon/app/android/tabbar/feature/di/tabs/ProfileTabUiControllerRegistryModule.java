package ru.ozon.app.android.tabbar.feature.di.tabs;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.feature.tab.factory.ProfileTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/tabbar/feature/di/tabs/ProfileTabUiControllerRegistryModule;", "", "<init>", "()V", "provideMainProfileTabRegistryModel", "Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel;", "factory", "Lru/ozon/app/android/tabbar/feature/tab/factory/ProfileTabUiControllerFactory;", "provideProfileControllerFactory", "application", "Landroid/app/Application;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileTabUiControllerRegistryModule {
    @NotNull
    public final TabControllerRegistryModel provideMainProfileTabRegistryModel(@NotNull ProfileTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("main", R$id.menu_profile), factory);
    }

    @NotNull
    public final ProfileTabUiControllerFactory provideProfileControllerFactory(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new ProfileTabUiControllerFactory(application);
    }
}
