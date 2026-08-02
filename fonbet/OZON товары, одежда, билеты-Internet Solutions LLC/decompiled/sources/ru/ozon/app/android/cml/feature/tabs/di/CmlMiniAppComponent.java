package ru.ozon.app.android.cml.feature.tabs.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.feature.tabs.presentation.SwitchMapProviderObserver;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/di/CmlMiniAppComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cml/feature/tabs/presentation/SwitchMapProviderObserver;", "provideSwitchMapObserver", "()Lru/ozon/app/android/cml/feature/tabs/presentation/SwitchMapProviderObserver;", "Factory", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CmlMiniAppComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/di/CmlMiniAppComponent$Factory;", "", "create", "Lru/ozon/app/android/cml/feature/tabs/di/CmlMiniAppComponent;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CmlMiniAppComponent create(@NotNull LocationComponentApi locationComponentApi);
    }

    @NotNull
    SwitchMapProviderObserver provideSwitchMapObserver();
}
