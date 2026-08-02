package s7;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: c, reason: collision with root package name */
    public static final q1 f22964c = new q1(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f22965a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22966b;

    public q1(int i5) {
        EnumMap enumMap = new EnumMap(p1.class);
        this.f22965a = enumMap;
        p1 p1Var = p1.AD_STORAGE;
        n1 n1Var = n1.UNINITIALIZED;
        enumMap.put((EnumMap) p1Var, (p1) n1Var);
        enumMap.put((EnumMap) p1.ANALYTICS_STORAGE, (p1) n1Var);
        this.f22966b = i5;
    }

    public static String a(int i5) {
        return i5 != -30 ? i5 != -20 ? i5 != -10 ? i5 != 0 ? i5 != 30 ? i5 != 90 ? i5 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static q1 b(int i5, Bundle bundle) {
        if (bundle == null) {
            return new q1(i5);
        }
        EnumMap enumMap = new EnumMap(p1.class);
        for (p1 p1Var : o1.STORAGE.f22928a) {
            enumMap.put((EnumMap) p1Var, (p1) d(bundle.getString(p1Var.f22944a)));
        }
        return new q1(enumMap, i5);
    }

    public static q1 c(int i5, String str) {
        EnumMap enumMap = new EnumMap(p1.class);
        p1[] p1VarArr = o1.STORAGE.f22928a;
        for (int i10 = 0; i10 < p1VarArr.length; i10++) {
            String str2 = str == null ? "" : str;
            p1 p1Var = p1VarArr[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put((EnumMap) p1Var, (p1) e(str2.charAt(i11)));
            } else {
                enumMap.put((EnumMap) p1Var, (p1) n1.UNINITIALIZED);
            }
        }
        return new q1(enumMap, i5);
    }

    public static n1 d(String str) {
        n1 n1Var = n1.UNINITIALIZED;
        return str == null ? n1Var : str.equals("granted") ? n1.GRANTED : str.equals("denied") ? n1.DENIED : n1Var;
    }

    public static n1 e(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? n1.UNINITIALIZED : n1.GRANTED : n1.DENIED : n1.POLICY;
    }

    public static char h(n1 n1Var) {
        if (n1Var == null) {
            return '-';
        }
        int ordinal = n1Var.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i5, int i10) {
        int i11 = -30;
        if (i5 == -20) {
            if (i10 == -30) {
                return true;
            }
            i5 = -20;
        }
        if (i5 != -30) {
            i11 = i5;
        } else if (i10 == -20) {
            return true;
        }
        return i11 == i10 || i5 < i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        for (p1 p1Var : o1.STORAGE.f22928a) {
            if (this.f22965a.get(p1Var) != q1Var.f22965a.get(p1Var)) {
                return false;
            }
        }
        return this.f22966b == q1Var.f22966b;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (p1 p1Var : o1.STORAGE.f22928a) {
            n1 n1Var = (n1) this.f22965a.get(p1Var);
            char c2 = '-';
            if (n1Var != null && (ordinal = n1Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb2.append(c2);
        }
        return sb2.toString();
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (p1 p1Var : o1.STORAGE.f22928a) {
            sb2.append(h((n1) this.f22965a.get(p1Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f22965a.values().iterator();
        int i5 = this.f22966b * 17;
        while (it.hasNext()) {
            i5 = (i5 * 31) + ((n1) it.next()).hashCode();
        }
        return i5;
    }

    public final boolean i(p1 p1Var) {
        return ((n1) this.f22965a.get(p1Var)) != n1.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q1 j(q1 q1Var) {
        EnumMap enumMap = new EnumMap(p1.class);
        for (p1 p1Var : o1.STORAGE.f22928a) {
            n1 n1Var = (n1) this.f22965a.get(p1Var);
            n1 n1Var2 = (n1) q1Var.f22965a.get(p1Var);
            if (n1Var != null) {
                if (n1Var2 != null) {
                    n1 n1Var3 = n1.UNINITIALIZED;
                    if (n1Var != n1Var3) {
                        if (n1Var2 != n1Var3) {
                            n1 n1Var4 = n1.POLICY;
                            if (n1Var != n1Var4) {
                                if (n1Var2 != n1Var4) {
                                    n1 n1Var5 = n1.DENIED;
                                    n1Var = (n1Var == n1Var5 || n1Var2 == n1Var5) ? n1Var5 : n1.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (n1Var == null) {
                    enumMap.put((EnumMap) p1Var, (p1) n1Var);
                }
            }
            n1Var = n1Var2;
            if (n1Var == null) {
            }
        }
        return new q1(enumMap, 100);
    }

    public final q1 k(q1 q1Var) {
        EnumMap enumMap = new EnumMap(p1.class);
        for (p1 p1Var : o1.STORAGE.f22928a) {
            n1 n1Var = (n1) this.f22965a.get(p1Var);
            if (n1Var == n1.UNINITIALIZED) {
                n1Var = (n1) q1Var.f22965a.get(p1Var);
            }
            if (n1Var != null) {
                enumMap.put((EnumMap) p1Var, (p1) n1Var);
            }
        }
        return new q1(enumMap, this.f22966b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f22966b));
        for (p1 p1Var : o1.STORAGE.f22928a) {
            sb2.append(StringUtils.COMMA);
            sb2.append(p1Var.f22944a);
            sb2.append("=");
            n1 n1Var = (n1) this.f22965a.get(p1Var);
            if (n1Var == null) {
                n1Var = n1.UNINITIALIZED;
            }
            sb2.append(n1Var);
        }
        return sb2.toString();
    }

    public q1(EnumMap enumMap, int i5) {
        EnumMap enumMap2 = new EnumMap(p1.class);
        this.f22965a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f22966b = i5;
    }
}
