package ru.ozon.app.android.analytics.startup.time.di;

import Jb.d;
import Pc.a;
import Xh0.c;
import ru.ozon.app.android.analytics.startup.CompilationProfileStatusDelegate;
import ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListener;
import ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListenerImpl;
import ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponent;
import ru.ozon.app.android.analytics.startup.time.di.module.StartupTimeTrackerModule_Companion_ProvideStartupTimeTrackerFactory;

/* loaded from: classes6.dex */
public final class DaggerStartupTimeTrackerComponent {

    private static final class Factory implements StartupTimeTrackerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        private Factory() {
        }

        @Override // ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponent.Factory
        public StartupTimeTrackerComponent create() {
            return new StartupTimeTrackerComponentImpl(0);
        }
    }

    private static final class StartupTimeTrackerComponentImpl implements StartupTimeTrackerComponent {
        private a<ComposerPageLoadingListener> bindComposerPageLoadingListenerProvider;
        private a<ComposerPageLoadingListenerImpl> composerPageLoadingListenerImplProvider;
        private a<c> provideStartupTimeTrackerProvider;
        private final StartupTimeTrackerComponentImpl startupTimeTrackerComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92162id;
            private final StartupTimeTrackerComponentImpl startupTimeTrackerComponentImpl;

            SwitchingProvider(StartupTimeTrackerComponentImpl startupTimeTrackerComponentImpl, int i11) {
                this.startupTimeTrackerComponentImpl = startupTimeTrackerComponentImpl;
                this.f92162id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92162id;
                if (i11 == 0) {
                    return (T) StartupTimeTrackerModule_Companion_ProvideStartupTimeTrackerFactory.provideStartupTimeTracker();
                }
                if (i11 == 1) {
                    return (T) new ComposerPageLoadingListenerImpl((c) this.startupTimeTrackerComponentImpl.provideStartupTimeTrackerProvider.get(), new CompilationProfileStatusDelegate());
                }
                throw new AssertionError(this.f92162id);
            }
        }

        /* synthetic */ StartupTimeTrackerComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.provideStartupTimeTrackerProvider = d.b(new SwitchingProvider(this.startupTimeTrackerComponentImpl, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.startupTimeTrackerComponentImpl, 1);
            this.composerPageLoadingListenerImplProvider = switchingProvider;
            this.bindComposerPageLoadingListenerProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi
        public ComposerPageLoadingListener getComposerPageLoadingListener() {
            return this.bindComposerPageLoadingListenerProvider.get();
        }

        @Override // ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi
        public c getStartupTimeTracker() {
            return this.provideStartupTimeTrackerProvider.get();
        }

        private StartupTimeTrackerComponentImpl() {
            this.startupTimeTrackerComponentImpl = this;
            initialize();
        }
    }

    public static StartupTimeTrackerComponent.Factory factory() {
        return new Factory(0);
    }
}
