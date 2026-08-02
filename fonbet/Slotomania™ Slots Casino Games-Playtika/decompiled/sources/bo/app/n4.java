package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.facebook.appevents.internal.AppLinkManager;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB/\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lbo/app/n4;", "Lbo/app/s;", "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/d;", "apiResponse", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/o2;", "responseError", "", "containsNoNewData", "Z", "c", "()Z", "doesSendOptionalData", "g", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "", "urlBase", "userId", "", "campaignIds", "", "lastSyncTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class n4 extends s {
    public static final a w = new a(null);
    private final List<String> s;
    private final long t;
    private final boolean u;
    private final boolean v;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\u000b"}, d2 = {"Lbo/app/n4$a;", "", "", "CAMPAIGN_IDS_KEY", "Ljava/lang/String;", "getCAMPAIGN_IDS_KEY$android_sdk_base_release$annotations", "()V", "LAST_SYNC_AT_KEY", "getLAST_SYNC_AT_KEY$android_sdk_base_release$annotations", "URL_EXTENSION", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
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
            return "PushMaxSendRequest failed.";
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
            return "PushMaxSendRequest executed successfully.";
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
            return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
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
            return "Retrying PushMaxSendRequest " + n4.this + '.';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(String urlBase, String str, List<String> campaignIds, long j) {
        super(new a5(Intrinsics.stringPlus(urlBase, "push/redeliver")), str);
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(campaignIds, "campaignIds");
        this.s = campaignIds;
        this.t = j;
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, bo.app.d apiResponse) {
        JSONObject a2;
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
        if (apiResponse == null || (a2 = apiResponse.getA()) == null) {
            return;
        }
        internalPublisher.a((h2) new m4(a2.getLong("last_sync_at")), (Class<h2>) m4.class);
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: c, reason: from getter */
    public boolean getU() {
        return this.u;
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: g, reason: from getter */
    public boolean getV() {
        return this.v;
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
            l.put(AppLinkManager.CAMPAIGN_IDS_KEY, new JSONArray((Collection) this.s));
            l.put("last_sync_at", this.t);
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
}
