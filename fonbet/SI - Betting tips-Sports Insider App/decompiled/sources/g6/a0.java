package g6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f9795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9796b;

    public a0(e eVar, int i5) {
        this.f9796b = eVar;
        this.f9795a = i5;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar = this.f9796b;
        if (iBinder == null) {
            eVar.w();
            return;
        }
        synchronized (eVar.f9811h) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                eVar.f9812i = (queryLocalInterface == null || !(queryLocalInterface instanceof r)) ? new r(iBinder) : (r) queryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e eVar2 = this.f9796b;
        int i5 = this.f9795a;
        eVar2.getClass();
        c0 c0Var = new c0(eVar2, 0, null);
        y yVar = eVar2.f9809f;
        yVar.sendMessage(yVar.obtainMessage(7, i5, -1, c0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.f9796b;
        synchronized (eVar.f9811h) {
            eVar.f9812i = null;
        }
        e eVar2 = this.f9796b;
        int i5 = this.f9795a;
        y yVar = eVar2.f9809f;
        yVar.sendMessage(yVar.obtainMessage(6, i5, 1));
    }
}
