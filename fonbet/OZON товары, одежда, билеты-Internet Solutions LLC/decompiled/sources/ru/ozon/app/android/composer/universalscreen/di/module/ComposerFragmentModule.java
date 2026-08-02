package ru.ozon.app.android.composer.universalscreen.di.module;

import E00.a;
import Pc.a;
import QZ.g;
import fk0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.configurator.RefreshByResultConfigurator;
import ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage;
import ru.ozon.app.android.composer.initialwidgets.DefaultInitialWidgetsProvider;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.atoms.af.pool.DefaultRecycledAtomPool;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0011\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0015\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/di/module/ComposerFragmentModule;", "", "<init>", "()V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "", "Ljava/lang/Class;", "LPc/a;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "configuratorProviders", "Lru/ozon/app/android/composer/configurator/storage/ComposerConfiguratorStorage;", "composerConfiguratorStorage", "", "providePageConfigurators", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/util/Map;Lru/ozon/app/android/composer/configurator/storage/ComposerConfiguratorStorage;)Ljava/util/List;", "LE00/a;", "interceptorsProviders", "provideEmptyStateFactory", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/util/Map;)LE00/a;", "LC00/a;", "providers", "provideInitialProviderFactory", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/util/Map;)LC00/a;", "LQZ/g;", "composerInterceptorsProviders", "", "provideComposerStateConfigurators", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Lru/ozon/app/android/composer/configurator/storage/ComposerConfiguratorStorage;Ljava/util/Map;)Ljava/util/Set;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "provideViewPool", "()Lfk0/c;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "provideAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerFragmentModule {
    @NotNull
    public final RecycledAtomPool provideAtomPool() {
        return new DefaultRecycledAtomPool();
    }

    @NotNull
    public final Set<g> provideComposerStateConfigurators(@NotNull ComposerScreenConfig config, @NotNull ComposerConfiguratorStorage composerConfiguratorStorage, @NotNull Map<Class<?>, a<g>> composerInterceptorsProviders) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(composerConfiguratorStorage, "composerConfiguratorStorage");
        Intrinsics.checkNotNullParameter(composerInterceptorsProviders, "composerInterceptorsProviders");
        Set<g> interceptors = composerConfiguratorStorage.getInterceptors();
        Set<Class<? extends g>> interceptors2 = config.getInterceptors();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = interceptors2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add((g) ((a) U.e(composerInterceptorsProviders, (Class) it.next())).get());
        }
        return e0.f(interceptors, linkedHashSet);
    }

    @NotNull
    public final E00.a provideEmptyStateFactory(@NotNull ComposerScreenConfig config, @NotNull Map<Class<?>, a<E00.a>> interceptorsProviders) {
        E00.a aVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(interceptorsProviders, "interceptorsProviders");
        Class<? extends E00.a> composerEmptyStateScreenFactory = config.getComposerEmptyStateScreenFactory();
        if (composerEmptyStateScreenFactory == null) {
            composerEmptyStateScreenFactory = null;
        }
        a<E00.a> aVar2 = interceptorsProviders.get(composerEmptyStateScreenFactory);
        return (aVar2 == null || (aVar = aVar2.get()) == null) ? a.C0158a.a() : aVar;
    }

    @NotNull
    public final C00.a provideInitialProviderFactory(@NotNull ComposerScreenConfig config, @NotNull Map<Class<?>, Pc.a<C00.a>> providers) {
        C00.a aVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Class<? extends C00.a> initialWidgetsProvider = config.getInitialWidgetsProvider();
        if (initialWidgetsProvider == null) {
            initialWidgetsProvider = null;
        }
        Pc.a<C00.a> aVar2 = providers.get(initialWidgetsProvider);
        return (aVar2 == null || (aVar = aVar2.get()) == null) ? DefaultInitialWidgetsProvider.INSTANCE.getEMPTY_INSTANCE() : aVar;
    }

    @NotNull
    public final List<ComposerScreenConfig.PageConfigurator> providePageConfigurators(@NotNull ComposerScreenConfig config, @NotNull Map<Class<?>, Pc.a<ComposerScreenConfig.PageConfigurator>> configuratorProviders, @NotNull ComposerConfiguratorStorage composerConfiguratorStorage) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(configuratorProviders, "configuratorProviders");
        Intrinsics.checkNotNullParameter(composerConfiguratorStorage, "composerConfiguratorStorage");
        Set<Class<? extends ComposerScreenConfig.PageConfigurator>> configurators = config.getConfigurators();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = configurators.iterator();
        while (it.hasNext()) {
            Pc.a<ComposerScreenConfig.PageConfigurator> aVar = configuratorProviders.get((Class) it.next());
            if (aVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList.add(aVar.get());
        }
        Pc.a<ComposerScreenConfig.PageConfigurator> aVar2 = configuratorProviders.get(RefreshByResultConfigurator.class);
        if (aVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        arrayList.add(aVar2.get());
        arrayList.addAll(composerConfiguratorStorage.getConfigurators(config));
        return arrayList;
    }

    @NotNull
    public final c provideViewPool() {
        return new c();
    }
}
