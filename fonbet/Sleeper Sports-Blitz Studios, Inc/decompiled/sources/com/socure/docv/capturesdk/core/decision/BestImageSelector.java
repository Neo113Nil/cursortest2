package com.socure.docv.capturesdk.core.decision;

import android.graphics.Bitmap;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.Output;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: BestImageSelector.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/core/decision/BestImageSelector;", "", "()V", SentryThread.JsonKeys.CURRENT, "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "add", "", "next", "clear", "clearOutput", AgentOptions.OUTPUT, RemoteConfigComponent.FETCH_FILE_NAME, "getScore", "", "isNextBetter", "", "old", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BestImageSelector {
    private Output current;

    public final void add(Output next) {
        Intrinsics.checkNotNullParameter(next, "next");
        LoggerKt.logD("SDLT_BIS", "Add called");
        Output output = this.current;
        if (output == null) {
            this.current = next;
            return;
        }
        Output output2 = null;
        if (output == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SentryThread.JsonKeys.CURRENT);
            output = null;
        }
        if (isNextBetter(output, next)) {
            Output output3 = this.current;
            if (output3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryThread.JsonKeys.CURRENT);
            } else {
                output2 = output3;
            }
            clearOutput(output2);
            this.current = next;
            return;
        }
        clearOutput(next);
    }

    public final Output fetch() {
        Output output = this.current;
        if (output == null) {
            return null;
        }
        if (output != null) {
            return output;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SentryThread.JsonKeys.CURRENT);
        return null;
    }

    public final void clear() {
        Output output = this.current;
        if (output != null) {
            if (output == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SentryThread.JsonKeys.CURRENT);
                output = null;
            }
            clearOutput(output);
        }
    }

    private final boolean isNextBetter(Output old, Output next) {
        return getScore(next) > getScore(old);
    }

    private final double getScore(Output output) {
        double d = 0.0d;
        for (DetectionMetric detectionMetric : output.getMetrics()) {
            Double outputMeasure = detectionMetric.getOutputMeasure();
            if (outputMeasure != null) {
                double doubleValue = outputMeasure.doubleValue();
                if (doubleValue >= 0.0d) {
                    d += doubleValue * detectionMetric.getDetectionType().getWeight();
                }
            }
        }
        return d;
    }

    private final void clearOutput(Output output) {
        output.getFinalBitmap().recycle();
        output.getMetrics().clear();
        Bitmap debugBitmap = output.getDebugBitmap();
        if (debugBitmap != null) {
            debugBitmap.recycle();
        }
        output.setDebugBitmap(null);
        for (DetectionMetric detectionMetric : output.getMetrics()) {
            Bitmap modelInputImage = detectionMetric.getModelInputImage();
            if (modelInputImage != null) {
                modelInputImage.recycle();
            }
            detectionMetric.setModelInputImage(null);
        }
    }
}
