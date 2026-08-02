package ru.ozon.app.android.fresh.feature.b2b.di;

import Jb.j;
import Jb.m;
import Pc.a;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.fresh.feature.b2b.di.AccompanyingDocsDownloadingComponent;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;

/* loaded from: classes12.dex */
public final class DaggerAccompanyingDocsDownloadingComponent {

    private static final class AccompanyingDocsDownloadingComponentImpl implements AccompanyingDocsDownloadingComponent {
        private final AccompanyingDocsDownloadingComponentImpl accompanyingDocsDownloadingComponentImpl;
        private a<FileDownloaderViewModel> getFileDownloaderViewModelProvider;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private final PdfFileComponentApi pdfFileComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AccompanyingDocsDownloadingComponentImpl accompanyingDocsDownloadingComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92612id;

            SwitchingProvider(AccompanyingDocsDownloadingComponentImpl accompanyingDocsDownloadingComponentImpl, int i11) {
                this.accompanyingDocsDownloadingComponentImpl = accompanyingDocsDownloadingComponentImpl;
                this.f92612id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92612id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return (T) new HandlersInhibitor();
                    }
                    throw new AssertionError(this.f92612id);
                }
                T t2 = (T) this.accompanyingDocsDownloadingComponentImpl.pdfFileComponentApi.getFileDownloaderViewModel();
                j.c(t2);
                return t2;
            }
        }

        /* synthetic */ AccompanyingDocsDownloadingComponentImpl(PdfFileComponentApi pdfFileComponentApi, int i11) {
            this(pdfFileComponentApi);
        }

        private void initialize(PdfFileComponentApi pdfFileComponentApi) {
            this.getFileDownloaderViewModelProvider = new SwitchingProvider(this.accompanyingDocsDownloadingComponentImpl, 0);
            this.handlersInhibitorProvider = m.a(new SwitchingProvider(this.accompanyingDocsDownloadingComponentImpl, 1));
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.di.AccompanyingDocsDownloadingComponent
        public a<FileDownloaderViewModel> getFileDownloaderViewModelProvider() {
            return this.getFileDownloaderViewModelProvider;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.di.AccompanyingDocsDownloadingComponent
        public HandlersInhibitor getHandlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        private AccompanyingDocsDownloadingComponentImpl(PdfFileComponentApi pdfFileComponentApi) {
            this.accompanyingDocsDownloadingComponentImpl = this;
            this.pdfFileComponentApi = pdfFileComponentApi;
            initialize(pdfFileComponentApi);
        }
    }

    private static final class Factory implements AccompanyingDocsDownloadingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.di.AccompanyingDocsDownloadingComponent.Factory
        public AccompanyingDocsDownloadingComponent create(PdfFileComponentApi pdfFileComponentApi) {
            pdfFileComponentApi.getClass();
            return new AccompanyingDocsDownloadingComponentImpl(pdfFileComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AccompanyingDocsDownloadingComponent.Factory factory() {
        return new Factory(0);
    }
}
