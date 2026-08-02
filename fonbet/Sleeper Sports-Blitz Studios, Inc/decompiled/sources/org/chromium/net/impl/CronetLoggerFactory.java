package org.chromium.net.impl;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.telemetry.CronetLoggerImpl;

/* loaded from: classes10.dex */
public final class CronetLoggerFactory {
    private static final int SAMPLE_RATE_PER_SECOND = 1;
    private static final String TAG = "CronetLoggerFactory";
    private static CronetLogger sLogger;

    private CronetLoggerFactory() {
    }

    public static CronetLogger createLogger(Context ctx, CronetLogger.CronetSource source) {
        CronetLogger cronetLogger;
        synchronized (CronetLoggerFactory.class) {
            if (sLogger == null && Build.VERSION.SDK_INT >= 30 && CronetManifest.isAppOptedInForTelemetry(ctx, source)) {
                try {
                    sLogger = new CronetLoggerImpl(1);
                } catch (Exception e) {
                    Log.e(TAG, "Exception creating an instance of CronetLoggerImpl", e);
                }
            }
            if (sLogger == null) {
                sLogger = new NoOpLogger();
            }
            cronetLogger = sLogger;
        }
        return cronetLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setLoggerForTesting(CronetLogger testingLogger) {
        synchronized (CronetLoggerFactory.class) {
            sLogger = testingLogger;
        }
    }

    public static final class SwapLoggerForTesting implements AutoCloseable {
        public SwapLoggerForTesting(CronetLogger testLogger) {
            CronetLoggerFactory.setLoggerForTesting(testLogger);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            CronetLoggerFactory.setLoggerForTesting(null);
        }
    }
}
