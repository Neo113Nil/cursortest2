package Gh;

import Gh.C1166c;
import Gh.q;
import android.location.Location;
import com.appsflyer.AdRevenueScheme;
import io.radar.sdk.C4589c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: s, reason: collision with root package name */
    public static final a f3984s = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f3985a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3986b;

    @Nullable
    private final C1165b[] beacons;

    /* renamed from: c, reason: collision with root package name */
    public final String f3987c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3988d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f3989e;

    /* renamed from: f, reason: collision with root package name */
    public final Location f3990f;

    /* renamed from: g, reason: collision with root package name */
    public final o f3991g;

    @Nullable
    private final j[] geofences;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3992h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3993i;

    /* renamed from: j, reason: collision with root package name */
    public final q f3994j;

    /* renamed from: k, reason: collision with root package name */
    public final q f3995k;

    /* renamed from: l, reason: collision with root package name */
    public final q f3996l;

    /* renamed from: m, reason: collision with root package name */
    public final q f3997m;

    /* renamed from: n, reason: collision with root package name */
    public final C4589c.EnumC4597i f3998n;

    @Nullable
    private final C1166c[] nearbyPlaceChains;

    /* renamed from: o, reason: collision with root package name */
    public final B f3999o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4000p;

    /* renamed from: q, reason: collision with root package name */
    public final i f4001q;

    /* renamed from: r, reason: collision with root package name */
    public final C4589c.EnumC4590a f4002r;

    @Nullable
    private final z[] segments;

    @Nullable
    private final C1166c[] topChains;

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
        public final C a(JSONObject jSONObject) {
            C4589c.EnumC4597i enumC4597i;
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("_id");
            if (optString == null) {
                optString = "";
            }
            String str = optString;
            String optString2 = jSONObject.optString("userId");
            String str2 = optString2 == null ? null : optString2;
            String optString3 = jSONObject.optString("deviceId");
            String str3 = optString3 == null ? null : optString3;
            String optString4 = jSONObject.optString("description");
            String str4 = optString4 == null ? null : optString4;
            JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
            boolean optBoolean = jSONObject.optBoolean("stopped");
            boolean optBoolean2 = jSONObject.optBoolean("foreground");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("location");
            JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray("coordinates") : null;
            Location location = new Location("RadarSDK");
            location.setLongitude(optJSONArray != null ? optJSONArray.optDouble(0) : 0.0d);
            location.setLatitude(optJSONArray != null ? optJSONArray.optDouble(1) : 0.0d);
            if (jSONObject.has("locationAccuracy")) {
                location.setAccuracy((float) jSONObject.optDouble("locationAccuracy"));
            }
            j[] c10 = j.f4139h.c(jSONObject.optJSONArray("geofences"));
            o a10 = o.f4157h.a(jSONObject.optJSONObject("place"));
            C1165b[] b10 = C1165b.f4041l.b(jSONObject.optJSONArray("beacons"));
            q.a aVar = q.f4167l;
            q a11 = aVar.a(jSONObject.optJSONObject(AdRevenueScheme.COUNTRY));
            q a12 = aVar.a(jSONObject.optJSONObject("state"));
            q a13 = aVar.a(jSONObject.optJSONObject("dma"));
            q a14 = aVar.a(jSONObject.optJSONObject("postalCode"));
            C1166c.a aVar2 = C1166c.f4055e;
            C1166c[] b11 = aVar2.b(jSONObject.optJSONArray("nearbyPlaceChains"));
            z[] b12 = z.f4216c.b(jSONObject.optJSONArray("segments"));
            C1166c[] b13 = aVar2.b(jSONObject.optJSONArray("topChains"));
            String optString5 = jSONObject.optString("source");
            if (optString5 != null) {
                switch (optString5.hashCode()) {
                    case -1821326322:
                        if (optString5.equals("MANUAL_LOCATION")) {
                            enumC4597i = C4589c.EnumC4597i.MANUAL_LOCATION;
                            break;
                        }
                        break;
                    case -600791247:
                        if (optString5.equals("FOREGROUND_LOCATION")) {
                            enumC4597i = C4589c.EnumC4597i.FOREGROUND_LOCATION;
                            break;
                        }
                        break;
                    case -397844867:
                        if (optString5.equals("GEOFENCE_EXIT")) {
                            enumC4597i = C4589c.EnumC4597i.GEOFENCE_EXIT;
                            break;
                        }
                        break;
                    case 550753683:
                        if (optString5.equals("GEOFENCE_DWELL")) {
                            enumC4597i = C4589c.EnumC4597i.GEOFENCE_DWELL;
                            break;
                        }
                        break;
                    case 551423289:
                        if (optString5.equals("GEOFENCE_ENTER")) {
                            enumC4597i = C4589c.EnumC4597i.GEOFENCE_ENTER;
                            break;
                        }
                        break;
                    case 1274325706:
                        if (optString5.equals("MOCK_LOCATION")) {
                            enumC4597i = C4589c.EnumC4597i.MOCK_LOCATION;
                            break;
                        }
                        break;
                    case 1963193254:
                        if (optString5.equals("BACKGROUND_LOCATION")) {
                            enumC4597i = C4589c.EnumC4597i.BACKGROUND_LOCATION;
                            break;
                        }
                        break;
                }
                C4589c.EnumC4597i enumC4597i2 = enumC4597i;
                B a15 = B.f3966k.a(jSONObject.optJSONObject("trip"));
                boolean optBoolean3 = jSONObject.optBoolean("debug");
                i a16 = i.f4128k.a(jSONObject.optJSONObject("fraud"));
                C4589c.EnumC4590a.C0744a c0744a = C4589c.EnumC4590a.f50007a;
                String optString6 = jSONObject.optString("activityType");
                Intrinsics.checkNotNullExpressionValue(optString6, "obj.optString(FIELD_ACTIVITY_TYPE)");
                return new C(str, str2, str3, str4, optJSONObject, location, c10, a10, b10, optBoolean, optBoolean2, a11, a12, a13, a14, b11, b12, b13, enumC4597i2, a15, optBoolean3, a16, c0744a.a(optString6));
            }
            enumC4597i = C4589c.EnumC4597i.UNKNOWN;
            C4589c.EnumC4597i enumC4597i22 = enumC4597i;
            B a152 = B.f3966k.a(jSONObject.optJSONObject("trip"));
            boolean optBoolean32 = jSONObject.optBoolean("debug");
            i a162 = i.f4128k.a(jSONObject.optJSONObject("fraud"));
            C4589c.EnumC4590a.C0744a c0744a2 = C4589c.EnumC4590a.f50007a;
            String optString62 = jSONObject.optString("activityType");
            Intrinsics.checkNotNullExpressionValue(optString62, "obj.optString(FIELD_ACTIVITY_TYPE)");
            return new C(str, str2, str3, str4, optJSONObject, location, c10, a10, b10, optBoolean, optBoolean2, a11, a12, a13, a14, b11, b12, b13, enumC4597i22, a152, optBoolean32, a162, c0744a2.a(optString62));
        }

        public a() {
        }
    }

    public C(String _id, String str, String str2, String str3, JSONObject jSONObject, Location location, j[] jVarArr, o oVar, C1165b[] c1165bArr, boolean z10, boolean z11, q qVar, q qVar2, q qVar3, q qVar4, C1166c[] c1166cArr, z[] zVarArr, C1166c[] c1166cArr2, C4589c.EnumC4597i source, B b10, boolean z12, i iVar, C4589c.EnumC4590a enumC4590a) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f3985a = _id;
        this.f3986b = str;
        this.f3987c = str2;
        this.f3988d = str3;
        this.f3989e = jSONObject;
        this.f3990f = location;
        this.geofences = jVarArr;
        this.f3991g = oVar;
        this.beacons = c1165bArr;
        this.f3992h = z10;
        this.f3993i = z11;
        this.f3994j = qVar;
        this.f3995k = qVar2;
        this.f3996l = qVar3;
        this.f3997m = qVar4;
        this.nearbyPlaceChains = c1166cArr;
        this.segments = zVarArr;
        this.topChains = c1166cArr2;
        this.f3998n = source;
        this.f3999o = b10;
        this.f4000p = z12;
        this.f4001q = iVar;
        this.f4002r = enumC4590a;
    }

    public final C1165b[] a() {
        return this.beacons;
    }

    public final q b() {
        return this.f3994j;
    }

    public final boolean c() {
        return this.f4000p;
    }

    public final q d() {
        return this.f3996l;
    }

    public final j[] e() {
        return this.geofences;
    }

    public final o f() {
        return this.f3991g;
    }

    public final q g() {
        return this.f3997m;
    }

    public final q h() {
        return this.f3995k;
    }

    public final B i() {
        return this.f3999o;
    }

    public final String j() {
        return this.f3985a;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this.f3985a);
        jSONObject.putOpt("userId", this.f3986b);
        jSONObject.putOpt("deviceId", this.f3987c);
        jSONObject.putOpt("description", this.f3988d);
        jSONObject.putOpt("metadata", this.f3989e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("type", "Point");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f3990f.getLongitude());
        jSONArray.put(this.f3990f.getLatitude());
        jSONObject2.putOpt("coordinates", jSONArray);
        jSONObject.putOpt("location", jSONObject2);
        jSONObject.putOpt("geofences", j.f4139h.e(this.geofences));
        o oVar = this.f3991g;
        jSONObject.putOpt("place", oVar != null ? oVar.c() : null);
        jSONObject.putOpt("beacons", C1165b.f4041l.d(this.beacons));
        jSONObject.putOpt("stopped", Boolean.valueOf(this.f3992h));
        jSONObject.putOpt("foreground", Boolean.valueOf(this.f3993i));
        q qVar = this.f3994j;
        jSONObject.putOpt(AdRevenueScheme.COUNTRY, qVar != null ? qVar.c() : null);
        q qVar2 = this.f3995k;
        jSONObject.putOpt("state", qVar2 != null ? qVar2.c() : null);
        q qVar3 = this.f3996l;
        jSONObject.putOpt("dma", qVar3 != null ? qVar3.c() : null);
        q qVar4 = this.f3997m;
        jSONObject.putOpt("postalCode", qVar4 != null ? qVar4.c() : null);
        C1166c.a aVar = C1166c.f4055e;
        jSONObject.putOpt("nearbyPlaceChains", aVar.c(this.nearbyPlaceChains));
        jSONObject.putOpt("segments", z.f4216c.c(this.segments));
        jSONObject.putOpt("topChains", aVar.c(this.topChains));
        jSONObject.putOpt("source", C4589c.T0(this.f3998n));
        B b10 = this.f3999o;
        jSONObject.putOpt("trip", b10 != null ? b10.b() : null);
        jSONObject.putOpt("debug", Boolean.valueOf(this.f4000p));
        i iVar = this.f4001q;
        jSONObject.putOpt("fraud", iVar != null ? iVar.a() : null);
        C4589c.EnumC4590a enumC4590a = this.f4002r;
        jSONObject.putOpt("activityType", enumC4590a != null ? enumC4590a.toString() : null);
        return jSONObject;
    }
}
