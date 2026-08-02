package ru.ozon.app.android.mediaupload.di.factory;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.chunks.ChunksUploader;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\ba\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/mediaupload/di/factory/ChunksUploaderFactory;", "", "create", "Lru/ozon/app/android/mediaupload/video/chunks/ChunksUploader;", "uploadingId", "", "uploadProcessId", "fileUri", "Landroid/net/Uri;", "fileSize", "", "isRetry", "", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChunksUploaderFactory {
    @NotNull
    ChunksUploader create(@NotNull String uploadingId, @NotNull String uploadProcessId, @NotNull Uri fileUri, long fileSize, boolean isRetry);
}
