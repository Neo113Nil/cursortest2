package bo.app;

import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.models.BrazeGeofence;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007BO\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fH\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\u0015\u001a\u00020\u0006J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¨\u0006-"}, d2 = {"Lbo/app/t;", "", "Lorg/json/JSONArray;", "feedJson", "", "userId", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/a0;", "contentCardsResponse", "Lbo/app/i5;", "serverConfig", "", "Lbo/app/y2;", "triggeredActions", "b", "Lcom/braze/models/BrazeGeofence;", "geofences", "featureFlagsData", "Lcom/braze/models/inappmessage/IInAppMessage;", "templatedInAppMessage", "c", "Lbo/app/d;", "apiResponse", "Lbo/app/o2;", "responseError", "Lbo/app/a2;", "request", "Lbo/app/i2;", "httpConnector", "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/m1;", "feedStorageProvider", "Lbo/app/z1;", "brazeManager", "Lbo/app/k5;", "serverConfigStorage", "Lbo/app/b0;", "contentCardsStorage", "Lbo/app/u0;", "endpointMetadataProvider", "<init>", "(Lbo/app/a2;Lbo/app/i2;Lbo/app/h2;Lbo/app/h2;Lbo/app/m1;Lbo/app/z1;Lbo/app/k5;Lbo/app/b0;Lbo/app/u0;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class t {
    public static final a k = new a(null);
    private static final String l = BrazeLogger.getBrazeLogTag((Class<?>) t.class);
    private final a2 a;
    private final i2 b;
    private final h2 c;
    private final h2 d;
    private final m1 e;
    private final z1 f;
    private final k5 g;
    private final b0 h;
    private final u0 i;
    private final Map<String, String> j;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0005\u001a\u00020\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0081T¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lbo/app/t$a;", "", "Lkotlin/Function0;", "", "block", Constants.BRAZE_PUSH_CONTENT_KEY, "", "BRAZE_LAST_REQUESTED_MS_AGO_HEADER", "Ljava/lang/String;", "getBRAZE_LAST_REQUESTED_MS_AGO_HEADER$android_sdk_base_release$annotations", "()V", "TAG", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.t$a$a, reason: collision with other inner class name */
        static final class C0088a extends Lambda implements Function0<String> {
            final /* synthetic */ Object b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0088a(Object obj) {
                super(0);
                this.b = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Encountered exception while parsing server response for ", this.b);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(Object obj, Function0<Unit> function0) {
            try {
                function0.invoke();
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(obj, BrazeLogger.Priority.E, e, new C0088a(obj));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ a5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a5 a5Var) {
            super(0);
            this.b = a5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not parse request parameters for POST request to " + this.b + ", cancelling request.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Exception exc) {
            super(0);
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Experienced network communication exception processing API response. Sending network error event. ", this.b.getMessage());
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
            return "Experienced exception processing API response. Failing task.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<Unit> {
        final /* synthetic */ a0 c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a0 a0Var, String str) {
            super(0);
            this.c = a0Var;
            this.d = str;
        }

        public final void a() {
            ContentCardsUpdatedEvent a = t.this.h.a(this.c, this.d);
            if (a == null) {
                return;
            }
            t.this.d.a((h2) a, (Class<h2>) ContentCardsUpdatedEvent.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<Unit> {
        final /* synthetic */ JSONArray c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(JSONArray jSONArray) {
            super(0);
            this.c = jSONArray;
        }

        public final void a() {
            t.this.c.a((h2) new h1(this.c), (Class<h2>) h1.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<Unit> {
        final /* synthetic */ JSONArray c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(JSONArray jSONArray, String str) {
            super(0);
            this.c = jSONArray;
            this.d = str;
        }

        public final void a() {
            FeedUpdatedEvent a = t.this.e.a(this.c, this.d);
            if (a == null) {
                return;
            }
            t.this.d.a((h2) a, (Class<h2>) FeedUpdatedEvent.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<Unit> {
        final /* synthetic */ List<BrazeGeofence> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List<BrazeGeofence> list) {
            super(0);
            this.c = list;
        }

        public final void a() {
            t.this.c.a((h2) new r1(this.c), (Class<h2>) r1.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<Unit> {
        final /* synthetic */ i5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(i5 i5Var) {
            super(0);
            this.c = i5Var;
        }

        public final void a() {
            t.this.g.b(this.c);
            t.this.c.a((h2) new j5(this.c), (Class<h2>) j5.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<Unit> {
        final /* synthetic */ IInAppMessage c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(IInAppMessage iInAppMessage, String str) {
            super(0);
            this.c = iInAppMessage;
            this.d = str;
        }

        public final void a() {
            if (t.this.a instanceof a6) {
                this.c.setExpirationTimestamp(((a6) t.this.a).getY());
                t.this.c.a((h2) new d3(((a6) t.this.a).getT(), ((a6) t.this.a).getZ(), this.c, this.d), (Class<h2>) d3.class);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()V"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<Unit> {
        final /* synthetic */ List<y2> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(List<? extends y2> list) {
            super(0);
            this.c = list;
        }

        public final void a() {
            t.this.c.a((h2) new u6(this.c), (Class<h2>) u6.class);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Processing server response payload for user with id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        final /* synthetic */ o2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(o2 o2Var) {
            super(0);
            this.b = o2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Received server error from request: ", this.b.getA());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i) {
            super(0);
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retrying request: " + t.this.a + " after delay of " + this.c + " ms";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.requests.BrazeRequestTask$processResponseError$3", f = "BrazeRequestTask.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ int c;
        final /* synthetic */ t d;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ t b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(0);
                this.b = tVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Adding retried request to dispatch: ", this.b.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i, t tVar, Continuation<? super o> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new o(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.c;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, t.l, BrazeLogger.Priority.V, (Throwable) null, (Function0) new a(this.d), 4, (Object) null);
            this.d.f.a(this.d.a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        public static final p b = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Api response was null, failing task.";
        }
    }

    public t(a2 request, i2 httpConnector, h2 internalPublisher, h2 externalPublisher, m1 feedStorageProvider, z1 brazeManager, k5 serverConfigStorage, b0 contentCardsStorage, u0 endpointMetadataProvider) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(feedStorageProvider, "feedStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(serverConfigStorage, "serverConfigStorage");
        Intrinsics.checkNotNullParameter(contentCardsStorage, "contentCardsStorage");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        this.a = request;
        this.b = httpConnector;
        this.c = internalPublisher;
        this.d = externalPublisher;
        this.e = feedStorageProvider;
        this.f = brazeManager;
        this.g = serverConfigStorage;
        this.h = contentCardsStorage;
        this.i = endpointMetadataProvider;
        Map<String, String> a2 = x4.a();
        this.j = a2;
        request.a(a2);
    }

    public final bo.app.d b() {
        a5 h2;
        JSONObject l2;
        try {
            h2 = this.a.h();
            l2 = this.a.l();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (l2 == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(h2), 2, (Object) null);
                return null;
            }
            this.j.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(this.i.a(h2)));
            return new bo.app.d(this.b.a(h2, this.j, l2), this.a, this.f);
        } catch (Exception e3) {
            e = e3;
            if (e instanceof o3) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new c(e));
                this.c.a((h2) new y4(this.a), (Class<h2>) y4.class);
                this.d.a((h2) new BrazeNetworkFailureEvent(e, this.a), (Class<h2>) BrazeNetworkFailureEvent.class);
            }
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, d.b);
            return null;
        }
    }

    public final void c() {
        t tVar;
        bo.app.d b2 = b();
        if (b2 != null) {
            a(b2);
            this.c.a((h2) new z4(this.a), (Class<h2>) z4.class);
            if (b2.getJ() instanceof d5) {
                this.c.a((h2) new q0(this.a), (Class<h2>) q0.class);
            } else {
                this.c.a((h2) new s0(this.a), (Class<h2>) s0.class);
            }
            tVar = this;
        } else {
            tVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, tVar, BrazeLogger.Priority.W, (Throwable) null, p.b, 2, (Object) null);
            p3 p3Var = new p3("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", tVar.a);
            tVar.a.a(tVar.c, tVar.d, p3Var);
            tVar.c.a((h2) new q0(tVar.a), (Class<h2>) q0.class);
            a(p3Var);
        }
        tVar.a.b(tVar.c);
    }

    public final void a(bo.app.d apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        if (apiResponse.getJ() == null) {
            this.a.a(this.c, this.d, apiResponse);
        } else {
            a(apiResponse.getJ());
            this.a.a(this.c, this.d, apiResponse.getJ());
        }
        b(apiResponse);
    }

    public final void a(o2 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new m(responseError), 2, (Object) null);
        this.c.a((h2) new l5(responseError), (Class<h2>) l5.class);
        if (this.a.a(responseError)) {
            int a2 = this.a.getV().a();
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new n(a2), 3, (Object) null);
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new o(a2, this, null), 3, null);
            return;
        }
        a2 a2Var = this.a;
        if (a2Var instanceof a6) {
            h2 h2Var = this.d;
            String d2 = ((a6) a2Var).getT().d();
            Intrinsics.checkNotNullExpressionValue(d2, "request.triggerEvent.triggerEventType");
            h2Var.a((h2) new NoMatchingTriggerEvent(d2), (Class<h2>) NoMatchingTriggerEvent.class);
        }
    }

    public final void b(bo.app.d apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        String a2 = this.f.a();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new l(a2), 2, (Object) null);
        a(apiResponse.getI(), a2);
        a(apiResponse.getC(), a2);
        a(apiResponse.getF());
        b(apiResponse.j());
        a(apiResponse.e());
        a(apiResponse.getH());
        a(apiResponse.getD(), a2);
    }

    private final void a(JSONArray feedJson, String userId) {
        if (feedJson == null) {
            return;
        }
        k.a(feedJson, new g(feedJson, userId));
    }

    private final void a(a0 contentCardsResponse, String userId) {
        if (contentCardsResponse == null) {
            return;
        }
        k.a(contentCardsResponse, new e(contentCardsResponse, userId));
    }

    private final void a(i5 serverConfig) {
        if (serverConfig == null) {
            return;
        }
        k.a(serverConfig, new i(serverConfig));
    }

    private final void a(List<BrazeGeofence> geofences) {
        if (geofences == null) {
            return;
        }
        k.a(geofences, new h(geofences));
    }

    private final void a(JSONArray featureFlagsData) {
        if (featureFlagsData == null) {
            return;
        }
        k.a(featureFlagsData, new f(featureFlagsData));
    }

    private final void a(IInAppMessage templatedInAppMessage, String userId) {
        if (templatedInAppMessage == null) {
            return;
        }
        k.a(templatedInAppMessage, new j(templatedInAppMessage, userId));
    }

    private final void b(List<? extends y2> triggeredActions) {
        if (triggeredActions == null) {
            return;
        }
        k.a(triggeredActions, new k(triggeredActions));
    }
}
