package com.socure.docv.capturesdk.core.external.opencv.impl;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.socure.android.Utils;
import org.socure.core.Core;
import org.socure.core.Mat;
import org.socure.core.MatOfDouble;
import org.socure.imgproc.Imgproc;

/* compiled from: BrightnessDetectorOCV.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/opencv/impl/BrightnessDetectorOCV;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IModelProcessor;", "()V", "calcBrightness", "", "src", "Lorg/socure/core/Mat;", "getBrightness", "bitmap", "Landroid/graphics/Bitmap;", "process", "", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BrightnessDetectorOCV implements IModelProcessor {
    public static final int $stable = 0;

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor
    public float[] process(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return null;
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor
    public void stop() {
    }

    public final double getBrightness(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Mat mat = new Mat();
        long currentTimeMillis = System.currentTimeMillis();
        if (bitmap.getWidth() > 256 && bitmap.getHeight() > 256) {
            bitmap = Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth() * 256) / bitmap.getHeight(), 256, false);
            Intrinsics.checkNotNullExpressionValue(bitmap, "{\n                val de…_CD, false)\n            }");
        }
        Utils.bitmapToMat(bitmap, mat);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        double calcBrightness = calcBrightness(mat);
        mat.release();
        LoggerKt.logDetailed("SDLT_BD_OCV", "BrightnessDetectorOCV - timeTaken: " + (System.currentTimeMillis() - currentTimeMillis3) + " | meanBrightness: " + calcBrightness + " | timeTakenBmpToMatConversion: " + currentTimeMillis2);
        return calcBrightness;
    }

    private final double calcBrightness(Mat src) {
        ArrayList arrayList = new ArrayList();
        MatOfDouble matOfDouble = new MatOfDouble(new Mat(1, 1, 6));
        MatOfDouble matOfDouble2 = new MatOfDouble(new Mat(1, 1, 6));
        Mat mat = new Mat();
        Mat mat2 = new Mat();
        Imgproc.cvtColor(src, mat, 1);
        Imgproc.cvtColor(mat, mat2, 53);
        Core.split(mat2, arrayList);
        Mat mat3 = (Mat) arrayList.get(1);
        Core.meanStdDev(mat3, matOfDouble, matOfDouble2);
        double d = matOfDouble.toArray()[0] / 255;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Mat) it.next()).release();
        }
        arrayList.clear();
        matOfDouble.release();
        matOfDouble2.release();
        mat.release();
        mat2.release();
        mat3.release();
        LoggerKt.logDetailed("SDLT_BD_OCV", "mean brightness measured as: " + d);
        return d;
    }
}
