package com.socure.docv.capturesdk.core.processor.interfaces;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: IModelProcessor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/interfaces/IModelProcessor;", "", "process", "", "bitmap", "Landroid/graphics/Bitmap;", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IModelProcessor {
    float[] process(Bitmap bitmap);

    void stop();
}
