package g6;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: y, reason: collision with root package name */
    public static final Feature[] f9803y = new Feature[0];

    /* renamed from: b, reason: collision with root package name */
    public h0 f9805b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9806c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f9807d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.d f9808e;

    /* renamed from: f, reason: collision with root package name */
    public final y f9809f;

    /* renamed from: i, reason: collision with root package name */
    public r f9812i;
    public d j;

    /* renamed from: k, reason: collision with root package name */
    public IInterface f9813k;

    /* renamed from: m, reason: collision with root package name */
    public a0 f9815m;

    /* renamed from: o, reason: collision with root package name */
    public final b f9817o;

    /* renamed from: p, reason: collision with root package name */
    public final c f9818p;
    public final int q;

    /* renamed from: r, reason: collision with root package name */
    public final String f9819r;

    /* renamed from: s, reason: collision with root package name */
    public volatile String f9820s;

    /* renamed from: t, reason: collision with root package name */
    public volatile r7.a f9821t;

    /* renamed from: a, reason: collision with root package name */
    public volatile String f9804a = null;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9810g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f9811h = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f9814l = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f9816n = 1;

    /* renamed from: u, reason: collision with root package name */
    public ConnectionResult f9822u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9823v = false;

    /* renamed from: w, reason: collision with root package name */
    public volatile zzj f9824w = null;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicInteger f9825x = new AtomicInteger(0);

    public e(Context context, Looper looper, g0 g0Var, c6.d dVar, int i5, b bVar, c cVar, String str) {
        v.i(context, "Context must not be null");
        this.f9806c = context;
        v.i(looper, "Looper must not be null");
        v.i(g0Var, "Supervisor must not be null");
        this.f9807d = g0Var;
        v.i(dVar, "API availability must not be null");
        this.f9808e = dVar;
        this.f9809f = new y(this, looper);
        this.q = i5;
        this.f9817o = bVar;
        this.f9818p = cVar;
        this.f9819r = str;
    }

    public abstract int a();

    public boolean b() {
        return false;
    }

    public final void c() {
        int b10 = this.f9808e.b(this.f9806c, a());
        if (b10 == 0) {
            this.j = new h(this);
            x(2, null);
            return;
        }
        x(1, null);
        this.j = new h(this);
        int i5 = this.f9825x.get();
        y yVar = this.f9809f;
        yVar.sendMessage(yVar.obtainMessage(3, i5, b10, null));
    }

    public abstract IInterface d(IBinder iBinder);

    public final void e() {
        this.f9825x.incrementAndGet();
        ArrayList arrayList = this.f9814l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((q) arrayList.get(i5)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f9811h) {
            this.f9812i = null;
        }
        x(1, null);
    }

    public final void f(String str) {
        this.f9804a = str;
        e();
    }

    public Account g() {
        return null;
    }

    public Feature[] h() {
        return f9803y;
    }

    public Executor i() {
        return null;
    }

    public Bundle j() {
        return new Bundle();
    }

    public final void k(g gVar, Set set) {
        String attributionTag;
        Bundle j = j();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.f9820s;
        } else if (this.f9821t == null) {
            attributionTag = this.f9820s;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.f9821t.f22318b;
            attributionTag = attributionSource == null ? this.f9820s : attributionSource.getAttributionTag() == null ? this.f9820s : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i5 = this.q;
        int i10 = c6.d.f3659a;
        Scope[] scopeArr = GetServiceRequest.f4503o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f4504p;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i5, i10, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f4508d = this.f9806c.getPackageName();
        getServiceRequest.f4511g = j;
        if (set != null) {
            getServiceRequest.f4510f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (b()) {
            Account g10 = g();
            if (g10 == null) {
                g10 = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f4512h = g10;
            if (gVar != null) {
                getServiceRequest.f4509e = gVar.asBinder();
            }
        }
        getServiceRequest.f4513i = f9803y;
        getServiceRequest.j = h();
        if (t()) {
            getServiceRequest.f4516m = true;
        }
        try {
            synchronized (this.f9811h) {
                try {
                    r rVar = this.f9812i;
                    if (rVar != null) {
                        rVar.a(new z(this, this.f9825x.get()), getServiceRequest);
                    } else {
                        w0.m("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            w0.n("GmsClient", "IGmsServiceBroker.getService failed", e7);
            int i11 = this.f9825x.get();
            y yVar = this.f9809f;
            yVar.sendMessage(yVar.obtainMessage(6, i11, 3));
        } catch (RemoteException e9) {
            e = e9;
            w0.n("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.f9825x.get();
            b0 b0Var = new b0(this, 8, null, null);
            y yVar2 = this.f9809f;
            yVar2.sendMessage(yVar2.obtainMessage(1, i12, -1, b0Var));
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            w0.n("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i122 = this.f9825x.get();
            b0 b0Var2 = new b0(this, 8, null, null);
            y yVar22 = this.f9809f;
            yVar22.sendMessage(yVar22.obtainMessage(1, i122, -1, b0Var2));
        }
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public final IInterface m() {
        IInterface iInterface;
        synchronized (this.f9810g) {
            try {
                if (this.f9816n == 5) {
                    throw new DeadObjectException();
                }
                if (!q()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.f9813k;
                v.i(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String n();

    public abstract String o();

    public boolean p() {
        return a() >= 211700000;
    }

    public final boolean q() {
        boolean z5;
        synchronized (this.f9810g) {
            z5 = this.f9816n == 4;
        }
        return z5;
    }

    public final boolean r() {
        boolean z5;
        synchronized (this.f9810g) {
            int i5 = this.f9816n;
            z5 = true;
            if (i5 != 2 && i5 != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    public void s() {
        System.currentTimeMillis();
    }

    public boolean t() {
        return this instanceof a6.g;
    }

    public final String u() {
        String str = this.f9819r;
        return str == null ? this.f9806c.getClass().getName() : str;
    }

    public final /* synthetic */ boolean v(int i5, int i10, IInterface iInterface) {
        synchronized (this.f9810g) {
            try {
                if (this.f9816n != i5) {
                    return false;
                }
                x(i10, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void w() {
        int i5;
        int i10;
        synchronized (this.f9810g) {
            i5 = this.f9816n;
        }
        if (i5 == 3) {
            this.f9823v = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        y yVar = this.f9809f;
        yVar.sendMessage(yVar.obtainMessage(i10, this.f9825x.get(), 16));
    }

    public final void x(int i5, IInterface iInterface) {
        h0 h0Var;
        v.b((i5 == 4) == (iInterface != null));
        synchronized (this.f9810g) {
            try {
                this.f9816n = i5;
                this.f9813k = iInterface;
                Bundle bundle = null;
                if (i5 == 1) {
                    a0 a0Var = this.f9815m;
                    if (a0Var != null) {
                        g0 g0Var = this.f9807d;
                        String str = this.f9805b.f9848b;
                        v.h(str);
                        this.f9805b.getClass();
                        u();
                        g0Var.d(new d0(str, this.f9805b.f9847a), a0Var);
                        this.f9815m = null;
                    }
                } else if (i5 == 2 || i5 == 3) {
                    a0 a0Var2 = this.f9815m;
                    if (a0Var2 != null && (h0Var = this.f9805b) != null) {
                        String str2 = h0Var.f9848b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        w0.d("GmsClient", sb2.toString());
                        g0 g0Var2 = this.f9807d;
                        String str3 = this.f9805b.f9848b;
                        v.h(str3);
                        this.f9805b.getClass();
                        u();
                        boolean z5 = this.f9805b.f9847a;
                        g0Var2.getClass();
                        g0Var2.d(new d0(str3, z5), a0Var2);
                        this.f9825x.incrementAndGet();
                    }
                    a0 a0Var3 = new a0(this, this.f9825x.get());
                    this.f9815m = a0Var3;
                    String o3 = o();
                    boolean p10 = p();
                    this.f9805b = new h0(o3, p10);
                    if (p10 && a() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f9805b.f9848b)));
                    }
                    g0 g0Var3 = this.f9807d;
                    String str4 = this.f9805b.f9848b;
                    v.h(str4);
                    this.f9805b.getClass();
                    ConnectionResult c2 = g0Var3.c(new d0(str4, this.f9805b.f9847a), a0Var3, u(), i());
                    if (!(c2.f4441b == 0)) {
                        String str5 = this.f9805b.f9848b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str5);
                        sb3.append(" on com.google.android.gms");
                        w0.m("GmsClient", sb3.toString());
                        int i10 = c2.f4441b;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (c2.f4442c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c2.f4442c);
                        }
                        int i11 = this.f9825x.get();
                        c0 c0Var = new c0(this, i10, bundle);
                        y yVar = this.f9809f;
                        yVar.sendMessage(yVar.obtainMessage(7, i11, -1, c0Var));
                    }
                } else if (i5 == 4) {
                    v.h(iInterface);
                    IInterface iInterface2 = iInterface;
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
