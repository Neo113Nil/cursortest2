package zone.bi.mobile.fingerprint.impl.cs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import k5.C7556q0;
import zone.bi.mobile.fingerprint.impl.cs.a;

/* loaded from: classes4.dex */
public final class b implements Qm0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f109328a;

    /* renamed from: b, reason: collision with root package name */
    private C7556q0 f109329b;

    /* renamed from: c, reason: collision with root package name */
    private zone.bi.mobile.fingerprint.impl.cs.a f109330c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f109331d;

    /* renamed from: e, reason: collision with root package name */
    private final ServiceConnection f109332e = new a();

    final class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zone.bi.mobile.fingerprint.impl.cs.a c2360a;
            int i11 = a.AbstractBinderC2359a.f109326e;
            if (iBinder == null) {
                c2360a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
                c2360a = (queryLocalInterface == null || !(queryLocalInterface instanceof zone.bi.mobile.fingerprint.impl.cs.a)) ? new a.AbstractBinderC2359a.C2360a(iBinder) : (zone.bi.mobile.fingerprint.impl.cs.a) queryLocalInterface;
            }
            b bVar = b.this;
            bVar.f109330c = c2360a;
            bVar.f109331d = true;
            bVar.a();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            b bVar = b.this;
            bVar.f109331d = false;
            bVar.f109330c = null;
        }
    }

    public b(@NonNull Context context) {
        this.f109328a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        zone.bi.mobile.fingerprint.impl.cs.a aVar;
        int i11;
        if (this.f109329b == null || (aVar = this.f109330c) == null) {
            return;
        }
        try {
            i11 = aVar.b();
        } catch (RemoteException unused) {
            i11 = -1;
        }
        C7556q0 c7556q0 = this.f109329b;
        c7556q0.f70825a[0] = i11;
        b bVar = (b) c7556q0.f70826b;
        bVar.f109329b = null;
        bVar.f109330c = null;
        if (bVar.f109331d) {
            bVar.f109328a.unbindService(bVar.f109332e);
            bVar.f109331d = false;
        }
        c7556q0.f70827c.countDown();
    }

    public final void b(@NonNull C7556q0 c7556q0) {
        this.f109329b = c7556q0;
        if (this.f109331d) {
            a();
        } else {
            Context context = this.f109328a;
            context.bindService(new Intent(context, (Class<?>) FpWorkerService.class), this.f109332e, 1);
        }
    }
}
