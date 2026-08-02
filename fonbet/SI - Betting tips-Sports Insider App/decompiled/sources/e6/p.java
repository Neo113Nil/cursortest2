package e6;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import androidx.appcompat.app.v0;
import com.android.billingclient.api.x0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.measurement.y3;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements d6.h, d6.i {

    /* renamed from: f, reason: collision with root package name */
    public final d6.c f8736f;

    /* renamed from: g, reason: collision with root package name */
    public final a f8737g;

    /* renamed from: h, reason: collision with root package name */
    public final x5.h f8738h;

    /* renamed from: k, reason: collision with root package name */
    public final int f8740k;

    /* renamed from: l, reason: collision with root package name */
    public final a0 f8741l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8742m;
    public final /* synthetic */ e q;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f8735a = new LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f8739i = new HashSet();
    public final HashMap j = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f8743n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public ConnectionResult f8744o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f8745p = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public p(e eVar, d6.g gVar) {
        this.q = eVar;
        Looper looper = eVar.f8705n.getLooper();
        v0 a7 = gVar.a();
        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0((s.f) a7.f364b, (String) a7.f365c, (String) a7.f366d);
        y3 y3Var = (y3) gVar.f8252d.f19314b;
        g6.v.h(y3Var);
        d6.c e7 = y3Var.e(gVar.f8249a, looper, a0Var, gVar.f8253e, this, this);
        r7.a aVar = gVar.f8251c;
        if (aVar == null || !(e7 instanceof g6.e)) {
            String str = gVar.f8250b;
            if (str != null && (e7 instanceof g6.e)) {
                ((g6.e) e7).f9820s = str;
            }
        } else {
            ((g6.e) e7).f9821t = aVar;
        }
        this.f8736f = e7;
        this.f8737g = gVar.f8254f;
        this.f8738h = new x5.h(4);
        this.f8740k = gVar.f8256h;
        if (!e7.b()) {
            this.f8741l = null;
            return;
        }
        Context context = eVar.f8697e;
        com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
        v0 a10 = gVar.a();
        this.f8741l = new a0(context, h0Var, new androidx.appcompat.widget.a0((s.f) a10.f364b, (String) a10.f365c, (String) a10.f366d));
    }

    @Override // d6.h
    public final void a(int i5) {
        e eVar = this.q;
        if (Looper.myLooper() == eVar.f8705n.getLooper()) {
            c(i5);
        } else {
            eVar.f8705n.post(new androidx.viewpager2.widget.o(i5, 1, this));
        }
    }

    public final void b() {
        Object obj = this.f8736f;
        e eVar = this.q;
        g6.v.d(eVar.f8705n);
        this.f8744o = null;
        l(ConnectionResult.f4439f);
        if (this.f8742m) {
            com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
            a aVar = this.f8737g;
            h0Var.removeMessages(11, aVar);
            eVar.f8705n.removeMessages(9, aVar);
            this.f8742m = false;
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            y yVar = ((x) it.next()).f8763a;
            try {
                ((io.sentry.internal.debugmeta.c) ((b6.p) yVar.f8768d).f3079b).accept(obj, new w7.g());
            } catch (DeadObjectException unused) {
                a(3);
                ((g6.e) obj).f("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException e7) {
                e = e7;
                w0.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            } catch (RuntimeException e9) {
                e = e9;
                w0.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                it.remove();
            }
        }
        g();
        k();
    }

    public final void c(int i5) {
        g6.v.d(this.q.f8705n);
        this.f8744o = null;
        this.f8742m = true;
        String str = ((g6.e) this.f8736f).f9804a;
        x5.h hVar = this.f8738h;
        hVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i5 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i5 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        hVar.n(true, new Status(20, sb2.toString(), null, null));
        a aVar = this.f8737g;
        e eVar = this.q;
        com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
        h0Var.sendMessageDelayed(Message.obtain(h0Var, 9, aVar), 5000L);
        com.google.android.gms.internal.measurement.h0 h0Var2 = eVar.f8705n;
        h0Var2.sendMessageDelayed(Message.obtain(h0Var2, 11, aVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) eVar.f8699g.f19314b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((x) it.next()).getClass();
        }
    }

    public final boolean d(ConnectionResult connectionResult) {
        synchronized (e.f8691r) {
            try {
                e eVar = this.q;
                if (eVar.f8702k == null || !eVar.f8703l.contains(this.f8737g)) {
                    return false;
                }
                n nVar = eVar.f8702k;
                int i5 = this.f8740k;
                nVar.getClass();
                f0 f0Var = new f0(connectionResult, i5);
                AtomicReference atomicReference = nVar.f8729c;
                while (true) {
                    if (atomicReference.compareAndSet(null, f0Var)) {
                        nVar.f8730d.post(new g8.a(nVar, f0Var));
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d6.h
    public final void e() {
        e eVar = this.q;
        if (Looper.myLooper() == eVar.f8705n.getLooper()) {
            b();
        } else {
            eVar.f8705n.post(new androidx.core.widget.b(6, this));
        }
    }

    @Override // d6.i
    public final void f(ConnectionResult connectionResult) {
        n(connectionResult, null);
    }

    public final void g() {
        LinkedList linkedList = this.f8735a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            e0 e0Var = (e0) arrayList.get(i5);
            if (!((g6.e) this.f8736f).q()) {
                return;
            }
            if (h(e0Var)) {
                linkedList.remove(e0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(e0 e0Var) {
        if (!(e0Var instanceof v)) {
            x5.h hVar = this.f8738h;
            d6.c cVar = this.f8736f;
            e0Var.c(hVar, cVar.b());
            try {
                e0Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                ((g6.e) cVar).f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        v vVar = (v) e0Var;
        Feature[] f6 = vVar.f(this);
        Feature feature = null;
        if (f6 != null && f6.length != 0) {
            zzj zzjVar = ((g6.e) this.f8736f).f9824w;
            Feature[] featureArr = zzjVar == null ? null : zzjVar.f4554b;
            if (featureArr == null) {
                featureArr = new Feature[0];
            }
            s.e eVar = new s.e(featureArr.length);
            for (Feature feature2 : featureArr) {
                eVar.put(feature2.f4445a, Long.valueOf(feature2.c()));
            }
            for (Feature feature3 : f6) {
                Long l6 = (Long) eVar.get(feature3.f4445a);
                if (l6 == null || l6.longValue() < feature3.c()) {
                    feature = feature3;
                    break;
                }
            }
        }
        if (feature == null) {
            x5.h hVar2 = this.f8738h;
            d6.c cVar2 = this.f8736f;
            e0Var.c(hVar2, cVar2.b());
            try {
                e0Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                a(1);
                ((g6.e) cVar2).f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f8736f.getClass().getName();
        String str = feature.f4445a;
        long c2 = feature.c();
        StringBuilder sb2 = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(c2).length() + 2);
        r4.k.s(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(c2);
        sb2.append(").");
        w0.m("GoogleApiManager", sb2.toString());
        e eVar2 = this.q;
        if (!eVar2.f8706o || !vVar.g(this)) {
            vVar.b(new d6.m(feature));
            return true;
        }
        int h10 = vVar.h(this);
        q qVar = new q(this.f8737g, feature);
        ArrayList arrayList = this.f8743n;
        int indexOf = arrayList.indexOf(qVar);
        if (indexOf >= 0) {
            q qVar2 = (q) arrayList.get(indexOf);
            eVar2.f8705n.removeMessages(15, qVar2);
            eVar2.f8705n.sendMessageDelayed(Message.obtain(eVar2.f8705n, 15, qVar2), 5000L);
            return false;
        }
        arrayList.add(qVar);
        eVar2.f8705n.sendMessageDelayed(Message.obtain(eVar2.f8705n, 15, qVar), 5000L);
        eVar2.f8705n.sendMessageDelayed(Message.obtain(eVar2.f8705n, 16, qVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(h10));
        if (d(connectionResult)) {
            String str2 = feature.f4445a;
            long c8 = feature.c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(c8).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str2);
            sb3.append(", version: ");
            sb3.append(c8);
            w0.m("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!eVar2.h(connectionResult, this.f8740k)) {
            return false;
        }
        String str3 = feature.f4445a;
        long c10 = feature.c();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(c10).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(str3);
        sb4.append(", version: ");
        sb4.append(c10);
        w0.m("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void i(Status status, Exception exc, boolean z5) {
        g6.v.d(this.q.f8705n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f8735a.iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (!z5 || e0Var.f8707a == 2) {
                if (status != null) {
                    e0Var.a(status);
                } else {
                    e0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void j(Status status) {
        g6.v.d(this.q.f8705n);
        i(status, null, false);
    }

    public final void k() {
        e eVar = this.q;
        com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
        a aVar = this.f8737g;
        h0Var.removeMessages(12, aVar);
        com.google.android.gms.internal.measurement.h0 h0Var2 = eVar.f8705n;
        h0Var2.sendMessageDelayed(h0Var2.obtainMessage(12, aVar), eVar.f8693a);
    }

    public final void l(ConnectionResult connectionResult) {
        HashSet hashSet = this.f8739i;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (g6.v.k(connectionResult, ConnectionResult.f4439f)) {
            g6.e eVar = (g6.e) this.f8736f;
            if (!eVar.q() || eVar.f9805b == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final void m(ConnectionResult connectionResult) {
        g6.v.d(this.q.f8705n);
        Object obj = this.f8736f;
        String name = obj.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        g6.e eVar = (g6.e) obj;
        eVar.f(d9.e.n(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
        n(connectionResult, null);
    }

    public final void n(ConnectionResult connectionResult, RuntimeException runtimeException) {
        u7.a aVar;
        e eVar = this.q;
        g6.v.d(eVar.f8705n);
        a0 a0Var = this.f8741l;
        if (a0Var != null && (aVar = a0Var.f8676k) != null) {
            aVar.e();
        }
        g6.v.d(this.q.f8705n);
        this.f8744o = null;
        SparseIntArray sparseIntArray = (SparseIntArray) eVar.f8699g.f19314b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(connectionResult);
        if ((this.f8736f instanceof i6.e) && connectionResult.f4441b != 24) {
            eVar.f8694b = true;
            com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
            h0Var.sendMessageDelayed(h0Var.obtainMessage(19), 300000L);
        }
        int i5 = connectionResult.f4441b;
        if (i5 == 4) {
            j(e.q);
            return;
        }
        if (i5 == 25) {
            j(e.d(this.f8737g, connectionResult));
            return;
        }
        LinkedList linkedList = this.f8735a;
        if (linkedList.isEmpty()) {
            this.f8744o = connectionResult;
            return;
        }
        if (runtimeException != null) {
            g6.v.d(eVar.f8705n);
            i(null, runtimeException, false);
            return;
        }
        if (!eVar.f8706o) {
            j(e.d(this.f8737g, connectionResult));
            return;
        }
        a aVar2 = this.f8737g;
        i(e.d(aVar2, connectionResult), null, true);
        if (linkedList.isEmpty() || d(connectionResult) || eVar.h(connectionResult, this.f8740k)) {
            return;
        }
        if (connectionResult.f4441b == 18) {
            this.f8742m = true;
        }
        if (!this.f8742m) {
            j(e.d(aVar2, connectionResult));
        } else {
            com.google.android.gms.internal.measurement.h0 h0Var2 = eVar.f8705n;
            h0Var2.sendMessageDelayed(Message.obtain(h0Var2, 9, aVar2), 5000L);
        }
    }

    public final void o(e0 e0Var) {
        g6.v.d(this.q.f8705n);
        boolean q = ((g6.e) this.f8736f).q();
        LinkedList linkedList = this.f8735a;
        if (q) {
            if (h(e0Var)) {
                k();
                return;
            } else {
                linkedList.add(e0Var);
                return;
            }
        }
        linkedList.add(e0Var);
        ConnectionResult connectionResult = this.f8744o;
        if (connectionResult == null || connectionResult.f4441b == 0 || connectionResult.f4442c == null) {
            q();
        } else {
            n(connectionResult, null);
        }
    }

    public final void p() {
        e eVar = this.q;
        g6.v.d(eVar.f8705n);
        Status status = e.f8690p;
        j(status);
        this.f8738h.n(false, status);
        for (i iVar : (i[]) this.j.keySet().toArray(new i[0])) {
            o(new c0(iVar, new w7.g()));
        }
        l(new ConnectionResult(4, null, null));
        if (((g6.e) this.f8736f).q()) {
            eVar.f8705n.post(new androidx.core.widget.b(7, new h9.c(22, this)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        e eVar = this.q;
        g6.v.d(eVar.f8705n);
        d6.c cVar = this.f8736f;
        g6.e eVar2 = (g6.e) cVar;
        if (eVar2.q() || eVar2.r()) {
            return;
        }
        try {
            int M = eVar.f8699g.M(eVar.f8697e, cVar);
            if (M != 0) {
                ConnectionResult connectionResult = new ConnectionResult(M, null, null);
                String name = cVar.getClass().getName();
                String connectionResult2 = connectionResult.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + connectionResult2.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(connectionResult2);
                w0.m("GoogleApiManager", sb2.toString());
                n(connectionResult, null);
                return;
            }
            x0 x0Var = new x0(eVar, cVar, this.f8737g);
            if (cVar.b()) {
                a0 a0Var = this.f8741l;
                g6.v.h(a0Var);
                u7.a aVar = a0Var.f8676k;
                if (aVar != null) {
                    aVar.e();
                }
                androidx.appcompat.widget.a0 a0Var2 = a0Var.j;
                a0Var2.f685g = Integer.valueOf(System.identityHashCode(a0Var));
                a6.d dVar = a0Var.f8674h;
                Context context = a0Var.f8672f;
                Handler handler = a0Var.f8673g;
                a0Var.f8676k = (u7.a) dVar.e(context, handler.getLooper(), a0Var2, (t7.a) a0Var2.f684f, a0Var, a0Var);
                a0Var.f8677l = x0Var;
                Set set = a0Var.f8675i;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.core.widget.b(a0Var));
                } else {
                    u7.a aVar2 = a0Var.f8676k;
                    aVar2.getClass();
                    aVar2.j = new g6.h((g6.e) aVar2);
                    aVar2.x(2, null);
                }
            }
            try {
                eVar2.j = x0Var;
                eVar2.x(2, null);
            } catch (SecurityException e7) {
                n(new ConnectionResult(10, null, null), e7);
            }
        } catch (IllegalStateException e9) {
            n(new ConnectionResult(10, null, null), e9);
        }
    }
}
