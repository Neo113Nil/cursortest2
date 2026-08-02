package ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.di;

import By.C2677a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data.TravelCompanyDocumentsMapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/di/TravelCompanyDocumentsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsMapper;", "mapper", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "getFileDownloaderViewModel", "()Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "fileDownloaderViewModel", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TravelCompanyDocumentsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/di/TravelCompanyDocumentsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/di/TravelCompanyDocumentsComponent;", "create", "(Lk20/g;)Lk20/e;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TravelCompanyDocumentsComponent create$lambda$0(final C7475g c7475g) {
            return new TravelCompanyDocumentsComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.di.TravelCompanyDocumentsComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(TravelCompanyDocumentsComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final PdfFileComponentApi pdfFileComponentApi;

                {
                    this.pdfFileComponentApi = (PdfFileComponentApi) c7475g.getComponent(PdfFileComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.di.TravelCompanyDocumentsComponent
                public FileDownloaderViewModel getFileDownloaderViewModel() {
                    return this.pdfFileComponentApi.getFileDownloaderViewModel();
                }

                @Override // ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.di.TravelCompanyDocumentsComponent
                public TravelCompanyDocumentsMapper getMapper() {
                    return (TravelCompanyDocumentsMapper) this.mapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<TravelCompanyDocumentsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TravelCompanyDocumentsComponent.class), new C2677a(storage, 7));
        }
    }

    @NotNull
    FileDownloaderViewModel getFileDownloaderViewModel();

    @NotNull
    TravelCompanyDocumentsMapper getMapper();
}
