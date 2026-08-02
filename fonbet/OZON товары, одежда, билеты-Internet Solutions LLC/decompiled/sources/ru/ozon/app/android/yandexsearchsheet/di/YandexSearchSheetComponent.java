package ru.ozon.app.android.yandexsearchsheet.di;

import W10.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/di/YandexSearchSheetComponent;", "", "inject", "", "view", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment;", "Factory", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface YandexSearchSheetComponent {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JU\u0010\u0014\u001a\u00020\u00132\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/di/YandexSearchSheetComponent$Factory;", "", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/MapCommonComponentApi;", "mapCommonComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "componentDependencies", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "locationComponentApi", "Lru/ozon/app/android/yandexsearchsheet/di/YandexSearchSheetComponent;", "create", "(LW10/c;Lru/ozon/app/android/network/di/NetworkComponentApi;Lru/ozon/app/android/navigation/di/NavigationComponentApi;Lru/ozon/app/android/mapcommon/mapcommon/di/MapCommonComponentApi;Lru/ozon/app/android/composer/di/ComposerComponentApi;Lru/ozon/app/android/action/di/ActionComponentApi;Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;)Lru/ozon/app/android/yandexsearchsheet/di/YandexSearchSheetComponent;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        YandexSearchSheetComponent create(@NotNull c trackingData, @NotNull NetworkComponentApi networkComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull MapCommonComponentApi mapCommonComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull ContextComponentDependencies componentDependencies, @NotNull LocationComponentApi locationComponentApi);
    }

    void inject(@NotNull YandexSearchSheetFragment view);
}
