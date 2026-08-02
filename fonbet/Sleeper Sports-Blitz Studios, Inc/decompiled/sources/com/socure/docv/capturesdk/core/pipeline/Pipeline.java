package com.socure.docv.capturesdk.core.pipeline;

import android.graphics.Bitmap;
import android.util.Log;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.core.pipeline.ProcessorMap;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.DebugImageCallback;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pipeline.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/socure/docv/capturesdk/core/pipeline/Pipeline;", "", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "dic", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/DebugImageCallback;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/DebugImageCallback;)V", "autoPipeline", "Lcom/socure/docv/capturesdk/core/pipeline/AutoPipeline;", "getAutoPipeline", "()Lcom/socure/docv/capturesdk/core/pipeline/AutoPipeline;", "autoPipeline$delegate", "Lkotlin/Lazy;", "autoSteps", "", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "[Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "availableSteps", "manualCapturePipeline", "Lcom/socure/docv/capturesdk/core/pipeline/ManualCapturePipeline;", "getManualCapturePipeline", "()Lcom/socure/docv/capturesdk/core/pipeline/ManualCapturePipeline;", "manualCapturePipeline$delegate", "manualCaptureSteps", "processors", "Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap;", "process", "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "bitmap", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "shutdown", "", "updateAutoPipelineForLicenceBack", "skipBarcode", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Pipeline {

    /* renamed from: autoPipeline$delegate, reason: from kotlin metadata */
    private final Lazy autoPipeline;
    private final DetectionType[] autoSteps;
    private final DetectionType[] availableSteps;

    /* renamed from: manualCapturePipeline$delegate, reason: from kotlin metadata */
    private final Lazy manualCapturePipeline;
    private final DetectionType[] manualCaptureSteps;
    private ProcessorMap processors;
    private final ScanType scanType;

    public Pipeline(ApplicationComponent applicationComponent, ScanType scanType, DebugImageCallback dic) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(dic, "dic");
        this.scanType = scanType;
        DetectionType[] detectionTypeArr = Utils.INSTANCE.isSelfie$capturesdk_productionRelease(scanType) ? new DetectionType[]{DetectionType.SELFIE} : scanType == ScanType.LICENSE_BACK ? new DetectionType[]{DetectionType.CORNER, DetectionType.BARCODE, DetectionType.BRIGHTNESS, DetectionType.BLUR, DetectionType.GLARE} : new DetectionType[]{DetectionType.CORNER, DetectionType.BRIGHTNESS, DetectionType.BLUR, DetectionType.GLARE};
        this.autoSteps = detectionTypeArr;
        DetectionType[] detectionTypeArr2 = Utils.INSTANCE.isSelfie$capturesdk_productionRelease(scanType) ? new DetectionType[]{DetectionType.SELFIE} : ConstantsKt.getOPEN_CV_SUPPORTED() ? new DetectionType[]{DetectionType.BRIGHTNESS, DetectionType.BLUR, DetectionType.GLARE} : new DetectionType[]{DetectionType.BLUR, DetectionType.GLARE};
        this.manualCaptureSteps = detectionTypeArr2;
        DetectionType[] superSetSteps$capturesdk_productionRelease = Utils.INSTANCE.getSuperSetSteps$capturesdk_productionRelease(detectionTypeArr, detectionTypeArr2);
        this.availableSteps = superSetSteps$capturesdk_productionRelease;
        this.processors = new ProcessorMap.Builder(applicationComponent, scanType).addSteps((DetectionType[]) Arrays.copyOf(superSetSteps$capturesdk_productionRelease, superSetSteps$capturesdk_productionRelease.length)).addDic(dic).build();
        this.manualCapturePipeline = LazyKt.lazy(new Function0<ManualCapturePipeline>() { // from class: com.socure.docv.capturesdk.core.pipeline.Pipeline$manualCapturePipeline$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ManualCapturePipeline invoke() {
                ScanType scanType2;
                ProcessorMap processorMap;
                DetectionType[] detectionTypeArr3;
                scanType2 = Pipeline.this.scanType;
                processorMap = Pipeline.this.processors;
                detectionTypeArr3 = Pipeline.this.manualCaptureSteps;
                return new ManualCapturePipeline(scanType2, processorMap, detectionTypeArr3);
            }
        });
        this.autoPipeline = LazyKt.lazy(new Function0<AutoPipeline>() { // from class: com.socure.docv.capturesdk.core.pipeline.Pipeline$autoPipeline$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AutoPipeline invoke() {
                ScanType scanType2;
                ProcessorMap processorMap;
                DetectionType[] detectionTypeArr3;
                scanType2 = Pipeline.this.scanType;
                processorMap = Pipeline.this.processors;
                detectionTypeArr3 = Pipeline.this.autoSteps;
                return new AutoPipeline(scanType2, processorMap, detectionTypeArr3);
            }
        });
    }

    private final ManualCapturePipeline getManualCapturePipeline() {
        return (ManualCapturePipeline) this.manualCapturePipeline.getValue();
    }

    private final AutoPipeline getAutoPipeline() {
        return (AutoPipeline) this.autoPipeline.getValue();
    }

    public final void updateAutoPipelineForLicenceBack(boolean skipBarcode) {
        LoggerKt.logD("SDLT_PLM", "updateAutoPipelineForLicenceBack called - skipBarcode: " + skipBarcode + " ");
        getAutoPipeline().setSkipBarcode$capturesdk_productionRelease(skipBarcode);
    }

    public final Output process(Bitmap bitmap, CaptureType captureType) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        LoggerKt.logDetailed("SDLT_PLM", "process captureType: " + captureType.getValue());
        try {
            if (captureType == CaptureType.MANUAL) {
                return getManualCapturePipeline().process(bitmap, captureType);
            }
            return getAutoPipeline().process(bitmap, captureType);
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_PLM", "!!!FATAL EXCEPTION WAS CAUGHT: " + th.getLocalizedMessage(), null, 4, null);
            LoggerKt.logDetailed("SDLT_PLM", "Stacktrace: " + Log.getStackTraceString(th));
            return new Output(bitmap, captureType, null, false, null, null, 60, null);
        }
    }

    public final void shutdown() {
        this.processors.close();
    }
}
