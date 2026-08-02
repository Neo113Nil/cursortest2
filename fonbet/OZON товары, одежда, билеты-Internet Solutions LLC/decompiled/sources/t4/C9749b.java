package t4;

import android.text.TextUtils;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.C8050C;
import m3.C8066h;
import m3.N;
import m3.s;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9749b {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f99113c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f99114d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f99115a = new C8050C();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f99116b = new StringBuilder();

    private static String b(C8050C c8050c, StringBuilder sb2) {
        boolean z11 = false;
        sb2.setLength(0);
        int f7 = c8050c.f();
        int i11 = c8050c.i();
        while (f7 < i11 && !z11) {
            char c11 = (char) c8050c.e()[f7];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z11 = true;
            } else {
                f7++;
                sb2.append(c11);
            }
        }
        c8050c.S(f7 - c8050c.f());
        return sb2.toString();
    }

    static String c(C8050C c8050c, StringBuilder sb2) {
        d(c8050c);
        if (c8050c.a() == 0) {
            return null;
        }
        String b11 = b(c8050c, sb2);
        if (!b11.isEmpty()) {
            return b11;
        }
        return "" + ((char) c8050c.E());
    }

    static void d(C8050C c8050c) {
        while (true) {
            for (boolean z11 = true; c8050c.a() > 0 && z11; z11 = false) {
                char c11 = (char) c8050c.e()[c8050c.f()];
                if (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ') {
                    c8050c.S(1);
                } else {
                    int f7 = c8050c.f();
                    int i11 = c8050c.i();
                    byte[] e11 = c8050c.e();
                    int i12 = f7 + 2;
                    if (i12 <= i11) {
                        int i13 = f7 + 1;
                        if (e11[f7] == 47 && e11[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) e11[i12]) == '*' && ((char) e11[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            c8050c.S(i11 - c8050c.f());
                        }
                    }
                }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0301, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00aa, code lost:
    
        if (")".equals(c(r9, r4)) == false) goto L8;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(C8050C c8050c) {
        String str;
        String sb2;
        char c11;
        int i11 = -1;
        StringBuilder sb3 = this.f99116b;
        int i12 = 0;
        sb3.setLength(0);
        int f7 = c8050c.f();
        while (!TextUtils.isEmpty(c8050c.r(StandardCharsets.UTF_8))) {
        }
        byte[] e11 = c8050c.e();
        int f11 = c8050c.f();
        C8050C c8050c2 = this.f99115a;
        c8050c2.P(f11, e11);
        c8050c2.R(f7);
        ArrayList arrayList = new ArrayList();
        while (true) {
            d(c8050c2);
            if (c8050c2.a() >= 5 && "::cue".equals(c8050c2.C(5, StandardCharsets.UTF_8))) {
                int f12 = c8050c2.f();
                String c12 = c(c8050c2, sb3);
                if (c12 != null) {
                    if ("{".equals(c12)) {
                        c8050c2.R(f12);
                        str = "";
                    } else if ("(".equals(c12)) {
                        int f13 = c8050c2.f();
                        int i13 = c8050c2.i();
                        int i14 = i12;
                        while (f13 < i13 && i14 == 0) {
                            int i15 = f13 + 1;
                            i14 = ((char) c8050c2.e()[f13]) == ')' ? 1 : i12;
                            f13 = i15;
                        }
                        str = c8050c2.C((f13 + i11) - c8050c2.f(), StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null && "{".equals(c(c8050c2, sb3))) {
                        C9750c c9750c = new C9750c();
                        if (!str.isEmpty()) {
                            int indexOf = str.indexOf(91);
                            if (indexOf != i11) {
                                Matcher matcher = f99113c.matcher(str.substring(indexOf));
                                if (matcher.matches()) {
                                    String group = matcher.group(1);
                                    group.getClass();
                                    c9750c.z(group);
                                }
                                str = str.substring(i12, indexOf);
                            }
                            int i16 = N.f74289a;
                            String[] split = str.split("\\.", i11);
                            String str2 = split[i12];
                            int indexOf2 = str2.indexOf(35);
                            if (indexOf2 != i11) {
                                c9750c.y(str2.substring(i12, indexOf2));
                                c9750c.x(str2.substring(indexOf2 + 1));
                            } else {
                                c9750c.y(str2);
                            }
                            if (split.length > 1) {
                                int length = split.length;
                                G10.a.c(length <= split.length ? 1 : i12);
                                c9750c.w((String[]) Arrays.copyOfRange(split, 1, length));
                            }
                        }
                        int i17 = i12;
                        String str3 = null;
                        while (i17 == 0) {
                            int f14 = c8050c2.f();
                            str3 = c(c8050c2, sb3);
                            int i18 = (str3 == null || "}".equals(str3)) ? 1 : i12;
                            if (i18 == 0) {
                                c8050c2.R(f14);
                                d(c8050c2);
                                String b11 = b(c8050c2, sb3);
                                if (!b11.isEmpty() && ProductContainerDTO.RATIO_DELIMITER.equals(c(c8050c2, sb3))) {
                                    d(c8050c2);
                                    StringBuilder sb4 = new StringBuilder();
                                    int i19 = i12;
                                    while (true) {
                                        if (i19 == 0) {
                                            int f15 = c8050c2.f();
                                            String c13 = c(c8050c2, sb3);
                                            if (c13 == null) {
                                                sb2 = null;
                                            } else if ("}".equals(c13) || ";".equals(c13)) {
                                                c8050c2.R(f15);
                                                i19 = 1;
                                            } else {
                                                sb4.append(c13);
                                            }
                                        } else {
                                            sb2 = sb4.toString();
                                        }
                                    }
                                    if (sb2 != null && !sb2.isEmpty()) {
                                        int f16 = c8050c2.f();
                                        String c14 = c(c8050c2, sb3);
                                        if (!";".equals(c14)) {
                                            if ("}".equals(c14)) {
                                                c8050c2.R(f16);
                                            } else {
                                                continue;
                                            }
                                        }
                                        if ("color".equals(b11)) {
                                            c9750c.q(C8066h.b(sb2));
                                        } else if ("background-color".equals(b11)) {
                                            c9750c.n(C8066h.b(sb2));
                                        } else if ("ruby-position".equals(b11)) {
                                            if ("over".equals(sb2)) {
                                                c9750c.v(1);
                                            } else if ("under".equals(sb2)) {
                                                c9750c.v(2);
                                            }
                                        } else if ("text-combine-upright".equals(b11)) {
                                            c9750c.p("all".equals(sb2) || sb2.startsWith("digits"));
                                        } else if ("text-decoration".equals(b11)) {
                                            if ("underline".equals(sb2)) {
                                                c9750c.A();
                                            }
                                        } else if ("font-family".equals(b11)) {
                                            c9750c.r(sb2);
                                        } else if ("font-weight".equals(b11)) {
                                            if ("bold".equals(sb2)) {
                                                c9750c.o();
                                            }
                                        } else if ("font-style".equals(b11)) {
                                            if ("italic".equals(sb2)) {
                                                c9750c.u();
                                            }
                                        } else if ("font-size".equals(b11)) {
                                            Matcher matcher2 = f99114d.matcher(O7.b.b(sb2));
                                            if (matcher2.matches()) {
                                                String group2 = matcher2.group(2);
                                                group2.getClass();
                                                switch (group2.hashCode()) {
                                                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                        if (group2.equals("%")) {
                                                            c11 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    case 3240:
                                                        if (group2.equals("em")) {
                                                            c11 = 1;
                                                            break;
                                                        }
                                                        break;
                                                    case 3592:
                                                        if (group2.equals("px")) {
                                                            c11 = 2;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                c11 = 65535;
                                                switch (c11) {
                                                    case 0:
                                                        c9750c.t(3);
                                                        break;
                                                    case 1:
                                                        c9750c.t(2);
                                                        break;
                                                    case 2:
                                                        c9750c.t(1);
                                                        break;
                                                    default:
                                                        throw new IllegalStateException();
                                                }
                                                String group3 = matcher2.group(1);
                                                group3.getClass();
                                                c9750c.s(Float.parseFloat(group3));
                                            } else {
                                                s.f("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            i17 = i18;
                            i12 = 0;
                        }
                        if ("}".equals(str3)) {
                            arrayList.add(c9750c);
                        }
                        i11 = -1;
                        i12 = 0;
                    }
                }
            }
            str = null;
            if (str == null) {
            }
        }
    }
}
