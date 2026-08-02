package x9;

import aa.g;
import ch.f;
import com.logrocket.core.LogRocketCore;
import io.sentry.hints.j;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f25428a;

    /* renamed from: b, reason: collision with root package name */
    public final g f25429b;

    /* renamed from: f, reason: collision with root package name */
    public ch.d f25433f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25430c = true;

    /* renamed from: g, reason: collision with root package name */
    public long f25434g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f25435h = new AtomicLong(0);
    public final j j = new j(1);

    /* renamed from: k, reason: collision with root package name */
    public final int f25437k = 700;

    /* renamed from: d, reason: collision with root package name */
    public final int f25431d = 10;

    /* renamed from: e, reason: collision with root package name */
    public final int f25432e = 20000;

    /* renamed from: i, reason: collision with root package name */
    public long f25436i = System.currentTimeMillis();

    public d(LogRocketCore logRocketCore) {
        this.f25428a = new WeakReference(logRocketCore);
        ch.d v5 = f.v();
        this.f25433f = v5;
        v5.d();
        f.p((f) v5.f6816b);
        this.f25429b = new g(aa.j.a("lr-frame-tracker"), new c(this, 0), null, 100, 100);
    }
}
