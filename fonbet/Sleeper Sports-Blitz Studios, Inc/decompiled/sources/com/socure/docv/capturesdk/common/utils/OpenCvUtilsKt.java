package com.socure.docv.capturesdk.common.utils;

import android.graphics.Bitmap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.metrics.MetricsUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.socure.core.Mat;
import org.socure.core.MatOfPoint2f;
import org.socure.core.Point;
import org.socure.core.Scalar;
import org.socure.core.Size;
import org.socure.imgproc.Imgproc;

/* compiled from: OpenCvUtils.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a:\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007\u001a \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002\u001a\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\r2\u0006\u0010\u0018\u001a\u00020\tH\u0000\u001a\b\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0000\u001a\b\u0010\u001e\u001a\u00020\u001aH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"TAG", "", "bitmapFromMat", "Landroid/graphics/Bitmap;", "src", "Lorg/socure/core/Mat;", "calcMeasure", "", "floatArray", "", "cropAndPerspectiveTransform", "highResImg", "points", "", "hRatio", "wRatio", MetricsUnit.Fraction.RATIO, "dimenRatio", TypedValues.AttributesType.S_TARGET, "dimen", "Lcom/socure/docv/capturesdk/common/utils/DIMEN;", "errorOnOpenCvUse", "", "getDetectedCorners", "modelOutput", "loadOpenCv", "", "matOfPoint2fToString", MetricTracker.Object.INPUT, "Lorg/socure/core/MatOfPoint2f;", "useOpenCv", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenCvUtilsKt {
    private static final String TAG = "SDLT_OP_CU";

    public static final Mat cropAndPerspectiveTransform(Mat highResImg, List<List<Double>> points, double d, double d2, double d3) {
        Intrinsics.checkNotNullParameter(highResImg, "highResImg");
        Intrinsics.checkNotNullParameter(points, "points");
        LoggerKt.logDetailed(TAG, "getTransformedImage called with points: " + points + " | hRatio:" + d + ", wRatio: " + d2 + " | highResImg dim: " + highResImg.size());
        int cols = highResImg.cols();
        MatOfPoint2f matOfPoint2f = new MatOfPoint2f(new Point(points.get(0).get(0).doubleValue() * d2, points.get(0).get(1).doubleValue() * d), new Point(points.get(1).get(0).doubleValue() * d2, points.get(1).get(1).doubleValue() * d), new Point(points.get(2).get(0).doubleValue() * d2, points.get(2).get(1).doubleValue() * d), new Point(points.get(3).get(0).doubleValue() * d2, points.get(3).get(1).doubleValue() * d));
        double d4 = (double) cols;
        Size size = new Size(d4, d4 / d3);
        MatOfPoint2f matOfPoint2f2 = new MatOfPoint2f(new Point(0.0d, 0.0d), new Point(size.width, 0.0d), new Point(size.width, size.height), new Point(0.0d, size.height));
        LoggerKt.logDetailed(TAG, "destSize - w:" + size.width + ", h: " + size.height + " | srcTri: " + matOfPoint2fToString(matOfPoint2f) + " | dstTri: " + matOfPoint2fToString(matOfPoint2f2));
        Mat perspectiveTransform = Imgproc.getPerspectiveTransform(matOfPoint2f, matOfPoint2f2);
        Mat mat = new Mat();
        Imgproc.warpPerspective(highResImg, mat, perspectiveTransform, size, 1, 0, new Scalar(0.0d));
        return mat;
    }

    public static final String matOfPoint2fToString(MatOfPoint2f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        List<Point> list = input.toList();
        Intrinsics.checkNotNullExpressionValue(list, "list");
        String str = "";
        for (Point point : list) {
            str = ((Object) str) + "(" + point.x + ", " + point.y + "), ";
        }
        return str;
    }

    public static final double dimenRatio(Mat src, Mat target, DIMEN dimen) {
        double rows;
        int rows2;
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(dimen, "dimen");
        if (dimen == DIMEN.WIDTH) {
            rows = target.cols();
            rows2 = src.cols();
        } else {
            rows = target.rows();
            rows2 = src.rows();
        }
        return rows / rows2;
    }

    public static final List<List<Double>> getDetectedCorners(float[] modelOutput) {
        Intrinsics.checkNotNullParameter(modelOutput, "modelOutput");
        LoggerKt.logDetailed(TAG, "getDetectedCorners called");
        ArrayList arrayList = new ArrayList();
        arrayList.add(CollectionsKt.mutableListOf(Double.valueOf(modelOutput[0]), Double.valueOf(modelOutput[1])));
        arrayList.add(CollectionsKt.mutableListOf(Double.valueOf(modelOutput[3]), Double.valueOf(modelOutput[4])));
        arrayList.add(CollectionsKt.mutableListOf(Double.valueOf(modelOutput[6]), Double.valueOf(modelOutput[7])));
        arrayList.add(CollectionsKt.mutableListOf(Double.valueOf(modelOutput[9]), Double.valueOf(modelOutput[10])));
        return arrayList;
    }

    public static final double calcMeasure(float[] fArr) {
        if (fArr != null) {
            return (((fArr[2] + fArr[5]) + fArr[8]) + fArr[11]) / 4;
        }
        return 0.0d;
    }

    public static final Bitmap bitmapFromMat(Mat src) {
        Intrinsics.checkNotNullParameter(src, "src");
        LoggerKt.logDetailed(TAG, "produceBitmap: " + src);
        Bitmap createBitmap = Bitmap.createBitmap(src.cols(), src.rows(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(src.cols(),… Bitmap.Config.ARGB_8888)");
        org.socure.android.Utils.matToBitmap(src, createBitmap);
        src.release();
        return createBitmap;
    }

    public static final boolean useOpenCv() {
        return loadOpenCv() && errorOnOpenCvUse() == null;
    }

    private static final boolean loadOpenCv() {
        try {
            LoggerKt.logI(TAG, "opencv load called");
            System.loadLibrary("opencv_java4");
            LoggerKt.logI(TAG, "opencv loaded");
            return true;
        } catch (Throwable th) {
            LoggerKt.logE$default(TAG, "Throwable in trying to load opencv_java4: " + th.getLocalizedMessage(), null, 4, null);
            return false;
        }
    }

    private static final Throwable errorOnOpenCvUse() {
        try {
            new Mat().release();
            return null;
        } catch (Throwable th) {
            LoggerKt.logE$default(TAG, "Th in doesOpenCvWork: " + th.getLocalizedMessage(), null, 4, null);
            return th;
        }
    }
}
