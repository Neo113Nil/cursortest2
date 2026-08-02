package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;

/* loaded from: classes9.dex */
public final class SentryCrashLastRunState {
    private static final SentryCrashLastRunState INSTANCE = new SentryCrashLastRunState();
    private Boolean crashedLastRun;
    private final AutoClosableReentrantLock crashedLastRunLock = new AutoClosableReentrantLock();
    private boolean readCrashedLastRun;

    private SentryCrashLastRunState() {
    }

    public static SentryCrashLastRunState getInstance() {
        return INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean isCrashedLastRun(String str, boolean z) {
        ISentryLifecycleToken acquire = this.crashedLastRunLock.acquire();
        try {
            if (this.readCrashedLastRun) {
                Boolean bool = this.crashedLastRun;
                if (acquire != null) {
                    acquire.close();
                }
                return bool;
            }
            if (str == null) {
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            boolean z2 = true;
            this.readCrashedLastRun = true;
            File file = new File(str, EnvelopeCache.CRASH_MARKER_FILE);
            File file2 = new File(str, EnvelopeCache.NATIVE_CRASH_MARKER_FILE);
            if (file.exists()) {
                file.delete();
            } else {
                if (file2.exists()) {
                    if (z) {
                        file2.delete();
                    }
                    this.crashedLastRun = Boolean.valueOf(z2);
                    if (acquire != null) {
                        acquire.close();
                    }
                    return this.crashedLastRun;
                }
                z2 = false;
                this.crashedLastRun = Boolean.valueOf(z2);
                if (acquire != null) {
                }
                return this.crashedLastRun;
            }
            this.crashedLastRun = Boolean.valueOf(z2);
            if (acquire != null) {
            }
            return this.crashedLastRun;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void setCrashedLastRun(boolean z) {
        ISentryLifecycleToken acquire = this.crashedLastRunLock.acquire();
        try {
            if (!this.readCrashedLastRun) {
                this.crashedLastRun = Boolean.valueOf(z);
                this.readCrashedLastRun = true;
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void reset() {
        ISentryLifecycleToken acquire = this.crashedLastRunLock.acquire();
        try {
            this.readCrashedLastRun = false;
            this.crashedLastRun = null;
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
