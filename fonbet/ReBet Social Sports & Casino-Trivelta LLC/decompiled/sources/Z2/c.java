package Z2;

import Ph.AbstractC1481v0;
import Ph.L;
import Y2.D;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final D f14560a;

    /* renamed from: b, reason: collision with root package name */
    public final L f14561b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f14562c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final Executor f14563d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f14562c.post(runnable);
        }
    }

    public c(Executor executor) {
        D d10 = new D(executor);
        this.f14560a = d10;
        this.f14561b = AbstractC1481v0.b(d10);
    }

    @Override // Z2.b
    public Executor a() {
        return this.f14563d;
    }

    @Override // Z2.b
    public L b() {
        return this.f14561b;
    }

    @Override // Z2.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public D c() {
        return this.f14560a;
    }
}
