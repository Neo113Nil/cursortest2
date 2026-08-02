package ru.ozon.app.android.debugmenu.analytics.ui.di;

import Jb.j;
import Pc.a;
import ru.ozon.app.android.analytics.AnalyticsCache;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationActivity;
import ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationActivity_MembersInjector;
import ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationViewModel;
import ru.ozon.app.android.debugmenu.analytics.ui.di.DataLayerRepresentationComponent;

/* loaded from: classes11.dex */
public final class DaggerDataLayerRepresentationComponent {

    private static final class DataLayerRepresentationComponentImpl implements DataLayerRepresentationComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final DataLayerRepresentationComponentImpl dataLayerRepresentationComponentImpl;
        private a<DataLayerRepresentationViewModel> dataLayerRepresentationViewModelProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final DataLayerRepresentationComponentImpl dataLayerRepresentationComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92496id;

            SwitchingProvider(DataLayerRepresentationComponentImpl dataLayerRepresentationComponentImpl, int i11) {
                this.dataLayerRepresentationComponentImpl = dataLayerRepresentationComponentImpl;
                this.f92496id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92496id != 0) {
                    throw new AssertionError(this.f92496id);
                }
                AnalyticsCache analyticsCache = this.dataLayerRepresentationComponentImpl.analyticsComponentApi.getAnalyticsCache();
                j.c(analyticsCache);
                return (T) new DataLayerRepresentationViewModel(analyticsCache);
            }
        }

        /* synthetic */ DataLayerRepresentationComponentImpl(AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(analyticsComponentApi);
        }

        private void initialize(AnalyticsComponentApi analyticsComponentApi) {
            this.dataLayerRepresentationViewModelProvider = new SwitchingProvider(this.dataLayerRepresentationComponentImpl, 0);
        }

        private DataLayerRepresentationActivity injectDataLayerRepresentationActivity(DataLayerRepresentationActivity dataLayerRepresentationActivity) {
            DataLayerRepresentationActivity_MembersInjector.injectPViewModel(dataLayerRepresentationActivity, this.dataLayerRepresentationViewModelProvider);
            return dataLayerRepresentationActivity;
        }

        @Override // ru.ozon.app.android.debugmenu.analytics.ui.di.DataLayerRepresentationComponent
        public void inject(DataLayerRepresentationActivity dataLayerRepresentationActivity) {
            injectDataLayerRepresentationActivity(dataLayerRepresentationActivity);
        }

        private DataLayerRepresentationComponentImpl(AnalyticsComponentApi analyticsComponentApi) {
            this.dataLayerRepresentationComponentImpl = this;
            this.analyticsComponentApi = analyticsComponentApi;
            initialize(analyticsComponentApi);
        }
    }

    private static final class Factory implements DataLayerRepresentationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.debugmenu.analytics.ui.di.DataLayerRepresentationComponent.Factory
        public DataLayerRepresentationComponent create(AnalyticsComponentApi analyticsComponentApi) {
            analyticsComponentApi.getClass();
            return new DataLayerRepresentationComponentImpl(analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static DataLayerRepresentationComponent.Factory factory() {
        return new Factory(0);
    }
}
