package Gh;

import Gh.o;
import android.location.Location;
import com.twilio.voice.EventKeys;
import io.radar.sdk.R0;
import java.util.Date;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: t, reason: collision with root package name */
    public static final a f4075t = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4076a;

    @Nullable
    private final o[] alternatePlaces;

    /* renamed from: b, reason: collision with root package name */
    public final Date f4077b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f4078c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4079d;

    /* renamed from: e, reason: collision with root package name */
    public final c f4080e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4081f;

    /* renamed from: g, reason: collision with root package name */
    public final j f4082g;

    /* renamed from: h, reason: collision with root package name */
    public final o f4083h;

    /* renamed from: i, reason: collision with root package name */
    public final q f4084i;

    /* renamed from: j, reason: collision with root package name */
    public final C1165b f4085j;

    /* renamed from: k, reason: collision with root package name */
    public final B f4086k;

    /* renamed from: l, reason: collision with root package name */
    public final i f4087l;

    /* renamed from: m, reason: collision with root package name */
    public final o f4088m;

    /* renamed from: n, reason: collision with root package name */
    public final d f4089n;

    /* renamed from: o, reason: collision with root package name */
    public final b f4090o;

    /* renamed from: p, reason: collision with root package name */
    public final float f4091p;

    /* renamed from: q, reason: collision with root package name */
    public final Location f4092q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4093r;

    /* renamed from: s, reason: collision with root package name */
    public final JSONObject f4094s;

    public static final class a {

        /* renamed from: Gh.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0091a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[c.values().length];
                iArr[c.USER_ENTERED_GEOFENCE.ordinal()] = 1;
                iArr[c.USER_EXITED_GEOFENCE.ordinal()] = 2;
                iArr[c.USER_DWELLED_IN_GEOFENCE.ordinal()] = 3;
                iArr[c.USER_ENTERED_PLACE.ordinal()] = 4;
                iArr[c.USER_EXITED_PLACE.ordinal()] = 5;
                iArr[c.USER_ENTERED_REGION_COUNTRY.ordinal()] = 6;
                iArr[c.USER_EXITED_REGION_COUNTRY.ordinal()] = 7;
                iArr[c.USER_ENTERED_REGION_DMA.ordinal()] = 8;
                iArr[c.USER_EXITED_REGION_DMA.ordinal()] = 9;
                iArr[c.USER_ENTERED_REGION_STATE.ordinal()] = 10;
                iArr[c.USER_EXITED_REGION_STATE.ordinal()] = 11;
                iArr[c.USER_ENTERED_REGION_POSTAL_CODE.ordinal()] = 12;
                iArr[c.USER_EXITED_REGION_POSTAL_CODE.ordinal()] = 13;
                iArr[c.USER_NEARBY_PLACE_CHAIN.ordinal()] = 14;
                iArr[c.USER_ENTERED_BEACON.ordinal()] = 15;
                iArr[c.USER_EXITED_BEACON.ordinal()] = 16;
                iArr[c.USER_STARTED_TRIP.ordinal()] = 17;
                iArr[c.USER_UPDATED_TRIP.ordinal()] = 18;
                iArr[c.USER_STOPPED_TRIP.ordinal()] = 19;
                iArr[c.USER_APPROACHING_TRIP_DESTINATION.ordinal()] = 20;
                iArr[c.USER_ARRIVED_AT_TRIP_DESTINATION.ordinal()] = 21;
                iArr[c.USER_ARRIVED_AT_WRONG_TRIP_DESTINATION.ordinal()] = 22;
                iArr[c.USER_FAILED_FRAUD.ordinal()] = 23;
                $EnumSwitchMapping$0 = iArr;
            }
        }

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
        /* JADX WARN: Removed duplicated region for block: B:24:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0240  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0253  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x018e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final h a(JSONObject jSONObject) {
            c cVar;
            JSONArray optJSONArray;
            float f10;
            double d10;
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("_id");
            if (optString == null) {
                optString = "";
            }
            String str = optString;
            R0 r02 = R0.f49781a;
            Date o10 = r02.o(jSONObject.optString("createdAt"));
            if (o10 == null) {
                o10 = new Date();
            }
            Date date = o10;
            Date o11 = r02.o(jSONObject.optString("actualCreatedAt"));
            if (o11 == null) {
                o11 = new Date();
            }
            Date date2 = o11;
            boolean optBoolean = jSONObject.optBoolean("live");
            String optString2 = jSONObject.optString("type");
            if (optString2 != null) {
                switch (optString2.hashCode()) {
                    case -2086465761:
                        if (optString2.equals("user.exited_geofence")) {
                            cVar = c.USER_EXITED_GEOFENCE;
                            break;
                        }
                        break;
                    case -2076407267:
                        if (optString2.equals("user.arrived_at_wrong_trip_destination")) {
                            cVar = c.USER_ARRIVED_AT_WRONG_TRIP_DESTINATION;
                            break;
                        }
                        break;
                    case -2071991389:
                        if (optString2.equals("user.exited_beacon")) {
                            cVar = c.USER_EXITED_BEACON;
                            break;
                        }
                        break;
                    case -1716268600:
                        if (optString2.equals("user.exited_place")) {
                            cVar = c.USER_EXITED_PLACE;
                            break;
                        }
                        break;
                    case -1641299675:
                        if (optString2.equals("user.failed_fraud")) {
                            cVar = c.USER_FAILED_FRAUD;
                            break;
                        }
                        break;
                    case -1251605361:
                        if (optString2.equals("user.entered_beacon")) {
                            cVar = c.USER_ENTERED_BEACON;
                            break;
                        }
                        break;
                    case -1005364232:
                        if (optString2.equals("user.entered_region_dma")) {
                            cVar = c.USER_ENTERED_REGION_DMA;
                            break;
                        }
                        break;
                    case -844188518:
                        if (optString2.equals("user.stopped_trip")) {
                            cVar = c.USER_STOPPED_TRIP;
                            break;
                        }
                        break;
                    case -258182923:
                        if (optString2.equals("user.exited_region_postal_code")) {
                            cVar = c.USER_EXITED_REGION_POSTAL_CODE;
                            break;
                        }
                        break;
                    case -103183764:
                        if (optString2.equals("user.updated_trip")) {
                            cVar = c.USER_UPDATED_TRIP;
                            break;
                        }
                        break;
                    case 158452425:
                        if (optString2.equals("user.dwelled_in_geofence")) {
                            cVar = c.USER_DWELLED_IN_GEOFENCE;
                            break;
                        }
                        break;
                    case 226679697:
                        if (optString2.equals("user.entered_region_state")) {
                            cVar = c.USER_ENTERED_REGION_STATE;
                            break;
                        }
                        break;
                    case 325491979:
                        if (optString2.equals("user.entered_geofence")) {
                            cVar = c.USER_ENTERED_GEOFENCE;
                            break;
                        }
                        break;
                    case 385587468:
                        if (optString2.equals("user.exited_region_dma")) {
                            cVar = c.USER_EXITED_REGION_DMA;
                            break;
                        }
                        break;
                    case 568887265:
                        if (optString2.equals("user.entered_region_postal_code")) {
                            cVar = c.USER_ENTERED_REGION_POSTAL_CODE;
                            break;
                        }
                        break;
                    case 678548235:
                        if (optString2.equals("user.arrived_at_trip_destination")) {
                            cVar = c.USER_ARRIVED_AT_TRIP_DESTINATION;
                            break;
                        }
                        break;
                    case 968365670:
                        if (optString2.equals("user.started_trip")) {
                            cVar = c.USER_STARTED_TRIP;
                            break;
                        }
                        break;
                    case 1081142108:
                        if (optString2.equals("user.entered_place")) {
                            cVar = c.USER_ENTERED_PLACE;
                            break;
                        }
                        break;
                    case 1196434341:
                        if (optString2.equals("user.exited_region_state")) {
                            cVar = c.USER_EXITED_REGION_STATE;
                            break;
                        }
                        break;
                    case 1356297932:
                        if (optString2.equals("user.nearby_place_chain")) {
                            cVar = c.USER_NEARBY_PLACE_CHAIN;
                            break;
                        }
                        break;
                    case 1376657564:
                        if (optString2.equals("user.approaching_trip_destination")) {
                            cVar = c.USER_APPROACHING_TRIP_DESTINATION;
                            break;
                        }
                        break;
                    case 1577140650:
                        if (optString2.equals("user.exited_region_country")) {
                            cVar = c.USER_EXITED_REGION_COUNTRY;
                            break;
                        }
                        break;
                    case 1650830998:
                        if (optString2.equals("user.entered_region_country")) {
                            cVar = c.USER_ENTERED_REGION_COUNTRY;
                            break;
                        }
                        break;
                }
                c cVar2 = cVar;
                String optString3 = cVar2 != c.CONVERSION ? jSONObject.optString("type") : null;
                j b10 = j.f4139h.b(jSONObject.optJSONObject("geofence"));
                o.a aVar = o.f4157h;
                o a10 = aVar.a(jSONObject.optJSONObject("place"));
                q a11 = q.f4167l.a(jSONObject.optJSONObject(EventKeys.REGION));
                C1165b a12 = C1165b.f4041l.a(jSONObject.optJSONObject("beacon"));
                B a13 = B.f3966k.a(jSONObject.optJSONObject("trip"));
                i a14 = i.f4128k.a(jSONObject.optJSONObject("fraud"));
                o[] b11 = aVar.b(jSONObject.optJSONArray("alternatePlaces"));
                o a15 = aVar.a(jSONObject.optJSONObject("verifiedPlace"));
                int optInt = jSONObject.optInt("verification");
                d dVar = optInt == -1 ? optInt != 1 ? d.UNVERIFY : d.ACCEPT : d.REJECT;
                int optInt2 = jSONObject.optInt("confidence");
                b bVar = optInt2 == 1 ? optInt2 != 2 ? optInt2 != 3 ? b.NONE : b.HIGH : b.MEDIUM : b.LOW;
                d dVar2 = dVar;
                float optDouble = (float) jSONObject.optDouble("duration", 0.0d);
                JSONObject optJSONObject = jSONObject.optJSONObject("location");
                optJSONArray = optJSONObject == null ? optJSONObject.optJSONArray("coordinates") : null;
                Location location = new Location("RadarSDK");
                if (optJSONArray == null) {
                    f10 = optDouble;
                    d10 = optJSONArray.optDouble(0);
                } else {
                    f10 = optDouble;
                    d10 = 0.0d;
                }
                location.setLongitude(d10);
                location.setLatitude(optJSONArray == null ? optJSONArray.optDouble(1) : 0.0d);
                if (jSONObject.has("locationAccuracy")) {
                    location.setAccuracy((float) jSONObject.optDouble("locationAccuracy"));
                }
                location.setTime(date.getTime());
                return new h(str, date, date2, optBoolean, cVar2, optString3, b10, a10, a11, a12, a13, a14, b11, a15, dVar2, bVar, f10, location, jSONObject.optBoolean("replayed"), jSONObject.optJSONObject("metadata"));
            }
            cVar = c.CONVERSION;
            c cVar22 = cVar;
            if (cVar22 != c.CONVERSION) {
            }
            j b102 = j.f4139h.b(jSONObject.optJSONObject("geofence"));
            o.a aVar2 = o.f4157h;
            o a102 = aVar2.a(jSONObject.optJSONObject("place"));
            q a112 = q.f4167l.a(jSONObject.optJSONObject(EventKeys.REGION));
            C1165b a122 = C1165b.f4041l.a(jSONObject.optJSONObject("beacon"));
            B a132 = B.f3966k.a(jSONObject.optJSONObject("trip"));
            i a142 = i.f4128k.a(jSONObject.optJSONObject("fraud"));
            o[] b112 = aVar2.b(jSONObject.optJSONArray("alternatePlaces"));
            o a152 = aVar2.a(jSONObject.optJSONObject("verifiedPlace"));
            int optInt3 = jSONObject.optInt("verification");
            if (optInt3 == -1) {
            }
            int optInt22 = jSONObject.optInt("confidence");
            b bVar2 = optInt22 == 1 ? optInt22 != 2 ? optInt22 != 3 ? b.NONE : b.HIGH : b.MEDIUM : b.LOW;
            d dVar22 = dVar;
            float optDouble2 = (float) jSONObject.optDouble("duration", 0.0d);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("location");
            if (optJSONObject2 == null) {
            }
            Location location2 = new Location("RadarSDK");
            if (optJSONArray == null) {
            }
            location2.setLongitude(d10);
            location2.setLatitude(optJSONArray == null ? optJSONArray.optDouble(1) : 0.0d);
            if (jSONObject.has("locationAccuracy")) {
            }
            location2.setTime(date.getTime());
            return new h(str, date, date2, optBoolean, cVar22, optString3, b102, a102, a112, a122, a132, a142, b112, a152, dVar22, bVar2, f10, location2, jSONObject.optBoolean("replayed"), jSONObject.optJSONObject("metadata"));
        }

        public final h[] b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            h[] hVarArr = new h[length];
            for (int i10 = 0; i10 < length; i10++) {
                hVarArr[i10] = h.f4075t.a(jSONArray.optJSONObject(i10));
            }
            Object[] array = ArraysKt.filterNotNull(hVarArr).toArray(new h[0]);
            if (array != null) {
                return (h[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String c(c type) {
            Intrinsics.checkNotNullParameter(type, "type");
            switch (C0091a.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    return "user.entered_geofence";
                case 2:
                    return "user.exited_geofence";
                case 3:
                    return "user.dwelled_in_geofence";
                case 4:
                    return "user.entered_place";
                case 5:
                    return "user.exited_place";
                case 6:
                    return "user.entered_region_country";
                case 7:
                    return "user.exited_region_country";
                case 8:
                    return "user.entered_region_dma";
                case 9:
                    return "user.exited_region_dma";
                case 10:
                    return "user.entered_region_state";
                case 11:
                    return "user.exited_region_state";
                case 12:
                    return "user.entered_region_postal_code";
                case 13:
                    return "user.exited_region_postal_code";
                case 14:
                    return "user.nearby_place_chain";
                case 15:
                    return "user.entered_beacon";
                case 16:
                    return "user.exited_beacon";
                case 17:
                    return "user.started_trip";
                case 18:
                    return "user.updated_trip";
                case 19:
                    return "user.stopped_trip";
                case 20:
                    return "user.approaching_trip_destination";
                case 21:
                    return "user.arrived_at_trip_destination";
                case 22:
                    return "user.arrived_at_wrong_trip_destination";
                case 23:
                    return "user.failed_fraud";
                default:
                    return null;
            }
        }

        public final JSONArray d(h[] hVarArr) {
            if (hVarArr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (h hVar : hVarArr) {
                jSONArray.put(hVar.i());
            }
            return jSONArray;
        }

        public a() {
        }
    }

    public enum b {
        NONE(0),
        LOW(1),
        MEDIUM(2),
        HIGH(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f4099a;

        b(int i10) {
            this.f4099a = i10;
        }

        public final int b() {
            return this.f4099a;
        }
    }

    public enum c {
        UNKNOWN,
        CONVERSION,
        USER_ENTERED_GEOFENCE,
        USER_EXITED_GEOFENCE,
        USER_DWELLED_IN_GEOFENCE,
        USER_ENTERED_PLACE,
        USER_EXITED_PLACE,
        USER_ENTERED_REGION_COUNTRY,
        USER_EXITED_REGION_COUNTRY,
        USER_ENTERED_REGION_DMA,
        USER_EXITED_REGION_DMA,
        USER_ENTERED_REGION_STATE,
        USER_EXITED_REGION_STATE,
        USER_ENTERED_REGION_POSTAL_CODE,
        USER_EXITED_REGION_POSTAL_CODE,
        USER_NEARBY_PLACE_CHAIN,
        USER_ENTERED_BEACON,
        USER_EXITED_BEACON,
        USER_STARTED_TRIP,
        USER_UPDATED_TRIP,
        USER_STOPPED_TRIP,
        USER_APPROACHING_TRIP_DESTINATION,
        USER_ARRIVED_AT_TRIP_DESTINATION,
        USER_ARRIVED_AT_WRONG_TRIP_DESTINATION,
        USER_FAILED_FRAUD
    }

    public enum d {
        ACCEPT,
        UNVERIFY,
        REJECT
    }

    public h(String _id, Date createdAt, Date actualCreatedAt, boolean z10, c type, String str, j jVar, o oVar, q qVar, C1165b c1165b, B b10, i iVar, o[] oVarArr, o oVar2, d verification, b confidence, float f10, Location location, boolean z11, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(actualCreatedAt, "actualCreatedAt");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(verification, "verification");
        Intrinsics.checkNotNullParameter(confidence, "confidence");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4076a = _id;
        this.f4077b = createdAt;
        this.f4078c = actualCreatedAt;
        this.f4079d = z10;
        this.f4080e = type;
        this.f4081f = str;
        this.f4082g = jVar;
        this.f4083h = oVar;
        this.f4084i = qVar;
        this.f4085j = c1165b;
        this.f4086k = b10;
        this.f4087l = iVar;
        this.alternatePlaces = oVarArr;
        this.f4088m = oVar2;
        this.f4089n = verification;
        this.f4090o = confidence;
        this.f4091p = f10;
        this.f4092q = location;
        this.f4093r = z11;
        this.f4094s = jSONObject;
    }

    public static final JSONArray h(h[] hVarArr) {
        return f4075t.d(hVarArr);
    }

    public final C1165b a() {
        return this.f4085j;
    }

    public final String b() {
        return this.f4081f;
    }

    public final j c() {
        return this.f4082g;
    }

    public final boolean d() {
        return this.f4093r;
    }

    public final B e() {
        return this.f4086k;
    }

    public final c f() {
        return this.f4080e;
    }

    public final String g() {
        return this.f4076a;
    }

    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this.f4076a);
        R0 r02 = R0.f49781a;
        jSONObject.putOpt("createdAt", r02.a(this.f4077b));
        jSONObject.putOpt("actualCreatedAt", r02.a(this.f4078c));
        jSONObject.putOpt("live", Boolean.valueOf(this.f4079d));
        jSONObject.putOpt("type", f4075t.c(this.f4080e));
        j jVar = this.f4082g;
        jSONObject.putOpt("geofence", jVar != null ? jVar.e() : null);
        o oVar = this.f4083h;
        jSONObject.putOpt("place", oVar != null ? oVar.c() : null);
        b bVar = this.f4090o;
        jSONObject.putOpt("confidence", bVar != null ? Integer.valueOf(bVar.b()) : null);
        jSONObject.putOpt("duration", Float.valueOf(this.f4091p));
        q qVar = this.f4084i;
        jSONObject.putOpt(EventKeys.REGION, qVar != null ? qVar.c() : null);
        C1165b c1165b = this.f4085j;
        jSONObject.putOpt("beacon", c1165b != null ? c1165b.h() : null);
        B b10 = this.f4086k;
        jSONObject.putOpt("trip", b10 != null ? b10.b() : null);
        i iVar = this.f4087l;
        jSONObject.putOpt("fraud", iVar != null ? iVar.a() : null);
        jSONObject.putOpt("alternatePlaces", o.f4157h.c(this.alternatePlaces));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("type", "Point");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f4092q.getLongitude());
        jSONArray.put(this.f4092q.getLatitude());
        jSONObject2.putOpt("coordinates", jSONArray);
        jSONObject.putOpt("location", jSONObject2);
        jSONObject.putOpt("replayed", Boolean.valueOf(this.f4093r));
        jSONObject.putOpt("metadata", this.f4094s);
        return jSONObject;
    }
}
