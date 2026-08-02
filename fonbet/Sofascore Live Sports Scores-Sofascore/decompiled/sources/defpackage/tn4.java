package defpackage;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.C4427z5;
import com.ironsource.E9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.sofascore.model.mvvm.model.PlayerKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tn4 {
    public static final vvf p = hv9.y(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final vvf q = hv9.y(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final vvf r = hv9.y(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final vvf s = hv9.y(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final vvf t = hv9.y(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final vvf u = hv9.y(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static tn4 v;
    public final Context a;
    public final lv9 b;
    public final sz8 c;
    public final tqi d;
    public final boolean e;
    public final flh f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public String o;

    public tn4(Context context, HashMap hashMap) {
        boolean z;
        tqi tqiVar = tqi.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = lv9.f(hashMap);
        this.c = new sz8(10);
        this.f = new flh(1);
        this.d = tqiVar;
        this.e = true;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        nbd b = nbd.b(context);
        int f = b.f();
        this.n = f;
        this.l = a(f);
        rn4 rn4Var = new rn4(this);
        Executor u2 = dy0.u();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) b.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            lbd lbdVar = (lbd) it.next();
            if (lbdVar.a.get() == null) {
                copyOnWriteArrayList.remove(lbdVar);
            }
        }
        lbd lbdVar2 = new lbd(b, rn4Var, u2);
        synchronized (b.e) {
            ((CopyOnWriteArrayList) b.d).add(lbdVar2);
            z = b.a;
        }
        if (z) {
            lbdVar2.b.execute(new yp8(lbdVar2, 21));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final long a(int i) {
        int[] iArr;
        long longValue;
        Integer valueOf = Integer.valueOf(i);
        lv9 lv9Var = this.b;
        Long l = (Long) lv9Var.get(valueOf);
        if (l == null) {
            l = (Long) lv9Var.get(0);
        } else if (l.longValue() == C.TIME_UNSET) {
            String str = this.o;
            if (str == null) {
                str = "";
            }
            char c = 65535;
            switch (str.hashCode()) {
                case 2083:
                    if (str.equals("AD")) {
                        c = 0;
                        break;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2096:
                    if (str.equals("AQ")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 2097:
                    if (str.equals(PlayerKt.CRICKET_ALLROUNDER)) {
                        c = '\t';
                        break;
                    }
                    break;
                case 2098:
                    if (str.equals("AS")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        c = 11;
                        break;
                    }
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 2102:
                    if (str.equals("AW")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 2103:
                    if (str.equals("AX")) {
                        c = 14;
                        break;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        c = 15;
                        break;
                    }
                    break;
                case 2111:
                    if (str.equals("BA")) {
                        c = 16;
                        break;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        c = 17;
                        break;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        c = 18;
                        break;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        c = 19;
                        break;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        c = 20;
                        break;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        c = 21;
                        break;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        c = 22;
                        break;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        c = 23;
                        break;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        c = 24;
                        break;
                    }
                    break;
                case 2122:
                    if (str.equals("BL")) {
                        c = 25;
                        break;
                    }
                    break;
                case 2123:
                    if (str.equals(PlayerKt.CRICKET_BATTER)) {
                        c = 26;
                        break;
                    }
                    break;
                case 2124:
                    if (str.equals("BN")) {
                        c = 27;
                        break;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        c = 28;
                        break;
                    }
                    break;
                case 2127:
                    if (str.equals("BQ")) {
                        c = 29;
                        break;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        c = 30;
                        break;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        c = 31;
                        break;
                    }
                    break;
                case 2130:
                    if (str.equals("BT")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        c = '!';
                        break;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        c = '#';
                        break;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        c = '$';
                        break;
                    }
                    break;
                case 2145:
                    if (str.equals("CD")) {
                        c = '%';
                        break;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        c = '&';
                        break;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        c = '(';
                        break;
                    }
                    break;
                case 2150:
                    if (str.equals("CI")) {
                        c = ')';
                        break;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        c = '*';
                        break;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        c = '+';
                        break;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        c = ',';
                        break;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        c = '-';
                        break;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        c = '.';
                        break;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        c = '/';
                        break;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        c = '0';
                        break;
                    }
                    break;
                case 2163:
                    if (str.equals("CV")) {
                        c = '1';
                        break;
                    }
                    break;
                case 2164:
                    if (str.equals("CW")) {
                        c = '2';
                        break;
                    }
                    break;
                case 2165:
                    if (str.equals("CX")) {
                        c = '3';
                        break;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        c = '4';
                        break;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        c = '5';
                        break;
                    }
                    break;
                case 2177:
                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END)) {
                        c = '6';
                        break;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        c = '7';
                        break;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        c = '8';
                        break;
                    }
                    break;
                case 2185:
                    if (str.equals("DM")) {
                        c = '9';
                        break;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        c = ':';
                        break;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        c = ';';
                        break;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        c = '<';
                        break;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        c = C4427z5.U;
                        break;
                    }
                    break;
                case E9.a.e /* 2210 */:
                    if (str.equals("EG")) {
                        c = '>';
                        break;
                    }
                    break;
                case 2221:
                    if (str.equals("ER")) {
                        c = '?';
                        break;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        c = '@';
                        break;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2243:
                    if (str.equals("FI")) {
                        c = 'B';
                        break;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        c = 'C';
                        break;
                    }
                    break;
                case 2245:
                    if (str.equals("FK")) {
                        c = 'D';
                        break;
                    }
                    break;
                case 2247:
                    if (str.equals("FM")) {
                        c = 'E';
                        break;
                    }
                    break;
                case 2249:
                    if (str.equals("FO")) {
                        c = 'F';
                        break;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        c = 'G';
                        break;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        c = 'H';
                        break;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        c = 'I';
                        break;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        c = 'J';
                        break;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        c = 'K';
                        break;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        c = 'L';
                        break;
                    }
                    break;
                case 2272:
                    if (str.equals("GG")) {
                        c = 'M';
                        break;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        c = 'N';
                        break;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        c = 'O';
                        break;
                    }
                    break;
                case 2277:
                    if (str.equals("GL")) {
                        c = 'P';
                        break;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        c = 'Q';
                        break;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        c = 'R';
                        break;
                    }
                    break;
                case 2281:
                    if (str.equals("GP")) {
                        c = 'S';
                        break;
                    }
                    break;
                case 2282:
                    if (str.equals("GQ")) {
                        c = 'T';
                        break;
                    }
                    break;
                case 2283:
                    if (str.equals("GR")) {
                        c = 'U';
                        break;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        c = 'V';
                        break;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        c = 'W';
                        break;
                    }
                    break;
                case 2288:
                    if (str.equals("GW")) {
                        c = 'X';
                        break;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        c = 'Y';
                        break;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        c = 'Z';
                        break;
                    }
                    break;
                case 2314:
                    if (str.equals("HR")) {
                        c = '[';
                        break;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        c = '\\';
                        break;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        c = ']';
                        break;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        c = '^';
                        break;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        c = '_';
                        break;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        c = '`';
                        break;
                    }
                    break;
                case 2340:
                    if (str.equals("IM")) {
                        c = 'a';
                        break;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        c = 'b';
                        break;
                    }
                    break;
                case 2342:
                    if (str.equals("IO")) {
                        c = 'c';
                        break;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        c = 'd';
                        break;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        c = 'e';
                        break;
                    }
                    break;
                case 2346:
                    if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                        c = 'f';
                        break;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        c = 'g';
                        break;
                    }
                    break;
                case 2363:
                    if (str.equals("JE")) {
                        c = 'h';
                        break;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        c = 'i';
                        break;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        c = 'j';
                        break;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        c = 'k';
                        break;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        c = 'l';
                        break;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        c = 'm';
                        break;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        c = 'n';
                        break;
                    }
                    break;
                case 2398:
                    if (str.equals("KI")) {
                        c = 'o';
                        break;
                    }
                    break;
                case 2402:
                    if (str.equals("KM")) {
                        c = 'p';
                        break;
                    }
                    break;
                case 2403:
                    if (str.equals("KN")) {
                        c = 'q';
                        break;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        c = 'r';
                        break;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        c = 's';
                        break;
                    }
                    break;
                case 2414:
                    if (str.equals("KY")) {
                        c = 't';
                        break;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        c = 'u';
                        break;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        c = 'v';
                        break;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        c = 'w';
                        break;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        c = 'x';
                        break;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        c = 'y';
                        break;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        c = 'z';
                        break;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        c = '{';
                        break;
                    }
                    break;
                case 2439:
                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_LONG_SNAPPER)) {
                        c = '|';
                        break;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        c = '}';
                        break;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        c = '~';
                        break;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        c = 127;
                        break;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        c = 128;
                        break;
                    }
                    break;
                case 2452:
                    if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                        c = 129;
                        break;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        c = 130;
                        break;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        c = 131;
                        break;
                    }
                    break;
                case 2456:
                    if (str.equals("ME")) {
                        c = 132;
                        break;
                    }
                    break;
                case 2457:
                    if (str.equals("MF")) {
                        c = 133;
                        break;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        c = 134;
                        break;
                    }
                    break;
                case 2459:
                    if (str.equals("MH")) {
                        c = 135;
                        break;
                    }
                    break;
                case 2462:
                    if (str.equals("MK")) {
                        c = 136;
                        break;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        c = 137;
                        break;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        c = 138;
                        break;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        c = 139;
                        break;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        c = 140;
                        break;
                    }
                    break;
                case 2467:
                    if (str.equals("MP")) {
                        c = 141;
                        break;
                    }
                    break;
                case 2468:
                    if (str.equals("MQ")) {
                        c = 142;
                        break;
                    }
                    break;
                case 2469:
                    if (str.equals("MR")) {
                        c = 143;
                        break;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        c = 144;
                        break;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        c = 145;
                        break;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        c = 146;
                        break;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        c = 147;
                        break;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        c = 148;
                        break;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        c = 149;
                        break;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        c = 150;
                        break;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        c = 151;
                        break;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        c = 152;
                        break;
                    }
                    break;
                case 2485:
                    if (str.equals("NC")) {
                        c = 153;
                        break;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        c = 154;
                        break;
                    }
                    break;
                case 2488:
                    if (str.equals("NF")) {
                        c = 155;
                        break;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        c = 156;
                        break;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        c = 157;
                        break;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        c = 158;
                        break;
                    }
                    break;
                case 2497:
                    if (str.equals("NO")) {
                        c = 159;
                        break;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        c = 160;
                        break;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        c = 161;
                        break;
                    }
                    break;
                case E9.b.e /* 2503 */:
                    if (str.equals("NU")) {
                        c = 162;
                        break;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        c = 163;
                        break;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        c = 164;
                        break;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        c = 165;
                        break;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        c = 166;
                        break;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        c = 167;
                        break;
                    }
                    break;
                case 2551:
                    if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                        c = 168;
                        break;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        c = 169;
                        break;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        c = 170;
                        break;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        c = 171;
                        break;
                    }
                    break;
                case 2557:
                    if (str.equals("PM")) {
                        c = 172;
                        break;
                    }
                    break;
                case 2562:
                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER)) {
                        c = 173;
                        break;
                    }
                    break;
                case 2563:
                    if (str.equals("PS")) {
                        c = 174;
                        break;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        c = 175;
                        break;
                    }
                    break;
                case 2567:
                    if (str.equals("PW")) {
                        c = 176;
                        break;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        c = 177;
                        break;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        c = 178;
                        break;
                    }
                    break;
                case 2611:
                    if (str.equals("RE")) {
                        c = 179;
                        break;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        c = 180;
                        break;
                    }
                    break;
                case 2625:
                    if (str.equals("RS")) {
                        c = 181;
                        break;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        c = 182;
                        break;
                    }
                    break;
                case 2629:
                    if (str.equals("RW")) {
                        c = 183;
                        break;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        c = 184;
                        break;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        c = 185;
                        break;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        c = 186;
                        break;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        c = 187;
                        break;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        c = 188;
                        break;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        c = 189;
                        break;
                    }
                    break;
                case 2645:
                    if (str.equals("SH")) {
                        c = 190;
                        break;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        c = 191;
                        break;
                    }
                    break;
                case 2647:
                    if (str.equals("SJ")) {
                        c = 192;
                        break;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        c = 193;
                        break;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        c = 194;
                        break;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        c = 195;
                        break;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        c = 196;
                        break;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        c = 197;
                        break;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        c = 198;
                        break;
                    }
                    break;
                case 2656:
                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY)) {
                        c = 199;
                        break;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        c = 200;
                        break;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        c = 201;
                        break;
                    }
                    break;
                case 2661:
                    if (str.equals("SX")) {
                        c = 202;
                        break;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        c = 203;
                        break;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        c = 204;
                        break;
                    }
                    break;
                case 2671:
                    if (str.equals("TC")) {
                        c = 205;
                        break;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        c = 206;
                        break;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        c = 207;
                        break;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        c = 208;
                        break;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        c = 209;
                        break;
                    }
                    break;
                case 2680:
                    if (str.equals("TL")) {
                        c = 210;
                        break;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        c = 211;
                        break;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        c = 212;
                        break;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        c = 213;
                        break;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        c = 214;
                        break;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        c = 215;
                        break;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        c = 216;
                        break;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        c = 217;
                        break;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        c = 218;
                        break;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        c = 219;
                        break;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        c = 220;
                        break;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        c = 221;
                        break;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        c = 222;
                        break;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        c = 223;
                        break;
                    }
                    break;
                case 2731:
                    if (str.equals("VA")) {
                        c = 224;
                        break;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        c = 225;
                        break;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        c = 226;
                        break;
                    }
                    break;
                case 2737:
                    if (str.equals("VG")) {
                        c = 227;
                        break;
                    }
                    break;
                case 2739:
                    if (str.equals("VI")) {
                        c = 228;
                        break;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        c = 229;
                        break;
                    }
                    break;
                case 2751:
                    if (str.equals("VU")) {
                        c = 230;
                        break;
                    }
                    break;
                case 2767:
                    if (str.equals("WF")) {
                        c = 231;
                        break;
                    }
                    break;
                case 2780:
                    if (str.equals("WS")) {
                        c = 232;
                        break;
                    }
                    break;
                case 2803:
                    if (str.equals("XK")) {
                        c = 233;
                        break;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        c = 234;
                        break;
                    }
                    break;
                case 2843:
                    if (str.equals("YT")) {
                        c = 235;
                        break;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        c = 236;
                        break;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        c = 237;
                        break;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        c = 238;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 4:
                case 17:
                case 29:
                case '2':
                case '9':
                case 'q':
                case GZIP_ENCODE_ERROR_VALUE:
                case 202:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case ')':
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case '\b':
                case '?':
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case '\t':
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case '\n':
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case '=':
                case ']':
                case 'f':
                case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case '\f':
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case '\r':
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case '3':
                case TPAT_ERROR_VALUE:
                case 144:
                case 172:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case '7':
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case 'j':
                case INVALID_GZIP_BID_PAYLOAD_VALUE:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case 20:
                case 187:
                case 203:
                case 206:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case 175:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 'T':
                case '\\':
                case 154:
                case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 25:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case 26:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case 28:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case 30:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case 31:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case ' ':
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case '!':
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case '\"':
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case '#':
                case '*':
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case '$':
                case MRAID_JS_COPY_FAILED_VALUE:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case '%':
                case TPAT_RETRY_FAILED_VALUE:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case '&':
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case '\'':
                case '>':
                case 134:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case '(':
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case '+':
                case INVALID_BID_PAYLOAD_VALUE:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case ',':
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case '-':
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case '.':
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case '/':
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case '0':
                case 'o':
                case 161:
                case AD_NOT_LOADED_VALUE:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case '1':
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case '4':
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case '5':
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case '6':
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case '8':
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case ':':
                case INVALID_RI_ENDPOINT_VALUE:
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case ';':
                case INVALID_JSON_BID_PAYLOAD_VALUE:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case '<':
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case '@':
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 'A':
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 'B':
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 'C':
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 'D':
                case 155:
                case PsExtractor.AUDIO_STREAM /* 192 */:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 'E':
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 'F':
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 'G':
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 'H':
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 'O':
                case 'a':
                case 'h':
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 'P':
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 'Q':
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 'R':
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 'S':
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 'U':
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 'V':
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 'W':
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 'X':
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 'Z':
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case '[':
                case INVALID_INDEX_URL_VALUE:
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case '_':
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case '`':
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 'b':
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case 'c':
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case 'd':
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 'e':
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case 'g':
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 'i':
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 'k':
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 'l':
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 'm':
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 'n':
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 'p':
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case ASSET_WRITE_ERROR_VALUE:
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case ASSET_FAILED_STATUS_CODE_VALUE:
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 'x':
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case INVALID_ADS_ENDPOINT_VALUE:
                case 138:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case INVALID_METRICS_ENDPOINT_VALUE:
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case MRAID_JS_WRITE_FAILED_VALUE:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case OMSDK_JS_WRITE_FAILED_VALUE:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case 135:
                case 211:
                case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case PRIVACY_URL_ERROR_VALUE:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case 160:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 185 */:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 205:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 207:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case PLACEMENT_SLEEP_VALUE:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case AD_RESPONSE_EMPTY_VALUE:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case AD_RESPONSE_TIMED_OUT_VALUE:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case MRAID_JS_DOES_NOT_EXIST_VALUE:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case AD_RESPONSE_RETRY_AFTER_VALUE:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case STALE_CACHED_RESPONSE_VALUE:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case INVALID_CSB_DATA_VALUE:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i != 2) {
                if (i == 3) {
                    longValue = ((Long) q.get(iArr[1])).longValue();
                } else if (i == 4) {
                    longValue = ((Long) r.get(iArr[2])).longValue();
                } else if (i == 5) {
                    longValue = ((Long) s.get(iArr[3])).longValue();
                } else if (i != 7) {
                    longValue = i != 9 ? i != 10 ? 1000000L : ((Long) t.get(iArr[4])).longValue() : ((Long) u.get(iArr[5])).longValue();
                }
                l = Long.valueOf(longValue);
            }
            longValue = ((Long) p.get(iArr[0])).longValue();
            l = Long.valueOf(longValue);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void b(int i, long j, long j2) {
        int i2;
        long j3;
        long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            hz0 hz0Var = (hz0) it.next();
            if (hz0Var.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                hz0Var.a.post(new fz0(hz0Var, i2, j3, j4, 1));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }
}
