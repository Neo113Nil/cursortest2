package org.chromium.base.supplier;

import java.util.function.Supplier;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.supplier.SupplierUtils;

/* loaded from: classes10.dex */
public class SupplierUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private SupplierUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Barrier {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Runnable mCallback;
        private final ThreadUtils.ThreadChecker mThreadChecker;
        private int mWaitingCount;

        private Barrier() {
            this.mThreadChecker = new ThreadUtils.ThreadChecker();
        }

        void waitForAll(Runnable callback, Supplier<?>... suppliers) {
            this.mThreadChecker.assertOnValidThread();
            this.mCallback = callback;
            Callback callback2 = new Callback() { // from class: org.chromium.base.supplier.SupplierUtils$Barrier$$ExternalSyntheticLambda0
                @Override // org.chromium.base.Callback
                /* renamed from: onResult */
                public final void lambda$bind$0(Object obj) {
                    SupplierUtils.Barrier.this.lambda$waitForAll$0(obj);
                }
            };
            int i = 0;
            for (Supplier<?> supplier : suppliers) {
                if (supplier.get() == null) {
                    i++;
                    if (supplier instanceof ObservableSupplier) {
                        new OneShotCallback((ObservableSupplier) supplier, callback2);
                    } else if (supplier instanceof OneshotSupplier) {
                        ((OneshotSupplier) supplier).onAvailable(callback2);
                    } else if (supplier instanceof SyncOneshotSupplier) {
                        ((SyncOneshotSupplier) supplier).onAvailable(callback2);
                    }
                }
            }
            this.mWaitingCount = i;
            notifyCallbackIfAppropriate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$waitForAll$0(Object obj) {
            onSupplierAvailable();
        }

        private void onSupplierAvailable() {
            this.mThreadChecker.assertOnValidThread();
            this.mWaitingCount--;
            notifyCallbackIfAppropriate();
        }

        private void notifyCallbackIfAppropriate() {
            Runnable runnable;
            if (this.mWaitingCount == 0 && (runnable = this.mCallback) != null) {
                runnable.run();
                this.mCallback = null;
            }
        }
    }

    public static void waitForAll(Runnable callback, Supplier<?>... suppliers) {
        new Barrier().waitForAll(callback, suppliers);
    }
}
