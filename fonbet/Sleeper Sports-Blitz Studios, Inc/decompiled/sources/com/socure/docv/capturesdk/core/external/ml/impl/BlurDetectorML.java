package com.socure.docv.capturesdk.core.external.ml.impl;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.utils.ModelOutputs;
import com.socure.docv.capturesdk.common.utils.ModelUtilsKt;
import com.socure.docv.capturesdk.common.utils.TensorFlowModelUtilsKt;
import com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* compiled from: BlurDetectorML.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/impl/BlurDetectorML;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IModelProcessor;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;)V", "model", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "process", "", "bitmap", "Landroid/graphics/Bitmap;", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlurDetectorML implements IModelProcessor {
    public static final int $stable = 8;
    private final Model model;

    public BlurDetectorML(ApplicationComponent applicationComponent) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.model = applicationComponent.getBlurModelProvider().get();
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor
    public float[] process(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        TensorBuffer createFixedSize = TensorBuffer.createFixedSize(new int[]{1, 3, 180, 300}, DataType.FLOAT32);
        Intrinsics.checkNotNullExpressionValue(createFixedSize, "createFixedSize(intArray….W_BD), DataType.FLOAT32)");
        createFixedSize.loadBuffer(ImageUtils.INSTANCE.convertBitmapToByteBufferBlur(bitmap, 180, 300));
        long currentTimeMillis = System.currentTimeMillis();
        ModelOutputs process = ModelUtilsKt.process(this.model, createFixedSize);
        LoggerKt.logD("SDLT_BD_ML", "BlurDetectorML - timeTaken: " + (System.currentTimeMillis() - currentTimeMillis) + " | output: [" + ArraysKt.joinToString$default(TensorFlowModelUtilsKt.getOutputFeature0AsTensorBufferArray(process), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + "]");
        return TensorFlowModelUtilsKt.getOutputFeature0AsTensorBufferArray(process);
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor
    public void stop() {
        this.model.getModel().close();
    }
}
