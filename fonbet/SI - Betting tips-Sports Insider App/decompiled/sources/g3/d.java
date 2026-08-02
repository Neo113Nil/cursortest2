package g3;

import android.content.SharedPreferences;
import androidx.appcompat.app.t;
import com.google.android.gms.internal.measurement.a3;
import f3.k;
import g6.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import s7.f1;
import s7.r3;
import s7.v0;
import s7.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f9734a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9735b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9736c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9737d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9738e;

    public d(f3.b runnableScheduler, l1.a launcher) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.f9735b = runnableScheduler;
        this.f9736c = launcher;
        this.f9734a = millis;
        this.f9737d = new Object();
        this.f9738e = new LinkedHashMap();
    }

    public void a(k token) {
        Runnable runnable;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.f9737d) {
            runnable = (Runnable) ((LinkedHashMap) this.f9738e).remove(token);
        }
        if (runnable != null) {
            ((f3.b) this.f9735b).f9329a.removeCallbacks(runnable);
        }
    }

    public void b(k token) {
        Intrinsics.checkNotNullParameter(token, "token");
        t tVar = new t(14, this, token);
        synchronized (this.f9737d) {
        }
        f3.b bVar = (f3.b) this.f9735b;
        bVar.f9329a.postDelayed(tVar, this.f9734a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) s7.x.j.a(null)).intValue())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) s7.x.j.a(null)).intValue())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(long j, a3 a3Var) {
        if (((ArrayList) this.f9737d) == null) {
            this.f9737d = new ArrayList();
        }
        if (((ArrayList) this.f9736c) == null) {
            this.f9736c = new ArrayList();
        }
        if (((ArrayList) this.f9737d).isEmpty() || ((((a3) ((ArrayList) this.f9737d).get(0)).u() / 1000) / 60) / 60 == ((a3Var.u() / 1000) / 60) / 60) {
            long k6 = this.f9734a + a3Var.k();
            r3 r3Var = (r3) this.f9738e;
            if (r3Var.e0().t(null, x.f23185e1)) {
                if (!((ArrayList) this.f9737d).isEmpty()) {
                    r3Var.e0();
                }
                this.f9734a = k6;
                ((ArrayList) this.f9737d).add(a3Var);
                ((ArrayList) this.f9736c).add(Long.valueOf(j));
                int size = ((ArrayList) this.f9737d).size();
                r3Var.e0();
                if (size < Math.max(1, ((Integer) x.f23199k.a(null)).intValue())) {
                    return true;
                }
            } else {
                r3Var.e0();
            }
        }
        return false;
    }

    public void d() {
        v0 v0Var = (v0) this.f9738e;
        v0Var.j();
        ((f1) v0Var.f3328a).f22749k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = v0Var.n().edit();
        edit.remove((String) this.f9736c);
        edit.remove((String) this.f9737d);
        edit.putLong((String) this.f9735b, currentTimeMillis);
        edit.apply();
    }

    public /* synthetic */ d(v0 v0Var, long j) {
        this.f9738e = v0Var;
        v.e("health_monitor");
        v.b(j > 0);
        this.f9735b = "health_monitor:start";
        this.f9736c = "health_monitor:count";
        this.f9737d = "health_monitor:value";
        this.f9734a = j;
    }

    public /* synthetic */ d(r3 r3Var) {
        this.f9738e = r3Var;
    }
}
