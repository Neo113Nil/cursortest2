package defpackage;

import com.ironsource.C4427z5;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pga {
    public static final boolean[] j = new boolean[128];
    public final StringBuilder a = new StringBuilder(64);
    public final char[] b;
    public final boolean c;
    public final int d;
    public int e;
    public int f;
    public char g;
    public char h;
    public char i;

    static {
        char[] cArr = {',', ':', ']', '}', '/', '\\', '\"', '[', '{', ';', C4427z5.U, '#'};
        for (int i = 0; i < 12; i++) {
            j[cArr[i]] = true;
        }
    }

    public pga(char[] cArr, int i, int... iArr) {
        this.c = iArr.length > 0;
        if (cArr == null) {
            this.b = new char[0];
            this.d = 0;
        } else {
            this.b = cArr;
            this.d = cArr.length;
        }
        this.e = i;
        if (i < 0) {
            a70.p("Invalid start index.");
            throw null;
        }
        this.f = -1;
        this.g = (char) 0;
        this.h = (char) 0;
        this.i = (char) 0;
    }

    public final char a() {
        char c;
        this.g = this.h;
        int i = this.e;
        if (i == this.d) {
            this.h = (char) 0;
            c = 0;
        } else {
            this.e = i + 1;
            c = this.b[i];
            this.h = c;
        }
        this.i = (char) 0;
        this.f = -1;
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00c4, code lost:
    
        throw new defpackage.mga("Unterminated string.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        int i;
        StringBuilder sb = this.a;
        sb.setLength(0);
        loop0: while (true) {
            char a = a();
            if (a == 0 || a == '\n' || a == '\r') {
                break;
            }
            if (a == '\\') {
                char a2 = a();
                if (a2 == '\"' || a2 == '\'' || a2 == '/' || a2 == '\\') {
                    sb.append(a2);
                } else if (a2 == 'b') {
                    sb.append('\b');
                } else if (a2 == 'f') {
                    sb.append('\f');
                } else if (a2 == 'n') {
                    sb.append('\n');
                } else if (a2 == 'r') {
                    sb.append('\r');
                } else if (a2 == 't') {
                    sb.append('\t');
                } else {
                    if (a2 != 'u') {
                        throw new mga("Illegal escape.");
                    }
                    int i2 = 0;
                    for (int i3 = 0; i3 < 4; i3++) {
                        char c = c();
                        if (c == 0) {
                            throw new mga("Illegal escape.");
                        }
                        if (c >= '0' && c <= '9') {
                            i = c - '0';
                        } else if (c >= 'A' && c <= 'F') {
                            i = c - '7';
                        } else {
                            if (c < 'a' || c > 'f') {
                                break loop0;
                            }
                            i = c - 'W';
                        }
                        i2 = (i2 << 4) | i;
                    }
                    sb.append(Character.toChars(i2));
                }
            } else {
                if (a == '\"') {
                    return sb.toString();
                }
                sb.append(a);
            }
        }
        throw new mga("Illegal escape.");
    }

    public final char c() {
        e();
        this.e = this.f;
        this.f = -1;
        this.g = this.h;
        char c = this.i;
        this.h = c;
        this.i = (char) 0;
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        return new defpackage.oha(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oha d() {
        char e = e();
        if (e == 0) {
            throw new mga("Unexpected end of data.");
        }
        if (e == '\"') {
            c();
            return new oha(b(), null, null, null, null, null, null, null, null);
        }
        if (e != '{') {
            if (e == '[') {
                c();
                ArrayList arrayList = new ArrayList(8);
                char e2 = e();
                while (e2 != ']') {
                    if (e2 == ',') {
                        c();
                    } else {
                        arrayList.add(d());
                    }
                    e2 = e();
                }
                c();
                return new oha(arrayList);
            }
            StringBuilder sb = this.a;
            sb.setLength(0);
            char e3 = e();
            while (e3 >= ' ' && e3 < 128 && !j[e3]) {
                sb.append(c());
                e3 = e();
            }
            String sb2 = sb.toString();
            if (sb2.length() == 4) {
                if ("true".equals(sb2)) {
                    return oha.n;
                }
                if ("null".equals(sb2)) {
                    return oha.m;
                }
            } else if (sb2.length() == 5 && "false".equals(sb2)) {
                return oha.o;
            }
            char charAt = sb2.charAt(0);
            if ((charAt < '0' || charAt > '9') && charAt != '-') {
                throw new mga("Invalid value.");
            }
            if (sb2.indexOf(46) > -1 || sb2.indexOf(101) > -1 || sb2.indexOf(69) > -1 || "-0".equals(sb2)) {
                try {
                    try {
                        BigDecimal bigDecimal = new BigDecimal(sb2);
                        return (charAt == '-' && BigDecimal.ZERO.compareTo(bigDecimal) == 0) ? new oha(-0.0d) : new oha(null, null, null, null, null, bigDecimal, null, null, null);
                    } catch (NumberFormatException unused) {
                        throw new mga("Invalid value.");
                    }
                } catch (NumberFormatException unused2) {
                    double parseDouble = Double.parseDouble(sb2);
                    if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                        throw new mga("Invalid value.");
                    }
                    return new oha(parseDouble);
                }
            }
            if (charAt == '0' && sb2.length() > 1) {
                char charAt2 = sb2.charAt(1);
                if (charAt2 >= '0' && charAt2 <= '9') {
                    throw new mga("Invalid value.");
                }
            } else if (charAt == '-' && sb2.length() > 2) {
                char charAt3 = sb2.charAt(1);
                char charAt4 = sb2.charAt(2);
                if (charAt3 == '0' && charAt4 >= '0' && charAt4 <= '9') {
                    throw new mga("Invalid value.");
                }
            }
            try {
                try {
                    long parseLong = Long.parseLong(sb2);
                    return (parseLong < -2147483648L || parseLong > 2147483647L) ? new oha(null, null, null, Long.valueOf(parseLong), null, null, null, null, null) : new oha(null, null, Integer.valueOf((int) parseLong), null, null, null, null, null, null);
                } catch (NumberFormatException unused3) {
                    throw new mga("Invalid value.");
                }
            } catch (NumberFormatException unused4) {
                return new oha(null, null, null, null, null, null, new BigInteger(sb2), null, null);
            }
        }
        c();
        HashMap hashMap = new HashMap(8);
        while (true) {
            char c = c();
            if (c == 0) {
                throw new mga("Text must end with '}'");
            }
            if (c != '[' && c != '{') {
                if (c == '}') {
                    break;
                }
            } else if (this.g == '{') {
                throw new mga("Cannot directly nest another Object or Array.");
            }
            String b = b();
            if (c() != ':') {
                throw new mga("Expected a ':' after a key.");
            }
            oha d = d();
            if (d != oha.m || this.c) {
                hashMap.put(b, d);
            }
            char c2 = c();
            if (c2 != ',') {
                if (c2 != '}') {
                    throw new mga("Expected a ',' or '}'.");
                }
            } else if (e() == '}') {
                break;
            }
        }
    }

    public final char e() {
        if (this.f == -1) {
            this.f = this.e;
            this.i = (char) 0;
            while (true) {
                int i = this.f;
                if (i >= this.d) {
                    break;
                }
                this.f = i + 1;
                char c = this.b[i];
                if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                    this.i = c;
                    return c;
                }
            }
        }
        return this.i;
    }
}
