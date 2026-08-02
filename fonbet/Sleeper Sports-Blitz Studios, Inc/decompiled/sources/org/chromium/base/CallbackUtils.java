package org.chromium.base;

/* loaded from: classes10.dex */
public class CallbackUtils {
    private static final Callback DO_NOTHING_CALLBACK = new Callback() { // from class: org.chromium.base.CallbackUtils$$ExternalSyntheticLambda0
        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public final void lambda$bind$0(Object obj) {
            CallbackUtils.lambda$static$0(obj);
        }
    };
    private static final Runnable DO_NOTHING_RUNNABLE = new Runnable() { // from class: org.chromium.base.CallbackUtils$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            CallbackUtils.lambda$static$1();
        }
    };

    static /* synthetic */ void lambda$static$0(Object obj) {
    }

    static /* synthetic */ void lambda$static$1() {
    }

    public static <T> Callback<T> emptyCallback() {
        return DO_NOTHING_CALLBACK;
    }

    public static Runnable emptyRunnable() {
        return DO_NOTHING_RUNNABLE;
    }
}
