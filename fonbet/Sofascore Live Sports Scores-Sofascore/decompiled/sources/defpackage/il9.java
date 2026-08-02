package defpackage;

import android.util.StateSet;
import com.ironsource.C4427z5;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class il9 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public il9(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.d = "";
                this.e = "";
                this.b = -1;
                this.h = b.l("");
                break;
        }
    }

    public static ArrayList j(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int O = StringsKt.O(str, '&', i, 4);
            if (O == -1) {
                O = str.length();
            }
            int O2 = StringsKt.O(str, C4427z5.U, i, 4);
            if (O2 == -1 || O2 > O) {
                arrayList.add(str.substring(i, O));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, O2));
                arrayList.add(str.substring(O2 + 1, O));
            }
            i = O + 1;
        }
        return arrayList;
    }

    public void a(String str, String str2) {
        str.getClass();
        ArrayList arrayList = (ArrayList) this.i;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.i = arrayList;
        }
        arrayList.add(rz8.w(0, 0, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = (ArrayList) this.i;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? rz8.w(0, 0, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, xah[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void b(int[] iArr, xah xahVar) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = xahVar;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new xah[i2];
            System.arraycopy((xah[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i3 = this.b;
        iArr3[i3] = iArr;
        ((xah[]) this.e)[i3] = xahVar;
        this.b = i3 + 1;
    }

    public jl9 c() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            a70.r("scheme == null");
            return null;
        }
        String R = rz8.R(0, 0, 7, (String) this.d);
        String R2 = rz8.R(0, 0, 7, (String) this.e);
        String str2 = (String) this.f;
        if (str2 == null) {
            a70.r("host == null");
            return null;
        }
        int e = e();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(rz8.R(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? rz8.R(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new jl9(str, R, R2, str2, e, arrayList3, arrayList, str4 != null ? rz8.R(0, 0, 7, str4) : null, toString());
    }

    public jdi d() {
        if (this.b == 0) {
            return null;
        }
        return new jdi(this);
    }

    public int e() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        str.getClass();
        str.getClass();
        if (Intrinsics.c(str, "http")) {
            return 80;
        }
        return Intrinsics.c(str, HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public void f(String str) {
        str.getClass();
        String b = uol.b(rz8.R(0, 0, 7, str));
        if (b != null) {
            this.f = b;
        } else {
            a70.p("unexpected host: ".concat(str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, xah[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void g() {
        this.c = new xah();
        this.d = new int[10][];
        this.e = new xah[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01e6, code lost:
    
        if (r8 < 65536) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0079, code lost:
    
        if (r14 == ':') goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(jl9 jl9Var, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int e;
        char charAt;
        int i5;
        int i6;
        int i7;
        char charAt2;
        ArrayList arrayList = (ArrayList) this.h;
        str.getClass();
        byte[] bArr = wol.a;
        int i8 = wol.i(0, str.length(), str);
        int j = wol.j(i8, str.length(), str);
        char c = 65535;
        if (j - i8 >= 2) {
            char charAt3 = str.charAt(i8);
            char c2 = 'a';
            if ((Intrinsics.d(charAt3, 97) >= 0 && Intrinsics.d(charAt3, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) <= 0) || (Intrinsics.d(charAt3, 65) >= 0 && Intrinsics.d(charAt3, 90) <= 0)) {
                i = i8 + 1;
                while (true) {
                    if (i >= j) {
                        break;
                    }
                    char charAt4 = str.charAt(i);
                    if ((c2 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i++;
                        c2 = 'a';
                    }
                }
                if (i != -1) {
                    if (jl9Var == null) {
                        a70.p("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? iii.H(6, str).concat("...") : str));
                        return;
                    }
                    this.c = jl9Var.a;
                } else if (c.u(i8, str, "https:", true)) {
                    this.c = HttpRequest.DEFAULT_SCHEME;
                    i8 += 6;
                } else if (!c.u(i8, str, "http:", true)) {
                    is8.a(39, str.substring(0, i), "Expected URL scheme 'http' or 'https' but was '");
                    return;
                } else {
                    this.c = "http";
                    i8 += 5;
                }
                i3 = 0;
                for (i2 = i8; i2 < j && ((charAt2 = str.charAt(i2)) == '/' || charAt2 == '\\'); i2++) {
                    i3++;
                }
                char c3 = '#';
                if (i3 < 2 || jl9Var == null || !Intrinsics.c(jl9Var.a, (String) this.c)) {
                    i4 = i8 + i3;
                    boolean z = false;
                    boolean z2 = false;
                    while (true) {
                        e = wol.e(i4, j, str, "@/\\?#");
                        charAt = e == j ? str.charAt(e) : c;
                        if (charAt != c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == '?') {
                            break;
                        }
                        if (charAt == '@') {
                            if (z) {
                                this.e = ((String) this.e) + "%40" + rz8.w(i4, e, str, " \"':;<=>@[]^`{}|/\\?#", 112);
                            } else {
                                int f = wol.f(str, i4, e, ':');
                                String w = rz8.w(i4, f, str, " \"':;<=>@[]^`{}|/\\?#", 112);
                                if (z2) {
                                    w = mz1.o(new StringBuilder((String) this.d), "%40", w);
                                }
                                this.d = w;
                                if (f != e) {
                                    this.e = rz8.w(f + 1, e, str, " \"':;<=>@[]^`{}|/\\?#", 112);
                                    z = true;
                                }
                                z2 = true;
                            }
                            i4 = e + 1;
                            c = 65535;
                            c3 = '#';
                        }
                    }
                    i5 = i4;
                    while (true) {
                        if (i5 >= e) {
                            i5 = e;
                            break;
                        }
                        char charAt5 = str.charAt(i5);
                        if (charAt5 == ':') {
                            break;
                        }
                        if (charAt5 == '[') {
                            do {
                                i5++;
                                if (i5 < e) {
                                }
                            } while (str.charAt(i5) != ']');
                        }
                        i5++;
                    }
                    i6 = i5 + 1;
                    if (i6 >= e) {
                        this.f = uol.b(rz8.R(i4, i5, 4, str));
                        try {
                            i7 = Integer.parseInt(rz8.w(i6, e, str, "", 120));
                            if (1 <= i7) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i7 = -1;
                        this.b = i7;
                        if (i7 == -1) {
                            is8.i(34, str.substring(i6, e), "Invalid URL port: \"");
                            return;
                        }
                    } else {
                        this.f = uol.b(rz8.R(i4, i5, 4, str));
                        String str2 = (String) this.c;
                        str2.getClass();
                        this.b = str2.equals("http") ? 80 : str2.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
                    }
                    if (((String) this.f) != null) {
                        is8.i(34, str.substring(i4, i5), "Invalid URL host: \"");
                        return;
                    }
                    i8 = e;
                } else {
                    this.d = jl9Var.e();
                    this.e = jl9Var.a();
                    this.f = jl9Var.d;
                    this.b = jl9Var.e;
                    arrayList.clear();
                    arrayList.addAll(jl9Var.c());
                    if (i8 == j || str.charAt(i8) == '#') {
                        String d = jl9Var.d();
                        this.i = d != null ? j(rz8.w(0, 0, d, " \"'<>#", 83)) : null;
                    }
                }
                int e2 = wol.e(i8, j, str, "?#");
                if (i8 != e2) {
                    char charAt6 = str.charAt(i8);
                    if (charAt6 == '/' || charAt6 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        i8++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (i8 < e2) {
                        int e3 = wol.e(i8, e2, str, "/\\");
                        boolean z3 = e3 < e2;
                        String w2 = rz8.w(i8, e3, str, " \"<>^`{}|/\\?#", 112);
                        if (!w2.equals(".") && !w2.equalsIgnoreCase("%2e")) {
                            if (!w2.equals("..") && !w2.equalsIgnoreCase("%2e.") && !w2.equalsIgnoreCase(".%2e") && !w2.equalsIgnoreCase("%2e%2e")) {
                                if (((CharSequence) mz1.h(arrayList, 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, w2);
                                } else {
                                    arrayList.add(w2);
                                }
                                if (z3) {
                                    arrayList.add("");
                                }
                            } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                arrayList.add("");
                            } else {
                                arrayList.set(arrayList.size() - 1, "");
                            }
                        }
                        i8 = z3 ? e3 + 1 : e3;
                    }
                }
                if (e2 < j && str.charAt(e2) == '?') {
                    int f2 = wol.f(str, e2, j, '#');
                    this.i = j(rz8.w(e2 + 1, f2, str, " \"'<>#", 80));
                    e2 = f2;
                }
                if (e2 >= j || str.charAt(e2) != '#') {
                    return;
                }
                this.g = rz8.w(e2 + 1, j, str, "", 48);
                return;
            }
        }
        i = -1;
        if (i != -1) {
        }
        i3 = 0;
        while (i2 < j) {
            i3++;
        }
        char c32 = '#';
        if (i3 < 2) {
        }
        i4 = i8 + i3;
        boolean z4 = false;
        boolean z22 = false;
        while (true) {
            e = wol.e(i4, j, str, "@/\\?#");
            if (e == j) {
            }
            if (charAt != c) {
                break;
            } else {
                break;
            }
        }
        i5 = i4;
        while (true) {
            if (i5 >= e) {
            }
            i5++;
        }
        i6 = i5 + 1;
        if (i6 >= e) {
        }
        if (((String) this.f) != null) {
        }
    }

    public void i(String str) {
        str.getClass();
        if (str.equalsIgnoreCase("http")) {
            this.c = "http";
        } else if (str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
            this.c = HttpRequest.DEFAULT_SCHEME;
        } else {
            a70.p("unexpected scheme: ".concat(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.c;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.d).length() > 0 || ((String) this.e).length() > 0) {
                    sb.append((String) this.d);
                    if (((String) this.e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f;
                if (str2 != null) {
                    if (StringsKt.K(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.c) != null) {
                    int e = e();
                    String str3 = (String) this.c;
                    if (str3 != null) {
                        if (str3.equals("http")) {
                            i = 80;
                            break;
                        } else if (str3.equals(HttpRequest.DEFAULT_SCHEME)) {
                            i = 443;
                            break;
                        }
                    }
                    sb.append(':');
                    sb.append(e);
                }
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    arrayList2.getClass();
                    l98.k0(arrayList2, sb);
                }
                if (((String) this.g) != null) {
                    sb.append('#');
                    sb.append((String) this.g);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public il9(xah xahVar) {
        this.a = 1;
        g();
        b(StateSet.WILD_CARD, xahVar);
    }
}
