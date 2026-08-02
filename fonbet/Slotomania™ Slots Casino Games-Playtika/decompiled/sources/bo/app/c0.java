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

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB3\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\b\u001a\u00020\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tj\u0002`\u000bH\u0016J\u0010\u0010\b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lbo/app/c0;", "Lbo/app/s;", "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/d;", "apiResponse", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "Lbo/app/o2;", "responseError", "", "", "retryCount", "I", Constants.BRAZE_PUSH_TITLE_KEY, "()I", "setRetryCount", "(I)V", "containsNoNewData", "Z", "c", "()Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "urlBase", "", "lastCardUpdatedAt", "lastFullSyncAt", "userId", "<init>", "(Ljava/lang/String;JJLjava/lang/String;I)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class c0 extends s {
    public static final a x = new a(null);
    private final long s;
    private final long t;
    private int u;
    private final boolean v;
    private int w;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Lbo/app/c0$a;", "", "", "BRAZE_CONTENT_CARDS_HEADER", "Ljava/lang/String;", "BRAZE_SYNC_RETRY_COUNT_KEY", "LAST_CARD_UPDATED_AT_KEY", "LAST_FULL_SYNC_AT_KEY", "", "MAX_RESPONSE_ERROR_RETRIES", "I", "getMAX_RESPONSE_ERROR_RETRIES$annotations", "()V", "RETRY_AFTER_HEADER_KEY", "URL_EXTENSION", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "ContentCardsSyncRequest scheduled for retry in " + this.b + " ms.";
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
            return "ContentCardsSyncRequest executed successfully.";
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
            return "Experienced JSONException while creating Content Cards request. Returning null.";
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
            return Intrinsics.stringPlus("Retrying Content Card refresh request. Retry count for this request attempt: ", Integer.valueOf(c0.this.w));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(String urlBase, long j, long j2, String str, int i) {
        super(new a5(Intrinsics.stringPlus(urlBase, "content_cards/sync")), str);
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.s = j;
        this.t = j2;
        this.u = i;
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: c, reason: from getter */
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
            l.put("last_full_sync_at", this.t);
            l.put("last_card_updated_at", this.s);
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

    /* renamed from: t, reason: from getter */
    public final int getU() {
        return this.u;
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, bo.app.d apiResponse) {
        Map<String, String> f;
        String str;
        Long a2;
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        if (apiResponse == null || (f = apiResponse.f()) == null || (str = f.get("retry-after")) == null || (a2 = v1.a(str)) == null) {
            internalPublisher.a((h2) new x(), (Class<h2>) x.class);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
        } else {
            long longValue = a2.longValue();
            internalPublisher.a((h2) new y(longValue, getU() + 1), (Class<h2>) y.class);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(longValue), 3, (Object) null);
        }
    }

    @Override // bo.app.s, bo.app.a2
    public void a(Map<String, String> existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-ContentCardsRequest", "true");
        existingHeaders.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.u));
    }

    @Override // bo.app.s, bo.app.m2
    public boolean a(o2 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        if (!(responseError instanceof p3) && !(responseError instanceof d5)) {
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(), 3, (Object) null);
        int i = this.w + 1;
        this.w = i;
        return i < 3;
    }
}
