package e3;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f8535a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final l f8536b = new l();

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f8537c = new c0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f8538d = new c0(0);

    public l() {
        List list = Collections.EMPTY_LIST;
    }

    public w a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        try {
            Class<? extends U> asSubclass = Class.forName(workerClassName).asSubclass(w.class);
            Intrinsics.checkNotNull(asSubclass);
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                Intrinsics.checkNotNull(newInstance);
                w wVar = (w) newInstance;
                if (!wVar.f8568d) {
                    return wVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th2) {
                x.e().d(o0.f8556a, "Could not instantiate " + workerClassName, th2);
                throw th2;
            }
        } catch (Throwable th3) {
            x.e().d(o0.f8556a, "Invalid class: " + workerClassName, th3);
            throw th3;
        }
    }
}
