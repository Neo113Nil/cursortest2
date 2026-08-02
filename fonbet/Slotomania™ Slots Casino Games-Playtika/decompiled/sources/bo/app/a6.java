package bo.app;

import bo.app.x3;
import com.braze.Constants;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B1\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u00107\u001a\u000206\u0012\b\u00108\u001a\u0004\u0018\u000102¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J \u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0007R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006;"}, d2 = {"Lbo/app/a6;", "Lbo/app/s;", "Lbo/app/p2;", "scheduleConfig", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/d;", "apiResponse", "", "Lbo/app/o2;", "responseError", "", "x", "Lbo/app/t2;", "triggerEvent", "Lbo/app/t2;", "v", "()Lbo/app/t2;", "templatePayloadExpirationTimestamp", "J", "u", "()J", "Lbo/app/y2;", "triggeredAction", "Lbo/app/y2;", "w", "()Lbo/app/y2;", "Lbo/app/x3;", "outboundRespondWith", "Lbo/app/x3;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Lbo/app/x3;", "setOutboundRespondWith", "(Lbo/app/x3;)V", "Lbo/app/f1;", "backoffStateProvider", "Lbo/app/f1;", Constants.BRAZE_PUSH_TITLE_KEY, "()Lbo/app/f1;", "containsNoNewData", "Z", "c", "()Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "", "urlBase", "Lbo/app/b6;", "templatedTriggeredAction", "Lbo/app/z1;", "brazeManager", "userId", "<init>", "(Ljava/lang/String;Lbo/app/b6;Lbo/app/t2;Lbo/app/z1;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a6 extends s {
    public static final a D = new a(null);
    private x3 A;
    private final f1 B;
    private final boolean C;
    private final b6 s;
    private final t2 t;
    private final z1 u;
    private final String v;
    private final long w;
    private final long x;
    private final long y;
    private final y2 z;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lbo/app/a6$a;", "", "", "EVENT_DATA_KEY", "Ljava/lang/String;", "", "EXTRA_DELAY_IN_SECONDS", "I", "TEMPLATE_OBJECT_KEY", "TRIGGER_EVENT_TYPE", "TRIGGER_ID_KEY", "URL_EXTENSION", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
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
            return "Template request failed. Attempting to log in-app message template request failure.";
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
            return "Trigger ID not found. Not logging in-app message template request failure.";
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
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Template request has not yet expired. It expires at time: " + this.b + ". Proceeding with retry.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ a6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j, a6 a6Var) {
            super(0);
            this.b = j;
            this.c = a6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Template request expired at time: " + this.b + " and is not eligible for a response retry. Not retrying or performing any fallback triggers. " + this.c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(String urlBase, b6 templatedTriggeredAction, t2 triggerEvent, z1 brazeManager, String str) {
        super(new a5(Intrinsics.stringPlus(urlBase, "template")), str);
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(templatedTriggeredAction, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.s = templatedTriggeredAction;
        this.t = triggerEvent;
        this.u = brazeManager;
        this.v = templatedTriggeredAction.getJ();
        long a2 = a(templatedTriggeredAction.getC());
        this.w = a2;
        long min = Math.min(a2, TimeUnit.MINUTES.toMillis(1L));
        this.x = min;
        this.y = templatedTriggeredAction.getL();
        this.z = templatedTriggeredAction;
        this.A = new x3.a(null, null, null, null, 15, null).b(str).a();
        this.B = new f1((int) min, (int) TimeUnit.SECONDS.toMillis(1L));
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, bo.app.d apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        getV().c();
        if ((apiResponse == null ? null : apiResponse.getD()) != null) {
            apiResponse.getD().setLocalPrefetchedAssetPaths(this.s.y());
        } else {
            x();
        }
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: c, reason: from getter */
    public boolean getC() {
        return this.C;
    }

    @Override // bo.app.s, bo.app.a2
    /* renamed from: d, reason: from getter */
    public x3 getA() {
        return this.A;
    }

    @Override // bo.app.s, bo.app.a2
    public JSONObject l() {
        JSONObject l = super.l();
        if (l == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.v);
            jSONObject.put("trigger_event_type", this.t.d());
            x1 a2 = this.t.a();
            jSONObject.put("data", a2 == null ? null : a2.getKey());
            l.put("template", jSONObject);
            x3 a3 = getA();
            if (a3 != null && a3.z()) {
                x3 a4 = getA();
                l.put("respond_with", a4 == null ? null : a4.getJsonObject());
            }
            return l;
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, d.b);
            return null;
        }
    }

    @Override // bo.app.s, bo.app.m2
    /* renamed from: t, reason: from getter and merged with bridge method [inline-methods] */
    public f1 getV() {
        return this.B;
    }

    /* renamed from: u, reason: from getter */
    public final long getY() {
        return this.y;
    }

    /* renamed from: v, reason: from getter */
    public final t2 getT() {
        return this.t;
    }

    /* renamed from: w, reason: from getter */
    public final y2 getZ() {
        return this.z;
    }

    public final void x() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
        if (StringsKt.isBlank(this.v)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
            return;
        }
        try {
            x1 a2 = j.h.a(this.v, InAppMessageFailureType.TEMPLATE_REQUEST);
            if (a2 == null) {
                return;
            }
            this.u.a(a2);
        } catch (JSONException e2) {
            this.u.b(e2);
        }
    }

    @Override // bo.app.s, bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, o2 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        x();
        if (responseError instanceof g) {
            internalPublisher.a((h2) new s6(this.t, this.s), (Class<h2>) s6.class);
        }
    }

    @Override // bo.app.s, bo.app.m2
    public boolean a(o2 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        if (!(responseError instanceof p3) && !(responseError instanceof d5)) {
            return false;
        }
        long e2 = this.t.e() + this.w;
        if (DateTimeUtils.nowInMilliseconds() < e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new e(e2), 2, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(e2, this), 3, (Object) null);
        return false;
    }

    private final long a(p2 scheduleConfig) {
        if (scheduleConfig.getF() == -1) {
            return TimeUnit.SECONDS.toMillis(scheduleConfig.getE() + 30);
        }
        return scheduleConfig.getF();
    }
}
