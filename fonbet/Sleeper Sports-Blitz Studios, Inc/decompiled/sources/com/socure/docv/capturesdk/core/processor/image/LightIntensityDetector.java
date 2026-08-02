package com.socure.docv.capturesdk.core.processor.image;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.core.external.ml.impl.LightIntensityDetectorML;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.processor.interfaces.IProcessor;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.IResult;
import com.socure.docv.capturesdk.core.processor.model.ProcessOutput;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LightIntensityDetector.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/image/LightIntensityDetector;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;)V", "model", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "getModel", "()Lcom/socure/docv/capturesdk/common/config/model/Model;", "process", "Lcom/socure/docv/capturesdk/core/processor/model/IResult;", "bitmap", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LightIntensityDetector implements IProcessor {
    public static final int $stable = 8;
    private final ApplicationComponent applicationComponent;

    public LightIntensityDetector(ApplicationComponent applicationComponent) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.applicationComponent = applicationComponent;
    }

    private final Model getModel() {
        return this.applicationComponent.getGlareIntensityModelProvider().get();
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public IResult process(Bitmap bitmap, CaptureType captureType) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 112, 112, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitma…lareConstants.W_GD, true)");
        float[] process = new LightIntensityDetectorML(this.applicationComponent).process(createScaledBitmap);
        createScaledBitmap.recycle();
        return new ProcessOutput(new DetectionMetric(DetectionType.GLARE, getModel().getConfidence() < process[0], null, null, null, 0.0f, null, null, null, null, 1020, null), null, null, 6, null);
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IProcessor
    public void stop() {
        getModel().getModel().close();
    }
}
