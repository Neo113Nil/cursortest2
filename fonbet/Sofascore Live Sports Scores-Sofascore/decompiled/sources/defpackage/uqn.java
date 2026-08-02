package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class uqn {
    public static final vv9 a = vv9.x("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final vvf b;
    public static final vvf c;
    public static final vvf d;
    public static final vvf e;
    public static final vvf f;

    static {
        av9 av9Var = hv9.b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        qha.p(7, objArr);
        b = hv9.r(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        qha.p(3, objArr2);
        c = hv9.r(3, objArr2);
        d = hv9.A("_r", "_dbg");
        zu9 zu9Var = new zu9(4);
        zu9Var.d(zzjo.a);
        zu9Var.d(zzjo.b);
        e = zu9Var.g();
        f = hv9.A("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    public static boolean b(Bundle bundle, String str) {
        if (!b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            vvf vvfVar = d;
            int i = vvfVar.d;
            int i2 = 0;
            while (i2 < i) {
                boolean containsKey = bundle.containsKey((String) vvfVar.get(i2));
                i2++;
                if (containsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!e.contains(str2)) {
            vvf vvfVar = f;
            int i = vvfVar.d;
            int i2 = 0;
            while (i2 < i) {
                boolean matches = str2.matches((String) vvfVar.get(i2));
                i2++;
                if (matches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, Bundle bundle, String str2) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            vvf vvfVar = d;
            int i = vvfVar.d;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
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
                } else {
                    boolean containsKey = bundle.containsKey((String) vvfVar.get(i2));
                    i2++;
                    if (containsKey) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
