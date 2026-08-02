package com.socure.docv.capturesdk.common.utils;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.socure.core.Core;
import org.socure.core.CvType;
import org.socure.core.Mat;
import org.socure.core.Scalar;
import org.socure.imgproc.Imgproc;

/* compiled from: VarianceCalculator.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ/\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/VarianceCalculator;", "", "()V", "calculateMSE", "", "previousImageData", "Lcom/socure/docv/capturesdk/common/utils/ImageByteData;", "currentImageData", "(Lcom/socure/docv/capturesdk/common/utils/ImageByteData;Lcom/socure/docv/capturesdk/common/utils/ImageByteData;)Ljava/lang/Float;", "mat1", "Lorg/socure/core/Mat;", "mat2", "wasValidFormat1", "", "wasValidFormat2", "(Lorg/socure/core/Mat;Lorg/socure/core/Mat;ZZ)Ljava/lang/Float;", "createMatFromBytes", "imageData", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VarianceCalculator {
    public static final int $stable = 0;

    public final Float calculateMSE(ImageByteData previousImageData, ImageByteData currentImageData) {
        Intrinsics.checkNotNullParameter(currentImageData, "currentImageData");
        if (previousImageData == null) {
            return null;
        }
        Mat createMatFromBytes = createMatFromBytes(previousImageData);
        Mat createMatFromBytes2 = createMatFromBytes(currentImageData);
        if (createMatFromBytes == null || createMatFromBytes2 == null) {
            if (createMatFromBytes != null) {
                createMatFromBytes.release();
            }
            if (createMatFromBytes2 != null) {
                createMatFromBytes2.release();
            }
            return Float.valueOf(0.0f);
        }
        try {
            return calculateMSE(createMatFromBytes, createMatFromBytes2, previousImageData.isValidFormat(), currentImageData.isValidFormat());
        } finally {
            createMatFromBytes.release();
            createMatFromBytes2.release();
        }
    }

    private final Mat createMatFromBytes(ImageByteData imageData) {
        Object m13470constructorimpl;
        if (!imageData.isValidFormat()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            VarianceCalculator varianceCalculator = this;
            byte[] bArr = new byte[imageData.getYBytes().length + imageData.getUBytes().length + imageData.getVBytes().length];
            System.arraycopy(imageData.getYBytes(), 0, bArr, 0, imageData.getYBytes().length);
            int length = imageData.getYBytes().length;
            if (imageData.getUvPixelStride() == 1) {
                int length2 = imageData.getUBytes().length;
                for (int i = 0; i < length2; i++) {
                    int i2 = (i * 2) + length;
                    bArr[i2] = imageData.getVBytes()[i];
                    bArr[i2 + 1] = imageData.getUBytes()[i];
                }
            } else if (imageData.getUvPixelStride() == 2) {
                int length3 = imageData.getUBytes().length - 1;
                int uvPixelStride = imageData.getUvPixelStride();
                if (uvPixelStride <= 0) {
                    throw new IllegalArgumentException("Step must be positive, was: " + uvPixelStride + ".");
                }
                int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, length3, uvPixelStride);
                if (progressionLastElement >= 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = length + 1;
                        bArr[length] = imageData.getVBytes()[i3];
                        length += 2;
                        bArr[i4] = imageData.getUBytes()[i3];
                        if (i3 == progressionLastElement) {
                            break;
                        }
                        i3 += uvPixelStride;
                    }
                }
            }
            Mat mat = new Mat(imageData.getHeight() + (imageData.getHeight() / 2), imageData.getWidth(), CvType.CV_8UC1);
            mat.put(0, 0, bArr);
            Mat mat2 = new Mat();
            Imgproc.cvtColor(mat, mat2, 96);
            mat.release();
            m13470constructorimpl = Result.m13470constructorimpl(mat2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        return (Mat) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
    }

    private final Float calculateMSE(Mat mat1, Mat mat2, boolean wasValidFormat1, boolean wasValidFormat2) {
        Object m13470constructorimpl;
        Float valueOf = Float.valueOf(0.0f);
        if (!wasValidFormat1 || !wasValidFormat2 || mat1.width() != mat2.width() || mat1.height() != mat2.height()) {
            return valueOf;
        }
        if (mat1.empty() || mat2.empty()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            VarianceCalculator varianceCalculator = this;
            Mat mat = new Mat();
            Mat mat3 = new Mat();
            Core.subtract(mat1, mat2, mat);
            Core.multiply(mat, mat, mat3);
            Scalar mean = Core.mean(mat3);
            mat.release();
            mat3.release();
            m13470constructorimpl = Result.m13470constructorimpl(Float.valueOf((float) ((((mean.val[0] + mean.val[1]) + mean.val[2]) + mean.val[3]) / 4.0d)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        return (Float) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
    }
}
