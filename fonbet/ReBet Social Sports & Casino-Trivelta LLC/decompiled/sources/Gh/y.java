package Gh;

import android.content.Context;
import io.radar.sdk.C4589c;
import io.radar.sdk.L0;
import io.radar.sdk.T;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: n, reason: collision with root package name */
    public static final a f4201n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f4202a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4203b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4204c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4205d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4206e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4207f;

    /* renamed from: g, reason: collision with root package name */
    public final C4589c.EnumC4599k f4208g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4209h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4210i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4211j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4212k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4213l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4214m;

    public static final class a {

        /* renamed from: Gh.y$a$a, reason: collision with other inner class name */
        public static final class C0092a implements T.InterfaceC4580d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f4215a;

            public C0092a(Context context) {
                this.f4215a = context;
            }

            @Override // io.radar.sdk.T.InterfaceC4580d
            public void a(C4589c.EnumC4607s status, e eVar) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (eVar == null) {
                    return;
                }
                L0.f49705a.W(this.f4215a, eVar.b().b());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
            int optInt = jSONObject2.optInt("maxConcurrentJobs", 1);
            boolean optBoolean = jSONObject2.optBoolean("networkAny", false);
            boolean optBoolean2 = jSONObject2.optBoolean("usePersistence", false);
            boolean optBoolean3 = jSONObject2.optBoolean("extendFlushReplays", false);
            boolean optBoolean4 = jSONObject2.optBoolean("useLogPersistence", false);
            boolean optBoolean5 = jSONObject2.optBoolean("useRadarModifiedBeacon", false);
            String optString = jSONObject2.optString("logLevel", "info");
            Intrinsics.checkNotNullExpressionValue(optString, "config.optString(LOG_LEVEL, \"info\")");
            String upperCase = optString.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return new y(optInt, optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, C4589c.EnumC4599k.valueOf(upperCase), jSONObject2.optBoolean("startTrackingOnInitialize", false), jSONObject2.optBoolean("trackOnceOnAppOpen", false), jSONObject2.optBoolean("useLocationMetadata", false), jSONObject2.optBoolean("useOpenedAppConversion", true), jSONObject2.optBoolean("useForegroundLocationUpdatedAtMsDiff", false), jSONObject2.optInt("locationManagerTimeout", 0));
        }

        public final void b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C4589c.f49918a.l().e("sdkConfigUpdate", false, new C0092a(context));
        }

        public a() {
        }
    }

    public y(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C4589c.EnumC4599k logLevel, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i11) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f4202a = i10;
        this.f4203b = z10;
        this.f4204c = z11;
        this.f4205d = z12;
        this.f4206e = z13;
        this.f4207f = z14;
        this.f4208g = logLevel;
        this.f4209h = z15;
        this.f4210i = z16;
        this.f4211j = z17;
        this.f4212k = z18;
        this.f4213l = z19;
        this.f4214m = i11;
    }

    public final boolean a() {
        return this.f4205d;
    }

    public final int b() {
        return this.f4214m;
    }

    public final C4589c.EnumC4599k c() {
        return this.f4208g;
    }

    public final int d() {
        return this.f4202a;
    }

    public final boolean e() {
        return this.f4203b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f4202a == yVar.f4202a && this.f4203b == yVar.f4203b && this.f4204c == yVar.f4204c && this.f4205d == yVar.f4205d && this.f4206e == yVar.f4206e && this.f4207f == yVar.f4207f && this.f4208g == yVar.f4208g && this.f4209h == yVar.f4209h && this.f4210i == yVar.f4210i && this.f4211j == yVar.f4211j && this.f4212k == yVar.f4212k && this.f4213l == yVar.f4213l && this.f4214m == yVar.f4214m;
    }

    public final boolean f() {
        return this.f4209h;
    }

    public final boolean g() {
        return this.f4210i;
    }

    public final boolean h() {
        return this.f4213l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f4202a) * 31;
        boolean z10 = this.f4203b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f4204c;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f4205d;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f4206e;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z14 = this.f4207f;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int hashCode2 = (((i17 + i18) * 31) + this.f4208g.hashCode()) * 31;
        boolean z15 = this.f4209h;
        int i19 = z15;
        if (z15 != 0) {
            i19 = 1;
        }
        int i20 = (hashCode2 + i19) * 31;
        boolean z16 = this.f4210i;
        int i21 = z16;
        if (z16 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z17 = this.f4211j;
        int i23 = z17;
        if (z17 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        boolean z18 = this.f4212k;
        int i25 = z18;
        if (z18 != 0) {
            i25 = 1;
        }
        int i26 = (i24 + i25) * 31;
        boolean z19 = this.f4213l;
        return ((i26 + (z19 ? 1 : z19 ? 1 : 0)) * 31) + Integer.hashCode(this.f4214m);
    }

    public final boolean i() {
        return this.f4211j;
    }

    public final boolean j() {
        return this.f4206e;
    }

    public final boolean k() {
        return this.f4212k;
    }

    public final boolean l() {
        return this.f4204c;
    }

    public final boolean m() {
        return this.f4207f;
    }

    public final JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("networkAny", Boolean.valueOf(this.f4203b));
        jSONObject.putOpt("maxConcurrentJobs", Integer.valueOf(this.f4202a));
        jSONObject.putOpt("usePersistence", Boolean.valueOf(this.f4204c));
        jSONObject.putOpt("extendFlushReplays", Boolean.valueOf(this.f4205d));
        jSONObject.putOpt("useLogPersistence", Boolean.valueOf(this.f4206e));
        jSONObject.putOpt("useRadarModifiedBeacon", Boolean.valueOf(this.f4207f));
        String lowerCase = this.f4208g.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject.putOpt("logLevel", lowerCase);
        jSONObject.putOpt("startTrackingOnInitialize", Boolean.valueOf(this.f4209h));
        jSONObject.putOpt("trackOnceOnAppOpen", Boolean.valueOf(this.f4210i));
        jSONObject.putOpt("useLocationMetadata", Boolean.valueOf(this.f4211j));
        jSONObject.putOpt("useOpenedAppConversion", Boolean.valueOf(this.f4212k));
        jSONObject.putOpt("useForegroundLocationUpdatedAtMsDiff", Boolean.valueOf(this.f4213l));
        jSONObject.putOpt("locationManagerTimeout", Integer.valueOf(this.f4214m));
        return jSONObject;
    }

    public String toString() {
        return "RadarSdkConfiguration(maxConcurrentJobs=" + this.f4202a + ", schedulerRequiresNetwork=" + this.f4203b + ", usePersistence=" + this.f4204c + ", extendFlushReplays=" + this.f4205d + ", useLogPersistence=" + this.f4206e + ", useRadarModifiedBeacon=" + this.f4207f + ", logLevel=" + this.f4208g + ", startTrackingOnInitialize=" + this.f4209h + ", trackOnceOnAppOpen=" + this.f4210i + ", useLocationMetadata=" + this.f4211j + ", useOpenedAppConversion=" + this.f4212k + ", useForegroundLocationUpdatedAtMsDiff=" + this.f4213l + ", locationManagerTimeout=" + this.f4214m + ')';
    }
}
