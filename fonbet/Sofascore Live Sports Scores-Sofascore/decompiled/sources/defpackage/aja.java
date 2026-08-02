package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aja {
    public static final aja c = new aja("COMPOSITION");
    public final List a;
    public bja b;

    public aja(aja ajaVar) {
        this.a = new ArrayList(ajaVar.a);
        this.b = ajaVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, String str) {
        List list = this.a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals("*");
                if ((z || (i == list.size() - 2 && ((String) mz1.g(1, list)).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !((String) list.get(i + 1)).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return ((String) list.get(i2)).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) mz1.g(1, list)).equals("**"))) {
                }
            }
        }
        return false;
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aja.class == obj.getClass()) {
            aja ajaVar = (aja) obj;
            if (!this.a.equals(ajaVar.a)) {
                return false;
            }
            bja bjaVar = this.b;
            bja bjaVar2 = ajaVar.b;
            if (bjaVar != null) {
                return bjaVar.equals(bjaVar2);
            }
            if (bjaVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bja bjaVar = this.b;
        return hashCode + (bjaVar != null ? bjaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        return lnb.r(sb, this.b != null, '}');
    }

    public aja(String... strArr) {
        this.a = Arrays.asList(strArr);
    }
}
