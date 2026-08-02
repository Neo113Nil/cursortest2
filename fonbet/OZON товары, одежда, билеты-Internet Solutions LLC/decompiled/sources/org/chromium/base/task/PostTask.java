package org.chromium.base.task;

import android.os.Looper;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.chromium.base.ThreadUtils;

/* loaded from: classes10.dex */
public final class PostTask {

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f78561c;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f78564f = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f78559a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList f78560b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static e f78562d = new e();

    /* renamed from: e, reason: collision with root package name */
    private static final f[] f78563e = new f[9];

    static {
        resetTaskRunner();
    }

    static Executor a() {
        return f78562d;
    }

    public static void b(Runnable runnable, int i11) {
        ((TaskRunnerImpl) f78563e[i11]).e(runnable);
    }

    static boolean c(TaskRunnerImpl taskRunnerImpl) {
        synchronized (f78559a) {
            try {
                ArrayList arrayList = f78560b;
                if (arrayList == null) {
                    return false;
                }
                arrayList.add(taskRunnerImpl);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(Runnable runnable) {
        if (ThreadUtils.a().getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            b(runnable, 7);
        }
    }

    @CalledByNative
    private static void onNativeSchedulerReady() {
        ArrayList arrayList;
        if (f78561c) {
            return;
        }
        f78561c = true;
        synchronized (f78559a) {
            arrayList = f78560b;
            f78560b = null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TaskRunnerImpl) it.next()).d();
        }
    }

    @CalledByNative
    private static void resetTaskRunner() {
        f[] fVarArr;
        int i11 = 0;
        while (true) {
            fVarArr = f78563e;
            if (i11 > 5) {
                break;
            }
            fVarArr[i11] = new TaskRunnerImpl(i11);
            i11++;
        }
        for (int i12 = 6; i12 <= 8; i12++) {
            fVarArr[i12] = new i(i12, "UiThreadTaskRunner", 2);
        }
    }
}
