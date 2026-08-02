package com.vk.ml.api.tf;

import com.vk.ml.MLFeatures;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.gl.util.Supplier1;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import xsna.asp;
import xsna.zrp;

/* compiled from: TensorflowFacade.kt */
/* loaded from: classes.dex */
public interface TensorflowFacade {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TensorflowFacade.kt */
    /* loaded from: classes3.dex */
    public static final class OkEngineConfig {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OkEngineConfig[] $VALUES;
        public static final OkEngineConfig CPU;
        public static final OkEngineConfig GPU;
        public static final OkEngineConfig OFF;

        static {
            OkEngineConfig okEngineConfig = new OkEngineConfig("GPU", 0);
            GPU = okEngineConfig;
            OkEngineConfig okEngineConfig2 = new OkEngineConfig("CPU", 1);
            CPU = okEngineConfig2;
            OkEngineConfig okEngineConfig3 = new OkEngineConfig("OFF", 2);
            OFF = okEngineConfig3;
            OkEngineConfig[] okEngineConfigArr = {okEngineConfig, okEngineConfig2, okEngineConfig3};
            $VALUES = okEngineConfigArr;
            $ENTRIES = new asp(okEngineConfigArr);
        }

        public OkEngineConfig() {
            throw null;
        }

        public static OkEngineConfig valueOf(String str) {
            return (OkEngineConfig) Enum.valueOf(OkEngineConfig.class, str);
        }

        public static OkEngineConfig[] values() {
            return (OkEngineConfig[]) $VALUES.clone();
        }
    }

    /* compiled from: TensorflowFacade.kt */
    /* loaded from: classes3.dex */
    public interface a extends Supplier1<ModelDataProvider, TensorflowModel> {
        MLFeatures.MLFeature b(TensorflowModel tensorflowModel);

        boolean c(MLFeatures.MLFeature mLFeature);

        boolean isReady();

        int l();

        int m();
    }

    OkEngineConfig a();

    TensorflowSegmentationType b();

    a c();

    boolean d();

    TensorflowFaceLandmarksType e();
}
