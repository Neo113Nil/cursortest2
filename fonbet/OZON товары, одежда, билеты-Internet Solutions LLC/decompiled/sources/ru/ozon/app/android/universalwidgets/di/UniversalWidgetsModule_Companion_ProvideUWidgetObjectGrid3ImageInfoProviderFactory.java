package ru.ozon.app.android.universalwidgets.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalGrid3ImagePrefetchInfoProvider;

/* loaded from: classes2.dex */
public final class UniversalWidgetsModule_Companion_ProvideUWidgetObjectGrid3ImageInfoProviderFactory implements e<UniversalGrid3ImagePrefetchInfoProvider> {

    private static final class InstanceHolder {
        private static final UniversalWidgetsModule_Companion_ProvideUWidgetObjectGrid3ImageInfoProviderFactory INSTANCE = new UniversalWidgetsModule_Companion_ProvideUWidgetObjectGrid3ImageInfoProviderFactory();
    }

    public static UniversalWidgetsModule_Companion_ProvideUWidgetObjectGrid3ImageInfoProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UniversalGrid3ImagePrefetchInfoProvider provideUWidgetObjectGrid3ImageInfoProvider() {
        UniversalGrid3ImagePrefetchInfoProvider provideUWidgetObjectGrid3ImageInfoProvider = UniversalWidgetsModule.INSTANCE.provideUWidgetObjectGrid3ImageInfoProvider();
        j.d(provideUWidgetObjectGrid3ImageInfoProvider);
        return provideUWidgetObjectGrid3ImageInfoProvider;
    }

    @Override // Pc.a
    public UniversalGrid3ImagePrefetchInfoProvider get() {
        return provideUWidgetObjectGrid3ImageInfoProvider();
    }
}
