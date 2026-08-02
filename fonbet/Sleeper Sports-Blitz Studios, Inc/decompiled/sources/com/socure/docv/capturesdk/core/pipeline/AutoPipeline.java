package com.socure.docv.capturesdk.core.pipeline;

import android.graphics.Bitmap;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.interfaces.IProcessor;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.IResult;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.core.processor.model.ProcessOutput;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: AutoPipeline.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/core/pipeline/AutoPipeline;", "", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "processorMap", "Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap;", ContainerStep.STEPS, "", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap;[Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;)V", "skipBarcode", "", "getSkipBarcode$capturesdk_productionRelease", "()Z", "setSkipBarcode$capturesdk_productionRelease", "(Z)V", "[Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "process", "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "image", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "shouldAbort", AgentOptions.OUTPUT, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoPipeline {
    public static final int $stable = 8;
    private final ProcessorMap processorMap;
    private final ScanType scanType;
    private volatile boolean skipBarcode;
    private final DetectionType[] steps;

    /* compiled from: AutoPipeline.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DetectionType.values().length];
            try {
                iArr[DetectionType.CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DetectionType.BRIGHTNESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AutoPipeline(ScanType scanType, ProcessorMap processorMap, DetectionType[] steps) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(processorMap, "processorMap");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.scanType = scanType;
        this.processorMap = processorMap;
        this.steps = steps;
    }

    /* renamed from: getSkipBarcode$capturesdk_productionRelease, reason: from getter */
    public final boolean getSkipBarcode() {
        return this.skipBarcode;
    }

    public final void setSkipBarcode$capturesdk_productionRelease(boolean z) {
        this.skipBarcode = z;
    }

    public final Output process(Bitmap image, CaptureType captureType) {
        IProcessor iProcessor;
        boolean z;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        if (captureType == CaptureType.AUTO_ANALYSIS) {
            LoggerKt.logDetailed("SDLT_AP", "process scanType :" + this.scanType.getValue() + " | captureType: " + captureType.getValue() + " | steps: " + ArraysKt.joinToString$default(this.steps, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        } else {
            LoggerKt.logDetailed("SDLT_AP", "process scanType :" + this.scanType.getValue() + " | captureType: " + captureType.getValue() + " | steps: " + ArraysKt.joinToString$default(this.steps, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        Output output = new Output(image, captureType, null, false, null, null, 60, null);
        DetectionType[] detectionTypeArr = this.steps;
        int length = detectionTypeArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            DetectionType detectionType = detectionTypeArr[i];
            int i3 = i2 + 1;
            if ((!this.skipBarcode || detectionType != DetectionType.BARCODE) && (iProcessor = this.processorMap.getMap().get(detectionType)) != null) {
                if (captureType == CaptureType.AUTO) {
                    LoggerKt.logDetailed("SDLT_AP", "Going to process for " + detectionType + "}");
                }
                IResult process = iProcessor.process(output.getFinalBitmap(), captureType);
                Intrinsics.checkNotNull(process, "null cannot be cast to non-null type com.socure.docv.capturesdk.core.processor.model.ProcessOutput");
                ProcessOutput processOutput = (ProcessOutput) process;
                output.getMetrics().add(processOutput.getMetric());
                if (i2 == 0) {
                    z = processOutput.getMetric().getCheckPassed();
                } else {
                    z = output.getFinalStatus() && processOutput.getMetric().getCheckPassed();
                }
                output.setFinalStatus(z);
                int i4 = WhenMappings.$EnumSwitchMapping$0[detectionType.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (shouldAbort(output)) {
                            LoggerKt.logE$default("SDLT_AP", "Aborting and returning output", null, 4, null);
                            break;
                        }
                    } else {
                        LoggerKt.logDetailed("SDLT_AP", "process detectionType : " + detectionType.name() + " - success: " + processOutput.getMetric().getCheckPassed());
                        if (!processOutput.getMetric().getCheckPassed()) {
                            break;
                        }
                    }
                } else {
                    if (!processOutput.getMetric().getCheckPassed() || processOutput.getBitmap() == null) {
                        break;
                    }
                    LoggerKt.logDetailed("SDLT_AP", "corner detected");
                    output.setFinalBitmap(processOutput.getBitmap());
                    output.setDebugBitmap(processOutput.getDebugBitmap());
                }
            }
            i++;
            i2 = i3;
        }
        LoggerKt.logDetailed("SDLT_AP", "corner not detected for analysis frame");
        Bitmap debugBitmap = output.getDebugBitmap();
        if (debugBitmap != null) {
            debugBitmap.recycle();
        }
        output.setDebugBitmap(null);
        Bitmap cropDocWithPaddingIfEnabled = ImageUtils.INSTANCE.cropDocWithPaddingIfEnabled(image, captureType == CaptureType.AUTO, this.processorMap.getMap().containsKey(DetectionType.CORNER), output.getMetrics());
        if (cropDocWithPaddingIfEnabled != null) {
            output.getFinalBitmap().recycle();
            output.setFinalBitmap(cropDocWithPaddingIfEnabled);
        }
        return output;
    }

    private final boolean shouldAbort(Output output) {
        Object obj;
        Object obj2;
        Iterator<T> it = output.getMetrics().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((DetectionMetric) obj2).getDetectionType() == DetectionType.CORNER) {
                break;
            }
        }
        DetectionMetric detectionMetric = (DetectionMetric) obj2;
        boolean checkPassed = detectionMetric != null ? detectionMetric.getCheckPassed() : false;
        Iterator<T> it2 = output.getMetrics().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((DetectionMetric) next).getDetectionType() == DetectionType.BRIGHTNESS) {
                obj = next;
                break;
            }
        }
        DetectionMetric detectionMetric2 = (DetectionMetric) obj;
        boolean checkPassed2 = detectionMetric2 != null ? detectionMetric2.getCheckPassed() : false;
        LoggerKt.logDetailed("SDLT_AP", "shouldAbort cornerPassed: " + checkPassed + " || brightnessPassed: " + checkPassed2);
        return (checkPassed && checkPassed2) ? false : true;
    }
}
