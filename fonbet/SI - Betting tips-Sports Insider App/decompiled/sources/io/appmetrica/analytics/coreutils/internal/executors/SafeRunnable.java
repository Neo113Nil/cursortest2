package io.appmetrica.analytics.coreutils.internal.executors;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class SafeRunnable implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            runSafety();
        } catch (Throwable unused) {
        }
    }

    public abstract void runSafety() throws Throwable;
}
