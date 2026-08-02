package ru.ozon.app.android.pdfviewer.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdfviewer.FileDownloaderApi;
import ru.ozon.app.android.pdfviewer.data.FileDownloaderRepository;
import ru.ozon.app.android.pdfviewer.data.FileDownloaderRepositoryImpl;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponent;
import ru.ozon.app.android.pdfviewer.di.module.FileDownloaderModule_Companion_ProvideFileDownloaderApiFactory;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.pdfviewer.presentation.PdfViewerFragment;
import ru.ozon.app.android.pdfviewer.presentation.PdfViewerFragment_MembersInjector;
import ru.ozon.app.android.pdfviewer.presentation.PdfViewerViewModel;

/* loaded from: classes6.dex */
public final class DaggerPdfFileComponent {

    private static final class Factory implements PdfFileComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.pdfviewer.di.PdfFileComponent.Factory
        public PdfFileComponent create(ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            contextComponentDependencies.getClass();
            analyticsComponentApi.getClass();
            networkComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new PdfFileComponentImpl(0, analyticsComponentApi, analyticsScreenStorageComponentApi, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    private static final class PdfFileComponentImpl implements PdfFileComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<FileDownloaderRepository> bindFileDownloaderRepositoryProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<FileDownloaderRepositoryImpl> fileDownloaderRepositoryImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private final PdfFileComponentImpl pdfFileComponentImpl;
        private a<PdfViewerViewModel> pdfViewerViewModelProvider;
        private a<FileDownloaderApi> provideFileDownloaderApiProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93012id;
            private final PdfFileComponentImpl pdfFileComponentImpl;

            SwitchingProvider(PdfFileComponentImpl pdfFileComponentImpl, int i11) {
                this.pdfFileComponentImpl = pdfFileComponentImpl;
                this.f93012id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93012id;
                if (i11 == 0) {
                    Context context = this.pdfFileComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) new FileDownloaderRepositoryImpl(context, (FileDownloaderApi) this.pdfFileComponentImpl.provideFileDownloaderApiProvider.get());
                }
                if (i11 == 1) {
                    Retrofit retrofit = this.pdfFileComponentImpl.networkComponentApi.getRetrofit();
                    j.c(retrofit);
                    return (T) FileDownloaderModule_Companion_ProvideFileDownloaderApiFactory.provideFileDownloaderApi(retrofit);
                }
                if (i11 != 2) {
                    throw new AssertionError(this.f93012id);
                }
                FileDownloaderRepository fileDownloaderRepository = (FileDownloaderRepository) this.pdfFileComponentImpl.bindFileDownloaderRepositoryProvider.get();
                PerformanceTrackerDelegate performanceTrackerDelegate = this.pdfFileComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                j.c(performanceTrackerDelegate);
                Sg.a analyticsScreenStorage = this.pdfFileComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                j.c(analyticsScreenStorage);
                return (T) new PdfViewerViewModel(fileDownloaderRepository, performanceTrackerDelegate, analyticsScreenStorage);
            }
        }

        /* synthetic */ PdfFileComponentImpl(int i11, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(contextComponentDependencies, analyticsComponentApi, networkComponentApi, analyticsScreenStorageComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.provideFileDownloaderApiProvider = d.b(new SwitchingProvider(this.pdfFileComponentImpl, 1));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.pdfFileComponentImpl, 0);
            this.fileDownloaderRepositoryImplProvider = switchingProvider;
            this.bindFileDownloaderRepositoryProvider = d.b(switchingProvider);
            this.pdfViewerViewModelProvider = new SwitchingProvider(this.pdfFileComponentImpl, 2);
        }

        private PdfViewerFragment injectPdfViewerFragment(PdfViewerFragment pdfViewerFragment) {
            PdfViewerFragment_MembersInjector.injectPViewModel(pdfViewerFragment, d.a(this.pdfViewerViewModelProvider));
            return pdfViewerFragment;
        }

        @Override // ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi
        public FileDownloaderViewModel getFileDownloaderViewModel() {
            return new FileDownloaderViewModel(this.bindFileDownloaderRepositoryProvider.get());
        }

        @Override // ru.ozon.app.android.pdfviewer.di.PdfFileComponent
        public void inject(PdfViewerFragment pdfViewerFragment) {
            injectPdfViewerFragment(pdfViewerFragment);
        }

        private PdfFileComponentImpl(ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.pdfFileComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(contextComponentDependencies, analyticsComponentApi, networkComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    public static PdfFileComponent.Factory factory() {
        return new Factory(0);
    }
}
