package f3;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements l3.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f9352l = e3.x.g("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f9354b;

    /* renamed from: c, reason: collision with root package name */
    public final e3.c f9355c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.messaging.x f9356d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f9357e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f9359g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f9358f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f9361i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f9353a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9362k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f9360h = new HashMap();

    public f(Context context, e3.c cVar, com.google.firebase.messaging.x xVar, WorkDatabase workDatabase) {
        this.f9354b = context;
        this.f9355c = cVar;
        this.f9356d = xVar;
        this.f9357e = workDatabase;
    }

    public static boolean e(String str, j0 j0Var, int i5) {
        String str2 = f9352l;
        if (j0Var == null) {
            e3.x.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        j0Var.f9388m.p(new y(i5));
        e3.x.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f9362k) {
            this.j.add(cVar);
        }
    }

    public final j0 b(String str) {
        j0 j0Var = (j0) this.f9358f.remove(str);
        boolean z5 = j0Var != null;
        if (!z5) {
            j0Var = (j0) this.f9359g.remove(str);
        }
        this.f9360h.remove(str);
        if (z5) {
            synchronized (this.f9362k) {
                try {
                    if (this.f9358f.isEmpty()) {
                        Context context = this.f9354b;
                        String str2 = l3.b.j;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f9354b.startService(intent);
                        } catch (Throwable th2) {
                            e3.x.e().d(f9352l, "Unable to stop foreground service", th2);
                        }
                        PowerManager.WakeLock wakeLock = this.f9353a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f9353a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return j0Var;
    }

    public final m3.o c(String str) {
        synchronized (this.f9362k) {
            try {
                j0 d10 = d(str);
                if (d10 == null) {
                    return null;
                }
                return d10.f9377a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final j0 d(String str) {
        j0 j0Var = (j0) this.f9358f.get(str);
        return j0Var == null ? (j0) this.f9359g.get(str) : j0Var;
    }

    public final boolean f(String str) {
        boolean z5;
        synchronized (this.f9362k) {
            z5 = d(str) != null;
        }
        return z5;
    }

    public final void g(c cVar) {
        synchronized (this.f9362k) {
            this.j.remove(cVar);
        }
    }

    public final boolean h(k kVar, int i5) {
        String str = kVar.f9389a.f20321a;
        synchronized (this.f9362k) {
            try {
                if (this.f9358f.get(str) == null) {
                    Set set = (Set) this.f9360h.get(str);
                    if (set != null && set.contains(kVar)) {
                        return e(str, b(str), i5);
                    }
                    return false;
                }
                e3.x.e().a(f9352l, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
