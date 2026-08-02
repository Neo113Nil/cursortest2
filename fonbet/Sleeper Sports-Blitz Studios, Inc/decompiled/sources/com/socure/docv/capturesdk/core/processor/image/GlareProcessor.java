package com.socure.docv.capturesdk.core.processor.image;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.core.external.ml.impl.GlareDetectorML;
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

/* compiled from: GlareProcessor.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/image/GlareProcessor;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;)V", "glareModelProcessor", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IModelProcessor;", "lightIntensityModelProcessor", "calcMeasure", "", "floatArray", "", "process", "Lcom/socure/docv/capturesdk/core/processor/model/ProcessOutput;", "bitmap", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GlareProcessor implements IProcessor {
    public static final int $stable = 8;
    private final ApplicationComponent applicationComponent;
    private IModelProcessor glareModelProcessor;
    private IProcessor lightIntensityModelProcessor;

    public GlareProcessor(ApplicationComponent applicationComponent) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.applicationComponent = applicationComponent;
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public ProcessOutput process(Bitmap bitmap, CaptureType captureType) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 112, 112, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitma…lareConstants.W_GD, true)");
        LightIntensityDetector lightIntensityDetector = new LightIntensityDetector(this.applicationComponent);
        this.lightIntensityModelProcessor = lightIntensityDetector;
        IResult process = lightIntensityDetector.process(createScaledBitmap, captureType);
        boolean z = captureType == CaptureType.AUTO;
        if (process.getMetric().getCheckPassed()) {
            LoggerKt.logD("SDLT_GD", "Checking glare");
            GlareDetectorML glareDetectorML = new GlareDetectorML(this.applicationComponent);
            this.glareModelProcessor = glareDetectorML;
            float[] process2 = glareDetectorML.process(createScaledBitmap);
            if (!z) {
                createScaledBitmap.recycle();
            }
            return new ProcessOutput(new DetectionMetric(DetectionType.GLARE, process2[0] <= this.applicationComponent.getGlareModelProvider().get().getConfidence(), Double.valueOf(calcMeasure(process2)), null, null, 0.0f, z ? createScaledBitmap : null, null, null, null, 952, null), null, null, 6, null);
        }
        LoggerKt.logI("SDLT_GD", "No need to check glare, there isn't enough light intensity");
        if (!z) {
            createScaledBitmap.recycle();
        }
        return new ProcessOutput(new DetectionMetric(DetectionType.GLARE, true, Double.valueOf(1.0d), null, null, 0.0f, z ? createScaledBitmap : null, null, null, null, 952, null), null, null, 6, null);
    }

    private final double calcMeasure(float[] floatArray) {
        return 1.0d - floatArray[0];
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public void stop() {
        IProcessor iProcessor = this.lightIntensityModelProcessor;
        if (iProcessor != null) {
            iProcessor.stop();
        }
        IModelProcessor iModelProcessor = this.glareModelProcessor;
        if (iModelProcessor != null) {
            iModelProcessor.stop();
        }
    }
}
