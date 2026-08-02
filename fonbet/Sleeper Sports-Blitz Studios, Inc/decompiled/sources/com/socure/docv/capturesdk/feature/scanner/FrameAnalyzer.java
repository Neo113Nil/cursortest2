package com.socure.docv.capturesdk.feature.scanner;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.core.pipeline.Pipeline;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrameAnalyzer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/FrameAnalyzer;", "", "pipeline", "Lcom/socure/docv/capturesdk/core/pipeline/Pipeline;", "(Lcom/socure/docv/capturesdk/core/pipeline/Pipeline;)V", "analyze", "Lkotlin/Pair;", "", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "bitmap", "Landroid/graphics/Bitmap;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FrameAnalyzer {
    public static final int $stable = 8;
    private final Pipeline pipeline;

    public FrameAnalyzer(Pipeline pipeline) {
        Intrinsics.checkNotNullParameter(pipeline, "pipeline");
        this.pipeline = pipeline;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        if (r7 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<List<DetectionMetric>, DetectionCallback> analyze(Bitmap bitmap) {
        DetectionCallback detectionCallback;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        long currentTimeMillis = System.currentTimeMillis();
        LoggerKt.logDetailed("SDLT_FA", "Starting process on thread: " + Thread.currentThread().getName());
        Output process = this.pipeline.process(bitmap, CaptureType.AUTO_ANALYSIS);
        LoggerKt.logDetailed("SDLT_FA", "totalTimeTaken: " + (System.currentTimeMillis() - currentTimeMillis));
        bitmap.recycle();
        if (process.getFinalStatus()) {
            LoggerKt.logI("SDLT_FA", "output.finalStatus is success - going for auto capture");
            detectionCallback = DetectionCallback.CAPTURING;
        } else {
            Object obj = null;
            LoggerKt.logE$default("SDLT_FA", "status failed, sending not processing", null, 4, null);
            Iterator<T> it = process.getMetrics().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!((DetectionMetric) next).getCheckPassed()) {
                    obj = next;
                    break;
                }
            }
            DetectionMetric detectionMetric = (DetectionMetric) obj;
            if (detectionMetric != null) {
                LoggerKt.logDetailed("SDLT_FA", "sending specific warning for " + detectionMetric);
                detectionCallback = Utils.INSTANCE.getDetectionCallback$capturesdk_productionRelease(detectionMetric);
            }
            LoggerKt.logDetailed("SDLT_FA", "sending generic warning");
            detectionCallback = DetectionCallback.NOT_PROCESSING;
        }
        return new Pair<>(CollectionsKt.toList(process.getMetrics()), detectionCallback);
    }
}
