package fi;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: fi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4285a {

    /* renamed from: a, reason: collision with root package name */
    public int f46745a;

    /* renamed from: c, reason: collision with root package name */
    public String f46747c;

    /* renamed from: b, reason: collision with root package name */
    public final F f46746b = new F();

    /* renamed from: d, reason: collision with root package name */
    public StringBuilder f46748d = new StringBuilder();

    public static /* synthetic */ boolean O(AbstractC4285a abstractC4285a, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractC4285a.N(z10);
    }

    public static final double o(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Void z(AbstractC4285a abstractC4285a, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractC4285a.f46745a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return abstractC4285a.y(str, i10, str2);
    }

    public final void A(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) K(0, this.f46745a), key, 0, false, 6, (Object) null);
        throw new C4308y("Encountered an unknown key '" + key + "' at offset " + lastIndexOf$default + " at path: " + this.f46746b.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) C.i(C(), lastIndexOf$default)));
    }

    public final int B(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        z(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract CharSequence C();

    public final boolean D(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public abstract String E(String str, boolean z10);

    public byte F() {
        CharSequence C10 = C();
        int i10 = this.f46745a;
        while (true) {
            int H10 = H(i10);
            if (H10 == -1) {
                this.f46745a = H10;
                return (byte) 10;
            }
            char charAt = C10.charAt(H10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.f46745a = H10;
                return AbstractC4286b.a(charAt);
            }
            i10 = H10 + 1;
        }
    }

    public final String G(boolean z10) {
        String q10;
        byte F10 = F();
        if (z10) {
            if (F10 != 1 && F10 != 0) {
                return null;
            }
            q10 = s();
        } else {
            if (F10 != 1) {
                return null;
            }
            q10 = q();
        }
        this.f46747c = q10;
        return q10;
    }

    public abstract int H(int i10);

    public final void I(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte F10 = F();
        if (F10 != 8 && F10 != 6) {
            s();
            return;
        }
        while (true) {
            byte F11 = F();
            if (F11 != 1) {
                if (F11 == 8 || F11 == 6) {
                    arrayList.add(Byte.valueOf(F11));
                } else if (F11 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw C.f(this.f46745a, "found ] instead of } at path: " + this.f46746b, C());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (F11 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw C.f(this.f46745a, "found } instead of ] at path: " + this.f46746b, C());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (F11 == 10) {
                    z(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                k();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                s();
            } else {
                j();
            }
        }
    }

    public abstract int J();

    public String K(int i10, int i11) {
        return C().subSequence(i10, i11).toString();
    }

    public final String L() {
        String str = this.f46747c;
        Intrinsics.checkNotNull(str);
        this.f46747c = null;
        return str;
    }

    public final boolean M() {
        int J10 = J();
        CharSequence C10 = C();
        if (J10 >= C10.length() || J10 == -1 || C10.charAt(J10) != ',') {
            return false;
        }
        this.f46745a++;
        return true;
    }

    public final boolean N(boolean z10) {
        int H10 = H(J());
        int length = C().length() - H10;
        if (length < 4 || H10 == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != C().charAt(H10 + i10)) {
                return false;
            }
        }
        if (length > 4 && AbstractC4286b.a(C().charAt(H10 + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f46745a = H10 + 4;
        return true;
    }

    public final void P(char c10) {
        int i10 = this.f46745a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f46745a = i10 - 1;
                String s10 = s();
                this.f46745a = i10;
                if (Intrinsics.areEqual(s10, "null")) {
                    y("Expected string literal but 'null' literal was found", this.f46745a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.f46745a = i10;
                throw th2;
            }
        }
        String c11 = AbstractC4286b.c(AbstractC4286b.a(c10));
        int i11 = this.f46745a;
        int i12 = i11 - 1;
        z(this, "Expected " + c11 + ", but had '" + ((i11 == C().length() || i12 < 0) ? "EOF" : String.valueOf(C().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final boolean Q() {
        return C().charAt(this.f46745a - 1) != '\"';
    }

    public final int b(int i10) {
        int H10 = H(i10);
        if (H10 == -1) {
            z(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = H10 + 1;
        char charAt = C().charAt(H10);
        if (charAt == 'u') {
            return d(C(), i11);
        }
        char b10 = AbstractC4286b.b(charAt);
        if (b10 != 0) {
            this.f46748d.append(b10);
            return i11;
        }
        z(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    public final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f46748d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f46745a = i10;
        w();
        if (this.f46745a + 4 < charSequence.length()) {
            return d(charSequence, this.f46745a);
        }
        z(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void e(int i10, int i11) {
        this.f46748d.append(C(), i10, i11);
    }

    public abstract boolean f();

    public final boolean g(int i10) {
        int H10 = H(i10);
        if (H10 >= C().length() || H10 == -1) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = H10 + 1;
        int charAt = C().charAt(H10) | ' ';
        if (charAt == 102) {
            i("alse", i11);
            return false;
        }
        if (charAt == 116) {
            i("rue", i11);
            return true;
        }
        z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean h() {
        boolean z10;
        int J10 = J();
        if (J10 == C().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (C().charAt(J10) == '\"') {
            J10++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean g10 = g(J10);
        if (!z10) {
            return g10;
        }
        if (this.f46745a == C().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (C().charAt(this.f46745a) == '\"') {
            this.f46745a++;
            return g10;
        }
        z(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void i(String str, int i10) {
        if (C().length() - i10 < str.length()) {
            z(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (C().charAt(i10 + i11) | ' ')) {
                z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.f46745a = i10 + str.length();
    }

    public abstract String j();

    public abstract byte k();

    public final byte l(byte b10) {
        byte k10 = k();
        if (k10 == b10) {
            return k10;
        }
        String c10 = AbstractC4286b.c(b10);
        int i10 = this.f46745a;
        int i11 = i10 - 1;
        z(this, "Expected " + c10 + ", but had '" + ((i10 == C().length() || i11 < 0) ? "EOF" : String.valueOf(C().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public abstract void m(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        z(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013f, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        if (r1 == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0146, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        if (r1 == (r2 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014c, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014e, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0158, code lost:
    
        if (C().charAt(r2) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
    
        z(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        z(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0180, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
    
        r18.f46745a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (r8 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
    
        r1 = r10 * o(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
    
        z(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c3, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c4, code lost:
    
        z(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d5, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dc, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01df, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e0, code lost:
    
        z(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f0, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f1, code lost:
    
        z(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0201, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0143, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n() {
        boolean z10;
        int H10 = H(J());
        if (H10 < C().length() && H10 != -1) {
            if (C().charAt(H10) == '\"') {
                H10++;
                if (H10 == C().length()) {
                    z(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = H10;
            boolean z11 = false;
            boolean z12 = false;
            long j10 = 0;
            long j11 = 0;
            loop0: while (true) {
                boolean z13 = false;
                while (i10 != C().length()) {
                    char charAt = C().charAt(i10);
                    if ((charAt == 'e' || charAt == 'E') && !z11) {
                        if (i10 == H10) {
                            z(this, "Unexpected symbol " + charAt + " in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i10++;
                        z11 = true;
                    } else if (charAt == '-' && z11) {
                        if (i10 == H10) {
                            z(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i10++;
                    } else if (charAt != '+' || !z11) {
                        if (charAt != '-') {
                            if (AbstractC4286b.a(charAt) != 0) {
                                break loop0;
                            }
                            i10++;
                            int i11 = charAt - '0';
                            if (i11 < 0 || i11 >= 10) {
                                break loop0;
                            }
                            if (z11) {
                                j11 = (j11 * 10) + i11;
                            } else {
                                j10 = (j10 * 10) - i11;
                                if (j10 > 0) {
                                    z(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i10 != H10) {
                                z(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i10++;
                            z12 = true;
                        }
                    } else {
                        if (i10 == H10) {
                            z(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i10++;
                    }
                    z13 = true;
                }
                break loop0;
            }
        } else {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    public final long p() {
        long n10 = n();
        if (k() == 10) {
            return n10;
        }
        AbstractC4286b.c((byte) 10);
        int i10 = this.f46745a;
        int i11 = i10 - 1;
        z(this, "Expected input to contain a single valid number, but got '" + ((i10 == C().length() || i11 < 0) ? "EOF" : String.valueOf(C().charAt(i11))) + "' after it", i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final String q() {
        return this.f46747c != null ? L() : j();
    }

    public final String r(CharSequence source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        char charAt = source.charAt(i11);
        boolean z10 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                int H10 = H(c(i10, i11));
                if (H10 == -1) {
                    z(this, "Unexpected EOF", H10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z10 = true;
                i10 = H10;
                i11 = i10;
            } else {
                i11++;
                if (i11 >= source.length()) {
                    e(i10, i11);
                    int H11 = H(i11);
                    if (H11 == -1) {
                        z(this, "Unexpected EOF", H11, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    i10 = H11;
                    i11 = i10;
                    z10 = true;
                } else {
                    continue;
                }
            }
            charAt = source.charAt(i11);
        }
        String K10 = !z10 ? K(i10, i11) : u(i10, i11);
        this.f46745a = i11 + 1;
        return K10;
    }

    public final String s() {
        if (this.f46747c != null) {
            return L();
        }
        int J10 = J();
        if (J10 >= C().length() || J10 == -1) {
            z(this, "EOF", J10, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte a10 = AbstractC4286b.a(C().charAt(J10));
        if (a10 == 1) {
            return q();
        }
        if (a10 != 0) {
            z(this, "Expected beginning of the string, but got " + C().charAt(J10), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        while (AbstractC4286b.a(C().charAt(J10)) == 0) {
            J10++;
            if (J10 >= C().length()) {
                e(this.f46745a, J10);
                int H10 = H(J10);
                if (H10 == -1) {
                    this.f46745a = J10;
                    return u(0, 0);
                }
                J10 = H10;
                z10 = true;
            }
        }
        String K10 = !z10 ? K(this.f46745a, J10) : u(this.f46745a, J10);
        this.f46745a = J10;
        return K10;
    }

    public final String t() {
        String s10 = s();
        if (!Intrinsics.areEqual(s10, "null") || !Q()) {
            return s10;
        }
        z(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.f46745a + ')';
    }

    public final String u(int i10, int i11) {
        e(i10, i11);
        String sb2 = this.f46748d.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        this.f46748d.setLength(0);
        return sb2;
    }

    public final void v() {
        this.f46747c = null;
    }

    public final void x() {
        if (k() == 10) {
            return;
        }
        z(this, "Expected EOF after parsing, but had " + C().charAt(this.f46745a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void y(String message, int i10, String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw C.f(i10, message + " at path: " + this.f46746b.a() + str, C());
    }

    public void w() {
    }
}
