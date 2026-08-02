package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB'\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b$\u0010%J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lbo/app/k4;", "Lbo/app/s;", "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/d;", "apiResponse", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/o2;", "responseError", "", "Lbo/app/i4;", "pushDeliveryEvents", "Ljava/util/List;", Constants.BRAZE_PUSH_TITLE_KEY, "()Ljava/util/List;", "", "containsNoNewData", "Z", "c", "()Z", "doesSendOptionalData", "g", "Lbo/app/w1;", "backoffStateProvider", "Lbo/app/w1;", "m", "()Lbo/app/w1;", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "", "urlBase", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class k4 extends s {
    public static final a w = new a(null);
    private final List<i4> s;
    private final boolean t;
    private final boolean u;
    private final w1 v;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lbo/app/k4$a;", "", "", "MAX_BACKOFF_TIME_MINUTES", "J", "NORMAL_SLEEP_DURATION_MINUTES", "", "URL_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
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
            return "PushDeliverySendRequest failed.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ k4 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j, k4 k4Var) {
            super(0);
            this.b = j;
            this.c = k4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Scheduling a retry of PushDeliverySendRequest after a delay of " + this.b + " ms. " + this.c;
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
            return "PushDeliverySendRequest executed successfully.";
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
            return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(String urlBase, String str, List<i4> pushDeliveryEvents) {
        super(new a5(Intrinsics.stringPlus(urlBase, "push/delivery_events")), str);
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(pushDeliveryEvents, "pushDeliveryEvents");
        this.s = pushDeliveryEvents;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.v = new f1((int) timeUnit.toMillis(10L), (int) timeUnit.toMillis(1L));
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, bo.app.d apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: c, reason: from getter */
    public boolean getT() {
        return this.t;
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: g, reason: from getter */
    public boolean getU() {
        return this.u;
    }

    @Override // bo.app.s, bo.app.a2
    public JSONObject l() {
        JSONObject l = super.l();
        if (l == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (i4 i4Var : this.s) {
                i4Var.a(getB());
                jSONArray.put(i4Var.getJsonObject());
            }
            String b2 = getB();
            if (b2 != null && !StringsKt.isBlank(b2)) {
                l.put("user_id", getB());
            }
            l.put("events", jSONArray);
            return l;
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, e.b);
            return null;
        }
    }

    @Override // bo.app.s, bo.app.m2
    /* renamed from: m, reason: from getter */
    public w1 getV() {
        return this.v;
    }

    public final List<i4> t() {
        return this.s;
    }

    @Override // bo.app.s, bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, o2 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
        if ((responseError instanceof p3) || (responseError instanceof d5)) {
            long a2 = getV().a();
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new c(a2, this), 2, (Object) null);
            internalPublisher.a((h2) new c5(a2), (Class<h2>) c5.class);
        }
    }
}
