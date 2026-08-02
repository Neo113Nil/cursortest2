package ru.ozon.app.android.pikazon.glide.thumbnail;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u0007"}, d2 = {"findThumb", "Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "thumbs", "", "width", "", "height", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThumbUrlLoaderKt {
    public static final Thumb findThumb(@NotNull Set<Thumb> thumbs, int i11, int i12) {
        Intrinsics.checkNotNullParameter(thumbs, "thumbs");
        Thumb thumb = null;
        if (thumbs.isEmpty()) {
            return null;
        }
        long j11 = i11 * i12;
        long j12 = 0;
        long j13 = Long.MAX_VALUE;
        for (Thumb thumb2 : thumbs) {
            long area = thumb2.getArea();
            long abs = Math.abs(area - j11);
            if (thumb == null || abs < j13 || (abs == j13 && area < j12)) {
                thumb = thumb2;
                j12 = area;
                j13 = abs;
            }
        }
        return thumb;
    }
}
