package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class el3 implements fed {
    public final String a;

    public el3(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.vm8
    public final wm8 a() {
        this.a.getClass();
        return new ph3();
    }

    @Override // defpackage.vm8
    public final v9e b() {
        List a;
        String str;
        String str2 = this.a;
        if (str2.length() == 0) {
            a = km5.a;
        } else {
            xbb b = a.b();
            String str3 = "";
            if (vha.z(str2.charAt(0))) {
                int length = str2.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str = str2;
                        break;
                    }
                    if (!vha.z(str2.charAt(i))) {
                        str = str2.substring(0, i);
                        break;
                    }
                    i++;
                }
                b.add(new ajd(a.c(new fl3(str))));
                int length2 = str2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        str2 = "";
                        break;
                    }
                    if (!vha.z(str2.charAt(i2))) {
                        str2 = str2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (str2.length() > 0) {
                if (vha.z(str2.charAt(str2.length() - 1))) {
                    int length3 = str2.length();
                    while (true) {
                        length3--;
                        if (-1 >= length3) {
                            break;
                        }
                        if (!vha.z(str2.charAt(length3))) {
                            str3 = str2.substring(0, length3 + 1);
                            break;
                        }
                    }
                    b.add(new zhe(str3));
                    int length4 = str2.length() - 1;
                    while (true) {
                        if (-1 >= length4) {
                            break;
                        }
                        if (!vha.z(str2.charAt(length4))) {
                            str2 = str2.substring(length4 + 1);
                            break;
                        }
                        length4--;
                    }
                    b.add(new ajd(a.c(new fl3(str2))));
                } else {
                    b.add(new zhe(str2));
                }
            }
            a = a.a(b);
        }
        return new v9e(a, km5.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof el3) {
            return Intrinsics.c(this.a, ((el3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}
