package Q2;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class O {
    public static final androidx.work.c c(Context context, String str, WorkerParameters workerParameters) {
        String str2;
        try {
            Object newInstance = d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                val co…Parameters)\n            }");
            return (androidx.work.c) newInstance;
        } catch (Throwable th2) {
            AbstractC1508t e10 = AbstractC1508t.e();
            str2 = P.f9255a;
            e10.d(str2, "Could not instantiate " + str, th2);
            throw th2;
        }
    }

    public static final Class d(String str) {
        String str2;
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(androidx.work.c.class);
            Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
            return asSubclass;
        } catch (Throwable th2) {
            AbstractC1508t e10 = AbstractC1508t.e();
            str2 = P.f9255a;
            e10.d(str2, "Invalid class: " + str, th2);
            throw th2;
        }
    }

    public abstract androidx.work.c a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.c b(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        androidx.work.c a10 = a(appContext, workerClassName, workerParameters);
        if (a10 == null) {
            a10 = c(appContext, workerClassName, workerParameters);
        }
        if (!a10.isUsed()) {
            return a10;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
