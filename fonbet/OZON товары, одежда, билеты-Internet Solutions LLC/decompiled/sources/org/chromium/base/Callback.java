package org.chromium.base;

import internal.org.jni_zero.CalledByNative;
import java.util.Optional;

@FunctionalInterface
/* loaded from: classes10.dex */
public interface Callback<T> {

    public static abstract class Helper {
        @CalledByNative
        static void onBooleanResultFromNative(Callback callback, boolean z11) {
            callback.onResult(Boolean.valueOf(z11));
        }

        @CalledByNative
        static void onIntResultFromNative(Callback callback, int i11) {
            callback.onResult(Integer.valueOf(i11));
        }

        @CalledByNative
        static void onLongResultFromNative(Callback callback, long j11) {
            callback.onResult(Long.valueOf(j11));
        }

        @CalledByNative
        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.onResult(obj);
        }

        @CalledByNative
        static void onOptionalStringResultFromNative(Callback<Optional<String>> callback, boolean z11, String str) {
            callback.onResult(z11 ? Optional.of(str) : Optional.empty());
        }

        @CalledByNative
        static void onTimeResultFromNative(Callback callback, long j11) {
            callback.onResult(Long.valueOf(j11));
        }

        @CalledByNative
        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    void onResult(T t2);
}
