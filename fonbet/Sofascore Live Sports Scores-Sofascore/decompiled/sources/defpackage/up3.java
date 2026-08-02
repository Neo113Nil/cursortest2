package defpackage;

import com.ironsource.U3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class up3 {
    public static final up3 e = new up3("*", "*", km5.a);
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public up3(String str, String str2, List list) {
        this(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.c = str;
        this.d = str2;
    }

    public final String a(String str) {
        str.getClass();
        List list = this.b;
        int i = b.i(list);
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            h89 h89Var = (h89) list.get(i2);
            if (c.o(h89Var.a, str, true)) {
                return h89Var.b;
            }
            if (i2 == i) {
                return null;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof up3)) {
            return false;
        }
        up3 up3Var = (up3) obj;
        return c.o(this.c, up3Var.c, true) && c.o(this.d, up3Var.d, true) && Intrinsics.c(this.b, up3Var.b);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.c.toLowerCase(locale);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.d.toLowerCase(locale);
        lowerCase2.getClass();
        int hashCode2 = lowerCase2.hashCode();
        return (this.b.hashCode() * 31) + hashCode2 + (hashCode * 31) + hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0119 A[LOOP:1: B:13:0x0044->B:36:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[EDGE_INSN: B:37:0x011d->B:73:0x011d BREAK  A[LOOP:1: B:13:0x0044->B:36:0x0119], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        List<h89> list = this.b;
        boolean isEmpty = list.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        int length = str.length();
        int i = 0;
        for (h89 h89Var : list) {
            i += h89Var.b.length() + h89Var.a.length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + i);
        sb.append(str);
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                h89 h89Var2 = (h89) list.get(i2);
                sb.append("; ");
                sb.append(h89Var2.a);
                sb.append(U3.j.b);
                String str2 = h89Var2.b;
                Set set = i89.a;
                if (str2.length() != 0) {
                    if (str2.length() >= 2 && iii.E(str2) == '\"' && iii.G(str2) == '\"') {
                        int i3 = 1;
                        do {
                            int O = StringsKt.O(str2, '\"', i3, 4);
                            if (O == str2.length() - 1) {
                                break;
                            }
                            int i4 = 0;
                            for (int i5 = O - 1; str2.charAt(i5) == '\\'; i5--) {
                                i4++;
                            }
                            if (i4 % 2 != 0) {
                                i3 = O + 1;
                            }
                        } while (i3 < str2.length());
                        sb.append(str2);
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                    int length2 = str2.length();
                    for (int i6 = 0; i6 < length2; i6++) {
                        if (!i89.a.contains(Character.valueOf(str2.charAt(i6)))) {
                        }
                    }
                    sb.append(str2);
                    if (i2 == size) {
                    }
                }
                StringBuilder sb2 = new StringBuilder("\"");
                int length3 = str2.length();
                for (int i7 = 0; i7 < length3; i7++) {
                    char charAt = str2.charAt(i7);
                    if (charAt == '\t') {
                        sb2.append("\\t");
                    } else if (charAt == '\n') {
                        sb2.append("\\n");
                    } else if (charAt == '\r') {
                        sb2.append("\\r");
                    } else if (charAt == '\"') {
                        sb2.append("\\\"");
                    } else if (charAt != '\\') {
                        sb2.append(charAt);
                    } else {
                        sb2.append("\\\\");
                    }
                }
                sb2.append("\"");
                sb.append(sb2.toString());
                if (i2 == size) {
                }
            }
        }
        return sb.toString();
    }

    public up3(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public up3(String str, String str2, String str3, ArrayList arrayList) {
        this(str3, arrayList);
        this.c = str;
        this.d = str2;
    }
}
