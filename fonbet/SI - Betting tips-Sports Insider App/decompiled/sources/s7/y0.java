package s7;

import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.s5;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f23251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23252c;

    public /* synthetic */ y0(z0 z0Var, String str, int i5) {
        this.f23250a = i5;
        this.f23251b = z0Var;
        this.f23252c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23250a) {
            case 0:
                return new i4(new y0(this.f23251b, this.f23252c, 1));
            case 1:
                z0 z0Var = this.f23251b;
                j jVar = z0Var.f22859b.f22989c;
                r3.U(jVar);
                String str = this.f23252c;
                s0 l02 = jVar.l0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", ConstantDeviceInfo.APP_PLATFORM);
                hashMap.put("package_name", str);
                ((f1) z0Var.f3328a).f22743d.o();
                hashMap.put("gmp_version", 133005L);
                if (l02 != null) {
                    String N = l02.N();
                    if (N != null) {
                        hashMap.put("app_version", N);
                    }
                    hashMap.put("app_version_int", Long.valueOf(l02.P()));
                    hashMap.put("dynamite_version", Long.valueOf(l02.b()));
                }
                return hashMap;
            default:
                io.sentry.util.network.b bVar = new io.sentry.util.network.b(11, this.f23251b, this.f23252c, false);
                s5 s5Var = new s5("internal.remoteConfig", 0);
                s5Var.f5068b.put("getValue", new i4(s5Var, bVar));
                return s5Var;
        }
    }
}
