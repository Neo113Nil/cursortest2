package com.socure.docv.capturesdk.core.processor.image;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.face.Face;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.stepup.SelfieMetrics;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.core.extractor.FaceReader;
import com.socure.docv.capturesdk.core.extractor.IReader;
import com.socure.docv.capturesdk.core.extractor.model.BaseExtractedData;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.SelfieRange;
import com.socure.docv.capturesdk.core.pipeline.model.SelfieRangeType;
import com.socure.docv.capturesdk.core.processor.interfaces.IProcessor;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.IResult;
import com.socure.docv.capturesdk.core.processor.model.ProcessOutput;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.DebugImageCallback;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;

/* compiled from: SelfieFaceProcessor.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\nH\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0002J#\u0010%\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0000¢\u0006\u0002\b*J\u0018\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.H\u0016J\u0015\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0006H\u0000¢\u0006\u0002\b2J\b\u00103\u001a\u000200H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u00064"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/image/SelfieFaceProcessor;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;)V", "debugImageCallback", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/DebugImageCallback;", "faceReader", "Lcom/socure/docv/capturesdk/core/extractor/FaceReader;", "guidingBoxRect", "Landroid/graphics/Rect;", "getGuidingBoxRect$capturesdk_productionRelease", "()Landroid/graphics/Rect;", "scaleX", "", "Ljava/lang/Float;", "scaleY", "analyseForSelfie", "Lcom/socure/docv/capturesdk/core/processor/model/ProcessOutput;", OptionalModuleUtils.FACE, "Lcom/google/mlkit/vision/face/Face;", "imageWidth", "imageHeight", "analyseForSelfie$capturesdk_productionRelease", "bitmapWithCorners", "Landroid/graphics/Bitmap;", "bitmap", "iddModelOutput", "", "bitmapWithCorners$capturesdk_productionRelease", "getFacePositionDetectionType", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "faceRect", "getFaceRatio", "getFaceRatio$capturesdk_productionRelease", "getGuidingBox", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;", "isEulerAnglesInRange", "", "selfieFaceAngleRanges", "", "Lcom/socure/docv/capturesdk/core/pipeline/model/SelfieRange;", "isEulerAnglesInRange$capturesdk_productionRelease", "process", "Lcom/socure/docv/capturesdk/core/processor/model/IResult;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "setDic", "", "dic", "setDic$capturesdk_productionRelease", "stop", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SelfieFaceProcessor implements IProcessor {
    public static final int $stable = 8;
    private final ApplicationComponent applicationComponent;
    private DebugImageCallback debugImageCallback;
    private FaceReader faceReader;
    private final Rect guidingBoxRect;
    private Float scaleX;
    private Float scaleY;

    public SelfieFaceProcessor(ApplicationComponent applicationComponent) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.applicationComponent = applicationComponent;
        GuidingBox guidingBox = getGuidingBox();
        this.guidingBoxRect = new Rect(guidingBox.getLeftTopX(), guidingBox.getLeftTopY(), guidingBox.getLeftTopX() + guidingBox.getWidth(), guidingBox.getLeftTopY() + guidingBox.getHeight());
    }

    private final GuidingBox getGuidingBox() {
        return this.applicationComponent.getGuidingBoxViewDimension().getGuidingBox();
    }

    public final void setDic$capturesdk_productionRelease(DebugImageCallback dic) {
        Intrinsics.checkNotNullParameter(dic, "dic");
        if (Utils.INSTANCE.showDebugImage$capturesdk_productionRelease()) {
            this.debugImageCallback = dic;
        }
    }

    /* renamed from: getGuidingBoxRect$capturesdk_productionRelease, reason: from getter */
    public final Rect getGuidingBoxRect() {
        return this.guidingBoxRect;
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public IResult process(Bitmap bitmap, CaptureType captureType) {
        DebugImageCallback debugImageCallback;
        Rect boundingBox;
        DebugImageCallback debugImageCallback2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap downScaledBitmap = ImageUtils.INSTANCE.getDownScaledBitmap(bitmap, 300);
        if (captureType == CaptureType.AUTO_ANALYSIS && (debugImageCallback2 = this.debugImageCallback) != null) {
            debugImageCallback2.showImage(downScaledBitmap);
        }
        FaceReader faceReader = new FaceReader(downScaledBitmap, new IReader() { // from class: com.socure.docv.capturesdk.core.processor.image.SelfieFaceProcessor$process$1
            @Override // com.socure.docv.capturesdk.core.extractor.IReader
            public void onRead(BaseExtractedData data, boolean found) {
                LoggerKt.logD("SDLT_SFP", "Face reader response for selfie - face found?: " + found);
            }
        }, 1);
        this.faceReader = faceReader;
        Face readBlocking = faceReader.readBlocking(350L);
        Bitmap bitmap2 = null;
        Float[] fArr = (readBlocking == null || (boundingBox = readBlocking.getBoundingBox()) == null) ? null : new Float[]{Float.valueOf(boundingBox.left), Float.valueOf(boundingBox.top), Float.valueOf(0.0f), Float.valueOf(boundingBox.right), Float.valueOf(boundingBox.top), Float.valueOf(0.0f), Float.valueOf(boundingBox.right), Float.valueOf(boundingBox.bottom), Float.valueOf(0.0f), Float.valueOf(boundingBox.left), Float.valueOf(boundingBox.bottom), Float.valueOf(0.0f)};
        if (fArr == null || !Utils.INSTANCE.showDebugImage$capturesdk_productionRelease()) {
            LoggerKt.logDetailed("SDLT_SFP", "Not creating debug image");
        } else {
            bitmap2 = bitmapWithCorners$capturesdk_productionRelease(downScaledBitmap, ArraysKt.toFloatArray(fArr));
        }
        if (captureType == CaptureType.AUTO_ANALYSIS && (debugImageCallback = this.debugImageCallback) != null) {
            if (bitmap2 == null) {
                bitmap2 = downScaledBitmap;
            }
            debugImageCallback.showImage(bitmap2);
        }
        ProcessOutput analyseForSelfie$capturesdk_productionRelease = analyseForSelfie$capturesdk_productionRelease(readBlocking, downScaledBitmap.getWidth(), downScaledBitmap.getHeight());
        LoggerKt.logDetailed("SDLT_SFP", "processing time: " + (System.currentTimeMillis() - currentTimeMillis));
        return analyseForSelfie$capturesdk_productionRelease;
    }

    public final Bitmap bitmapWithCorners$capturesdk_productionRelease(Bitmap bitmap, float[] iddModelOutput) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(iddModelOutput, "iddModelOutput");
        LoggerKt.logDetailed("SDLT_SFP", "bitmapWithCorners");
        if (this.scaleX == null || this.scaleY == null) {
            return null;
        }
        ImageUtils imageUtils = ImageUtils.INSTANCE;
        GuidingBox guidingBox = getGuidingBox();
        Float f = this.scaleX;
        Intrinsics.checkNotNull(f);
        float floatValue = f.floatValue();
        Float f2 = this.scaleY;
        Intrinsics.checkNotNull(f2);
        return imageUtils.getSelfieDebugBmp(bitmap, iddModelOutput, guidingBox, floatValue, f2.floatValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x013e, code lost:
    
        if (r14 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ProcessOutput analyseForSelfie$capturesdk_productionRelease(Face face, float imageWidth, float imageHeight) {
        DetectionCallback detectionCallback;
        SelfieMetrics selfieMetrics = new SelfieMetrics(null, null, null, null, null, null, null, 127, null);
        if (face != null) {
            if (this.scaleX == null || this.scaleY == null) {
                this.scaleX = Float.valueOf(((float) getGuidingBox().getParentDimension().getW()) / imageWidth);
                this.scaleY = Float.valueOf(((float) getGuidingBox().getParentDimension().getH()) / imageHeight);
            }
            Rect boundingBox = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox, "face.boundingBox");
            Float f = this.scaleX;
            Intrinsics.checkNotNull(f);
            float floatValue = f.floatValue();
            Float f2 = this.scaleY;
            Intrinsics.checkNotNull(f2);
            RectF translateRect = UtilsKt.translateRect(boundingBox, floatValue, f2.floatValue());
            Rect rect = new Rect((int) translateRect.left, (int) translateRect.top, (int) translateRect.right, (int) translateRect.bottom);
            LoggerKt.logD("SDLT_SFP", "Guiding box: " + this.guidingBoxRect + " || face: " + rect);
            selfieMetrics.setPitch(Double.valueOf((double) face.getHeadEulerAngleX()));
            selfieMetrics.setYaw(Double.valueOf((double) face.getHeadEulerAngleY()));
            selfieMetrics.setRoll(Double.valueOf((double) face.getHeadEulerAngleZ()));
            selfieMetrics.setFaceWidth(Integer.valueOf(rect.width()));
            selfieMetrics.setFaceHeight(Integer.valueOf(rect.height()));
            selfieMetrics.setFaceRatio(Float.valueOf(getFaceRatio$capturesdk_productionRelease(rect)));
            Rect expandRect$capturesdk_productionRelease = ImageUtils.INSTANCE.expandRect$capturesdk_productionRelease(this.guidingBoxRect, 30);
            if (getFaceRatio$capturesdk_productionRelease(rect) < 0.8d) {
                LoggerKt.logD("SDLT_SFP", "Face is big");
                detectionCallback = DetectionCallback.FACE_IS_BIG;
            } else if (expandRect$capturesdk_productionRelease.contains(rect)) {
                LoggerKt.logD("SDLT_SFP", "Face Aligned");
                if (getFaceRatio$capturesdk_productionRelease(rect) <= 2.5d) {
                    LoggerKt.logD("SDLT_SFP", "Face Size Check Passed");
                    if (isEulerAnglesInRange$capturesdk_productionRelease(face, SessionManager.INSTANCE.getSelfieFaceAngleRanges())) {
                        LoggerKt.logD("SDLT_SFP", "Euler Angel in Range");
                        detectionCallback = DetectionCallback.READY_FOR_SELFIE_CAPTURE;
                    } else {
                        LoggerKt.logD("SDLT_SFP", "Euler Angel Not in Range");
                        detectionCallback = DetectionCallback.FACE_ORIENTATION_WRONG;
                    }
                } else {
                    LoggerKt.logD("SDLT_SFP", "Face Size is small");
                    detectionCallback = DetectionCallback.FACE_TOO_SMALL;
                }
            } else {
                LoggerKt.logD("SDLT_SFP", "Face Not Aligned");
                detectionCallback = getFacePositionDetectionType(rect, this.guidingBoxRect);
            }
        }
        LoggerKt.logD("SDLT_SFP", "Face Not Found");
        detectionCallback = DetectionCallback.FACE_NOT_FOUND;
        DetectionCallback detectionCallback2 = detectionCallback;
        selfieMetrics.setDisplayText(UtilsKt.getDisplayText(detectionCallback2));
        return new ProcessOutput(new DetectionMetric(DetectionType.SELFIE, false, null, null, null, 0.0f, null, detectionCallback2, selfieMetrics, null, 636, null), null, null, 6, null);
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public void stop() {
        FaceReader faceReader = this.faceReader;
        if (faceReader != null) {
            faceReader.stop();
        }
    }

    public final float getFaceRatio$capturesdk_productionRelease(Rect faceRect) {
        Intrinsics.checkNotNullParameter(faceRect, "faceRect");
        GuidingBox guidingBox = getGuidingBox();
        float width = guidingBox.getWidth() * guidingBox.getHeight();
        float width2 = faceRect.width() * faceRect.height();
        float f = width / width2;
        LoggerKt.logD("SDLT_SFP", "Ratio: " + width + "/" + width2 + "=" + f);
        return f;
    }

    public final boolean isEulerAnglesInRange$capturesdk_productionRelease(Face face, List<SelfieRange> selfieFaceAngleRanges) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(selfieFaceAngleRanges, "selfieFaceAngleRanges");
        LoggerKt.logD("SDLT_SFP", "X: " + face.getHeadEulerAngleX() + ", Y: " + face.getHeadEulerAngleY() + ", Z: " + face.getHeadEulerAngleZ());
        List<SelfieRange> list = selfieFaceAngleRanges;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((SelfieRange) obj2).getType() == SelfieRangeType.PITCH) {
                break;
            }
        }
        IntRange selfieRange = UtilsKt.getSelfieRange((SelfieRange) obj2);
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (((SelfieRange) obj3).getType() == SelfieRangeType.ROLL) {
                break;
            }
        }
        IntRange selfieRange2 = UtilsKt.getSelfieRange((SelfieRange) obj3);
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((SelfieRange) next).getType() == SelfieRangeType.YAW) {
                obj = next;
                break;
            }
        }
        IntRange selfieRange3 = UtilsKt.getSelfieRange((SelfieRange) obj);
        int first = selfieRange.getFirst();
        int last = selfieRange.getLast();
        int roundToInt = MathKt.roundToInt(face.getHeadEulerAngleX());
        if (first > roundToInt || roundToInt > last) {
            return false;
        }
        int first2 = selfieRange2.getFirst();
        int last2 = selfieRange2.getLast();
        int roundToInt2 = MathKt.roundToInt(face.getHeadEulerAngleY());
        if (first2 > roundToInt2 || roundToInt2 > last2) {
            return false;
        }
        int first3 = selfieRange3.getFirst();
        int last3 = selfieRange3.getLast();
        int roundToInt3 = MathKt.roundToInt(face.getHeadEulerAngleZ());
        return first3 <= roundToInt3 && roundToInt3 <= last3;
    }

    private final DetectionCallback getFacePositionDetectionType(Rect faceRect, Rect guidingBoxRect) {
        int centerX = guidingBoxRect.centerX() - faceRect.centerX();
        int centerY = guidingBoxRect.centerY() - faceRect.centerY();
        if (Math.abs(centerX) > Math.abs(centerY)) {
            if (centerX < 0) {
                return DetectionCallback.FACE_AT_RIGHT;
            }
            return DetectionCallback.FACE_AT_LEFT;
        }
        if (centerY < 0) {
            return DetectionCallback.FACE_AT_DOWN;
        }
        return DetectionCallback.FACE_AT_UP;
    }
}
