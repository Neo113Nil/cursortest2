package l4;

import com.android.billingclient.api.l0;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f19353a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f19354b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19355c = new Object();

    public c(e eVar, l0 l0Var) {
        this.f19353a = eVar;
        this.f19354b = l0Var;
    }

    public final void a() {
        synchronized (this.f19355c) {
            ((io.sentry.android.replay.gestures.c) this.f19353a.f19361c).d(-1L);
            l0 l0Var = this.f19354b;
            l0Var.f4044b = 0;
            ((LinkedHashMap) l0Var.f4045c).clear();
            Unit unit = Unit.f19194a;
        }
    }

    public final long b() {
        long b10;
        synchronized (this.f19355c) {
            b10 = ((io.sentry.android.replay.gestures.c) this.f19353a.f19361c).b();
        }
        return b10;
    }

    public final void c(a aVar) {
        synchronized (this.f19355c) {
            io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.f19353a.f19361c;
            Object remove = ((LinkedHashMap) cVar.f16042a).remove(aVar);
            if (remove != null) {
                cVar.f16044c = cVar.b() - cVar.c(aVar, remove);
                cVar.a(aVar, remove, null);
            }
            if (remove != null) {
            }
            if (((LinkedHashMap) this.f19354b.f4045c).remove(aVar) != null) {
            }
        }
    }

    public final void d(long j) {
        synchronized (this.f19355c) {
            io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.f19353a.f19361c;
            cVar.f16043b = j;
            cVar.d(j);
            Unit unit = Unit.f19194a;
        }
    }

    public final void e(long j) {
        synchronized (this.f19355c) {
            ((io.sentry.android.replay.gestures.c) this.f19353a.f19361c).d(j);
            Unit unit = Unit.f19194a;
        }
    }
}
