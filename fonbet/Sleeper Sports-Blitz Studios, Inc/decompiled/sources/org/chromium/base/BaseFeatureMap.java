package org.chromium.base;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class BaseFeatureMap extends FeatureMap {
    private static final BaseFeatureMap sInstance = new BaseFeatureMap();

    public interface Natives {
        long getNativeMap();
    }

    private BaseFeatureMap() {
    }

    public static BaseFeatureMap getInstance() {
        return sInstance;
    }

    public static boolean isEnabled(String featureName) {
        return getInstance().isEnabledInNative(featureName);
    }

    protected long getNativeMap() {
        return BaseFeatureMapJni.get().getNativeMap();
    }
}
