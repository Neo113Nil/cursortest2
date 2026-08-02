package ru.ozon.app.android.pdfviewer.presentation;

import B90.C2618u;
import Bc.e;
import Bc.i;
import Fy.C3065c;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.app.t;
import androidx.core.content.FileProvider;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.pdfviewer.data.FileDownloaderRepository;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepository;", "fileDownloaderRepository", "<init>", "(Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepository;)V", "Ljava/io/File;", "file", "Landroid/app/Activity;", "activity", "", "openFile", "(Ljava/io/File;Landroid/app/Activity;)V", "Landroid/net/Uri;", "uri", "Landroid/content/Context;", "context", "", "getMimeType", "(Landroid/net/Uri;Landroid/content/Context;)Ljava/lang/String;", "onCleared", "()V", ImagesContract.URL, "", "ignoreAuthoriseToken", "useExternalStorage", "extension", "downloadFile", "(Ljava/lang/String;ZLandroid/app/Activity;ZLjava/lang/String;)V", "Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action;", "singleAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSingleAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Action", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FileDownloaderViewModel extends w0 {

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final FileDownloaderRepository fileDownloaderRepository;

    @NotNull
    private final SingleLiveEvent<Action> singleAction;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action;", "", "<init>", "()V", "Loaded", "Loading", "DownloadError", "NoArchiveProgramError", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action$DownloadError;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action$Loaded;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action$Loading;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action$NoArchiveProgramError;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action$DownloadError;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DownloadError extends Action {

            @NotNull
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DownloadError(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DownloadError) && Intrinsics.d(this.error, ((DownloadError) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return D40.a.c("DownloadError(error=", ")", this.error);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action$Loaded;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loaded extends Action {

            @NotNull
            private final File file;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Loaded(@NotNull File file) {
                super(null);
                Intrinsics.checkNotNullParameter(file, "file");
                this.file = file;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loaded) && Intrinsics.d(this.file, ((Loaded) other).file);
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
                return "Loaded(file=" + this.file + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action$Loading;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShow", "()Z", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action$NoArchiveProgramError;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoArchiveProgramError extends Action {

            @NotNull
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoArchiveProgramError(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoArchiveProgramError) && Intrinsics.d(this.error, ((NoArchiveProgramError) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return D40.a.c("NoArchiveProgramError(error=", ")", this.error);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public FileDownloaderViewModel(@NotNull FileDownloaderRepository fileDownloaderRepository) {
        Intrinsics.checkNotNullParameter(fileDownloaderRepository, "fileDownloaderRepository");
        this.fileDownloaderRepository = fileDownloaderRepository;
        this.singleAction = new SingleLiveEvent<>();
        this.compositeDisposable = new C8486a();
    }

    public static /* synthetic */ void downloadFile$default(FileDownloaderViewModel fileDownloaderViewModel, String str, boolean z11, Activity activity, boolean z12, String str2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        boolean z13 = z12;
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        fileDownloaderViewModel.downloadFile(str, z11, activity, z13, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$1(FileDownloaderViewModel fileDownloaderViewModel) {
        fileDownloaderViewModel.singleAction.setValue(new Action.Loading(false));
    }

    private final String getMimeType(Uri uri, Context context) {
        if ("content".equals(uri.getScheme())) {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            return contentResolver.getType(uri);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.f(fileExtensionFromUrl);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openFile(File file, Activity activity) {
        String mimeType = getMimeType(Uri.fromFile(file), activity);
        Uri d11 = FileProvider.d(activity, activity.getPackageName() + ".fileprovider", file);
        t.a aVar = new t.a(activity);
        aVar.g(String.valueOf(mimeType));
        aVar.e(d11);
        aVar.c(R$string.file_downloader_choose_program_title_android);
        Intent addFlags = aVar.a().addFlags(1);
        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(d11.toString());
        if (h.D(fileExtensionFromUrl, "zip", true) || h.D(fileExtensionFromUrl, "rar", true) || h.D(fileExtensionFromUrl, "pdf", true)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(d11, mimeType);
            intent.addFlags(1);
            int i11 = 0;
            List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            ArrayList arrayList = new ArrayList();
            int size = queryIntentActivities.size();
            int i12 = 0;
            while (i12 < size) {
                ResolveInfo resolveInfo = queryIntentActivities.get(i12);
                String str = resolveInfo.activityInfo.packageName;
                intent.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
                intent.setAction("android.intent.action.VIEW");
                intent.setDataAndType(d11, mimeType);
                intent.addFlags(1);
                arrayList.add(new LabeledIntent(intent, str, resolveInfo.loadLabel(activity.getPackageManager()), resolveInfo.icon));
                i12++;
                i11 = 0;
            }
            addFlags.putExtra("android.intent.extra.INITIAL_INTENTS", (LabeledIntent[]) arrayList.toArray(new LabeledIntent[i11]));
        }
        try {
            activity.startActivity(addFlags);
        } catch (ActivityNotFoundException e11) {
            this.singleAction.setValue(new Action.NoArchiveProgramError(e11));
        }
    }

    public final void downloadFile(@NotNull String url, boolean ignoreAuthoriseToken, @NotNull Activity activity, boolean useExternalStorage, String extension) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(activity, "activity");
        RxExtKt.plusAssign(this.compositeDisposable, new e(new i(this.fileDownloaderRepository.downloadFile(url, ignoreAuthoriseToken, useExternalStorage, extension).j(Mc.a.b()).g(C8125a.a()), new DM.i(new FileDownloaderViewModel$downloadFile$1(this), 13)), new InterfaceC9019a() { // from class: nC.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                FileDownloaderViewModel.downloadFile$lambda$1(FileDownloaderViewModel.this);
            }
        }).h(new C3065c(new FileDownloaderViewModel$downloadFile$3(this, activity), 14), new Gy.a(new FileDownloaderViewModel$downloadFile$4(this), 9)));
    }

    @NotNull
    public final SingleLiveEvent<Action> getSingleAction() {
        return this.singleAction;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }
}
