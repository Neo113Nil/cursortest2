package s7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.zzao;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u1 extends k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e2 f23120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(e2 e2Var, m1 m1Var, int i5) {
        super(m1Var);
        this.f23119e = i5;
        switch (i5) {
            case 1:
                Objects.requireNonNull(e2Var);
                this.f23120f = e2Var;
                super(m1Var);
                break;
            case 2:
                Objects.requireNonNull(e2Var);
                this.f23120f = e2Var;
                super(m1Var);
                break;
            case 3:
                this.f23120f = e2Var;
                super(m1Var);
                break;
            default:
                Objects.requireNonNull(e2Var);
                this.f23120f = e2Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0134, code lost:
    
        if (r0.R() >= 234200) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x030b  */
    @Override // s7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z5;
        Pair pair;
        NetworkInfo activeNetworkInfo;
        zzao y5;
        Bundle bundle;
        URL url;
        switch (this.f23119e) {
            case 0:
                e2 e2Var = ((f1) this.f23120f.f3328a).f22751m;
                f1.l(e2Var);
                new Thread(new t1(e2Var, 0)).start();
                break;
            case 1:
                this.f23120f.I();
                break;
            case 2:
                this.f23120f.p();
                break;
            default:
                e2 e2Var2 = this.f23120f;
                f1 f1Var = (f1) e2Var2.f3328a;
                v0 v0Var = f1Var.f22744e;
                n0 n0Var = f1Var.f22745f;
                d1 d1Var = f1Var.f22746g;
                f1.m(d1Var);
                d1Var.j();
                h2 h2Var = f1Var.f22753o;
                f1.m(h2Var);
                f1 f1Var2 = (f1) h2Var.f3328a;
                f1.m(h2Var);
                String p10 = f1Var.r().p();
                Boolean v5 = f1Var.f22743d.v("google_analytics_adid_collection_enabled");
                if (v5 == null || v5.booleanValue()) {
                    f1.k(v0Var);
                    f1 f1Var3 = (f1) v0Var.f3328a;
                    v0Var.j();
                    if (v0Var.q().i(p1.AD_STORAGE)) {
                        f1Var3.f22749k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = v0Var.f23129h;
                        z5 = true;
                        if (str == null || elapsedRealtime >= v0Var.j) {
                            v0Var.j = f1Var3.f22743d.q(p10, x.f23176b) + elapsedRealtime;
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(f1Var3.f22740a);
                                v0Var.f23129h = "";
                                String id2 = advertisingIdInfo.getId();
                                if (id2 != null) {
                                    v0Var.f23129h = id2;
                                }
                                v0Var.f23130i = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e7) {
                                n0 n0Var2 = f1Var3.f22745f;
                                f1.m(n0Var2);
                                n0Var2.f22909m.b(e7, "Unable to get advertising id");
                                v0Var.f23129h = "";
                            }
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                            pair = new Pair(v0Var.f23129h, Boolean.valueOf(v0Var.f23130i));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(v0Var.f23130i));
                        }
                    } else {
                        z5 = true;
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        f1.m(n0Var);
                        n0Var.f22910n.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        f1.m(h2Var);
                        h2Var.l();
                        ConnectivityManager connectivityManager = (ConnectivityManager) f1Var2.f22740a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb2 = new StringBuilder();
                                y2 p11 = f1Var.p();
                                p11.j();
                                p11.k();
                                if (p11.q()) {
                                    v3 v3Var = ((f1) p11.f3328a).f22748i;
                                    f1.k(v3Var);
                                    break;
                                }
                                e2 e2Var3 = f1Var.f22751m;
                                f1.l(e2Var3);
                                f1 f1Var4 = (f1) e2Var3.f3328a;
                                e2Var3.j();
                                y2 p12 = f1Var4.p();
                                f1 f1Var5 = (f1) p12.f3328a;
                                p12.j();
                                p12.k();
                                a0 a0Var = p12.f23257d;
                                if (a0Var == null) {
                                    p12.p();
                                    n0 n0Var3 = f1Var5.f22745f;
                                    f1.m(n0Var3);
                                    n0Var3.f22909m.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        y5 = a0Var.y(p12.z(false));
                                        p12.w();
                                    } catch (RemoteException e9) {
                                        n0 n0Var4 = f1Var5.f22745f;
                                        f1.m(n0Var4);
                                        n0Var4.f22903f.b(e9, "Failed to get consents; remote exception");
                                    }
                                    bundle = y5 == null ? y5.f5795a : null;
                                    if (bundle != null) {
                                        int i5 = f1Var.B;
                                        f1Var.B = i5 + 1;
                                        r13 = i5 < 10 ? z5 : false;
                                        f1.m(n0Var);
                                        String str2 = i5 < 10 ? "Retrying." : "Skipping.";
                                        n0Var.f22909m.b(Integer.valueOf(f1Var.B), d9.e.m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                    } else {
                                        q1 b10 = q1.b(100, bundle);
                                        sb2.append("&gcs=");
                                        sb2.append(b10.f());
                                        l c2 = l.c(100, bundle);
                                        String str3 = c2.f22864d;
                                        sb2.append("&dma=");
                                        Boolean bool = c2.f22863c;
                                        Boolean bool2 = Boolean.FALSE;
                                        sb2.append(!Objects.equals(bool, bool2) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str3)) {
                                            sb2.append("&dma_cps=");
                                            sb2.append(str3);
                                        }
                                        int ordinal = q1.d(bundle.getString("ad_personalization")).ordinal();
                                        if (ordinal != 2) {
                                            bool2 = ordinal != 3 ? null : Boolean.TRUE;
                                        }
                                        int i10 = !Objects.equals(bool2, Boolean.TRUE) ? 1 : 0;
                                        sb2.append("&npa=");
                                        sb2.append(i10);
                                        f1.m(n0Var);
                                        n0Var.f22910n.b(sb2, "Consent query parameters to Bow");
                                        v3 v3Var2 = f1Var.f22748i;
                                        f1.k(v3Var2);
                                        ((f1) f1Var.r().f3328a).f22743d.o();
                                        String str4 = (String) pair.first;
                                        long a7 = v0Var.f23140u.a() - 1;
                                        String sb3 = sb2.toString();
                                        f1 f1Var6 = (f1) v3Var2.f3328a;
                                        try {
                                            g6.v.e(str4);
                                            g6.v.e(p10);
                                            String str5 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + v3Var2.R()) + "&rdid=" + str4 + "&bundleid=" + p10 + "&retry=" + a7;
                                            if (p10.equals(f1Var6.f22743d.n("debug.deferred.deeplink"))) {
                                                str5 = str5.concat("&ddl_test=1");
                                            }
                                            if (!sb3.isEmpty()) {
                                                if (sb3.charAt(0) != '&') {
                                                    str5 = str5.concat("&");
                                                }
                                                str5 = str5.concat(sb3);
                                            }
                                            url = new URL(str5);
                                        } catch (IllegalArgumentException e10) {
                                            e = e10;
                                            n0 n0Var5 = f1Var6.f22745f;
                                            f1.m(n0Var5);
                                            n0Var5.f22903f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r13) {
                                                return;
                                            }
                                        } catch (MalformedURLException e11) {
                                            e = e11;
                                            n0 n0Var52 = f1Var6.f22745f;
                                            f1.m(n0Var52);
                                            n0Var52.f22903f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r13) {
                                            }
                                        }
                                        if (url != null) {
                                            f1.m(h2Var);
                                            x0 x0Var = new x0(f1Var, 1);
                                            h2Var.l();
                                            d1 d1Var2 = f1Var2.f22746g;
                                            f1.m(d1Var2);
                                            d1Var2.v(new q0(h2Var, p10, url, (byte[]) null, (HashMap) null, x0Var));
                                        }
                                    }
                                }
                                y5 = null;
                                if (y5 == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                f1.m(n0Var);
                                n0Var.f22906i.a("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        f1.m(n0Var);
                        n0Var.f22906i.a("Network is not available for Deferred Deep Link request. Skipping");
                    }
                } else {
                    f1.m(n0Var);
                    n0Var.f22910n.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (r13) {
                    e2Var2.f22711t.b(2000L);
                    break;
                }
                break;
        }
    }
}
