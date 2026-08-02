package com.socure.docv.capturesdk.core.pipeline;

import android.graphics.Bitmap;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.interfaces.IProcessor;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.IResult;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.core.processor.model.ProcessOutput;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManualCapturePipeline.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/core/pipeline/ManualCapturePipeline;", "", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "processorMap", "Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap;", ContainerStep.STEPS, "", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap;[Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;)V", "[Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "process", "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "image", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ManualCapturePipeline {
    public static final int $stable = 8;
    private final ProcessorMap processorMap;
    private final ScanType scanType;
    private final DetectionType[] steps;

    public ManualCapturePipeline(ScanType scanType, ProcessorMap processorMap, DetectionType[] steps) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(processorMap, "processorMap");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.scanType = scanType;
        this.processorMap = processorMap;
        this.steps = steps;
    }

    public final Output process(Bitmap image, CaptureType captureType) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        LoggerKt.logD("SDLT_MCP", "process scanType :" + this.scanType.getValue() + " || steps: " + ArraysKt.joinToString$default(this.steps, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        Output output = new Output(image, captureType, null, false, null, null, 60, null);
        for (DetectionType detectionType : this.steps) {
            IProcessor iProcessor = this.processorMap.getMap().get(detectionType);
            if (iProcessor != null) {
                IResult process = iProcessor.process(output.getFinalBitmap(), captureType);
                Intrinsics.checkNotNull(process, "null cannot be cast to non-null type com.socure.docv.capturesdk.core.processor.model.ProcessOutput");
                output.getMetrics().add(((ProcessOutput) process).getMetric());
            }
        }
        return output;
    }
}
