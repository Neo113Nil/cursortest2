package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentsApi;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentWidgetViewModel;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/di/ReportDocumentComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/di/ReportDocumentComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/pdfviewer/di/PdfFileComponentApi;", "pdfFileComponentApi", "Lru/ozon/app/android/pdfviewer/di/PdfFileComponentApi;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsApi;", "kotlin.jvm.PlatformType", "reportDocumentApi$delegate", "LSc/j;", "getReportDocumentApi", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsApi;", "reportDocumentApi", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel;", "widgetViewModelProvider$delegate", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "getFileDownloaderViewModel", "()Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "fileDownloaderViewModel", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportDocumentComponent$Companion$create$1$1 implements ReportDocumentComponent {
    private final NetworkComponentApi networkComponentApi;
    private final PdfFileComponentApi pdfFileComponentApi;

    /* renamed from: reportDocumentApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j reportDocumentApi = k.b(new ReportDocumentComponent$Companion$create$1$1$reportDocumentApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ReportDocumentComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: widgetViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j widgetViewModelProvider = k.b(new ReportDocumentComponent$Companion$create$1$1$widgetViewModelProvider$2(this));

    ReportDocumentComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.pdfFileComponentApi = (PdfFileComponentApi) c7475g.getComponent(PdfFileComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReportDocumentsApi getReportDocumentApi() {
        return (ReportDocumentsApi) this.reportDocumentApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.di.ReportDocumentComponent
    public FileDownloaderViewModel getFileDownloaderViewModel() {
        return this.pdfFileComponentApi.getFileDownloaderViewModel();
    }

    @Override // ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.di.ReportDocumentComponent
    public ReportDocumentMapper getMapper() {
        return (ReportDocumentMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.di.ReportDocumentComponent
    public Pc.a<ReportDocumentWidgetViewModel> getWidgetViewModelProvider() {
        return (Pc.a) this.widgetViewModelProvider.getValue();
    }
}
