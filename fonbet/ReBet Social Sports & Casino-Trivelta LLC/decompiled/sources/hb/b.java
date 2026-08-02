package hb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.Y3;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.E;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final E f47854a = E.v("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC3445z f47855b = AbstractC3445z.A("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC3445z f47856c = AbstractC3445z.w("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC3445z f47857d = AbstractC3445z.v("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC3445z f47858e = new AbstractC3445z.a().j(Y3.zza).j(Y3.zzb).m();

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC3445z f47859f = AbstractC3445z.v("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean a(String str) {
        return !f47856c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f47855b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC3445z abstractC3445z = f47857d;
        int size = abstractC3445z.size();
        int i10 = 0;
        while (i10 < size) {
            boolean containsKey = bundle.containsKey((String) abstractC3445z.get(i10));
            i10++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f47858e.contains(str2)) {
            return false;
        }
        AbstractC3445z abstractC3445z = f47859f;
        int size = abstractC3445z.size();
        int i10 = 0;
        while (i10 < size) {
            boolean matches = str2.matches((String) abstractC3445z.get(i10));
            i10++;
            if (matches) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        AbstractC3445z abstractC3445z = f47857d;
        int size = abstractC3445z.size();
        int i10 = 0;
        while (i10 < size) {
            boolean containsKey = bundle.containsKey((String) abstractC3445z.get(i10));
            i10++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals("fcm")) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
