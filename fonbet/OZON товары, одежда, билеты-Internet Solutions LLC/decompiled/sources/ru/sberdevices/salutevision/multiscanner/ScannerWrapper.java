package ru.sberdevices.salutevision.multiscanner;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.RoiDetectorType;
import ru.sberdevices.salutevision.core.data.SaluteVisionImage;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0082 J\b\u0010\u000f\u001a\u00020\rH\u0004J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0084 J\t\u0010\u0011\u001a\u00020\rH\u0082 J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b0\u0019J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0082 J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0082 J7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0082 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Lru/sberdevices/salutevision/multiscanner/ScannerWrapper;", "", "delegate", "", "(J)V", "getDelegate", "()J", "modelsDescription", "", "", "getModelsDescription", "()Ljava/util/List;", "deleteNative", "", "handle", "finalize", "getDescription", "initNative", "read", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition;", "image", "Lru/sberdevices/salutevision/core/data/SaluteVisionImage;", "rect", "Landroid/graphics/RectF;", "roiMap", "", "Lru/sberdevices/salutevision/core/data/RoiDetectorType;", "readNative", "bitmap", "readNativeRoi", "points", "", "readNativeRoiMap", "detectors", "", "roiSizes", "salutevision-multiscanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ScannerWrapper {
    private final long delegate;

    @NotNull
    private final List<String> modelsDescription;

    public ScannerWrapper(long j11) {
        this.delegate = j11;
        initNative();
        this.modelsDescription = getDescription(j11);
    }

    private final native void deleteNative(long handle);

    private final native void initNative();

    private final native List<SaluteVisionRecognition> readNative(long bitmap, long handle);

    private final native List<SaluteVisionRecognition> readNativeRoi(long bitmap, float[] points, long handle);

    private final native List<SaluteVisionRecognition> readNativeRoiMap(long bitmap, int[] detectors, int[] roiSizes, float[] points, long handle);

    protected final void finalize() {
        deleteNative(this.delegate);
    }

    public final long getDelegate() {
        return this.delegate;
    }

    @NotNull
    protected final native List<String> getDescription(long handle);

    @NotNull
    public final List<String> getModelsDescription() {
        return this.modelsDescription;
    }

    @NotNull
    public final List<SaluteVisionRecognition> read(@NotNull SaluteVisionImage image, RectF rect) {
        Intrinsics.checkNotNullParameter(image, "image");
        if (image.getNativeHandle() == 0) {
            return K.f71697a;
        }
        if (rect == null) {
            return readNative(image.getNativeHandle(), this.delegate);
        }
        return readNativeRoi(image.getNativeHandle(), C7714v.R0(C7714v.b0(Float.valueOf(rect.left), Float.valueOf(rect.top), Float.valueOf(rect.width()), Float.valueOf(rect.height()))), this.delegate);
    }

    @NotNull
    public final List<SaluteVisionRecognition> read(@NotNull SaluteVisionImage image, @NotNull Map<RoiDetectorType, ? extends List<? extends RectF>> roiMap) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(roiMap, "roiMap");
        if (image.getNativeHandle() != 0) {
            Set<RoiDetectorType> keySet = roiMap.keySet();
            ArrayList arrayList = new ArrayList(C7714v.z(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((RoiDetectorType) it.next()).getValue()));
            }
            int[] T02 = C7714v.T0(arrayList);
            ArrayList arrayList2 = new ArrayList(C7714v.z(keySet, 10));
            Iterator<T> it2 = keySet.iterator();
            while (it2.hasNext()) {
                List<? extends RectF> list = roiMap.get((RoiDetectorType) it2.next());
                arrayList2.add(Integer.valueOf(list != null ? list.size() : 0));
            }
            int[] T03 = C7714v.T0(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = keySet.iterator();
            while (it3.hasNext()) {
                List<? extends RectF> list2 = roiMap.get((RoiDetectorType) it3.next());
                if (list2 != null) {
                    for (RectF rectF : list2) {
                        arrayList3.addAll(C7714v.b0(Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())));
                    }
                }
            }
            return readNativeRoiMap(image.getNativeHandle(), T02, T03, C7714v.R0(arrayList3), this.delegate);
        }
        return K.f71697a;
    }
}
