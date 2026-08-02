package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.sofascore.model.mvvm.model.UserSegmentationType;
import com.sofascore.results.mvvm.base.AbstractActivity;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class pk {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(AdManagerAdRequest.Builder builder, Context context) {
        boolean z;
        SharedPreferences d;
        builder.getClass();
        context.getClass();
        if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            ccd ccdVar = vl.b;
            String string = sharedPreferences.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
            ccd ccdVar2 = vl.b;
            if (!Intrinsics.c(string, "25_or_older")) {
                z = false;
                builder.addCustomTargeting("show_betting_ads", String.valueOf(z));
                Set set = jhk.a;
                if (jhk.a.contains(UserSegmentationType.Bettor)) {
                    return;
                }
                builder.addCustomTargeting("user_type", "bettor");
                return;
            }
        }
        z = true;
        builder.addCustomTargeting("show_betting_ads", String.valueOf(z));
        Set set2 = jhk.a;
        if (jhk.a.contains(UserSegmentationType.Bettor)) {
        }
    }

    public static xk b(Context context, boolean z) {
        Object obj;
        SharedPreferences d;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        String string = sharedPreferences.getString("PREF_DEV_AD_NETWORK", null);
        Iterator<E> it = xk.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((xk) obj).name(), string)) {
                break;
            }
        }
        xk xkVar = (xk) obj;
        if (xkVar != null) {
            return xkVar;
        }
        if (!z) {
            return null;
        }
        if (mx9.x(false)) {
            return xk.d;
        }
        yea yeaVar = j58.a;
        return j58.l(true) ? xk.c : xk.b;
    }

    public static boolean c(AbstractActivity abstractActivity) {
        SharedPreferences d;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = abstractActivity.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        long j = sharedPreferences.getLong("PREF_LAST_MAIN_MATCHES_INTERSTITIAL_AD_SHOWN", 0L);
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = abstractActivity.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext2);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences2 = d;
        }
        long j2 = sharedPreferences2.getLong("PREF_FIRST_RUN_TIMESTAMP", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        LocalDate o = vxd.o(Instant.ofEpochMilli(j));
        LocalDate o2 = vxd.o(Instant.ofEpochMilli(currentTimeMillis));
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        return ((int) chronoUnit.between(o, o2)) >= 1 && ((int) chronoUnit.between(vxd.o(Instant.ofEpochMilli(j2)), Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).toLocalDate())) >= 7;
    }
}
