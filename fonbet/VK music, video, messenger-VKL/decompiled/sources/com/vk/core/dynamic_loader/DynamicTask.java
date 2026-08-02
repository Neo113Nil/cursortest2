package com.vk.core.dynamic_loader;

import com.vk.core.native_loader.NativeLib;
import java.util.Collections;
import java.util.Set;
import xsna.asp;
import xsna.rl3;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DynamicLib.kt */
/* loaded from: classes17.dex */
public final class DynamicTask {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DynamicTask[] $VALUES;
    public static final DynamicTask APPLOVIN;
    public static final DynamicTask CALL_EFFECTS;
    public static final DynamicTask FILTERS;
    public static final DynamicTask GESTURE_CONTROL;
    public static final DynamicTask GL_EFFECTS;
    public static final DynamicTask LIVES_PUBLISHER;
    public static final DynamicTask LUTS;
    private final Set<NativeLib> artifacts;
    private final Set<DynamicLib> libs;

    static {
        DynamicLib dynamicLib = DynamicLib.GL_EFFECTS;
        Set singleton = Collections.singleton(dynamicLib);
        NativeLib nativeLib = NativeLib.GL_EFFECTS;
        DynamicTask dynamicTask = new DynamicTask("GL_EFFECTS", 0, singleton, Collections.singleton(nativeLib));
        GL_EFFECTS = dynamicTask;
        DynamicLib dynamicLib2 = DynamicLib.OPENCV;
        DynamicLib dynamicLib3 = DynamicLib.TENSORFLOW;
        Set y0 = rl3.y0(new DynamicLib[]{dynamicLib2, dynamicLib3});
        NativeLib nativeLib2 = NativeLib.OPENCV;
        NativeLib nativeLib3 = NativeLib.TFLITE_NATIVE;
        NativeLib nativeLib4 = NativeLib.TFLITE;
        NativeLib nativeLib5 = NativeLib.TFLITE_GPU_DELEGATE;
        DynamicTask dynamicTask2 = new DynamicTask("GESTURE_CONTROL", 1, y0, rl3.y0(new NativeLib[]{nativeLib2, nativeLib3, nativeLib4, nativeLib5}));
        GESTURE_CONTROL = dynamicTask2;
        DynamicTask dynamicTask3 = new DynamicTask("CALL_EFFECTS", 2, rl3.y0(new DynamicLib[]{dynamicLib2, dynamicLib, dynamicLib3}), rl3.y0(new NativeLib[]{nativeLib2, nativeLib, nativeLib3, nativeLib4, nativeLib5}));
        CALL_EFFECTS = dynamicTask3;
        DynamicTask dynamicTask4 = new DynamicTask("FILTERS", 3, Collections.singleton(DynamicLib.FILTERS), null);
        FILTERS = dynamicTask4;
        DynamicTask dynamicTask5 = new DynamicTask("LIVES_PUBLISHER", 4, Collections.singleton(DynamicLib.LIVES_PUBLISHER), rl3.y0(new NativeLib[]{NativeLib.OK_NATIVE_NET, NativeLib.OK_NATIVE_TOOLS}));
        LIVES_PUBLISHER = dynamicTask5;
        DynamicTask dynamicTask6 = new DynamicTask("LUTS", 5, Collections.singleton(DynamicLib.LUTS), null);
        LUTS = dynamicTask6;
        DynamicTask dynamicTask7 = new DynamicTask("APPLOVIN", 6, Collections.singleton(DynamicLib.APPLOVIN), null);
        APPLOVIN = dynamicTask7;
        DynamicTask[] dynamicTaskArr = {dynamicTask, dynamicTask2, dynamicTask3, dynamicTask4, dynamicTask5, dynamicTask6, dynamicTask7};
        $VALUES = dynamicTaskArr;
        $ENTRIES = new asp(dynamicTaskArr);
    }

    public DynamicTask(String str, int i, Set set, Set set2) {
        this.libs = set;
        this.artifacts = set2;
    }

    public static DynamicTask valueOf(String str) {
        return (DynamicTask) Enum.valueOf(DynamicTask.class, str);
    }

    public static DynamicTask[] values() {
        return (DynamicTask[]) $VALUES.clone();
    }

    public final Set<NativeLib> h() {
        return this.artifacts;
    }

    public final Set<DynamicLib> i() {
        return this.libs;
    }
}
