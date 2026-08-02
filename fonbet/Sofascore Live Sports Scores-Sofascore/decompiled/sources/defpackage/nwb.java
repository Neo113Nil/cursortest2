package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UserSegmentationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class nwb {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BrandingEvent a(Context context, int i, boolean z, String str) {
        BrandingEvent s;
        boolean z2;
        SharedPreferences sharedPreferences;
        SharedPreferences d;
        context.getClass();
        str.getClass();
        if (z || !str.equals(StatusKt.STATUS_NOT_STARTED) || (s = ccd.s(i, context)) == null) {
            return null;
        }
        if (s.getBettorsOnly()) {
            Set set = jhk.a;
            if (!jhk.a.contains(UserSegmentationType.Bettor)) {
                z2 = false;
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                boolean z3 = sharedPreferences.getBoolean("PREF_PROVIDER_ODDS_ENABLE", true);
                if (!z2 && z3) {
                    if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                        SharedPreferences sharedPreferences2 = uic.j;
                        if (sharedPreferences2 == null) {
                            Context applicationContext2 = context.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext2);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences2 = d;
                        }
                        ccd ccdVar = vl.b;
                        String string = sharedPreferences2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
                        ccd ccdVar2 = vl.b;
                        if (!Intrinsics.c(string, "25_or_older")) {
                            return null;
                        }
                    }
                    return s;
                }
            }
        }
        z2 = true;
        sharedPreferences = uic.j;
        if (sharedPreferences == null) {
        }
        boolean z32 = sharedPreferences.getBoolean("PREF_PROVIDER_ODDS_ENABLE", true);
        return !z2 ? null : null;
    }

    public static BrandingEvent b(Context context, int i, boolean z, String str) {
        BrandingEvent z2;
        context.getClass();
        str.getClass();
        if (z || !str.equals(StatusKt.STATUS_NOT_STARTED) || (z2 = ccd.z(i, context)) == null || PartnerOfferType.INSTANCE.fromValue(z2.getOfferType()) == null) {
            return null;
        }
        if (z2.getBettorsOnly()) {
            Set set = jhk.a;
            if (!jhk.a.contains(UserSegmentationType.Bettor)) {
                return null;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r4 = kotlin.text.StringsKt__StringsKt.split$default(r4, new java.lang.String[]{com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List c(Context context) {
        List split$default;
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
        ArrayList arrayList = null;
        String string = sharedPreferences.getString("PREF_MATCH_OF_THE_WEEK_SHOWN_EVENT_IDS", null);
        if (string != null && split$default != null) {
            arrayList = new ArrayList();
            for (Object obj : split$default) {
                if (!StringsKt.R((String) obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? km5.a : arrayList;
    }

    public static void d(int i, Context context) {
        String valueOf = String.valueOf(i);
        List c = c(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (!Intrinsics.c((String) obj, valueOf)) {
                arrayList.add(obj);
            }
        }
        n9e.u(context, new r41(CollectionsKt.M0(30, CollectionsKt.x0(arrayList, valueOf)), 5));
    }
}
