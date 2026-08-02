package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.zzgtj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zxc implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zxc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [sm9] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        rm9 rm9Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                componentName.getClass();
                iBinder.getClass();
                rqa rqaVar = (rqa) obj;
                int i2 = ayc.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface(sm9.u7);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof sm9)) {
                    rm9 rm9Var2 = new rm9();
                    rm9Var2.a = iBinder;
                    rm9Var = rm9Var2;
                } else {
                    rm9Var = (sm9) queryLocalInterface;
                }
                rqaVar.g = rm9Var;
                try {
                    rqaVar.a = rm9Var.u0((yxc) rqaVar.j, (String) rqaVar.b);
                    break;
                } catch (RemoteException unused) {
                    return;
                }
                break;
            case 1:
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    "onServiceConnected: ".concat(String.valueOf(componentName));
                }
                ((i1k) obj).m(new bnn(1, this, iBinder));
                break;
            case 2:
                u53 u53Var = (u53) obj;
                ((zzgtj) u53Var.d).a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
                u53Var.g(new bnn(22, this, iBinder));
                break;
            default:
                qbp qbpVar = (qbp) obj;
                qbpVar.b.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                qbpVar.a().post(new i6p(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                componentName.getClass();
                ((rqa) obj).g = null;
                break;
            case 1:
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    "onServiceDisconnected: ".concat(String.valueOf(componentName));
                }
                ((i1k) obj).m(new f2n(this, 20));
                break;
            case 2:
                u53 u53Var = (u53) obj;
                ((zzgtj) u53Var.d).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
                u53Var.g(new x3o(this, 25));
                break;
            default:
                qbp qbpVar = (qbp) obj;
                qbpVar.b.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                qbpVar.a().post(new u3p(this, 1));
                break;
        }
    }
}
