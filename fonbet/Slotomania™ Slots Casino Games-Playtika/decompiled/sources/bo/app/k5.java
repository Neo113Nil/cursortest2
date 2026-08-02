package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010G\u001a\u00020\u0002¢\u0006\u0004\bH\u0010IJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\rR(\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R$\u0010\t\u001a\u0004\u0018\u00010\b8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0005\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\"\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010*\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0011\u0010-\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020\f8F¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b.\u0010,R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u00102R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b5\u00102R\u0011\u00108\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u0010\u001dR\u0011\u0010:\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001dR\u0011\u0010<\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b;\u0010%R\u0011\u0010>\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b=\u0010\u001dR\u0011\u0010@\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b?\u0010%R\u0011\u0010B\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bA\u0010%R\u0011\u0010D\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bC\u0010\u001d¨\u0006J"}, d2 = {"Lbo/app/k5;", "", "", "storageKey", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "w", "Lbo/app/i5;", "serverConfig", "b", "Lkotlin/Pair;", "", "", "x", "o", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "serverConfigStorage", "Landroid/content/SharedPreferences;", "n", "()Landroid/content/SharedPreferences;", "getServerConfigStorage$android_sdk_base_release$annotations", "()V", "Lbo/app/i5;", "m", "()Lbo/app/i5;", "(Lbo/app/i5;)V", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "()Z", "isEphemeralEventsEnabled", "u", "isGeofencesEnabledSet", Constants.BRAZE_PUSH_TITLE_KEY, "isGeofencesEnabled", "", "l", "()I", "minTimeSinceLastRequest", "k", "minTimeSinceLastReport", "i", "maxNumToRegister", "j", "()J", "messagingSessionTimeout", "e", "getConfigTime$annotations", "configTime", "c", "()Ljava/util/Set;", "blocklistedEvents", "blocklistedAttributes", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "blocklistedPurchases", "q", "isContentCardsEnabled", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "isFeatureFlagsEnabled", "h", "featureFlagsRefreshRateLimit", "p", "isContentCardRateLimitEnabled", "g", "contentCardRateLimitBucketRefillRate", "f", "contentCardRateLimitBucketCapacity", "v", "isPushMaxEnabled", "Landroid/content/Context;", "context", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class k5 {
    public static final b e = new b(null);
    private final SharedPreferences a;
    private final ReentrantLock b;
    private final Mutex c;
    private i5 d;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Detected SDK update from '" + ((Object) this.b) + "' -> '" + this.c + "'. Clearing config update time.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007¨\u0006\u001e"}, d2 = {"Lbo/app/k5$b;", "", "", "apiKey", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "BLOCKLISTED_ATTRIBUTES_KEY", "Ljava/lang/String;", "BLOCKLISTED_EVENTS_KEY", "BLOCKLISTED_PURCHASES_KEY", "CONFIG_TIME_KEY", "CONTENT_CARDS_ENABLED_KEY", "CONTENT_CARDS_RATE_LIMIT_CAPACITY", "CONTENT_CARDS_RATE_LIMIT_ENABLED", "CONTENT_CARDS_RATE_LIMIT_REFILL_RATE", "EMPTY_BLOCKLIST", "EPHEMERAL_EVENTS_ENABLED", "FEATURE_FLAGS_ENABLED_KEY", "FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT_KEY", "FILE_NAME_BASE", "GEOFENCES_ENABLED_KEY", "GEOFENCES_ENABLED_SET_KEY", "GEOFENCES_MAX_NUM_TO_REGISTER_KEY", "GEOFENCES_MIN_TIME_REPORT_KEY", "GEOFENCES_MIN_TIME_REQUEST_KEY", "LAST_ACCESSED_SDK_VERSION", "MESSAGING_SESSION_TIMEOUT_KEY", "PUSH_MAX_ENABLED_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String apiKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            return Intrinsics.stringPlus("com.braze.storage.server_config.", apiKey);
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
            return "Not allowing server config info unlock. Returning null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$e"}, k = 3, mv = {1, 6, 0})
    public static final class d extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONArray jSONArray) {
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
    public static final class e extends Lambda implements Function1<Integer, String> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONArray jSONArray) {
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

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced exception retrieving blocklisted strings from local storage. Returning null.";
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
            return "Attempting to unlock server config info.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unlocking config info lock.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not persist server config to shared preferences.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ i5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(i5 i5Var) {
            super(0);
            this.b = i5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Finishing updating server config to ", this.b);
        }
    }

    public k5(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(e.a(apiKey), 0);
        this.a = sharedPreferences;
        this.b = new ReentrantLock();
        this.c = MutexKt.Mutex$default(false, 1, null);
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        if (!Intrinsics.areEqual(Constants.BRAZE_SDK_VERSION, string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a(string, Constants.BRAZE_SDK_VERSION), 2, (Object) null);
            sharedPreferences.edit().putLong("config_time", 0L).putString("last_accessed_sdk_version", Constants.BRAZE_SDK_VERSION).apply();
        }
        w();
    }

    private final void w() {
        i5 i5Var = new i5(0L, null, null, null, 0, 0, 0, false, false, false, 0L, false, false, 0, false, 0, 0, false, 262143, null);
        i5Var.a(b());
        i5Var.b(c());
        i5Var.c(d());
        i5Var.a(e());
        i5Var.b(j());
        i5Var.f(l());
        i5Var.e(k());
        i5Var.d(i());
        i5Var.e(t());
        i5Var.f(u());
        i5Var.b(q());
        i5Var.c(r());
        i5Var.d(s());
        i5Var.c(h());
        i5Var.a(p());
        i5Var.a(f());
        i5Var.b(g());
        i5Var.g(v());
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            a(i5Var);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(i5 i5Var) {
        this.d = i5Var;
    }

    public final Set<String> b() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Set<String> a2 = d2 == null ? null : d2.a();
            if (a2 == null) {
                a2 = a("blacklisted_attributes");
            }
            return a2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set<String> c() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Set<String> b2 = d2 == null ? null : d2.b();
            if (b2 == null) {
                b2 = a("blacklisted_events");
            }
            return b2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set<String> d() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Set<String> c2 = d2 == null ? null : d2.c();
            if (c2 == null) {
                c2 = a("blacklisted_purchases");
            }
            return c2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long e() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Long valueOf = d2 == null ? null : Long.valueOf(d2.getA());
            return valueOf == null ? getA().getLong("config_time", 0L) : valueOf.longValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int f() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Integer valueOf = d2 == null ? null : Integer.valueOf(d2.getQ());
            return valueOf == null ? getA().getInt("content_cards_rate_capacity", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int g() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Integer valueOf = d2 == null ? null : Integer.valueOf(d2.getP());
            return valueOf == null ? getA().getInt("content_cards_rate_refill_rate", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int h() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Integer valueOf = d2 == null ? null : Integer.valueOf(d2.getN());
            return valueOf == null ? getA().getInt("feature_flags_refresh_rate_limit", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int i() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Integer valueOf = d2 == null ? null : Integer.valueOf(d2.getG());
            return valueOf == null ? getA().getInt("geofences_max_num_to_register", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long j() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Long valueOf = d2 == null ? null : Long.valueOf(d2.getK());
            return valueOf == null ? getA().getLong("messaging_session_timeout", -1L) : valueOf.longValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int k() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Integer valueOf = d2 == null ? null : Integer.valueOf(d2.getF());
            return valueOf == null ? getA().getInt("geofences_min_time_since_last_report", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int l() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Integer valueOf = d2 == null ? null : Integer.valueOf(d2.getE());
            return valueOf == null ? getA().getInt("geofences_min_time_since_last_request", -1) : valueOf.intValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m, reason: from getter */
    public final i5 getD() {
        return this.d;
    }

    /* renamed from: n, reason: from getter */
    public final SharedPreferences getA() {
        return this.a;
    }

    public final boolean o() {
        return e() <= 0;
    }

    public final boolean p() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Boolean valueOf = d2 == null ? null : Boolean.valueOf(d2.getO());
            return valueOf == null ? getA().getBoolean("content_cards_rate_limit_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean q() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Boolean valueOf = d2 == null ? null : Boolean.valueOf(d2.getJ());
            return valueOf == null ? getA().getBoolean("content_cards_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean r() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Boolean valueOf = d2 == null ? null : Boolean.valueOf(d2.getL());
            return valueOf == null ? getA().getBoolean("ephemeral_events_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean s() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Boolean valueOf = d2 == null ? null : Boolean.valueOf(d2.getM());
            return valueOf == null ? getA().getBoolean("feature_flags_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean t() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Boolean valueOf = d2 == null ? null : Boolean.valueOf(d2.getI());
            return valueOf == null ? getA().getBoolean("geofences_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean u() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Boolean valueOf = d2 == null ? null : Boolean.valueOf(d2.getH());
            return valueOf == null ? getA().getBoolean("geofences_enabled_set", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean v() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            i5 d2 = getD();
            Boolean valueOf = d2 == null ? null : Boolean.valueOf(d2.getR());
            return valueOf == null ? getA().getBoolean("push_max_enabled", false) : valueOf.booleanValue();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void x() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, g.b, 2, (Object) null);
        if (this.c.isLocked()) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
            Mutex.DefaultImpls.unlock$default(this.c, null, 1, null);
        }
    }

    public final Pair<Long, Boolean> a() {
        if (Mutex.DefaultImpls.tryLock$default(this.c, null, 1, null)) {
            return new Pair<>(Long.valueOf(e()), Boolean.valueOf(o()));
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, c.b, 2, (Object) null);
        return null;
    }

    public final void b(i5 serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            a(serverConfig);
            Unit unit = Unit.INSTANCE;
            try {
                SharedPreferences.Editor edit = this.a.edit();
                if (serverConfig.b() != null) {
                    edit.putString("blacklisted_events", new JSONArray((Collection) serverConfig.b()).toString());
                }
                if (serverConfig.a() != null) {
                    edit.putString("blacklisted_attributes", new JSONArray((Collection) serverConfig.a()).toString());
                }
                if (serverConfig.c() != null) {
                    edit.putString("blacklisted_purchases", new JSONArray((Collection) serverConfig.c()).toString());
                }
                edit.putLong("config_time", serverConfig.getA()).putInt("geofences_min_time_since_last_request", serverConfig.getE()).putInt("geofences_min_time_since_last_report", serverConfig.getF()).putInt("geofences_max_num_to_register", serverConfig.getG()).putBoolean("geofences_enabled", serverConfig.getI()).putBoolean("geofences_enabled_set", serverConfig.getH()).putLong("messaging_session_timeout", serverConfig.getK()).putBoolean("ephemeral_events_enabled", serverConfig.getL()).putBoolean("feature_flags_enabled", serverConfig.getM()).putInt("feature_flags_refresh_rate_limit", serverConfig.getN()).putBoolean("content_cards_enabled", serverConfig.getJ()).putBoolean("content_cards_rate_limit_enabled", serverConfig.getO()).putInt("content_cards_rate_capacity", serverConfig.getQ()).putInt("content_cards_rate_refill_rate", serverConfig.getP()).putBoolean("push_max_enabled", serverConfig.getR());
                edit.apply();
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, i.b);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new j(serverConfig), 2, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    private final Set<String> a(String storageKey) {
        try {
            String string = this.a.getString(storageKey, "");
            HashSet hashSet = new HashSet();
            if (string != null && !StringsKt.isBlank(string)) {
                JSONArray jSONArray = new JSONArray(string);
                Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new d(jSONArray)), new e(jSONArray)).iterator();
                while (it.hasNext()) {
                    hashSet.add((String) it.next());
                }
            }
            return hashSet;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, f.b);
            return new HashSet();
        }
    }
}
