package s7;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdf;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o2 extends z {

    /* renamed from: c, reason: collision with root package name */
    public volatile l2 f22929c;

    /* renamed from: d, reason: collision with root package name */
    public volatile l2 f22930d;

    /* renamed from: e, reason: collision with root package name */
    public l2 f22931e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f22932f;

    /* renamed from: g, reason: collision with root package name */
    public zzdf f22933g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f22934h;

    /* renamed from: i, reason: collision with root package name */
    public volatile l2 f22935i;
    public l2 j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22936k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f22937l;

    public o2(f1 f1Var) {
        super(f1Var);
        this.f22937l = new Object();
        this.f22932f = new ConcurrentHashMap();
    }

    @Override // s7.z
    public final boolean m() {
        return false;
    }

    public final void n(l2 l2Var, boolean z5, long j) {
        f1 f1Var = (f1) this.f3328a;
        r rVar = f1Var.f22752n;
        f1.j(rVar);
        f1Var.f22749k.getClass();
        rVar.m(SystemClock.elapsedRealtime());
        boolean z7 = l2Var != null && l2Var.f22874d;
        f3 f3Var = f1Var.f22747h;
        f1.l(f3Var);
        if (!f3Var.f22767f.e(j, z7, z5) || l2Var == null) {
            return;
        }
        l2Var.f22874d = false;
    }

    public final l2 o(zzdf zzdfVar) {
        g6.v.h(zzdfVar);
        Integer valueOf = Integer.valueOf(zzdfVar.f5388a);
        ConcurrentHashMap concurrentHashMap = this.f22932f;
        l2 l2Var = (l2) concurrentHashMap.get(valueOf);
        if (l2Var == null) {
            String q = q(zzdfVar.f5389b);
            v3 v3Var = ((f1) this.f3328a).f22748i;
            f1.k(v3Var);
            l2 l2Var2 = new l2(v3Var.h0(), null, q);
            concurrentHashMap.put(valueOf, l2Var2);
            l2Var = l2Var2;
        }
        return this.f22935i != null ? this.f22935i : l2Var;
    }

    public final l2 p(boolean z5) {
        k();
        j();
        if (!z5) {
            return this.f22931e;
        }
        l2 l2Var = this.f22931e;
        return l2Var != null ? l2Var : this.j;
    }

    public final String q(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        f1 f1Var = (f1) this.f3328a;
        int length2 = str2.length();
        f1Var.f22743d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        f1Var.f22743d.getClass();
        return str2.substring(0, 500);
    }

    public final void r(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!((f1) this.f3328a).f22743d.x() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f22932f.put(Integer.valueOf(zzdfVar.f5388a), new l2(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void s(String str, l2 l2Var, boolean z5) {
        l2 l2Var2;
        l2 l2Var3 = this.f22929c == null ? this.f22930d : this.f22929c;
        if (l2Var.f22872b == null) {
            l2Var2 = new l2(l2Var.f22871a, str != null ? q(str) : null, l2Var.f22873c, l2Var.f22875e, l2Var.f22876f);
        } else {
            l2Var2 = l2Var;
        }
        this.f22930d = this.f22929c;
        this.f22929c = l2Var2;
        f1 f1Var = (f1) this.f3328a;
        f1Var.f22749k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.s(new m2(this, l2Var2, l2Var3, elapsedRealtime, z5));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(l2 l2Var, l2 l2Var2, long j, boolean z5, Bundle bundle) {
        boolean z7;
        boolean z10 = l2Var.f22875e;
        f1 f1Var = (f1) this.f3328a;
        j();
        boolean z11 = false;
        if (l2Var2 != null) {
            if (l2Var2.f22873c == l2Var.f22873c && Objects.equals(l2Var2.f22872b, l2Var.f22872b) && Objects.equals(l2Var2.f22871a, l2Var.f22871a)) {
                z7 = false;
                if (z5 && this.f22931e != null) {
                    z11 = true;
                }
                if (z7) {
                    Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
                    v3.c0(l2Var, bundle2, true);
                    if (l2Var2 != null) {
                        String str = l2Var2.f22871a;
                        if (str != null) {
                            bundle2.putString("_pn", str);
                        }
                        String str2 = l2Var2.f22872b;
                        if (str2 != null) {
                            bundle2.putString("_pc", str2);
                        }
                        bundle2.putLong("_pi", l2Var2.f22873c);
                    }
                    if (z11) {
                        f3 f3Var = f1Var.f22747h;
                        f1.l(f3Var);
                        io.sentry.android.replay.gestures.c cVar = f3Var.f22767f;
                        long j6 = j - cVar.f16044c;
                        cVar.f16044c = j;
                        if (j6 > 0) {
                            v3 v3Var = f1Var.f22748i;
                            f1.k(v3Var);
                            v3Var.S(bundle2, j6);
                        }
                    }
                    if (!f1Var.f22743d.x()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    String str3 = true != z10 ? "auto" : "app";
                    f1Var.f22749k.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z10) {
                        long j10 = l2Var.f22876f;
                        if (j10 != 0) {
                            currentTimeMillis = j10;
                        }
                    }
                    e2 e2Var = f1Var.f22751m;
                    f1.l(e2Var);
                    e2Var.r(currentTimeMillis, bundle2, str3, "_vs");
                }
                if (z11) {
                    n(this.f22931e, true, j);
                }
                this.f22931e = l2Var;
                if (z10) {
                    this.j = l2Var;
                }
                y2 p10 = f1Var.p();
                p10.j();
                p10.k();
                p10.x(new w0(p10, l2Var));
            }
        }
        z7 = true;
        if (z5) {
            z11 = true;
        }
        if (z7) {
        }
        if (z11) {
        }
        this.f22931e = l2Var;
        if (z10) {
        }
        y2 p102 = f1Var.p();
        p102.j();
        p102.k();
        p102.x(new w0(p102, l2Var));
    }
}
