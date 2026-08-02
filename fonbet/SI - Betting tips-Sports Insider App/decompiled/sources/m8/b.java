package m8;

import android.os.Bundle;
import f8.e;
import f8.j;
import f8.l;
import java.util.Arrays;
import k2.x;
import rh.g;
import s7.r1;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final l f20497a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f20498b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f20499c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f20500d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f20501e;

    static {
        int i5 = j.f9512c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        j.h(15, objArr);
        f8.b bVar = e.f9502b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        h.f(7, objArr2);
        f20497a = e.f(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        h.f(3, objArr3);
        f20498b = e.f(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        h.f(2, objArr4);
        f20499c = e.f(2, objArr4);
        x.f(4, "initialCapacity");
        String[] strArr = r1.f22983i;
        h.f(15, strArr);
        Object[] copyOf = Arrays.copyOf(new Object[4], g.j(4, 15));
        System.arraycopy(strArr, 0, copyOf, 0, 15);
        String[] strArr2 = r1.j;
        h.f(15, strArr2);
        if (copyOf.length < 30) {
            copyOf = Arrays.copyOf(copyOf, g.j(copyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, copyOf, 15, 15);
        f20500d = e.f(30, copyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        h.f(2, objArr5);
        f20501e = e.f(2, objArr5);
    }

    public static boolean a(Bundle bundle, String str) {
        if (!f20497a.contains(str)) {
            if (bundle == null) {
                return true;
            }
            l lVar = f20499c;
            int i5 = lVar.f9518d;
            int i10 = 0;
            while (i10 < i5) {
                boolean containsKey = bundle.containsKey((String) lVar.get(i10));
                i10++;
                if (containsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f20500d.contains(str2)) {
            l lVar = f20501e;
            int i5 = lVar.f9518d;
            int i10 = 0;
            while (i10 < i5) {
                boolean matches = str2.matches((String) lVar.get(i10));
                i10++;
                if (matches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!f20498b.contains(str) && bundle != null) {
            l lVar = f20499c;
            int i5 = lVar.f9518d;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
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
                    boolean containsKey = bundle.containsKey((String) lVar.get(i10));
                    i10++;
                    if (containsKey) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
