package ru.ozon.app.android.pikazon.image;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pikazon/image/ImageSizeOptimizer;", "", "<init>", "()V", "", "anchorValue", "", "values", "searchClosestBucketSize", "(ILjava/util/List;)I", "width", "height", "", "", "queryParameters", "alignSize", "(IILjava/util/Set;)I", "imageSizeBuckets$delegate", "LSc/j;", "getImageSizeBuckets", "()Ljava/util/List;", "imageSizeBuckets", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageSizeOptimizer {

    /* renamed from: imageSizeBuckets$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageSizeBuckets = k.b(ImageSizeOptimizer$imageSizeBuckets$2.INSTANCE);

    private final List<Integer> getImageSizeBuckets() {
        return (List) this.imageSizeBuckets.getValue();
    }

    private final int searchClosestBucketSize(int anchorValue, List<Integer> values) {
        Iterator<T> it = values.iterator();
        int i11 = Integer.MAX_VALUE;
        int i12 = anchorValue;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int abs = Math.abs(intValue - anchorValue);
            if (abs < i11) {
                i12 = intValue;
                i11 = abs;
            }
        }
        return i12;
    }

    public final int alignSize(int width, int height, @NotNull Set<String> queryParameters) {
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        if (queryParameters.contains("set_square_size")) {
            width = Math.max(width, height);
        } else if (!queryParameters.contains("set_only_width")) {
            width = queryParameters.contains("set_only_height") ? height : Math.max(width, height);
        }
        return searchClosestBucketSize(width, getImageSizeBuckets());
    }
}
