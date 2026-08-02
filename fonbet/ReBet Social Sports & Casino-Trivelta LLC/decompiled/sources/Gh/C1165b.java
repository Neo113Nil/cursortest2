package Gh;

import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: Gh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1165b {

    /* renamed from: l, reason: collision with root package name */
    public static final a f4041l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4043b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4044c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4045d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4046e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4047f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4048g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f4049h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f4050i;

    /* renamed from: j, reason: collision with root package name */
    public final g f4051j;

    /* renamed from: k, reason: collision with root package name */
    public final EnumC0090b f4052k;

    /* renamed from: Gh.b$a */
    public static final class a {

        /* renamed from: Gh.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0089a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC0090b.values().length];
                iArr[EnumC0090b.EDDYSTONE.ordinal()] = 1;
                iArr[EnumC0090b.IBEACON.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        
            if (r8 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        
            r8 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            r9 = r8;
            r8 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0075, code lost:
        
            if (r8 == null) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C1165b a(JSONObject jSONObject) {
            String str;
            String str2;
            String optString;
            String optString2;
            int i10;
            double d10;
            if (jSONObject == null) {
                return null;
            }
            EnumC0090b enumC0090b = Intrinsics.areEqual(jSONObject.optString("type"), "eddystone") ? EnumC0090b.EDDYSTONE : EnumC0090b.IBEACON;
            String optString3 = jSONObject.optString("_id");
            String str3 = optString3 == null ? "" : optString3;
            String optString4 = jSONObject.optString("description");
            String str4 = optString4 == null ? "" : optString4;
            String optString5 = jSONObject.optString("tag");
            String str5 = optString5 == null ? null : optString5;
            String optString6 = jSONObject.optString("externalId");
            String str6 = optString6 == null ? null : optString6;
            if (enumC0090b == EnumC0090b.EDDYSTONE) {
                optString = jSONObject.optString("uid");
                if (optString == null) {
                    optString = "";
                }
                optString2 = jSONObject.optString("instance");
            } else if (enumC0090b == EnumC0090b.IBEACON) {
                optString = jSONObject.optString("uuid");
                if (optString == null) {
                    optString = "";
                }
                optString2 = jSONObject.optString("major");
            } else {
                str = "";
                str2 = str;
            }
            String optString7 = jSONObject.optString("minor");
            String str7 = optString7 == null ? "" : optString7;
            JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
            JSONObject jSONObject2 = optJSONObject == null ? null : optJSONObject;
            int optInt = jSONObject.optInt("rssi");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("geometry");
            JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray("coordinates") : null;
            if (optJSONArray != null) {
                i10 = optInt;
                d10 = optJSONArray.optDouble(1);
            } else {
                i10 = optInt;
                d10 = 0.0d;
            }
            return new C1165b(str3, str4, str5, str6, str, str2, str7, jSONObject2, Integer.valueOf(i10), new g(d10, optJSONArray != null ? optJSONArray.optDouble(0) : 0.0d), enumC0090b);
        }

        public final C1165b[] b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            C1165b[] c1165bArr = new C1165b[length];
            for (int i10 = 0; i10 < length; i10++) {
                c1165bArr[i10] = C1165b.f4041l.a(jSONArray.optJSONObject(i10));
            }
            Object[] array = ArraysKt.filterNotNull(c1165bArr).toArray(new C1165b[0]);
            if (array != null) {
                return (C1165b[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String c(EnumC0090b type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i10 = C0089a.$EnumSwitchMapping$0[type.ordinal()];
            if (i10 == 1) {
                return "eddystone";
            }
            if (i10 == 2) {
                return "ibeacon";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final JSONArray d(C1165b[] c1165bArr) {
            if (c1165bArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (C1165b c1165b : c1165bArr) {
                jSONArray.put(c1165b.h());
            }
            return jSONArray;
        }

        public a() {
        }
    }

    /* renamed from: Gh.b$b, reason: collision with other inner class name */
    public enum EnumC0090b {
        IBEACON,
        EDDYSTONE
    }

    public C1165b(String str, String str2, String str3, String str4, String uuid, String major, String minor, JSONObject jSONObject, Integer num, g gVar, EnumC0090b type) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(major, "major");
        Intrinsics.checkNotNullParameter(minor, "minor");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f4042a = str;
        this.f4043b = str2;
        this.f4044c = str3;
        this.f4045d = str4;
        this.f4046e = uuid;
        this.f4047f = major;
        this.f4048g = minor;
        this.f4049h = jSONObject;
        this.f4050i = num;
        this.f4051j = gVar;
        this.f4052k = type;
    }

    public final String a() {
        return this.f4047f;
    }

    public final JSONObject b() {
        return this.f4049h;
    }

    public final String c() {
        return this.f4048g;
    }

    public final Integer d() {
        return this.f4050i;
    }

    public final EnumC0090b e() {
        return this.f4052k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1165b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.radar.sdk.model.RadarBeacon");
        }
        C1165b c1165b = (C1165b) obj;
        return Intrinsics.areEqual(this.f4046e, c1165b.f4046e) && Intrinsics.areEqual(this.f4047f, c1165b.f4047f) && Intrinsics.areEqual(this.f4048g, c1165b.f4048g) && this.f4052k == c1165b.f4052k;
    }

    public final String f() {
        return this.f4046e;
    }

    public final String g() {
        return this.f4042a;
    }

    public final JSONObject h() {
        JSONObject put;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", f4041l.c(this.f4052k));
        jSONObject.putOpt("_id", this.f4042a);
        jSONObject.putOpt("description", this.f4043b);
        jSONObject.putOpt("externalId", this.f4045d);
        jSONObject.putOpt("tag", this.f4044c);
        EnumC0090b enumC0090b = this.f4052k;
        if (enumC0090b == EnumC0090b.EDDYSTONE) {
            String lowerCase = this.f4046e.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject.putOpt("uid", lowerCase);
            jSONObject.putOpt("instance", this.f4047f);
        } else if (enumC0090b == EnumC0090b.IBEACON) {
            String lowerCase2 = this.f4046e.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject.putOpt("uuid", lowerCase2);
            jSONObject.putOpt("major", this.f4047f);
            jSONObject.putOpt("minor", this.f4048g);
        }
        jSONObject.putOpt("metadata", this.f4049h);
        jSONObject.putOpt("rssi", this.f4050i);
        g gVar = this.f4051j;
        if (gVar == null || (put = gVar.c()) == null) {
            put = new JSONObject().put("coordinates", new int[]{0, 0});
        }
        jSONObject.putOpt("geometry", put);
        return jSONObject;
    }

    public int hashCode() {
        return (((this.f4046e.hashCode() * 31) + this.f4047f.hashCode()) * 31) + this.f4048g.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1165b(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, Integer num, g gVar, EnumC0090b enumC0090b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, jSONObject, num, r12, r13);
        EnumC0090b enumC0090b2;
        g gVar2;
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        str3 = (i10 & 4) != 0 ? null : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        jSONObject = (i10 & 128) != 0 ? null : jSONObject;
        num = (i10 & 256) != 0 ? null : num;
        if ((i10 & 512) != 0) {
            enumC0090b2 = enumC0090b;
            gVar2 = null;
        } else {
            enumC0090b2 = enumC0090b;
            gVar2 = gVar;
        }
    }
}
