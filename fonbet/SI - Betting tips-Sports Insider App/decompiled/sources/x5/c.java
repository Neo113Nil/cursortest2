package x5;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public v1.b f25395a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25396b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25397c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25398d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25399e = false;

    /* renamed from: f, reason: collision with root package name */
    public Executor f25400f;

    /* renamed from: g, reason: collision with root package name */
    public volatile w1.a f25401g;

    /* renamed from: h, reason: collision with root package name */
    public volatile w1.a f25402h;

    /* renamed from: i, reason: collision with root package name */
    public final Semaphore f25403i;
    public final Set j;

    public c(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f25403i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.f25401g != null) {
            boolean z5 = this.f25396b;
            if (!z5) {
                if (z5) {
                    c();
                } else {
                    this.f25399e = true;
                }
            }
            if (this.f25402h != null) {
                this.f25401g.getClass();
                this.f25401g = null;
                return;
            }
            this.f25401g.getClass();
            w1.a aVar = this.f25401g;
            aVar.f24949c.set(true);
            if (aVar.f24947a.cancel(false)) {
                this.f25402h = this.f25401g;
            }
            this.f25401g = null;
        }
    }

    public final void b() {
        if (this.f25402h != null || this.f25401g == null) {
            return;
        }
        this.f25401g.getClass();
        if (this.f25400f == null) {
            this.f25400f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        w1.a aVar = this.f25401g;
        Executor executor = this.f25400f;
        if (aVar.f24948b == 1) {
            aVar.f24948b = 2;
            executor.execute(aVar.f24947a);
            return;
        }
        int d10 = v.f.d(aVar.f24948b);
        if (d10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (d10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f25401g = new w1.a(this);
        b();
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((d6.j) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f25403i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
