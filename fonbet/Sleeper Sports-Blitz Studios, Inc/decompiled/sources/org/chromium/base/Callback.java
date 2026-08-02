package org.chromium.base;

import java.util.Optional;

@FunctionalInterface
/* loaded from: classes10.dex */
public interface Callback<T> {
    /* renamed from: onResult, reason: merged with bridge method [inline-methods] */
    void lambda$bind$0(T result);

    default Runnable bind(final T result) {
        return new Runnable() { // from class: org.chromium.base.Callback$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Callback.this.lambda$bind$0(result);
            }
        };
    }

    static <T> void runNullSafe(Callback<T> callback, T object) {
        if (callback != null) {
            callback.lambda$bind$0(object);
        }
    }

    public static abstract class Helper {
        static void onObjectResultFromNative(Callback callback, Object result) {
            callback.lambda$bind$0(result);
        }

        static void onOptionalStringResultFromNative(Callback<Optional<String>> callback, boolean hasValue, String result) {
            callback.lambda$bind$0(hasValue ? Optional.of(result) : Optional.empty());
        }

        static void onBooleanResultFromNative(Callback callback, boolean result) {
            callback.lambda$bind$0(Boolean.valueOf(result));
        }

        static void onIntResultFromNative(Callback callback, int result) {
            callback.lambda$bind$0(Integer.valueOf(result));
        }

        static void onLongResultFromNative(Callback callback, long result) {
            callback.lambda$bind$0(Long.valueOf(result));
        }

        static void onTimeResultFromNative(Callback callback, long result) {
            callback.lambda$bind$0(Long.valueOf(result));
        }

        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }
}
