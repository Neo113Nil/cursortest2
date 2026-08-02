package s7;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a3 extends l3 {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f22643d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.android.core.s f22644e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.android.core.s f22645f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.s f22646g;

    /* renamed from: h, reason: collision with root package name */
    public final io.sentry.android.core.s f22647h;

    /* renamed from: i, reason: collision with root package name */
    public final io.sentry.android.core.s f22648i;
    public final io.sentry.android.core.s j;

    public a3(r3 r3Var) {
        super(r3Var);
        this.f22643d = new HashMap();
        v0 v0Var = ((f1) this.f3328a).f22744e;
        f1.k(v0Var);
        this.f22644e = new io.sentry.android.core.s(v0Var, "last_delete_stale", 0L);
        v0 v0Var2 = ((f1) this.f3328a).f22744e;
        f1.k(v0Var2);
        this.f22645f = new io.sentry.android.core.s(v0Var2, "last_delete_stale_batch", 0L);
        v0 v0Var3 = ((f1) this.f3328a).f22744e;
        f1.k(v0Var3);
        this.f22646g = new io.sentry.android.core.s(v0Var3, "backoff", 0L);
        v0 v0Var4 = ((f1) this.f3328a).f22744e;
        f1.k(v0Var4);
        this.f22647h = new io.sentry.android.core.s(v0Var4, "last_upload", 0L);
        v0 v0Var5 = ((f1) this.f3328a).f22744e;
        f1.k(v0Var5);
        this.f22648i = new io.sentry.android.core.s(v0Var5, "last_upload_attempt", 0L);
        v0 v0Var6 = ((f1) this.f3328a).f22744e;
        f1.k(v0Var6);
        this.j = new io.sentry.android.core.s(v0Var6, "midnight_offset", 0L);
    }

    public final Pair n(String str) {
        AdvertisingIdClient.Info info;
        z2 z2Var;
        j();
        f1 f1Var = (f1) this.f3328a;
        q6.a aVar = f1Var.f22749k;
        e eVar = f1Var.f22743d;
        aVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f22643d;
        z2 z2Var2 = (z2) hashMap.get(str);
        if (z2Var2 != null && elapsedRealtime < z2Var2.f23279c) {
            return new Pair(z2Var2.f23277a, Boolean.valueOf(z2Var2.f23278b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long q = eVar.q(str, x.f23176b) + elapsedRealtime;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(f1Var.f22740a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (z2Var2 != null && elapsedRealtime < z2Var2.f23279c + eVar.q(str, x.f23179c)) {
                    return new Pair(z2Var2.f23277a, Boolean.valueOf(z2Var2.f23278b));
                }
                info = null;
            }
        } catch (Exception e7) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22909m.b(e7, "Unable to get advertising id");
            z2Var = new z2("", q, false);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = info.getId();
        z2Var = id2 != null ? new z2(id2, q, info.isLimitAdTrackingEnabled()) : new z2("", q, info.isLimitAdTrackingEnabled());
        hashMap.put(str, z2Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(z2Var.f23277a, Boolean.valueOf(z2Var.f23278b));
    }

    public final String o(String str, boolean z5) {
        j();
        String str2 = z5 ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest A = v3.A();
        if (A == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, A.digest(str2.getBytes())));
    }

    @Override // s7.l3
    public final void m() {
    }
}
