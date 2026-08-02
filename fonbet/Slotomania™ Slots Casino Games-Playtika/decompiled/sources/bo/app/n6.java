package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007BC\b\u0016\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00104\u001a\u000203\u0012\b\u00105\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u00106\u001a\u00020\u0010¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000b\u001a\u00020\u0002H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\bH\u0007J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000fH\u0007J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0007R\u0017\u0010\u0014\u001a\u00020\u00138G¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8G¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000e\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0!8G¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b\u0007\u0010+¨\u00069"}, d2 = {"Lbo/app/n6;", "Lbo/app/u2;", "", "i", "", "Lbo/app/y2;", "triggeredActions", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/t2;", "triggerEvent", "failedAction", "b", "(Lbo/app/t2;)V", "event", "c", "", "", "h", "action", "Landroid/content/SharedPreferences;", "triggeredActionStorage", "Landroid/content/SharedPreferences;", "g", "()Landroid/content/SharedPreferences;", "Lbo/app/x2;", "reEligibilityManager", "Lbo/app/x2;", "f", "()Lbo/app/x2;", "Ljava/util/concurrent/atomic/AtomicInteger;", "inFlightTriggerRequests", "Ljava/util/concurrent/atomic/AtomicInteger;", "()Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/Queue;", "pendingTriggerEvents", "Ljava/util/Queue;", "e", "()Ljava/util/Queue;", "", "lastDisplayTimeSeconds", "J", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()J", "(J)V", "Landroid/content/Context;", "context", "Lbo/app/z1;", "brazeManager", "Lbo/app/h2;", "internalEventPublisher", "externalEventPublisher", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "userId", "apiKey", "<init>", "(Landroid/content/Context;Lbo/app/z1;Lbo/app/h2;Lbo/app/h2;Lcom/braze/configuration/BrazeConfigurationProvider;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class n6 implements u2 {
    public static final a o = new a(null);
    private static final long p = TimeUnit.SECONDS.toMillis(30);
    private static final String q = BrazeLogger.getBrazeLogTag((Class<?>) n6.class);
    private final Context a;
    private final z1 b;
    private final h2 c;
    private h2 d;
    private final long e;
    private final SharedPreferences f;
    private final r2 g;
    private final x2 h;
    private final AtomicInteger i;
    private final Queue<t2> j;
    private final Map<String, y2> k;
    private volatile long l;
    private final ReentrantLock m;
    private final ReentrantLock n;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "In flight trigger requests is empty. Executing any pending trigger events.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ t2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(t2 t2Var) {
            super(0);
            this.b = t2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "New incoming <" + ((Object) this.b.d()) + ">. Searching for matching triggers.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ t2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t2 t2Var) {
            super(0);
            this.b = t2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No action found for " + ((Object) this.b.d()) + " event, publishing NoMatchingTriggerEvent";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Found potential triggered action for incoming trigger event. Action id " + this.b.getB() + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ t2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t2 t2Var) {
            super(0);
            this.b = t2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to match triggered action for incoming <" + ((Object) this.b.d()) + ">.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ t2 b;
        final /* synthetic */ Ref.ObjectRef<y2> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(t2 t2Var, Ref.ObjectRef<y2> objectRef) {
            super(0);
            this.b = t2Var;
            this.c = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return StringsKt.trimIndent("\n     Found best triggered action for incoming trigger event " + (this.b.a() != null ? JsonUtils.getPrettyPrintedString(this.b.a().getKey()) : "") + ".\n     Matched Action id: " + this.c.element.getB() + ".\n                ");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.triggers.managers.TriggerManager$performTriggeredAction$1", f = "TriggerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ y2 c;
        final /* synthetic */ n6 d;
        final /* synthetic */ t2 e;
        final /* synthetic */ long f;
        final /* synthetic */ long g;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j) {
                super(0);
                this.b = j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Performing triggered action after a delay of " + this.b + " ms.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(y2 y2Var, n6 n6Var, t2 t2Var, long j, long j2, Continuation<? super h> continuation) {
            super(1, continuation);
            this.c = y2Var;
            this.d = n6Var;
            this.e = t2Var;
            this.f = j;
            this.g = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new h(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n6.q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new a(this.g), 6, (Object) null);
            this.c.a(this.d.a, this.d.c, this.e, this.f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ List<y2> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(List<? extends y2> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Registering " + this.b.size() + " new triggered actions.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Registering triggered action id " + this.b.getB() + ' ';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        public static final k b = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Test triggered actions found, triggering test event.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        public static final l b = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No test triggered actions found.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received null or blank serialized triggered action string for action id " + ((Object) this.b) + " from shared preferences. Not parsing.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retrieving templated triggered action id " + this.b.getB() + " from local storage.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        public static final o b = new o();

        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored triggered actions.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger manager received failed triggered action with id: <" + this.b.getB() + ">. Will attempt to perform fallback triggered actions, if present.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        public static final q b = new q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        public static final r b = new r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action has no fallback action to perform. Doing nothing.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Fallback trigger has expired. Trigger id: ", this.b.getB());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(y2 y2Var, long j) {
            super(0);
            this.b = y2Var;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Performing fallback triggered action with id: <" + this.b.getB() + "> with a delay: " + this.c + " ms";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.triggers.managers.TriggerManager$retryTriggeredAction$6", f = "TriggerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class u extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ y2 c;
        final /* synthetic */ n6 d;
        final /* synthetic */ t2 e;
        final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(y2 y2Var, n6 n6Var, t2 t2Var, long j, Continuation<? super u> continuation) {
            super(1, continuation);
            this.c = y2Var;
            this.d = n6Var;
            this.e = t2Var;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((u) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new u(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.c.a(this.d.a, this.d.c, this.e, this.f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v extends Lambda implements Function0<String> {
        public static final v b = new v();

        v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Subscribing to trigger dispatch events.";
        }
    }

    public n6(Context context, z1 brazeManager, h2 internalEventPublisher, h2 externalEventPublisher, BrazeConfigurationProvider configurationProvider, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.m = new ReentrantLock();
        this.n = new ReentrantLock();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.a = applicationContext;
        this.b = brazeManager;
        this.c = internalEventPublisher;
        this.d = externalEventPublisher;
        this.e = configurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.triggers.actions", StringUtils.getCacheFileSuffix(context, str, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f = sharedPreferences;
        this.g = new f6(context, apiKey);
        this.h = new q6(context, str, apiKey);
        this.k = h();
        this.i = new AtomicInteger(0);
        this.j = new ArrayDeque();
        i();
    }

    private final void i() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, BrazeLogger.Priority.V, (Throwable) null, (Function0) v.b, 4, (Object) null);
        this.c.b(i6.class, new IEventSubscriber() { // from class: bo.app.n6$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                n6.a(n6.this, (i6) obj);
            }
        });
        this.c.b(h6.class, new IEventSubscriber() { // from class: bo.app.n6$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                n6.a(n6.this, (h6) obj);
            }
        });
    }

    /* renamed from: c, reason: from getter */
    public final AtomicInteger getI() {
        return this.i;
    }

    /* renamed from: d, reason: from getter */
    public long getL() {
        return this.l;
    }

    public final Queue<t2> e() {
        return this.j;
    }

    /* renamed from: f, reason: from getter */
    public x2 getH() {
        return this.h;
    }

    /* renamed from: g, reason: from getter */
    public final SharedPreferences getF() {
        return this.f;
    }

    public final Map<String, y2> h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.f.getAll();
        if (all != null && !all.isEmpty()) {
            try {
                for (String str : CollectionsKt.toSet(all.keySet())) {
                    String string = this.f.getString(str, null);
                    if (string != null && !StringsKt.isBlank(string)) {
                        y2 b2 = p6.a.b(new JSONObject(string), this.b);
                        if (b2 != null) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new n(b2), 6, (Object) null);
                            linkedHashMap.put(b2.getB(), b2);
                        }
                    }
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, BrazeLogger.Priority.W, (Throwable) null, (Function0) new m(str), 4, (Object) null);
                }
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(q, BrazeLogger.Priority.E, (Throwable) e2, (Function0<String>) o.b);
            }
        }
        return linkedHashMap;
    }

    public final void b(t2 triggerEvent) {
        int hashCode;
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new c(triggerEvent), 6, (Object) null);
        y2 c2 = c(triggerEvent);
        if (c2 != null) {
            b(triggerEvent, c2);
            return;
        }
        String d2 = triggerEvent.d();
        if (d2 == null || ((hashCode = d2.hashCode()) == 3417674 ? !d2.equals("open") : !(hashCode == 717572172 ? d2.equals("custom_event") : hashCode == 1743324417 && d2.equals(FirebaseAnalytics.Event.PURCHASE)))) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new d(triggerEvent), 3, (Object) null);
        h2 h2Var = this.d;
        String d3 = triggerEvent.d();
        Intrinsics.checkNotNullExpressionValue(d3, "triggerEvent.triggerEventType");
        h2Var.a((h2) new NoMatchingTriggerEvent(d3), (Class<h2>) NoMatchingTriggerEvent.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, bo.app.y2, java.lang.Object] */
    public final y2 c(t2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            int i2 = Integer.MIN_VALUE;
            for (y2 y2Var : this.k.values()) {
                if (y2Var.b(event) && getH().b(y2Var) && o.a(event, y2Var, getL(), this.e)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new e(y2Var), 6, (Object) null);
                    int d2 = y2Var.getC().getD();
                    if (d2 > i2) {
                        objectRef.element = y2Var;
                        i2 = d2;
                    }
                    arrayList.add(y2Var);
                }
            }
            Object obj = objectRef.element;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new f(event), 6, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((y2) objectRef.element).a(new o6(arrayList));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new g(event, objectRef), 6, (Object) null);
            return (y2) objectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.u2
    public void a(long j2) {
        this.l = j2;
    }

    @Override // bo.app.w2
    public void a(List<? extends y2> triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        d6 d6Var = new d6();
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            this.k.clear();
            SharedPreferences.Editor clear = getF().edit().clear();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new i(triggeredActions), 6, (Object) null);
            boolean z = false;
            for (y2 y2Var : triggeredActions) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new j(y2Var), 6, (Object) null);
                this.k.put(y2Var.getB(), y2Var);
                clear.putString(y2Var.getB(), String.valueOf(y2Var.getKey()));
                if (y2Var.b(d6Var)) {
                    z = true;
                }
            }
            clear.apply();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            getH().a(triggeredActions);
            this.g.a(triggeredActions);
            if (z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, BrazeLogger.Priority.I, (Throwable) null, (Function0) k.b, 4, (Object) null);
                a(d6Var);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) l.b, 6, (Object) null);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            if (getI().get() > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) b.b, 6, (Object) null);
            while (!e().isEmpty()) {
                t2 poll = e().poll();
                if (poll != null) {
                    b(poll);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(t2 event, y2 action) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(action, "action");
        action.a(this.g.a(action));
        long e2 = action.getC().getF() != -1 ? event.e() + r0.getF() : -1L;
        long millis = TimeUnit.SECONDS.toMillis(r0.getE());
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new h(action, this, event, e2, millis, null), 2, null);
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J \u0010\n\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lbo/app/n6$a;", "", "Lbo/app/t2;", "triggerEvent", "Lbo/app/y2;", "action", "", "lastDisplayTime", "minSecondsIntervalBetweenActions", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/z1;", "brazeManager", "", "triggerAnalyticsId", "Lcom/braze/enums/inappmessage/InAppMessageFailureType;", "inAppMessageFailureType", "", "ACTIONS_FILE_PREFIX", "Ljava/lang/String;", "DEFAULT_TIMEOUT_IN_MS", "J", "TAG", "TYPE", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.n6$a$a, reason: collision with other inner class name */
        static final class C0084a extends Lambda implements Function0<String> {
            public static final C0084a b = new C0084a();

            C0084a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(int i) {
                super(0);
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Using override minimum display interval: ", Integer.valueOf(this.b));
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            final /* synthetic */ long b;
            final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(long j, long j2) {
                super(0);
                this.b = j;
                this.c = j2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Minimum time interval requirement met for matched trigger. Action display time: " + this.b + " . Next viable display time: " + this.c;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class d extends Lambda implements Function0<String> {
            final /* synthetic */ long b;
            final /* synthetic */ long c;
            final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(long j, long j2, long j3) {
                super(0);
                this.b = j;
                this.c = j2;
                this.d = j3;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Minimum time interval requirement and triggered action override time interval requirement of " + this.b + " not met for matched trigger. Returning null. Next viable display time: " + this.c + ". Action display time: " + this.d;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class e extends Lambda implements Function0<String> {
            final /* synthetic */ InAppMessageFailureType b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(InAppMessageFailureType inAppMessageFailureType) {
                super(0);
                this.b = inAppMessageFailureType;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Trigger internal timeout exceeded. Attempting to log trigger failure: ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class f extends Lambda implements Function0<String> {
            final /* synthetic */ InAppMessageFailureType b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(InAppMessageFailureType inAppMessageFailureType) {
                super(0);
                this.b = inAppMessageFailureType;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Trigger ID is blank. Not logging trigger failure: ", this.b);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean a(t2 triggerEvent, y2 action, long lastDisplayTime, long minSecondsIntervalBetweenActions) {
            long j;
            Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
            Intrinsics.checkNotNullParameter(action, "action");
            if (triggerEvent instanceof d6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n6.q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) C0084a.b, 6, (Object) null);
                return true;
            }
            long nowInSeconds = DateTimeUtils.nowInSeconds() + action.getC().getE();
            int h = action.getC().getH();
            if (h != -1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n6.q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new b(h), 6, (Object) null);
                j = lastDisplayTime + h;
            } else {
                j = lastDisplayTime + minSecondsIntervalBetweenActions;
            }
            long j2 = j;
            if (nowInSeconds >= j2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n6.q, BrazeLogger.Priority.I, (Throwable) null, (Function0) new c(nowInSeconds, j2), 4, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n6.q, BrazeLogger.Priority.I, (Throwable) null, (Function0) new d(minSecondsIntervalBetweenActions, j2, nowInSeconds), 4, (Object) null);
            return false;
        }

        @JvmStatic
        public final void a(z1 brazeManager, String triggerAnalyticsId, InAppMessageFailureType inAppMessageFailureType) {
            Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
            Intrinsics.checkNotNullParameter(triggerAnalyticsId, "triggerAnalyticsId");
            Intrinsics.checkNotNullParameter(inAppMessageFailureType, "inAppMessageFailureType");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, n6.q, BrazeLogger.Priority.I, (Throwable) null, (Function0) new e(inAppMessageFailureType), 4, (Object) null);
            if (StringsKt.isBlank(triggerAnalyticsId)) {
                BrazeLogger.brazelog$default(brazeLogger, n6.q, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new f(inAppMessageFailureType), 6, (Object) null);
                return;
            }
            x1 a = bo.app.j.h.a(triggerAnalyticsId, inAppMessageFailureType);
            if (a == null) {
                return;
            }
            brazeManager.a(a);
        }
    }

    @Override // bo.app.u2
    public void a(t2 triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            e().add(triggerEvent);
            if (getI().get() == 0) {
                b();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.u2
    public void a(t2 triggerEvent, y2 failedAction) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(failedAction, "failedAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = q;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new p(failedAction), 6, (Object) null);
        o6 e2 = failedAction.getE();
        if (e2 == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Function0) q.b, 6, (Object) null);
            return;
        }
        y2 a2 = e2.a();
        if (a2 == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Function0) r.b, 6, (Object) null);
            return;
        }
        a2.a(e2);
        a2.a(this.g.a(a2));
        long e3 = triggerEvent.e();
        long f2 = a2.getC().getF();
        long millis = TimeUnit.SECONDS.toMillis(r0.getE());
        long j2 = f2 != -1 ? f2 + e3 : e3 + millis + p;
        if (j2 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new s(a2), 6, (Object) null);
            o.a(this.b, a2.getB(), InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED);
            a(triggerEvent, a2);
        } else {
            long max = Math.max(0L, (millis + e3) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new t(a2, max), 6, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(max), null, new u(a2, this, triggerEvent, j2, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(n6 this$0, i6 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.i.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(n6 this$0, h6 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.i.decrementAndGet();
        this$0.b();
    }
}
