package e6;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8727a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f8728b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f8729c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.h0 f8730d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.c f8731e;

    /* renamed from: f, reason: collision with root package name */
    public final s.f f8732f;

    /* renamed from: g, reason: collision with root package name */
    public final e f8733g;

    public n(h hVar, e eVar) {
        c6.c cVar = c6.c.f3657e;
        this.f8727a = hVar;
        this.f8729c = new AtomicReference(null);
        this.f8730d = new com.google.android.gms.internal.measurement.h0(Looper.getMainLooper(), 1);
        this.f8731e = cVar;
        this.f8732f = new s.f(0);
        this.f8733g = eVar;
        hVar.u(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e6.h, java.lang.Object] */
    public final Activity a() {
        Activity j = this.f8727a.j();
        g6.v.h(j);
        return j;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.f8729c.set(bundle.getBoolean("resolving_error", false) ? new f0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void c() {
        this.f8728b = false;
        e eVar = this.f8733g;
        eVar.getClass();
        synchronized (e.f8691r) {
            try {
                if (eVar.f8702k == this) {
                    eVar.f8702k = null;
                    eVar.f8703l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(ConnectionResult connectionResult, int i5) {
        this.f8729c.set(null);
        this.f8733g.i(connectionResult, i5);
    }

    public final void e() {
        if (this.f8732f.isEmpty()) {
            return;
        }
        this.f8733g.f(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null, null);
        f0 f0Var = (f0) this.f8729c.get();
        d(connectionResult, f0Var == null ? -1 : f0Var.f8708a);
    }
}
