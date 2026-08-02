package gh;

import androidx.appcompat.widget.c1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public String f10321a;

    /* renamed from: d, reason: collision with root package name */
    public String f10324d;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f10327g;

    /* renamed from: h, reason: collision with root package name */
    public String f10328h;

    /* renamed from: b, reason: collision with root package name */
    public String f10322b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f10323c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f10325e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10326f = kotlin.collections.u.g("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 <= str.length()) {
            int F = StringsKt.F(str, '&', i5, false, 4);
            if (F == -1) {
                F = str.length();
            }
            int F2 = StringsKt.F(str, '=', i5, false, 4);
            if (F2 == -1 || F2 > F) {
                String substring = str.substring(i5, F);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i5, F2);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                arrayList.add(substring2);
                String substring3 = str.substring(F2 + 1, F);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                arrayList.add(substring3);
            }
            i5 = F + 1;
        }
        return arrayList;
    }

    public final y a() {
        ArrayList arrayList;
        String str = this.f10321a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String d10 = vh.a.d(this.f10322b, 0, 0, 7);
        String d11 = vh.a.d(this.f10323c, 0, 0, 7);
        String str2 = this.f10324d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b10 = b();
        ArrayList arrayList2 = this.f10326f;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.v.k(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(vh.a.d((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f10327g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(kotlin.collections.v.k(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? vh.a.d(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f10328h;
        return new y(str, d10, d11, str2, b10, arrayList3, arrayList, str4 != null ? vh.a.d(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i5 = this.f10325e;
        if (i5 != -1) {
            return i5;
        }
        String scheme = this.f10321a;
        Intrinsics.checkNotNull(scheme);
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.areEqual(scheme, "http")) {
            return 80;
        }
        return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0203, code lost:
    
        if (r7 < 65536) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0077, code lost:
    
        if (r13 == ':') goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(y yVar, String input) {
        int i5;
        int i10;
        int i11;
        int i12;
        int c2;
        char charAt;
        int i13;
        int i14;
        int i15;
        String a7;
        char charAt2;
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = hh.e.f10821a;
        int g10 = hh.e.g(0, input.length(), input);
        int h10 = hh.e.h(g10, input.length(), input);
        if (h10 - g10 >= 2) {
            char charAt3 = input.charAt(g10);
            if ((Intrinsics.compare((int) charAt3, 97) >= 0 && Intrinsics.compare((int) charAt3, 122) <= 0) || (Intrinsics.compare((int) charAt3, 65) >= 0 && Intrinsics.compare((int) charAt3, 90) <= 0)) {
                i5 = g10 + 1;
                while (true) {
                    if (i5 >= h10) {
                        break;
                    }
                    char charAt4 = input.charAt(i5);
                    if (('a' <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i5++;
                    }
                }
                if (i5 != -1) {
                    if (yVar == null) {
                        throw new IllegalArgumentException(c1.m("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? kotlin.text.d0.z(6, input) + "..." : input));
                    }
                    this.f10321a = yVar.f10329a;
                } else if (kotlin.text.z.n(input, "https:", g10, true)) {
                    this.f10321a = "https";
                    g10 += 6;
                } else {
                    if (!kotlin.text.z.n(input, "http:", g10, true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, i5);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f10321a = "http";
                    g10 += 5;
                }
                i11 = 0;
                for (i10 = g10; i10 < h10 && ((charAt2 = input.charAt(i10)) == '/' || charAt2 == '\\'); i10++) {
                    i11++;
                }
                ArrayList arrayList = this.f10326f;
                char c8 = '#';
                if (i11 < 2 || yVar == null || !Intrinsics.areEqual(yVar.f10329a, this.f10321a)) {
                    i12 = g10 + i11;
                    boolean z5 = false;
                    boolean z7 = false;
                    while (true) {
                        c2 = hh.e.c(i12, input, "@/\\?#", h10);
                        charAt = c2 == h10 ? input.charAt(c2) : (char) 65535;
                        if (charAt != 65535 || charAt == c8 || charAt == '/' || charAt == '\\' || charAt == '?') {
                            break;
                        }
                        if (charAt == '@') {
                            if (z5) {
                                this.f10323c += "%40" + vh.a.a(input, i12, c2, " \"':;<=>@[]^`{}|/\\?#", 112);
                                z5 = z5;
                            } else {
                                boolean z10 = z5;
                                int d10 = hh.e.d(input, ':', i12, c2);
                                String a10 = vh.a.a(input, i12, d10, " \"':;<=>@[]^`{}|/\\?#", 112);
                                if (z7) {
                                    a10 = d9.e.m(new StringBuilder(), this.f10322b, "%40", a10);
                                }
                                this.f10322b = a10;
                                if (d10 != c2) {
                                    this.f10323c = vh.a.a(input, d10 + 1, c2, " \"':;<=>@[]^`{}|/\\?#", 112);
                                    z5 = true;
                                } else {
                                    z5 = z10;
                                }
                                z7 = true;
                            }
                            i12 = c2 + 1;
                            c8 = '#';
                        }
                    }
                    i13 = i12;
                    while (true) {
                        if (i13 >= c2) {
                            i13 = c2;
                            break;
                        }
                        char charAt5 = input.charAt(i13);
                        if (charAt5 == ':') {
                            break;
                        }
                        if (charAt5 == '[') {
                            do {
                                i13++;
                                if (i13 < c2) {
                                }
                            } while (input.charAt(i13) != ']');
                        }
                        i13++;
                    }
                    i14 = i13 + 1;
                    if (i14 >= c2) {
                        this.f10324d = hh.d.b(vh.a.d(input, i12, i13, 4));
                        try {
                            i15 = Integer.parseInt(vh.a.a(input, i14, c2, "", 120));
                            if (1 <= i15) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i15 = -1;
                        this.f10325e = i15;
                        if (i15 == -1) {
                            StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                            String substring2 = input.substring(i14, c2);
                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                            sb3.append(substring2);
                            sb3.append('\"');
                            throw new IllegalArgumentException(sb3.toString().toString());
                        }
                    } else {
                        this.f10324d = hh.d.b(vh.a.d(input, i12, i13, 4));
                        String scheme = this.f10321a;
                        Intrinsics.checkNotNull(scheme);
                        Intrinsics.checkNotNullParameter(scheme, "scheme");
                        this.f10325e = Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1;
                    }
                    if (this.f10324d != null) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                        String substring3 = input.substring(i12, i13);
                        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                        sb4.append(substring3);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    g10 = c2;
                } else {
                    this.f10322b = yVar.e();
                    this.f10323c = yVar.a();
                    this.f10324d = yVar.f10332d;
                    this.f10325e = yVar.f10333e;
                    arrayList.clear();
                    arrayList.addAll(yVar.c());
                    if (g10 == h10 || input.charAt(g10) == '#') {
                        String d11 = yVar.d();
                        this.f10327g = (d11 == null || (a7 = vh.a.a(d11, 0, 0, " \"'<>#", 83)) == null) ? null : d(a7);
                    }
                }
                int c10 = hh.e.c(g10, input, "?#", h10);
                if (g10 != c10) {
                    char charAt6 = input.charAt(g10);
                    if (charAt6 == '/' || charAt6 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        g10++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (g10 < c10) {
                        int c11 = hh.e.c(g10, input, "/\\", c10);
                        boolean z11 = c11 < c10;
                        String a11 = vh.a.a(input, g10, c11, " \"<>^`{}|/\\?#", 112);
                        if (!Intrinsics.areEqual(a11, ".") && !kotlin.text.z.j(a11, "%2e", true)) {
                            if (!Intrinsics.areEqual(a11, "..") && !kotlin.text.z.j(a11, "%2e.", true) && !kotlin.text.z.j(a11, ".%2e", true) && !kotlin.text.z.j(a11, "%2e%2e", true)) {
                                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, a11);
                                } else {
                                    arrayList.add(a11);
                                }
                                if (z11) {
                                    arrayList.add("");
                                }
                            } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                arrayList.add("");
                            } else {
                                arrayList.set(arrayList.size() - 1, "");
                            }
                        }
                        g10 = z11 ? c11 + 1 : c11;
                    }
                }
                if (c10 < h10 && input.charAt(c10) == '?') {
                    int d12 = hh.e.d(input, '#', c10, h10);
                    this.f10327g = d(vh.a.a(input, c10 + 1, d12, " \"'<>#", 80));
                    c10 = d12;
                }
                if (c10 >= h10 || input.charAt(c10) != '#') {
                    return;
                }
                this.f10328h = vh.a.a(input, c10 + 1, h10, "", 48);
                return;
            }
        }
        i5 = -1;
        if (i5 != -1) {
        }
        i11 = 0;
        while (i10 < h10) {
            i11++;
        }
        ArrayList arrayList2 = this.f10326f;
        char c82 = '#';
        if (i11 < 2) {
        }
        i12 = g10 + i11;
        boolean z52 = false;
        boolean z72 = false;
        while (true) {
            c2 = hh.e.c(i12, input, "@/\\?#", h10);
            if (c2 == h10) {
            }
            if (charAt != 65535) {
                break;
            } else {
                break;
            }
        }
        i13 = i12;
        while (true) {
            if (i13 >= c2) {
            }
            i13++;
        }
        i14 = i13 + 1;
        if (i14 >= c2) {
        }
        if (this.f10324d != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f10321a;
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        } else {
            sb2.append("//");
        }
        if (this.f10322b.length() > 0 || this.f10323c.length() > 0) {
            sb2.append(this.f10322b);
            if (this.f10323c.length() > 0) {
                sb2.append(':');
                sb2.append(this.f10323c);
            }
            sb2.append('@');
        }
        String str2 = this.f10324d;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            if (StringsKt.B(str2, ':')) {
                sb2.append('[');
                sb2.append(this.f10324d);
                sb2.append(']');
            } else {
                sb2.append(this.f10324d);
            }
        }
        int i5 = -1;
        if (this.f10325e != -1 || this.f10321a != null) {
            int b10 = b();
            String scheme = this.f10321a;
            if (scheme != null) {
                Intrinsics.checkNotNull(scheme);
                Intrinsics.checkNotNullParameter(scheme, "scheme");
                if (Intrinsics.areEqual(scheme, "http")) {
                    i5 = 80;
                } else if (Intrinsics.areEqual(scheme, "https")) {
                    i5 = 443;
                }
            }
            sb2.append(':');
            sb2.append(b10);
        }
        ArrayList arrayList = this.f10326f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append((String) arrayList.get(i10));
        }
        if (this.f10327g != null) {
            sb2.append('?');
            ArrayList arrayList2 = this.f10327g;
            Intrinsics.checkNotNull(arrayList2);
            kotlin.ranges.a c2 = zf.j.c(zf.j.d(0, arrayList2.size()), 2);
            int i11 = c2.f19234a;
            int i12 = c2.f19235b;
            int i13 = c2.f19236c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (true) {
                    String str3 = (String) arrayList2.get(i11);
                    String str4 = (String) arrayList2.get(i11 + 1);
                    if (i11 > 0) {
                        sb2.append('&');
                    }
                    sb2.append(str3);
                    if (str4 != null) {
                        sb2.append('=');
                        sb2.append(str4);
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11 += i13;
                }
            }
        }
        if (this.f10328h != null) {
            sb2.append('#');
            sb2.append(this.f10328h);
        }
        return sb2.toString();
    }
}
