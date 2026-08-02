package Gh;

import io.radar.sdk.C4589c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class B {

    /* renamed from: k, reason: collision with root package name */
    public static final a f3966k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f3967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3968b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f3969c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3970d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3971e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3972f;

    /* renamed from: g, reason: collision with root package name */
    public final C4589c.EnumC4603o f3973g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f3974h;

    /* renamed from: i, reason: collision with root package name */
    public final Double f3975i;

    /* renamed from: j, reason: collision with root package name */
    public final b f3976j;

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
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final B a(JSONObject jSONObject) {
            g gVar;
            C4589c.EnumC4603o enumC4603o;
            String optString;
            b bVar;
            C4589c.EnumC4603o enumC4603o2;
            g gVar2;
            if (jSONObject == null) {
                return null;
            }
            String optString2 = jSONObject.optString("_id");
            String str = optString2 == null ? "" : optString2;
            String optString3 = jSONObject.optString("externalId");
            String str2 = optString3 == null ? "" : optString3;
            JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
            JSONObject jSONObject2 = optJSONObject == null ? null : optJSONObject;
            String optString4 = jSONObject.optString("destinationGeofenceTag");
            String str3 = optString4 == null ? null : optString4;
            String optString5 = jSONObject.optString("destinationGeofenceExternalId");
            String str4 = optString5 == null ? null : optString5;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("destinationLocation");
            if (optJSONObject2 != null) {
                JSONArray optJSONArray = optJSONObject2.optJSONArray("coordinates");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "optJSONArray(FIELD_COORDINATES)");
                    gVar2 = new g(optJSONArray.optDouble(1), optJSONArray.optDouble(0));
                } else {
                    gVar2 = null;
                }
                gVar = gVar2;
            } else {
                gVar = null;
            }
            String optString6 = jSONObject.optString("mode");
            if (optString6 != null) {
                switch (optString6.hashCode()) {
                    case -403236394:
                        if (optString6.equals("motorbike")) {
                            enumC4603o2 = C4589c.EnumC4603o.MOTORBIKE;
                            enumC4603o = enumC4603o2;
                            break;
                        }
                        break;
                    case 98260:
                        if (optString6.equals("car")) {
                            enumC4603o2 = C4589c.EnumC4603o.CAR;
                            enumC4603o = enumC4603o2;
                            break;
                        }
                        break;
                    case 3023841:
                        if (optString6.equals("bike")) {
                            enumC4603o2 = C4589c.EnumC4603o.BIKE;
                            enumC4603o = enumC4603o2;
                            break;
                        }
                        break;
                    case 3148910:
                        if (optString6.equals("foot")) {
                            enumC4603o2 = C4589c.EnumC4603o.FOOT;
                            enumC4603o = enumC4603o2;
                            break;
                        }
                        break;
                    case 110640223:
                        if (optString6.equals("truck")) {
                            enumC4603o2 = C4589c.EnumC4603o.TRUCK;
                            enumC4603o = enumC4603o2;
                            break;
                        }
                        break;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("eta");
                Double valueOf = optJSONObject3 == null ? Double.valueOf(optJSONObject3.optDouble("distance")) : null;
                JSONObject optJSONObject4 = jSONObject.optJSONObject("eta");
                Double valueOf2 = optJSONObject4 != null ? Double.valueOf(optJSONObject4.optDouble("duration")) : null;
                optString = jSONObject.optString("status");
                if (optString != null) {
                    switch (optString.hashCode()) {
                        case -1897185151:
                            if (optString.equals("started")) {
                                bVar = b.STARTED;
                                break;
                            }
                            break;
                        case -1402931637:
                            if (optString.equals("completed")) {
                                bVar = b.COMPLETED;
                                break;
                            }
                            break;
                        case -1309235419:
                            if (optString.equals("expired")) {
                                bVar = b.EXPIRED;
                                break;
                            }
                            break;
                        case -734206867:
                            if (optString.equals("arrived")) {
                                bVar = b.ARRIVED;
                                break;
                            }
                            break;
                        case -123173735:
                            if (optString.equals("canceled")) {
                                bVar = b.CANCELED;
                                break;
                            }
                            break;
                        case 100499258:
                            if (optString.equals("approaching")) {
                                bVar = b.APPROACHING;
                                break;
                            }
                            break;
                    }
                    return new B(str, str2, jSONObject2, str3, str4, gVar, enumC4603o, valueOf, valueOf2, bVar);
                }
                bVar = b.UNKNOWN;
                return new B(str, str2, jSONObject2, str3, str4, gVar, enumC4603o, valueOf, valueOf2, bVar);
            }
            enumC4603o = null;
            JSONObject optJSONObject32 = jSONObject.optJSONObject("eta");
            if (optJSONObject32 == null) {
            }
            JSONObject optJSONObject42 = jSONObject.optJSONObject("eta");
            Double valueOf22 = optJSONObject42 != null ? Double.valueOf(optJSONObject42.optDouble("duration")) : null;
            optString = jSONObject.optString("status");
            if (optString != null) {
            }
            bVar = b.UNKNOWN;
            return new B(str, str2, jSONObject2, str3, str4, gVar, enumC4603o, valueOf, valueOf22, bVar);
        }

        public a() {
        }
    }

    public enum b {
        UNKNOWN,
        STARTED,
        APPROACHING,
        ARRIVED,
        EXPIRED,
        COMPLETED,
        CANCELED
    }

    public B(String _id, String externalId, JSONObject jSONObject, String str, String str2, g gVar, C4589c.EnumC4603o enumC4603o, Double d10, Double d11, b status) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f3967a = _id;
        this.f3968b = externalId;
        this.f3969c = jSONObject;
        this.f3970d = str;
        this.f3971e = str2;
        this.f3972f = gVar;
        this.f3973g = enumC4603o;
        this.f3974h = d10;
        this.f3975i = d11;
        this.f3976j = status;
    }

    public final JSONObject a() {
        return this.f3969c;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this.f3967a);
        jSONObject.putOpt("externalId", this.f3968b);
        jSONObject.putOpt("metadata", this.f3969c);
        jSONObject.putOpt("destinationGeofenceTag", this.f3970d);
        jSONObject.putOpt("destinationGeofenceExternalId", this.f3971e);
        g gVar = this.f3972f;
        jSONObject.putOpt("destinationLocation", gVar != null ? gVar.c() : null);
        C4589c.EnumC4603o enumC4603o = this.f3973g;
        jSONObject.putOpt("mode", enumC4603o != null ? C4589c.S0(enumC4603o) : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("distance", this.f3974h);
        jSONObject2.putOpt("duration", this.f3975i);
        jSONObject.putOpt("eta", jSONObject2);
        jSONObject.putOpt("status", C4589c.U0(this.f3976j));
        return jSONObject;
    }
}
