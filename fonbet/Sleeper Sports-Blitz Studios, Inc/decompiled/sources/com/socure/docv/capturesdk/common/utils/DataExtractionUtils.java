package com.socure.docv.capturesdk.common.utils;

import android.media.Image;
import androidx.camera.core.ImageProxy;
import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataExtractionUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/DataExtractionUtils;", "", "()V", "convertToImageByteData", "Lcom/socure/docv/capturesdk/common/utils/ImageByteData;", "extractedData", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "extractImageBytes", "image", "Landroid/media/Image;", "extractImageData", "imageProxy", "Landroidx/camera/core/ImageProxy;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DataExtractionUtils {
    public static final int $stable = 0;
    public static final DataExtractionUtils INSTANCE = new DataExtractionUtils();

    private DataExtractionUtils() {
    }

    public final ExtractedImageData extractImageData(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int format = imageProxy.getFormat();
        int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
        boolean z = format == 35;
        boolean z2 = format == 256;
        ArrayList arrayList = new ArrayList();
        ImageProxy.PlaneProxy[] planes = imageProxy.getPlanes();
        Intrinsics.checkNotNullExpressionValue(planes, "imageProxy.planes");
        for (ImageProxy.PlaneProxy planeProxy : planes) {
            ByteBuffer buffer = planeProxy.getBuffer();
            Intrinsics.checkNotNullExpressionValue(buffer, "plane.buffer");
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            arrayList.add(new ExtractedImageData.PlaneData(bArr, remaining, planeProxy.getPixelStride(), planeProxy.getRowStride()));
        }
        return new ExtractedImageData(width, height, format, arrayList, z, z2, rotationDegrees);
    }

    public final ImageByteData extractImageBytes(Image image) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(image, "image");
        int width = image.getWidth();
        int height = image.getHeight();
        int format = image.getFormat();
        if (format != 35) {
            return new ImageByteData(new byte[0], new byte[0], new byte[0], width, height, format, 0, false);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            DataExtractionUtils dataExtractionUtils = this;
            Image.Plane[] planes = image.getPlanes();
            Image.Plane plane = planes[0];
            Image.Plane plane2 = planes[1];
            Image.Plane plane3 = planes[2];
            int pixelStride = plane2.getPixelStride();
            int remaining = plane.getBuffer().remaining();
            byte[] bArr = new byte[remaining];
            byte[] bArr2 = new byte[plane2.getBuffer().remaining()];
            byte[] bArr3 = new byte[plane3.getBuffer().remaining()];
            plane.getBuffer().get(bArr);
            plane2.getBuffer().get(bArr2);
            plane3.getBuffer().get(bArr3);
            m13470constructorimpl = Result.m13470constructorimpl(new ImageByteData(bArr, bArr2, bArr3, width, height, format, pixelStride, true));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
            m13470constructorimpl = null;
        }
        return (ImageByteData) m13470constructorimpl;
    }

    public final ImageByteData convertToImageByteData(ExtractedImageData extractedData) {
        Intrinsics.checkNotNullParameter(extractedData, "extractedData");
        if (!extractedData.isValidYuvFormat() || extractedData.getPlanes().size() < 3) {
            return new ImageByteData(new byte[0], new byte[0], new byte[0], extractedData.getWidth(), extractedData.getHeight(), extractedData.getFormat(), 0, false);
        }
        ExtractedImageData.PlaneData planeData = extractedData.getPlanes().get(0);
        ExtractedImageData.PlaneData planeData2 = extractedData.getPlanes().get(1);
        return new ImageByteData(planeData.getBytes(), planeData2.getBytes(), extractedData.getPlanes().get(2).getBytes(), extractedData.getWidth(), extractedData.getHeight(), extractedData.getFormat(), planeData2.getPixelStride(), true);
    }
}
