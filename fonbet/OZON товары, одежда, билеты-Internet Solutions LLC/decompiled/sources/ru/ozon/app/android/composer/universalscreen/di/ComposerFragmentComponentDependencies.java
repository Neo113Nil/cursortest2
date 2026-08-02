package ru.ozon.app.android.composer.universalscreen.di;

import Pc.a;
import QZ.g;
import hi.InterfaceC6958a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.universalscreen.view.ComposerComposeThemeWrapper;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\nH&¢\u0006\u0004\b\u0011\u0010\u000fJ%\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\nH&¢\u0006\u0004\b\u0013\u0010\u000fJ%\u0010\u0015\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\nH&¢\u0006\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/di/ComposerFragmentComponentDependencies;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerComposeThemeWrapper;", "getComposeThemeWrapper", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerComposeThemeWrapper;", "", "Lru/ozon/app/android/composer/di/Widget;", "getWidgets", "()Ljava/util/Set;", "", "Ljava/lang/Class;", "LPc/a;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getConfiguratorProviders", "()Ljava/util/Map;", "LE00/a;", "getEmptyStateInterceptors", "LC00/a;", "getInitialWidgetsProviders", "LQZ/g;", "getComposerStateConfiguratorProviders", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerFragmentComponentDependencies extends InterfaceC6958a {
    @NotNull
    ComposerComposeThemeWrapper getComposeThemeWrapper();

    @NotNull
    Map<Class<?>, a<g>> getComposerStateConfiguratorProviders();

    @NotNull
    Map<Class<?>, a<ComposerScreenConfig.PageConfigurator>> getConfiguratorProviders();

    @NotNull
    Map<Class<?>, a<E00.a>> getEmptyStateInterceptors();

    @NotNull
    Map<Class<?>, a<C00.a>> getInitialWidgetsProviders();

    @NotNull
    Set<Widget> getWidgets();
}
