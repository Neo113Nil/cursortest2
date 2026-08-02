package ru.ozon.app.android.pikazon.glide.loaders;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/PerformanceListener;", "", "", ImagesContract.URL, "uuid", "Lkotlin/time/b;", "loadingStartTime", "", "onLoadStarted-SxA4cEA", "(Ljava/lang/String;Ljava/lang/String;J)V", "onLoadStarted", "", "width", "height", "onResponse", "(Ljava/lang/String;Ljava/lang/String;II)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PerformanceListener {
    /* renamed from: onLoadStarted-SxA4cEA */
    void mo5onLoadStartedSxA4cEA(@NotNull String url, @NotNull String uuid, long loadingStartTime);

    void onResponse(@NotNull String url, @NotNull String uuid, int width, int height);
}
