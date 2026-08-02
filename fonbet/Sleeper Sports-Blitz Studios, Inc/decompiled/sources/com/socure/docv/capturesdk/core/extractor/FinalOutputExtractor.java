package com.socure.docv.capturesdk.core.extractor;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.analytics.model.Face;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.core.extractor.model.BaseExtractedData;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedFace;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.FinalOutputProcessData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: FinalOutputExtractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/FinalOutputExtractor;", "", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "finalBitmap", "Landroid/graphics/Bitmap;", "metrics", "", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Landroid/graphics/Bitmap;Ljava/util/List;)V", "proceed", "", "outputCallback", "Lcom/socure/docv/capturesdk/core/extractor/FinalOutputCallback;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FinalOutputExtractor {
    private final Bitmap finalBitmap;
    private final List<DetectionMetric> metrics;
    private final ScanType scanType;

    /* compiled from: FinalOutputExtractor.kt */
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
                iArr[ScanType.PASSPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanType.SELFIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FinalOutputExtractor(ScanType scanType, Bitmap finalBitmap, List<DetectionMetric> metrics) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(finalBitmap, "finalBitmap");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.scanType = scanType;
        this.finalBitmap = finalBitmap;
        this.metrics = metrics;
    }

    public final void proceed(final FinalOutputCallback outputCallback) {
        Intrinsics.checkNotNullParameter(outputCallback, "outputCallback");
        final long currentTimeMillis = System.currentTimeMillis();
        int i = WhenMappings.$EnumSwitchMapping$0[this.scanType.ordinal()];
        if (i == 1) {
            final Bitmap downScaledBitmap = ImageUtils.INSTANCE.getDownScaledBitmap(this.finalBitmap, 300);
            new FaceReader(downScaledBitmap, new IReader() { // from class: com.socure.docv.capturesdk.core.extractor.FinalOutputExtractor$proceed$1
                @Override // com.socure.docv.capturesdk.core.extractor.IReader
                public void onRead(BaseExtractedData data, boolean found) {
                    ScanType scanType;
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    LoggerKt.logD("SDLT_FOE", "FaceReader data onRead callback in: " + currentTimeMillis2 + " ms");
                    downScaledBitmap.recycle();
                    if (data != null) {
                        scanType = this.scanType;
                        data.setScanType(scanType);
                    }
                    FinalOutputProcessData finalOutputProcessData = new FinalOutputProcessData(data, null, found, false, currentTimeMillis2, 10, null);
                    if (data != null && found && (data instanceof ExtractedFace)) {
                        UtilsKt.appendFaceDataToOutput((ExtractedFace) data, found, finalOutputProcessData);
                    } else {
                        finalOutputProcessData.setFace(CollectionsKt.arrayListOf(new Face(null, false, Double.valueOf(1.0d), null, 9, null)));
                    }
                    outputCallback.extracted(finalOutputProcessData);
                }
            }, 0, 4, null).read();
            return;
        }
        if (i == 2) {
            new BarcodeReader().read(this.finalBitmap, new IReader() { // from class: com.socure.docv.capturesdk.core.extractor.FinalOutputExtractor$proceed$2
                @Override // com.socure.docv.capturesdk.core.extractor.IReader
                public void onRead(BaseExtractedData data, boolean found) {
                    Bitmap bitmap;
                    ScanType scanType;
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    LoggerKt.logD("SDLT_FOE", "Barcode data onRead callback in: " + currentTimeMillis2 + " ms");
                    if (data != null) {
                        scanType = this.scanType;
                        data.setScanType(scanType);
                    }
                    final FinalOutputProcessData finalOutputProcessData = new FinalOutputProcessData(data, null, found, false, currentTimeMillis2, 10, null);
                    if (!found) {
                        bitmap = this.finalBitmap;
                        final FinalOutputCallback finalOutputCallback = outputCallback;
                        new FaceReader(bitmap, new IReader() { // from class: com.socure.docv.capturesdk.core.extractor.FinalOutputExtractor$proceed$2$onRead$1
                            @Override // com.socure.docv.capturesdk.core.extractor.IReader
                            public void onRead(BaseExtractedData data2, boolean found2) {
                                LoggerKt.logD("SDLT_FOE", "Face reader response for back id - face found?: " + found2);
                                if (found2 && (data2 instanceof ExtractedFace)) {
                                    UtilsKt.appendFaceDataToOutput((ExtractedFace) data2, found2, FinalOutputProcessData.this);
                                }
                                finalOutputCallback.extracted(FinalOutputProcessData.this);
                            }
                        }, 0, 4, null).read();
                        return;
                    }
                    outputCallback.extracted(finalOutputProcessData);
                }
            });
            return;
        }
        if (i == 3) {
            final long currentTimeMillis2 = System.currentTimeMillis();
            final Bitmap downScaledBitmap2 = ImageUtils.INSTANCE.getDownScaledBitmap(this.finalBitmap, 300);
            new FaceReader(downScaledBitmap2, new IReader() { // from class: com.socure.docv.capturesdk.core.extractor.FinalOutputExtractor$proceed$3
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v4, types: [T, android.graphics.Bitmap] */
                @Override // com.socure.docv.capturesdk.core.extractor.IReader
                public void onRead(BaseExtractedData data, boolean found) {
                    Bitmap bitmap;
                    LoggerKt.logD("SDLT_FOE", "faceReader data onRead callback in " + (System.currentTimeMillis() - currentTimeMillis2));
                    downScaledBitmap2.recycle();
                    final FinalOutputProcessData finalOutputProcessData = new FinalOutputProcessData(null, null, false, false, 0L, 31, null);
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    if (data != null && found && (data instanceof ExtractedFace)) {
                        ExtractedFace extractedFace = (ExtractedFace) data;
                        UtilsKt.appendFaceDataToOutput(extractedFace, found, finalOutputProcessData);
                        ImageUtils imageUtils = ImageUtils.INSTANCE;
                        bitmap = this.finalBitmap;
                        objectRef.element = imageUtils.rotateBitmap$capturesdk_productionRelease(bitmap, extractedFace.getRotZAxis());
                    }
                    final long currentTimeMillis3 = System.currentTimeMillis();
                    Bitmap bitmap2 = (Bitmap) objectRef.element;
                    if (bitmap2 == null) {
                        bitmap2 = this.finalBitmap;
                    }
                    final long j = currentTimeMillis;
                    final FinalOutputCallback finalOutputCallback = outputCallback;
                    new MrzReader(bitmap2, new IReader() { // from class: com.socure.docv.capturesdk.core.extractor.FinalOutputExtractor$proceed$3$onRead$1
                        @Override // com.socure.docv.capturesdk.core.extractor.IReader
                        public void onRead(BaseExtractedData data2, boolean found2) {
                            LoggerKt.logD("SDLT_FOE", "MrzReader data onRead callback in " + (System.currentTimeMillis() - currentTimeMillis3));
                            Bitmap bitmap3 = objectRef.element;
                            if (bitmap3 != null) {
                                Ref.ObjectRef<Bitmap> objectRef2 = objectRef;
                                bitmap3.recycle();
                                objectRef2.element = null;
                            }
                            long currentTimeMillis4 = System.currentTimeMillis() - j;
                            LoggerKt.logD("SDLT_FOE", "MrzReader + faceReader data onRead callback in: " + currentTimeMillis4 + " ms");
                            finalOutputProcessData.setData(data2);
                            finalOutputProcessData.setFound(found2);
                            finalOutputProcessData.setDuration(currentTimeMillis4);
                            finalOutputCallback.extracted(finalOutputProcessData);
                        }
                    }).read();
                }
            }, 0, 4, null).read();
        } else {
            if (i != 4) {
                return;
            }
            LoggerKt.logD("SDLT_FOE", "selfie not need final output processor");
            FinalOutputProcessData finalOutputProcessData = new FinalOutputProcessData(null, null, false, false, 0L, 31, null);
            finalOutputProcessData.setFace(CollectionsKt.arrayListOf(new Face(null, Boolean.valueOf(UtilsKt.isFaceFoundForSelfie(this.metrics)), Double.valueOf(1.0d), Float.valueOf(0.0f), 1, null)));
            outputCallback.extracted(finalOutputProcessData);
        }
    }
}
