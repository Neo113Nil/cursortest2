package net.time4j.tz;

import com.plaid.internal.EnumC3631g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class p implements Comparable, k, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f58403d;

    /* renamed from: e, reason: collision with root package name */
    public static final BigDecimal f58404e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigDecimal f58405f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigDecimal f58406g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigDecimal f58407h;

    /* renamed from: i, reason: collision with root package name */
    public static final BigDecimal f58408i;

    /* renamed from: j, reason: collision with root package name */
    public static final BigDecimal f58409j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f58410k;
    private static final long serialVersionUID = -1410512619471503090L;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f58411a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f58412b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f58413c;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f58403d = concurrentHashMap;
        f58404e = new BigDecimal(60);
        f58405f = new BigDecimal(3600);
        f58406g = new BigDecimal(-180);
        f58407h = new BigDecimal(180);
        f58408i = new BigDecimal(EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        f58409j = new BigDecimal(1000000000);
        p pVar = new p(0, 0);
        f58410k = pVar;
        concurrentHashMap.put(0, pVar);
    }

    public p(int i10, int i11) {
        if (i11 != 0) {
            if (Math.abs(i11) > 999999999) {
                throw new IllegalArgumentException("Fraction out of range: " + i11);
            }
            if (i10 < -39600 || i10 > 39600) {
                throw new IllegalArgumentException("Total seconds out of range while fraction is non-zero: " + i10);
            }
            if ((i10 < 0 && i11 > 0) || (i10 > 0 && i11 < 0)) {
                throw new IllegalArgumentException("Different signs: offset=" + i10 + ", fraction=" + i11);
            }
        } else if (i10 < -64800 || i10 > 64800) {
            throw new IllegalArgumentException("Total seconds out of range: " + i10);
        }
        boolean z10 = i10 < 0 || i11 < 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? '-' : '+');
        int abs = Math.abs(i10);
        int i12 = abs / 3600;
        int i13 = (abs / 60) % 60;
        int i14 = abs % 60;
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        sb2.append(':');
        if (i13 < 10) {
            sb2.append('0');
        }
        sb2.append(i13);
        if (i14 != 0 || i11 != 0) {
            sb2.append(':');
            if (i14 < 10) {
                sb2.append('0');
            }
            sb2.append(i14);
            if (i11 != 0) {
                sb2.append('.');
                String valueOf = String.valueOf(Math.abs(i11));
                int length = 9 - valueOf.length();
                for (int i15 = 0; i15 < length; i15++) {
                    sb2.append('0');
                }
                sb2.append(valueOf);
            }
        }
        this.f58413c = sb2.toString();
        this.f58411a = i10;
        this.f58412b = i11;
    }

    public static p b(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(f58407h) > 0 || bigDecimal.compareTo(f58406g) < 0) {
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }
        BigDecimal multiply = bigDecimal.multiply(f58408i);
        BigDecimal scale = multiply.setScale(0, RoundingMode.DOWN);
        BigDecimal multiply2 = multiply.subtract(scale).setScale(9, RoundingMode.HALF_UP).multiply(f58409j);
        int intValueExact = scale.intValueExact();
        int intValueExact2 = multiply2.intValueExact();
        return intValueExact2 == 0 ? p(intValueExact) : intValueExact2 == 1000000000 ? p(intValueExact + 1) : intValueExact2 == -1000000000 ? p(intValueExact - 1) : new p(intValueExact, intValueExact2);
    }

    public static p c(f fVar, int i10, int i11, double d10) {
        if (fVar == null) {
            throw new NullPointerException("Missing sign.");
        }
        if (i10 < 0 || i10 > 180) {
            throw new IllegalArgumentException("Degrees of longitude out of range (0 <= degrees <= 180).");
        }
        if (i11 < 0 || i11 > 59) {
            throw new IllegalArgumentException("Arc minute out of range (0 <= arcMinutes <= 59).");
        }
        if (Double.compare(d10, 0.0d) < 0 || Double.compare(d10, 60.0d) >= 0) {
            throw new IllegalArgumentException("Arc second out of range (0.0 <= arcSeconds < 60.0).");
        }
        BigDecimal valueOf = BigDecimal.valueOf(i10);
        if (i11 != 0) {
            valueOf = valueOf.add(BigDecimal.valueOf(i11).setScale(15, RoundingMode.UNNECESSARY).divide(f58404e, RoundingMode.HALF_UP));
        }
        if (d10 != 0.0d) {
            valueOf = valueOf.add(BigDecimal.valueOf(d10).setScale(15, RoundingMode.FLOOR).divide(f58405f, RoundingMode.HALF_UP));
        }
        if (fVar == f.BEHIND_UTC) {
            valueOf = valueOf.negate();
        }
        return b(valueOf);
    }

    public static String e(int i10, int i11) {
        return "[hours=" + i10 + ",minutes=" + i11 + ']';
    }

    public static p n(f fVar, int i10) {
        return o(fVar, i10, 0);
    }

    public static p o(f fVar, int i10, int i11) {
        if (fVar == null) {
            throw new NullPointerException("Missing sign.");
        }
        if (i10 < 0 || i10 > 18) {
            throw new IllegalArgumentException("Hour part out of range (0 <= hours <= 18) in: " + e(i10, i11));
        }
        if (i11 < 0 || i11 > 59) {
            throw new IllegalArgumentException("Minute part out of range (0 <= minutes <= 59) in: " + e(i10, i11));
        }
        if (i10 != 18 || i11 == 0) {
            int i12 = (i10 * 3600) + (i11 * 60);
            if (fVar == f.BEHIND_UTC) {
                i12 = -i12;
            }
            return p(i12);
        }
        throw new IllegalArgumentException("Time zone offset out of range (-18:00:00 <= offset <= 18:00:00) in: " + e(i10, i11));
    }

    public static p p(int i10) {
        return q(i10, 0);
    }

    public static p q(int i10, int i11) {
        if (i11 != 0) {
            return new p(i10, i11);
        }
        if (i10 == 0) {
            return f58410k;
        }
        if (i10 % 900 != 0) {
            return new p(i10, 0);
        }
        Integer valueOf = Integer.valueOf(i10);
        ConcurrentMap concurrentMap = f58403d;
        p pVar = (p) concurrentMap.get(valueOf);
        if (pVar != null) {
            return pVar;
        }
        concurrentMap.putIfAbsent(valueOf, new p(i10, 0));
        return (p) concurrentMap.get(valueOf);
    }

    public static int r(String str, int i10, int i11) {
        int min = Math.min(str.length() - i10, i11);
        int i12 = -1;
        for (int i13 = 0; i13 < min; i13++) {
            char charAt = str.charAt(i10 + i13);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i12 = i12 == -1 ? charAt - '0' : (i12 * 10) + (charAt - '0');
        }
        return i12;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p s(String str, boolean z10) {
        String str2;
        int r10;
        int r11;
        if (str.equals("Z")) {
            return f58410k;
        }
        int length = str.length();
        if (length >= 3) {
            if (str.startsWith("UTC")) {
                str2 = str.substring(3);
                length -= 3;
                if (length >= 2) {
                    f fVar = str2.charAt(0) == '-' ? f.BEHIND_UTC : str2.charAt(0) == '+' ? f.AHEAD_OF_UTC : null;
                    int r12 = r(str2, 1, 2);
                    if (r12 >= 0) {
                        if (length <= 3) {
                            return n(fVar, r12);
                        }
                        int i10 = str2.charAt(2) != ':' ? 4 : 3;
                        int r13 = r(str2, i10, 2);
                        if (str2.charAt(i10 - 1) == ':' && r13 >= 0) {
                            int i11 = i10 + 2;
                            if (length == i11) {
                                return o(fVar, r12, r13);
                            }
                            int i12 = i10 + 5;
                            if (length >= i12 && str2.charAt(i11) == ':' && (r10 = r(str2, i10 + 3, 2)) >= 0) {
                                int i13 = (r12 * 3600) + (r13 * 60) + r10;
                                f fVar2 = f.BEHIND_UTC;
                                if (fVar == fVar2) {
                                    i13 = -i13;
                                }
                                if (length == i12) {
                                    return p(i13);
                                }
                                if (length == i10 + 15 && str2.charAt(i12) == '.' && (r11 = r(str2, i10 + 6, 9)) >= 0) {
                                    if (fVar == fVar2) {
                                        r11 = -r11;
                                    }
                                    return q(i13, r11);
                                }
                            }
                        }
                    }
                }
                if (z10) {
                    return null;
                }
                throw new IllegalArgumentException("No canonical zonal offset: " + str);
            }
            if (str.startsWith("GMT")) {
                if (!z10) {
                    return null;
                }
                throw new IllegalArgumentException("Use UTC-prefix for canonical offset instead: " + str);
            }
        }
        str2 = str;
        if (length >= 2) {
        }
        if (z10) {
        }
    }

    private Object writeReplace() {
        return new SPX(this, 15);
    }

    @Override // net.time4j.tz.k
    public String a() {
        if (this.f58411a == 0 && this.f58412b == 0) {
            return "Z";
        }
        return "UTC" + this.f58413c;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        int i10 = this.f58411a;
        int i11 = pVar.f58411a;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = this.f58412b - pVar.f58412b;
        if (i12 < 0) {
            return -1;
        }
        return i12 == 0 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f58411a == pVar.f58411a && this.f58412b == pVar.f58412b) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return Math.abs(this.f58411a) / 3600;
    }

    public int g() {
        return (Math.abs(this.f58411a) / 60) % 60;
    }

    public int h() {
        return Math.abs(this.f58411a) % 60;
    }

    public int hashCode() {
        return (~this.f58411a) + (this.f58412b % 64000);
    }

    public int i() {
        return this.f58412b;
    }

    public int j() {
        return this.f58411a;
    }

    public j k() {
        return j.R(this);
    }

    public f l() {
        return (this.f58411a < 0 || this.f58412b < 0) ? f.BEHIND_UTC : f.AHEAD_OF_UTC;
    }

    public String m(Locale locale) {
        boolean z10 = this.f58411a == 0 && this.f58412b == 0;
        try {
            return l.f58364t.d(z10, locale);
        } catch (Throwable unused) {
            return z10 ? "GMT" : "GMT±hh:mm";
        }
    }

    public String toString() {
        return this.f58413c;
    }
}
