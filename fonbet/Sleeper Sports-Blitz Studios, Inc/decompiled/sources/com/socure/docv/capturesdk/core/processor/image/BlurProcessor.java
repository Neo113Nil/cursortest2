package com.socure.docv.capturesdk.core.processor.image;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.core.external.ml.impl.BlurDetectorML;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor;
import com.socure.docv.capturesdk.core.processor.interfaces.IProcessor;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.IResult;
import com.socure.docv.capturesdk.core.processor.model.ProcessOutput;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlurProcessor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/image/BlurProcessor;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;)V", "modelProcessor", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IModelProcessor;", "calcMeasure", "", "floatArray", "", "process", "Lcom/socure/docv/capturesdk/core/processor/model/IResult;", "bitmap", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlurProcessor implements IProcessor {
    public static final int $stable = 8;
    private final ApplicationComponent applicationComponent;
    private IModelProcessor modelProcessor;

    public BlurProcessor(ApplicationComponent applicationComponent) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.applicationComponent = applicationComponent;
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public IResult process(Bitmap bitmap, CaptureType captureType) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 300, 180, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitma…BlurConstants.H_BD, true)");
        BlurDetectorML blurDetectorML = new BlurDetectorML(this.applicationComponent);
        this.modelProcessor = blurDetectorML;
        float[] process = blurDetectorML.process(createScaledBitmap);
        boolean z = captureType == CaptureType.AUTO;
        if (!z) {
            createScaledBitmap.recycle();
        }
        DetectionType detectionType = DetectionType.BLUR;
        boolean z2 = process[0] <= this.applicationComponent.getBlurModelProvider().get().getConfidence();
        Double valueOf = Double.valueOf(calcMeasure(process));
        if (!z) {
            createScaledBitmap = null;
        }
        return new ProcessOutput(new DetectionMetric(detectionType, z2, valueOf, null, null, 0.0f, createScaledBitmap, null, null, null, 952, null), null, null, 6, null);
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public void stop() {
        IModelProcessor iModelProcessor = this.modelProcessor;
        if (iModelProcessor != null) {
            iModelProcessor.stop();
        }
    }

    private final double calcMeasure(float[] floatArray) {
        return 1.0d - floatArray[0];
    }
}
