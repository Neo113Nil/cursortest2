package j1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18221a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.d f18222b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.f f18223c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18224d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f18225e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f18226f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f18227g;

    /* renamed from: h, reason: collision with root package name */
    public k2.x f18228h;

    public p(Context context, m0.d dVar) {
        rh.g.e(context, "Context cannot be null");
        this.f18221a = context.getApplicationContext();
        this.f18222b = dVar;
        this.f18223c = q.f18229d;
    }

    @Override // j1.i
    public final void a(k2.x xVar) {
        synchronized (this.f18224d) {
            this.f18228h = xVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f18224d) {
            try {
                this.f18228h = null;
                Handler handler = this.f18225e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f18225e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f18227g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f18226f = null;
                this.f18227g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f18224d) {
            try {
                if (this.f18228h == null) {
                    return;
                }
                if (this.f18226f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f18227g = threadPoolExecutor;
                    this.f18226f = threadPoolExecutor;
                }
                this.f18226f.execute(new io.sentry.android.core.f(12, this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final m0.i d() {
        try {
            m3.f fVar = this.f18223c;
            Context context = this.f18221a;
            m0.d dVar = this.f18222b;
            fVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            com.google.android.flexbox.d a7 = m0.c.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i5 = a7.f4226a;
            if (i5 != 0) {
                throw new RuntimeException(d9.e.f(i5, "fetchFonts failed (", ")"));
            }
            m0.i[] iVarArr = (m0.i[]) a7.f4227b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
