package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import xe.C10727i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/pixel/PixelAnalyticsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "pixelApiRepository", "<init>", "(Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;)V", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixel", "", "trackPixel", "(Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;)V", "releaseAnalyticsData", "()V", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "", "", "trackedOneTimeEventsSet", "Ljava/util/Set;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PixelAnalyticsViewModel extends w0 {

    @NotNull
    private final PixelApiRepository pixelApiRepository;

    @NotNull
    private final Set<Integer> trackedOneTimeEventsSet;

    public PixelAnalyticsViewModel(@NotNull PixelApiRepository pixelApiRepository) {
        Intrinsics.checkNotNullParameter(pixelApiRepository, "pixelApiRepository");
        this.pixelApiRepository = pixelApiRepository;
        this.trackedOneTimeEventsSet = new LinkedHashSet();
    }

    public final void releaseAnalyticsData() {
        this.trackedOneTimeEventsSet.clear();
    }

    public final void trackPixel(@NotNull Pixel pixel) {
        Intrinsics.checkNotNullParameter(pixel, "pixel");
        if (this.trackedOneTimeEventsSet.contains(Integer.valueOf(pixel.hashCode()))) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new PixelAnalyticsViewModel$trackPixel$1(this, pixel, null), 3);
    }
}
