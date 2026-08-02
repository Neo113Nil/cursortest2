package bo.app;

import bo.app.x3;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b \u0010!J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\b\u001a\u00020\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tj\u0002`\u000bH\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lbo/app/j0;", "Lbo/app/s;", "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/d;", "apiResponse", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "Lbo/app/x3;", "outboundRespondWith", "Lbo/app/x3;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Lbo/app/x3;", "setOutboundRespondWith", "(Lbo/app/x3;)V", "", "c", "()Z", "containsNoNewData", "doesSendOptionalData", "Z", "g", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "urlBase", "<init>", "(Ljava/lang/String;Lbo/app/x3;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j0 extends s {
    public static final a u = new a(null);
    private x3 s;
    private final boolean t;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lbo/app/j0$a;", "", "", "BRAZE_NEWS_FEED_REQUEST_HEADER", "Ljava/lang/String;", "BRAZE_TRIGGERS_REQUEST_HEADER", "URL_EXTENSION", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
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
            return "DataSyncRequest executed successfully.";
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
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    public /* synthetic */ j0(String str, x3 x3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new x3.a(null, null, null, null, 15, null).a() : x3Var);
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, d apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: c */
    public boolean getS() {
        x3 s = getS();
        return s != null && s.getC() && super.getS();
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: d, reason: from getter */
    public x3 getS() {
        return this.s;
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: g, reason: from getter */
    public boolean getT() {
        return this.t;
    }

    @Override // bo.app.s, bo.app.a2
    public JSONObject l() {
        JSONObject l = super.l();
        if (l == null) {
            return null;
        }
        try {
            x3 s = getS();
            l.put("respond_with", s == null ? null : s.getJsonObject());
            return l;
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, c.b);
            return null;
        }
    }

    @Override // bo.app.s, bo.app.a2
    public void a(Map<String, String> existingHeaders) {
        boolean z;
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        x3 s = getS();
        boolean z2 = true;
        if (s != null && s.getC()) {
            return;
        }
        x3 s2 = getS();
        if (s2 != null && s2.x()) {
            existingHeaders.put("X-Braze-FeedRequest", "true");
            z = true;
        } else {
            z = false;
        }
        x3 s3 = getS();
        if (s3 != null && s3.y()) {
            existingHeaders.put("X-Braze-TriggersRequest", "true");
        } else {
            z2 = z;
        }
        if (z2) {
            existingHeaders.put("X-Braze-DataRequest", "true");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(String urlBase, x3 x3Var) {
        super(new a5(Intrinsics.stringPlus(urlBase, "data")), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.s = x3Var;
        this.t = true;
    }
}
