package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
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
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B?\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\u0002H\u0007J\b\u0010\r\u001a\u00020\u0002H\u0007R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lbo/app/u;", "", "", "i", "", "f", "k", "e", "c", "m", "o", "l", "n", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lbo/app/n3;", "internalSession", "Lbo/app/n3;", "h", "()Lbo/app/n3;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lbo/app/n3;)V", "getInternalSession$annotations", "()V", "Lbo/app/o5;", "g", "()Lbo/app/o5;", "currentSessionId", "j", "()Z", "isCurrentSessionSealed", "Landroid/content/Context;", "applicationContext", "Lbo/app/q2;", "sessionStorageManager", "Lbo/app/h2;", "internalEventPublisher", "externalEventPublisher", "Landroid/app/AlarmManager;", "alarmManager", "", "sessionTimeoutSeconds", "sessionStartBasedTimeoutEnabled", "<init>", "(Landroid/content/Context;Lbo/app/q2;Lbo/app/h2;Lbo/app/h2;Landroid/app/AlarmManager;IZ)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class u {
    public static final a l = new a(null);
    private static final long m;
    private static final long n;
    private final Context a;
    private final q2 b;
    private final h2 c;
    private final h2 d;
    private final AlarmManager e;
    private final int f;
    private final boolean g;
    private final ReentrantLock h;
    private final String i;
    private Job j;
    private n3 k;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0011J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lbo/app/u$a;", "", "", "sessionStartTimeMs", "sessionEndTimeMs", "", "sessionTimeoutSeconds", "", "sessionStartBasedTimeoutEnabled", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/n3;", "mutableSession", "", "START_BASED_SEAL_DELAY_MS", "J", "()J", "getSTART_BASED_SEAL_DELAY_MS$annotations", "()V", "SESSION_CLOSE_FLUSH_DELAY_MS", "", "SESSION_ID_INTENT_EXTRA_KEY", "Ljava/lang/String;", "SESSION_SHOULD_SEAL_INTENT", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return u.n;
        }

        public final boolean a(double sessionStartTimeMs, double sessionEndTimeMs, int sessionTimeoutSeconds, boolean sessionStartBasedTimeoutEnabled) {
            long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(sessionTimeoutSeconds);
            return sessionStartBasedTimeoutEnabled ? (timeUnit.toMillis((long) sessionStartTimeMs) + millis) + a() <= nowInMilliseconds : timeUnit.toMillis((long) sessionEndTimeMs) + millis <= nowInMilliseconds;
        }

        public final long a(n3 mutableSession, int sessionTimeoutSeconds, boolean sessionStartBasedTimeoutEnabled) {
            Intrinsics.checkNotNullParameter(mutableSession, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(sessionTimeoutSeconds);
            if (!sessionStartBasedTimeoutEnabled) {
                return millis;
            }
            return Math.max(a(), (timeUnit.toMillis((long) mutableSession.getC()) + millis) - DateTimeUtils.nowInMilliseconds());
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
            return "Cancelling session seal alarm";
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
            return "Failed to cancel session seal alarm";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Creating a session seal alarm with a delay of " + this.b + " ms";
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
            return "Failed to create session seal alarm";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ n3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n3 n3Var) {
            super(0);
            this.b = n3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Clearing completely dispatched sealed session ", this.b.getB());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ n3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n3 n3Var) {
            super(0);
            this.b = n3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("New session created with ID: ", this.b.getB());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Getting the stored open session";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ n3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(n3 n3Var) {
            super(0);
            this.b = n3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Checking if this session needs to be sealed: ", this.b.getB());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ n3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(n3 n3Var) {
            super(0);
            this.b = n3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Session [" + this.b.getB() + "] being sealed because its end time is over the grace period. Session: " + this.b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"bo/app/u$k", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "", "onReceive", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class k extends BroadcastReceiver {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Session seal logic executing in broadcast";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.braze.managers.BrazeSessionManager$sessionSealReceiver$1$onReceive$2", f = "BrazeSessionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int b;
            private /* synthetic */ Object c;
            final /* synthetic */ u d;
            final /* synthetic */ BroadcastReceiver.PendingResult e;

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
            static final class a extends Lambda implements Function0<String> {
                public static final a b = new a();

                a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to log throwable during seal session.";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(u uVar, BroadcastReceiver.PendingResult pendingResult, Continuation<? super b> continuation) {
                super(2, continuation);
                this.d = uVar;
                this.e = pendingResult;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.d, this.e, continuation);
                bVar.c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                ReentrantLock reentrantLock = this.d.h;
                u uVar = this.d;
                reentrantLock.lock();
                try {
                    try {
                        uVar.k();
                    } catch (Exception e) {
                        try {
                            uVar.c.a((h2) e, (Class<h2>) Throwable.class);
                        } catch (Exception e2) {
                            BrazeLogger.INSTANCE.brazelog(coroutineScope, BrazeLogger.Priority.E, e2, a.b);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    this.e.finish();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, a.b, 2, (Object) null);
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new b(u.this, goAsync(), null), 3, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.managers.BrazeSessionManager$startSessionStopFlushTimer$1", f = "BrazeSessionManager.kt", i = {0}, l = {331}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        private /* synthetic */ Object c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Requesting data flush on internal session close flush timer.";
            }
        }

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = u.this.new l(continuation);
            lVar.c = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                long j = u.m;
                this.c = coroutineScope2;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope3 = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope3;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
            Braze.INSTANCE.getInstance(u.this.a).requestImmediateDataFlush();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        final /* synthetic */ n3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(n3 n3Var) {
            super(0);
            this.b = n3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Closed session with id ", this.b.getB());
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m = timeUnit.toMillis(10L);
        n = timeUnit.toMillis(10L);
    }

    public u(Context applicationContext, q2 sessionStorageManager, h2 internalEventPublisher, h2 externalEventPublisher, AlarmManager alarmManager, int i2, boolean z) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(alarmManager, "alarmManager");
        this.a = applicationContext;
        this.b = sessionStorageManager;
        this.c = internalEventPublisher;
        this.d = externalEventPublisher;
        this.e = alarmManager;
        this.f = i2;
        this.g = z;
        this.h = new ReentrantLock();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.j = Job$default;
        k kVar = new k();
        String stringPlus = Intrinsics.stringPlus(applicationContext.getPackageName(), ".intent.BRAZE_SESSION_SHOULD_SEAL");
        this.i = stringPlus;
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(kVar, new IntentFilter(stringPlus), 4);
        } else {
            applicationContext.registerReceiver(kVar, new IntentFilter(stringPlus));
        }
    }

    private final void e() {
        n3 n3Var = this.k;
        if (n3Var == null) {
            return;
        }
        long a2 = l.a(n3Var, this.f, this.g);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(a2), 3, (Object) null);
        try {
            Intent intent = new Intent(this.i);
            intent.putExtra(SDKAnalyticsEvents.PARAMETER_SESSION_ID, n3Var.toString());
            this.e.set(1, DateTimeUtils.nowInMilliseconds() + a2, PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
        }
    }

    private final boolean f() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            k();
            n3 k2 = getK();
            boolean z = true;
            if (k2 != null && !k2.getE()) {
                if (k2.getD() != null) {
                    k2.a((Double) null);
                } else {
                    z = false;
                }
                reentrantLock.unlock();
                return z;
            }
            i();
            if (k2 != null && k2.getE()) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(k2), 3, (Object) null);
                    this.b.a(k2.getB().toString());
                    reentrantLock.unlock();
                    return z;
                } catch (Throwable th) {
                    th = th;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void i() {
        n3 n3Var = new n3(null, 0.0d, null, false, 15, null);
        this.k = n3Var;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(n3Var), 2, (Object) null);
        this.c.a((h2) new n5(n3Var), (Class<h2>) n5.class);
        this.d.a((h2) new SessionStateChangedEvent(n3Var.getB().toString(), SessionStateChangedEvent.ChangeType.SESSION_STARTED), (Class<h2>) SessionStateChangedEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (getK() == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
                m5 a2 = this.b.a();
                a(a2 == null ? null : a2.z());
            }
            n3 k2 = getK();
            if (k2 != null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new i(k2), 3, (Object) null);
                Double d2 = k2.getD();
                if (d2 != null && !k2.getE() && l.a(k2.getC(), d2.doubleValue(), this.f, this.g)) {
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new j(k2), 2, (Object) null);
                    l();
                    q2 q2Var = this.b;
                    n3 k3 = getK();
                    q2Var.a(String.valueOf(k3 == null ? null : k3.getB()));
                    a((n3) null);
                }
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final o5 g() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            k();
            n3 k2 = getK();
            return k2 == null ? null : k2.getB();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h, reason: from getter */
    public final n3 getK() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0011, code lost:
    
        if (r1.getE() == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j() {
        boolean z;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            n3 k2 = getK();
            if (k2 != null) {
                z = true;
            }
            z = false;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void l() {
        n3 n3Var = this.k;
        if (n3Var == null) {
            return;
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            n3Var.A();
            this.b.a(n3Var);
            this.c.a((h2) new p5(n3Var), (Class<h2>) p5.class);
            this.d.a((h2) new SessionStateChangedEvent(n3Var.getB().toString(), SessionStateChangedEvent.ChangeType.SESSION_ENDED), (Class<h2>) SessionStateChangedEvent.class);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void m() {
        n3 k2;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (f() && (k2 = getK()) != null) {
                this.b.a(k2);
            }
            d();
            c();
            this.c.a((h2) q5.b, (Class<h2>) q5.class);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void n() {
        Job launch$default;
        Job.DefaultImpls.cancel$default(this.j, (CancellationException) null, 1, (Object) null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new l(null), 3, null);
        this.j = launch$default;
    }

    public final void o() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            f();
            n3 k2 = getK();
            if (k2 != null) {
                k2.a(Double.valueOf(DateTimeUtils.nowInSecondsPrecise()));
                this.b.a(k2);
                n();
                e();
                this.c.a((h2) s5.b, (Class<h2>) s5.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(k2), 3, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void c() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
        try {
            Intent intent = new Intent(this.i);
            intent.putExtra(SDKAnalyticsEvents.PARAMETER_SESSION_ID, String.valueOf(this.k));
            this.e.cancel(PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, c.b);
        }
    }

    public final void d() {
        Job.DefaultImpls.cancel$default(this.j, (CancellationException) null, 1, (Object) null);
    }

    public final void a(n3 n3Var) {
        this.k = n3Var;
    }
}
