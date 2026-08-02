package com.socure.docv.capturesdk.core.processor.interfaces;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.processor.model.IResult;
import kotlin.Metadata;

/* compiled from: IProcessor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "", "process", "Lcom/socure/docv/capturesdk/core/processor/model/IResult;", "bitmap", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IProcessor {
    IResult process(Bitmap bitmap, CaptureType captureType);

    void stop();
}
