package g6;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f9864a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9866c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9867d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f9868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f9869f;

    public q(e eVar, int i5, Bundle bundle) {
        this.f9869f = eVar;
        Boolean bool = Boolean.TRUE;
        this.f9866c = eVar;
        this.f9864a = bool;
        this.f9865b = false;
        this.f9867d = i5;
        this.f9868e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ConnectionResult connectionResult);

    public final void c() {
        d();
        e eVar = this.f9866c;
        synchronized (eVar.f9814l) {
            eVar.f9814l.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f9864a = null;
        }
    }
}
