package ru.ozon.app.android.universalwidgets.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalObjectGridOneSingleItemBannerImageSizeProvider;

/* loaded from: classes2.dex */
public final class UniversalWidgetsModule_Companion_ProvideUWidgetObjectBannerImageInfoProviderFactory implements e<UniversalObjectGridOneSingleItemBannerImageSizeProvider> {

    private static final class InstanceHolder {
        private static final UniversalWidgetsModule_Companion_ProvideUWidgetObjectBannerImageInfoProviderFactory INSTANCE = new UniversalWidgetsModule_Companion_ProvideUWidgetObjectBannerImageInfoProviderFactory();
    }

    public static UniversalWidgetsModule_Companion_ProvideUWidgetObjectBannerImageInfoProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UniversalObjectGridOneSingleItemBannerImageSizeProvider provideUWidgetObjectBannerImageInfoProvider() {
        UniversalObjectGridOneSingleItemBannerImageSizeProvider provideUWidgetObjectBannerImageInfoProvider = UniversalWidgetsModule.INSTANCE.provideUWidgetObjectBannerImageInfoProvider();
        j.d(provideUWidgetObjectBannerImageInfoProvider);
        return provideUWidgetObjectBannerImageInfoProvider;
    }

    @Override // Pc.a
    public UniversalObjectGridOneSingleItemBannerImageSizeProvider get() {
        return provideUWidgetObjectBannerImageInfoProvider();
    }
}
