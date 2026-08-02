package com.logrocket.core;

import android.util.Log;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
/* loaded from: classes.dex */
class PostInitializationTasks {
    private static final int MAX_QUEUE_SIZE = 100;
    private static List<t> tasks = new ArrayList();
    private static final WeakHashMap<t, Long> taskToTimeOverride = new WeakHashMap<>();
    private static final AtomicBoolean isDrained = new AtomicBoolean(false);
    private static final AtomicBoolean hasWarned = new AtomicBoolean(false);

    public static void drain(LogRocketCore logRocketCore) {
        if (isDrained.compareAndSet(false, true)) {
            ArrayList arrayList = new ArrayList(tasks);
            tasks.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                WeakHashMap<t, Long> weakHashMap = taskToTimeOverride;
                run(logRocketCore, tVar, weakHashMap.containsKey(tVar) ? weakHashMap.get(tVar) : null);
                weakHashMap.remove(tVar);
            }
        }
    }

    public static void reset() {
        isDrained.set(false);
        hasWarned.set(false);
        tasks = new ArrayList();
    }

    public static void run(t tVar) {
        if (isDrained.get()) {
            run(LogRocketCore.maybeGetInstance(), tVar, null);
            return;
        }
        if (tasks.size() < 100) {
            tasks.add(tVar);
            taskToTimeOverride.put(tVar, Long.valueOf(System.currentTimeMillis()));
        } else {
            if (hasWarned.compareAndSet(false, true)) {
                return;
            }
            Log.w("LogRocket", "Initialization task queue has reached maximum size.");
        }
    }

    public static void run(LogRocketCore logRocketCore, t tVar, Long l6) {
        try {
            tVar.a(logRocketCore, l6);
        } catch (Throwable th2) {
            Log.e("LogRocket", "Failed to run post initialization task", th2);
        }
    }
}
