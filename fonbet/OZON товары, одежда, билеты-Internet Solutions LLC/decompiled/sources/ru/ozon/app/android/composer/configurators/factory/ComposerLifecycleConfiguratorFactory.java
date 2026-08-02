package ru.ozon.app.android.composer.configurators.factory;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.configurator.storage.ConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.ComposerLifecycleConfigurator;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/configurators/factory/ComposerLifecycleConfiguratorFactory;", "Lru/ozon/app/android/composer/configurator/storage/ConfiguratorFactory;", "LPc/a;", "Lru/ozon/app/android/composer/configurators/ComposerLifecycleConfigurator;", "provider", "<init>", "(LPc/a;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "create", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerLifecycleConfiguratorFactory implements ConfiguratorFactory {

    @NotNull
    private final a<ComposerLifecycleConfigurator> provider;

    public ComposerLifecycleConfiguratorFactory(@NotNull a<ComposerLifecycleConfigurator> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    @Override // ru.ozon.app.android.composer.configurator.storage.ConfiguratorFactory
    public ComposerScreenConfig.PageConfigurator create(@NotNull ComposerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        return this.provider.get();
    }
}
