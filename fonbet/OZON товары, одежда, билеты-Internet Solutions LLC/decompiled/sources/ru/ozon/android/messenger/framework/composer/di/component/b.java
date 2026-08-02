package ru.ozon.android.messenger.framework.composer.di.component;

import hi.InterfaceC6958a;
import java.util.Map;
import java.util.Set;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.configuration.f;

/* loaded from: classes6.dex */
public interface b extends InterfaceC6958a {
    @NotNull
    ru.ozon.android.messenger.framework.composer.navigation.router.c F();

    @NotNull
    ru.ozon.android.messenger.framework.navigation.d K();

    @NotNull
    ru.ozon.android.messenger.framework.composer.configuration.a getComposerConfiguratorStorage();

    @NotNull
    Map<Class<?>, Pc.a<f>> getConfiguratorProviders();

    @NotNull
    Map<Class<?>, Pc.a<E00.a>> getEmptyStateInterceptors();

    @NotNull
    Map<Class<?>, Pc.a<C00.a>> getInitialWidgetsProviders();

    @NotNull
    Set<i> getWidgets();

    @NotNull
    ru.ozon.android.messenger.framework.composer.navigation.config.c p();
}
