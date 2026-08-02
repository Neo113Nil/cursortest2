package ru.ozon.app.android.pdfviewer.presentation;

import B90.C2618u;
import Bc.e;
import Bc.i;
import Bc.j;
import Bc.o;
import android.net.Uri;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.pdfviewer.data.FileDownloaderRepository;
import ru.ozon.app.android.pdfviewer.presentation.PdfViewerViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import u2.C9923b;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 )2\u00020\u0001:\u0002)*B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepository;", "fileDownloaderRepository", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepository;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LSg/a;)V", "", "", "isFileUrl", "(Ljava/lang/String;)Z", "", "onCleared", "()V", ImagesContract.URL, "ignoreAuthoriseToken", "openUrl", "(Ljava/lang/String;Z)V", "Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepository;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LSg/a;", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action;", "singleAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSingleAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Companion", "Action", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdfViewerViewModel extends w0 {

    @NotNull
    private final Sg.a analyticsScreenStorage;

    @NotNull
    private final C8486a compositeDisposable;
    private File file;

    @NotNull
    private final FileDownloaderRepository fileDownloaderRepository;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final SingleLiveEvent<Action> singleAction;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action;", "", "<init>", "()V", "Success", "Loading", "Error", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action$Error;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action$Loading;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action$Success;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action$Error;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.error, ((Error) other).error);
            }

            @NotNull
            public final Throwable getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return D40.a.c("Error(error=", ")", this.error);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action$Loading;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShow", "()Z", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends Action {
            private final boolean show;

            public Loading(boolean z11) {
                super(null);
                this.show = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && this.show == ((Loading) other).show;
            }

            public final boolean getShow() {
                return this.show;
            }

            public int hashCode() {
                return Boolean.hashCode(this.show);
            }

            @NotNull
            public String toString() {
                return C2618u.g("Loading(show=", ")", this.show);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action$Success;", "Lru/ozon/app/android/pdfviewer/presentation/PdfViewerViewModel$Action;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {

            @NotNull
            private final File file;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull File file) {
                super(null);
                Intrinsics.checkNotNullParameter(file, "file");
                this.file = file;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.file, ((Success) other).file);
            }

            @NotNull
            public final File getFile() {
                return this.file;
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(file=" + this.file + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public PdfViewerViewModel(@NotNull FileDownloaderRepository fileDownloaderRepository, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull Sg.a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(fileDownloaderRepository, "fileDownloaderRepository");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.fileDownloaderRepository = fileDownloaderRepository;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.singleAction = new SingleLiveEvent<>();
        this.compositeDisposable = new C8486a();
        analyticsScreenStorage.c();
    }

    private final boolean isFileUrl(String str) {
        return h.e0(str, "file:", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File openUrl$lambda$0(String str) {
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return C9923b.a(parse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openUrl$lambda$4(PdfViewerViewModel pdfViewerViewModel) {
        pdfViewerViewModel.singleAction.setValue(new Action.Loading(false));
    }

    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final SingleLiveEvent<Action> getSingleAction() {
        return this.singleAction;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
        this.file = null;
    }

    public final void openUrl(@NotNull final String url, boolean ignoreAuthoriseToken) {
        y hVar;
        Intrinsics.checkNotNullParameter(url, "url");
        if (isFileUrl(url)) {
            hVar = new o(new Callable() { // from class: nC.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File openUrl$lambda$0;
                    openUrl$lambda$0 = PdfViewerViewModel.openUrl$lambda$0(url);
                    return openUrl$lambda$0;
                }
            });
        } else {
            y downloadFile$default = FileDownloaderRepository.DefaultImpls.downloadFile$default(this.fileDownloaderRepository, url, ignoreAuthoriseToken, false, "pdf", 4, null);
            BO.b bVar = new BO.b(PdfViewerViewModel$openUrl$fileResource$2.INSTANCE, 10);
            downloadFile$default.getClass();
            hVar = new Bc.h(new j(downloadFile$default, bVar), new GJ.a(new PdfViewerViewModel$openUrl$fileResource$3(this, url), 7));
        }
        RxExtKt.plusAssign(this.compositeDisposable, new j(new e(new i(hVar.j(Mc.a.b()).g(C8125a.a()), new GJ.b(new PdfViewerViewModel$openUrl$1(this), 4)), new InterfaceC9019a() { // from class: nC.f
            @Override // qc.InterfaceC9019a
            public final void run() {
                PdfViewerViewModel.openUrl$lambda$4(PdfViewerViewModel.this);
            }
        }), new IJ.a(new PdfViewerViewModel$openUrl$3(this), 10)).h(new HX.a(new PdfViewerViewModel$openUrl$4(this), 7), new AA.a(new PdfViewerViewModel$openUrl$5(this), 8)));
    }

    public final void setFile(File file) {
        this.file = file;
    }
}
