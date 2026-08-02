package com.logrocket.core;

import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f6424a;

    static {
        new AtomicInteger(0);
        f6424a = Executors.newSingleThreadExecutor();
    }

    public static void a() {
        LogRocketCore maybeGetInstance = LogRocketCore.maybeGetInstance();
        if (maybeGetInstance != null) {
            x xVar = maybeGetInstance.f6386i;
            if (xVar.j.get() && xVar.f6656m.get() && !xVar.f6654k.get()) {
                synchronized (xVar.f6653i) {
                    try {
                        if (xVar.f6657n == null) {
                            xVar.f6657n = xVar.f6645a.schedule(new v(xVar, 1), 0L, TimeUnit.SECONDS);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static void b(d0 d0Var) {
        r rVar = new r(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(13, d0Var));
        if (s.f6638b.get()) {
            try {
                d0Var.g(LogRocketCore.maybeGetInstance().i());
            } catch (Throwable th2) {
                Log.e("LogRocket", "Failed to run post acceptance task", th2);
            }
        }
        if (s.f6637a.size() < 100) {
            s.f6637a.add(rVar);
        } else {
            if (s.f6639c.compareAndSet(false, true)) {
                return;
            }
            Log.w("LogRocket", "Initialization task queue has reached maximum size.");
        }
    }

    public static void c(final String str, final HashMap hashMap) {
        PostInitializationTasks.run(new t() { // from class: com.logrocket.core.y
            @Override // com.logrocket.core.t
            public final void a(LogRocketCore logRocketCore, Long l6) {
                logRocketCore.identify(str, hashMap, Boolean.FALSE, l6);
            }
        });
    }
}
