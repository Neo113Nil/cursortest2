package ru.ozon.app.android.debugmenu.debugwidgets.di;

import Jb.j;
import ru.ozon.app.android.composer.di.ComposerPerformanceComponentApi;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractor;
import ru.ozon.app.android.debugmenu.debugwidgets.WidgetsDebugToolsActivity;
import ru.ozon.app.android.debugmenu.debugwidgets.WidgetsDebugToolsActivity_MembersInjector;
import ru.ozon.app.android.debugmenu.debugwidgets.di.WidgetsDebugComponent;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes11.dex */
public final class DaggerWidgetsDebugComponent {

    private static final class Factory implements WidgetsDebugComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.debugmenu.debugwidgets.di.WidgetsDebugComponent.Factory
        public WidgetsDebugComponent create(ComposerPerformanceComponentApi composerPerformanceComponentApi, StorageComponentApi storageComponentApi) {
            composerPerformanceComponentApi.getClass();
            storageComponentApi.getClass();
            return new WidgetsDebugComponentImpl(composerPerformanceComponentApi, storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class WidgetsDebugComponentImpl implements WidgetsDebugComponent {
        private final ComposerPerformanceComponentApi composerPerformanceComponentApi;
        private final StorageComponentApi storageComponentApi;
        private final WidgetsDebugComponentImpl widgetsDebugComponentImpl;

        /* synthetic */ WidgetsDebugComponentImpl(ComposerPerformanceComponentApi composerPerformanceComponentApi, StorageComponentApi storageComponentApi, int i11) {
            this(composerPerformanceComponentApi, storageComponentApi);
        }

        private WidgetsDebugToolsActivity injectWidgetsDebugToolsActivity(WidgetsDebugToolsActivity widgetsDebugToolsActivity) {
            WidgetsDebugToolsInteractor widgetsDebugToolsInteractor = this.composerPerformanceComponentApi.getWidgetsDebugToolsInteractor();
            j.c(widgetsDebugToolsInteractor);
            WidgetsDebugToolsActivity_MembersInjector.injectInteractor(widgetsDebugToolsActivity, widgetsDebugToolsInteractor);
            DebugToolsStorage debugToolsStorage = this.storageComponentApi.getDebugToolsStorage();
            j.c(debugToolsStorage);
            WidgetsDebugToolsActivity_MembersInjector.injectDebugToolsStorage(widgetsDebugToolsActivity, debugToolsStorage);
            return widgetsDebugToolsActivity;
        }

        @Override // ru.ozon.app.android.debugmenu.debugwidgets.di.WidgetsDebugComponent
        public void inject(WidgetsDebugToolsActivity widgetsDebugToolsActivity) {
            injectWidgetsDebugToolsActivity(widgetsDebugToolsActivity);
        }

        private WidgetsDebugComponentImpl(ComposerPerformanceComponentApi composerPerformanceComponentApi, StorageComponentApi storageComponentApi) {
            this.widgetsDebugComponentImpl = this;
            this.composerPerformanceComponentApi = composerPerformanceComponentApi;
            this.storageComponentApi = storageComponentApi;
        }
    }

    public static WidgetsDebugComponent.Factory factory() {
        return new Factory(0);
    }
}
