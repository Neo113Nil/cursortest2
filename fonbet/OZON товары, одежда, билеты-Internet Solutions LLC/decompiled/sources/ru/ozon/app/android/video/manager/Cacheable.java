package ru.ozon.app.android.video.manager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.CacheObserver;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/video/manager/Cacheable;", "", "getCacheObserver", "Lru/ozon/app/android/video/player/CacheObserver;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Cacheable {
    @NotNull
    CacheObserver getCacheObserver();
}
