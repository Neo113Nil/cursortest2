package com.vk.voip.call_effects;

import android.app.Activity;
import io.reactivex.rxjava3.subjects.d;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowSegmentationType;
import xsna.asp;
import xsna.rf1;
import xsna.zrp;

/* compiled from: CallEffectsDependency.kt */
/* loaded from: classes7.dex */
public interface CallEffectsDependency {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallEffectsDependency.kt */
    public static final class DynamicLibsState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DynamicLibsState[] $VALUES;
        public static final DynamicLibsState ERROR;
        public static final DynamicLibsState LOADED;
        public static final DynamicLibsState LOADING;
        public static final DynamicLibsState NOT_LOADED;

        static {
            DynamicLibsState dynamicLibsState = new DynamicLibsState("NOT_LOADED", 0);
            NOT_LOADED = dynamicLibsState;
            DynamicLibsState dynamicLibsState2 = new DynamicLibsState("LOADED", 1);
            LOADED = dynamicLibsState2;
            DynamicLibsState dynamicLibsState3 = new DynamicLibsState("LOADING", 2);
            LOADING = dynamicLibsState3;
            DynamicLibsState dynamicLibsState4 = new DynamicLibsState("ERROR", 3);
            ERROR = dynamicLibsState4;
            DynamicLibsState[] dynamicLibsStateArr = {dynamicLibsState, dynamicLibsState2, dynamicLibsState3, dynamicLibsState4};
            $VALUES = dynamicLibsStateArr;
            $ENTRIES = new asp(dynamicLibsStateArr);
        }

        public DynamicLibsState() {
            throw null;
        }

        public static DynamicLibsState valueOf(String str) {
            return (DynamicLibsState) Enum.valueOf(DynamicLibsState.class, str);
        }

        public static DynamicLibsState[] values() {
            return (DynamicLibsState[]) $VALUES.clone();
        }

        public final boolean h() {
            return this == ERROR;
        }

        public final boolean i() {
            return this == LOADED;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallEffectsDependency.kt */
    public static final class TensorflowMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TensorflowMode[] $VALUES;
        public static final TensorflowMode CPU;
        public static final TensorflowMode GPU;
        public static final TensorflowMode OFF;

        static {
            TensorflowMode tensorflowMode = new TensorflowMode("OFF", 0);
            OFF = tensorflowMode;
            TensorflowMode tensorflowMode2 = new TensorflowMode("CPU", 1);
            CPU = tensorflowMode2;
            TensorflowMode tensorflowMode3 = new TensorflowMode("GPU", 2);
            GPU = tensorflowMode3;
            TensorflowMode[] tensorflowModeArr = {tensorflowMode, tensorflowMode2, tensorflowMode3};
            $VALUES = tensorflowModeArr;
            $ENTRIES = new asp(tensorflowModeArr);
        }

        public TensorflowMode() {
            throw null;
        }

        public static TensorflowMode valueOf(String str) {
            return (TensorflowMode) Enum.valueOf(TensorflowMode.class, str);
        }

        public static TensorflowMode[] values() {
            return (TensorflowMode[]) $VALUES.clone();
        }
    }

    boolean a();

    void b();

    boolean c();

    void d(Activity activity);

    d e();

    TensorflowFaceLandmarksType f();

    boolean g();

    TensorflowSegmentationType getTensorflowSegmentationType();

    rf1 h();
}
