package com.socure.docv.capturesdk.core.processor.frame;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.utils.OpenCvUtilsKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.core.external.ml.impl.CornerDetectorML;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor;
import com.socure.docv.capturesdk.core.processor.interfaces.IProcessor;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.LicenseProcessingData;
import com.socure.docv.capturesdk.core.processor.model.PassportExpansionData;
import com.socure.docv.capturesdk.core.processor.model.ProcessOutput;
import com.socure.docv.capturesdk.core.processor.model.ProcessResult;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.DebugImageCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: CornerProcessor.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/frame/CornerProcessor;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;)V", "debugImageCallback", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/DebugImageCallback;", "modelProcessor", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IModelProcessor;", "orientationConfidence", "", "getScanType", "()Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "getGuidingBox", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;", "notifyDebugCallback", "", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "debugImage", "Landroid/graphics/Bitmap;", "paddedScaledDownBitmap", "process", "Lcom/socure/docv/capturesdk/core/processor/model/ProcessOutput;", "bitmap", "setDic", "dic", "setDic$capturesdk_productionRelease", "stop", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CornerProcessor implements IProcessor {
    public static final int $stable = 8;
    private final ApplicationComponent applicationComponent;
    private DebugImageCallback debugImageCallback;
    private final IModelProcessor modelProcessor;
    private final float orientationConfidence;
    private final ScanType scanType;

    public CornerProcessor(ApplicationComponent applicationComponent, ScanType scanType) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        this.applicationComponent = applicationComponent;
        this.scanType = scanType;
        this.modelProcessor = new CornerDetectorML(applicationComponent);
        this.orientationConfidence = applicationComponent.getCornerModelProvider().get().getConfidence();
    }

    public final ScanType getScanType() {
        return this.scanType;
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

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v52, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, kotlin.Pair] */
    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProcessOutput process(Bitmap bitmap, CaptureType captureType) {
        T t;
        long j;
        boolean z;
        float f;
        float[] fArr;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        long currentTimeMillis = System.currentTimeMillis();
        LoggerKt.logDetailed("SDLT_CD", "process called");
        Bitmap cropDoc = this.scanType == ScanType.PASSPORT ? ImageUtils.INSTANCE.cropDoc(bitmap, CornerProcessorUtils.INSTANCE.getGuidingViewDimension(getGuidingBox()), captureType) : bitmap;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = ImageUtils.INSTANCE.getSquaredBitmap(cropDoc);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ?? createScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objectRef.element, 256, 256, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(\n    …           true\n        )");
        objectRef2.element = createScaledBitmap;
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = CornerProcessorUtils.INSTANCE.processBitmap((Bitmap) objectRef2.element, this.modelProcessor);
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        Pair pair = (Pair) objectRef3.element;
        if (pair != null && (fArr = (float[]) pair.getSecond()) != null) {
            List<Float> mutableList = ArraysKt.toMutableList(fArr);
            t = mutableList;
        }
        t = new ArrayList();
        objectRef4.element = t;
        if (CornerProcessorUtils.INSTANCE.isValidCoordinates((List) objectRef4.element)) {
            if (this.scanType == ScanType.PASSPORT) {
                objectRef4.element = CornerProcessorUtils.INSTANCE.getExpandedPassportCoordinates((List) objectRef4.element, new PassportExpansionData(ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease((Bitmap) objectRef.element), ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease((Bitmap) objectRef2.element), ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(cropDoc), ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(bitmap), CornerProcessorUtils.INSTANCE.getGuidingViewDimension(getGuidingBox())));
                j = currentTimeMillis;
                z = true;
            } else {
                boolean isRotationRequired = CornerProcessorUtils.INSTANCE.isRotationRequired((Pair) objectRef3.element, this.orientationConfidence);
                if (isRotationRequired) {
                    process$updateFields(objectRef, objectRef2, objectRef3, objectRef4, CornerProcessorUtils.INSTANCE.rotatedLicenseProcessResult((Bitmap) objectRef.element, 90.0f, this.modelProcessor));
                }
                if (!CornerProcessorUtils.INSTANCE.expansionAndProximityCheck((List) objectRef4.element, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(bitmap), true, 12.0f)) {
                    ImageUtils imageUtils = ImageUtils.INSTANCE;
                    Pair pair2 = (Pair) objectRef3.element;
                    notifyDebugCallback(captureType, imageUtils.processForDebugImage$capturesdk_productionRelease(pair2 != null ? (float[]) pair2.getSecond() : null, (Bitmap) objectRef2.element, 7.5f), (Bitmap) objectRef2.element);
                    ((Bitmap) objectRef.element).recycle();
                    DetectionType detectionType = DetectionType.CORNER;
                    Pair pair3 = (Pair) objectRef3.element;
                    return new ProcessOutput(new DetectionMetric(detectionType, false, Double.valueOf(OpenCvUtilsKt.calcMeasure(pair3 != null ? (float[]) pair3.getSecond() : null)), null, (List) objectRef4.element, 0.0f, null, DetectionCallback.DOCUMENT_TOO_CLOSE, null, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(bitmap), 352, null), null, null);
                }
                j = currentTimeMillis;
                process$updateFields(objectRef, objectRef2, objectRef3, objectRef4, CornerProcessorUtils.INSTANCE.getLicenseProcessedResult(isRotationRequired, new LicenseProcessingData((Bitmap) objectRef.element, (Bitmap) objectRef2.element, (Pair) objectRef3.element, (List) objectRef4.element, bitmap), this.modelProcessor));
                z = true;
            }
        } else {
            j = currentTimeMillis;
            if (this.scanType != ScanType.PASSPORT) {
                ImageUtils.INSTANCE.scaleIddModelCoordinates$capturesdk_productionRelease((List) objectRef4.element, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease((Bitmap) objectRef.element), ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease((Bitmap) objectRef2.element));
                z = true;
                objectRef4.element = CornerProcessorUtils.INSTANCE.removePadding((List) objectRef4.element, (((Bitmap) objectRef.element).getWidth() - bitmap.getWidth()) / 2, true);
            } else {
                z = true;
                LoggerKt.logDetailed("SDLT_CD", "not expanding since we are not using non-corner detected value for passport");
            }
        }
        if (CornerProcessorUtils.INSTANCE.expansionAndProximityCheck((List) objectRef4.element, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(bitmap), ImageUtils.INSTANCE.isCornerExpansionEnabled(), 7.5f)) {
            f = 7.5f;
        } else {
            float calculateAvailableExpansionPercentage = CornerProcessorUtils.INSTANCE.calculateAvailableExpansionPercentage((List) objectRef4.element, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(bitmap));
            if (calculateAvailableExpansionPercentage >= 7.5f || calculateAvailableExpansionPercentage < CornerProcessorUtils.INSTANCE.getMinimumPaddingPercentage(getGuidingBox())) {
                ImageUtils imageUtils2 = ImageUtils.INSTANCE;
                Pair pair4 = (Pair) objectRef3.element;
                notifyDebugCallback(captureType, imageUtils2.processForDebugImage$capturesdk_productionRelease(pair4 != null ? (float[]) pair4.getSecond() : null, (Bitmap) objectRef2.element, 7.5f), (Bitmap) objectRef2.element);
                ((Bitmap) objectRef.element).recycle();
                DetectionType detectionType2 = DetectionType.CORNER;
                Pair pair5 = (Pair) objectRef3.element;
                return new ProcessOutput(new DetectionMetric(detectionType2, false, Double.valueOf(OpenCvUtilsKt.calcMeasure(pair5 != null ? (float[]) pair5.getSecond() : null)), null, (List) objectRef4.element, 0.0f, null, DetectionCallback.DOCUMENT_TOO_CLOSE, null, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(bitmap), 352, null), null, null);
            }
            f = calculateAvailableExpansionPercentage;
        }
        CornerProcessorUtils cornerProcessorUtils = CornerProcessorUtils.INSTANCE;
        Pair pair6 = (Pair) objectRef3.element;
        Bitmap croppedPerspectiveCorrectedBitmap = cornerProcessorUtils.getCroppedPerspectiveCorrectedBitmap(pair6 != null ? (float[]) pair6.getSecond() : null, (List) objectRef4.element, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(bitmap), (Bitmap) objectRef.element, (Bitmap) objectRef2.element, f);
        float f2 = f;
        ImageUtils imageUtils3 = ImageUtils.INSTANCE;
        Pair pair7 = (Pair) objectRef3.element;
        Bitmap processForDebugImage$capturesdk_productionRelease = imageUtils3.processForDebugImage$capturesdk_productionRelease(pair7 != null ? (float[]) pair7.getSecond() : null, (Bitmap) objectRef2.element, f2);
        notifyDebugCallback(captureType, processForDebugImage$capturesdk_productionRelease, (Bitmap) objectRef2.element);
        ((Bitmap) objectRef.element).recycle();
        Bitmap.Config config = ((Bitmap) objectRef2.element).getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "paddedScaledDownBitmap.config");
        Bitmap copy = captureType == CaptureType.AUTO ? ((Bitmap) objectRef2.element).copy(config, ((Bitmap) objectRef2.element).isMutable()) : null;
        boolean z2 = (croppedPerspectiveCorrectedBitmap == null || !Utils.INSTANCE.cornersFound$capturesdk_productionRelease(CollectionsKt.toFloatArray((Collection) objectRef4.element))) ? false : z;
        LoggerKt.logDetailed("SDLT_CD", "TimeTaken >> " + (System.currentTimeMillis() - j));
        DetectionType detectionType3 = DetectionType.CORNER;
        Pair pair8 = (Pair) objectRef3.element;
        boolean z3 = z2;
        DetectionMetric detectionMetric = new DetectionMetric(detectionType3, z3, Double.valueOf(OpenCvUtilsKt.calcMeasure(pair8 != null ? (float[]) pair8.getSecond() : null)), null, (List) objectRef4.element, f2, copy, null, null, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(bitmap), 384, null);
        if (!z3) {
            processForDebugImage$capturesdk_productionRelease = null;
        }
        return new ProcessOutput(detectionMetric, croppedPerspectiveCorrectedBitmap, processForDebugImage$capturesdk_productionRelease);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.List] */
    private static final void process$updateFields(Ref.ObjectRef<Bitmap> objectRef, Ref.ObjectRef<Bitmap> objectRef2, Ref.ObjectRef<Pair<float[], float[]>> objectRef3, Ref.ObjectRef<List<Float>> objectRef4, ProcessResult processResult) {
        LoggerKt.logDetailed("SDLT_CD", "updateFields called");
        objectRef.element = processResult.getOutputBitmap();
        objectRef2.element = processResult.getModelProcessedBitmap();
        objectRef3.element = processResult.getModelProcessedRawData();
        objectRef4.element = processResult.getModelList();
    }

    private final void notifyDebugCallback(CaptureType captureType, Bitmap debugImage, Bitmap paddedScaledDownBitmap) {
        DebugImageCallback debugImageCallback;
        if (captureType != CaptureType.AUTO_ANALYSIS || (debugImageCallback = this.debugImageCallback) == null) {
            return;
        }
        if (debugImage == null) {
            debugImage = paddedScaledDownBitmap;
        }
        debugImageCallback.showImage(debugImage);
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public void stop() {
        this.modelProcessor.stop();
    }
}
