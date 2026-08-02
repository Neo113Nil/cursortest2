package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005BÓ\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0019\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010)\u001a\u00020#\u0012\b\b\u0002\u0010+\u001a\u00020#\u0012\b\b\u0002\u0010-\u001a\u00020\u000e\u0012\b\b\u0002\u0010/\u001a\u00020#\u0012\b\b\u0002\u00101\u001a\u00020#\u0012\b\b\u0002\u00103\u001a\u00020\u0019\u0012\b\b\u0002\u00105\u001a\u00020#\u0012\b\b\u0002\u00107\u001a\u00020\u0019\u0012\b\b\u0002\u00108\u001a\u00020\u0019\u0012\b\b\u0002\u00109\u001a\u00020#¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b;\u0010=J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011\"\u0004\b\u0005\u0010\u0012R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0007\u0010\u0015\"\u0004\b\u0007\u0010\u0016R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0005\u0010\u0016R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015\"\u0004\b\u0006\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\n\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b\b\u0010\u001eR\"\u0010!\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b\t\u0010\u001eR\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b\n\u0010(R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'\"\u0004\b\b\u0010(R\"\u0010+\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b\u0007\u0010(R\"\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0010\u001a\u0004\b.\u0010\u0011\"\u0004\b\u0007\u0010\u0012R\"\u0010/\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b\u0006\u0010(R\"\u00101\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'\"\u0004\b\t\u0010(R\"\u00103\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001d\"\u0004\b\u0006\u0010\u001eR\"\u00105\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'\"\u0004\b\u0005\u0010(R\"\u00107\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001b\u001a\u0004\b\n\u0010\u001d\"\u0004\b\u0007\u0010\u001eR\"\u00108\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001b\u001a\u0004\b\b\u0010\u001d\"\u0004\b\u0005\u0010\u001eR\"\u00109\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'\"\u0004\b6\u0010(¨\u0006>"}, d2 = {"Lbo/app/i5;", "", "Lorg/json/JSONObject;", "jsonObject", "", Constants.BRAZE_PUSH_CONTENT_KEY, "c", "b", "e", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "f", "", "blocklistKey", "", "", "configTime", "J", "()J", "(J)V", "blocklistedEvents", "Ljava/util/Set;", "()Ljava/util/Set;", "(Ljava/util/Set;)V", "blocklistedAttributes", "blocklistedPurchases", "", "minTimeSinceLastRequest", "I", "p", "()I", "(I)V", "minTimeSinceLastReport", "o", "maxNumToRegister", "m", "", "geofencesEnabledSet", "Z", "l", "()Z", "(Z)V", "geofencesEnabled", "k", "isContentCardsFeatureEnabled", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "messagingSessionTimeout", "n", "ephemeralEventsEnabled", "h", "featureFlagsEnabled", "i", "featureFlagsRefreshRateLimit", "j", "contentCardRateLimitEnabled", "g", "contentCardRateLimitBucketRefillRate", "contentCardRateLimitBucketCapacity", "pushMaxEnabled", "q", "<init>", "(JLjava/util/Set;Ljava/util/Set;Ljava/util/Set;IIIZZZJZZIZIIZ)V", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class i5 {
    public static final a s = new a(null);
    private long a;
    private Set<String> b;
    private Set<String> c;
    private Set<String> d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lbo/app/i5$a;", "", "", "ATTRIBUTES_BLOCKLIST", "Ljava/lang/String;", "getATTRIBUTES_BLOCKLIST$annotations", "()V", "CONFIG_TIME", "CONTENT_CARDS", "CONTENT_CARDS_RATE_LIMIT", "CONTENT_CARDS_RATE_LIMIT_CAPACITY", "CONTENT_CARDS_RATE_LIMIT_REFILL_RATE", "ENABLED", "EPHEMERAL_EVENTS", "EVENTS_BLOCKLIST", "getEVENTS_BLOCKLIST$annotations", "FEATURE_FLAGS", "GEOFENCES", "GEOFENCES_MAX_NUM_TO_REGISTER", "GEOFENCES_MIN_TIME_REPORT", "GEOFENCES_MIN_TIME_REQUEST", "MESSAGING_SESSION_TIMEOUT", "PURCHASES_BLOCKLIST", "getPURCHASES_BLOCKLIST$annotations", "PUSH_MAX", "REFRESH_RATE_LIMIT", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required content cards fields. Using defaults.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting Content Card rate limit fields. Using defaults.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required ephemeral events fields. Using defaults.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        public static final e b = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required feature flag fields. Disabling feature flags.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required geofence fields. Using defaults.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required push max fields. Disabling push max.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$e"}, k = 3, mv = {1, 6, 0})
    public static final class h extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.opt(i) instanceof String);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$f"}, k = 3, mv = {1, 6, 0})
    public static final class i extends Lambda implements Function1<Integer, String> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final String a(int i) {
            Object obj = this.b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public i5(long j, Set<String> set, Set<String> set2, Set<String> set3, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, int i5, boolean z6, int i6, int i7, boolean z7) {
        this.a = j;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = j2;
        this.l = z4;
        this.m = z5;
        this.n = i5;
        this.o = z6;
        this.p = i6;
        this.q = i7;
        this.r = z7;
    }

    public final void a(long j) {
        this.a = j;
    }

    public final Set<String> b() {
        return this.b;
    }

    public final Set<String> c() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final long getA() {
        return this.a;
    }

    public final void e(int i2) {
        this.f = i2;
    }

    public final void f(int i2) {
        this.e = i2;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getO() {
        return this.o;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getL() {
        return this.l;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getM() {
        return this.m;
    }

    /* renamed from: j, reason: from getter */
    public final int getN() {
        return this.n;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getI() {
        return this.i;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getH() {
        return this.h;
    }

    /* renamed from: m, reason: from getter */
    public final int getG() {
        return this.g;
    }

    /* renamed from: n, reason: from getter */
    public final long getK() {
        return this.k;
    }

    /* renamed from: o, reason: from getter */
    public final int getF() {
        return this.f;
    }

    /* renamed from: p, reason: from getter */
    public final int getE() {
        return this.e;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getR() {
        return this.r;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getJ() {
        return this.j;
    }

    public final Set<String> a() {
        return this.c;
    }

    public final void b(Set<String> set) {
        this.b = set;
    }

    public final void c(Set<String> set) {
        this.d = set;
    }

    public final void d(int i2) {
        this.g = i2;
    }

    public final void e(boolean z) {
        this.i = z;
    }

    public final void f(boolean z) {
        this.h = z;
    }

    public final void g(boolean z) {
        this.r = z;
    }

    public final void a(Set<String> set) {
        this.c = set;
    }

    public final void b(boolean z) {
        this.j = z;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void d(boolean z) {
        this.m = z;
    }

    /* renamed from: e, reason: from getter */
    public final int getQ() {
        return this.q;
    }

    /* renamed from: f, reason: from getter */
    public final int getP() {
        return this.p;
    }

    private final void d(JSONObject jsonObject) {
        JSONObject optJSONObject = jsonObject.optJSONObject("feature_flags");
        if (optJSONObject != null) {
            try {
                this.m = optJSONObject.optBoolean("enabled");
                this.n = optJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
                this.m = false;
            }
        }
    }

    private final void e(JSONObject jsonObject) {
        JSONObject optJSONObject = jsonObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.e = optJSONObject.getInt("min_time_since_last_request");
                this.f = optJSONObject.getInt("min_time_since_last_report");
                this.i = optJSONObject.getBoolean("enabled");
                this.h = true;
                this.g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, f.b);
                this.e = -1;
                this.f = -1;
                this.g = -1;
                this.i = false;
                this.h = false;
            }
        }
    }

    private final void f(JSONObject jsonObject) {
        JSONObject optJSONObject = jsonObject.optJSONObject("push_max");
        if (optJSONObject != null) {
            try {
                this.r = optJSONObject.optBoolean("enabled");
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, g.b);
                this.r = false;
            }
        }
    }

    public final void a(boolean z) {
        this.o = z;
    }

    public final void b(long j) {
        this.k = j;
    }

    public final void c(int i2) {
        this.n = i2;
    }

    private final void c(JSONObject jsonObject) {
        boolean z;
        JSONObject optJSONObject = jsonObject.optJSONObject("ephemeral_events");
        if (optJSONObject == null) {
            return;
        }
        try {
            z = optJSONObject.getBoolean("enabled");
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
            z = false;
        }
        c(z);
    }

    public final void a(int i2) {
        this.q = i2;
    }

    public final void b(int i2) {
        this.p = i2;
    }

    private final void a(JSONObject jsonObject) {
        this.b = a(jsonObject, "events_blacklist");
        this.c = a(jsonObject, "attributes_blacklist");
        this.d = a(jsonObject, "purchases_blacklist");
    }

    private final void b(JSONObject jsonObject) {
        boolean z;
        JSONObject optJSONObject = jsonObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, b.b);
                z = false;
            }
            this.j = z;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rate_limit");
            if (optJSONObject2 == null) {
                return;
            }
            try {
                a(optJSONObject2.getBoolean("enabled"));
                b(optJSONObject2.getInt("refill_rate"));
                a(optJSONObject2.getInt("capacity"));
            } catch (JSONException e3) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e3, c.b);
                a(false);
                b(-1);
                a(-1);
            }
        }
    }

    private final Set<String> a(JSONObject jsonObject, String blocklistKey) {
        Iterator it;
        HashSet hashSet = new HashSet();
        if (jsonObject.has(blocklistKey)) {
            JSONArray optJSONArray = jsonObject.optJSONArray(blocklistKey);
            if (optJSONArray == null) {
                it = CollectionsKt.emptyList().iterator();
            } else {
                it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new h(optJSONArray)), new i(optJSONArray)).iterator();
            }
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    public /* synthetic */ i5(long j, Set set, Set set2, Set set3, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, int i5, boolean z6, int i6, int i7, boolean z7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j, (i8 & 2) != 0 ? null : set, (i8 & 4) != 0 ? null : set2, (i8 & 8) == 0 ? set3 : null, (i8 & 16) != 0 ? -1 : i2, (i8 & 32) != 0 ? -1 : i3, (i8 & 64) != 0 ? -1 : i4, (i8 & 128) != 0 ? false : z, (i8 & 256) != 0 ? false : z2, (i8 & 512) != 0 ? false : z3, (i8 & 1024) != 0 ? -1L : j2, (i8 & 2048) != 0 ? false : z4, (i8 & 4096) != 0 ? false : z5, (i8 & 8192) != 0 ? -1 : i5, (i8 & 16384) != 0 ? false : z6, (i8 & 32768) != 0 ? -1 : i6, (i8 & 65536) != 0 ? -1 : i7, (i8 & 131072) != 0 ? false : z7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i5(JSONObject jsonObject) {
        this(0L, null, null, null, 0, 0, 0, false, false, false, 0L, false, false, 0, false, 0, 0, false, 262143, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.a = jsonObject.optLong(Globalization.TIME, 0L);
        this.k = jsonObject.optLong("messaging_session_timeout", -1L);
        a(jsonObject);
        b(jsonObject);
        e(jsonObject);
        c(jsonObject);
        d(jsonObject);
        f(jsonObject);
    }
}
