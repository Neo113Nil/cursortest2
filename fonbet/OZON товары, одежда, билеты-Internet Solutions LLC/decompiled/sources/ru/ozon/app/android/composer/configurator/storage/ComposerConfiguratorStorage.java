package ru.ozon.app.android.composer.configurator.storage;

import QZ.g;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.configurator.state.factory.ComposerInterceptorFactory;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/configurator/storage/ComposerConfiguratorStorage;", "", "Lru/ozon/app/android/composer/configurator/storage/ConfiguratorFactory;", "factory", "", "addFactory", "(Lru/ozon/app/android/composer/configurator/storage/ConfiguratorFactory;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getConfigurators", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;)Ljava/util/Set;", "Lru/ozon/app/android/composer/configurator/state/factory/ComposerInterceptorFactory;", "addInterceptorFactory", "(Lru/ozon/app/android/composer/configurator/state/factory/ComposerInterceptorFactory;)V", "LQZ/g;", "getInterceptors", "()Ljava/util/Set;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerConfiguratorStorage {
    void addFactory(@NotNull ConfiguratorFactory factory);

    void addInterceptorFactory(@NotNull ComposerInterceptorFactory factory);

    @NotNull
    Set<ComposerScreenConfig.PageConfigurator> getConfigurators(@NotNull ComposerScreenConfig screenConfig);

    @NotNull
    Set<g> getInterceptors();
}
