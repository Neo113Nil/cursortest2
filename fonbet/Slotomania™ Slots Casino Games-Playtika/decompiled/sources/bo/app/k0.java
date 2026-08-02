package bo.app;

import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.ironsource.M6;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0002\r\u001eBs\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lbo/app/k0;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lbo/app/g2;", "w", "", "v", "e", "()Z", "isEmpty", "shouldReportPushPermissionsAsGranted", "Z", "x", Constants.BRAZE_PUSH_CONTENT_KEY, "(Z)V", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "androidVersion", M6.R0, "model", "localeAndLanguage", "timeZone", "resolution", "isNotificationsEnabled", "isBackgroundRestricted", "googleAdvertisingId", "isAdTrackingEnabled", "<init>", "(Lcom/braze/configuration/BrazeConfigurationProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "b", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class k0 implements IPutIntoJson<JSONObject>, g2 {
    public static final b n = new b(null);
    private final BrazeConfigurationProvider b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Boolean i;
    private final Boolean j;
    private final String k;
    private final Boolean l;
    private boolean m;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0012J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0004\u0010\u0012J\u0006\u0010\u0004\u001a\u00020\u0016¨\u0006\u001b"}, d2 = {"Lbo/app/k0$a;", "", "", "androidVersion", Constants.BRAZE_PUSH_CONTENT_KEY, M6.R0, "b", "model", "e", "localeLanguageAndCountry", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "timeZoneId", "g", "resolution", "f", "", "notificationsEnabled", "c", "(Ljava/lang/Boolean;)Lbo/app/k0$a;", "isBackgroundRestricted", "googleAdvertisingId", "isAdTrackingEnabled", "Lbo/app/k0;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "<init>", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private final BrazeConfigurationProvider a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private Boolean h;
        private Boolean i;
        private String j;
        private Boolean k;

        public a(BrazeConfigurationProvider configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            this.a = configurationProvider;
        }

        public final a a(String androidVersion) {
            this.b = androidVersion;
            return this;
        }

        public final a b(String carrier) {
            this.c = carrier;
            return this;
        }

        public final a c(Boolean notificationsEnabled) {
            this.h = notificationsEnabled;
            return this;
        }

        public final a d(String localeLanguageAndCountry) {
            this.e = localeLanguageAndCountry;
            return this;
        }

        public final a e(String model) {
            this.d = model;
            return this;
        }

        public final a f(String resolution) {
            this.g = resolution;
            return this;
        }

        public final a g(String timeZoneId) {
            this.f = timeZoneId;
            return this;
        }

        public final a a(Boolean isAdTrackingEnabled) {
            this.k = isAdTrackingEnabled;
            return this;
        }

        public final a b(Boolean isBackgroundRestricted) {
            this.i = isBackgroundRestricted;
            return this;
        }

        public final a c(String googleAdvertisingId) {
            this.j = googleAdvertisingId;
            return this;
        }

        public final k0 a() {
            return new k0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
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
            return "Caught exception creating device Json.";
        }
    }

    public k0(BrazeConfigurationProvider configurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.b = configurationProvider;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = bool;
        this.j = bool2;
        this.k = str7;
        this.l = bool3;
    }

    public final void a(boolean z) {
        this.m = z;
    }

    @Override // bo.app.g2
    /* renamed from: e */
    public boolean getC() {
        return getC().length() == 0;
    }

    public final boolean v() {
        return getC().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey());
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            b bVar = n;
            bVar.a(this.b, jSONObject, DeviceKey.ANDROID_VERSION, this.c);
            bVar.a(this.b, jSONObject, DeviceKey.CARRIER, this.d);
            bVar.a(this.b, jSONObject, DeviceKey.MODEL, this.e);
            bVar.a(this.b, jSONObject, DeviceKey.RESOLUTION, this.h);
            bVar.a(this.b, jSONObject, DeviceKey.LOCALE, this.f);
            bVar.a(this.b, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.i);
            bVar.a(this.b, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.j);
            String str = this.k;
            if (str != null && !StringsKt.isBlank(str)) {
                bVar.a(this.b, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.k);
            }
            Boolean bool = this.l;
            if (bool != null) {
                bVar.a(this.b, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str2 = this.g;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                bVar.a(this.b, jSONObject, DeviceKey.TIMEZONE, this.g);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
            return jSONObject;
        }
    }

    /* renamed from: x, reason: from getter */
    public final boolean getM() {
        return this.m;
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J*\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u000f"}, d2 = {"Lbo/app/k0$b;", "", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/k0;", Constants.BRAZE_PUSH_CONTENT_KEY, "deviceExport", "Lcom/braze/enums/DeviceKey;", "exportKey", "value", "", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[DeviceKey.values().length];
                iArr[DeviceKey.TIMEZONE.ordinal()] = 1;
                iArr[DeviceKey.CARRIER.ordinal()] = 2;
                iArr[DeviceKey.ANDROID_VERSION.ordinal()] = 3;
                iArr[DeviceKey.RESOLUTION.ordinal()] = 4;
                iArr[DeviceKey.LOCALE.ordinal()] = 5;
                iArr[DeviceKey.MODEL.ordinal()] = 6;
                iArr[DeviceKey.NOTIFICATIONS_ENABLED.ordinal()] = 7;
                iArr[DeviceKey.IS_BACKGROUND_RESTRICTED.ordinal()] = 8;
                iArr[DeviceKey.GOOGLE_ADVERTISING_ID.ordinal()] = 9;
                iArr[DeviceKey.AD_TRACKING_ENABLED.ordinal()] = 10;
                a = iArr;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.k0$b$b, reason: collision with other inner class name */
        static final class C0080b extends Lambda implements Function0<String> {
            final /* synthetic */ DeviceKey b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0080b(DeviceKey deviceKey) {
                super(0);
                this.b = deviceKey;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Not adding device key <" + this.b + "> to export due to allowlist restrictions.";
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final k0 a(BrazeConfigurationProvider configurationProvider, JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            a aVar = new a(configurationProvider);
            DeviceKey[] values = DeviceKey.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                DeviceKey deviceKey = values[i];
                i++;
                String key = deviceKey.getKey();
                switch (a.a[deviceKey.ordinal()]) {
                    case 1:
                        aVar.g(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 2:
                        aVar.b(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 3:
                        aVar.a(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 4:
                        aVar.f(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 5:
                        aVar.d(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 6:
                        aVar.e(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 7:
                        if (!jsonObject.has(key)) {
                            break;
                        } else {
                            aVar.c(Boolean.valueOf(jsonObject.optBoolean(key, true)));
                            break;
                        }
                    case 8:
                        if (!jsonObject.has(key)) {
                            break;
                        } else {
                            aVar.b(Boolean.valueOf(jsonObject.optBoolean(key, false)));
                            break;
                        }
                    case 9:
                        aVar.c(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 10:
                        if (!jsonObject.has(key)) {
                            break;
                        } else {
                            aVar.a(Boolean.valueOf(jsonObject.optBoolean(key)));
                            break;
                        }
                }
            }
            return aVar.a();
        }

        public final void a(BrazeConfigurationProvider configurationProvider, JSONObject deviceExport, DeviceKey exportKey, Object value) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            Intrinsics.checkNotNullParameter(deviceExport, "deviceExport");
            Intrinsics.checkNotNullParameter(exportKey, "exportKey");
            if (configurationProvider.isDeviceObjectAllowlistEnabled() && !configurationProvider.getDeviceObjectAllowlist().contains(exportKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0080b(exportKey), 2, (Object) null);
            } else {
                deviceExport.putOpt(exportKey.getKey(), value);
            }
        }
    }
}
