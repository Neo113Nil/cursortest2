package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.d5;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8711a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d5 f8712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8713c;

    public h0(d5 d5Var, w7.g gVar, io.sentry.hints.j jVar) {
        this.f8712b = d5Var;
        this.f8713c = gVar;
    }

    public final void a(Status status) {
        d6.l lVar;
        switch (this.f8711a) {
            case 0:
                ((Map) ((x5.h) this.f8713c).f25409a).remove((BasePendingResult) this.f8712b);
                return;
            default:
                if (!status.c()) {
                    ((w7.g) this.f8713c).a(g6.v.l(status));
                    return;
                }
                d5 d5Var = this.f8712b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                BasePendingResult basePendingResult = (BasePendingResult) d5Var;
                g6.v.j("Result has already been consumed.", !basePendingResult.f4476g);
                try {
                    if (!basePendingResult.f4471b.await(0L, timeUnit)) {
                        basePendingResult.s0(Status.f4464h);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.s0(Status.f4462f);
                }
                g6.v.j("Result is not ready.", basePendingResult.t0());
                synchronized (basePendingResult.f4470a) {
                    g6.v.j("Result has already been consumed.", !basePendingResult.f4476g);
                    g6.v.j("Result is not ready.", basePendingResult.t0());
                    lVar = basePendingResult.f4474e;
                    basePendingResult.f4474e = null;
                    basePendingResult.f4476g = true;
                }
                if (basePendingResult.f4473d.getAndSet(null) != null) {
                    throw new ClassCastException();
                }
                g6.v.h(lVar);
                ((w7.g) this.f8713c).b(null);
                return;
        }
    }

    public h0(x5.h hVar, BasePendingResult basePendingResult) {
        this.f8712b = basePendingResult;
        Objects.requireNonNull(hVar);
        this.f8713c = hVar;
    }
}
