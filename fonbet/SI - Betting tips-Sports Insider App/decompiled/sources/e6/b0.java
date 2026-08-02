package e6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.w0;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends e0 {

    /* renamed from: b, reason: collision with root package name */
    public final x5.f f8678b;

    public b0(x5.f fVar) {
        super(1);
        this.f8678b = fVar;
    }

    @Override // e6.e0
    public final void a(Status status) {
        try {
            this.f8678b.w0(status);
        } catch (IllegalStateException e7) {
            w0.n("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // e6.e0
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f8678b.w0(new Status(10, d9.e.m(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e7) {
            w0.n("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // e6.e0
    public final void c(x5.h hVar, boolean z5) {
        Boolean valueOf = Boolean.valueOf(z5);
        Map map = (Map) hVar.f25409a;
        x5.f fVar = this.f8678b;
        map.put(fVar, valueOf);
        fVar.q0(new h0(hVar, fVar));
    }

    @Override // e6.e0
    public final void d(p pVar) {
        try {
            x5.f fVar = this.f8678b;
            d6.c cVar = pVar.f8736f;
            fVar.getClass();
            try {
                fVar.v0(cVar);
            } catch (DeadObjectException e7) {
                fVar.w0(new Status(8, e7.getLocalizedMessage(), null, null));
                throw e7;
            } catch (RemoteException e9) {
                fVar.w0(new Status(8, e9.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e10) {
            b(e10);
        }
    }
}
