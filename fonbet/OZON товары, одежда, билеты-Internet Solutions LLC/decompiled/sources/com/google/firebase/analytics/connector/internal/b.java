package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhj;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final List f59492a;

    /* renamed from: b, reason: collision with root package name */
    private static final List f59493b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f59494c;

    /* renamed from: d, reason: collision with root package name */
    private static final List f59495d;

    /* renamed from: e, reason: collision with root package name */
    private static final List f59496e;

    static {
        new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
        f59492a = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        f59493b = Arrays.asList("auto", "app", "am");
        f59494c = Arrays.asList("_r", "_dbg");
        f59495d = Arrays.asList((String[]) ArrayUtils.concat(zzhj.zza, zzhj.zzb));
        f59496e = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(Bundle bundle, String str) {
        if (!"_cmp".equals(str)) {
            return true;
        }
        if (!c()) {
            return false;
        }
        Iterator it = f59494c.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean b(Bundle bundle, String str) {
        if (f59492a.contains(str)) {
            return false;
        }
        Iterator it = f59494c.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c() {
        return !f59493b.contains(AppMeasurement.FCM_ORIGIN);
    }
}
