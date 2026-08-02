package j9;

import android.util.Log;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import d4.z;
import j$.util.Objects;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f18296d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final o.a f18297e = new o.a(1);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f18298a;

    /* renamed from: b, reason: collision with root package name */
    public final n f18299b;

    /* renamed from: c, reason: collision with root package name */
    public w7.m f18300c = null;

    public d(Executor executor, n nVar) {
        this.f18298a = executor;
        this.f18299b = nVar;
    }

    public static Object a(Task task) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b6.h hVar = new b6.h(1);
        Executor executor = f18297e;
        task.e(executor, hVar);
        task.c(executor, hVar);
        task.a(executor, hVar);
        if (!hVar.f3051b.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized d d(Executor executor, n nVar) {
        d dVar;
        synchronized (d.class) {
            try {
                String str = nVar.f18359b;
                HashMap hashMap = f18296d;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new d(executor, nVar));
                }
                dVar = (d) hashMap.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public final synchronized Task b() {
        try {
            w7.m mVar = this.f18300c;
            if (mVar != null) {
                if (mVar.k() && !this.f18300c.isSuccessful()) {
                }
            }
            Executor executor = this.f18298a;
            n nVar = this.f18299b;
            Objects.requireNonNull(nVar);
            this.f18300c = d5.d(executor, new z(5, nVar));
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f18300c;
    }

    public final e c() {
        synchronized (this) {
            try {
                w7.m mVar = this.f18300c;
                if (mVar != null && mVar.isSuccessful()) {
                    return (e) this.f18300c.getResult();
                }
                try {
                    Task b10 = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (e) a(b10);
                } catch (InterruptedException | ExecutionException | TimeoutException e7) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e7);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task e(e eVar) {
        com.google.firebase.messaging.i iVar = new com.google.firebase.messaging.i(9, this, eVar);
        Executor executor = this.f18298a;
        return d5.d(executor, iVar).l(executor, new com.google.firebase.messaging.g(18, this, eVar));
    }
}
