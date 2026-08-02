package ru.ozon.app.android.pdfviewer.data;

import Bc.r;
import IJ.a;
import Sh.b;
import We.C;
import We.M;
import android.content.Context;
import android.os.Environment;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdfviewer.FileDownloaderApi;
import sf.F;
import sf.InterfaceC9683i;
import sf.z;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepositoryImpl;", "Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepository;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdfviewer/FileDownloaderApi;", "fileDownloaderApi", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdfviewer/FileDownloaderApi;)V", "LWe/M;", "body", "", "useExternalStorage", "", "explicitExtension", "Ljava/io/File;", "saveToFile", "(LWe/M;ZLjava/lang/String;)Ljava/io/File;", "extension", "createFileInExternalDir", "(Ljava/lang/String;)Ljava/io/File;", "createCacheFile", ImagesContract.URL, "ignoreAuthoriseToken", "Lio/reactivex/y;", "downloadFile", "(Ljava/lang/String;ZZLjava/lang/String;)Lio/reactivex/y;", "Landroid/content/Context;", "Lru/ozon/app/android/pdfviewer/FileDownloaderApi;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FileDownloaderRepositoryImpl implements FileDownloaderRepository {

    @NotNull
    private final Context context;

    @NotNull
    private final FileDownloaderApi fileDownloaderApi;
    public static final int $stable = 8;

    public FileDownloaderRepositoryImpl(@NotNull Context context, @NotNull FileDownloaderApi fileDownloaderApi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileDownloaderApi, "fileDownloaderApi");
        this.context = context;
        this.fileDownloaderApi = fileDownloaderApi;
    }

    private final File createCacheFile(String extension) {
        File file = new File(this.context.getCacheDir(), "docs");
        File file2 = !file.exists() ? file : null;
        if (file2 != null) {
            file2.mkdir();
        }
        File createTempFile = File.createTempFile("temp", "." + extension, file);
        Intrinsics.checkNotNullExpressionValue(createTempFile, "let(...)");
        return createTempFile;
    }

    private final File createFileInExternalDir(String extension) {
        File file = new File(this.context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), b.c("temp-", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).format(Calendar.getInstance(TimeZone.getDefault()).getTime()), ".", extension));
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File downloadFile$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (File) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File saveToFile(M body, boolean useExternalStorage, String explicitExtension) {
        C contentType = body.contentType();
        if ((!h.D(contentType != null ? contentType.d() : null, "octet-stream", true) || explicitExtension == null) && (contentType == null || (explicitExtension = contentType.d()) == null)) {
            explicitExtension = "tmp";
        }
        File createFileInExternalDir = useExternalStorage ? createFileInExternalDir(explicitExtension) : createCacheFile(explicitExtension);
        InterfaceC9683i source = body.source();
        try {
            F c11 = z.c(z.h(createFileInExternalDir));
            try {
                c11.y0(source);
                c11.flush();
                Unit unit = Unit.f71690a;
                c11.close();
                source.close();
                return createFileInExternalDir;
            } finally {
            }
        } finally {
        }
    }

    @Override // ru.ozon.app.android.pdfviewer.data.FileDownloaderRepository
    @NotNull
    public y<File> downloadFile(@NotNull String url, boolean ignoreAuthoriseToken, boolean useExternalStorage, String extension) {
        Intrinsics.checkNotNullParameter(url, "url");
        y<M> downloadFile = this.fileDownloaderApi.downloadFile(url, ignoreAuthoriseToken);
        a aVar = new a(new FileDownloaderRepositoryImpl$downloadFile$1(this, useExternalStorage, extension), 9);
        downloadFile.getClass();
        r rVar = new r(downloadFile, aVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
