package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import com.braze.Constants;
import com.braze.enums.Gender;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import io.sentry.protocol.Device;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B9\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u0006\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\rJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0003H\u0007J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0005H\u0016J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007R\u0014\u0010'\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010&R.\u0010(\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010&¨\u00068"}, d2 = {"Lbo/app/w6;", "Lbo/app/a;", "Lbo/app/y3;", "Lorg/json/JSONObject;", "userObjectJson", "", "b", "", "key", "", "value", "c", "firstName", "", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "lastName", "g", "email", "Lcom/braze/enums/Gender;", HintConstants.AUTOFILL_HINT_GENDER, Constants.BRAZE_PUSH_CONTENT_KEY, Globalization.DATESTRING, "country", "homeCity", "e", Device.JsonKeys.LANGUAGE, "f", "Lcom/braze/enums/NotificationSubscriptionType;", "subscription", "pushNotificationSubscription", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "h", "Lcom/braze/models/outgoing/AttributionData;", "attributionData", "j", "outboundJson", "outboundObject", "isSuccessful", "()Lorg/json/JSONObject;", "customAttributesObjectFromCache", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "userObjectFromCache", "Landroid/content/Context;", "context", "Lbo/app/k2;", "pushRegistrationDataProvider", "Lbo/app/f5;", "sdkEnablementProvider", "apiKey", "<init>", "(Landroid/content/Context;Lbo/app/k2;Lbo/app/f5;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class w6 extends bo.app.a<y3> {
    public static final a g = new a(null);
    private final k2 b;
    private final f5 c;
    private final SharedPreferences d;
    private final SharedPreferences e;
    private String f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Lbo/app/w6$a;", "", "", "ATTRIBUTION_DATA_KEY", "Ljava/lang/String;", "BIRTHDAY_KEY", "COUNTRY_KEY", "CUSTOM_ATTRIBUTES_OBJECT_KEY", "EMAIL_KEY", "EMAIL_SUBSCRIPTION_KEY", "FIRST_NAME_KEY", "GENDER_KEY", "HOME_CITY_KEY", "LANGUAGE_KEY", "LAST_NAME_KEY", "PHONE_NUMBER_KEY", "PUSH_NOTIFICATION_SUBSCRIPTION_KEY", "PUSH_TOKEN_CACHE_FILE_PREFIX", "PUSH_TOKEN_KEY", "SERIALIZED_USER_OBJECT_JSON_KEY", "USER_CACHE_FILE_PREFIX_V3", "USER_ID_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
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
            return "No push token available to add to attributes object.";
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
            return "Couldn't add push token to outbound json";
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
            return "Could not create custom attributes json object from preferences";
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
            return "Failed to add merged custom attributes back to user object.";
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
            return "Push token cache cleared.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;)V"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function1<String, Unit> {
        g() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            w6.this.c("user_id", it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to load user object json from prefs with json string: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, JSONObject jSONObject) {
            super(0);
            this.b = str;
            this.c = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to write to user object json from prefs with key: [" + this.b + "] value: [" + this.c + "] ";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        public static final j b = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not writing to user cache.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not write to custom attributes json object with key: [" + this.b + "] value: [" + this.c + AbstractJsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to write to user object json from prefs with key: [" + this.b + "] value: [" + this.c + AbstractJsonLexerKt.END_LIST;
        }
    }

    public /* synthetic */ w6(Context context, k2 k2Var, f5 f5Var, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, k2Var, f5Var, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2);
    }

    private final JSONObject e() {
        JSONObject f2 = f();
        if (f2.has("custom")) {
            try {
                JSONObject jSONObject = f2.getJSONObject("custom");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "userObjectFromCache.getJ…OM_ATTRIBUTES_OBJECT_KEY)");
                return jSONObject;
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
            }
        }
        return new JSONObject();
    }

    public final synchronized boolean c(String email) {
        return c("email", email);
    }

    public final JSONObject f() {
        String string = this.d.getString("user_cache_attributes_object", null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new h(string));
            return new JSONObject();
        }
    }

    public final synchronized void g(String lastName) {
        c("last_name", lastName);
    }

    public final synchronized boolean h(String phoneNumber) {
        return c(HintConstants.AUTOFILL_HINT_PHONE, phoneNumber);
    }

    public final synchronized void i(String str) {
        this.f = str;
        c("user_id", str);
    }

    public final synchronized boolean j(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
    }

    public w6(Context context, k2 pushRegistrationDataProvider, f5 sdkEnablementProvider, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushRegistrationDataProvider, "pushRegistrationDataProvider");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        this.b = pushRegistrationDataProvider;
        this.c = sdkEnablementProvider;
        this.f = str;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.user_cache.v3", cacheFileSuffix), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.user_cache.push_token_store", cacheFileSuffix), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.e = sharedPreferences2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(String key, Object value) {
        Object obj;
        JSONObject f2 = f();
        if (value == null) {
            try {
                obj = JSONObject.NULL;
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new l(key, value));
                return false;
            }
        } else {
            obj = value;
        }
        f2.put(key, obj);
        return b(f2);
    }

    public final synchronized void a(Gender gender) {
        c(HintConstants.AUTOFILL_HINT_GENDER, gender == null ? null : gender.getKey());
    }

    public final synchronized boolean b(String dateString) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        return c("dob", dateString);
    }

    public final synchronized void d(String firstName) {
        c("first_name", firstName);
    }

    public final synchronized void g() {
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, f.b, 2, (Object) null);
                this.e.edit().clear().apply();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // bo.app.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public y3 d() {
        StringUtils.ifNonEmpty(this.f, new g());
        JSONObject f2 = f();
        a(f2);
        this.d.edit().clear().apply();
        return new y3(f2);
    }

    public final synchronized void a(String country) {
        c("country", country);
    }

    public final synchronized void b(NotificationSubscriptionType pushNotificationSubscription) {
        c("push_subscribe", pushNotificationSubscription == null ? null : pushNotificationSubscription.getKey());
    }

    public final synchronized void a(NotificationSubscriptionType subscription) {
        c("email_subscribe", subscription == null ? null : subscription.getKey());
    }

    public final synchronized void a(AttributionData attributionData) {
        a("ab_install_attribution", attributionData == null ? null : attributionData.getKey());
    }

    private final boolean b(JSONObject userObjectJson) {
        if (this.c.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, j.b, 2, (Object) null);
            return false;
        }
        this.d.edit().putString("user_cache_attributes_object", userObjectJson.toString()).apply();
        return true;
    }

    public final synchronized boolean a(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return b(key, value);
    }

    public final void a(JSONObject outboundJson) {
        String a2;
        Intrinsics.checkNotNullParameter(outboundJson, "outboundJson");
        try {
            a2 = this.b.a();
        } catch (JSONException e2) {
            e = e2;
        }
        try {
            if (a2 == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            } else {
                if (Intrinsics.areEqual(a2, this.e.getString("push_token", null))) {
                    return;
                }
                outboundJson.put("push_token", a2);
            }
        } catch (JSONException e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
        }
    }

    public final synchronized void f(String language) {
        c(Device.JsonKeys.LANGUAGE, language);
    }

    public final synchronized void e(String homeCity) {
        c("home_city", homeCity);
    }

    public final boolean b(String key, Object value) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject e2 = e();
        if (value == null) {
            try {
                obj = JSONObject.NULL;
            } catch (JSONException e3) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e3, new k(key, value));
                return false;
            }
        } else {
            obj = value;
        }
        e2.put(key, obj);
        return c("custom", e2);
    }

    @Override // bo.app.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(y3 outboundObject, boolean isSuccessful) {
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        JSONObject b2 = outboundObject.getB();
        if (isSuccessful) {
            if (b2.has("push_token")) {
                this.e.edit().putString("push_token", b2.optString("push_token")).apply();
                return;
            }
            return;
        }
        JSONObject f2 = f();
        JSONObject plus = JsonUtils.plus(b2, f2);
        plus.remove("push_token");
        JSONObject optJSONObject = f2.optJSONObject("custom");
        JSONObject optJSONObject2 = b2.optJSONObject("custom");
        try {
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
        }
        if (optJSONObject != null && optJSONObject2 != null) {
            plus.put("custom", JsonUtils.plus(optJSONObject2, optJSONObject));
        } else if (optJSONObject != null) {
            plus.put("custom", optJSONObject);
        } else {
            if (optJSONObject2 != null) {
                plus.put("custom", optJSONObject2);
            }
            this.d.edit().putString("user_cache_attributes_object", plus.toString()).apply();
        }
        this.d.edit().putString("user_cache_attributes_object", plus.toString()).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    public final boolean a(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject f2 = f();
        try {
            if (value == null) {
                f2.put(key, JSONObject.NULL);
            } else {
                JSONObject optJSONObject = f2.optJSONObject(key);
                if (optJSONObject != null) {
                    f2.put(key, JsonUtils.plus(optJSONObject, value));
                } else {
                    f2.put(key, value);
                }
            }
            key = b(f2);
            return key;
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new i(key, value));
            return false;
        }
    }
}
