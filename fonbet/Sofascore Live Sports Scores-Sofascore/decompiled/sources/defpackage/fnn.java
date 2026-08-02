package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.zzgtj;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fnn implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fnn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                i1k i1kVar = (i1k) obj;
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    "Binder has died: ".concat((String) i1kVar.d);
                }
                ArrayList arrayList = (ArrayList) i1kVar.e;
                synchronized (arrayList) {
                    arrayList.clear();
                }
                i1kVar.m(new fmn(i1kVar, 1));
                return;
            case 1:
                u53 u53Var = (u53) obj;
                ((zzgtj) u53Var.d).a("%s : Binder has died.", "OverlayDisplayService");
                ArrayList arrayList2 = (ArrayList) u53Var.e;
                synchronized (arrayList2) {
                    arrayList2.clear();
                }
                return;
            default:
                qbp qbpVar = (qbp) obj;
                qbpVar.b.f("reportBinderDeath", new Object[0]);
                if (qbpVar.i.get() != null) {
                    pvd.j();
                    return;
                }
                qbpVar.b.f("%s : Binder has died.", qbpVar.c);
                Iterator it = qbpVar.d.iterator();
                while (it.hasNext()) {
                    kyo kyoVar = (kyo) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(qbpVar.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = kyoVar.a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                qbpVar.d.clear();
                synchronized (qbpVar.f) {
                    qbpVar.d();
                }
                return;
        }
    }
}
