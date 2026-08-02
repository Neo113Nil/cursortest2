package com.socure.docv.capturesdk.common.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.YuvImage;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.common.analytics.model.Face;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.FinalOutputProcessData;
import com.socure.docv.capturesdk.core.processor.model.Line;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.core.processor.model.Point;
import com.socure.docv.capturesdk.core.processor.model.Quadrilateral;
import com.socure.docv.capturesdk.feature.scanner.data.Container;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import okhttp3.MultipartBody;
import org.jacoco.core.runtime.AgentOptions;
import org.socure.core.Mat;

/* compiled from: ImageUtils.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eJ\u001e\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J+\u0010*\u001a\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0013H\u0000¢\u0006\u0002\b.J0\u0010/\u001a\u0004\u0018\u00010\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u000e\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\rJ*\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\u0006\u00107\u001a\u0002012\u0006\u00108\u001a\u00020\u000eJ\u0018\u00109\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)H\u0002J\u001d\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0002\b<J\u001d\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u000eH\u0000¢\u0006\u0002\bAJ\u001d\u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u001eH\u0000¢\u0006\u0002\bEJ4\u0010F\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001e0G2\u0006\u0010H\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020'J<\u0010F\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001e0G2\u0006\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020J2\u0006\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020'J%\u0010K\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020OH\u0000¢\u0006\u0002\bPJ1\u0010Q\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020R0\u001d2\b\u0010S\u001a\u0004\u0018\u0001042\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\bTJ\u001e\u0010U\u001a\u00020\u00132\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010V\u001a\u000201J&\u0010W\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010Z\u001a\u00020\u000eH\u0002J\u0016\u0010[\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u001eJ\u001d\u0010]\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020>2\u0006\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0002\b^J\u0016\u0010_\u001a\u00020'2\u0006\u0010&\u001a\u00020'2\u0006\u0010`\u001a\u00020\u0013J\u0015\u0010a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010b\u001a\u00020c¢\u0006\u0002\u0010dJ\u000e\u0010e\u001a\u00020\u00152\u0006\u0010?\u001a\u00020>J\u000e\u0010f\u001a\u00020\u00152\u0006\u0010?\u001a\u00020>J-\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010I\u001a\u00020J2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020lH\u0000¢\u0006\u0002\bnJ&\u0010o\u001a\u00020h2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010q\u001a\u00020l2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020lJ\u001d\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020s2\u0006\u0010@\u001a\u00020\u000eH\u0000¢\u0006\u0002\buJ\u001b\u0010v\u001a\u00020>2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0002\bwJ\u0016\u0010x\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u001eJ0\u0010z\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010;\u001a\u00020\u00102\u0006\u0010{\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u000eJ\u000e\u0010}\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J!\u0010~\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u007f\u001a\u00020s2\u0007\u0010\u0080\u0001\u001a\u00020sH\u0000¢\u0006\u0003\b\u0081\u0001J\u0007\u0010\u0082\u0001\u001a\u000201J\u0015\u0010\u0083\u0001\u001a\u00020>2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bJ1\u0010\u0084\u0001\u001a\u00020\u00062\u0007\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020Y2\u0006\u0010-\u001a\u00020\u0013H\u0000¢\u0006\u0003\b\u0087\u0001J-\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010Y2\u0007\u0010\u0089\u0001\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u000eH\u0000¢\u0006\u0003\b\u008a\u0001J!\u0010\u008b\u0001\u001a\u00020\u00062\u0007\u0010\u008c\u0001\u001a\u00020\u00062\u0007\u0010\u008d\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0003\b\u008e\u0001J \u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0003\b\u0091\u0001J4\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\u0006\u0010i\u001a\u00020R2\u0007\u0010\u0093\u0001\u001a\u00020RH\u0000¢\u0006\u0003\b\u0094\u0001J%\u0010\u0095\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010H\u001a\u00020 2\u0006\u0010(\u001a\u00020)J\u0019\u0010\u0096\u0001\u001a\u00020Y2\u0006\u0010?\u001a\u00020>2\u0006\u0010\u001a\u001a\u00020YH\u0002J\f\u0010\n\u001a\u00020\u0006*\u00020 H\u0002J\u0013\u0010\u0097\u0001\u001a\u00020R*\u00020\u0006H\u0000¢\u0006\u0003\b\u0098\u0001J\r\u0010\u0099\u0001\u001a\u00020\u0004*\u00020\u0006H\u0002¨\u0006\u009a\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/ImageUtils;", "", "()V", "bitmapToByteArray", "", "imageBitmap", "Landroid/graphics/Bitmap;", "bitmapToByteArray$capturesdk_productionRelease", "bitmapToByteBufferGlare", "Ljava/nio/ByteBuffer;", "bitmap", "bitmapToByteBufferIdd", "calculateCornersForGuidingBox", "", "", "guidingBox", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;", "calculateCornersForGuidingBox$capturesdk_productionRelease", "calculateEdgeLength", "", "start", "Lcom/socure/docv/capturesdk/core/processor/model/Point;", "end", "calculateEdgeLength$capturesdk_productionRelease", "calculateRectForSquareCrop", "Landroid/graphics/Rect;", "modelOutput", "", "captureImageProxyToBitmap", "Lkotlin/Pair;", "", "data", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "convertBitmapToByteBufferBlur", CmcdData.STREAMING_FORMAT_HLS, "w", "cropDoc", "originalBitmap", "viewDimensions", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "cropDocFromBitmap", "regionList", "image", "perspectiveCropRatio", "cropDocFromBitmap$capturesdk_productionRelease", "cropDocWithPaddingIfEnabled", "isAutoCapture", "", "isCornerProcessed", "metrics", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "expandCoordinatesIfApplicable", "modelOutputList", "isExpansionEnabled", "expansionPercentage", "expandGbIfRequire", "expandGuidingBox", "gb", "expandGuidingBox$capturesdk_productionRelease", "expandQuadrilateral", "Lcom/socure/docv/capturesdk/core/processor/model/Quadrilateral;", "quad", TypedValues.CycleType.S_WAVE_OFFSET, "expandQuadrilateral$capturesdk_productionRelease", "expandRect", "rect", "increaseByPercentage", "expandRect$capturesdk_productionRelease", "getBitmapFromImageProxy", "Lkotlin/Triple;", "extractedImageData", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "getBitmapToScreenCropCoordinates", "bitmapWidth", "bitmapHeight", "screenDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/Container;", "getBitmapToScreenCropCoordinates$capturesdk_productionRelease", "getCornersAndParentDimenForDrawingRect", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "detectionMetric", "getCornersAndParentDimenForDrawingRect$capturesdk_productionRelease", "getCropDocAspectRatio", "isPortrait", "getDebugBmp", "coordinates", "", "cornerExpansionPercentage", "getDownScaledBitmap", "maxResolution", "getExpansionOffset", "getExpansionOffset$capturesdk_productionRelease", "getExtraHeightTopViewDimensions", "extraHeightRatio", "getImageRotatableAngle", "finalOutputProcessData", "Lcom/socure/docv/capturesdk/core/processor/model/FinalOutputProcessData;", "(Lcom/socure/docv/capturesdk/core/processor/model/FinalOutputProcessData;)Ljava/lang/Float;", "getMaxPoint", "getMinPoint", "getMultipartBody", "Lokhttp3/MultipartBody$Part;", AgentOptions.OUTPUT, "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "sessionToken", "", "moduleId", "getMultipartBody$capturesdk_productionRelease", "getMultipartBodyFromBitmap", "resizeBitmap", "documentFront", "getParallelLine", "Lcom/socure/docv/capturesdk/core/processor/model/Line;", "line", "getParallelLine$capturesdk_productionRelease", "getQuadrilateral", "getQuadrilateral$capturesdk_productionRelease", "getResizedBitmap", ViewProps.MAX_WIDTH, "getSelfieDebugBmp", "scaleX", "scaleY", "getSquaredBitmap", "intersect", "line1", "line2", "intersect$capturesdk_productionRelease", "isCornerExpansionEnabled", "modelOutputToRectangle", "postCornerProcessing", "downScaledBitmap", "iddModelOutput", "postCornerProcessing$capturesdk_productionRelease", "processForDebugImage", "scaledBitmap", "processForDebugImage$capturesdk_productionRelease", "rotateBitmap", "srcBitmap", "angle", "rotateBitmap$capturesdk_productionRelease", "rotateImage", "rotationAngle", "rotateImage$capturesdk_productionRelease", "scaleIddModelCoordinates", MetricTracker.Object.INPUT, "scaleIddModelCoordinates$capturesdk_productionRelease", "selfieCaptureImageProxyToBitmap", "toIddModelFloatArray", "getDimens", "getDimens$capturesdk_productionRelease", "toByteArray", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageUtils {
    public static final ImageUtils INSTANCE = new ImageUtils();

    /* compiled from: ImageUtils.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScanType.values().length];
            try {
                iArr[ScanType.LICENSE_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanType.LICENSE_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanType.SELFIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanType.PASSPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean isCornerExpansionEnabled() {
        return true;
    }

    private ImageUtils() {
    }

    public final Triple<Bitmap, Bitmap, Integer> getBitmapFromImageProxy(ExtractedImageData extractedImageData, CaptureType captureType, ViewDimensions viewDimensions) {
        Bitmap bitmap;
        Integer num;
        Intrinsics.checkNotNullParameter(extractedImageData, "extractedImageData");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        LoggerKt.logDetailed("SDLT_IU", "getBitmapFromIProxy - viewDimensions: " + viewDimensions);
        Matrix matrix = new Matrix();
        matrix.postRotate((float) extractedImageData.getRotationDegrees());
        if (captureType != CaptureType.AUTO_ANALYSIS) {
            Pair<Bitmap, Integer> captureImageProxyToBitmap = INSTANCE.captureImageProxyToBitmap(extractedImageData);
            num = captureImageProxyToBitmap.getSecond();
            bitmap = captureImageProxyToBitmap.getFirst();
        } else {
            bitmap = INSTANCE.bitmap(extractedImageData);
            num = null;
        }
        Bitmap bitmap2 = bitmap;
        LoggerKt.logDetailed("SDLT_IU", "getBitmapFromImageProxy -> byte array - bitmap size: " + bitmap2.getByteCount());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(bitmap, 0, …map.height, matrix, true)");
        matrix.reset();
        ImageUtils imageUtils = INSTANCE;
        Rect bitmapToScreenCropCoordinates$capturesdk_productionRelease = imageUtils.getBitmapToScreenCropCoordinates$capturesdk_productionRelease(createBitmap.getWidth(), createBitmap.getHeight(), viewDimensions.getContainer());
        if (new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()).contains(bitmapToScreenCropCoordinates$capturesdk_productionRelease)) {
            createBitmap = Bitmap.createBitmap(createBitmap, bitmapToScreenCropCoordinates$capturesdk_productionRelease.left, bitmapToScreenCropCoordinates$capturesdk_productionRelease.top, bitmapToScreenCropCoordinates$capturesdk_productionRelease.width(), bitmapToScreenCropCoordinates$capturesdk_productionRelease.height(), (Matrix) null, true);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …   true\n                )");
        }
        if (captureType == CaptureType.MANUAL) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 200, 200, false);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitma…M, MANUAL_DBG_DIM, false)");
            return new Triple<>(imageUtils.cropDoc(createBitmap, viewDimensions, captureType), getDebugBmp$default(imageUtils, createScaledBitmap, null, 0.0f, 6, null), num);
        }
        return new Triple<>(createBitmap, null, num);
    }

    public final Rect getBitmapToScreenCropCoordinates$capturesdk_productionRelease(float bitmapWidth, float bitmapHeight, Container screenDimension) {
        Intrinsics.checkNotNullParameter(screenDimension, "screenDimension");
        boolean z = bitmapHeight / bitmapWidth <= ((float) screenDimension.getHeight()) / ((float) screenDimension.getWidth());
        float height = z ? bitmapHeight / screenDimension.getHeight() : bitmapWidth / screenDimension.getWidth();
        float width = z ? bitmapWidth - (screenDimension.getWidth() * height) : bitmapHeight - (screenDimension.getHeight() * height);
        LoggerKt.logDetailed("SDLT_IU", "getBitmapToScreenCropCoordinates: isWidthMore: " + z + ", ratio: " + height + ", difference: " + width);
        if (z) {
            float f = width / 2;
            float f2 = bitmapWidth - width;
            LoggerKt.logDetailed("SDLT_IU", "getBitmapToScreenCropCoordinates horizontal - Rect: [x: " + f + ", y: 0, w: " + f2 + ", h: " + bitmapHeight + "]");
            return new Rect(MathKt.roundToInt(f), 0, MathKt.roundToInt(f + f2), MathKt.roundToInt(0 + bitmapHeight));
        }
        float f3 = width / 2;
        float f4 = bitmapHeight - width;
        LoggerKt.logDetailed("SDLT_IU", "getBitmapToScreenCropCoordinates vertical - Rect: [x: 0, y: " + f3 + ", w: " + bitmapWidth + ", h: " + f4 + "]");
        return new Rect(0, MathKt.roundToInt(f3), MathKt.roundToInt(0 + bitmapWidth), MathKt.roundToInt(f3 + f4));
    }

    public final Bitmap getSquaredBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth() >= bitmap.getHeight() ? bitmap.getWidth() : bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(dimension, … Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(ViewCompat.MEASURED_STATE_MASK);
        canvas.drawBitmap(bitmap, (width - bitmap.getWidth()) / 2, (width - bitmap.getHeight()) / 2, (Paint) null);
        return createBitmap;
    }

    static /* synthetic */ Bitmap getDebugBmp$default(ImageUtils imageUtils, Bitmap bitmap, float[] fArr, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            fArr = null;
        }
        if ((i & 4) != 0) {
            f = 7.5f;
        }
        return imageUtils.getDebugBmp(bitmap, fArr, f);
    }

    private final Bitmap getDebugBmp(Bitmap bitmap, float[] coordinates, float cornerExpansionPercentage) {
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setColor(-16711936);
        if (coordinates != null) {
            getDebugBmp$drawLines(canvas, paint, coordinates);
            ImageUtils imageUtils = INSTANCE;
            if (imageUtils.isCornerExpansionEnabled()) {
                paint.setColor(-65536);
                Quadrilateral quadrilateral$capturesdk_productionRelease = imageUtils.getQuadrilateral$capturesdk_productionRelease(ArraysKt.toList(coordinates));
                getDebugBmp$drawLines(canvas, paint, imageUtils.toIddModelFloatArray(imageUtils.expandQuadrilateral$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease, imageUtils.getExpansionOffset$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease, cornerExpansionPercentage)), coordinates));
            }
        }
        return bitmap;
    }

    private static final void getDebugBmp$drawLines(Canvas canvas, Paint paint, float[] fArr) {
        canvas.drawLine(fArr[0], fArr[1], fArr[3], fArr[4], paint);
        canvas.drawLine(fArr[3], fArr[4], fArr[6], fArr[7], paint);
        canvas.drawLine(fArr[6], fArr[7], fArr[9], fArr[10], paint);
        canvas.drawLine(fArr[9], fArr[10], fArr[0], fArr[1], paint);
    }

    public final Bitmap getSelfieDebugBmp(Bitmap bitmap, float[] coordinates, GuidingBox gb, float scaleX, float scaleY) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(gb, "gb");
        LoggerKt.logDetailed("SDLT_IU", "getSelfieDebugBmp --> bitmap - w: " + bitmap.getWidth() + ", h: " + bitmap.getHeight() + " | coordinates: " + (coordinates != null ? ArraysKt.joinToString$default(coordinates, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) : null) + " | guidingBox: " + gb);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(-16711936);
        paint.setStrokeWidth(1.0f);
        if (coordinates != null) {
            canvas.drawLine(coordinates[0], coordinates[1], coordinates[3], coordinates[4], paint);
            canvas.drawLine(coordinates[3], coordinates[4], coordinates[6], coordinates[7], paint);
            canvas.drawLine(coordinates[6], coordinates[7], coordinates[9], coordinates[10], paint);
            canvas.drawLine(coordinates[9], coordinates[10], coordinates[0], coordinates[1], paint);
        }
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Pair pair = new Pair(Float.valueOf(gb.getLeftTopX() / scaleX), Float.valueOf(gb.getLeftTopY() / scaleY));
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        Pair pair2 = new Pair(Float.valueOf((gb.getWidth() / scaleX) + floatValue), Float.valueOf(floatValue2));
        float floatValue3 = ((Number) pair2.component1()).floatValue();
        float floatValue4 = ((Number) pair2.component2()).floatValue();
        Pair pair3 = new Pair(Float.valueOf(floatValue3), Float.valueOf((gb.getHeight() / scaleY) + floatValue4));
        float floatValue5 = ((Number) pair3.component1()).floatValue();
        float floatValue6 = ((Number) pair3.component2()).floatValue();
        Pair pair4 = new Pair(Float.valueOf(floatValue), Float.valueOf(floatValue6));
        float floatValue7 = ((Number) pair4.component1()).floatValue();
        float floatValue8 = ((Number) pair4.component2()).floatValue();
        canvas.drawLine(floatValue, floatValue2, floatValue3, floatValue4, paint);
        canvas.drawLine(floatValue3, floatValue4, floatValue5, floatValue6, paint);
        canvas.drawLine(floatValue5, floatValue6, floatValue7, floatValue8, paint);
        canvas.drawLine(floatValue7, floatValue8, floatValue, floatValue2, paint);
        Rect expandRect$capturesdk_productionRelease = expandRect$capturesdk_productionRelease(new Rect((int) floatValue, (int) floatValue2, (int) floatValue3, (int) floatValue6), 30);
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 7.0f}, 0.0f));
        paint.setColor(-65536);
        Pair pair5 = new Pair(Float.valueOf(expandRect$capturesdk_productionRelease.left), Float.valueOf(expandRect$capturesdk_productionRelease.top));
        float floatValue9 = ((Number) pair5.component1()).floatValue();
        float floatValue10 = ((Number) pair5.component2()).floatValue();
        Pair pair6 = new Pair(Float.valueOf(expandRect$capturesdk_productionRelease.width() + floatValue9), Float.valueOf(floatValue10));
        float floatValue11 = ((Number) pair6.component1()).floatValue();
        float floatValue12 = ((Number) pair6.component2()).floatValue();
        Pair pair7 = new Pair(Float.valueOf(floatValue11), Float.valueOf(expandRect$capturesdk_productionRelease.height() + floatValue12));
        float floatValue13 = ((Number) pair7.component1()).floatValue();
        float floatValue14 = ((Number) pair7.component2()).floatValue();
        Pair pair8 = new Pair(Float.valueOf(floatValue9), Float.valueOf(floatValue14));
        float floatValue15 = ((Number) pair8.component1()).floatValue();
        float floatValue16 = ((Number) pair8.component2()).floatValue();
        canvas.drawLine(floatValue9, floatValue10, floatValue11, floatValue12, paint);
        canvas.drawLine(floatValue11, floatValue12, floatValue13, floatValue14, paint);
        canvas.drawLine(floatValue13, floatValue14, floatValue15, floatValue16, paint);
        canvas.drawLine(floatValue15, floatValue16, floatValue9, floatValue10, paint);
        return bitmap;
    }

    public final Rect expandRect$capturesdk_productionRelease(Rect rect, int increaseByPercentage) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        float f = increaseByPercentage / 100;
        float f2 = 2;
        int width = (int) ((rect.width() * f) / f2);
        int height = (int) ((f * rect.height()) / f2);
        Rect rect2 = new Rect();
        rect2.left = rect.left - width;
        rect2.right = rect.right + width;
        rect2.top = rect.top - height;
        rect2.bottom = rect.bottom + height;
        return rect2;
    }

    public final Bitmap getResizedBitmap(Bitmap image, int maxWidth) {
        int i;
        Intrinsics.checkNotNullParameter(image, "image");
        float width = image.getWidth() / image.getHeight();
        if (width > 1.0f) {
            i = (int) (maxWidth / width);
        } else {
            int i2 = (int) (maxWidth * width);
            i = maxWidth;
            maxWidth = i2;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(image, maxWidth, i, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(image, width, height, true)");
        return createScaledBitmap;
    }

    public final ByteBuffer bitmapToByteBufferIdd(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(786432);
        byteBuffer.order(ByteOrder.nativeOrder());
        bitmap.getPixels(new int[65536], 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        for (int i = 0; i < 65536; i++) {
            byteBuffer.putFloat(Color.blue(r3[i]));
        }
        for (int i2 = 0; i2 < 65536; i2++) {
            byteBuffer.putFloat(Color.green(r3[i2]));
        }
        for (int i3 = 0; i3 < 65536; i3++) {
            byteBuffer.putFloat(Color.red(r3[i3]));
        }
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        return byteBuffer;
    }

    public final ByteBuffer bitmapToByteBufferGlare(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 112, 112, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitmap, 112, 112, true)");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(150528);
        byteBuffer.order(ByteOrder.nativeOrder());
        createScaledBitmap.getPixels(new int[12544], 0, createScaledBitmap.getWidth(), 0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
        for (int i = 0; i < 12544; i++) {
            byteBuffer.putFloat(Color.red(r3[i]));
        }
        for (int i2 = 0; i2 < 12544; i2++) {
            byteBuffer.putFloat(Color.blue(r3[i2]));
        }
        for (int i3 = 0; i3 < 12544; i3++) {
            byteBuffer.putFloat(Color.green(r3[i3]));
        }
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        return byteBuffer;
    }

    public final ByteBuffer convertBitmapToByteBufferBlur(Bitmap bitmap, int h, int w) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, w, h, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitmap, w, h, true)");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(w * 4 * h * 3);
        byteBuffer.order(ByteOrder.nativeOrder());
        int i = w * h;
        createScaledBitmap.getPixels(new int[i], 0, createScaledBitmap.getWidth(), 0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.putFloat(Color.red(r2[i2]));
        }
        for (int i3 = 0; i3 < i; i3++) {
            byteBuffer.putFloat(Color.blue(r2[i3]));
        }
        for (int i4 = 0; i4 < i; i4++) {
            byteBuffer.putFloat(Color.green(r2[i4]));
        }
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        return byteBuffer;
    }

    private final byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "stream.toByteArray()");
        return byteArray;
    }

    private final Bitmap bitmap(ExtractedImageData extractedImageData) {
        LoggerKt.logDetailed("SDLT_IU", "format is " + extractedImageData.getFormat() + " and ImageFormat.YUV_420_888 is 35");
        byte[] bytes = extractedImageData.getPlanes().get(0).getBytes();
        byte[] bytes2 = extractedImageData.getPlanes().get(2).getBytes();
        int length = bytes.length;
        int length2 = bytes2.length;
        byte[] bArr = new byte[length + length2];
        System.arraycopy(bytes, 0, bArr, 0, length);
        System.arraycopy(bytes2, 0, bArr, length, length2);
        YuvImage yuvImage = new YuvImage(bArr, 17, extractedImageData.getWidth(), extractedImageData.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        Intrinsics.checkNotNullExpressionValue(decodeByteArray, "decodeByteArray(imageBytes, 0, imageBytes.size)");
        return decodeByteArray;
    }

    public final Triple<Bitmap, Bitmap, Integer> getBitmapFromImageProxy(ExtractedImageData extractedImageData, ScanType scanType, CaptureType captureType, ViewDimensions viewDimensions) {
        Intrinsics.checkNotNullParameter(extractedImageData, "extractedImageData");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        if (Utils.INSTANCE.isSelfie$capturesdk_productionRelease(scanType)) {
            Pair<Bitmap, Integer> selfieCaptureImageProxyToBitmap = selfieCaptureImageProxyToBitmap(extractedImageData, captureType);
            return new Triple<>(selfieCaptureImageProxyToBitmap.getFirst(), null, selfieCaptureImageProxyToBitmap.getSecond());
        }
        return getBitmapFromImageProxy(extractedImageData, captureType, viewDimensions);
    }

    public final Pair<Bitmap, Integer> selfieCaptureImageProxyToBitmap(ExtractedImageData extractedImageData, CaptureType captureType) {
        Bitmap bitmap;
        Integer num;
        Intrinsics.checkNotNullParameter(extractedImageData, "extractedImageData");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        LoggerKt.logDetailed("SDLT_IU", "selfieImageProxyToBitmap");
        if (captureType != CaptureType.AUTO_ANALYSIS) {
            Pair<Bitmap, Integer> captureImageProxyToBitmap = captureImageProxyToBitmap(extractedImageData);
            num = captureImageProxyToBitmap.getSecond();
            bitmap = captureImageProxyToBitmap.getFirst();
        } else {
            bitmap = bitmap(extractedImageData);
            num = null;
        }
        Bitmap bitmap2 = bitmap;
        int rotationDegrees = extractedImageData.getRotationDegrees();
        if (rotationDegrees != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(rotationDegrees);
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            Intrinsics.checkNotNullExpressionValue(bitmap2, "createBitmap(bitmap, 0, …map.height, matrix, true)");
            matrix.reset();
        }
        Bitmap bitmap3 = bitmap2;
        LoggerKt.logDetailed("SDLT_IU", "selfieImageProxyToBitmap -> byte array - bitmap size: " + bitmap3.getByteCount());
        Matrix matrix2 = new Matrix();
        matrix2.setScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), bitmap3.getHeight(), matrix2, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(bitmap, 0, …height, flipMatrix, true)");
        matrix2.reset();
        LoggerKt.logDetailed("SDLT_IU", "selfieImageProxyToBitmap -> byte array - bitmap size: " + createBitmap.getByteCount() + ", imageProxy - w:" + extractedImageData.getWidth() + ", h:" + extractedImageData.getHeight() + " | rotatedBitmap - w:" + createBitmap.getWidth() + ", h:" + createBitmap.getHeight());
        return new Pair<>(createBitmap, num);
    }

    private final Pair<Bitmap, Integer> captureImageProxyToBitmap(ExtractedImageData data) {
        LoggerKt.logDetailed("SDLT_IU", "captureImageProxyToBitmap imageFormat is " + data.getFormat());
        ExtractedImageData.PlaneData planeData = data.getPlanes().get(0);
        return new Pair<>(BitmapFactory.decodeByteArray(planeData.getBytes(), 0, planeData.getBytes().length), Integer.valueOf(planeData.getBufferSize()));
    }

    public final MultipartBody.Part getMultipartBody$capturesdk_productionRelease(Output output, ScanType scanType, String sessionToken, String moduleId) {
        MultipartBody.Part multipartBodyFromBitmap;
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Bitmap finalBitmap = output.getFinalBitmap();
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            multipartBodyFromBitmap = INSTANCE.getMultipartBodyFromBitmap(finalBitmap, ApiConstant.DOCUMENT_FRONT, sessionToken, moduleId);
        } else if (i == 2) {
            multipartBodyFromBitmap = INSTANCE.getMultipartBodyFromBitmap(finalBitmap, ApiConstant.DOCUMENT_BACK, sessionToken, moduleId);
        } else if (i == 3) {
            multipartBodyFromBitmap = INSTANCE.getMultipartBodyFromBitmap(finalBitmap, ApiConstant.DOCUMENT_SELFIE, sessionToken, moduleId);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            multipartBodyFromBitmap = INSTANCE.getMultipartBodyFromBitmap(finalBitmap, "passport", sessionToken, moduleId);
        }
        LoggerKt.logDetailed("SDLT_IU", "getDocumentBody previewImage bitmap size: " + Utils.INSTANCE.getBytesToHr(finalBitmap.getByteCount()) + " || documentBody size: " + Utils.INSTANCE.getBytesToHr(multipartBodyFromBitmap.body().contentLength()));
        return multipartBodyFromBitmap;
    }

    public final MultipartBody.Part getMultipartBodyFromBitmap(Bitmap resizeBitmap, String documentFront, String sessionToken, String moduleId) {
        Intrinsics.checkNotNullParameter(resizeBitmap, "resizeBitmap");
        Intrinsics.checkNotNullParameter(documentFront, "documentFront");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        byte[] byteArray = toByteArray(resizeBitmap);
        LoggerKt.logDetailed("SDLT_IU", "bmp -> byte array - bitmap size: " + resizeBitmap.getByteCount() + " | byte array size: " + byteArray.length);
        return ApiUtilsKt.toMultipartBodyData(WatermarkHashGenerator.INSTANCE.processImage(byteArray, sessionToken, moduleId), documentFront);
    }

    public final ViewDimensions getExtraHeightTopViewDimensions(ViewDimensions viewDimensions, double extraHeightRatio) {
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        viewDimensions.getGuidingBox().setHeight((int) (viewDimensions.getGuidingBox().getHeight() + (viewDimensions.getGuidingBox().getHeight() * extraHeightRatio)));
        viewDimensions.getGuidingBox().setLeftTopY((int) (viewDimensions.getGuidingBox().getLeftTopY() - (viewDimensions.getGuidingBox().getLeftTopY() * extraHeightRatio)));
        return viewDimensions;
    }

    public final Bitmap cropDoc(Bitmap originalBitmap, ViewDimensions viewDimensions, CaptureType captureType) {
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        double width = (r15.getWidth() * originalBitmap.getWidth()) / viewDimensions.getContainer().getWidth();
        double height = (r15.getHeight() * originalBitmap.getHeight()) / viewDimensions.getContainer().getHeight();
        double leftTopX = (r15.getLeftTopX() * originalBitmap.getWidth()) / viewDimensions.getContainer().getWidth();
        double leftTopY = (r15.getLeftTopY() * originalBitmap.getHeight()) / viewDimensions.getContainer().getHeight();
        LoggerKt.logDetailed("SDLT_IU", "cropDoc viewDimensions: " + viewDimensions + " | gb: " + expandGbIfRequire(viewDimensions.getGuidingBox(), captureType) + " |initial bitmap - w:" + originalBitmap.getWidth() + ", h:" + originalBitmap.getHeight() + " | widthFinal: " + width + " || heightFinal: " + height + " || leftXFinal: " + leftTopX + " || topYFinal: " + leftTopY);
        Bitmap createBitmap = Bitmap.createBitmap(originalBitmap, (int) leftTopX, (int) leftTopY, (int) width, (int) height);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …htFinal.toInt()\n        )");
        return createBitmap;
    }

    public final Rect calculateRectForSquareCrop(List<Float> modelOutput) {
        Intrinsics.checkNotNullParameter(modelOutput, "modelOutput");
        Quadrilateral modelOutputToRectangle = modelOutputToRectangle(modelOutput);
        Quadrilateral expandQuadrilateral$capturesdk_productionRelease = expandQuadrilateral$capturesdk_productionRelease(modelOutputToRectangle, getExpansionOffset$capturesdk_productionRelease(modelOutputToRectangle, 12.0f));
        Point minPoint = getMinPoint(expandQuadrilateral$capturesdk_productionRelease);
        Point maxPoint = getMaxPoint(expandQuadrilateral$capturesdk_productionRelease);
        float x = maxPoint.getX() - minPoint.getX();
        float y = maxPoint.getY() - minPoint.getY();
        float f = 2;
        Point point = new Point((minPoint.getX() + maxPoint.getX()) / f, (minPoint.getY() + maxPoint.getY()) / f);
        if (x <= y) {
            x = y;
        }
        float f2 = x / f;
        float x2 = point.getX() - f2;
        float y2 = point.getY() - f2;
        if (x2 < 0.0f) {
            x2 = 0.0f;
        }
        if (y2 < 0.0f) {
            y2 = 0.0f;
        }
        LoggerKt.logDetailed("SDLT_IU", "calculateRectForSquareCrop -> rect: {x: " + x2 + ", y: " + y2 + ", width: " + x + ", height: " + x + "}");
        return new Rect((int) x2, (int) y2, (int) (x2 + x), (int) (y2 + x));
    }

    public final Point getMinPoint(Quadrilateral quad) {
        Intrinsics.checkNotNullParameter(quad, "quad");
        return new Point(Math.min(quad.getTopLeft().getX(), Math.min(quad.getTopRight().getX(), Math.min(quad.getBottomRight().getX(), quad.getBottomLeft().getX()))), Math.min(quad.getTopLeft().getY(), Math.min(quad.getTopRight().getY(), Math.min(quad.getBottomRight().getY(), quad.getBottomLeft().getY()))));
    }

    public final Point getMaxPoint(Quadrilateral quad) {
        Intrinsics.checkNotNullParameter(quad, "quad");
        return new Point(Math.max(quad.getTopLeft().getX(), Math.max(quad.getTopRight().getX(), Math.max(quad.getBottomRight().getX(), quad.getBottomLeft().getX()))), Math.max(quad.getTopLeft().getY(), Math.max(quad.getTopRight().getY(), Math.max(quad.getBottomRight().getY(), quad.getBottomLeft().getY()))));
    }

    public final Quadrilateral modelOutputToRectangle(List<Float> modelOutput) {
        Intrinsics.checkNotNullParameter(modelOutput, "modelOutput");
        Quadrilateral quadrilateral$capturesdk_productionRelease = getQuadrilateral$capturesdk_productionRelease(modelOutput);
        Point minPoint = getMinPoint(quadrilateral$capturesdk_productionRelease);
        Point maxPoint = getMaxPoint(quadrilateral$capturesdk_productionRelease);
        return new Quadrilateral(new Point(minPoint.getX(), minPoint.getY()), new Point(maxPoint.getX(), minPoint.getY()), new Point(maxPoint.getX(), maxPoint.getY()), new Point(minPoint.getX(), maxPoint.getY()));
    }

    public final Bitmap rotateBitmap$capturesdk_productionRelease(Bitmap srcBitmap, float angle) {
        Intrinsics.checkNotNullParameter(srcBitmap, "srcBitmap");
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        Bitmap createBitmap = Bitmap.createBitmap(srcBitmap, 0, 0, srcBitmap.getWidth(), srcBitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(srcBitmap, …map.height, matrix, true)");
        return createBitmap;
    }

    public final byte[] bitmapToByteArray$capturesdk_productionRelease(Bitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(imageBitmap, "imageBitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        imageBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "stream.toByteArray()");
        return byteArray;
    }

    public final List<Float> scaleIddModelCoordinates$capturesdk_productionRelease(List<Float> modelOutput, Dimension output, Dimension input) {
        Intrinsics.checkNotNullParameter(modelOutput, "modelOutput");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(input, "input");
        if (modelOutput.size() == 12) {
            LoggerKt.logDetailed("SDLT_IU", "scaleIddModelCoordinates > before: " + modelOutput);
            float w = (float) (output.getW() / input.getW());
            float h = (float) (output.getH() / input.getH());
            Iterator it = CollectionsKt.arrayListOf(0, 3, 6, 9).iterator();
            while (it.hasNext()) {
                Integer index = (Integer) it.next();
                Intrinsics.checkNotNullExpressionValue(index, "index");
                modelOutput.set(index.intValue(), Float.valueOf(modelOutput.get(index.intValue()).floatValue() * w));
            }
            Iterator it2 = CollectionsKt.arrayListOf(1, 4, 7, 10).iterator();
            while (it2.hasNext()) {
                Integer index2 = (Integer) it2.next();
                Intrinsics.checkNotNullExpressionValue(index2, "index");
                modelOutput.set(index2.intValue(), Float.valueOf(modelOutput.get(index2.intValue()).floatValue() * h));
            }
            LoggerKt.logDetailed("SDLT_IU", "scaleIddModelCoordinates > after: " + modelOutput);
            return modelOutput;
        }
        LoggerKt.logDetailed("SDLT_IU", "scaleIddModelCoordinates > modelOutput size check failed, size: " + modelOutput.size());
        return modelOutput;
    }

    public final Bitmap getDownScaledBitmap(Bitmap originalBitmap, int maxResolution) {
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        LoggerKt.logDetailed("SDLT_IU", "downScaleBitmap called maxResolution: " + maxResolution);
        if (originalBitmap.getWidth() <= maxResolution) {
            maxResolution = originalBitmap.getWidth();
        }
        return getResizedBitmap(originalBitmap, maxResolution);
    }

    public final Float getImageRotatableAngle(FinalOutputProcessData finalOutputProcessData) {
        Float f;
        Face face;
        Intrinsics.checkNotNullParameter(finalOutputProcessData, "finalOutputProcessData");
        ArrayList<Face> face2 = finalOutputProcessData.getFace();
        if (face2 == null || (face = (Face) CollectionsKt.first((List) face2)) == null || (f = face.getRotatingAngle()) == null) {
            f = null;
        } else {
            f.floatValue();
        }
        if (!finalOutputProcessData.getFaceFound() || Intrinsics.areEqual(f, 0.0f)) {
            return null;
        }
        return f;
    }

    public final Bitmap rotateImage$capturesdk_productionRelease(Bitmap bitmap, float rotationAngle) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        LoggerKt.logDetailed("SDLT_IU", "rotateImage called");
        Matrix matrix = new Matrix();
        matrix.postRotate(rotationAngle);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(bitmap, 0, …ap.height, matrix, false)");
        return createBitmap;
    }

    public final Bitmap postCornerProcessing$capturesdk_productionRelease(Bitmap downScaledBitmap, Bitmap originalBitmap, float[] iddModelOutput, double perspectiveCropRatio) {
        Intrinsics.checkNotNullParameter(downScaledBitmap, "downScaledBitmap");
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        Intrinsics.checkNotNullParameter(iddModelOutput, "iddModelOutput");
        LoggerKt.logDetailed("SDLT_IU", "postCornerProcessing called");
        List<List<Double>> detectedCorners = OpenCvUtilsKt.getDetectedCorners(iddModelOutput);
        LoggerKt.logDetailed("SDLT_IU", "postProcess - downScaledBitmap: " + downScaledBitmap.getWidth() + "x" + downScaledBitmap.getHeight() + " |  originalBitmap: " + originalBitmap.getWidth() + "x" + originalBitmap.getHeight() + " | detectedCorners: " + detectedCorners);
        Mat mat = new Mat();
        org.socure.android.Utils.bitmapToMat(downScaledBitmap, mat);
        Mat mat2 = new Mat();
        org.socure.android.Utils.bitmapToMat(originalBitmap, mat2);
        double dimenRatio = OpenCvUtilsKt.dimenRatio(mat, mat2, DIMEN.HEIGHT);
        double dimenRatio2 = OpenCvUtilsKt.dimenRatio(mat, mat2, DIMEN.WIDTH);
        mat.release();
        Mat cropAndPerspectiveTransform = OpenCvUtilsKt.cropAndPerspectiveTransform(mat2, detectedCorners, dimenRatio, dimenRatio2, perspectiveCropRatio);
        mat2.release();
        return OpenCvUtilsKt.bitmapFromMat(cropAndPerspectiveTransform);
    }

    public final Bitmap cropDocFromBitmap$capturesdk_productionRelease(List<Float> regionList, Bitmap image, double perspectiveCropRatio) {
        Intrinsics.checkNotNullParameter(regionList, "regionList");
        Intrinsics.checkNotNullParameter(image, "image");
        Mat mat = new Mat();
        org.socure.android.Utils.bitmapToMat(image, mat);
        Mat cropAndPerspectiveTransform = OpenCvUtilsKt.cropAndPerspectiveTransform(mat, OpenCvUtilsKt.getDetectedCorners(CollectionsKt.toFloatArray(regionList)), 1.0d, 1.0d, perspectiveCropRatio);
        mat.release();
        return OpenCvUtilsKt.bitmapFromMat(cropAndPerspectiveTransform);
    }

    public final Bitmap processForDebugImage$capturesdk_productionRelease(float[] iddModelOutput, Bitmap scaledBitmap, float cornerExpansionPercentage) {
        Intrinsics.checkNotNullParameter(scaledBitmap, "scaledBitmap");
        LoggerKt.logDetailed("SDLT_IU", "processForDebugImage called");
        if (Utils.INSTANCE.showDebugImage$capturesdk_productionRelease()) {
            return getDebugBmp(scaledBitmap, iddModelOutput, cornerExpansionPercentage);
        }
        LoggerKt.logDetailed("SDLT_IU", "Not creating debug image");
        return null;
    }

    public final Dimension getDimens$capturesdk_productionRelease(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new Dimension(bitmap.getWidth(), bitmap.getHeight());
    }

    public final Quadrilateral getQuadrilateral$capturesdk_productionRelease(List<Float> coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (coordinates.size() == 12) {
            return new Quadrilateral(new Point(coordinates.get(0).floatValue(), coordinates.get(1).floatValue()), new Point(coordinates.get(3).floatValue(), coordinates.get(4).floatValue()), new Point(coordinates.get(6).floatValue(), coordinates.get(7).floatValue()), new Point(coordinates.get(9).floatValue(), coordinates.get(10).floatValue()));
        }
        return new Quadrilateral(new Point(0.0f, 0.0f), new Point(0.0f, 0.0f), new Point(0.0f, 0.0f), new Point(0.0f, 0.0f));
    }

    public final Bitmap cropDocWithPaddingIfEnabled(Bitmap image, boolean isAutoCapture, boolean isCornerProcessed, List<DetectionMetric> metrics) {
        Object obj;
        Intrinsics.checkNotNullParameter(image, "image");
        if (isAutoCapture && isCornerProcessed && isCornerExpansionEnabled()) {
            if (metrics != null) {
                Iterator<T> it = metrics.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    DetectionMetric detectionMetric = (DetectionMetric) obj;
                    if (detectionMetric.getDetectionType() == DetectionType.CORNER && detectionMetric.getCheckPassed() && detectionMetric.getExpansionPercentage() > 0.0f) {
                        break;
                    }
                }
                DetectionMetric detectionMetric2 = (DetectionMetric) obj;
                if (detectionMetric2 != null) {
                    LoggerKt.logDetailed("SDLT_IU", "crop padded image - success");
                    ImageUtils imageUtils = INSTANCE;
                    List<Float> expandCoordinatesIfApplicable = imageUtils.expandCoordinatesIfApplicable(CollectionsKt.toMutableList((Collection) detectionMetric2.getRegionList()), imageUtils.isCornerExpansionEnabled(), detectionMetric2.getExpansionPercentage());
                    Bitmap cropDocFromBitmap$capturesdk_productionRelease = imageUtils.cropDocFromBitmap$capturesdk_productionRelease(expandCoordinatesIfApplicable, image, getCropDocAspectRatio$default(imageUtils, expandCoordinatesIfApplicable, false, 2, null));
                    if (cropDocFromBitmap$capturesdk_productionRelease != null) {
                        return cropDocFromBitmap$capturesdk_productionRelease;
                    }
                }
            }
            LoggerKt.logDetailed("SDLT_IU", "crop padded image: failed due to corner metrics not found");
            return null;
        }
        LoggerKt.logDetailed("SDLT_IU", "crop padded image: check not passed - isAutoCapture: " + isAutoCapture + ", isCornerProcessed: " + isCornerProcessed + ", isCornerExpansionEnabled: " + isCornerExpansionEnabled());
        return null;
    }

    private final float[] toIddModelFloatArray(Quadrilateral quad, float[] modelOutput) {
        float[] fArr = (float[]) modelOutput.clone();
        fArr[0] = quad.getTopLeft().getX();
        fArr[1] = quad.getTopLeft().getY();
        fArr[3] = quad.getTopRight().getX();
        fArr[4] = quad.getTopRight().getY();
        fArr[6] = quad.getBottomRight().getX();
        fArr[7] = quad.getBottomRight().getY();
        fArr[9] = quad.getBottomLeft().getX();
        fArr[10] = quad.getBottomLeft().getY();
        return fArr;
    }

    public final List<Float> expandCoordinatesIfApplicable(List<Float> modelOutputList, boolean isExpansionEnabled, float expansionPercentage) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        if (!isExpansionEnabled) {
            return modelOutputList;
        }
        Quadrilateral quadrilateral$capturesdk_productionRelease = getQuadrilateral$capturesdk_productionRelease(modelOutputList);
        return ArraysKt.toMutableList(toIddModelFloatArray(expandQuadrilateral$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease, getExpansionOffset$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease, expansionPercentage)), CollectionsKt.toFloatArray(modelOutputList)));
    }

    public final Quadrilateral expandQuadrilateral$capturesdk_productionRelease(Quadrilateral quad, float offset) {
        Intrinsics.checkNotNullParameter(quad, "quad");
        Line parallelLine$capturesdk_productionRelease = getParallelLine$capturesdk_productionRelease(quad.topEdge(), offset);
        Line parallelLine$capturesdk_productionRelease2 = getParallelLine$capturesdk_productionRelease(quad.rightEdge(), offset);
        float f = (-1) * offset;
        Line parallelLine$capturesdk_productionRelease3 = getParallelLine$capturesdk_productionRelease(quad.bottomEdge(), f);
        Line parallelLine$capturesdk_productionRelease4 = getParallelLine$capturesdk_productionRelease(quad.leftEdge(), f);
        Point intersect$capturesdk_productionRelease = intersect$capturesdk_productionRelease(parallelLine$capturesdk_productionRelease, parallelLine$capturesdk_productionRelease4);
        Point intersect$capturesdk_productionRelease2 = intersect$capturesdk_productionRelease(parallelLine$capturesdk_productionRelease, parallelLine$capturesdk_productionRelease2);
        Point intersect$capturesdk_productionRelease3 = intersect$capturesdk_productionRelease(parallelLine$capturesdk_productionRelease3, parallelLine$capturesdk_productionRelease2);
        Point intersect$capturesdk_productionRelease4 = intersect$capturesdk_productionRelease(parallelLine$capturesdk_productionRelease3, parallelLine$capturesdk_productionRelease4);
        if (intersect$capturesdk_productionRelease != null && intersect$capturesdk_productionRelease2 != null && intersect$capturesdk_productionRelease3 != null && intersect$capturesdk_productionRelease4 != null) {
            LoggerKt.logD("SDLT_IU", "expandQuadrilateral: expansion success");
            return new Quadrilateral(intersect$capturesdk_productionRelease, intersect$capturesdk_productionRelease2, intersect$capturesdk_productionRelease3, intersect$capturesdk_productionRelease4);
        }
        LoggerKt.logD("SDLT_IU", "expandQuadrilateral: expansion failed- tl: " + intersect$capturesdk_productionRelease + ", tr: " + intersect$capturesdk_productionRelease2 + ", br: " + intersect$capturesdk_productionRelease4 + ", bl: " + intersect$capturesdk_productionRelease4);
        return quad;
    }

    public final float getExpansionOffset$capturesdk_productionRelease(Quadrilateral quad, float expansionPercentage) {
        Intrinsics.checkNotNullParameter(quad, "quad");
        return (float) ((expansionPercentage / 100) * ((calculateEdgeLength$capturesdk_productionRelease(quad.topEdge().getStart(), quad.topEdge().getEnd()) + calculateEdgeLength$capturesdk_productionRelease(quad.bottomEdge().getStart(), quad.bottomEdge().getEnd())) / 2));
    }

    public static /* synthetic */ double getCropDocAspectRatio$default(ImageUtils imageUtils, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return imageUtils.getCropDocAspectRatio(list, z);
    }

    public final double getCropDocAspectRatio(List<Float> modelOutputList, boolean isPortrait) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        Quadrilateral quadrilateral$capturesdk_productionRelease = getQuadrilateral$capturesdk_productionRelease(modelOutputList);
        double d = 2;
        double calculateEdgeLength$capturesdk_productionRelease = (calculateEdgeLength$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease.topEdge().getStart(), quadrilateral$capturesdk_productionRelease.topEdge().getEnd()) + calculateEdgeLength$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease.bottomEdge().getStart(), quadrilateral$capturesdk_productionRelease.bottomEdge().getEnd())) / d;
        double calculateEdgeLength$capturesdk_productionRelease2 = (calculateEdgeLength$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease.leftEdge().getStart(), quadrilateral$capturesdk_productionRelease.leftEdge().getEnd()) + calculateEdgeLength$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease.rightEdge().getStart(), quadrilateral$capturesdk_productionRelease.rightEdge().getEnd())) / d;
        return isPortrait ? calculateEdgeLength$capturesdk_productionRelease2 / calculateEdgeLength$capturesdk_productionRelease : calculateEdgeLength$capturesdk_productionRelease / calculateEdgeLength$capturesdk_productionRelease2;
    }

    public final Pair<List<Float>, Dimension> getCornersAndParentDimenForDrawingRect$capturesdk_productionRelease(DetectionMetric detectionMetric, GuidingBox guidingBox) {
        Intrinsics.checkNotNullParameter(guidingBox, "guidingBox");
        List<Float> regionList = detectionMetric != null ? detectionMetric.getRegionList() : null;
        Dimension processedBitmapDimension = detectionMetric != null ? detectionMetric.getProcessedBitmapDimension() : null;
        if (regionList == null || processedBitmapDimension == null) {
            regionList = calculateCornersForGuidingBox$capturesdk_productionRelease(guidingBox);
            processedBitmapDimension = guidingBox.getParentDimension();
        }
        return new Pair<>(regionList, processedBitmapDimension);
    }

    public final List<Float> calculateCornersForGuidingBox$capturesdk_productionRelease(GuidingBox guidingBox) {
        Intrinsics.checkNotNullParameter(guidingBox, "guidingBox");
        float leftTopX = guidingBox.getLeftTopX();
        float leftTopY = guidingBox.getLeftTopY();
        float width = guidingBox.getWidth();
        float height = guidingBox.getHeight();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(leftTopX));
        arrayList.add(Float.valueOf(leftTopY));
        Float valueOf = Float.valueOf(0.0f);
        arrayList.add(valueOf);
        float f = width + leftTopX;
        arrayList.add(Float.valueOf(f));
        arrayList.add(Float.valueOf(leftTopY));
        arrayList.add(valueOf);
        arrayList.add(Float.valueOf(f));
        float f2 = leftTopY + height;
        arrayList.add(Float.valueOf(f2));
        arrayList.add(valueOf);
        arrayList.add(Float.valueOf(leftTopX));
        arrayList.add(Float.valueOf(f2));
        arrayList.add(valueOf);
        return arrayList;
    }

    private final GuidingBox expandGbIfRequire(GuidingBox guidingBox, CaptureType captureType) {
        return (isCornerExpansionEnabled() && captureType == CaptureType.MANUAL) ? expandGuidingBox$capturesdk_productionRelease(guidingBox, 7.5f) : guidingBox;
    }

    public final double calculateEdgeLength$capturesdk_productionRelease(Point start, Point end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return Math.sqrt(((end.getX() - start.getX()) * (end.getX() - start.getX())) + ((end.getY() - start.getY()) * (end.getY() - start.getY())));
    }

    public final GuidingBox expandGuidingBox$capturesdk_productionRelease(GuidingBox gb, float expansionPercentage) {
        Intrinsics.checkNotNullParameter(gb, "gb");
        Point point = new Point(gb.getLeftTopX(), gb.getLeftTopY());
        Point point2 = new Point(point.getX() + gb.getWidth(), point.getY());
        Point point3 = new Point(point2.getX(), point2.getY() + gb.getHeight());
        Quadrilateral quadrilateral = new Quadrilateral(point, point2, point3, new Point(point.getX(), point3.getY()));
        float x = (float) ((point.getX() * 100) / calculateEdgeLength$capturesdk_productionRelease(quadrilateral.topEdge().getStart(), quadrilateral.topEdge().getEnd()));
        if (x <= expansionPercentage) {
            expansionPercentage = x;
        }
        Quadrilateral expandQuadrilateral$capturesdk_productionRelease = expandQuadrilateral$capturesdk_productionRelease(quadrilateral, getExpansionOffset$capturesdk_productionRelease(quadrilateral, expansionPercentage));
        return new GuidingBox((int) calculateEdgeLength$capturesdk_productionRelease(expandQuadrilateral$capturesdk_productionRelease.topEdge().getStart(), expandQuadrilateral$capturesdk_productionRelease.topEdge().getEnd()), (int) calculateEdgeLength$capturesdk_productionRelease(expandQuadrilateral$capturesdk_productionRelease.leftEdge().getStart(), expandQuadrilateral$capturesdk_productionRelease.leftEdge().getEnd()), (int) expandQuadrilateral$capturesdk_productionRelease.getTopLeft().getX(), (int) expandQuadrilateral$capturesdk_productionRelease.getTopLeft().getY(), gb.getParentDimension());
    }

    public final Line getParallelLine$capturesdk_productionRelease(Line line, float offset) {
        Intrinsics.checkNotNullParameter(line, "line");
        float x = line.getStart().getX() - line.getEnd().getX();
        float y = line.getStart().getY() - line.getEnd().getY();
        float pow = offset / ((float) Math.pow((x * x) + (y * y), 0.5f));
        float f = (-y) * pow;
        float f2 = x * pow;
        return new Line(new Point(line.getStart().getX() + f, line.getStart().getY() + f2), new Point(f + line.getEnd().getX(), f2 + line.getEnd().getY()));
    }

    public final Point intersect$capturesdk_productionRelease(Line line1, Line line2) {
        Intrinsics.checkNotNullParameter(line1, "line1");
        Intrinsics.checkNotNullParameter(line2, "line2");
        if ((line1.getStart().getX() == line1.getEnd().getX() && line1.getStart().getY() == line1.getStart().getY()) || (line2.getStart().getX() == line2.getEnd().getX() && line2.getStart().getY() == line2.getEnd().getY())) {
            return null;
        }
        float y = ((line2.getEnd().getY() - line2.getStart().getY()) * (line1.getEnd().getX() - line1.getStart().getX())) - ((line2.getEnd().getX() - line2.getStart().getX()) * (line1.getEnd().getY() - line1.getStart().getY()));
        if (y == 0.0f) {
            return null;
        }
        float x = (((line2.getEnd().getX() - line2.getStart().getX()) * (line1.getStart().getY() - line2.getStart().getY())) - ((line2.getEnd().getY() - line2.getStart().getY()) * (line1.getStart().getX() - line2.getStart().getX()))) / y;
        return new Point(line1.getStart().getX() + ((line1.getEnd().getX() - line1.getStart().getX()) * x), line1.getStart().getY() + (x * (line1.getEnd().getY() - line1.getStart().getY())));
    }
}
