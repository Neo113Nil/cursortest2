package e3;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8565a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f8566b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f8567c = new AtomicInteger(-256);

    /* renamed from: d, reason: collision with root package name */
    public boolean f8568d;

    public w(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f8565a = context;
        this.f8566b = workerParameters;
    }

    public abstract u.k a();

    public abstract u.k b();
}
