package g6;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements d, b, c {

    /* renamed from: b, reason: collision with root package name */
    public static h f9844b;

    /* renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f9845c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f9846a;

    public /* synthetic */ h(Object obj) {
        this.f9846a = obj;
    }

    public static synchronized h b() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f9844b == null) {
                    f9844b = new h();
                }
                hVar = f9844b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // g6.b
    public void a(int i5) {
        ((d6.h) this.f9846a).a(i5);
    }

    @Override // g6.b
    public void e() {
        ((d6.h) this.f9846a).e();
    }

    @Override // g6.c
    public void f(ConnectionResult connectionResult) {
        ((d6.i) this.f9846a).f(connectionResult);
    }

    @Override // g6.d
    public void g(ConnectionResult connectionResult) {
        e eVar = (e) this.f9846a;
        if (connectionResult.f4441b == 0) {
            eVar.k(null, eVar.l());
            return;
        }
        c cVar = eVar.f9818p;
        if (cVar != null) {
            cVar.f(connectionResult);
        }
    }

    public h(e eVar) {
        Objects.requireNonNull(eVar);
        this.f9846a = eVar;
    }
}
