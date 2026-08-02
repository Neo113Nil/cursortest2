package s7;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22841a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f22842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22843c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22844d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f22845e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22846f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22847g;

    public /* synthetic */ k0(String str, p0 p0Var, int i5, IOException iOException, byte[] bArr, Map map) {
        g6.v.h(p0Var);
        this.f22844d = p0Var;
        this.f22842b = i5;
        this.f22845e = iOException;
        this.f22846f = bArr;
        this.f22843c = str;
        this.f22847g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22841a) {
            case 0:
                n0 n0Var = (n0) this.f22847g;
                v0 v0Var = ((f1) n0Var.f3328a).f22744e;
                f1.k(v0Var);
                if (!v0Var.f22870b) {
                    Log.println(6, n0Var.t(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (n0Var.f22900c == 0) {
                    e eVar = ((f1) n0Var.f3328a).f22743d;
                    if (eVar.f22692e == null) {
                        synchronized (eVar) {
                            try {
                                if (eVar.f22692e == null) {
                                    f1 f1Var = (f1) eVar.f3328a;
                                    ApplicationInfo applicationInfo = f1Var.f22740a.getApplicationInfo();
                                    String a7 = q6.d.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        eVar.f22692e = Boolean.valueOf(str != null && str.equals(a7));
                                    }
                                    if (eVar.f22692e == null) {
                                        eVar.f22692e = Boolean.TRUE;
                                        n0 n0Var2 = f1Var.f22745f;
                                        f1.m(n0Var2);
                                        n0Var2.f22903f.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (eVar.f22692e.booleanValue()) {
                        n0Var.f22900c = 'C';
                    } else {
                        n0Var.f22900c = 'c';
                    }
                }
                if (n0Var.f22901d < 0) {
                    ((f1) n0Var.f3328a).f22743d.o();
                    n0Var.f22901d = 133005L;
                }
                int i5 = this.f22842b;
                char c2 = n0Var.f22900c;
                long j = n0Var.f22901d;
                String str2 = this.f22843c;
                Object obj = this.f22844d;
                Object obj2 = this.f22845e;
                Object obj3 = this.f22846f;
                char charAt = "01VDIWEA?".charAt(i5);
                String u10 = n0.u(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(charAt).length() + 1 + String.valueOf(c2).length() + String.valueOf(j).length() + 1 + u10.length());
                sb2.append("2");
                sb2.append(charAt);
                sb2.append(c2);
                sb2.append(j);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(u10);
                String sb3 = sb2.toString();
                if (sb3.length() > 1024) {
                    sb3 = str2.substring(0, Segment.SHARE_MINIMUM);
                }
                g3.d dVar = v0Var.f23126e;
                if (dVar != null) {
                    String str3 = (String) dVar.f9737d;
                    v0 v0Var2 = (v0) dVar.f9738e;
                    v0Var2.j();
                    if (((v0) dVar.f9738e).n().getLong((String) dVar.f9735b, 0L) == 0) {
                        dVar.d();
                    }
                    if (sb3 == null) {
                        sb3 = "";
                    }
                    SharedPreferences n9 = v0Var2.n();
                    String str4 = (String) dVar.f9736c;
                    long j6 = n9.getLong(str4, 0L);
                    if (j6 <= 0) {
                        SharedPreferences.Editor edit = v0Var2.n().edit();
                        edit.putString(str3, sb3);
                        edit.putLong(str4, 1L);
                        edit.apply();
                        return;
                    }
                    v3 v3Var = ((f1) v0Var2.f3328a).f22748i;
                    f1.k(v3Var);
                    long nextLong = v3Var.i0().nextLong() & LongCompanionObject.MAX_VALUE;
                    long j10 = j6 + 1;
                    long j11 = LongCompanionObject.MAX_VALUE / j10;
                    SharedPreferences.Editor edit2 = v0Var2.n().edit();
                    if (nextLong < j11) {
                        edit2.putString(str3, sb3);
                    }
                    edit2.putLong(str4, j10);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((p0) this.f22844d).b(this.f22843c, this.f22842b, (Throwable) this.f22845e, (byte[]) this.f22846f, (Map) this.f22847g);
                return;
        }
    }

    public k0(n0 n0Var, int i5, String str, Object obj, Object obj2, Object obj3) {
        this.f22842b = i5;
        this.f22843c = str;
        this.f22844d = obj;
        this.f22845e = obj2;
        this.f22846f = obj3;
        this.f22847g = n0Var;
    }
}
