package bo.app;

import android.content.Context;
import bo.app.x3;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

@Metadata(bv = {}, d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010Q\u001a\u00020P\u0012\b\b\u0001\u0010S\u001a\u00020R\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010^\u001a\u00020\n\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010d\u001a\u00020c\u0012\u0006\u0010f\u001a\u00020e\u0012\u0006\u0010h\u001a\u00020g\u0012\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0012\u001a\u00020\u0004H\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0015R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0015R\u0017\u0010&\u001a\u00020%8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00108G¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00108G¢\u0006\u0006\u001a\u0004\b.\u0010\u0015R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002000\u00108G¢\u0006\u0006\u001a\u0004\b1\u0010\u0015R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002030\u00108G¢\u0006\u0006\u001a\u0004\b4\u0010\u0015R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108G¢\u0006\u0006\u001a\u0004\b6\u0010\u0015R \u0010<\u001a\b\u0012\u0004\u0012\u0002080\u00108@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0015R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u00108G¢\u0006\u0006\u001a\u0004\b>\u0010\u0015R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\u00108G¢\u0006\u0006\u001a\u0004\bA\u0010\u0015R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020C0\u00108G¢\u0006\u0006\u001a\u0004\bD\u0010\u0015R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020F0\u00108G¢\u0006\u0006\u001a\u0004\bG\u0010\u0015R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u00108G¢\u0006\u0006\u001a\u0004\bJ\u0010\u0015¨\u0006m"}, d2 = {"Lbo/app/a1;", "", "Lbo/app/p5;", "sessionSealedEvent", "", Constants.BRAZE_PUSH_CONTENT_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, Constants.BRAZE_PUSH_TITLE_KEY, "u", "v", "Lbo/app/h2;", "eventMessenger", "x", "w", "Ljava/util/concurrent/Semaphore;", "semaphore", "Lcom/braze/events/IEventSubscriber;", "", "y", "Lbo/app/m3;", "g", "()Lcom/braze/events/IEventSubscriber;", "messagingSessionEventSubscriber", "Lbo/app/l6;", "o", "triggerEventEventSubscriber", "Lbo/app/s6;", "p", "triggeredActionRetryEventSubscriber", "Lbo/app/y;", "h", "retryContentCardsEventSubscriber", "Lbo/app/x;", "cancelRetryContentCardsEventSubscriber", "Lbo/app/v5;", "m", "storageExceptionSubscriber", "Lbo/app/w6;", "userCache", "Lbo/app/w6;", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "()Lbo/app/w6;", "Lbo/app/s0;", "c", "dispatchSucceededEventSubscriber", "Lbo/app/q0;", "b", "dispatchFailedEventSubscriber", "Lbo/app/n5;", "j", "sessionCreatedEventSubscriber", "Lbo/app/q5;", "l", "sessionStartedEventSubscriber", "k", "sessionSealedEventSubscriber", "Lbo/app/j5;", "i", "getServerConfigEventSubscriber$android_sdk_base_release$annotations", "()V", "serverConfigEventSubscriber", "Lbo/app/r1;", "e", "geofencesEventSubscriber", "Lbo/app/h1;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "featureFlagsEventSubscriber", "Lbo/app/j6;", "n", "triggerEligiblePushClickEventSubscriber", "Lbo/app/u6;", "q", "triggeredActionsReceivedEventSubscriber", "Lbo/app/d3;", "f", "inAppMessagePublishEventSubscriber", "Landroid/content/Context;", "applicationContext", "Lbo/app/j2;", "locationManager", "Lbo/app/f2;", "dispatchManager", "Lbo/app/z1;", "brazeManager", "Lbo/app/l0;", "deviceCache", "Lbo/app/u2;", "triggerManager", "Lbo/app/x2;", "triggerReEligibilityManager", "Lbo/app/d1;", "eventStorageManager", "Lcom/braze/managers/BrazeGeofenceManager;", "geofenceManager", "externalEventPublisher", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lbo/app/b0;", "contentCardsStorageProvider", "Lbo/app/g5;", "sdkMetadataCache", "Lbo/app/k5;", "serverConfigStorageProvider", "Lbo/app/g1;", "featureFlagsManager", "Lbo/app/j4;", "pushDeliveryManager", "<init>", "(Landroid/content/Context;Lbo/app/j2;Lbo/app/f2;Lbo/app/z1;Lbo/app/w6;Lbo/app/l0;Lbo/app/u2;Lbo/app/x2;Lbo/app/d1;Lcom/braze/managers/BrazeGeofenceManager;Lbo/app/h2;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/b0;Lbo/app/g5;Lbo/app/k5;Lbo/app/g1;Lbo/app/j4;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a1 {
    private final Context a;
    private final j2 b;
    private final f2 c;
    public final z1 d;
    private final w6 e;
    private final l0 f;
    private final u2 g;
    private final x2 h;
    private final d1 i;
    private final BrazeGeofenceManager j;
    private final h2 k;
    private final BrazeConfigurationProvider l;
    private final b0 m;
    private final g5 n;
    private k5 o;
    private final g1 p;
    private final j4 q;
    public final AtomicBoolean r;
    private final AtomicBoolean s;
    private j6 t;
    private Job u;
    private final AtomicBoolean v;
    private final AtomicBoolean w;
    private final AtomicBoolean x;
    private final AtomicBoolean y;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log error.";
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
            return "Requesting Content Card refresh on session created event due to configuration.";
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
            return "Content Cards already initialized. Not retrieving.";
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
            return "Requesting Feature Flags refresh on session created event due to configuration.";
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
            return "Feature Flags already initialized. Not retrieving.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting Push Max request on session created event due to configuration.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Push Max already requested for this session. Not requesting again.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not publish in-app message with trigger action id: ", this.b.getB());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Performing push delivery event flush";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        public static final j b = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting trigger refresh.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j, int i) {
            super(0);
            this.b = j;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "ContentCardRetryEvent received. timeInMS: " + this.b + ", retryCount: " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.events.EventListenerFactory$retryContentCardsEventSubscriber$1$2", f = "EventListenerFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int b;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i, Continuation<? super l> continuation) {
            super(1, continuation);
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((l) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return a1.this.new l(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a1 a1Var = a1.this;
            z1.a(a1Var.d, a1Var.m.e(), a1.this.m.f(), this.d, false, 8, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        public static final m b = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Session created event for new session received.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        public static final n b = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting Braze Geofence refresh on session created event due to configuration.";
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
            return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
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
            return "Session start event for new session received.";
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
            return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
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
            return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s extends Lambda implements Function0<String> {
        public static final s b = new s();

        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not automatically requesting Push Max on session created event due to server configuration.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        public static final t b = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log the storage exception.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u extends Lambda implements Function0<String> {
        public static final u b = new u();

        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting trigger update due to trigger-eligible push click event";
        }
    }

    public a1(Context applicationContext, j2 locationManager, f2 dispatchManager, z1 brazeManager, w6 userCache, l0 deviceCache, u2 triggerManager, x2 triggerReEligibilityManager, d1 eventStorageManager, BrazeGeofenceManager geofenceManager, h2 externalEventPublisher, BrazeConfigurationProvider configurationProvider, b0 contentCardsStorageProvider, g5 sdkMetadataCache, k5 serverConfigStorageProvider, g1 featureFlagsManager, j4 pushDeliveryManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(dispatchManager, "dispatchManager");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        Intrinsics.checkNotNullParameter(triggerManager, "triggerManager");
        Intrinsics.checkNotNullParameter(triggerReEligibilityManager, "triggerReEligibilityManager");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(geofenceManager, "geofenceManager");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(sdkMetadataCache, "sdkMetadataCache");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(featureFlagsManager, "featureFlagsManager");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        this.a = applicationContext;
        this.b = locationManager;
        this.c = dispatchManager;
        this.d = brazeManager;
        this.e = userCache;
        this.f = deviceCache;
        this.g = triggerManager;
        this.h = triggerReEligibilityManager;
        this.i = eventStorageManager;
        this.j = geofenceManager;
        this.k = externalEventPublisher;
        this.l = configurationProvider;
        this.m = contentCardsStorageProvider;
        this.n = sdkMetadataCache;
        this.o = serverConfigStorageProvider;
        this.p = featureFlagsManager;
        this.q = pushDeliveryManager;
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.y = new AtomicBoolean(false);
    }

    private final IEventSubscriber<m3> g() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (m3) obj);
            }
        };
    }

    private final IEventSubscriber<y> h() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (y) obj);
            }
        };
    }

    private final IEventSubscriber<v5> m() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (v5) obj);
            }
        };
    }

    private final IEventSubscriber<l6> o() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (l6) obj);
            }
        };
    }

    private final IEventSubscriber<s6> p() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (s6) obj);
            }
        };
    }

    private final void s() {
        if (!this.w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            z1.a(this.d, this.m.e(), this.m.f(), 0, false, 12, null);
        }
    }

    private final void t() {
        if (!this.x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
            this.p.a();
        }
    }

    private final void u() {
        if (!this.y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, g.b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.b, 3, (Object) null);
            this.d.f();
        }
    }

    private final void v() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
        z1.a(this.d, 0L, 1, (Object) null);
    }

    public final IEventSubscriber<q0> b() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda11
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (q0) obj);
            }
        };
    }

    public final IEventSubscriber<s0> c() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (s0) obj);
            }
        };
    }

    public final IEventSubscriber<h1> d() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda5
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (h1) obj);
            }
        };
    }

    public final IEventSubscriber<r1> e() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda6
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (r1) obj);
            }
        };
    }

    public final IEventSubscriber<d3> f() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda13
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (d3) obj);
            }
        };
    }

    public final IEventSubscriber<j5> i() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda14
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (j5) obj);
            }
        };
    }

    public final IEventSubscriber<n5> j() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda4
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (n5) obj);
            }
        };
    }

    public final IEventSubscriber<p5> k() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda12
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (p5) obj);
            }
        };
    }

    public final IEventSubscriber<q5> l() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda10
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (q5) obj);
            }
        };
    }

    public final IEventSubscriber<j6> n() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda16
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (j6) obj);
            }
        };
    }

    public final IEventSubscriber<u6> q() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (u6) obj);
            }
        };
    }

    /* renamed from: r, reason: from getter */
    public final w6 getE() {
        return this.e;
    }

    public final void w() {
        j6 j6Var;
        if (!this.s.compareAndSet(true, false) || (j6Var = this.t) == null) {
            return;
        }
        this.g.a(new g4(j6Var.getA(), j6Var.getB()));
        this.t = null;
    }

    public final void x() {
        if (this.r.compareAndSet(true, false)) {
            this.g.a(new u3());
        }
    }

    public final void y() {
        if (this.d.c()) {
            this.r.set(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, j.b, 3, (Object) null);
            this.d.a(new x3.a(null, null, null, null, 15, null).c());
            this.d.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, s0 dstr$brazeRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$brazeRequest, "$dstr$brazeRequest");
        a2 a2 = dstr$brazeRequest.getA();
        k0 g2 = a2.getG();
        if (g2 != null) {
            this$0.f.a((l0) g2, true);
        }
        y3 k2 = a2.getK();
        if (k2 != null) {
            this$0.getE().a((w6) k2, true);
        }
        bo.app.k m2 = a2.getM();
        if (m2 != null) {
            this$0.i.a(m2.b());
        }
        x3 a3 = a2.getA();
        if (a3 != null && a3.y()) {
            this$0.d.a(false);
        }
        EnumSet<BrazeSdkMetadata> i2 = a2.i();
        if (i2 != null) {
            this$0.n.a(i2);
        }
        x3 a4 = a2.getA();
        if (a4 != null && a4.w()) {
            this$0.o.x();
        }
        if (a2 instanceof k4) {
            this$0.q.a(((k4) a2).t());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, q0 dstr$brazeRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$brazeRequest, "$dstr$brazeRequest");
        a2 a2 = dstr$brazeRequest.getA();
        x3 a3 = a2.getA();
        if (a3 != null && a3.y()) {
            this$0.x();
            this$0.w();
            this$0.d.a(true);
        }
        k0 g2 = a2.getG();
        if (g2 != null) {
            this$0.f.a((l0) g2, false);
        }
        y3 k2 = a2.getK();
        if (k2 != null) {
            this$0.getE().a((w6) k2, false);
            if (k2.getB().has("push_token")) {
                this$0.getE().g();
                this$0.f.e();
            }
        }
        bo.app.k m2 = a2.getM();
        if (m2 != null) {
            Iterator<x1> it = m2.b().iterator();
            while (it.hasNext()) {
                this$0.c.a(it.next());
            }
        }
        x3 a4 = a2.getA();
        if (a4 != null && a4.w()) {
            this$0.o.x();
        }
        if (a2 instanceof k4) {
            this$0.q.b(((k4) a2).t());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, n5 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, m.b, 3, (Object) null);
        x1 a2 = bo.app.j.h.a(it.getA().getB());
        if (a2 != null) {
            a2.a(it.getA().getB());
        }
        if (a2 != null) {
            this$0.d.a(a2);
        }
        this$0.b.a();
        this$0.d.a(true);
        this$0.e.g();
        this$0.f.e();
        this$0.y();
        this$0.v();
        if (this$0.l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, n.b, 3, (Object) null);
            BrazeInternal.requestGeofenceRefresh(this$0.a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, o.b, 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, q5 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, p.b, 3, (Object) null);
        this$0.v.set(true);
        if (this$0.o.q()) {
            this$0.s();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, q.b, 3, (Object) null);
        }
        if (this$0.o.s()) {
            this$0.t();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, r.b, 3, (Object) null);
        }
        if (this$0.o.v()) {
            this$0.u();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, s.b, 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, m3 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.d.a(true);
        this$0.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, p5 message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "message");
        this$0.a(message);
        Braze.INSTANCE.getInstance(this$0.a).requestImmediateDataFlush();
        this$0.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, j5 dstr$serverConfig) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$serverConfig, "$dstr$serverConfig");
        i5 a2 = dstr$serverConfig.getA();
        this$0.j.configureFromServerConfig(a2);
        if (this$0.v.get()) {
            if (a2.getJ()) {
                this$0.s();
            }
            if (a2.getM()) {
                this$0.t();
            }
            if (a2.getR()) {
                this$0.u();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, r1 dstr$geofences) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$geofences, "$dstr$geofences");
        this$0.j.registerGeofences(dstr$geofences.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, h1 dstr$featureFlags) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$featureFlags, "$dstr$featureFlags");
        this$0.k.a((h2) this$0.p.a(dstr$featureFlags.getA()), (Class<h2>) FeatureFlagsUpdatedEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, j6 message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "message");
        this$0.s.set(true);
        this$0.t = message;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.I, (Throwable) null, u.b, 2, (Object) null);
        this$0.d.a(new x3.a(null, null, null, null, 15, null).c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, u6 dstr$triggeredActions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$triggeredActions, "$dstr$triggeredActions");
        this$0.g.a(dstr$triggeredActions.a());
        this$0.x();
        this$0.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, l6 dstr$triggerEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$triggerEvent, "$dstr$triggerEvent");
        this$0.g.a(dstr$triggerEvent.getA());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, d3 dstr$triggerEvent$triggeredAction$inAppMessage$userId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$triggerEvent$triggeredAction$inAppMessage$userId, "$dstr$triggerEvent$triggeredAction$inAppMessage$userId");
        t2 a2 = dstr$triggerEvent$triggeredAction$inAppMessage$userId.getA();
        y2 b2 = dstr$triggerEvent$triggeredAction$inAppMessage$userId.getB();
        IInAppMessage c2 = dstr$triggerEvent$triggeredAction$inAppMessage$userId.getC();
        String d2 = dstr$triggerEvent$triggeredAction$inAppMessage$userId.getD();
        synchronized (this$0.h) {
            if (this$0.h.b(b2)) {
                this$0.k.a((h2) new InAppMessageEvent(a2, b2, c2, d2), (Class<h2>) InAppMessageEvent.class);
                this$0.h.a(b2, DateTimeUtils.nowInSeconds());
                this$0.g.a(DateTimeUtils.nowInSeconds());
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new h(b2), 3, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, s6 dstr$originalTriggerEvent$failedTriggeredAction) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$originalTriggerEvent$failedTriggeredAction, "$dstr$originalTriggerEvent$failedTriggeredAction");
        this$0.g.a(dstr$originalTriggerEvent$failedTriggeredAction.getA(), dstr$originalTriggerEvent$failedTriggeredAction.getB());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, y dstr$timeInMs$retryCount) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$timeInMs$retryCount, "$dstr$timeInMs$retryCount");
        long a2 = dstr$timeInMs$retryCount.getA();
        int b2 = dstr$timeInMs$retryCount.getB();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.V, (Throwable) null, new k(a2, b2), 2, (Object) null);
        Job job = this$0.u;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this$0.u = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(a2), null, this$0.new l(b2, null), 2, null);
    }

    private final IEventSubscriber<x> a() {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda17
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, (x) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, x it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Job job = this$0.u;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this$0.u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, v5 storageException) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(storageException, "storageException");
        try {
            this$0.d.a(storageException);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this$0, BrazeLogger.Priority.E, e2, t.b);
        }
    }

    public final void a(h2 eventMessenger) {
        Intrinsics.checkNotNullParameter(eventMessenger, "eventMessenger");
        eventMessenger.b(q0.class, b());
        eventMessenger.b(s0.class, c());
        eventMessenger.b(n5.class, j());
        eventMessenger.b(q5.class, l());
        eventMessenger.b(p5.class, k());
        eventMessenger.b(j6.class, n());
        eventMessenger.b(j5.class, i());
        eventMessenger.b(Throwable.class, a((Semaphore) null));
        eventMessenger.b(v5.class, m());
        eventMessenger.b(u6.class, q());
        eventMessenger.b(m3.class, g());
        eventMessenger.b(r1.class, e());
        eventMessenger.b(h1.class, d());
        eventMessenger.b(l6.class, o());
        eventMessenger.b(d3.class, f());
        eventMessenger.b(s6.class, p());
        eventMessenger.b(y.class, h());
        eventMessenger.b(x.class, a());
    }

    public final IEventSubscriber<Throwable> a(final Semaphore semaphore) {
        return new IEventSubscriber() { // from class: bo.app.a1$$ExternalSyntheticLambda15
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a1.a(a1.this, semaphore, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a1 this$0, Semaphore semaphore, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (th != null) {
                try {
                    this$0.d.b(th);
                } catch (Exception e2) {
                    BrazeLogger.INSTANCE.brazelog(this$0, BrazeLogger.Priority.E, e2, a.b);
                    if (semaphore == null) {
                        return;
                    }
                }
            }
            if (semaphore == null) {
                return;
            }
            semaphore.release();
        } catch (Throwable th2) {
            if (semaphore != null) {
                semaphore.release();
            }
            throw th2;
        }
    }

    private final void a(p5 sessionSealedEvent) {
        m5 a2 = sessionSealedEvent.getA();
        x1 a3 = bo.app.j.h.a(a2.v());
        if (a3 == null) {
            return;
        }
        a3.a(a2.getB());
        this.d.a(a3);
    }
}
