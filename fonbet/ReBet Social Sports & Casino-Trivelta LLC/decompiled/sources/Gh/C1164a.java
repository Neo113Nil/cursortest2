package Gh;

import com.appsflyer.AdRevenueScheme;
import com.facebook.react.uimanager.ViewProps;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: Gh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1164a {

    /* renamed from: z, reason: collision with root package name */
    public static final C0087a f4011z = new C0087a(null);

    /* renamed from: a, reason: collision with root package name */
    public final g f4012a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4013b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4014c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4015d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4016e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4017f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4018g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4019h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4020i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4021j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4022k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4023l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4024m;

    /* renamed from: n, reason: collision with root package name */
    public final String f4025n;

    /* renamed from: o, reason: collision with root package name */
    public final String f4026o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4027p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4028q;

    /* renamed from: r, reason: collision with root package name */
    public final String f4029r;

    /* renamed from: s, reason: collision with root package name */
    public final String f4030s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4031t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f4032u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4033v;

    /* renamed from: w, reason: collision with root package name */
    public final JSONObject f4034w;

    /* renamed from: x, reason: collision with root package name */
    public final b f4035x;

    /* renamed from: y, reason: collision with root package name */
    public final A f4036y;

    /* renamed from: Gh.a$a, reason: collision with other inner class name */
    public static final class C0087a {

        /* renamed from: Gh.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0088a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.EXACT.ordinal()] = 1;
                iArr[b.INTERPOLATED.ordinal()] = 2;
                iArr[b.FALLBACK.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C0087a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1164a a(JSONObject jSONObject) {
            g gVar;
            b bVar;
            if (jSONObject == null) {
                return null;
            }
            g gVar2 = new g(jSONObject.optDouble("latitude"), jSONObject.optDouble("longitude"));
            String optString = jSONObject.optString("formattedAddress");
            String str = optString == null ? null : optString;
            String optString2 = jSONObject.optString(AdRevenueScheme.COUNTRY);
            String str2 = optString2 == null ? null : optString2;
            String optString3 = jSONObject.optString("countryCode");
            String str3 = optString3 == null ? null : optString3;
            String optString4 = jSONObject.optString("countryFlag");
            String str4 = optString4 == null ? null : optString4;
            String optString5 = jSONObject.optString("dma");
            String str5 = optString5 == null ? null : optString5;
            String optString6 = jSONObject.optString("dmaCode");
            String str6 = optString6 == null ? null : optString6;
            String optString7 = jSONObject.optString("state");
            String str7 = optString7 == null ? null : optString7;
            String optString8 = jSONObject.optString("stateCode");
            String str8 = optString8 == null ? null : optString8;
            String optString9 = jSONObject.optString("postalCode");
            String str9 = optString9 == null ? null : optString9;
            String optString10 = jSONObject.optString("city");
            String str10 = optString10 == null ? null : optString10;
            String optString11 = jSONObject.optString("borough");
            String str11 = optString11 == null ? null : optString11;
            String optString12 = jSONObject.optString("county");
            String str12 = optString12 == null ? null : optString12;
            String optString13 = jSONObject.optString("neighborhood");
            String str13 = optString13 == null ? null : optString13;
            String optString14 = jSONObject.optString("street");
            String str14 = optString14 == null ? null : optString14;
            String optString15 = jSONObject.optString("number");
            String str15 = optString15 == null ? null : optString15;
            String optString16 = jSONObject.optString("addressLabel");
            String str16 = optString16 == null ? null : optString16;
            String optString17 = jSONObject.optString("placeLabel");
            String str17 = optString17 == null ? null : optString17;
            String optString18 = jSONObject.optString("unit");
            String str18 = optString18 == null ? null : optString18;
            String optString19 = jSONObject.optString("plus4");
            String str19 = optString19 == null ? null : optString19;
            int optInt = jSONObject.optInt("distance");
            String optString20 = jSONObject.optString("layer");
            String str20 = optString20 == null ? null : optString20;
            JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
            JSONObject jSONObject2 = optJSONObject == null ? null : optJSONObject;
            String optString21 = jSONObject.optString("confidence");
            if (optString21 != null) {
                int hashCode = optString21.hashCode();
                gVar = gVar2;
                if (hashCode != 96946943) {
                    if (hashCode != 761243362) {
                        if (hashCode == 2096252803 && optString21.equals("interpolated")) {
                            bVar = b.INTERPOLATED;
                        }
                    } else if (optString21.equals("fallback")) {
                        bVar = b.FALLBACK;
                    }
                } else if (optString21.equals("exact")) {
                    bVar = b.EXACT;
                }
                return new C1164a(gVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, Integer.valueOf(optInt), str20, jSONObject2, bVar, A.f3959g.a(jSONObject.optJSONObject("timeZone")));
            }
            gVar = gVar2;
            bVar = b.NONE;
            return new C1164a(gVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, Integer.valueOf(optInt), str20, jSONObject2, bVar, A.f3959g.a(jSONObject.optJSONObject("timeZone")));
        }

        public final C1164a[] b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            C1164a[] c1164aArr = new C1164a[length];
            for (int i10 = 0; i10 < length; i10++) {
                c1164aArr[i10] = C1164a.f4011z.a(jSONArray.optJSONObject(i10));
            }
            Object[] array = ArraysKt.filterNotNull(c1164aArr).toArray(new C1164a[0]);
            if (array != null) {
                return (C1164a[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String c(b confidence) {
            Intrinsics.checkNotNullParameter(confidence, "confidence");
            int i10 = C0088a.$EnumSwitchMapping$0[confidence.ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? ViewProps.NONE : "fallback" : "interpolated" : "exact";
        }

        public final JSONArray d(C1164a[] c1164aArr) {
            if (c1164aArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (C1164a c1164a : c1164aArr) {
                jSONArray.put(c1164a.k());
            }
            return jSONArray;
        }

        public C0087a() {
        }
    }

    /* renamed from: Gh.a$b */
    public enum b {
        EXACT,
        INTERPOLATED,
        FALLBACK,
        NONE
    }

    public C1164a(g coordinate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, String str20, JSONObject jSONObject, b confidence, A a10) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        Intrinsics.checkNotNullParameter(confidence, "confidence");
        this.f4012a = coordinate;
        this.f4013b = str;
        this.f4014c = str2;
        this.f4015d = str3;
        this.f4016e = str4;
        this.f4017f = str5;
        this.f4018g = str6;
        this.f4019h = str7;
        this.f4020i = str8;
        this.f4021j = str9;
        this.f4022k = str10;
        this.f4023l = str11;
        this.f4024m = str12;
        this.f4025n = str13;
        this.f4026o = str14;
        this.f4027p = str15;
        this.f4028q = str16;
        this.f4029r = str17;
        this.f4030s = str18;
        this.f4031t = str19;
        this.f4032u = num;
        this.f4033v = str20;
        this.f4034w = jSONObject;
        this.f4035x = confidence;
        this.f4036y = a10;
    }

    public static final C1164a a(JSONObject jSONObject) {
        return f4011z.a(jSONObject);
    }

    public static final JSONArray j(C1164a[] c1164aArr) {
        return f4011z.d(c1164aArr);
    }

    public final String b() {
        return this.f4028q;
    }

    public final String c() {
        return this.f4022k;
    }

    public final String d() {
        return this.f4015d;
    }

    public final String e() {
        return this.f4027p;
    }

    public final String f() {
        return this.f4021j;
    }

    public final String g() {
        return this.f4020i;
    }

    public final String h() {
        return this.f4026o;
    }

    public final String i() {
        return this.f4030s;
    }

    public final JSONObject k() {
        double a10 = this.f4012a.a();
        double b10 = this.f4012a.b();
        if (Double.isNaN(a10) || Double.isNaN(b10)) {
            a10 = 0.0d;
            b10 = 0.0d;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("latitude", Double.valueOf(a10));
        jSONObject.putOpt("longitude", Double.valueOf(b10));
        jSONObject.putOpt("formattedAddress", this.f4013b);
        jSONObject.putOpt(AdRevenueScheme.COUNTRY, this.f4014c);
        jSONObject.putOpt("countryCode", this.f4015d);
        jSONObject.putOpt("countryFlag", this.f4016e);
        jSONObject.putOpt("dma", this.f4017f);
        jSONObject.putOpt("dmaCode", this.f4018g);
        jSONObject.putOpt("state", this.f4019h);
        jSONObject.putOpt("stateCode", this.f4020i);
        jSONObject.putOpt("postalCode", this.f4021j);
        jSONObject.putOpt("city", this.f4022k);
        jSONObject.putOpt("borough", this.f4023l);
        jSONObject.putOpt("county", this.f4024m);
        jSONObject.putOpt("neighborhood", this.f4025n);
        jSONObject.putOpt("street", this.f4026o);
        jSONObject.putOpt("number", this.f4027p);
        jSONObject.putOpt("addressLabel", this.f4028q);
        jSONObject.putOpt("placeLabel", this.f4029r);
        jSONObject.putOpt("unit", this.f4030s);
        jSONObject.putOpt("plus4", this.f4031t);
        jSONObject.putOpt("distance", this.f4032u);
        jSONObject.putOpt("layer", this.f4033v);
        jSONObject.putOpt("metadata", this.f4034w);
        jSONObject.putOpt("confidence", f4011z.c(this.f4035x));
        A a11 = this.f4036y;
        jSONObject.putOpt("timeZone", a11 != null ? a11.a() : null);
        return jSONObject;
    }
}
