package ru.ozon.app.android.composer.configurator.storage;

import QZ.g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.configurator.state.factory.ComposerInterceptorFactory;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0015j\b\u0012\u0004\u0012\u00020\u000f`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/composer/configurator/storage/ComposerConfiguratorStorageImpl;", "Lru/ozon/app/android/composer/configurator/storage/ComposerConfiguratorStorage;", "<init>", "()V", "Lru/ozon/app/android/composer/configurator/storage/ConfiguratorFactory;", "factory", "", "addFactory", "(Lru/ozon/app/android/composer/configurator/storage/ConfiguratorFactory;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getConfigurators", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;)Ljava/util/Set;", "Lru/ozon/app/android/composer/configurator/state/factory/ComposerInterceptorFactory;", "addInterceptorFactory", "(Lru/ozon/app/android/composer/configurator/state/factory/ComposerInterceptorFactory;)V", "LQZ/g;", "getInterceptors", "()Ljava/util/Set;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "factories", "Ljava/util/HashSet;", "interceptorFactories", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerConfiguratorStorageImpl implements ComposerConfiguratorStorage {

    @NotNull
    private final HashSet<ConfiguratorFactory> factories = new HashSet<>();

    @NotNull
    private final HashSet<ComposerInterceptorFactory> interceptorFactories = new HashSet<>();

    @Override // ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage
    public void addFactory(@NotNull ConfiguratorFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factories.add(factory);
    }

    @Override // ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage
    public void addInterceptorFactory(@NotNull ComposerInterceptorFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.interceptorFactories.add(factory);
    }

    @Override // ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage
    @NotNull
    public Set<ComposerScreenConfig.PageConfigurator> getConfigurators(@NotNull ComposerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        HashSet<ConfiguratorFactory> hashSet = this.factories;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = hashSet.iterator();
        while (it.hasNext()) {
            ComposerScreenConfig.PageConfigurator create = ((ConfiguratorFactory) it.next()).create(screenConfig);
            if (create != null) {
                linkedHashSet.add(create);
            }
        }
        return linkedHashSet;
    }

    @Override // ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage
    @NotNull
    public Set<g> getInterceptors() {
        HashSet<ComposerInterceptorFactory> hashSet = this.interceptorFactories;
        if (hashSet.isEmpty()) {
            hashSet = null;
        }
        if (hashSet == null) {
            return M.f71699a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = hashSet.iterator();
        while (it.hasNext()) {
            g create = ((ComposerInterceptorFactory) it.next()).create();
            if (create != null) {
                linkedHashSet.add(create);
            }
        }
        return linkedHashSet;
    }
}
