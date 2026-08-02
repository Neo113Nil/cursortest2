package com.socure.docv.capturesdk.core.external.ml.impl;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.utils.ModelOutputs;
import com.socure.docv.capturesdk.common.utils.ModelUtilsKt;
import com.socure.docv.capturesdk.common.utils.TensorFlowModelUtilsKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* compiled from: CornerDetectorML.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/impl/CornerDetectorML;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IModelProcessor;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;)V", "model", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "process", "", "bitmap", "Landroid/graphics/Bitmap;", "stop", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CornerDetectorML implements IModelProcessor {
    public static final int $stable = 8;
    private final Model model;

    public CornerDetectorML(ApplicationComponent applicationComponent) {
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.model = applicationComponent.getCornerModelProvider().get();
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor
    public float[] process(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        boolean z = true;
        TensorBuffer createFixedSize = TensorBuffer.createFixedSize(new int[]{1, 3, 256, 256}, DataType.FLOAT32);
        Intrinsics.checkNotNullExpressionValue(createFixedSize, "createFixedSize(intArray….H_CD), DataType.FLOAT32)");
        createFixedSize.loadBuffer(ImageUtils.INSTANCE.bitmapToByteBufferIdd(bitmap));
        try {
            ModelOutputs process = ModelUtilsKt.process(this.model, createFixedSize);
            float[] outputFeature0AsTensorBufferArray = TensorFlowModelUtilsKt.getOutputFeature0AsTensorBufferArray(process);
            float[] outputFeature1AsTensorBufferArray = TensorFlowModelUtilsKt.getOutputFeature1AsTensorBufferArray(process);
            if (outputFeature0AsTensorBufferArray.length == 1 && outputFeature1AsTensorBufferArray.length == 12) {
                LoggerKt.logDetailed("SDLT_CD_ML", "horizontal object detected with confidence: " + ArraysKt.joinToString$default(outputFeature0AsTensorBufferArray, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + " | and four corners found: " + ArraysKt.joinToString$default(outputFeature1AsTensorBufferArray, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
                return Utils.INSTANCE.appendResultAndHorizontalConf$capturesdk_productionRelease(outputFeature1AsTensorBufferArray, outputFeature0AsTensorBufferArray[0]);
            }
            boolean z2 = outputFeature0AsTensorBufferArray.length == 0;
            String joinToString$default = ArraysKt.joinToString$default(outputFeature0AsTensorBufferArray, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
            if (outputFeature0AsTensorBufferArray[0] >= this.model.getConfidence() || !Utils.INSTANCE.cornersFound$capturesdk_productionRelease(outputFeature1AsTensorBufferArray)) {
                z = false;
            }
            LoggerKt.logE$default("SDLT_CD_ML", "horizontal object not detected: " + z2 + " - (" + joinToString$default + ") || four corners not found: " + z + " - (" + ArraysKt.joinToString$default(outputFeature1AsTensorBufferArray, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ")", null, 4, null);
            return null;
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_CD_ML", "Ex trying to detect corners: " + th.getLocalizedMessage(), null, 4, null);
            return null;
        }
    }

    @Override // com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor
    public void stop() {
        this.model.getModel().close();
    }
}
