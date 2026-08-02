package com.socure.docv.capturesdk.core.processor.image;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.core.extractor.BarcodeReader;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedBarcode;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.processor.interfaces.IProcessor;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.IResult;
import com.socure.docv.capturesdk.core.processor.model.ProcessOutput;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BarcodeProcessor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/image/BarcodeProcessor;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "()V", "barcodeReader", "Lcom/socure/docv/capturesdk/core/extractor/BarcodeReader;", "process", "Lcom/socure/docv/capturesdk/core/processor/model/IResult;", "bitmap", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BarcodeProcessor implements IProcessor {
    public static final int $stable = 8;
    private final BarcodeReader barcodeReader = new BarcodeReader();

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public IResult process(Bitmap bitmap, CaptureType captureType) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Pair<ExtractedBarcode, Boolean> readBlocking = this.barcodeReader.readBlocking(bitmap, 500L);
        return new ProcessOutput(new DetectionMetric(DetectionType.BARCODE, readBlocking.getSecond().booleanValue(), null, null, null, 0.0f, null, readBlocking.getSecond().booleanValue() ? null : DetectionCallback.BARCODE_NOT_FOUND, null, null, 892, null), null, null, 6, null);
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public void stop() {
        this.barcodeReader.stop();
    }
}
