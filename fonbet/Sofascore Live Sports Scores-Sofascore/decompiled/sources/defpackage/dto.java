package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzpp;
import com.ironsource.U3;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dto extends skn {
    public final /* synthetic */ int e;
    public final /* synthetic */ zzlj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dto(zzlj zzljVar, iso isoVar, int i) {
        super(isoVar);
        this.e = i;
        switch (i) {
            case 2:
                Objects.requireNonNull(zzljVar);
                this.f = zzljVar;
                super(isoVar);
                break;
            default:
                Objects.requireNonNull(zzljVar);
                this.f = zzljVar;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0132, code lost:
    
        if (r0.B0() >= 234200) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0305  */
    @Override // defpackage.skn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        zzao w3;
        Bundle bundle;
        URL url;
        int i = this.e;
        zzlj zzljVar = this.f;
        switch (i) {
            case 0:
                zzlj zzljVar2 = ((zzic) zzljVar.b).m;
                zzic.l(zzljVar2);
                new Thread(new bto(zzljVar2, r2)).start();
                break;
            case 1:
                zzljVar.p0();
                break;
            case 2:
                zzljVar.W();
                break;
            default:
                zzic zzicVar = (zzic) zzljVar.b;
                lmo lmoVar = zzicVar.e;
                zzgu zzguVar = zzicVar.f;
                zzhz zzhzVar = zzicVar.g;
                zzic.m(zzhzVar);
                zzhzVar.Q();
                zzlo zzloVar = zzicVar.o;
                zzic.m(zzloVar);
                zzic zzicVar2 = (zzic) zzloVar.b;
                zzic.m(zzloVar);
                String W = zzicVar.q().W();
                Boolean d0 = zzicVar.d.d0("google_analytics_adid_collection_enabled");
                if (d0 == null || d0.booleanValue()) {
                    zzic.k(lmoVar);
                    zzic zzicVar3 = (zzic) lmoVar.b;
                    lmoVar.Q();
                    if (lmoVar.X().i(zzjk.AD_STORAGE)) {
                        zzicVar3.k.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = lmoVar.i;
                        if (str == null || elapsedRealtime >= lmoVar.k) {
                            lmoVar.k = zzicVar3.d.Y(W, zzfy.b) + elapsedRealtime;
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzicVar3.a);
                                lmoVar.i = "";
                                String id = advertisingIdInfo.getId();
                                if (id != null) {
                                    lmoVar.i = id;
                                }
                                lmoVar.j = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e) {
                                zzgu zzguVar2 = zzicVar3.f;
                                zzic.m(zzguVar2);
                                zzguVar2.n.b(e, "Unable to get advertising id");
                                lmoVar.i = "";
                            }
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                            pair = new Pair(lmoVar.i, Boolean.valueOf(lmoVar.j));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(lmoVar.j));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        zzic.m(zzguVar);
                        zzguVar.o.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        zzic.m(zzloVar);
                        zzloVar.S();
                        ConnectivityManager connectivityManager = (ConnectivityManager) zzicVar2.a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb = new StringBuilder();
                                zznl o = zzicVar.o();
                                o.Q();
                                o.R();
                                if (o.X()) {
                                    zzpp zzppVar = ((zzic) o.b).i;
                                    zzic.k(zzppVar);
                                    break;
                                }
                                zzlj zzljVar3 = zzicVar.m;
                                zzic.l(zzljVar3);
                                zzic zzicVar4 = (zzic) zzljVar3.b;
                                zzljVar3.Q();
                                zznl o2 = zzicVar4.o();
                                zzic zzicVar5 = (zzic) o2.b;
                                o2.Q();
                                o2.R();
                                zzgb zzgbVar = o2.e;
                                if (zzgbVar == null) {
                                    o2.W();
                                    zzgu zzguVar3 = zzicVar5.f;
                                    zzic.m(zzguVar3);
                                    zzguVar3.n.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        w3 = zzgbVar.w3(o2.g0(false));
                                        o2.d0();
                                    } catch (RemoteException e2) {
                                        zzgu zzguVar4 = zzicVar5.f;
                                        zzic.m(zzguVar4);
                                        zzguVar4.g.b(e2, "Failed to get consents; remote exception");
                                    }
                                    bundle = w3 == null ? w3.a : null;
                                    if (bundle != null) {
                                        int i2 = zzicVar.B;
                                        zzicVar.B = i2 + 1;
                                        r2 = i2 < 10 ? 1 : 0;
                                        zzic.m(zzguVar);
                                        zzgs zzgsVar = zzguVar.n;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        zzgsVar.b(Integer.valueOf(zzicVar.B), mz1.o(sb2, i2 < 10 ? "Retrying." : "Skipping.", " retryCount"));
                                    } else {
                                        zzjl b = zzjl.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(b.f());
                                        zzba c = zzba.c(100, bundle);
                                        String str2 = c.d;
                                        sb.append("&dma=");
                                        Boolean bool = c.c;
                                        Boolean bool2 = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool, bool2) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str2)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str2);
                                        }
                                        int ordinal = zzjl.d(bundle.getString("ad_personalization")).ordinal();
                                        if (ordinal != 2) {
                                            bool2 = ordinal != 3 ? null : Boolean.TRUE;
                                        }
                                        int i3 = !Objects.equals(bool2, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i3);
                                        zzic.m(zzguVar);
                                        zzguVar.o.b(sb, "Consent query parameters to Bow");
                                        zzpp zzppVar2 = zzicVar.i;
                                        zzic.k(zzppVar2);
                                        ((zzic) zzicVar.q().b).d.W();
                                        String str3 = (String) pair.first;
                                        long a = lmoVar.v.a() - 1;
                                        String sb3 = sb.toString();
                                        zzic zzicVar6 = (zzic) zzppVar2.b;
                                        try {
                                            Preconditions.f(str3);
                                            Preconditions.f(W);
                                            String str4 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + zzppVar2.B0()) + "&rdid=" + str3 + "&bundleid=" + W + "&retry=" + a;
                                            if (W.equals(zzicVar6.d.U("debug.deferred.deeplink"))) {
                                                str4 = str4.concat("&ddl_test=1");
                                            }
                                            if (!sb3.isEmpty()) {
                                                if (sb3.charAt(0) != '&') {
                                                    str4 = str4.concat(U3.j.c);
                                                }
                                                str4 = str4.concat(sb3);
                                            }
                                            url = new URL(str4);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            zzgu zzguVar5 = zzicVar6.f;
                                            zzic.m(zzguVar5);
                                            zzguVar5.g.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r2 != 0) {
                                                return;
                                            }
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            zzgu zzguVar52 = zzicVar6.f;
                                            zzic.m(zzguVar52);
                                            zzguVar52.g.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (r2 != 0) {
                                            }
                                        }
                                        if (url != null) {
                                            zzic.m(zzloVar);
                                            d1l d1lVar = new d1l(zzicVar, 27);
                                            zzloVar.S();
                                            zzhz zzhzVar2 = zzicVar2.g;
                                            zzic.m(zzhzVar2);
                                            zzhzVar2.c0(new ugn(zzloVar, W, url, (byte[]) null, (HashMap) null, d1lVar));
                                        }
                                    }
                                }
                                w3 = null;
                                if (w3 == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                zzic.m(zzguVar);
                                zzguVar.j.a("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        zzic.m(zzguVar);
                        zzguVar.j.a("Network is not available for Deferred Deep Link request. Skipping");
                    }
                } else {
                    zzic.m(zzguVar);
                    zzguVar.o.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (r2 != 0) {
                    zzljVar.t.b(2000L);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dto(zzlj zzljVar, iso isoVar, int i, boolean z) {
        super(isoVar);
        this.e = i;
        this.f = zzljVar;
    }
}
