package org.jsoup.parser;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: org.jsoup.parser.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8817f implements AutoCloseable {

    /* renamed from: n, reason: collision with root package name */
    private static final Of.e<String[]> f79478n = new Of.e<>(new C8812a());

    /* renamed from: o, reason: collision with root package name */
    private static final Of.e<char[]> f79479o = new Of.e<>(new C8813b());

    /* renamed from: a, reason: collision with root package name */
    private String[] f79480a;

    /* renamed from: b, reason: collision with root package name */
    private StringReader f79481b;

    /* renamed from: c, reason: collision with root package name */
    private char[] f79482c;

    /* renamed from: d, reason: collision with root package name */
    private int f79483d;

    /* renamed from: e, reason: collision with root package name */
    private int f79484e;

    /* renamed from: f, reason: collision with root package name */
    private int f79485f;

    /* renamed from: g, reason: collision with root package name */
    private int f79486g;

    /* renamed from: h, reason: collision with root package name */
    private int f79487h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f79488i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<Integer> f79489j;

    /* renamed from: k, reason: collision with root package name */
    private int f79490k;

    /* renamed from: l, reason: collision with root package name */
    private String f79491l;

    /* renamed from: m, reason: collision with root package name */
    private int f79492m;

    @FunctionalInterface
    /* renamed from: org.jsoup.parser.f$a */
    interface a {
        boolean a(char c11);
    }

    public C8817f(StringReader stringReader) {
        this.f79485f = 0;
        this.f79487h = -1;
        this.f79489j = null;
        this.f79490k = 1;
        this.f79481b = stringReader;
        this.f79482c = f79479o.a();
        this.f79480a = f79478n.a();
        d();
    }

    private void L0() {
        ArrayList<Integer> arrayList = this.f79489j;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int Q11 = Q(this.f79486g);
                if (Q11 == -1) {
                    Q11 = 0;
                }
                Integer num = this.f79489j.get(Q11);
                num.getClass();
                this.f79490k += Q11;
                this.f79489j.clear();
                this.f79489j.add(num);
            }
            for (int i11 = this.f79483d; i11 < this.f79484e; i11++) {
                if (this.f79482c[i11] == '\n') {
                    this.f79489j.add(Integer.valueOf(this.f79486g + 1 + i11));
                }
            }
        }
    }

    private int Q(int i11) {
        ArrayList<Integer> arrayList = this.f79489j;
        if (arrayList == null) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i11));
        return binarySearch < -1 ? Math.abs(binarySearch) - 2 : binarySearch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r5.f79488i = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d() {
        int i11;
        if (this.f79488i || (i11 = this.f79483d) < this.f79485f || this.f79487h != -1) {
            return;
        }
        this.f79486g += i11;
        int i12 = this.f79484e - i11;
        this.f79484e = i12;
        if (i12 > 0) {
            char[] cArr = this.f79482c;
            System.arraycopy(cArr, i11, cArr, 0, i12);
        }
        this.f79483d = 0;
        while (true) {
            int i13 = this.f79484e;
            if (i13 >= 2048) {
                break;
            }
            try {
                StringReader stringReader = this.f79481b;
                char[] cArr2 = this.f79482c;
                int read = stringReader.read(cArr2, i13, cArr2.length - i13);
                if (read == -1) {
                    break;
                } else {
                    this.f79484e += read;
                }
            } catch (IOException e11) {
                throw new UncheckedIOException(e11);
            }
        }
        this.f79485f = Math.min(this.f79484e, UserVerificationMethods.USER_VERIFY_ALL);
        L0();
        this.f79491l = null;
    }

    private static String j(char[] cArr, String[] strArr, int i11, int i12) {
        if (i12 > 12) {
            return new String(cArr, i11, i12);
        }
        if (i12 < 1) {
            return "";
        }
        int i13 = i12 + i11;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = i11; i16 < i13; i16++) {
            i15 = (i15 * 31) + cArr[i16];
        }
        int i17 = i15 & 511;
        String str = strArr[i17];
        if (str != null && i12 == str.length()) {
            int i18 = i11;
            int i19 = i12;
            while (true) {
                int i21 = i19 - 1;
                if (i19 == 0) {
                    return str;
                }
                int i22 = i18 + 1;
                int i23 = i14 + 1;
                if (cArr[i18] != str.charAt(i14)) {
                    break;
                }
                i18 = i22;
                i19 = i21;
                i14 = i23;
            }
        }
        String str2 = new String(cArr, i11, i12);
        strArr[i17] = str2;
        return str2;
    }

    final String B() {
        d();
        char[] cArr = this.f79482c;
        String[] strArr = this.f79480a;
        int i11 = this.f79483d;
        String j11 = j(cArr, strArr, i11, this.f79484e - i11);
        this.f79483d = this.f79484e;
        return j11;
    }

    public final int D0() {
        return this.f79486g + this.f79483d;
    }

    final String E0() {
        return R(D0()) + ProductContainerDTO.RATIO_DELIMITER + k(D0());
    }

    final boolean H0() {
        return this.f79488i;
    }

    final boolean I(String str) {
        if (str.equals(this.f79491l)) {
            int i11 = this.f79492m;
            if (i11 == -1) {
                return false;
            }
            if (i11 >= this.f79483d) {
                return true;
            }
        }
        this.f79491l = str;
        Locale locale = Locale.ENGLISH;
        int u02 = u0(str.toLowerCase(locale));
        if (u02 > -1) {
            this.f79492m = this.f79483d + u02;
            return true;
        }
        int u03 = u0(str.toUpperCase(locale));
        boolean z11 = u03 > -1;
        this.f79492m = z11 ? this.f79483d + u03 : -1;
        return z11;
    }

    final void K0() {
        int i11 = this.f79487h;
        if (i11 == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.f79483d = i11;
        this.f79487h = -1;
    }

    public final char L() {
        d();
        int i11 = this.f79483d;
        if (i11 >= this.f79484e) {
            return (char) 65535;
        }
        return this.f79482c[i11];
    }

    public final void M0(boolean z11) {
        if (z11 && this.f79489j == null) {
            this.f79489j = new ArrayList<>(25);
            L0();
        } else {
            if (z11) {
                return;
            }
            this.f79489j = null;
        }
    }

    public final boolean O() {
        d();
        return this.f79483d >= this.f79484e;
    }

    final int R(int i11) {
        if (!(this.f79489j != null)) {
            return 1;
        }
        int Q11 = Q(i11);
        return Q11 == -1 ? this.f79490k : Q11 + this.f79490k + 1;
    }

    final void T0() {
        int i11 = this.f79483d;
        if (i11 < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f79483d = i11 - 1;
    }

    final void V0() {
        this.f79487h = -1;
    }

    final void W() {
        if (this.f79484e - this.f79483d < 1024) {
            this.f79485f = 0;
        }
        d();
        this.f79487h = this.f79483d;
    }

    final boolean X(String str) {
        d();
        d();
        int length = str.length();
        if (length <= this.f79484e - this.f79483d) {
            for (int i11 = 0; i11 < length; i11++) {
                if (str.charAt(i11) == this.f79482c[this.f79483d + i11]) {
                }
            }
            this.f79483d = str.length() + this.f79483d;
            return true;
        }
        return false;
    }

    final boolean Z(String str) {
        if (!s0(str)) {
            return false;
        }
        this.f79483d = str.length() + this.f79483d;
        return true;
    }

    final boolean b0(char c11) {
        return !O() && this.f79482c[this.f79483d] == c11;
    }

    public final void c() {
        this.f79483d++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public final void close() {
        Of.e<String[]> eVar = f79478n;
        Of.e<char[]> eVar2 = f79479o;
        StringReader stringReader = this.f79481b;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
        } catch (IOException unused) {
        } finally {
            this.f79481b = null;
            Arrays.fill(this.f79482c, (char) 0);
            eVar2.b(this.f79482c);
            this.f79482c = null;
            eVar.b(this.f79480a);
            this.f79480a = null;
        }
    }

    final boolean d0(char... cArr) {
        if (!O()) {
            d();
            char c11 = this.f79482c[this.f79483d];
            for (char c12 : cArr) {
                if (c12 == c11) {
                    return true;
                }
            }
        }
        return false;
    }

    final int k(int i11) {
        int Q11;
        if ((this.f79489j != null) && (Q11 = Q(i11)) != -1) {
            return (i11 - this.f79489j.get(Q11).intValue()) + 1;
        }
        return i11 + 1;
    }

    final boolean l0(char[] cArr) {
        d();
        return !O() && Arrays.binarySearch(cArr, this.f79482c[this.f79483d]) >= 0;
    }

    public final char m() {
        d();
        int i11 = this.f79483d;
        char c11 = i11 >= this.f79484e ? (char) 65535 : this.f79482c[i11];
        this.f79483d = i11 + 1;
        return c11;
    }

    final String o() {
        d();
        int i11 = this.f79483d;
        int i12 = this.f79484e;
        char[] cArr = this.f79482c;
        int i13 = i11;
        while (i13 < i12) {
            char c11 = cArr[i13];
            if (!((c11 == '&' || c11 == '<' || c11 == 0) ? false : true)) {
                break;
            }
            i13++;
        }
        this.f79483d = i13;
        return i13 > i11 ? j(this.f79482c, this.f79480a, i11, i13 - i11) : "";
    }

    final boolean o0() {
        if (O()) {
            return false;
        }
        return Of.k.e(this.f79482c[this.f79483d]);
    }

    final String p() {
        d();
        int i11 = this.f79483d;
        int i12 = this.f79484e;
        char[] cArr = this.f79482c;
        int i13 = i11;
        while (i13 < i12) {
            char c11 = cArr[i13];
            if (!(c11 >= '0' && c11 <= '9')) {
                break;
            }
            i13++;
        }
        this.f79483d = i13;
        return i13 > i11 ? j(this.f79482c, this.f79480a, i11, i13 - i11) : "";
    }

    final String q() {
        d();
        int i11 = this.f79483d;
        int i12 = this.f79484e;
        char[] cArr = this.f79482c;
        int i13 = i11;
        while (i13 < i12 && Of.k.h(cArr[i13])) {
            i13++;
        }
        this.f79483d = i13;
        return i13 > i11 ? j(this.f79482c, this.f79480a, i11, i13 - i11) : "";
    }

    final String r() {
        d();
        int i11 = this.f79483d;
        int i12 = this.f79484e;
        char[] cArr = this.f79482c;
        int i13 = i11;
        while (i13 < i12 && Character.isLetter(cArr[i13])) {
            i13++;
        }
        this.f79483d = i13;
        return i13 > i11 ? j(this.f79482c, this.f79480a, i11, i13 - i11) : "";
    }

    final boolean r0() {
        if (O()) {
            return false;
        }
        return Of.k.g(this.f79482c[this.f79483d]);
    }

    final String s() {
        d();
        int i11 = this.f79483d;
        while (true) {
            int i12 = this.f79483d;
            if (i12 >= this.f79484e || !Of.k.e(this.f79482c[i12])) {
                break;
            }
            this.f79483d++;
        }
        while (true) {
            int i13 = this.f79483d;
            if (i13 < this.f79484e && Of.k.g(this.f79482c[i13])) {
                this.f79483d++;
            }
        }
        return j(this.f79482c, this.f79480a, i11, this.f79483d - i11);
    }

    final boolean s0(String str) {
        d();
        int length = str.length();
        if (length > this.f79484e - this.f79483d) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            char c11 = this.f79482c[this.f79483d + i11];
            if (charAt != c11 && Character.toUpperCase(charAt) != Character.toUpperCase(c11)) {
                return false;
            }
        }
        return true;
    }

    final String t(a aVar, int i11) {
        d();
        int i12 = this.f79483d;
        int i13 = this.f79484e;
        char[] cArr = this.f79482c;
        int i14 = i12;
        while (i14 < i13 && ((i11 == -1 || i14 - i12 < i11) && aVar.a(cArr[i14]))) {
            i14++;
        }
        this.f79483d = i14;
        return i14 > i12 ? j(this.f79482c, this.f79480a, i12, i14 - i12) : "";
    }

    public final String toString() {
        int i11 = this.f79484e;
        int i12 = this.f79483d;
        return i11 - i12 < 0 ? "" : new String(this.f79482c, i12, i11 - i12);
    }

    final int u0(String str) {
        d();
        char charAt = str.charAt(0);
        int i11 = this.f79483d;
        while (i11 < this.f79484e) {
            if (charAt != this.f79482c[i11]) {
                do {
                    i11++;
                    if (i11 >= this.f79484e) {
                        break;
                    }
                } while (charAt != this.f79482c[i11]);
            }
            int i12 = i11 + 1;
            int length = (str.length() + i12) - 1;
            int i13 = this.f79484e;
            if (i11 < i13 && length <= i13) {
                int i14 = i12;
                for (int i15 = 1; i14 < length && str.charAt(i15) == this.f79482c[i14]; i15++) {
                    i14++;
                }
                if (i14 == length) {
                    return i11 - this.f79483d;
                }
            }
            i11 = i12;
        }
        return -1;
    }

    final String v() {
        d();
        int i11 = this.f79483d;
        int i12 = this.f79484e;
        char[] cArr = this.f79482c;
        int i13 = i11;
        while (i13 < i12) {
            char c11 = cArr[i13];
            if (!((c11 == '<' || c11 == 0) ? false : true)) {
                break;
            }
            i13++;
        }
        this.f79483d = i13;
        return i13 > i11 ? j(this.f79482c, this.f79480a, i11, i13 - i11) : "";
    }

    public final String w() {
        int u02 = u0("]]>");
        if (u02 != -1) {
            String j11 = j(this.f79482c, this.f79480a, this.f79483d, u02);
            this.f79483d += u02;
            return j11;
        }
        int i11 = this.f79484e;
        int i12 = this.f79483d;
        if (i11 - i12 < 3) {
            return B();
        }
        int i13 = i11 - 2;
        String j12 = j(this.f79482c, this.f79480a, i12, i13 - i12);
        this.f79483d = i13;
        return j12;
    }

    public final String x(char c11) {
        int i11;
        d();
        int i12 = this.f79483d;
        while (true) {
            if (i12 >= this.f79484e) {
                i11 = -1;
                break;
            }
            if (c11 == this.f79482c[i12]) {
                i11 = i12 - this.f79483d;
                break;
            }
            i12++;
        }
        if (i11 == -1) {
            return B();
        }
        String j11 = j(this.f79482c, this.f79480a, this.f79483d, i11);
        this.f79483d += i11;
        return j11;
    }

    public final String y(final char... cArr) {
        return t(new a() { // from class: org.jsoup.parser.c
            @Override // org.jsoup.parser.C8817f.a
            public final boolean a(char c11) {
                for (char c12 : cArr) {
                    if (c11 == c12) {
                        return false;
                    }
                }
                return true;
            }
        }, -1);
    }

    final String z(char... cArr) {
        d();
        int i11 = this.f79483d;
        int i12 = this.f79484e;
        char[] cArr2 = this.f79482c;
        int i13 = i11;
        while (i13 < i12) {
            if (!(Arrays.binarySearch(cArr, cArr2[i13]) < 0)) {
                break;
            }
            i13++;
        }
        this.f79483d = i13;
        return i13 > i11 ? j(this.f79482c, this.f79480a, i11, i13 - i11) : "";
    }

    public C8817f(String str) {
        this(new StringReader(str));
    }
}
