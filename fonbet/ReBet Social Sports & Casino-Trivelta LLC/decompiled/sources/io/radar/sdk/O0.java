package io.radar.sdk;

import io.radar.sdk.C4589c;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class O0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f49766i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public String f49767a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f49768b;

    /* renamed from: c, reason: collision with root package name */
    public String f49769c;

    /* renamed from: d, reason: collision with root package name */
    public String f49770d;

    /* renamed from: e, reason: collision with root package name */
    public C4589c.EnumC4603o f49771e;

    /* renamed from: f, reason: collision with root package name */
    public Date f49772f;

    /* renamed from: g, reason: collision with root package name */
    public int f49773g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f49774h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final O0 a(JSONObject obj) {
            C4589c.EnumC4603o enumC4603o;
            Date date;
            Intrinsics.checkNotNullParameter(obj, "obj");
            String optString = obj.optString("externalId");
            Intrinsics.checkNotNullExpressionValue(optString, "obj.optString(KEY_EXTERNAL_ID)");
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            String optString2 = obj.optString("destinationGeofenceTag");
            String optString3 = obj.optString("destinationGeofenceExternalId");
            String optString4 = obj.optString("mode");
            if (optString4 != null) {
                switch (optString4.hashCode()) {
                    case -403236394:
                        if (optString4.equals("motorbike")) {
                            enumC4603o = C4589c.EnumC4603o.MOTORBIKE;
                            break;
                        }
                        break;
                    case 3023841:
                        if (optString4.equals("bike")) {
                            enumC4603o = C4589c.EnumC4603o.BIKE;
                            break;
                        }
                        break;
                    case 3148910:
                        if (optString4.equals("foot")) {
                            enumC4603o = C4589c.EnumC4603o.FOOT;
                            break;
                        }
                        break;
                    case 110640223:
                        if (optString4.equals("truck")) {
                            enumC4603o = C4589c.EnumC4603o.TRUCK;
                            break;
                        }
                        break;
                }
                C4589c.EnumC4603o enumC4603o2 = enumC4603o;
                if (obj.has("scheduledArrivalAt")) {
                    date = null;
                } else {
                    long optLong = obj.optLong("scheduledArrivalAt");
                    date = optLong != 0 ? new Date(optLong) : R0.f49781a.o(obj.optString("scheduledArrivalAt"));
                }
                return new O0(optString, optJSONObject, optString2, optString3, enumC4603o2, date, obj.optInt("approachingThreshold"), obj.optBoolean("startTracking", true));
            }
            enumC4603o = C4589c.EnumC4603o.CAR;
            C4589c.EnumC4603o enumC4603o22 = enumC4603o;
            if (obj.has("scheduledArrivalAt")) {
            }
            return new O0(optString, optJSONObject, optString2, optString3, enumC4603o22, date, obj.optInt("approachingThreshold"), obj.optBoolean("startTracking", true));
        }

        public a() {
        }
    }

    public O0(String externalId, JSONObject jSONObject, String str, String str2, C4589c.EnumC4603o mode, Date date, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f49767a = externalId;
        this.f49768b = jSONObject;
        this.f49769c = str;
        this.f49770d = str2;
        this.f49771e = mode;
        this.f49772f = date;
        this.f49773g = i10;
        this.f49774h = z10;
    }

    public static final O0 a(JSONObject jSONObject) {
        return f49766i.a(jSONObject);
    }

    public final int b() {
        return this.f49773g;
    }

    public final String c() {
        return this.f49770d;
    }

    public final String d() {
        return this.f49769c;
    }

    public final String e() {
        return this.f49767a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(O0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.radar.sdk.RadarTripOptions");
        }
        O0 o02 = (O0) obj;
        if (Intrinsics.areEqual(this.f49767a, o02.f49767a)) {
            JSONObject jSONObject = this.f49768b;
            String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
            JSONObject jSONObject3 = o02.f49768b;
            if (Intrinsics.areEqual(jSONObject2, jSONObject3 != null ? jSONObject3.toString() : null) && Intrinsics.areEqual(this.f49769c, o02.f49769c) && Intrinsics.areEqual(this.f49770d, o02.f49770d) && this.f49771e == o02.f49771e) {
                Date date = this.f49772f;
                Long valueOf = date != null ? Long.valueOf(date.getTime()) : null;
                Date date2 = o02.f49772f;
                if (Intrinsics.areEqual(valueOf, date2 != null ? Long.valueOf(date2.getTime()) : null) && this.f49773g == o02.f49773g && this.f49774h == o02.f49774h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final JSONObject f() {
        return this.f49768b;
    }

    public final C4589c.EnumC4603o g() {
        return this.f49771e;
    }

    public final Date h() {
        return this.f49772f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f49767a.hashCode() * 31;
        JSONObject jSONObject = this.f49768b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.f49769c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f49770d;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f49771e.hashCode()) * 31;
        Date date = this.f49772f;
        int hashCode5 = (((hashCode4 + (date != null ? date.hashCode() : 0)) * 31) + Integer.hashCode(this.f49773g)) * 31;
        boolean z10 = this.f49774h;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode5 + i10;
    }

    public final boolean i() {
        return this.f49774h;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("externalId", this.f49767a);
        jSONObject.put("metadata", this.f49768b);
        jSONObject.put("destinationGeofenceTag", this.f49769c);
        jSONObject.put("destinationGeofenceExternalId", this.f49770d);
        jSONObject.put("mode", C4589c.S0(this.f49771e));
        Date date = this.f49772f;
        if (date != null) {
            jSONObject.put("scheduledArrivalAt", R0.f49781a.a(date));
        }
        int i10 = this.f49773g;
        if (i10 > 0) {
            jSONObject.put("approachingThreshold", i10);
        }
        jSONObject.put("startTracking", this.f49774h);
        return jSONObject;
    }

    public String toString() {
        return "RadarTripOptions(externalId=" + this.f49767a + ", metadata=" + this.f49768b + ", destinationGeofenceTag=" + this.f49769c + ", destinationGeofenceExternalId=" + this.f49770d + ", mode=" + this.f49771e + ", scheduledArrivalAt=" + this.f49772f + ", approachingThreshold=" + this.f49773g + ", startTracking=" + this.f49774h + ')';
    }
}
