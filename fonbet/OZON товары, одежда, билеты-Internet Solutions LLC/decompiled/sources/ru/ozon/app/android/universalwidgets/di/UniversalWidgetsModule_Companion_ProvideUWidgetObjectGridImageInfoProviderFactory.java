package ru.ozon.app.android.universalwidgets.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalObjectGridImagePrefetchInfoProvider;

/* loaded from: classes2.dex */
public final class UniversalWidgetsModule_Companion_ProvideUWidgetObjectGridImageInfoProviderFactory implements e<UniversalObjectGridImagePrefetchInfoProvider> {

    private static final class InstanceHolder {
        private static final UniversalWidgetsModule_Companion_ProvideUWidgetObjectGridImageInfoProviderFactory INSTANCE = new UniversalWidgetsModule_Companion_ProvideUWidgetObjectGridImageInfoProviderFactory();
    }

    public static UniversalWidgetsModule_Companion_ProvideUWidgetObjectGridImageInfoProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UniversalObjectGridImagePrefetchInfoProvider provideUWidgetObjectGridImageInfoProvider() {
        UniversalObjectGridImagePrefetchInfoProvider provideUWidgetObjectGridImageInfoProvider = UniversalWidgetsModule.INSTANCE.provideUWidgetObjectGridImageInfoProvider();
        j.d(provideUWidgetObjectGridImageInfoProvider);
        return provideUWidgetObjectGridImageInfoProvider;
    }

    @Override // Pc.a
    public UniversalObjectGridImagePrefetchInfoProvider get() {
        return provideUWidgetObjectGridImageInfoProvider();
    }
}
