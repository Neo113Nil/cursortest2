package ru.ozon.app.android.video.manager;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.download.DownloadListener;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/video/manager/ExoManagerWithCache;", "Lru/ozon/app/android/video/manager/ExoManager;", "", "videoUrl", "Lru/ozon/app/android/video/download/DownloadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "downloadVideo", "(Ljava/lang/String;Lru/ozon/app/android/video/download/DownloadListener;)V", "removeListener", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ExoManagerWithCache extends ExoManager {
    void downloadVideo(@NotNull String videoUrl, @NotNull DownloadListener listener);

    void removeListener(@NotNull String videoUrl, @NotNull DownloadListener listener);
}
