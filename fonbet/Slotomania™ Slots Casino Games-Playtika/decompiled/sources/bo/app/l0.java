package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0012"}, d2 = {"Lbo/app/l0;", "Lbo/app/a;", "Lbo/app/k0;", "newDevice", "", Constants.BRAZE_PUSH_CONTENT_KEY, "e", "f", "outboundObject", "", "isSuccessful", "Landroid/content/Context;", "context", "", "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class l0 extends bo.app.a<k0> {
    public static final a f = new a(null);
    private final BrazeConfigurationProvider b;
    private final SharedPreferences c;
    private final SharedPreferences d;
    private k0 e;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0006H\u0002J/\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0005\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Lbo/app/l0$a;", "", "Lorg/json/JSONObject;", "oldJson", "newJson", Constants.BRAZE_PUSH_CONTENT_KEY, "Landroid/content/SharedPreferences;", "cachedDeviceJson", "liveDeviceJson", "", "cachedCompileSdkVersion", "deviceOsVersion", "", "(Lorg/json/JSONObject;Lorg/json/JSONObject;II)Z", "", "CACHED_DEVICE_KEY", "Ljava/lang/String;", "getCACHED_DEVICE_KEY$annotations", "()V", "DEVICE_CACHE_PREFIX", "LAST_DEVICE_OS_VERSION", "METADATA_CACHE_PREFIX", "SEND_FULL_ON_NEXT_EXPORT_KEY", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.l0$a$a, reason: collision with other inner class name */
        static final class C0081a extends Lambda implements Function0<String> {
            public static final C0081a b = new C0081a();

            C0081a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught json exception while creating the diff. Returning null";
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
                return "shouldReportPushPermissionsAsGranted: Returning true given that push is permissible now and notifications enabled transitioned to true.";
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
                return "shouldReportPushPermissionsAsGranted: Returning true since notifications enabled is true and device has upgraded to Tiramisu or beyond.";
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
                return "Returning false for shouldReportPushPermissionsAsGranted.";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject a(JSONObject oldJson, JSONObject newJson) {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = newJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = newJson.opt(next);
                Object opt2 = oldJson.opt(next);
                if (opt != null) {
                    try {
                        if (opt instanceof JSONObject) {
                            if (opt2 == null || !JsonUtils.areJsonObjectsEqual((JSONObject) opt, (JSONObject) opt2)) {
                                jSONObject.put(next, opt);
                            }
                        } else if (!Intrinsics.areEqual(opt, opt2)) {
                            jSONObject.put(next, opt);
                        }
                    } catch (JSONException e) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, C0081a.b);
                        return null;
                    }
                }
            }
            return jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject a(SharedPreferences sharedPreferences) {
            String str = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
            String string = sharedPreferences.getString("cached_device", com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON);
            if (string != null) {
                str = string;
            }
            return new JSONObject(str);
        }

        public final boolean a(JSONObject cachedDeviceJson, JSONObject liveDeviceJson, int cachedCompileSdkVersion, int deviceOsVersion) {
            Intrinsics.checkNotNullParameter(cachedDeviceJson, "cachedDeviceJson");
            Intrinsics.checkNotNullParameter(liveDeviceJson, "liveDeviceJson");
            boolean z = deviceOsVersion >= 33;
            boolean z2 = cachedCompileSdkVersion < 33 && z;
            DeviceKey deviceKey = DeviceKey.NOTIFICATIONS_ENABLED;
            boolean optBoolean = liveDeviceJson.optBoolean(deviceKey.getKey(), false);
            boolean z3 = optBoolean && !cachedDeviceJson.optBoolean(deviceKey.getKey(), false);
            if (z && z3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
                return true;
            }
            if (optBoolean && z2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, d.b, 2, (Object) null);
            return false;
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
            return "Caught exception confirming and unlocking device cache.";
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
            return "Sending full device on next export but keeping cache intact.";
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
            return "Caught exception confirming and unlocking JSON objects.";
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
            return "Failed to generate diff between the cached and live device. Returning the live device.";
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
            return "Remote Notification Enabled changed to true. Updating user subscription.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z, boolean z2) {
            super(0);
            this.b = z;
            this.c = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exporting the full device due to either: shouldShouldFullDeviceOnNextExport: " + this.b + ", shouldReportPushPermissionsAsGranted: " + this.c;
        }
    }

    public /* synthetic */ l0(Context context, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final void a(k0 newDevice) {
        this.e = newDevice;
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, c.b, 2, (Object) null);
        this.d.edit().putBoolean("sfone", true).apply();
    }

    @Override // bo.app.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k0 d() {
        JSONObject a2;
        JSONObject jSONObject = new JSONObject();
        k0 k0Var = this.e;
        JSONObject c2 = k0Var == null ? null : k0Var.getC();
        if (c2 == null) {
            c2 = new JSONObject();
        }
        JSONObject jSONObject2 = c2;
        try {
            jSONObject = f.a(this.c);
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
        }
        a aVar = f;
        SharedPreferences sharedPreferences = this.d;
        int i = Build.VERSION.SDK_INT;
        boolean a3 = aVar.a(jSONObject, jSONObject2, sharedPreferences.getInt("ldov", i), i);
        boolean z = this.d.getBoolean("sfone", false);
        if (z || a3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(z, a3), 3, (Object) null);
            a2 = aVar.a(new JSONObject(), jSONObject2);
        } else {
            a2 = aVar.a(jSONObject, jSONObject2);
        }
        if (a2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.b, 3, (Object) null);
            return this.e;
        }
        k0 a4 = k0.n.a(this.b, a2);
        if (a3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, f.b, 2, (Object) null);
            a4.a(true);
        }
        return a4;
    }

    public l0(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = new BrazeConfigurationProvider(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.device_cache.v3", StringUtils.getCacheFileSuffix(context, str, str2)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.c = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.device_cache.metadata", StringUtils.getCacheFileSuffix(context, str, str2)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.d = sharedPreferences2;
    }

    @Override // bo.app.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(k0 outboundObject, boolean isSuccessful) {
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        if (isSuccessful) {
            try {
                this.c.edit().putString("cached_device", JsonUtils.mergeJsonObjects(f.a(this.c), outboundObject.getC()).toString()).apply();
                this.d.edit().putBoolean("sfone", false).putInt("ldov", Build.VERSION.SDK_INT).apply();
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, b.b);
            }
        }
    }
}
