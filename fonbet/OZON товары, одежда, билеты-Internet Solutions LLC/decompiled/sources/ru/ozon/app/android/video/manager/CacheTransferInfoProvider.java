package ru.ozon.app.android.video.manager;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p3.z;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00060\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "Lp3/z;", "", "Lru/ozon/app/android/video/player/performance/metricsManager/BaseVideoUrl;", "baseUrl", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "getCachedUrlsByBaseUrl", "(Ljava/lang/String;)Ljava/util/Set;", "", "removeCacheByBaseUrl", "(Ljava/lang/String;)V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CacheTransferInfoProvider extends z {
    @NotNull
    Set<String> getCachedUrlsByBaseUrl(@NotNull String baseUrl);

    void removeCacheByBaseUrl(@NotNull String baseUrl);
}
