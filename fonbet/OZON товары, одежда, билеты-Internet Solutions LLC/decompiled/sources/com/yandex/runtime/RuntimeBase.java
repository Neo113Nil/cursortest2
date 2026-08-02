package com.yandex.runtime;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes9.dex */
public class RuntimeBase {
    @NonNull
    public static native String getVersion();

    public static native int onDartVMCreated();

    public static native void onDetachedFromEngine(int i11);

    public static native void setPreinitializationOptions(@NonNull Map<String, String> map);
}
