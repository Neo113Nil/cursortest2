package defpackage;

import com.google.android.gms.ads.AdError;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class psi {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public psi(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = StringsKt.J(upperCase, "INT", false) ? 3 : (StringsKt.J(upperCase, "CHAR", false) || StringsKt.J(upperCase, "CLOB", false) || StringsKt.J(upperCase, "TEXT", false)) ? 2 : StringsKt.J(upperCase, "BLOB", false) ? 5 : (StringsKt.J(upperCase, "REAL", false) || StringsKt.J(upperCase, "FLOA", false) || StringsKt.J(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof psi) {
                boolean z = this.d > 0;
                psi psiVar = (psi) obj;
                int i = psiVar.f;
                if (z == (psiVar.d > 0) && Intrinsics.c(this.a, psiVar.a) && this.c == psiVar.c) {
                    String str = psiVar.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || s6a.u(str2, str)) && ((i2 != 2 || i != 1 || str == null || s6a.u(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : s6a.u(str2, str))) && this.g == psiVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return dii.b(dii.d(sb.toString()), "    ");
    }
}
