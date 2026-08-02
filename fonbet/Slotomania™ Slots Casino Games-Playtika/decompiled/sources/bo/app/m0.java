package bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.content.pm.PackageInfoCompat;
import bo.app.k0;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import io.sentry.protocol.Device;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0007R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0013\u0010#\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006."}, d2 = {"Lbo/app/m0;", "Lbo/app/d2;", "Landroid/content/pm/PackageInfo;", "n", "", "j", "k", "Ljava/util/Locale;", "l", "Ljava/util/TimeZone;", "m", "", "i", "h", "googleAdvertisingId", "", Constants.BRAZE_PUSH_CONTENT_KEY, "googleAdvertisingLimitAdTrackingEnabled", "f", "hostAppVersion", "Ljava/lang/String;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Ljava/lang/String;", "hostAppSemanticVersionCode", "Lbo/app/k0;", "b", "()Lbo/app/k0;", "device", "c", "dirtyDevice", "getDeviceId", "deviceId", "e", "g", "()Ljava/lang/Boolean;", "isAdTrackingEnabled", "Landroid/content/Context;", "context", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lbo/app/e2;", "deviceIdProvider", "Lbo/app/l0;", "deviceCache", "<init>", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/e2;Lbo/app/l0;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class m0 implements d2 {
    public static final a h = new a(null);
    private Context a;
    private final BrazeConfigurationProvider b;
    private final e2 c;
    private final l0 d;
    private final String e;
    public final SharedPreferences f;
    private PackageInfo g;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to read notifications enabled state from NotificationManagerCompat.";
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
            return "App version code could not be read. Returning null";
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
            return "Failed to collect background restriction information from Activity Manager";
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
            return "Caught exception while reading the phone carrier name.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to inspect package [" + ((Object) this.b) + AbstractJsonLexerKt.END_LIST;
        }
    }

    public m0(Context context, BrazeConfigurationProvider configurationProvider, e2 deviceIdProvider, l0 deviceCache) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        this.a = context;
        this.b = configurationProvider;
        this.c = deviceIdProvider;
        this.d = deviceCache;
        PackageInfo n = n();
        this.e = n == null ? null : n.versionName;
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.appboy.managers.device_data_provider", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f = sharedPreferences;
    }

    private final boolean h() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.a.getSystemService("activity");
            if (systemService != null) {
                return ((ActivityManager) systemService).isBackgroundRestricted();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
            return false;
        }
    }

    private final boolean i() {
        return this.a.getResources().getConfiguration().orientation == 2;
    }

    private final String j() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    private final String k() {
        try {
            Object systemService = this.a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName == null) {
                return null;
            }
            return StringsKt.trim((CharSequence) networkOperatorName).toString();
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
            return null;
        }
    }

    private final Locale l() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return locale;
    }

    private final TimeZone m() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        return timeZone;
    }

    private final PackageInfo n() {
        PackageInfo packageInfo = this.g;
        if (packageInfo != null) {
            return packageInfo;
        }
        String packageName = this.a.getPackageName();
        try {
            PackageInfo packageInfo2 = Build.VERSION.SDK_INT >= 33 ? this.a.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : this.a.getPackageManager().getPackageInfo(packageName, 0);
            this.g = packageInfo2;
            return packageInfo2;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new f(packageName));
            ApplicationInfo applicationInfo = this.a.getApplicationInfo();
            PackageInfo packageArchiveInfo = Build.VERSION.SDK_INT >= 33 ? this.a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, PackageManager.PackageInfoFlags.of(0L)) : this.a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            this.g = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    @Override // bo.app.d2
    public String a() {
        PackageInfo n = n();
        if (n != null) {
            return (Build.VERSION.SDK_INT >= 28 ? n.getLongVersionCode() : PackageInfoCompat.getLongVersionCode(n)) + ".0.0.0";
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
        return null;
    }

    @Override // bo.app.d2
    public k0 b() {
        k0.a e2 = new k0.a(this.b).a(j()).b(k()).e(Build.MODEL);
        a aVar = h;
        return e2.d(aVar.a(l())).g(m().getID()).f(aVar.a(this.a, i())).c(Boolean.valueOf(f())).b(Boolean.valueOf(h())).c(e()).a(g()).a();
    }

    @Override // bo.app.d2
    public k0 c() {
        this.d.a(b());
        return this.d.a();
    }

    @Override // bo.app.d2
    /* renamed from: d, reason: from getter */
    public String getE() {
        return this.e;
    }

    public final String e() {
        return this.f.getString("google_ad_id", null);
    }

    public final Boolean g() {
        if (this.f.contains("ad_tracking_enabled")) {
            return Boolean.valueOf(this.f.getBoolean("ad_tracking_enabled", true));
        }
        return null;
    }

    @Override // bo.app.d2
    public String getDeviceId() {
        return this.c.getDeviceId();
    }

    public final boolean f() {
        Object systemService = this.a.getSystemService("notification");
        if (systemService != null) {
            return ((NotificationManager) systemService).areNotificationsEnabled();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lbo/app/m0$a;", "", "Landroid/content/Context;", "context", "", "isRotated", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Ljava/util/Locale;", Device.JsonKeys.LOCALE, "STORAGE_AD_TRACKING_ENABLED", "Ljava/lang/String;", "STORAGE_FILENAME", "STORAGE_GOOGLE_ADVERTISING_ID_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.m0$a$a, reason: collision with other inner class name */
        static final class C0083a extends Lambda implements Function0<String> {
            public static final C0083a b = new C0083a();

            C0083a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to obtain device resolution";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String a(Context context, boolean isRotated) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Pair<Integer, Integer> displayHeightAndWidthPixels = BrazeImageUtils.getDisplayHeightAndWidthPixels(context);
                int intValue = displayHeightAndWidthPixels.component1().intValue();
                int intValue2 = displayHeightAndWidthPixels.component2().intValue();
                return isRotated ? new StringBuilder().append(intValue).append('x').append(intValue2).toString() : new StringBuilder().append(intValue2).append('x').append(intValue).toString();
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, C0083a.b);
                return null;
            }
        }

        @JvmStatic
        public final String a(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            String locale2 = locale.toString();
            Intrinsics.checkNotNullExpressionValue(locale2, "locale.toString()");
            return locale2;
        }
    }

    @Override // bo.app.d2
    public void a(String googleAdvertisingId) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        this.f.edit().putString("google_ad_id", googleAdvertisingId).apply();
    }

    @Override // bo.app.d2
    public void a(boolean googleAdvertisingLimitAdTrackingEnabled) {
        this.f.edit().putBoolean("ad_tracking_enabled", !googleAdvertisingLimitAdTrackingEnabled).apply();
    }
}
