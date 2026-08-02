package ru.ozon.app.android.pdfviewer.data;

import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdfviewer/data/FileDownloaderRepository;", "", "", ImagesContract.URL, "", "ignoreAuthoriseToken", "useExternalStorage", "extension", "Lio/reactivex/y;", "Ljava/io/File;", "downloadFile", "(Ljava/lang/String;ZZLjava/lang/String;)Lio/reactivex/y;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FileDownloaderRepository {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ y downloadFile$default(FileDownloaderRepository fileDownloaderRepository, String str, boolean z11, boolean z12, String str2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadFile");
            }
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            return fileDownloaderRepository.downloadFile(str, z11, z12, str2);
        }
    }

    @NotNull
    y<File> downloadFile(@NotNull String url, boolean ignoreAuthoriseToken, boolean useExternalStorage, String extension);
}
