package ru.ozon.app.android.composer.configurators.factory;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.configurator.storage.ConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.RefreshByGenderConfigurator;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storage.cookiePreference.RefreshByGenderCookieEvents;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/composer/configurators/factory/RefreshByGenderConfiguratorFactory;", "Lru/ozon/app/android/composer/configurator/storage/ConfiguratorFactory;", "refreshByGenderEvents", "Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "<init>", "(Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;)V", "create", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByGenderConfiguratorFactory implements ConfiguratorFactory {

    @NotNull
    private final RefreshByGenderCookieEvents refreshByGenderEvents;

    public RefreshByGenderConfiguratorFactory(@NotNull RefreshByGenderCookieEvents refreshByGenderEvents) {
        Intrinsics.checkNotNullParameter(refreshByGenderEvents, "refreshByGenderEvents");
        this.refreshByGenderEvents = refreshByGenderEvents;
    }

    @Override // ru.ozon.app.android.composer.configurator.storage.ConfiguratorFactory
    @NotNull
    public ComposerScreenConfig.PageConfigurator create(@NotNull ComposerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        return new RefreshByGenderConfigurator(this.refreshByGenderEvents);
    }
}
