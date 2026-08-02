package ru.ozon.app.android.account.locale.app.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.data.AppLocaleChangedEventBus;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.account.locale.app.data.LocalizationDebugPreferences;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "getAppLocaleRepository", "()Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "appLocaleRepository", "Lru/ozon/app/android/account/locale/app/data/AppLocaleChangedEventBus;", "getAppLocaleChangedEventBus", "()Lru/ozon/app/android/account/locale/app/data/AppLocaleChangedEventBus;", "appLocaleChangedEventBus", "Lru/ozon/app/android/account/locale/app/data/LocalizationDebugPreferences;", "getLocalizationDebugPreferences", "()Lru/ozon/app/android/account/locale/app/data/LocalizationDebugPreferences;", "localizationDebugPreferences", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppLocaleComponentApi extends InterfaceC6958a {
    @NotNull
    AppLocaleChangedEventBus getAppLocaleChangedEventBus();

    @NotNull
    AppLocaleRepository getAppLocaleRepository();

    @NotNull
    LocalizationDebugPreferences getLocalizationDebugPreferences();
}
