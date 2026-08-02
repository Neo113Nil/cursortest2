package x9;

import aa.g;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.logrocket.core.LogRocketCore;
import eh.j;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.android.core.f;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ba.d f25417a = new ba.d("CPUTracker");

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f25418b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25419c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25421e;

    /* renamed from: f, reason: collision with root package name */
    public final g f25422f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25423g;

    /* renamed from: h, reason: collision with root package name */
    public eh.g f25424h;

    /* renamed from: i, reason: collision with root package name */
    public a f25425i;

    public b(LogRocketCore logRocketCore) {
        this.f25419c = 0.0f;
        this.f25420d = -1;
        this.f25421e = 1;
        this.f25423g = true;
        try {
            this.f25418b = new WeakReference(logRocketCore);
            this.f25424h = j.v();
            this.f25422f = new g(aa.j.a("lr-cpu-tracker"), new f(17, this), null, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            this.f25419c = 1000.0f / Os.sysconf(OsConstants._SC_CLK_TCK);
            this.f25420d = Process.myPid();
            this.f25421e = Runtime.getRuntime().availableProcessors();
            this.f25423g = false;
        } catch (Throwable unused) {
            this.f25422f = null;
        }
    }

    public final void a() {
        this.f25417a.a("Sending cpu usage. Total measurements: " + ((j) this.f25424h.f6816b).t());
        if (((j) this.f25424h.f6816b).t() == 0) {
            return;
        }
        eh.g gVar = this.f25424h;
        gVar.d();
        j.s((j) gVar.f6816b, this.f25421e);
        com.logrocket.core.g gVar2 = (com.logrocket.core.g) this.f25418b.get();
        if (gVar2 == null) {
            b();
        }
        if (gVar2 == null) {
            return;
        }
        gVar2.a(22, this.f25424h);
        this.f25424h = j.v();
    }

    public final void b() {
        this.f25423g = true;
        g gVar = this.f25422f;
        if (gVar != null) {
            gVar.d();
        }
        eh.g gVar2 = this.f25424h;
        gVar2.d();
        j.p((j) gVar2.f6816b);
    }
}
