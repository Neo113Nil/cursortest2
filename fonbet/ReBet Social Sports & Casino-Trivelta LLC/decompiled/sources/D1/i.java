package D1;

import D1.d;
import Ra.s;
import android.content.Context;
import android.os.Handler;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.B;
import e1.AbstractC4134a;
import e1.AbstractC4136c;
import e1.C4133C;
import e1.InterfaceC4143j;
import e1.Z;
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes.dex */
public final class i implements d, InterfaceC4403F {

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC3445z f2414r = AbstractC3445z.y(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC3445z f2415s = AbstractC3445z.y(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC3445z f2416t = AbstractC3445z.y(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC3445z f2417u = AbstractC3445z.y(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: v, reason: collision with root package name */
    public static final AbstractC3445z f2418v = AbstractC3445z.y(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: w, reason: collision with root package name */
    public static final AbstractC3445z f2419w = AbstractC3445z.y(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: x, reason: collision with root package name */
    public static i f2420x;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2421a;

    /* renamed from: b, reason: collision with root package name */
    public final B f2422b;

    /* renamed from: c, reason: collision with root package name */
    public final d.a.C0045a f2423c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4143j f2424d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2425e;

    /* renamed from: f, reason: collision with root package name */
    public final r f2426f;

    /* renamed from: g, reason: collision with root package name */
    public int f2427g;

    /* renamed from: h, reason: collision with root package name */
    public long f2428h;

    /* renamed from: i, reason: collision with root package name */
    public long f2429i;

    /* renamed from: j, reason: collision with root package name */
    public long f2430j;

    /* renamed from: k, reason: collision with root package name */
    public long f2431k;

    /* renamed from: l, reason: collision with root package name */
    public long f2432l;

    /* renamed from: m, reason: collision with root package name */
    public long f2433m;

    /* renamed from: n, reason: collision with root package name */
    public int f2434n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2435o;

    /* renamed from: p, reason: collision with root package name */
    public int f2436p;

    /* renamed from: q, reason: collision with root package name */
    public String f2437q;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2438a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f2439b;

        /* renamed from: c, reason: collision with root package name */
        public int f2440c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC4143j f2441d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2442e;

        public b(Context context) {
            this.f2438a = context == null ? null : context.getApplicationContext();
            this.f2440c = 2000;
            this.f2441d = InterfaceC4143j.f45530a;
            this.f2442e = true;
            HashMap hashMap = new HashMap(8);
            this.f2439b = hashMap;
            hashMap.put(0, 1000000L);
            hashMap.put(2, -9223372036854775807L);
            hashMap.put(3, -9223372036854775807L);
            hashMap.put(4, -9223372036854775807L);
            hashMap.put(5, -9223372036854775807L);
            hashMap.put(10, -9223372036854775807L);
            hashMap.put(9, -9223372036854775807L);
            hashMap.put(7, -9223372036854775807L);
        }

        public i a() {
            return new i(this.f2438a, this.f2439b, this.f2440c, this.f2441d, this.f2442e);
        }

        public b b(int i10, long j10) {
            this.f2439b.put(Integer.valueOf(i10), Long.valueOf(j10));
            return this;
        }

        public b c(long j10) {
            Iterator it = this.f2439b.keySet().iterator();
            while (it.hasNext()) {
                b(((Integer) it.next()).intValue(), j10);
            }
            return this;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] k(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = Typography.quote;
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = Typography.dollar;
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = Typography.amp;
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = '*';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = ',';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = ':';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ';';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c10 = Typography.less;
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '=';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c10 = Typography.greater;
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = Matrix.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = Matrix.MATRIX_TYPE_RANDOM_UT;
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = Matrix.MATRIX_TYPE_ZERO;
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = '[';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = ']';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c10 = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = Typography.nbsp;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = 161;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c10 = Typography.cent;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = Typography.pound;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = Typography.section;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c10 = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = Typography.copyright;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = Typography.registered;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = Typography.degree;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c10 = Typography.plusMinus;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = Typography.paragraph;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = Typography.middleDot;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = Typography.half;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = Typography.times;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 236;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 237;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 238;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 4:
            case 17:
            case 29:
            case '2':
            case '9':
            case 'q':
            case 't':
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case ')':
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '\b':
            case '?':
            case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 2, 2, 1, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case '=':
            case ']':
            case 'f':
            case 127:
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 3, 1, 1, 3, 0};
            case '\r':
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case '3':
            case 'y':
            case 144:
            case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
            case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case '7':
            case 128:
            case SDK_ASSET_ICON_EXTERNAL_VALUE:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 'j':
            case SDK_ASSET_ICON_PIN_VALUE:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 'T':
            case '\\':
            case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
            case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
            case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
            case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case ' ':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '!':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '\"':
                return new int[]{1, 2, 3, 3, 2, 2};
            case '#':
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '$':
            case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                return new int[]{0, 2, 1, 2, 3, 3};
            case '%':
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '&':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '\'':
            case '>':
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case '(':
                return new int[]{0, 1, 0, 0, 0, 2};
            case '+':
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case ',':
            case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                return new int[]{4, 3, 3, 4, 2, 2};
            case '-':
                return new int[]{2, 0, 1, 1, 3, 1};
            case '.':
                return new int[]{2, 3, 3, 2, 2, 2};
            case '/':
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case '0':
            case 'o':
            case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
            case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                return new int[]{4, 2, 4, 4, 2, 2};
            case '1':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '4':
                return new int[]{1, 0, 1, 0, 0, 2};
            case '5':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '6':
                return new int[]{0, 1, 4, 2, 2, 1};
            case '8':
                return new int[]{0, 0, 2, 0, 0, 2};
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ';':
            case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                return new int[]{3, 3, 4, 4, 2, 2};
            case '<':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
                return new int[]{0, 0, 0, 0, 1, 0};
            case 'A':
                return new int[]{4, 3, 4, 4, 4, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'D':
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{4, 2, 4, 0, 2, 2};
            case 'F':
                return new int[]{0, 2, 2, 0, 2, 2};
            case 'G':
                return new int[]{1, 1, 1, 1, 0, 2};
            case 'H':
                return new int[]{3, 4, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 1, 3, 2, 2, 2};
            case 'J':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 'K':
                return new int[]{1, 1, 0, 2, 2, 2};
            case 'L':
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'M':
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'N':
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'O':
            case 'a':
            case 'h':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'P':
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 'Q':
            case SDK_ASSET_ICON_CANCEL_VALUE:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'R':
                return new int[]{3, 4, 4, 2, 2, 2};
            case 'S':
                return new int[]{2, 1, 1, 3, 2, 2};
            case 'U':
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'V':
                return new int[]{2, 1, 2, 1, 2, 2};
            case 'W':
                return new int[]{2, 2, 4, 3, 3, 2};
            case 'X':
                return new int[]{4, 4, 1, 2, 2, 2};
            case 'Y':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 0, 1, 1, 0};
            case '[':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '^':
                return new int[]{3, 1, 3, 3, 2, 4};
            case '_':
                return new int[]{1, 1, 1, 1, 1, 2};
            case '`':
                return new int[]{1, 2, 2, 3, 4, 2};
            case 'b':
                return new int[]{1, 1, 3, 2, 2, 3};
            case 'c':
                return new int[]{3, 2, 2, 0, 2, 2};
            case 'd':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'e':
                return new int[]{4, 2, 3, 3, 4, 3};
            case 'g':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'i':
                return new int[]{2, 4, 3, 1, 2, 2};
            case 'k':
                return new int[]{0, 3, 2, 3, 4, 2};
            case 'l':
                return new int[]{3, 2, 1, 1, 1, 2};
            case 'm':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'n':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'p':
            case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 'r':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 3, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 1, 1, 2, 2, 2};
            case 'x':
                return new int[]{2, 2, 1, 1, 2, 2};
            case 'z':
            case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                return new int[]{3, 2, 3, 3, 4, 2};
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                return new int[]{4, 3, 3, 3, 2, 2};
            case '}':
                return new int[]{0, 1, 0, 1, 0, 2};
            case '~':
                return new int[]{4, 0, 3, 2, 1, 3};
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                return new int[]{2, 0, 0, 1, 3, 2};
            case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                return new int[]{1, 2, 2, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
            case 211:
            case 216:
            case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                return new int[]{2, 0, 2, 2, 2, 2};
            case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                return new int[]{0, 2, 4, 4, 3, 1};
            case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                return new int[]{2, 1, 2, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                return new int[]{3, 2, 2, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                return new int[]{2, 4, 4, 4, 3, 2};
            case SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                return new int[]{3, 1, 2, 2, 2, 2};
            case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                return new int[]{3, 4, 3, 2, 2, 2};
            case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                return new int[]{2, 3, 3, 4, 2, 2};
            case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                return new int[]{3, 4, 2, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                return new int[]{2, 1, 4, 3, 0, 4};
            case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                return new int[]{0, 0, 3, 0, 0, 2};
            case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                return new int[]{2, 2, 4, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                return new int[]{0, 0, 1, 2, 4, 2};
            case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                return new int[]{2, 3, 1, 2, 4, 2};
            case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                return new int[]{2, 1, 2, 3, 2, 1};
            case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                return new int[]{3, 3, 3, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                return new int[]{1, 0, 2, 2, 4, 4};
            case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                return new int[]{2, 0, 2, 1, 2, 0};
            case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                return new int[]{3, 4, 1, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                return new int[]{2, 2, 4, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                return new int[]{1, 4, 4, 4, 4, 2};
            case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                return new int[]{1, 0, 0, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE:
                return new int[]{1, 0, 0, 1, 3, 3};
            case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                return new int[]{3, 3, 2, 0, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                return new int[]{3, 1, 1, 2, 2, 0};
            case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                return new int[]{4, 2, 4, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                return new int[]{2, 3, 3, 3, 1, 1};
            case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                return new int[]{0, 1, 1, 1, 2, 2};
            case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                return new int[]{4, 4, 3, 2, 2, 2};
            case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                return new int[]{2, 2, 3, 4, 4, 2};
            case SDK_ASSET_ICON_ARROW_UP_VALUE:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case SDK_ASSET_ICON_COMMENT_VALUE:
                return new int[]{3, 4, 1, 0, 2, 2};
            case SDK_ASSET_ICON_OVERRIDE_VALUE:
                return new int[]{3, 1, 1, 1, 2, 2};
            case SDK_ASSET_ICON_PAUSE_VALUE:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                return new int[]{3, 3, 2, 3, 4, 2};
            case SDK_ASSET_ICON_SUBMIT_VALUE:
                return new int[]{2, 2, 4, 1, 3, 1};
            case SDK_ASSET_ICON_SUBTRACT_VALUE:
                return new int[]{2, 1, 1, 2, 1, 2};
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                return new int[]{1, 2, 3, 4, 3, 2};
            case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                return new int[]{2, 2, 1, 1, 2, 4};
            case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                return new int[]{0, 2, 1, 2, 2, 2};
            case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                return new int[]{0, 0, 1, 2, 2, 2};
            case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                return new int[]{1, 2, 1, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                return new int[]{2, 4, 2, 1, 1, 2};
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public static long m(String str, int i10) {
        int[] k10 = k(s.d(str));
        if (i10 != 2) {
            if (i10 == 3) {
                return ((Long) f2415s.get(k10[1])).longValue();
            }
            if (i10 == 4) {
                return ((Long) f2416t.get(k10[2])).longValue();
            }
            if (i10 == 5) {
                return ((Long) f2417u.get(k10[3])).longValue();
            }
            if (i10 != 7) {
                if (i10 == 9) {
                    return ((Long) f2419w.get(k10[5])).longValue();
                }
                if (i10 != 10) {
                    return 1000000L;
                }
                return ((Long) f2418v.get(k10[4])).longValue();
            }
        }
        return ((Long) f2414r.get(k10[0])).longValue();
    }

    public static synchronized i n(Context context) {
        i iVar;
        synchronized (i.class) {
            try {
                if (f2420x == null) {
                    f2420x = new b(context).a();
                }
                iVar = f2420x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public static boolean o(C4418n c4418n, boolean z10) {
        return z10 && !c4418n.d(8);
    }

    @Override // h1.InterfaceC4403F
    public synchronized void a(InterfaceC4411g interfaceC4411g, C4418n c4418n, boolean z10) {
        try {
            if (o(c4418n, z10)) {
                if (this.f2427g == 0) {
                    this.f2428h = this.f2424d.b();
                }
                this.f2427g++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // D1.d
    public void d(Handler handler, d.a aVar) {
        AbstractC4134a.e(handler);
        AbstractC4134a.e(aVar);
        this.f2423c.b(handler, aVar);
    }

    @Override // D1.d
    public void e(d.a aVar) {
        this.f2423c.d(aVar);
    }

    @Override // h1.InterfaceC4403F
    public synchronized void f(InterfaceC4411g interfaceC4411g, C4418n c4418n, boolean z10, int i10) {
        if (o(c4418n, z10)) {
            this.f2429i += i10;
        }
    }

    @Override // D1.d
    public synchronized long h() {
        return this.f2432l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10.f2431k >= 524288) goto L22;
     */
    @Override // h1.InterfaceC4403F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void i(InterfaceC4411g interfaceC4411g, C4418n c4418n, boolean z10) {
        Throwable th2;
        i iVar;
        try {
            try {
                if (o(c4418n, z10)) {
                    AbstractC4134a.g(this.f2427g > 0);
                    long b10 = this.f2424d.b();
                    int i10 = (int) (b10 - this.f2428h);
                    this.f2430j += i10;
                    long j10 = this.f2431k;
                    long j11 = this.f2429i;
                    this.f2431k = j10 + j11;
                    if (i10 > 0) {
                        this.f2426f.c((int) Math.sqrt(j11), (j11 * 8000.0f) / i10);
                        if (this.f2430j < 2000) {
                            try {
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        this.f2432l = (long) this.f2426f.f(0.5f);
                        iVar = this;
                        iVar.p(i10, this.f2429i, this.f2432l);
                        iVar.f2428h = b10;
                        iVar.f2429i = 0L;
                    } else {
                        iVar = this;
                    }
                    iVar.f2427g--;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final long l(int i10) {
        Long l10 = (Long) this.f2422b.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = (Long) this.f2422b.get(0);
        } else if (l10.longValue() == -9223372036854775807L) {
            l10 = Long.valueOf(m(this.f2437q, i10));
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f2433m) {
            return;
        }
        this.f2433m = j11;
        this.f2423c.c(i10, j10, j11);
    }

    public final synchronized void q(int i10) {
        Throwable th2;
        try {
            try {
                int i11 = this.f2434n;
                if (i11 != 0) {
                    try {
                        if (!this.f2425e) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (this.f2435o) {
                    i10 = this.f2436p;
                }
                if (i11 != i10 || this.f2437q == null) {
                    this.f2434n = i10;
                    if (i10 == 1 || i10 == 0 || i10 == 8) {
                        return;
                    }
                    if (this.f2437q == null) {
                        this.f2437q = Z.X(this.f2421a);
                    }
                    this.f2432l = l(i10);
                    long b10 = this.f2424d.b();
                    p(this.f2427g > 0 ? (int) (b10 - this.f2428h) : 0, this.f2429i, this.f2432l);
                    this.f2428h = b10;
                    this.f2429i = 0L;
                    this.f2431k = 0L;
                    this.f2430j = 0L;
                    this.f2426f.g();
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public i(Context context, Map map, int i10, InterfaceC4143j interfaceC4143j, boolean z10) {
        this.f2421a = context == null ? null : context.getApplicationContext();
        this.f2422b = B.e(map);
        this.f2423c = new d.a.C0045a();
        this.f2426f = new r(i10);
        this.f2424d = interfaceC4143j;
        this.f2425e = z10;
        if (context == null) {
            this.f2434n = 0;
            this.f2432l = 1000000L;
            return;
        }
        C4133C e10 = C4133C.e(context);
        int g10 = e10.g();
        this.f2434n = g10;
        this.f2432l = l(g10);
        e10.k(new C4133C.c() { // from class: D1.h
            @Override // e1.C4133C.c
            public final void a(int i11) {
                i.this.q(i11);
            }
        }, AbstractC4136c.a());
    }

    @Override // D1.d
    public InterfaceC4403F g() {
        return this;
    }

    @Override // h1.InterfaceC4403F
    public void c(InterfaceC4411g interfaceC4411g, C4418n c4418n, boolean z10) {
    }
}
