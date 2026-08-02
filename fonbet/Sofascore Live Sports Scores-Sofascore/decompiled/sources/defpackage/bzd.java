package defpackage;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.w;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bzd {
    public static final bzd a = new bzd();
    public static boolean b;
    public static boolean c;
    public static CustomAudienceManager d;
    public static r19 e;
    public static String f;

    static {
        "Fledge: ".concat(bzd.class.getSimpleName());
    }

    public static final void a() {
        String obj;
        if (cw3.a.contains(bzd.class)) {
            return;
        }
        try {
            c = true;
            Context a2 = w.a();
            e = new r19(a2);
            f = "https://www." + w.s + "/privacy_sandbox/pa/logic";
            try {
                CustomAudienceManager customAudienceManager = CustomAudienceManager.get(a2);
                d = customAudienceManager;
                if (customAudienceManager != null) {
                    b = true;
                }
                obj = null;
            } catch (Error e2) {
                obj = e2.toString();
                e2.toString();
            } catch (Exception e3) {
                obj = e3.toString();
                e3.toString();
            }
            if (b) {
                return;
            }
            r19 r19Var = e;
            if (r19Var == null) {
                Intrinsics.i("gpsDebugLogger");
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", obj);
            Unit unit = Unit.a;
            r19Var.a(bundle, "gps_pa_failed");
        } catch (Throwable th) {
            cw3.a(bzd.class, th);
        }
    }

    public final void b(String str, String str2) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            String c2 = c(str, str2);
            if (c2 == null) {
                return;
            }
            try {
                p19 p19Var = new p19(1);
                AdData.Builder builder = new AdData.Builder();
                String str3 = f;
                if (str3 == null) {
                    Intrinsics.i("baseUri");
                    throw null;
                }
                Uri parse = Uri.parse(str3.concat("/ad"));
                parse.getClass();
                AdData build = builder.setRenderUri(parse).setMetadata("{'isRealAd': false}").build();
                build.getClass();
                TrustedBiddingData.Builder builder2 = new TrustedBiddingData.Builder();
                String str4 = f;
                if (str4 == null) {
                    Intrinsics.i("baseUri");
                    throw null;
                }
                Uri parse2 = Uri.parse(str4.concat("?trusted_bidding"));
                parse2.getClass();
                TrustedBiddingData build2 = builder2.setTrustedBiddingUri(parse2).setTrustedBiddingKeys(a.c("")).build();
                build2.getClass();
                CustomAudience.Builder buyer = new CustomAudience.Builder().setName(c2).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb = new StringBuilder();
                String str5 = f;
                if (str5 == null) {
                    Intrinsics.i("baseUri");
                    throw null;
                }
                sb.append(str5);
                sb.append("?daily&app_id=");
                sb.append(str);
                Uri parse3 = Uri.parse(sb.toString());
                parse3.getClass();
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(parse3);
                String str6 = f;
                if (str6 == null) {
                    Intrinsics.i("baseUri");
                    throw null;
                }
                Uri parse4 = Uri.parse(str6.concat("?bidding"));
                parse4.getClass();
                CustomAudience build3 = dailyUpdateUri.setBiddingLogicUri(parse4).setTrustedBiddingData(build2).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(a.c(build)).build();
                build3.getClass();
                JoinCustomAudienceRequest build4 = new JoinCustomAudienceRequest.Builder().setCustomAudience(build3).build();
                build4.getClass();
                CustomAudienceManager customAudienceManager = d;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(build4, Executors.newSingleThreadExecutor(), p19Var);
                }
            } catch (Error e2) {
                e2.toString();
                r19 r19Var = e;
                if (r19Var == null) {
                    Intrinsics.i("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e2.toString());
                Unit unit = Unit.a;
                r19Var.a(bundle, "gps_pa_failed");
            } catch (Exception e3) {
                e3.toString();
                r19 r19Var2 = e;
                if (r19Var2 == null) {
                    Intrinsics.i("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e3.toString());
                Unit unit2 = Unit.a;
                r19Var2.a(bundle2, "gps_pa_failed");
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final String c(String str, String str2) {
        if (!cw3.a.contains(this) && str2 != null) {
            try {
                if (!str2.equals("_removed_") && !StringsKt.J(str2, "gps", false)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / 1000) + "@1";
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }
}
