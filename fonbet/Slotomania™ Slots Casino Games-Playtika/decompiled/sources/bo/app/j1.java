package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\"\u0010\b\u001a\u00020\u00072\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\fj\u0002`\u000eH\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lbo/app/j1;", "Lbo/app/s;", "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/d;", "apiResponse", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/o2;", "responseError", "", "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "containsNoNewData", "Z", "c", "()Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "urlBase", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j1 extends s {
    public static final a t = new a(null);
    private final boolean s;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lbo/app/j1$a;", "", "", "BRAZE_FEATURE_FLAGS_HEADER", "Ljava/lang/String;", "URL_EXTENSION", "getURL_EXTENSION$android_sdk_base_release$annotations", "()V", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
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
            return "FeatureFlagsSyncRequest failed.";
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
            return "FeatureFlagsSyncRequest executed successfully.";
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
            return "Experienced JSONException while creating Feature Flags request. Returning null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retrying FeatureFlagsSyncRequest " + j1.this + '.';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(String urlBase, String str) {
        super(new a5(Intrinsics.stringPlus(urlBase, "feature_flags/sync")), str);
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, bo.app.d apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
        internalPublisher.a((h2) new i1(this), (Class<h2>) i1.class);
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: c, reason: from getter */
    public boolean getS() {
        return this.s;
    }

    @Override // bo.app.s, bo.app.a2
    public JSONObject l() {
        JSONObject l = super.l();
        if (l == null) {
            return null;
        }
        try {
            String b2 = getB();
            if (b2 != null && !StringsKt.isBlank(b2)) {
                l.put("user_id", getB());
            }
            return l;
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, d.b);
            return null;
        }
    }

    @Override // bo.app.s, bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, o2 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
    }

    @Override // bo.app.s, bo.app.m2
    public boolean a(o2 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        if (!(responseError instanceof p3) && !(responseError instanceof d5)) {
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new e(), 2, (Object) null);
        return true;
    }

    @Override // bo.app.s, bo.app.a2
    public void a(Map<String, String> existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
