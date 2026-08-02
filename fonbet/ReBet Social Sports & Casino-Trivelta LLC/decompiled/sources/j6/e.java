package j6;

import T7.J;
import T7.Y;
import g6.N;
import j6.EnumC5094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f53693a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f53694b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f53695c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f53696d;

    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* renamed from: b, reason: collision with root package name */
        public static final C0776a f53697b = new C0776a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f53701a;

        /* renamed from: j6.e$a$a, reason: collision with other inner class name */
        public static final class C0776a {
            public /* synthetic */ C0776a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (Intrinsics.areEqual(aVar.b(), rawValue)) {
                        return aVar;
                    }
                }
                return null;
            }

            public C0776a() {
            }
        }

        a(String str) {
            this.f53701a = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String b() {
            return this.f53701a;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public k f53702a;

        /* renamed from: b, reason: collision with root package name */
        public i f53703b;

        public b(k kVar, i field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.f53702a = kVar;
            this.f53703b = field;
        }

        public final i a() {
            return this.f53703b;
        }

        public final k b() {
            return this.f53702a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f53702a == bVar.f53702a && this.f53703b == bVar.f53703b;
        }

        public int hashCode() {
            k kVar = this.f53702a;
            return ((kVar == null ? 0 : kVar.hashCode()) * 31) + this.f53703b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f53702a + ", field=" + this.f53703b + ')';
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public k f53704a;

        /* renamed from: b, reason: collision with root package name */
        public l f53705b;

        public c(k section, l lVar) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.f53704a = section;
            this.f53705b = lVar;
        }

        public final l a() {
            return this.f53705b;
        }

        public final k b() {
            return this.f53704a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f53704a == cVar.f53704a && this.f53705b == cVar.f53705b;
        }

        public int hashCode() {
            int hashCode = this.f53704a.hashCode() * 31;
            l lVar = this.f53705b;
            return hashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f53704a + ", field=" + this.f53705b + ')';
        }
    }

    public enum d {
        ARRAY,
        BOOL,
        INT;


        /* renamed from: a, reason: collision with root package name */
        public static final a f53706a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                if (Intrinsics.areEqual(rawValue, EnumC5095b.EXT_INFO.b())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, EnumC5095b.URL_SCHEMES.b())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, m.CONTENT_IDS.b())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, m.CONTENTS.b())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, a.OPTIONS.b())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, EnumC5095b.ADV_TE.b())) {
                    return d.BOOL;
                }
                if (Intrinsics.areEqual(rawValue, EnumC5095b.APP_TE.b())) {
                    return d.BOOL;
                }
                if (Intrinsics.areEqual(rawValue, m.EVENT_TIME.b())) {
                    return d.INT;
                }
                return null;
            }

            public a() {
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: j6.e$e, reason: collision with other inner class name */
    public /* synthetic */ class C0777e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[k.valuesCustom().length];
            iArr2[k.APP_DATA.ordinal()] = 1;
            iArr2[k.USER_DATA.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC5094a.valuesCustom().length];
            iArr3[EnumC5094a.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[EnumC5094a.CUSTOM.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        EnumC5095b enumC5095b = EnumC5095b.ANON_ID;
        k kVar = k.USER_DATA;
        Pair pair = TuplesKt.to(enumC5095b, new c(kVar, l.ANON_ID));
        Pair pair2 = TuplesKt.to(EnumC5095b.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID));
        Pair pair3 = TuplesKt.to(EnumC5095b.ADVERTISER_ID, new c(kVar, l.MAD_ID));
        Pair pair4 = TuplesKt.to(EnumC5095b.PAGE_ID, new c(kVar, l.PAGE_ID));
        Pair pair5 = TuplesKt.to(EnumC5095b.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID));
        EnumC5095b enumC5095b2 = EnumC5095b.ADV_TE;
        k kVar2 = k.APP_DATA;
        f53694b = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to(enumC5095b2, new c(kVar2, l.ADV_TE)), TuplesKt.to(EnumC5095b.APP_TE, new c(kVar2, l.APP_TE)), TuplesKt.to(EnumC5095b.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), TuplesKt.to(EnumC5095b.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), TuplesKt.to(EnumC5095b.EXT_INFO, new c(kVar2, l.EXT_INFO)), TuplesKt.to(EnumC5095b.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), TuplesKt.to(EnumC5095b.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), TuplesKt.to(EnumC5095b.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), TuplesKt.to(EnumC5095b.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), TuplesKt.to(EnumC5095b.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), TuplesKt.to(EnumC5095b.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), TuplesKt.to(EnumC5095b.USER_DATA, new c(kVar, null)));
        Pair pair6 = TuplesKt.to(m.EVENT_TIME, new b(null, i.EVENT_TIME));
        Pair pair7 = TuplesKt.to(m.EVENT_NAME, new b(null, i.EVENT_NAME));
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        f53695c = MapsKt.mapOf(pair6, pair7, TuplesKt.to(mVar, new b(kVar3, i.VALUE_TO_SUM)), TuplesKt.to(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), TuplesKt.to(m.CONTENTS, new b(kVar3, i.CONTENTS)), TuplesKt.to(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), TuplesKt.to(m.CURRENCY, new b(kVar3, i.CURRENCY)), TuplesKt.to(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), TuplesKt.to(m.LEVEL, new b(kVar3, i.LEVEL)), TuplesKt.to(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), TuplesKt.to(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), TuplesKt.to(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), TuplesKt.to(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), TuplesKt.to(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), TuplesKt.to(m.SUCCESS, new b(kVar3, i.SUCCESS)), TuplesKt.to(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), TuplesKt.to(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
        f53696d = MapsKt.mapOf(TuplesKt.to("fb_mobile_achievement_unlocked", j.UNLOCKED_ACHIEVEMENT), TuplesKt.to("fb_mobile_activate_app", j.ACTIVATED_APP), TuplesKt.to("fb_mobile_add_payment_info", j.ADDED_PAYMENT_INFO), TuplesKt.to("fb_mobile_add_to_cart", j.ADDED_TO_CART), TuplesKt.to("fb_mobile_add_to_wishlist", j.ADDED_TO_WISHLIST), TuplesKt.to("fb_mobile_complete_registration", j.COMPLETED_REGISTRATION), TuplesKt.to("fb_mobile_content_view", j.VIEWED_CONTENT), TuplesKt.to("fb_mobile_initiated_checkout", j.INITIATED_CHECKOUT), TuplesKt.to("fb_mobile_level_achieved", j.ACHIEVED_LEVEL), TuplesKt.to("fb_mobile_purchase", j.PURCHASED), TuplesKt.to("fb_mobile_rate", j.RATED), TuplesKt.to("fb_mobile_search", j.SEARCHED), TuplesKt.to("fb_mobile_spent_credits", j.SPENT_CREDITS), TuplesKt.to("fb_mobile_tutorial_completion", j.COMPLETED_TUTORIAL));
    }

    public static final ArrayList k(String appEvents) {
        Intrinsics.checkNotNullParameter(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            Y y10 = Y.f11042a;
            for (String str : Y.m(new JSONArray(appEvents))) {
                Y y11 = Y.f11042a;
                arrayList.add(Y.n(new JSONObject(str)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    m a10 = m.f53779b.a(str2);
                    b bVar = (b) f53695c.get(a10);
                    if (a10 != null && bVar != null) {
                        k b10 = bVar.b();
                        if (b10 == null) {
                            try {
                                String b11 = bVar.a().b();
                                if (a10 == m.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    e eVar = f53693a;
                                    Object obj = map.get(str2);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    linkedHashMap2.put(b11, eVar.j((String) obj));
                                } else if (a10 == m.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    Object l10 = l(str2, obj2);
                                    if (l10 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    linkedHashMap2.put(b11, l10);
                                }
                            } catch (ClassCastException e10) {
                                J.f10993e.c(N.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", ExceptionsKt.stackTraceToString(e10));
                            }
                        } else if (b10 == k.CUSTOM_DATA) {
                            String b12 = bVar.a().b();
                            Object obj3 = map.get(str2);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            Object l11 = l(str2, obj3);
                            if (l11 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(b12, l11);
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.b(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            J.f10993e.c(N.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    public static final Object l(String field, Object value) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        d a10 = d.f53706a.a(field);
        String str = value instanceof String ? (String) value : null;
        if (a10 == null || str == null) {
            return value;
        }
        int i10 = C0777e.$EnumSwitchMapping$0[a10.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return StringsKt.toIntOrNull(value.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer intOrNull = StringsKt.toIntOrNull(str.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            Y y10 = Y.f11042a;
            List<??> m10 = Y.m(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            for (?? r12 : m10) {
                try {
                    try {
                        Y y11 = Y.f11042a;
                        r12 = Y.n(new JSONObject((String) r12));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    Y y12 = Y.f11042a;
                    r12 = Y.m(new JSONArray((String) r12));
                }
                arrayList.add(r12);
            }
            return arrayList;
        } catch (JSONException e10) {
            J.f10993e.c(N.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
            return Unit.INSTANCE;
        }
    }

    public final List a(EnumC5094a eventType, Map userData, Map appData, Map restOfData, List customEvents, Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        Intrinsics.checkNotNullParameter(customEvents, "customEvents");
        Map d10 = d(userData, appData, restOfData);
        int i10 = C0777e.$EnumSwitchMapping$2[eventType.ordinal()];
        if (i10 == 1) {
            return c(d10, obj);
        }
        if (i10 != 2) {
            return null;
        }
        return b(d10, customEvents);
    }

    public final List b(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    public final List c(Map map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.b(), n.MOBILE_APP_INSTALL.b());
        linkedHashMap.put(i.EVENT_TIME.b(), obj);
        return CollectionsKt.listOf(linkedHashMap);
    }

    public final Map d(Map userData, Map appData, Map restOfData) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.b(), n.APP.b());
        linkedHashMap.put(k.USER_DATA.b(), userData);
        linkedHashMap.put(k.APP_DATA.b(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    public final List e(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        EnumC5094a f10 = f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (f10 == EnumC5094a.OTHER) {
            return null;
        }
        return a(f10, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(n.INSTALL_EVENT_TIME.b()));
    }

    public final EnumC5094a f(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object obj = map.get(n.EVENT.b());
        EnumC5094a.C0775a c0775a = EnumC5094a.f53667a;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        EnumC5094a a10 = c0775a.a((String) obj);
        if (a10 != EnumC5094a.OTHER) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                EnumC5095b a11 = EnumC5095b.f53671b.a(str);
                if (a11 != null) {
                    f53693a.g(map2, map3, a11, value);
                } else {
                    boolean areEqual = Intrinsics.areEqual(str, k.CUSTOM_EVENTS.b());
                    boolean z10 = value instanceof String;
                    if (a10 == EnumC5094a.CUSTOM && areEqual && z10) {
                        ArrayList k10 = k((String) value);
                        if (k10 != null) {
                            arrayList.addAll(k10);
                        }
                    } else if (a.f53697b.a(str) != null) {
                        map4.put(str, value);
                    }
                }
            }
        }
        return a10;
    }

    public final void g(Map userData, Map appData, EnumC5095b field, Object value) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        c cVar = (c) f53694b.get(field);
        if (cVar == null) {
            return;
        }
        int i10 = C0777e.$EnumSwitchMapping$1[cVar.b().ordinal()];
        if (i10 == 1) {
            h(appData, field, value);
        } else {
            if (i10 != 2) {
                return;
            }
            i(userData, field, value);
        }
    }

    public final void h(Map map, EnumC5095b enumC5095b, Object obj) {
        c cVar = (c) f53694b.get(enumC5095b);
        l a10 = cVar == null ? null : cVar.a();
        if (a10 == null) {
            return;
        }
        map.put(a10.b(), obj);
    }

    public final void i(Map map, EnumC5095b enumC5095b, Object obj) {
        if (enumC5095b == EnumC5095b.USER_DATA) {
            try {
                Y y10 = Y.f11042a;
                map.putAll(Y.n(new JSONObject((String) obj)));
                return;
            } catch (JSONException e10) {
                J.f10993e.c(N.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return;
            }
        }
        c cVar = (c) f53694b.get(enumC5095b);
        l a10 = cVar == null ? null : cVar.a();
        if (a10 == null) {
            return;
        }
        map.put(a10.b(), obj);
    }

    public final String j(String str) {
        Map map = f53696d;
        if (!map.containsKey(str)) {
            return str;
        }
        j jVar = (j) map.get(str);
        return jVar == null ? "" : jVar.b();
    }
}
