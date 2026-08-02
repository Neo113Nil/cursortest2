package bo.app;

import com.braze.Constants;
import com.braze.models.BrazeGeofence;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001%B=\u0012$\u00103\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\t02\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010+\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u0006:"}, d2 = {"Lbo/app/d;", "", "Lorg/json/JSONObject;", "jsonObject", "Lorg/json/JSONObject;", "g", "()Lorg/json/JSONObject;", "", "", "Lcom/braze/communication/HttpHeaders;", "httpHeaders", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "Lbo/app/a0;", "contentCardsResponse", "Lbo/app/a0;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/a0;", "Lcom/braze/models/inappmessage/IInAppMessage;", "templatedInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "i", "()Lcom/braze/models/inappmessage/IInAppMessage;", "", "Lbo/app/y2;", "triggeredActions", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lbo/app/i5;", "serverConfig", "Lbo/app/i5;", "h", "()Lbo/app/i5;", "Lcom/braze/models/BrazeGeofence;", "geofences", "e", "Lorg/json/JSONArray;", "featureFlagsData", "Lorg/json/JSONArray;", "c", "()Lorg/json/JSONArray;", "feedJson", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lbo/app/o2;", "error", "Lbo/app/o2;", "b", "()Lbo/app/o2;", "Lkotlin/Pair;", "responseData", "Lbo/app/a2;", "request", "Lbo/app/z1;", "brazeManager", "<init>", "(Lkotlin/Pair;Lbo/app/a2;Lbo/app/z1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class d {
    public static final e k = new e(null);
    private final JSONObject a;
    private final Map<String, String> b;
    private final a0 c;
    private final IInAppMessage d;
    private final List<y2> e;
    private final i5 f;
    private final List<BrazeGeofence> g;
    private final JSONArray h;
    private final JSONArray i;
    private final o2 j;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Encountered Exception processing Content Cards response: ", d.this.getA());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Found " + d.this.j().size() + " triggered actions in server response.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Got server config: ", JsonUtils.getPrettyPrintedString(this.b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: bo.app.d$d, reason: collision with other inner class name */
    static final class C0073d extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0073d(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Encountered Exception processing server config: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\n¨\u0006\u0017"}, d2 = {"Lbo/app/d$e;", "", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/a2;", "request", "Lbo/app/o2;", Constants.BRAZE_PUSH_CONTENT_KEY, "", "CONFIG_KEY", "Ljava/lang/String;", "ERROR_KEY", "FEATURE_FLAGS", "FEED_KEY", "GEOFENCES", "INVALID_API_KEY_ERROR_MESSAGE", "SDK_AUTH_ERROR_CODE_KEY", "SDK_AUTH_ERROR_KEY", "SDK_AUTH_ERROR_REASON_KEY", "TEMPLATED_MESSAGE_KEY", "TRIGGERS_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o2 a(JSONObject jsonObject, a2 request) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Intrinsics.checkNotNullParameter(request, "request");
            String optionalString = JsonUtils.getOptionalString(jsonObject, "error");
            JSONObject optJSONObject = jsonObject.optJSONObject("auth_error");
            if (optJSONObject != null) {
                return new d5(request, optJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(optJSONObject, "reason"), optionalString);
            }
            if (Intrinsics.areEqual(optionalString, "invalid_api_key")) {
                return new h3(optionalString, request);
            }
            if (optionalString != null) {
                return new g(optionalString, request);
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Pair<? extends JSONObject, ? extends Map<String, String>> responseData, a2 request, z1 brazeManager) {
        a0 a0Var;
        List<y2> a2;
        JSONObject optJSONObject;
        i5 i5Var;
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        JSONObject first = responseData.getFirst();
        this.a = first;
        this.b = responseData.getSecond();
        this.i = first.optJSONArray("feed");
        o2 a3 = k.a(first, request);
        this.j = a3;
        if (a3 == null && (request instanceof c0)) {
            try {
                a0Var = new a0(first);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new a());
            }
            this.c = a0Var;
            a2 = p6.a.a(this.a.optJSONArray("triggers"), brazeManager);
            this.e = a2;
            if (a2 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(), 2, (Object) null);
            }
            optJSONObject = this.a.optJSONObject("config");
            if (optJSONObject == null) {
                try {
                    i5Var = new i5(optJSONObject);
                } catch (Exception e3) {
                    e = e3;
                    i5Var = null;
                }
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(optJSONObject), 2, (Object) null);
                } catch (Exception e4) {
                    e = e4;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new C0073d(optJSONObject));
                    this.f = i5Var;
                    this.d = p6.a.a(this.a.optJSONObject("templated_message"), brazeManager);
                    JSONArray optJSONArray = this.a.optJSONArray("geofences");
                    this.g = optJSONArray != null ? o1.a(optJSONArray) : null;
                    this.h = this.a.optJSONArray("feature_flags");
                }
            } else {
                i5Var = null;
            }
            this.f = i5Var;
            this.d = p6.a.a(this.a.optJSONObject("templated_message"), brazeManager);
            JSONArray optJSONArray2 = this.a.optJSONArray("geofences");
            this.g = optJSONArray2 != null ? o1.a(optJSONArray2) : null;
            this.h = this.a.optJSONArray("feature_flags");
        }
        a0Var = null;
        this.c = a0Var;
        a2 = p6.a.a(this.a.optJSONArray("triggers"), brazeManager);
        this.e = a2;
        if (a2 != null) {
        }
        optJSONObject = this.a.optJSONObject("config");
        if (optJSONObject == null) {
        }
        this.f = i5Var;
        this.d = p6.a.a(this.a.optJSONObject("templated_message"), brazeManager);
        JSONArray optJSONArray22 = this.a.optJSONArray("geofences");
        this.g = optJSONArray22 != null ? o1.a(optJSONArray22) : null;
        this.h = this.a.optJSONArray("feature_flags");
    }

    /* renamed from: a, reason: from getter */
    public final a0 getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final o2 getJ() {
        return this.j;
    }

    /* renamed from: c, reason: from getter */
    public final JSONArray getH() {
        return this.h;
    }

    /* renamed from: d, reason: from getter */
    public final JSONArray getI() {
        return this.i;
    }

    public final List<BrazeGeofence> e() {
        return this.g;
    }

    public final Map<String, String> f() {
        return this.b;
    }

    /* renamed from: g, reason: from getter */
    public final JSONObject getA() {
        return this.a;
    }

    /* renamed from: h, reason: from getter */
    public final i5 getF() {
        return this.f;
    }

    /* renamed from: i, reason: from getter */
    public final IInAppMessage getD() {
        return this.d;
    }

    public final List<y2> j() {
        return this.e;
    }
}
