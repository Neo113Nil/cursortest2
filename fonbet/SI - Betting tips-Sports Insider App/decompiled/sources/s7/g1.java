package s7;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f22780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f22781c;

    public /* synthetic */ g1(k1 k1Var, zzr zzrVar, int i5) {
        this.f22779a = i5;
        this.f22780b = zzrVar;
        this.f22781c = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22779a) {
            case 0:
                k1 k1Var = this.f22781c;
                k1Var.f22848a.B();
                k1Var.f22848a.Y(this.f22780b);
                break;
            case 1:
                k1 k1Var2 = this.f22781c;
                k1Var2.f22848a.B();
                r3 r3Var = k1Var2.f22848a;
                r3Var.b().j();
                r3Var.l0();
                zzr zzrVar = this.f22780b;
                g6.v.h(zzrVar);
                String str = zzrVar.f5820a;
                g6.v.e(str);
                int i5 = 0;
                if (r3Var.e0().t(null, x.A0)) {
                    r3Var.f().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int r5 = r3Var.e0().r(null, x.j0);
                    r3Var.e0();
                    long longValue = currentTimeMillis - ((Long) x.f23184e.a(null)).longValue();
                    while (i5 < r5 && r3Var.I(longValue, null)) {
                        i5++;
                    }
                } else {
                    r3Var.e0();
                    long intValue = ((Integer) x.f23201l.a(null)).intValue();
                    while (i5 < intValue && r3Var.I(0L, str)) {
                        i5++;
                    }
                }
                if (r3Var.e0().t(null, x.B0)) {
                    r3Var.b().j();
                    r3Var.H();
                }
                n3 n3Var = r3Var.j;
                int c2 = androidx.appcompat.widget.c1.c(zzrVar.E);
                n3Var.j();
                if (c2 == 2 && !n3.m(str)) {
                    z0 z0Var = n3Var.f22859b.f22987a;
                    r3.U(z0Var);
                    com.google.android.gms.internal.measurement.e2 v5 = z0Var.v(str);
                    if (v5 != null && v5.D() && !v5.E().q().isEmpty()) {
                        r3Var.a().f22910n.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        r3Var.f().getClass();
                        r3Var.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                k1 k1Var3 = this.f22781c;
                k1Var3.f22848a.B();
                r3 r3Var2 = k1Var3.f22848a;
                r3Var2.b().j();
                r3Var2.l0();
                zzr zzrVar2 = this.f22780b;
                g6.v.e(zzrVar2.f5820a);
                r3Var2.c0(zzrVar2);
                break;
            case 3:
                k1 k1Var4 = this.f22781c;
                k1Var4.f22848a.B();
                r3 r3Var3 = k1Var4.f22848a;
                if (r3Var3.f23009y != null) {
                    ArrayList arrayList = new ArrayList();
                    r3Var3.f23010z = arrayList;
                    arrayList.addAll(r3Var3.f23009y);
                }
                j jVar = r3Var3.f22989c;
                r3.U(jVar);
                f1 f1Var = (f1) jVar.f3328a;
                zzr zzrVar3 = this.f22780b;
                String str2 = zzrVar3.f5820a;
                g6.v.h(str2);
                g6.v.e(str2);
                jVar.j();
                jVar.k();
                try {
                    SQLiteDatabase Y = jVar.Y();
                    String[] strArr = {str2};
                    int delete = Y.delete("apps", "app_id=?", strArr) + Y.delete("events", "app_id=?", strArr) + Y.delete("events_snapshot", "app_id=?", strArr) + Y.delete("user_attributes", "app_id=?", strArr) + Y.delete("conditional_properties", "app_id=?", strArr) + Y.delete("raw_events", "app_id=?", strArr) + Y.delete("raw_events_metadata", "app_id=?", strArr) + Y.delete("queue", "app_id=?", strArr) + Y.delete("audience_filter_values", "app_id=?", strArr) + Y.delete("main_event_params", "app_id=?", strArr) + Y.delete("default_event_params", "app_id=?", strArr) + Y.delete("trigger_uris", "app_id=?", strArr) + Y.delete("upload_queue", "app_id=?", strArr);
                    if (f1Var.f22743d.t(null, x.f23197i1)) {
                        delete += Y.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (delete > 0) {
                        n0 n0Var = f1Var.f22745f;
                        f1.m(n0Var);
                        n0Var.f22910n.c(str2, Integer.valueOf(delete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e7) {
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.c(n0.r(str2), e7, "Error resetting analytics data. appId, error");
                }
                if (zzrVar3.f5827h) {
                    r3Var3.Y(zzrVar3);
                    break;
                }
                break;
            case 4:
                k1 k1Var5 = this.f22781c;
                k1Var5.f22848a.B();
                r3 r3Var4 = k1Var5.f22848a;
                r3Var4.b().j();
                r3Var4.l0();
                zzr zzrVar4 = this.f22780b;
                g6.v.e(zzrVar4.f5820a);
                r3Var4.m0(zzrVar4);
                r3Var4.n0(zzrVar4);
                break;
            case 5:
                r3 r3Var5 = this.f22781c.f22848a;
                r3Var5.B();
                r3Var5.n0(this.f22780b);
                break;
            default:
                r3 r3Var6 = this.f22781c.f22848a;
                r3Var6.B();
                r3Var6.m0(this.f22780b);
                break;
        }
    }
}
