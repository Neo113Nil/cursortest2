package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0006H\u0007J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\u0006\u0010\u0013\u001a\u00020\u0006J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0007H\u0007R\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u0005\u0010\u001e¨\u0006%"}, d2 = {"Lbo/app/i0;", "", "", "initialDelayMs", "Lkotlinx/coroutines/Job;", Constants.BRAZE_PUSH_CONTENT_KEY, "", "Lbo/app/h2;", "eventPublisher", "", "throwable", "b", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "e", "f", "c", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "g", "eventManager", "currentIntervalMs", "J", "()J", "setCurrentIntervalMs$android_sdk_base_release", "(J)V", "value", "isSyncPolicyDisabled", "Z", "()Z", "(Z)V", "Landroid/content/Context;", "context", "Lbo/app/h0;", "dataSyncConfigurationProvider", "<init>", "(Landroid/content/Context;Lbo/app/h2;Lbo/app/h0;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class i0 {
    public static final c n = new c(null);
    private final Context a;
    private final h0 b;
    private BroadcastReceiver c;
    private ConnectivityManager.NetworkCallback d;
    private final f1 e;
    private r5 f;
    private long g;
    private volatile boolean h;
    private final ConnectivityManager i;
    private q3 j;
    private Job k;
    private int l;
    private boolean m;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"bo/app/i0$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "onCapabilitiesChanged", "onLost", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            i0.this.a(networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            Network activeNetwork = i0.this.i.getActiveNetwork();
            i0 i0Var = i0.this;
            i0Var.a(i0Var.i.getNetworkCapabilities(activeNetwork));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"bo/app/i0$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "", "onReceive", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b extends BroadcastReceiver {
        final /* synthetic */ h2 b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.braze.dispatch.DataSyncPolicyProvider$2$onReceive$1", f = "DataSyncPolicyProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int b;
            private /* synthetic */ Object c;
            final /* synthetic */ i0 d;
            final /* synthetic */ Intent e;
            final /* synthetic */ h2 f;
            final /* synthetic */ BroadcastReceiver.PendingResult g;

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: bo.app.i0$b$a$a, reason: collision with other inner class name */
            static final class C0076a extends Lambda implements Function0<String> {
                public static final C0076a b = new C0076a();

                C0076a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Retrieving connectivity event data in background";
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: bo.app.i0$b$a$b, reason: collision with other inner class name */
            static final class C0077b extends Lambda implements Function0<String> {
                public static final C0077b b = new C0077b();

                C0077b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to process connectivity event.";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i0 i0Var, Intent intent, h2 h2Var, BroadcastReceiver.PendingResult pendingResult, Continuation<? super a> continuation) {
                super(2, continuation);
                this.d = i0Var;
                this.e = intent;
                this.f = h2Var;
                this.g = pendingResult;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.d, this.e, this.f, this.g, continuation);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, coroutineScope, BrazeLogger.Priority.V, (Throwable) null, C0076a.b, 2, (Object) null);
                try {
                    i0 i0Var = this.d;
                    i0Var.j = w.a(this.e, i0Var.i);
                    this.d.c();
                } catch (Exception e) {
                    BrazeLogger.INSTANCE.brazelog(coroutineScope, BrazeLogger.Priority.E, e, C0077b.b);
                    this.d.a(this.f, e);
                }
                this.g.finish();
                return Unit.INSTANCE;
            }
        }

        b(h2 h2Var) {
            this.b = h2Var;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new a(i0.this, intent, this.b, goAsync(), null), 3, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lbo/app/i0$c;", "", "", "MAX_CONSECUTIVE_SDK_AUTH_FAILURES", "I", "getMAX_CONSECUTIVE_SDK_AUTH_FAILURES$annotations", "()V", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q3.values().length];
            iArr[q3.NONE.ordinal()] = 1;
            iArr[q3.BAD.ordinal()] = 2;
            iArr[q3.GREAT.ordinal()] = 3;
            iArr[q3.GOOD.ordinal()] = 4;
            a = iArr;
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
            return "Received network error event. Backing off.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Received successful request flush. Default flush interval reset to ", Long.valueOf(i0.this.getG()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ i0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j, i0 i0Var) {
            super(0);
            this.b = j;
            this.c = i0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Kicking off the Sync Job. initialDelaysMs: " + this.b + ": currentIntervalMs " + this.c.getG() + " ms";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.dispatch.DataSyncPolicyProvider$kickoffSyncJob$2", f = "DataSyncPolicyProvider.kt", i = {0, 0, 1, 1}, l = {171, 175}, m = "invokeSuspend", n = {"$this$launch", "loopDelayMs", "$this$launch", "loopDelayMs"}, s = {"L$0", "J$0", "L$0", "J$0"})
    static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        long b;
        int c;
        private /* synthetic */ Object d;
        final /* synthetic */ long f;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Requesting data flush from automatic sync policy";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = i0.this.new h(this.f, continuation);
            hVar.d = obj;
            return hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r3, r12) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0068 -> B:6:0x0017). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.d;
                long g = i0.this.getG();
                long j2 = this.f;
                this.d = coroutineScope;
                this.b = g;
                this.c = 1;
                if (DelayKt.delay(j2, this) != coroutine_suspended) {
                    j = g;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                j = this.b;
                coroutineScope = (CoroutineScope) this.d;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.b;
                coroutineScope = (CoroutineScope) this.d;
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = coroutineScope;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, coroutineScope2, BrazeLogger.Priority.V, (Throwable) null, a.b, 2, (Object) null);
                Braze.INSTANCE.getInstance(i0.this.a).requestImmediateDataFlush();
                coroutineScope = coroutineScope2;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    return Unit.INSTANCE;
                }
                this.d = coroutineScope;
                this.b = j;
                this.c = 2;
            }
            Braze.INSTANCE.getInstance(i0.this.a).requestImmediateDataFlush();
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Data flush interval is " + i0.this.getG() + " ms. Not scheduling a proceeding data flush.";
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
            return "Failed to log throwable.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "recalculateDispatchState called with session state: " + i0.this.f + " lastNetworkLevel: " + i0.this.j;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Flush interval was too low (" + i0.this.getG() + "), moving to minimum of 1000 ms";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("currentIntervalMs: ", Long.valueOf(i0.this.getG()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ i0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j, i0 i0Var) {
            super(0);
            this.b = j;
            this.c = i0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Data flush interval has changed from " + this.b + " ms to " + this.c.getG() + " ms after connectivity state change to: " + this.c.j + " and session state: " + this.c.f;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting new sync runnable with delay " + this.b + " ms";
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
            return "The data sync policy is already running. Ignoring request.";
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
            return "Data sync started";
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
            return "The data sync policy is not running. Ignoring request.";
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
            return "Data sync stopped";
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
            return "Failed to unregister Connectivity callback";
        }
    }

    public i0(Context context, h2 eventPublisher, h0 dataSyncConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(dataSyncConfigurationProvider, "dataSyncConfigurationProvider");
        this.a = context;
        this.b = dataSyncConfigurationProvider;
        this.e = new f1((int) TimeUnit.MINUTES.toMillis(5L), 0, 2, null);
        this.f = r5.NO_SESSION;
        this.g = -1L;
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.i = (ConnectivityManager) systemService;
        this.j = q3.NONE;
        if (Build.VERSION.SDK_INT >= 30) {
            this.d = new a();
        } else {
            this.c = new b(eventPublisher);
        }
        a(eventPublisher);
    }

    public final synchronized boolean e() {
        try {
            try {
                if (this.h) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, p.b, 3, (Object) null);
                    return false;
                }
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, q.b, 3, (Object) null);
                    d();
                    b(this.g);
                    this.h = true;
                    return true;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized boolean f() {
        if (!this.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, r.b, 3, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, s.b, 3, (Object) null);
        a();
        g();
        this.h = false;
        return true;
    }

    public final void g() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                this.a.unregisterReceiver(this.c);
                return;
            }
            ConnectivityManager connectivityManager = this.i;
            ConnectivityManager.NetworkCallback networkCallback = this.d;
            if (networkCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                networkCallback = null;
            }
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, t.b);
        }
    }

    /* renamed from: b, reason: from getter */
    public final long getG() {
        return this.g;
    }

    public final void c() {
        long j2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new k(), 2, (Object) null);
        long j3 = this.g;
        if (this.f == r5.NO_SESSION || this.m || this.l >= 50) {
            this.g = -1L;
        } else {
            int i2 = d.a[this.j.ordinal()];
            if (i2 == 1) {
                j2 = -1;
            } else if (i2 == 2) {
                j2 = this.b.a();
            } else if (i2 == 3) {
                j2 = this.b.c();
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                j2 = this.b.b();
            }
            this.g = j2;
            if (j2 != -1 && j2 < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new l(), 2, (Object) null);
                this.g = 1000L;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new m(), 2, (Object) null);
        if (j3 != this.g) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new n(j3, this), 3, (Object) null);
            b(this.g);
        }
    }

    public final void d() {
        if (Build.VERSION.SDK_INT < 30) {
            this.a.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        ConnectivityManager connectivityManager = this.i;
        ConnectivityManager.NetworkCallback networkCallback = this.d;
        if (networkCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
            networkCallback = null;
        }
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
        a(this.i.getNetworkCapabilities(this.i.getActiveNetwork()));
    }

    private final void b(long initialDelayMs) {
        a();
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new o(initialDelayMs), 3, (Object) null);
            this.k = a(initialDelayMs);
        }
    }

    public final synchronized void a(boolean z) {
        this.m = z;
        c();
        if (z) {
            f();
        } else {
            e();
        }
    }

    private final Job a(long initialDelayMs) {
        Job launch$default;
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g(initialDelayMs, this), 2, (Object) null);
            launch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new h(initialDelayMs, null), 3, null);
            return launch$default;
        }
        Braze.INSTANCE.getInstance(this.a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(), 3, (Object) null);
        return null;
    }

    private final void a() {
        Job job = this.k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(h2 eventPublisher, Throwable throwable) {
        try {
            eventPublisher.a((h2) throwable, (Class<h2>) Throwable.class);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, j.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkCapabilities networkCapabilities) {
        this.j = w.a(networkCapabilities);
        c();
    }

    public final void a(h2 eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        eventManager.b(q5.class, new IEventSubscriber() { // from class: bo.app.i0$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                i0.a(i0.this, (q5) obj);
            }
        });
        eventManager.b(s5.class, new IEventSubscriber() { // from class: bo.app.i0$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                i0.a(i0.this, (s5) obj);
            }
        });
        eventManager.b(y4.class, new IEventSubscriber() { // from class: bo.app.i0$$ExternalSyntheticLambda2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                i0.a(i0.this, (y4) obj);
            }
        });
        eventManager.b(z4.class, new IEventSubscriber() { // from class: bo.app.i0$$ExternalSyntheticLambda3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                i0.a(i0.this, (z4) obj);
            }
        });
        eventManager.b(l5.class, new IEventSubscriber() { // from class: bo.app.i0$$ExternalSyntheticLambda4
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                i0.a(i0.this, (l5) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i0 this$0, q5 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f = r5.OPEN_SESSION;
        this$0.l = 0;
        this$0.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i0 this$0, s5 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f = r5.NO_SESSION;
        this$0.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i0 this$0, y4 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, e.b, 3, (Object) null);
        this$0.b(this$0.g + this$0.e.a((int) r8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i0 this$0, z4 it) {
        i0 i0Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.e.b()) {
            this$0.e.c();
            i0Var = this$0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i0Var, (BrazeLogger.Priority) null, (Throwable) null, this$0.new f(), 3, (Object) null);
            i0Var.b(i0Var.g);
        } else {
            i0Var = this$0;
        }
        i0Var.l = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i0 this$0, l5 dstr$responseError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dstr$responseError, "$dstr$responseError");
        if (dstr$responseError.getA() instanceof d5) {
            this$0.l++;
            this$0.c();
        }
    }
}
