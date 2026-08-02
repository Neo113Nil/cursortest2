package kg;

import B0.A0;
import I0.C3173b;
import T7.E;
import ig.C7073b;
import ig.EnumC7074c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import kg.f;
import kg.j;
import mg.EnumC8145a;
import org.maplibre.android.log.Logger;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    private static final mg.j<ig.p> f71530h = new a();

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap f71531i;

    /* renamed from: a, reason: collision with root package name */
    private b f71532a;

    /* renamed from: b, reason: collision with root package name */
    private final b f71533b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f71534c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f71535d;

    /* renamed from: e, reason: collision with root package name */
    private int f71536e;

    /* renamed from: f, reason: collision with root package name */
    private char f71537f;

    /* renamed from: g, reason: collision with root package name */
    private int f71538g;

    final class a implements mg.j<ig.p> {
        @Override // mg.j
        public final ig.p a(mg.e eVar) {
            ig.p pVar = (ig.p) eVar.d(mg.i.g());
            if (pVar == null || (pVar instanceof ig.q)) {
                return null;
            }
            return pVar;
        }
    }

    /* renamed from: kg.b$b, reason: collision with other inner class name */
    static /* synthetic */ class C1177b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f71539a;

        static {
            int[] iArr = new int[kg.i.values().length];
            f71539a = iArr;
            try {
                iArr[kg.i.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71539a[kg.i.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71539a[kg.i.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71539a[kg.i.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        private final char f71540a;

        c(char c11) {
            this.f71540a = c11;
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            sb2.append(this.f71540a);
            return true;
        }

        public final String toString() {
            char c11 = this.f71540a;
            if (c11 == '\'') {
                return "''";
            }
            return "'" + c11 + "'";
        }
    }

    static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        private final e[] f71541a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f71542b;

        d(ArrayList arrayList, boolean z11) {
            this((e[]) arrayList.toArray(new e[arrayList.size()]), z11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        
            r9.setLength(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
        
            return true;
         */
        @Override // kg.b.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            int length = sb2.length();
            boolean z11 = this.f71542b;
            if (z11) {
                eVar.g();
            }
            try {
                e[] eVarArr = this.f71541a;
                int length2 = eVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (!eVarArr[i11].a(eVar, sb2)) {
                            break;
                        }
                        i11++;
                    } else if (z11) {
                        eVar.a();
                    }
                }
                return true;
            } finally {
                if (z11) {
                    eVar.a();
                }
            }
        }

        public final d b() {
            return !this.f71542b ? this : new d(this.f71541a, false);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            e[] eVarArr = this.f71541a;
            if (eVarArr != null) {
                boolean z11 = this.f71542b;
                sb2.append(z11 ? "[" : "(");
                for (e eVar : eVarArr) {
                    sb2.append(eVar);
                }
                sb2.append(z11 ? "]" : ")");
            }
            return sb2.toString();
        }

        d(e[] eVarArr, boolean z11) {
            this.f71541a = eVarArr;
            this.f71542b = z11;
        }
    }

    interface e {
        boolean a(kg.e eVar, StringBuilder sb2);
    }

    static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC8145a f71543a;

        /* renamed from: b, reason: collision with root package name */
        private final int f71544b;

        /* renamed from: c, reason: collision with root package name */
        private final int f71545c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f71546d;

        f(EnumC8145a enumC8145a, int i11, int i12, boolean z11) {
            lg.c.e(enumC8145a, "field");
            if (!enumC8145a.d().f()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + enumC8145a);
            }
            if (i11 < 0 || i11 > 9) {
                throw new IllegalArgumentException(Ej.b.a(i11, "Minimum width must be from 0 to 9 inclusive but was "));
            }
            if (i12 < 1 || i12 > 9) {
                throw new IllegalArgumentException(Ej.b.a(i12, "Maximum width must be from 1 to 9 inclusive but was "));
            }
            if (i12 < i11) {
                throw new IllegalArgumentException(A0.a(i12, i11, "Maximum width must exceed or equal the minimum width but ", " < "));
            }
            this.f71543a = enumC8145a;
            this.f71544b = i11;
            this.f71545c = i12;
            this.f71546d = z11;
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            EnumC8145a enumC8145a = this.f71543a;
            Long e11 = eVar.e(enumC8145a);
            if (e11 == null) {
                return false;
            }
            kg.g c11 = eVar.c();
            long longValue = e11.longValue();
            mg.m d11 = enumC8145a.d();
            d11.b(longValue, enumC8145a);
            BigDecimal valueOf = BigDecimal.valueOf(d11.e());
            BigDecimal add = BigDecimal.valueOf(d11.d()).subtract(valueOf).add(BigDecimal.ONE);
            BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
            RoundingMode roundingMode = RoundingMode.FLOOR;
            BigDecimal divide = subtract.divide(add, 9, roundingMode);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (divide.compareTo(bigDecimal) != 0) {
                bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
            }
            int scale = bigDecimal.scale();
            boolean z11 = this.f71546d;
            int i11 = this.f71544b;
            if (scale != 0) {
                String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i11), this.f71545c), roundingMode).toPlainString().substring(2);
                c11.getClass();
                if (z11) {
                    sb2.append('.');
                }
                sb2.append(substring);
                return true;
            }
            if (i11 <= 0) {
                return true;
            }
            if (z11) {
                c11.getClass();
                sb2.append('.');
            }
            for (int i12 = 0; i12 < i11; i12++) {
                c11.getClass();
                sb2.append('0');
            }
            return true;
        }

        public final String toString() {
            return "Fraction(" + this.f71543a + "," + this.f71544b + "," + this.f71545c + (this.f71546d ? ",DecimalPoint" : "") + ")";
        }
    }

    static final class g implements e {
        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            Long e11 = eVar.e(EnumC8145a.INSTANT_SECONDS);
            mg.e d11 = eVar.d();
            EnumC8145a enumC8145a = EnumC8145a.NANO_OF_SECOND;
            Long valueOf = d11.L(enumC8145a) ? Long.valueOf(eVar.d().m(enumC8145a)) : 0L;
            if (e11 == null) {
                return false;
            }
            long longValue = e11.longValue();
            int h11 = enumC8145a.h(valueOf.longValue());
            if (longValue >= -62167219200L) {
                long j11 = longValue - 253402300800L;
                long b11 = lg.c.b(j11, 315569520000L) + 1;
                ig.g x12 = ig.g.x1((((j11 % 315569520000L) + 315569520000L) % 315569520000L) - 62167219200L, 0, ig.q.f66455f);
                if (b11 > 0) {
                    sb2.append('+');
                    sb2.append(b11);
                }
                sb2.append(x12);
                if (x12.m1() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j12 = longValue + 62167219200L;
                long j13 = j12 / 315569520000L;
                long j14 = j12 % 315569520000L;
                ig.g x13 = ig.g.x1(j14 - 62167219200L, 0, ig.q.f66455f);
                int length = sb2.length();
                sb2.append(x13);
                if (x13.m1() == 0) {
                    sb2.append(":00");
                }
                if (j13 < 0) {
                    if (x13.n1() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j13 - 1));
                    } else if (j14 == 0) {
                        sb2.insert(length, j13);
                    } else {
                        sb2.insert(length + 1, Math.abs(j13));
                    }
                }
            }
            if (h11 != 0) {
                sb2.append('.');
                if (h11 % 1000000 == 0) {
                    sb2.append(Integer.toString((h11 / 1000000) + 1000).substring(1));
                } else if (h11 % 1000 == 0) {
                    sb2.append(Integer.toString((h11 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(h11 + 1000000000).substring(1));
                }
            }
            sb2.append('Z');
            return true;
        }

        public final String toString() {
            return "Instant()";
        }
    }

    static final class h implements e {

        /* renamed from: a, reason: collision with root package name */
        private final kg.k f71547a;

        public h(kg.k kVar) {
            this.f71547a = kVar;
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            Long e11 = eVar.e(EnumC8145a.OFFSET_SECONDS);
            if (e11 == null) {
                return false;
            }
            sb2.append("GMT");
            if (this.f71547a == kg.k.FULL) {
                return new j("", "+HH:MM:ss").a(eVar, sb2);
            }
            int i11 = lg.c.i(e11.longValue());
            if (i11 == 0) {
                return true;
            }
            int abs = Math.abs((i11 / 3600) % 100);
            int abs2 = Math.abs((i11 / 60) % 60);
            int abs3 = Math.abs(i11 % 60);
            sb2.append(i11 < 0 ? "-" : "+");
            sb2.append(abs);
            if (abs2 <= 0 && abs3 <= 0) {
                return true;
            }
            sb2.append(ProductContainerDTO.RATIO_DELIMITER);
            sb2.append((char) ((abs2 / 10) + 48));
            sb2.append((char) ((abs2 % 10) + 48));
            if (abs3 <= 0) {
                return true;
            }
            sb2.append(ProductContainerDTO.RATIO_DELIMITER);
            sb2.append((char) ((abs3 / 10) + 48));
            sb2.append((char) ((abs3 % 10) + 48));
            return true;
        }
    }

    static class i implements e {

        /* renamed from: f, reason: collision with root package name */
        static final int[] f71548f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: a, reason: collision with root package name */
        final mg.h f71549a;

        /* renamed from: b, reason: collision with root package name */
        final int f71550b;

        /* renamed from: c, reason: collision with root package name */
        final int f71551c;

        /* renamed from: d, reason: collision with root package name */
        final kg.i f71552d;

        /* renamed from: e, reason: collision with root package name */
        final int f71553e;

        /* synthetic */ i(mg.h hVar, int i11, int i12, kg.i iVar, int i13, int i14) {
            this(hVar, i11, i12, iVar, i13);
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            mg.h hVar = this.f71549a;
            Long e11 = eVar.e(hVar);
            if (e11 == null) {
                return false;
            }
            long b11 = b(eVar, e11.longValue());
            kg.g c11 = eVar.c();
            String l11 = b11 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(b11));
            int length = l11.length();
            int i11 = this.f71551c;
            if (length > i11) {
                throw new C7073b("Field " + hVar + " cannot be printed as the value " + b11 + " exceeds the maximum print width of " + i11);
            }
            c11.getClass();
            int i12 = this.f71550b;
            kg.i iVar = this.f71552d;
            if (b11 >= 0) {
                int i13 = C1177b.f71539a[iVar.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        sb2.append('+');
                    }
                } else if (i12 < 19 && b11 >= f71548f[i12]) {
                    sb2.append('+');
                }
            } else {
                int i14 = C1177b.f71539a[iVar.ordinal()];
                if (i14 == 1 || i14 == 2 || i14 == 3) {
                    sb2.append('-');
                } else if (i14 == 4) {
                    throw new C7073b("Field " + hVar + " cannot be printed as the value " + b11 + " cannot be negative according to the SignStyle");
                }
            }
            for (int i15 = 0; i15 < i12 - l11.length(); i15++) {
                sb2.append('0');
            }
            sb2.append(l11);
            return true;
        }

        long b(kg.e eVar, long j11) {
            return j11;
        }

        i c() {
            if (this.f71553e == -1) {
                return this;
            }
            return new i(this.f71549a, this.f71550b, this.f71551c, this.f71552d, -1);
        }

        i d(int i11) {
            int i12 = this.f71553e + i11;
            return new i(this.f71549a, this.f71550b, this.f71551c, this.f71552d, i12);
        }

        public String toString() {
            mg.h hVar = this.f71549a;
            kg.i iVar = this.f71552d;
            int i11 = this.f71551c;
            int i12 = this.f71550b;
            if (i12 == 1 && i11 == 19 && iVar == kg.i.NORMAL) {
                return "Value(" + hVar + ")";
            }
            if (i12 == i11 && iVar == kg.i.NOT_NEGATIVE) {
                return "Value(" + hVar + "," + i12 + ")";
            }
            return "Value(" + hVar + "," + i12 + "," + i11 + "," + iVar + ")";
        }

        i(mg.h hVar, int i11, int i12, kg.i iVar) {
            this.f71549a = hVar;
            this.f71550b = i11;
            this.f71551c = i12;
            this.f71552d = iVar;
            this.f71553e = 0;
        }

        private i(mg.h hVar, int i11, int i12, kg.i iVar, int i13) {
            this.f71549a = hVar;
            this.f71550b = i11;
            this.f71551c = i12;
            this.f71552d = iVar;
            this.f71553e = i13;
        }
    }

    static final class j implements e {

        /* renamed from: c, reason: collision with root package name */
        static final String[] f71554c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: d, reason: collision with root package name */
        static final j f71555d = new j("Z", "+HH:MM:ss");

        /* renamed from: a, reason: collision with root package name */
        private final String f71556a;

        /* renamed from: b, reason: collision with root package name */
        private final int f71557b;

        static {
            new j("0", "+HH:MM:ss");
        }

        j(String str, String str2) {
            lg.c.e(str2, "pattern");
            this.f71556a = str;
            int i11 = 0;
            while (true) {
                String[] strArr = f71554c;
                if (i11 >= 9) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str2));
                }
                if (strArr[i11].equals(str2)) {
                    this.f71557b = i11;
                    return;
                }
                i11++;
            }
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            Long e11 = eVar.e(EnumC8145a.OFFSET_SECONDS);
            if (e11 == null) {
                return false;
            }
            int i11 = lg.c.i(e11.longValue());
            String str = this.f71556a;
            if (i11 == 0) {
                sb2.append(str);
                return true;
            }
            int abs = Math.abs((i11 / 3600) % 100);
            int abs2 = Math.abs((i11 / 60) % 60);
            int abs3 = Math.abs(i11 % 60);
            int length = sb2.length();
            sb2.append(i11 < 0 ? "-" : "+");
            sb2.append((char) ((abs / 10) + 48));
            sb2.append((char) ((abs % 10) + 48));
            int i12 = this.f71557b;
            if (i12 >= 3 || (i12 >= 1 && abs2 > 0)) {
                int i13 = i12 % 2;
                sb2.append(i13 == 0 ? ProductContainerDTO.RATIO_DELIMITER : "");
                sb2.append((char) ((abs2 / 10) + 48));
                sb2.append((char) ((abs2 % 10) + 48));
                abs += abs2;
                if (i12 >= 7 || (i12 >= 5 && abs3 > 0)) {
                    sb2.append(i13 == 0 ? ProductContainerDTO.RATIO_DELIMITER : "");
                    sb2.append((char) ((abs3 / 10) + 48));
                    sb2.append((char) ((abs3 % 10) + 48));
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb2.setLength(length);
                sb2.append(str);
            }
            return true;
        }

        public final String toString() {
            return C3173b.c(new StringBuilder("Offset("), f71554c[this.f71557b], ",'", this.f71556a.replace("'", "''"), "')");
        }
    }

    static final class k implements e {

        /* renamed from: a, reason: collision with root package name */
        private final e f71558a;

        /* renamed from: b, reason: collision with root package name */
        private final int f71559b;

        /* renamed from: c, reason: collision with root package name */
        private final char f71560c;

        k(e eVar, int i11, char c11) {
            this.f71558a = eVar;
            this.f71559b = i11;
            this.f71560c = c11;
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            int length = sb2.length();
            if (!this.f71558a.a(eVar, sb2)) {
                return false;
            }
            int length2 = sb2.length() - length;
            int i11 = this.f71559b;
            if (length2 > i11) {
                throw new C7073b(A0.a(length2, i11, "Cannot print as output of ", " characters exceeds pad width of "));
            }
            for (int i12 = 0; i12 < i11 - length2; i12++) {
                sb2.insert(length, this.f71560c);
            }
            return true;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("Pad(");
            sb2.append(this.f71558a);
            sb2.append(",");
            sb2.append(this.f71559b);
            char c11 = this.f71560c;
            if (c11 == ' ') {
                str = ")";
            } else {
                str = ",'" + c11 + "')";
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class m implements e {
        private static final /* synthetic */ m[] $VALUES;
        public static final m INSENSITIVE;
        public static final m LENIENT;
        public static final m SENSITIVE;
        public static final m STRICT;

        static {
            m mVar = new m("SENSITIVE", 0);
            SENSITIVE = mVar;
            m mVar2 = new m("INSENSITIVE", 1);
            INSENSITIVE = mVar2;
            m mVar3 = new m("STRICT", 2);
            STRICT = mVar3;
            m mVar4 = new m("LENIENT", 3);
            LENIENT = mVar4;
            $VALUES = new m[]{mVar, mVar2, mVar3, mVar4};
        }

        private m() {
            throw null;
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) $VALUES.clone();
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            return true;
        }

        @Override // java.lang.Enum
        public final String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static final class n implements e {

        /* renamed from: a, reason: collision with root package name */
        private final String f71563a;

        n(String str) {
            this.f71563a = str;
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            sb2.append(this.f71563a);
            return true;
        }

        public final String toString() {
            return A0.b("'", this.f71563a.replace("'", "''"), "'");
        }
    }

    static final class o implements e {

        /* renamed from: a, reason: collision with root package name */
        private final mg.h f71564a;

        /* renamed from: b, reason: collision with root package name */
        private final kg.k f71565b;

        /* renamed from: c, reason: collision with root package name */
        private final kg.f f71566c;

        /* renamed from: d, reason: collision with root package name */
        private volatile i f71567d;

        o(mg.h hVar, kg.k kVar, kg.f fVar) {
            this.f71564a = hVar;
            this.f71565b = kVar;
            this.f71566c = fVar;
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            Long e11 = eVar.e(this.f71564a);
            if (e11 == null) {
                return false;
            }
            String b11 = this.f71566c.b(this.f71564a, e11.longValue(), this.f71565b, eVar.b());
            if (b11 != null) {
                sb2.append(b11);
                return true;
            }
            if (this.f71567d == null) {
                this.f71567d = new i(this.f71564a, 1, 19, kg.i.NORMAL);
            }
            return this.f71567d.a(eVar, sb2);
        }

        public final String toString() {
            kg.k kVar = kg.k.FULL;
            mg.h hVar = this.f71564a;
            kg.k kVar2 = this.f71565b;
            if (kVar2 == kVar) {
                return "Text(" + hVar + ")";
            }
            return "Text(" + hVar + "," + kVar2 + ")";
        }
    }

    static final class p implements e {

        /* renamed from: a, reason: collision with root package name */
        private final char f71568a;

        /* renamed from: b, reason: collision with root package name */
        private final int f71569b;

        public p(char c11, int i11) {
            this.f71568a = c11;
            this.f71569b = i11;
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            i iVar;
            i iVar2;
            Locale b11 = eVar.b();
            int i11 = mg.n.f74864h;
            lg.c.e(b11, "locale");
            mg.n f7 = mg.n.f(new GregorianCalendar(new Locale(b11.getLanguage(), b11.getCountry())).getMinimalDaysInFirstWeek(), EnumC7074c.SUNDAY.e(r0.getFirstDayOfWeek() - 1));
            char c11 = this.f71568a;
            if (c11 != 'W') {
                int i12 = this.f71569b;
                if (c11 != 'Y') {
                    if (c11 == 'c') {
                        iVar = new i(f7.b(), i12, 2, kg.i.NOT_NEGATIVE);
                    } else if (c11 == 'e') {
                        iVar = new i(f7.b(), i12, 2, kg.i.NOT_NEGATIVE);
                    } else if (c11 != 'w') {
                        iVar2 = null;
                    } else {
                        iVar = new i(f7.i(), i12, 2, kg.i.NOT_NEGATIVE);
                    }
                } else if (i12 == 2) {
                    iVar = new l(f7.g(), l.f71561h);
                } else {
                    mg.h g10 = f7.g();
                    int i13 = this.f71569b;
                    iVar2 = new i(g10, i13, 19, i13 < 4 ? kg.i.NORMAL : kg.i.EXCEEDS_PAD, -1, 0);
                }
                return iVar2.a(eVar, sb2);
            }
            iVar = new i(f7.h(), 1, 2, kg.i.NOT_NEGATIVE);
            iVar2 = iVar;
            return iVar2.a(eVar, sb2);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Localized(");
            int i11 = this.f71569b;
            char c11 = this.f71568a;
            if (c11 != 'Y') {
                if (c11 == 'c' || c11 == 'e') {
                    sb2.append("DayOfWeek");
                } else if (c11 == 'w') {
                    sb2.append("WeekOfWeekBasedYear");
                } else if (c11 == 'W') {
                    sb2.append("WeekOfMonth");
                }
                sb2.append(",");
                sb2.append(i11);
            } else if (i11 == 1) {
                sb2.append("WeekBasedYear");
            } else if (i11 == 2) {
                sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb2.append("WeekBasedYear,");
                sb2.append(i11);
                sb2.append(",19,");
                sb2.append(i11 < 4 ? kg.i.NORMAL : kg.i.EXCEEDS_PAD);
            }
            sb2.append(")");
            return sb2.toString();
        }
    }

    static final class q implements e {

        /* renamed from: a, reason: collision with root package name */
        private final mg.j<ig.p> f71570a;

        /* renamed from: b, reason: collision with root package name */
        private final String f71571b;

        q(mg.j<ig.p> jVar, String str) {
            this.f71570a = jVar;
            this.f71571b = str;
        }

        @Override // kg.b.e
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            ig.p pVar = (ig.p) eVar.f(this.f71570a);
            if (pVar == null) {
                return false;
            }
            sb2.append(pVar.a());
            return true;
        }

        public final String toString() {
            return this.f71571b;
        }
    }

    static final class r implements e {

        /* renamed from: a, reason: collision with root package name */
        private final kg.k f71572a;

        r(kg.k kVar) {
            lg.c.e(kVar, "textStyle");
            this.f71572a = kVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        @Override // kg.b.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(kg.e eVar, StringBuilder sb2) {
            ig.p pVar;
            ng.f b11;
            ig.p pVar2 = (ig.p) eVar.f(mg.i.g());
            if (pVar2 == null) {
                return false;
            }
            try {
                b11 = pVar2.b();
            } catch (ng.g unused) {
            }
            if (b11.f()) {
                pVar = b11.a(ig.e.f66405d);
                if (!(pVar instanceof ig.q)) {
                    sb2.append(pVar2.a());
                    return true;
                }
                mg.e d11 = eVar.d();
                EnumC8145a enumC8145a = EnumC8145a.INSTANT_SECONDS;
                boolean e11 = d11.L(enumC8145a) ? pVar2.b().e(ig.e.W0(d11.m(enumC8145a))) : false;
                TimeZone timeZone = TimeZone.getTimeZone(pVar2.a());
                kg.k kVar = this.f71572a;
                kVar.getClass();
                sb2.append(timeZone.getDisplayName(e11, kg.k.values()[kVar.ordinal() & (-2)] == kg.k.FULL ? 1 : 0, eVar.b()));
                return true;
            }
            pVar = pVar2;
            if (!(pVar instanceof ig.q)) {
            }
        }

        public final String toString() {
            return "ZoneText(" + this.f71572a + ")";
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f71531i = hashMap;
        hashMap.put('G', EnumC8145a.ERA);
        hashMap.put('y', EnumC8145a.YEAR_OF_ERA);
        hashMap.put('u', EnumC8145a.YEAR);
        mg.h hVar = mg.c.f74845a;
        hashMap.put('Q', hVar);
        hashMap.put('q', hVar);
        EnumC8145a enumC8145a = EnumC8145a.MONTH_OF_YEAR;
        hashMap.put('M', enumC8145a);
        hashMap.put('L', enumC8145a);
        hashMap.put('D', EnumC8145a.DAY_OF_YEAR);
        hashMap.put('d', EnumC8145a.DAY_OF_MONTH);
        hashMap.put('F', EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC8145a enumC8145a2 = EnumC8145a.DAY_OF_WEEK;
        hashMap.put('E', enumC8145a2);
        hashMap.put('c', enumC8145a2);
        hashMap.put('e', enumC8145a2);
        hashMap.put('a', EnumC8145a.AMPM_OF_DAY);
        hashMap.put('H', EnumC8145a.HOUR_OF_DAY);
        hashMap.put('k', EnumC8145a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', EnumC8145a.HOUR_OF_AMPM);
        hashMap.put('h', EnumC8145a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', EnumC8145a.MINUTE_OF_HOUR);
        hashMap.put('s', EnumC8145a.SECOND_OF_MINUTE);
        EnumC8145a enumC8145a3 = EnumC8145a.NANO_OF_SECOND;
        hashMap.put('S', enumC8145a3);
        hashMap.put('A', EnumC8145a.MILLI_OF_DAY);
        hashMap.put('n', enumC8145a3);
        hashMap.put('N', EnumC8145a.NANO_OF_DAY);
    }

    public b() {
        this.f71532a = this;
        this.f71534c = new ArrayList();
        this.f71538g = -1;
        this.f71533b = null;
        this.f71535d = false;
    }

    private int d(e eVar) {
        lg.c.e(eVar, "pp");
        b bVar = this.f71532a;
        int i11 = bVar.f71536e;
        if (i11 > 0) {
            k kVar = new k(eVar, i11, bVar.f71537f);
            bVar.f71536e = 0;
            bVar.f71537f = (char) 0;
            eVar = kVar;
        }
        bVar.f71534c.add(eVar);
        this.f71532a.f71538g = -1;
        return r5.f71534c.size() - 1;
    }

    private void m(i iVar) {
        i c11;
        b bVar = this.f71532a;
        int i11 = bVar.f71538g;
        if (i11 < 0 || !(bVar.f71534c.get(i11) instanceof i)) {
            this.f71532a.f71538g = d(iVar);
            return;
        }
        b bVar2 = this.f71532a;
        int i12 = bVar2.f71538g;
        i iVar2 = (i) bVar2.f71534c.get(i12);
        int i13 = iVar.f71550b;
        int i14 = iVar.f71551c;
        if (i13 == i14 && iVar.f71552d == kg.i.NOT_NEGATIVE) {
            c11 = iVar2.d(i14);
            d(iVar.c());
            this.f71532a.f71538g = i12;
        } else {
            c11 = iVar2.c();
            this.f71532a.f71538g = d(iVar);
        }
        this.f71532a.f71534c.set(i12, c11);
    }

    public final void a(C7676a c7676a) {
        d(c7676a.f());
    }

    public final void b(EnumC8145a enumC8145a, int i11, int i12, boolean z11) {
        d(new f(enumC8145a, i11, i12, z11));
    }

    public final void c() {
        d(new g());
    }

    public final void e(char c11) {
        d(new c(c11));
    }

    public final void f(String str) {
        lg.c.e(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                d(new c(str.charAt(0)));
            } else {
                d(new n(str));
            }
        }
    }

    public final void g(kg.k kVar) {
        lg.c.e(kVar, "style");
        if (kVar != kg.k.FULL && kVar != kg.k.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new h(kVar));
    }

    public final void h(String str, String str2) {
        d(new j(str2, str));
    }

    public final void i() {
        d(j.f71555d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(String str) {
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < str.length()) {
            char charAt = str.charAt(i13);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i14 = i13 + 1;
                while (i14 < str.length() && str.charAt(i14) == charAt) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (charAt == 'p') {
                    if (i14 >= str.length() || (((charAt = str.charAt(i14)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i11 = i14;
                        i12 = i15;
                        i15 = 0;
                    } else {
                        i11 = i14 + 1;
                        while (i11 < str.length() && str.charAt(i11) == charAt) {
                            i11++;
                        }
                        i12 = i11 - i14;
                    }
                    if (i15 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i15 < 1) {
                        throw new IllegalArgumentException(Ej.b.a(i15, "The pad width must be at least one but was "));
                    }
                    b bVar = this.f71532a;
                    bVar.f71536e = i15;
                    bVar.f71537f = ' ';
                    bVar.f71538g = -1;
                    i15 = i12;
                    i14 = i11;
                }
                mg.h hVar = (mg.h) f71531i.get(Character.valueOf(charAt));
                if (hVar != null) {
                    if (charAt != 'Q') {
                        if (charAt == 'S') {
                            b(EnumC8145a.NANO_OF_SECOND, i15, i15, false);
                        } else if (charAt != 'a') {
                            if (charAt != 'h' && charAt != 'k' && charAt != 'm') {
                                if (charAt != 'q') {
                                    if (charAt != 's') {
                                        if (charAt != 'u' && charAt != 'y') {
                                            switch (charAt) {
                                                case 'D':
                                                    if (i15 == 1) {
                                                        n(hVar);
                                                        break;
                                                    } else {
                                                        if (i15 > 3) {
                                                            throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                                                        }
                                                        o(hVar, i15);
                                                        break;
                                                    }
                                                case 'E':
                                                case 'G':
                                                    if (i15 != 1 && i15 != 2 && i15 != 3) {
                                                        if (i15 == 4) {
                                                            l(hVar, kg.k.FULL);
                                                            break;
                                                        } else {
                                                            if (i15 != 5) {
                                                                throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                                                            }
                                                            l(hVar, kg.k.NARROW);
                                                            break;
                                                        }
                                                    } else {
                                                        l(hVar, kg.k.SHORT);
                                                        break;
                                                    }
                                                case 'F':
                                                    if (i15 != 1) {
                                                        throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                                                    }
                                                    n(hVar);
                                                    break;
                                                default:
                                                    switch (charAt) {
                                                        case 'K':
                                                            break;
                                                        case 'L':
                                                            break;
                                                        case 'M':
                                                            break;
                                                        default:
                                                            switch (charAt) {
                                                                case Logger.NONE /* 99 */:
                                                                    if (i15 == 1) {
                                                                        d(new p('c', i15));
                                                                        break;
                                                                    } else {
                                                                        if (i15 == 2) {
                                                                            throw new IllegalArgumentException(Pk0.i.a("Invalid number of pattern letters: ", charAt));
                                                                        }
                                                                        if (i15 == 3) {
                                                                            l(hVar, kg.k.SHORT_STANDALONE);
                                                                            break;
                                                                        } else if (i15 == 4) {
                                                                            l(hVar, kg.k.FULL_STANDALONE);
                                                                            break;
                                                                        } else {
                                                                            if (i15 != 5) {
                                                                                throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                                                                            }
                                                                            l(hVar, kg.k.NARROW_STANDALONE);
                                                                            break;
                                                                        }
                                                                    }
                                                                case 'd':
                                                                    break;
                                                                case 'e':
                                                                    if (i15 != 1 && i15 != 2) {
                                                                        if (i15 == 3) {
                                                                            l(hVar, kg.k.SHORT);
                                                                            break;
                                                                        } else if (i15 == 4) {
                                                                            l(hVar, kg.k.FULL);
                                                                            break;
                                                                        } else {
                                                                            if (i15 != 5) {
                                                                                throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                                                                            }
                                                                            l(hVar, kg.k.NARROW);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        d(new p('e', i15));
                                                                        break;
                                                                    }
                                                                default:
                                                                    if (i15 != 1) {
                                                                        o(hVar, i15);
                                                                        break;
                                                                    } else {
                                                                        n(hVar);
                                                                        break;
                                                                    }
                                                            }
                                                    }
                                                case 'H':
                                                    if (i15 != 1) {
                                                        n(hVar);
                                                        break;
                                                    } else {
                                                        if (i15 != 2) {
                                                            throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                                                        }
                                                        o(hVar, i15);
                                                        break;
                                                    }
                                            }
                                        } else if (i15 == 2) {
                                            ig.f fVar = l.f71561h;
                                            lg.c.e(fVar, "baseDate");
                                            m(new l(hVar, fVar));
                                        } else if (i15 < 4) {
                                            p(hVar, i15, 19, kg.i.NORMAL);
                                        } else {
                                            p(hVar, i15, 19, kg.i.EXCEEDS_PAD);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                    n(hVar);
                                } else if (i15 == 2) {
                                    o(hVar, 2);
                                } else if (i15 == 3) {
                                    l(hVar, kg.k.SHORT_STANDALONE);
                                } else if (i15 == 4) {
                                    l(hVar, kg.k.FULL_STANDALONE);
                                } else {
                                    if (i15 != 5) {
                                        throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                                    }
                                    l(hVar, kg.k.NARROW_STANDALONE);
                                }
                            }
                            if (i15 != 1) {
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                            }
                            l(hVar, kg.k.SHORT);
                        }
                    }
                    if (i15 == 1) {
                        n(hVar);
                    } else if (i15 == 2) {
                        o(hVar, 2);
                    } else if (i15 == 3) {
                        l(hVar, kg.k.SHORT);
                    } else if (i15 == 4) {
                        l(hVar, kg.k.FULL);
                    } else {
                        if (i15 != 5) {
                            throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                        }
                        l(hVar, kg.k.NARROW);
                    }
                } else if (charAt == 'z') {
                    if (i15 > 4) {
                        throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                    }
                    if (i15 == 4) {
                        d(new r(kg.k.FULL));
                    } else {
                        d(new r(kg.k.SHORT));
                    }
                } else if (charAt != 'V') {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i15 < 4) {
                            h("+HHMM", "+0000");
                        } else if (i15 == 4) {
                            g(kg.k.FULL);
                        } else {
                            if (i15 != 5) {
                                throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                            }
                            h("+HH:MM:ss", "Z");
                        }
                    } else if (charAt == 'O') {
                        if (i15 == 1) {
                            g(kg.k.SHORT);
                        } else {
                            if (i15 != 4) {
                                throw new IllegalArgumentException(Pk0.i.a("Pattern letter count must be 1 or 4: ", charAt));
                            }
                            g(kg.k.FULL);
                        }
                    } else if (charAt == 'X') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                        }
                        h(j.f71554c[i15 + (i15 == 1 ? 0 : 1)], "Z");
                    } else if (charAt == 'x') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                        }
                        if (i15 == 1) {
                            str2 = "+00";
                        } else if (i15 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        h(j.f71554c[i15 + (i15 == 1 ? 0 : 1)], str2);
                    } else if (charAt == 'W') {
                        if (i15 > 1) {
                            throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                        }
                        d(new p('W', i15));
                    } else if (charAt == 'w') {
                        if (i15 > 2) {
                            throw new IllegalArgumentException(Pk0.i.a("Too many pattern letters: ", charAt));
                        }
                        d(new p('w', i15));
                    } else {
                        if (charAt != 'Y') {
                            throw new IllegalArgumentException(Pk0.i.a("Unknown pattern letter: ", charAt));
                        }
                        d(new p('Y', i15));
                    }
                } else {
                    if (i15 != 2) {
                        throw new IllegalArgumentException(Pk0.i.a("Pattern letter count must be 2: ", charAt));
                    }
                    d(new q(mg.i.g(), "ZoneId()"));
                }
                i13 = i14 - 1;
            } else if (charAt == '\'') {
                int i16 = i13 + 1;
                int i17 = i16;
                while (i17 < str.length()) {
                    if (str.charAt(i17) == '\'') {
                        int i18 = i17 + 1;
                        if (i18 < str.length() && str.charAt(i18) == '\'') {
                            i17 = i18;
                        }
                        if (i17 < str.length()) {
                            throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                        }
                        String substring = str.substring(i16, i17);
                        if (substring.length() == 0) {
                            e('\'');
                        } else {
                            f(substring.replace("''", "'"));
                        }
                        i13 = i17;
                    }
                    i17++;
                }
                if (i17 < str.length()) {
                }
            } else if (charAt == '[') {
                s();
            } else if (charAt == ']') {
                if (this.f71532a.f71533b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                r();
            } else {
                if (charAt == '{' || charAt == '}' || charAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
                }
                e(charAt);
            }
            i13++;
        }
    }

    public final void k(EnumC8145a enumC8145a, HashMap hashMap) {
        lg.c.e(enumC8145a, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        kg.k kVar = kg.k.FULL;
        d(new o(enumC8145a, kVar, new kg.c(new j.b(Collections.singletonMap(kVar, linkedHashMap)))));
    }

    public final void l(mg.h hVar, kg.k kVar) {
        lg.c.e(kVar, "textStyle");
        int i11 = kg.f.f71583b;
        d(new o(hVar, kVar, f.a.f71584a));
    }

    public final void n(mg.h hVar) {
        m(new i(hVar, 1, 19, kg.i.NORMAL));
    }

    public final void o(mg.h hVar, int i11) {
        lg.c.e(hVar, "field");
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException(Ej.b.a(i11, "The width must be from 1 to 19 inclusive but was "));
        }
        m(new i(hVar, i11, i11, kg.i.NOT_NEGATIVE));
    }

    public final void p(mg.h hVar, int i11, int i12, kg.i iVar) {
        if (i11 == i12 && iVar == kg.i.NOT_NEGATIVE) {
            o(hVar, i12);
            return;
        }
        lg.c.e(hVar, "field");
        lg.c.e(iVar, "signStyle");
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException(Ej.b.a(i11, "The minimum width must be from 1 to 19 inclusive but was "));
        }
        if (i12 < 1 || i12 > 19) {
            throw new IllegalArgumentException(Ej.b.a(i12, "The maximum width must be from 1 to 19 inclusive but was "));
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(A0.a(i12, i11, "The maximum width must exceed or equal the minimum width but ", " < "));
        }
        m(new i(hVar, i11, i12, iVar));
    }

    public final void q() {
        d(new q(f71530h, "ZoneRegionId()"));
    }

    public final void r() {
        b bVar = this.f71532a;
        if (bVar.f71533b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (bVar.f71534c.size() <= 0) {
            this.f71532a = this.f71532a.f71533b;
            return;
        }
        b bVar2 = this.f71532a;
        d dVar = new d(bVar2.f71534c, bVar2.f71535d);
        this.f71532a = this.f71532a.f71533b;
        d(dVar);
    }

    public final void s() {
        b bVar = this.f71532a;
        bVar.f71538g = -1;
        this.f71532a = new b(bVar);
    }

    public final void t() {
        d(m.INSENSITIVE);
    }

    public final void u() {
        d(m.SENSITIVE);
    }

    public final void v() {
        d(m.LENIENT);
    }

    public final C7676a w() {
        Locale locale = Locale.getDefault();
        lg.c.e(locale, "locale");
        while (this.f71532a.f71533b != null) {
            r();
        }
        return new C7676a(new d(this.f71534c, false), locale, kg.g.f71585a, kg.h.SMART, null);
    }

    final C7676a x(kg.h hVar) {
        return w().h(hVar);
    }

    private b(b bVar) {
        this.f71532a = this;
        this.f71534c = new ArrayList();
        this.f71538g = -1;
        this.f71533b = bVar;
        this.f71535d = true;
    }

    static final class l extends i {

        /* renamed from: h, reason: collision with root package name */
        static final ig.f f71561h = ig.f.E1(2000, 1, 1);

        /* renamed from: g, reason: collision with root package name */
        private final ig.f f71562g;

        l(mg.h hVar, ig.f fVar) {
            super(hVar, 2, 2, kg.i.NOT_NEGATIVE);
            if (fVar == null) {
                long j11 = 0;
                if (!hVar.d().g(j11)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j11 + i.f71548f[2] > 2147483647L) {
                    throw new C7073b("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.f71562g = fVar;
        }

        @Override // kg.b.i
        final long b(kg.e eVar, long j11) {
            long abs = Math.abs(j11);
            ig.f fVar = this.f71562g;
            long Q11 = fVar != null ? jg.g.g(eVar.d()).a(fVar).Q(this.f71549a) : 0;
            int[] iArr = i.f71548f;
            if (j11 >= Q11) {
                int i11 = iArr[this.f71550b];
                if (j11 < r7 + i11) {
                    return abs % i11;
                }
            }
            return abs % iArr[this.f71551c];
        }

        @Override // kg.b.i
        final i c() {
            if (this.f71553e == -1) {
                return this;
            }
            return new l(this.f71549a, this.f71550b, this.f71551c, this.f71562g, -1);
        }

        @Override // kg.b.i
        final i d(int i11) {
            int i12 = this.f71553e + i11;
            return new l(this.f71549a, this.f71550b, this.f71551c, this.f71562g, i12);
        }

        @Override // kg.b.i
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReducedValue(");
            sb2.append(this.f71549a);
            sb2.append(",");
            sb2.append(this.f71550b);
            sb2.append(",");
            sb2.append(this.f71551c);
            sb2.append(",");
            Object obj = this.f71562g;
            if (obj == null) {
                obj = 0;
            }
            return E.c(obj, ")", sb2);
        }

        private l(mg.h hVar, int i11, int i12, ig.f fVar, int i13) {
            super(hVar, i11, i12, kg.i.NOT_NEGATIVE, i13, 0);
            this.f71562g = fVar;
        }
    }
}
