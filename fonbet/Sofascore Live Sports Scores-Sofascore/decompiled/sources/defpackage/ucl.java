package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ucl {
    public abstract kdb a(Context context, String str, WorkerParameters workerParameters);

    public final kdb b(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        kdb a = a(context, str, workerParameters);
        if (a == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(kdb.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    a = (kdb) newInstance;
                } finally {
                }
            } finally {
            }
        }
        if (!a.isUsed()) {
            return a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
