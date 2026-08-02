package com.socure.docv.capturesdk.feature.preview.helper;

import android.content.Context;
import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.workers.ImageWorker;
import com.socure.docv.capturesdk.common.workers.ImageWorkerKt;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DbgImgExporter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/feature/preview/helper/DbgImgExporter;", "", "context", "Landroid/content/Context;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "metrics", "", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "(Landroid/content/Context;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Ljava/util/List;)V", "baseDirName", "", "export", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DbgImgExporter {
    private final String baseDirName;
    private final Context context;
    private final List<DetectionMetric> metrics;
    private final ScanType scanType;

    public DbgImgExporter(Context context, ScanType scanType, List<DetectionMetric> metrics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.context = context;
        this.scanType = scanType;
        this.metrics = metrics;
        this.baseDirName = ImageWorkerKt.DBG_IMG_BASE_DIR;
    }

    public final void export() {
        boolean z;
        ImageWorker imageWorker = new ImageWorker(this.context, this.baseDirName);
        loop0: while (true) {
            for (DetectionMetric detectionMetric : this.metrics) {
                z = z || imageWorker.saveToDisk(detectionMetric.getModelInputImage(), this.scanType.name() + "_" + detectionMetric.getDetectionType().name() + ".jpg") != null;
            }
        }
        if (z) {
            File externalFilesDir = this.context.getExternalFilesDir(this.baseDirName);
            LoggerKt.logI("SDLT_DIE", "Files written to disk (" + (externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + "), please copy it elsewhere before next scan session as they will be cleaned up.");
        } else {
            LoggerKt.logE$default("SDLT_DIE", "No image was saved to disk - either done already and cleared, or images not available.", null, 4, null);
        }
        LoggerKt.logDetailed("SDLT_DIE", "Recycling bitmaps and setting them to null");
        for (DetectionMetric detectionMetric2 : this.metrics) {
            Bitmap modelInputImage = detectionMetric2.getModelInputImage();
            if (modelInputImage != null) {
                modelInputImage.recycle();
            }
            detectionMetric2.setModelInputImage(null);
        }
    }
}
