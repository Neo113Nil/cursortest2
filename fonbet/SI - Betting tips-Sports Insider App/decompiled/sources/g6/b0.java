package g6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends q {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f9797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f9798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e eVar, int i5, IBinder iBinder, Bundle bundle) {
        super(eVar, i5, bundle);
        this.f9798h = eVar;
        this.f9797g = iBinder;
    }

    @Override // g6.q
    public final boolean a() {
        IBinder iBinder = this.f9797g;
        try {
            v.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.f9798h;
            if (!eVar.n().equals(interfaceDescriptor)) {
                String n9 = eVar.n();
                w0.m("GmsClient", d9.e.n(new StringBuilder(n9.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", n9, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface d10 = eVar.d(iBinder);
            if (d10 == null || !(eVar.v(2, 4, d10) || eVar.v(3, 4, d10))) {
                return false;
            }
            eVar.f9822u = null;
            b bVar = eVar.f9817o;
            if (bVar == null) {
                return true;
            }
            bVar.e();
            return true;
        } catch (RemoteException unused) {
            w0.m("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // g6.q
    public final void b(ConnectionResult connectionResult) {
        c cVar = this.f9798h.f9818p;
        if (cVar != null) {
            cVar.f(connectionResult);
        }
        System.currentTimeMillis();
    }
}
