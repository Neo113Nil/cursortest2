package com.socure.docv.capturesdk.ml;

import android.content.Context;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.metadata.MetadataExtractor;
import org.tensorflow.lite.support.model.Model;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* loaded from: classes8.dex */
public final class GlareModel {
    private final Model model;

    private GlareModel(Context context, Model.Options options) throws IOException {
        Model createModel = Model.createModel(context, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, options);
        this.model = createModel;
        new MetadataExtractor(createModel.getData());
    }

    public static GlareModel newInstance(Context context) throws IOException {
        return new GlareModel(context, new Model.Options.Builder().build());
    }

    public static GlareModel newInstance(Context context, Model.Options options) throws IOException {
        return new GlareModel(context, options);
    }

    public Outputs process(TensorBuffer tensorBuffer) {
        Outputs outputs = new Outputs(this.model);
        this.model.run(new Object[]{tensorBuffer.getBuffer()}, outputs.getBuffer());
        return outputs;
    }

    public void close() {
        this.model.close();
    }

    public class Outputs {
        private TensorBuffer outputFeature0;
        private TensorBuffer outputFeature1;

        private Outputs(Model model) {
            this.outputFeature0 = TensorBuffer.createFixedSize(model.getOutputTensorShape(0), DataType.FLOAT32);
            this.outputFeature1 = TensorBuffer.createFixedSize(model.getOutputTensorShape(1), DataType.FLOAT32);
        }

        public TensorBuffer getOutputFeature0AsTensorBuffer() {
            return this.outputFeature0;
        }

        public TensorBuffer getOutputFeature1AsTensorBuffer() {
            return this.outputFeature1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, Object> getBuffer() {
            HashMap hashMap = new HashMap();
            hashMap.put(0, this.outputFeature0.getBuffer());
            hashMap.put(1, this.outputFeature1.getBuffer());
            return hashMap;
        }
    }
}
