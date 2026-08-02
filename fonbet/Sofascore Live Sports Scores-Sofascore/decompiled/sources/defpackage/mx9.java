package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.w;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.gms.internal.wearable.zzdg;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.DateSection;
import com.sofascore.model.FirebaseNonGoogleAdsCountry;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.util.ValueWrapper;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mx9 implements tz2, f, c6h, e4o, zzqp, zzyh, f6b, vuj, q0g, f7h, y0i {
    public static long c;
    public static final mx9 a = new mx9();
    public static final mx9 b = new mx9();
    public static final /* synthetic */ mx9 d = new mx9();
    public static final mx9 e = new mx9();
    public static final /* synthetic */ mx9 f = new mx9();
    public static final mx9 g = new mx9();
    public static final o7h h = new o7h(null, null, null, null, null);
    public static final mx9 i = new mx9();
    public static final mx9 j = new mx9();
    public static final mx9 k = new mx9();
    public static final mx9 l = new mx9();
    public static final mx9 m = new mx9();
    public static final mx9 n = new mx9();
    public static final mx9 o = new mx9();

    public static final void A() {
        if (cw3.a.contains(mx9.class)) {
            return;
        }
        try {
            w();
            try {
                SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long currentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", currentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", currentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            cw3.a(mx9.class, th);
        }
    }

    public static final void k() {
        if (cw3.a.contains(mx9.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = w.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            w.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th) {
            cw3.a(mx9.class, th);
        }
    }

    public static zq4 l(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod(C4094gc.a);
        httpURLConnection.connect();
        return new zq4(httpURLConnection, 0);
    }

    public static final void m(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, boolean z, String str, int i2, boolean z2) {
        Set set = cw3.a;
        if (set.contains(mx9.class)) {
            return;
        }
        try {
            concurrentHashMap.getClass();
            concurrentHashMap2.getClass();
            str.getClass();
            if (i2 == 0) {
                throw null;
            }
            mx9 mx9Var = a;
            LinkedHashMap j2 = mx9Var.j(mx9Var.i(concurrentHashMap, z), concurrentHashMap2, str);
            if (set.contains(mx9Var)) {
                return;
            }
            try {
                for (Map.Entry entry : j2.entrySet()) {
                    qv0.d(z, i2, (String) entry.getKey(), z2, (String) entry.getValue());
                }
            } catch (Throwable th) {
                cw3.a(mx9Var, th);
            }
        } catch (Throwable th2) {
            cw3.a(mx9.class, th2);
        }
    }

    public static String p(Context context, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        context.getClass();
        boolean z = (num4 == null && num5 == null) ? false : true;
        if (Intrinsics.c(str, Sports.ICE_HOCKEY) && num6 != null) {
            return s(num6.intValue());
        }
        if (CollectionsKt.R(b.j(Sports.AMERICAN_FOOTBALL, Sports.BASKETBALL, Sports.ICE_HOCKEY), str) && z) {
            return num5 != null ? s(num5.intValue()) : num4 != null ? r(num4.intValue(), context) : "-";
        }
        if (Intrinsics.c(str, Sports.HANDBALL) && num2 != null) {
            return s(num2.intValue());
        }
        if (num == null) {
            return "-";
        }
        if (num3 == null) {
            return r(num.intValue(), context);
        }
        Locale d2 = dla.d();
        String string = context.getString(R.string.minutes_added_time_template);
        string.getClass();
        return String.format(d2, string, Arrays.copyOf(new Object[]{num, num3}, 2));
    }

    public static String r(int i2, Context context) {
        context.getClass();
        Locale d2 = dla.d();
        String string = context.getString(R.string.minutes_template);
        string.getClass();
        return String.format(d2, string, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
    }

    public static String s(int i2) {
        int i3 = i2 / 60;
        return String.format(dla.d(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2 - (i3 * 60))}, 2));
    }

    public static Intent t(Context context, do7 do7Var, ip6 ip6Var) {
        context.getClass();
        do7Var.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasyCompetitionActivity.class);
        intent.putExtra("USER_COMPETITION_EXTRA", do7Var);
        intent.putExtra("FANTASY_INITIAL_TAB", ip6Var);
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x0726, code lost:
    
        if ((r2 != null ? r2.getEventListColor() : null) != null) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0445, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r3.getEventList(), java.lang.Boolean.TRUE) != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0470, code lost:
    
        if (r3 != r11.intValue()) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05b9, code lost:
    
        if ((r8 != null ? r8.getEventListColor() : r19) != null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0666, code lost:
    
        if ((r4 != null ? r4.getEventListColor() : r19) != null) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0547, code lost:
    
        if ((r8 != null ? r8.getEventListColor() : r19) != null) goto L279;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x029b  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.sofascore.local_persistance.BrandColors] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [com.sofascore.local_persistance.BrandColors] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v37, types: [com.sofascore.model.mvvm.model.TeamSides, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [y21] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.sofascore.local_persistance.BrandColors] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList u(Context context, List list, List list2, y16 y16Var, boolean z, boolean z2, boolean z3, boolean z4, z16 z16Var, int i2) {
        boolean z5;
        List<Transfer> list3;
        y16 y16Var2;
        boolean z6;
        Map map;
        int i3;
        LinkedHashSet linkedHashSet;
        boolean z7;
        boolean z8;
        Map map2;
        Map map3;
        int i4;
        Tournament tournament;
        Tournament tournament2;
        boolean z9;
        ValueWrapper valueWrapper;
        Integer num;
        Brand brand;
        Tournament tournament3;
        boolean z10;
        boolean z11;
        BrandColors brandColors;
        Object obj;
        Boolean bool;
        Object obj2;
        BrandColors brandColors2;
        boolean z12;
        int i5;
        Brand brand2;
        boolean z13;
        Brand brand3;
        Map map4;
        int i6;
        boolean z14;
        y16 y16Var3;
        boolean z15;
        Long l2;
        Iterator it;
        List list4;
        List list5 = (i2 & 4) != 0 ? null : list2;
        y16 y16Var4 = (i2 & 8) != 0 ? null : y16Var;
        boolean z16 = (i2 & 16) != 0 ? true : z;
        boolean z17 = (i2 & 32) != 0 ? false : z2;
        boolean z18 = (i2 & 64) != 0 ? false : z3;
        boolean z19 = (i2 & 128) == 0;
        boolean z20 = (i2 & 512) == 0;
        boolean z21 = (i2 & 1024) != 0 ? false : z4;
        z16 z16Var2 = (i2 & a.o) != 0 ? null : z16Var;
        boolean z22 = (i2 & 4096) == 0;
        context.getClass();
        list.getClass();
        if (z18 && z17) {
            c = 0L;
        }
        ArrayList w0 = CollectionsKt.w0(km5.a, CollectionsKt.w0(list, z19 ? kotlin.collections.a.c(new CustomizableDivider(false, 0, false, null, 14, null)) : km5.a));
        fsf fsfVar = new fsf();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = w0.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof Event) {
                arrayList3.add(next);
            }
        }
        BrandingTournament brandingTournament = null;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (Intrinsics.c(z16Var2 != null ? Boolean.valueOf(z16Var2.a) : null, Boolean.TRUE)) {
            z5 = z22;
            lwj n2 = i5h.n(new oh0(arrayList3, 1), new k1e(7, new x16(linkedHashSet2, 0)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it3 = n2.a.iterator();
            while (it3.hasNext()) {
                lwj lwjVar = n2;
                Object invoke = n2.b.invoke(it3.next());
                Integer F = o3a.F(((Event) invoke).getTournament());
                Object obj3 = linkedHashMap.get(F);
                if (obj3 == null) {
                    list4 = list5;
                    ArrayList arrayList4 = new ArrayList();
                    linkedHashMap.put(F, arrayList4);
                    obj3 = arrayList4;
                } else {
                    list4 = list5;
                }
                ((List) obj3).add(invoke);
                n2 = lwjVar;
                list5 = list4;
            }
            list3 = list5;
            arrayList3 = new ArrayList();
            Iterator it4 = linkedHashMap.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                Integer num2 = (Integer) entry.getKey();
                List list6 = (List) entry.getValue();
                if (num2 != null) {
                    w5d w5dVar = w5d.a;
                    w5dVar.getClass();
                    it = it4;
                    list6 = CollectionsKt.H0(list6, new cp(new n93(w5dVar, 0), 10));
                } else {
                    it = it4;
                }
                o13.v(list6, arrayList3);
                it4 = it;
            }
        } else {
            z5 = z22;
            list3 = list5;
        }
        if (z17) {
            Event event = (Event) CollectionsKt.firstOrNull(arrayList3);
            Long valueOf = event != null ? Long.valueOf(event.getStartTimestamp()) : null;
            Event event2 = (Event) CollectionsKt.j0(arrayList3);
            Long valueOf2 = event2 != null ? Long.valueOf(event2.getStartTimestamp()) : null;
            if (valueOf != null && valueOf2 != null) {
                long v = yaa.v() / 1000;
                if (list3 != null) {
                    for (Transfer transfer : list3) {
                        Long l3 = valueOf;
                        int transferDateTimestamp = transfer.getTransferDateTimestamp();
                        long longValue = l3.longValue();
                        if (1 <= longValue) {
                            y16Var3 = y16Var4;
                            z15 = z16;
                            long j2 = transferDateTimestamp;
                            if (longValue < j2 && j2 < v) {
                                arrayList2.add(transfer);
                                l2 = valueOf2;
                                valueOf = l3;
                                valueOf2 = l2;
                                y16Var4 = y16Var3;
                                z16 = z15;
                            }
                        } else {
                            y16Var3 = y16Var4;
                            z15 = z16;
                        }
                        long longValue2 = valueOf2.longValue() + 1;
                        long longValue3 = l3.longValue();
                        l2 = valueOf2;
                        long j3 = transferDateTimestamp;
                        if (longValue2 <= j3 && j3 < longValue3) {
                            arrayList2.add(transfer);
                        }
                        valueOf = l3;
                        valueOf2 = l2;
                        y16Var4 = y16Var3;
                        z16 = z15;
                    }
                    y16Var2 = y16Var4;
                    z6 = z16;
                    Unit unit = Unit.a;
                    if (z21) {
                        map = lm5.a;
                        map.getClass();
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj4 : arrayList3) {
                            Integer v2 = ok3.v((Event) obj4);
                            Object obj5 = linkedHashMap2.get(v2);
                            if (obj5 == null) {
                                obj5 = new ArrayList();
                                linkedHashMap2.put(v2, obj5);
                            }
                            ((List) obj5).add(obj4);
                        }
                        Collection values = linkedHashMap2.values();
                        ArrayList arrayList5 = new ArrayList(k13.r(values, 10));
                        int i7 = 0;
                        for (Object obj6 : values) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                b.q();
                                throw null;
                            }
                            arrayList5.add(new Pair(Integer.valueOf(((Event) CollectionsKt.h0((List) obj6)).getId()), Integer.valueOf(i7)));
                            i7 = i8;
                        }
                        map = tub.o(arrayList5);
                    }
                    int size = map.size() - 1;
                    Event event3 = (Event) CollectionsKt.firstOrNull(arrayList3);
                    boolean e2 = wyh.e(event3 == null ? ok3.s(event3) : null);
                    ValueWrapper valueWrapper2 = new ValueWrapper(Boolean.FALSE);
                    int i9 = 0;
                    if (Intrinsics.c(z16Var2 == null ? Boolean.valueOf(z16Var2.a) : null, Boolean.TRUE)) {
                        Iterator it5 = arrayList3.iterator();
                        ArrayList arrayList6 = new ArrayList(k13.r(w0, 10));
                        Iterator it6 = w0.iterator();
                        while (it6.hasNext()) {
                            Object next2 = it6.next();
                            Iterator it7 = it5;
                            if (next2 instanceof Event) {
                                next2 = it7.hasNext() ? (Event) it7.next() : (Event) next2;
                            }
                            arrayList6.add(next2);
                            it5 = it7;
                        }
                        w0 = arrayList6;
                    }
                    Integer num3 = null;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    boolean z23 = false;
                    boolean z24 = false;
                    for (Object obj7 : w0) {
                        boolean z25 = z17;
                        int i14 = i12 + 1;
                        if (i12 < 0) {
                            b.q();
                            throw null;
                        }
                        int i15 = i12;
                        if (obj7 instanceof DateSection) {
                            arrayList.add(obj7);
                            i3 = size;
                            linkedHashSet = linkedHashSet2;
                            z7 = z21;
                            i10 = 0;
                            z8 = z5;
                            map2 = map;
                        } else if (obj7 instanceof Event) {
                            if (z25) {
                                if (!arrayList2.isEmpty()) {
                                    long startTimestamp = ((Event) obj7).getStartTimestamp();
                                    Iterator it8 = arrayList2.iterator();
                                    while (it8.hasNext()) {
                                        Iterator it9 = it8;
                                        Transfer transfer2 = (Transfer) it8.next();
                                        if (i15 == 0 && c == 0) {
                                            z14 = z21;
                                            map4 = map;
                                            i6 = size;
                                            if (transfer2.getTransferDateTimestamp() > startTimestamp) {
                                                arrayList.add(transfer2);
                                            }
                                        } else {
                                            map4 = map;
                                            i6 = size;
                                            z14 = z21;
                                            long j4 = c;
                                            long transferDateTimestamp2 = transfer2.getTransferDateTimestamp();
                                            if (startTimestamp <= transferDateTimestamp2 && transferDateTimestamp2 <= j4) {
                                                arrayList.add(transfer2);
                                            }
                                        }
                                        it8 = it9;
                                        z21 = z14;
                                        map = map4;
                                        size = i6;
                                    }
                                }
                                map3 = map;
                                i4 = size;
                                z7 = z21;
                                c = ((Event) obj7).getStartTimestamp();
                            } else {
                                map3 = map;
                                i4 = size;
                                z7 = z21;
                            }
                            Event event4 = (Event) obj7;
                            Tournament tournament4 = event4.getTournament();
                            tournament4.setSeason(event4.getSeason());
                            if (tournament4.getId() == i10 && !(CollectionsKt.j0(arrayList) instanceof Transfer)) {
                                z8 = z5;
                                linkedHashSet = linkedHashSet2;
                            } else {
                                if (z6) {
                                    Object j0 = CollectionsKt.j0(arrayList);
                                    if (z20) {
                                        ?? r3 = j0 instanceof y21 ? (y21) j0 : brandingTournament;
                                        if (r3 != 0) {
                                            r3.n = true;
                                            Unit unit2 = Unit.a;
                                        }
                                    }
                                    if (e2) {
                                        valueWrapper2.setValue(Boolean.valueOf(((float) i13) / ((float) i11) >= 0.75f));
                                        valueWrapper2 = new ValueWrapper(Boolean.FALSE);
                                        i11 = 0;
                                        i13 = 0;
                                    }
                                    boolean z26 = (j0 instanceof y21) || (j0 instanceof j04);
                                    BrandingTournament C = ccd.C(context, o3a.F(tournament4));
                                    if (C != null) {
                                        tournament2 = tournament4;
                                    } else {
                                        tournament2 = tournament4;
                                    }
                                    C = brandingTournament;
                                    fsfVar.a = C;
                                    Brand brand4 = C != null ? C.getBrand() : brandingTournament;
                                    if (z7 && fsfVar.a != null) {
                                        if (num3 != null) {
                                            int intValue = num3.intValue();
                                            Integer F2 = o3a.F(tournament2);
                                            if (F2 != null) {
                                            }
                                        }
                                        z9 = true;
                                        if (z9 || brand4 == null || Intrinsics.c(i9, o3a.F(tournament2))) {
                                            z23 = z9;
                                            valueWrapper = valueWrapper2;
                                        } else {
                                            num3 = o3a.F(tournament2);
                                            z23 = z9;
                                            valueWrapper = valueWrapper2;
                                            arrayList.add(new m32(brand4, o3a.F(tournament2), BrandLocation.MainList, z26));
                                        }
                                        num = num3;
                                        boolean c2 = Intrinsics.c(i9, o3a.F(tournament2));
                                        boolean contains = linkedHashSet2.contains(Integer.valueOf(tournament2.getId()));
                                        if (z16Var2 == null && ((c2 && contains) || z16Var2.b)) {
                                            tournament3 = tournament2;
                                            z10 = z5;
                                            brand = brand4;
                                            z11 = z26;
                                        } else {
                                            Object obj8 = z16Var2 == null ? Boolean.TRUE : brandingTournament;
                                            Boolean bool2 = Boolean.TRUE;
                                            brand = brand4;
                                            lrj R = w3a.R(tournament2, context, z23 && z26 && !z20 && !z24, !event4.getCrowdsourcingEnabled() || Intrinsics.c(event4.isEditor(), bool2), false, z5, !Intrinsics.c(obj8, bool2) && linkedHashSet2.contains(Integer.valueOf(tournament2.getId())), event4.getSeason(), 8);
                                            tournament3 = tournament2;
                                            z10 = z5;
                                            R.k = z20;
                                            if ((brand == null ? brand.getColor() : brandingTournament) == null) {
                                                BrandingTournament brandingTournament2 = (BrandingTournament) fsfVar.a;
                                            }
                                            if (Intrinsics.c(num, o3a.F(tournament3))) {
                                                BrandingTournament brandingTournament3 = (BrandingTournament) fsfVar.a;
                                                ?? eventListColor = brandingTournament3 != null ? brandingTournament3.getEventListColor() : brandingTournament;
                                                if (brand != null) {
                                                    z11 = z26;
                                                    brandColors = brand.getColor();
                                                } else {
                                                    z11 = z26;
                                                    brandColors = brandingTournament;
                                                }
                                                R.i = new pv5(eventListColor, brandColors);
                                                arrayList.add(R);
                                            }
                                            z11 = z26;
                                            arrayList.add(R);
                                        }
                                        obj = z16Var2 == null ? Boolean.TRUE : brandingTournament;
                                        bool = Boolean.TRUE;
                                        if (Intrinsics.c(obj, bool)) {
                                            linkedHashSet = linkedHashSet2;
                                        } else {
                                            String groupSign = tournament3.getGroupSign();
                                            String groupName = tournament3.getGroupName();
                                            if (groupSign == null || groupName == null) {
                                                linkedHashSet = linkedHashSet2;
                                                obj2 = brandingTournament;
                                            } else {
                                                krj krjVar = new krj(tournament3.getId(), groupName);
                                                if ((brand != null ? brand.getColor() : brandingTournament) == null) {
                                                    BrandingTournament brandingTournament4 = (BrandingTournament) fsfVar.a;
                                                }
                                                if (Intrinsics.c(num, o3a.F(tournament3))) {
                                                    BrandingTournament brandingTournament5 = (BrandingTournament) fsfVar.a;
                                                    ?? eventListColor2 = brandingTournament5 != null ? brandingTournament5.getEventListColor() : brandingTournament;
                                                    if (brand != null) {
                                                        linkedHashSet = linkedHashSet2;
                                                        brandColors2 = brand.getColor();
                                                    } else {
                                                        linkedHashSet = linkedHashSet2;
                                                        brandColors2 = brandingTournament;
                                                    }
                                                    krjVar.d = new pv5(eventListColor2, brandColors2);
                                                    obj2 = Boolean.valueOf(arrayList.add(krjVar));
                                                }
                                                linkedHashSet = linkedHashSet2;
                                                obj2 = Boolean.valueOf(arrayList.add(krjVar));
                                            }
                                            if (obj2 == null) {
                                                if (Intrinsics.c(z16Var2 != null ? Boolean.valueOf(z16Var2.b) : brandingTournament, bool)) {
                                                    Tournament tournament5 = tournament3;
                                                    boolean z27 = z10;
                                                    lrj R2 = w3a.R(tournament5, context, z11 && !z20, event4.getCrowdsourcingEnabled() || Intrinsics.c(event4.isEditor(), bool), false, z27, false, event4.getSeason(), 40);
                                                    tournament = tournament5;
                                                    z8 = z27;
                                                    R2.k = z20;
                                                    if ((brand != null ? brand.getColor() : brandingTournament) == null) {
                                                        BrandingTournament brandingTournament6 = (BrandingTournament) fsfVar.a;
                                                    }
                                                    if (Intrinsics.c(num, o3a.F(tournament))) {
                                                        BrandingTournament brandingTournament7 = (BrandingTournament) fsfVar.a;
                                                        R2.i = new pv5(brandingTournament7 != null ? brandingTournament7.getEventListColor() : brandingTournament, brand != null ? brand.getColor() : brandingTournament);
                                                    }
                                                    arrayList.add(R2);
                                                } else {
                                                    tournament = tournament3;
                                                    z8 = z10;
                                                }
                                                Unit unit3 = Unit.a;
                                                num3 = num;
                                                valueWrapper2 = valueWrapper;
                                            }
                                        }
                                        tournament = tournament3;
                                        z8 = z10;
                                        num3 = num;
                                        valueWrapper2 = valueWrapper;
                                    }
                                    z9 = false;
                                    if (z9) {
                                    }
                                    z23 = z9;
                                    valueWrapper = valueWrapper2;
                                    num = num3;
                                    boolean c22 = Intrinsics.c(i9, o3a.F(tournament2));
                                    boolean contains2 = linkedHashSet2.contains(Integer.valueOf(tournament2.getId()));
                                    if (z16Var2 == null) {
                                    }
                                    if (z16Var2 == null) {
                                    }
                                    Boolean bool22 = Boolean.TRUE;
                                    if (Intrinsics.c(obj8, bool22)) {
                                    }
                                    if (z23) {
                                    }
                                    brand = brand4;
                                    lrj R3 = w3a.R(tournament2, context, z23 && z26 && !z20 && !z24, !event4.getCrowdsourcingEnabled() || Intrinsics.c(event4.isEditor(), bool22), false, z5, !Intrinsics.c(obj8, bool22) && linkedHashSet2.contains(Integer.valueOf(tournament2.getId())), event4.getSeason(), 8);
                                    tournament3 = tournament2;
                                    z10 = z5;
                                    R3.k = z20;
                                    if ((brand == null ? brand.getColor() : brandingTournament) == null) {
                                    }
                                    if (Intrinsics.c(num, o3a.F(tournament3))) {
                                    }
                                    z11 = z26;
                                    arrayList.add(R3);
                                    if (z16Var2 == null) {
                                    }
                                    bool = Boolean.TRUE;
                                    if (Intrinsics.c(obj, bool)) {
                                    }
                                    tournament = tournament3;
                                    z8 = z10;
                                    num3 = num;
                                    valueWrapper2 = valueWrapper;
                                } else {
                                    z8 = z5;
                                    linkedHashSet = linkedHashSet2;
                                    tournament = tournament4;
                                }
                                i10 = tournament.getId();
                                i9 = o3a.F(tournament);
                                z24 = z23;
                            }
                            y21 J = s9a.J(event4, context, z8, false, y16Var2, 10);
                            if (e2) {
                                J.N = valueWrapper2;
                                ?? r2 = brandingTournament;
                                z12 = true;
                                Country country = Event.getHomeTeam$default(event4, r2, 1, r2).getCountry();
                                int i16 = (country != null ? country.getAlpha2() : r2) != null ? 1 : 0;
                                Country country2 = Event.getAwayTeam$default(event4, r2, 1, r2).getCountry();
                                i13 += ((country2 != null ? country2.getAlpha2() : null) != null ? 1 : 0) + i16;
                                i11 += 2;
                            } else {
                                z12 = true;
                            }
                            if (z7 && z23) {
                                BrandingTournament brandingTournament8 = (BrandingTournament) fsfVar.a;
                                if (((brandingTournament8 == null || (brand3 = brandingTournament8.getBrand()) == null) ? null : brand3.getColor()) == null) {
                                    BrandingTournament brandingTournament9 = (BrandingTournament) fsfVar.a;
                                }
                                BrandingTournament brandingTournament10 = (BrandingTournament) fsfVar.a;
                                BrandColors eventListColor3 = brandingTournament10 != null ? brandingTournament10.getEventListColor() : null;
                                BrandingTournament brandingTournament11 = (BrandingTournament) fsfVar.a;
                                J.p = new pv5(eventListColor3, (brandingTournament11 == null || (brand2 = brandingTournament11.getBrand()) == null) ? null : brand2.getColor());
                                map2 = map3;
                                Integer num4 = (Integer) map2.get(Integer.valueOf(J.d().getId()));
                                J.n = num4 != null ? z12 : false;
                                if (num4 == null) {
                                    i5 = i4;
                                } else {
                                    i5 = i4;
                                    if (num4.intValue() == i5) {
                                        z13 = z12;
                                        J.o = z13;
                                    }
                                }
                                z13 = false;
                                J.o = z13;
                            } else {
                                map2 = map3;
                                i5 = i4;
                            }
                            arrayList.add(J);
                            i3 = i5;
                        } else {
                            i3 = size;
                            linkedHashSet = linkedHashSet2;
                            z7 = z21;
                            z8 = z5;
                            map2 = map;
                            arrayList.add(obj7);
                        }
                        z5 = z8;
                        map = map2;
                        z17 = z25;
                        i12 = i14;
                        z21 = z7;
                        size = i3;
                        linkedHashSet2 = linkedHashSet;
                        brandingTournament = null;
                    }
                    valueWrapper2.setValue(Boolean.valueOf(((float) i13) / ((float) i11) < 0.75f));
                    return arrayList;
                }
            }
        }
        y16Var2 = y16Var4;
        z6 = z16;
        if (z21) {
        }
        int size2 = map.size() - 1;
        Event event32 = (Event) CollectionsKt.firstOrNull(arrayList3);
        boolean e22 = wyh.e(event32 == null ? ok3.s(event32) : null);
        ValueWrapper valueWrapper22 = new ValueWrapper(Boolean.FALSE);
        int i92 = 0;
        if (Intrinsics.c(z16Var2 == null ? Boolean.valueOf(z16Var2.a) : null, Boolean.TRUE)) {
        }
        Integer num32 = null;
        int i102 = 0;
        int i112 = 0;
        int i122 = 0;
        int i132 = 0;
        boolean z232 = false;
        boolean z242 = false;
        while (r3.hasNext()) {
        }
        valueWrapper22.setValue(Boolean.valueOf(((float) i132) / ((float) i112) < 0.75f));
        return arrayList;
    }

    public static final void v() {
        List split$default;
        if (cw3.a.contains(mx9.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long max = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = w.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{";"}, false, 2, 2, null);
                        long parseLong = Long.parseLong((String) split$default.get(1)) * 1000;
                        if (Math.abs(String.valueOf(parseLong).length() - 13) < Math.log10(1000.0d)) {
                            max = Math.max(max, parseLong);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", max).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", max).apply();
            k();
        } catch (Throwable th) {
            cw3.a(mx9.class, th);
        }
    }

    public static final void w() {
        if (cw3.a.contains(mx9.class)) {
            return;
        }
        try {
            try {
                w.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            cw3.a(mx9.class, th);
        }
    }

    public static boolean x(boolean z) {
        Object u2gVar;
        yea yeaVar = j58.a;
        int i2 = ke0.c;
        ia0 ia0Var = ia0.q;
        xk b2 = pk.b(ok3.p(), false);
        if (b2 == null) {
            yea yeaVar2 = j58.a;
            e58 f2 = e58.f();
            f2.getClass();
            String g2 = f2.g("non_google_ad_countries");
            Object obj = null;
            if (g2.length() != 0) {
                try {
                    p2g p2gVar = w2g.b;
                    yeaVar2.getClass();
                    u2gVar = yeaVar2.b(new xg0(FirebaseNonGoogleAdsCountry.INSTANCE.serializer(), 0), g2);
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                Throwable a2 = w2g.a(u2gVar);
                if (a2 != null) {
                    s38.a().c(a2);
                }
                if (!(u2gVar instanceof u2g)) {
                    obj = u2gVar;
                }
            }
            List list = (List) obj;
            if (list == null || list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<Integer> mcc = ((FirebaseNonGoogleAdsCountry) it.next()).getMcc();
                if (mcc == null || !mcc.contains(Integer.valueOf(i2))) {
                }
            }
            return false;
        }
        if (b2 != xk.d) {
            return false;
        }
        return z ? wib.g : true;
    }

    public static void y(Context context) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) NotificationSettingsActivity.class);
        intent.putExtra("PRESELECTED_SETTING_NAME", (String) null);
        intent.putExtra("PRESELECTED_GROUP_NAME", (String) null);
        context.startActivity(intent);
    }

    public static void z(Context context, int i2, int i3) {
        int i4 = FantasyCompetitionActivity.R;
        ip6 ip6Var = ip6.c;
        if ((i3 & 8) != 0) {
            ip6Var = null;
        }
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasyCompetitionActivity.class);
        intent.putExtra("competitionId", i2);
        intent.putExtra("START_FIXTURE_REVEAL", false);
        intent.putExtra("FANTASY_INITIAL_TAB", ip6Var);
        context.startActivity(intent);
    }

    @Override // defpackage.e4o, defpackage.eqo
    public boolean a(Class cls) {
        return zzdg.class.isAssignableFrom(cls);
    }

    @Override // defpackage.e4o
    /* renamed from: b */
    public m6o mo783b(Class cls) {
        if (!zzdg.class.isAssignableFrom(cls)) {
            a70.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (m6o) zzdg.j(cls.asSubclass(zzdg.class)).d(3, null);
        } catch (Exception e2) {
            vp2.e("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.f6b
    public void c(s6b s6bVar) {
        s6bVar.onStart();
    }

    @Override // defpackage.y0i
    public StackTraceElement[] e(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // defpackage.tz2
    public String g() {
        return "identity";
    }

    @Override // defpackage.c6h
    public Object getDefaultValue() {
        return h;
    }

    public HashMap i(Map map, boolean z) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            map.getClass();
            SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j2 = z ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long j3 = 0;
            for (Map.Entry entry : tub.p(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j4 = jSONObject.getLong("purchaseTime");
                        if (j4 <= j2) {
                            map.remove(str);
                        }
                        j3 = Math.max(j3, j4);
                    }
                } catch (Exception unused) {
                }
            }
            if (j3 >= j2) {
                if (z) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", j3).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", j3).apply();
                }
            }
            return new HashMap(map);
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public LinkedHashMap j(HashMap hashMap, Map map, String str) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            hashMap.getClass();
            map.getClass();
            str.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map.get(str2);
                try {
                    jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, str);
                    if (jSONObject2 != null) {
                        String jSONObject3 = jSONObject.toString();
                        jSONObject3.getClass();
                        String jSONObject4 = jSONObject2.toString();
                        jSONObject4.getClass();
                        linkedHashMap.put(jSONObject3, jSONObject4);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    @Override // defpackage.f7h
    public boolean n(Object obj) {
        ((gfb) obj).getClass();
        return true;
    }

    @Override // defpackage.f7h
    public int o(Object obj) {
        ((gfb) obj).getClass();
        return 5;
    }

    @Override // defpackage.c6h
    public Object readFrom(InputStream inputStream, rq3 rq3Var) {
        try {
            xea xeaVar = yea.d;
            String k2 = c.k(m6k.b0(inputStream));
            xeaVar.getClass();
            return (o7h) xeaVar.b(o7h.Companion.serializer(), k2);
        } catch (Exception e2) {
            throw new uu3("Cannot parse session configs", e2);
        }
    }

    @Override // defpackage.c6h
    public Object writeTo(Object obj, OutputStream outputStream, rq3 rq3Var) {
        outputStream.write(c.m(yea.d.c(o7h.Companion.serializer(), (o7h) obj)));
        return Unit.a;
    }

    @Override // defpackage.tz2
    public InputStream d(aof aofVar) {
        return aofVar;
    }

    @Override // defpackage.f6b
    public void f(s6b s6bVar) {
    }

    @Override // defpackage.tz2
    public OutputStream h(ugc ugcVar) {
        return ugcVar;
    }
}
