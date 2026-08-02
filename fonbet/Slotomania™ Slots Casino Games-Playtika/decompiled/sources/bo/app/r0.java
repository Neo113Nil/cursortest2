package bo.app;

import com.braze.Braze;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB7\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u0005\u001a\u00020\rJ\u0013\u0010\b\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007R\u0011\u0010\u0013\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lbo/app/r0;", "Lbo/app/f2;", "Lbo/app/x1;", "event", "", "b", "Lbo/app/o5;", JsonStorageKeyNames.SESSION_ID_KEY, Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/h2;", "internalEventPublisher", "Lbo/app/a2;", "request", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "brazeRequest", "Lbo/app/k;", "()Lbo/app/k;", "brazeEventsForDispatch", "c", "()Z", "isNetworkRequestsOffline", "Lbo/app/w6;", "userCache", "Lbo/app/d2;", "deviceDataProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lbo/app/e5;", "sdkAuthenticationCache", "Lbo/app/g5;", "sdkMetadataCache", "<init>", "(Lbo/app/w6;Lbo/app/d2;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/e5;Lbo/app/g5;Lbo/app/h2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class r0 implements f2 {
    public static final a j = new a(null);
    private final w6 a;
    private final d2 b;
    private final BrazeConfigurationProvider c;
    private final e5 d;
    private final g5 e;
    private final Channel<a2> f;
    private final ConcurrentHashMap<String, x1> g;
    private final ConcurrentHashMap<String, x1> h;
    private final AtomicInteger i;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0010J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u0012\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u0012\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lbo/app/r0$a;", "", "Lbo/app/d2;", "deviceDataProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lbo/app/e5;", "sdkAuthenticationCache", "Lbo/app/a2;", "brazeRequest", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "MAX_EVENTS_PER_DISPATCH", "I", "getMAX_EVENTS_PER_DISPATCH$annotations", "()V", "MAX_INVALID_API_KEY_ERRORS", "getMAX_INVALID_API_KEY_ERRORS$annotations", "REQUEST_QUEUE_SIZE", "getREQUEST_QUEUE_SIZE$annotations", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.r0$a$a, reason: collision with other inner class name */
        static final class C0087a extends Lambda implements Function0<String> {
            final /* synthetic */ e5 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0087a(e5 e5Var) {
                super(0);
                this.b = e5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Adding SDK Auth token to request '" + ((Object) this.b.a()) + '\'';
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
                return "SDK Auth is disabled, not adding signature to request";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(d2 deviceDataProvider, BrazeConfigurationProvider configurationProvider, e5 sdkAuthenticationCache, a2 brazeRequest) {
            Intrinsics.checkNotNullParameter(deviceDataProvider, "deviceDataProvider");
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            Intrinsics.checkNotNullParameter(sdkAuthenticationCache, "sdkAuthenticationCache");
            Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
            String deviceId = deviceDataProvider.getDeviceId();
            if (deviceId != null) {
                brazeRequest.b(deviceId);
            }
            brazeRequest.f(configurationProvider.getBrazeApiKey().toString());
            brazeRequest.g(Constants.BRAZE_SDK_VERSION);
            brazeRequest.a(Long.valueOf(DateTimeUtils.nowInSeconds()));
            if (!configurationProvider.isSdkAuthenticationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, b.b, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0087a(sdkAuthenticationCache), 2, (Object) null);
                brazeRequest.d(sdkAuthenticationCache.a());
            }
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
            return "Network requests are offline, not adding request to queue.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ a2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a2 a2Var) {
            super(0);
            this.b = a2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("A maximum of 5 invalid api key errors reached. Device data will remain unaffected after dropping this request ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Added request to dispatcher with parameters: \n", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not add request to dispatcher as queue is full or closed. Marking as complete. Incoming Request: \n", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ x1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(x1 x1Var) {
            super(0);
            this.b = x1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Event dispatched: " + this.b.getKey() + " with uid: " + this.b.getE();
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
            return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
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
            return "Flushing pending events to dispatcher map";
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.dispatch.DispatchManager", f = "DispatchManager.kt", i = {0}, l = {170}, m = "takeRequest", n = {"this"}, s = {"L$0"})
    static final class i extends ContinuationImpl {
        Object b;
        /* synthetic */ Object c;
        int e;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return r0.this.a(this);
        }
    }

    public r0(w6 userCache, d2 deviceDataProvider, BrazeConfigurationProvider configurationProvider, e5 sdkAuthenticationCache, g5 sdkMetadataCache, h2 internalEventPublisher) {
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(deviceDataProvider, "deviceDataProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(sdkAuthenticationCache, "sdkAuthenticationCache");
        Intrinsics.checkNotNullParameter(sdkMetadataCache, "sdkMetadataCache");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        this.a = userCache;
        this.b = deviceDataProvider;
        this.c = configurationProvider;
        this.d = sdkAuthenticationCache;
        this.e = sdkMetadataCache;
        this.f = ChannelKt.Channel$default(1000, null, null, 6, null);
        this.g = new ConcurrentHashMap<>();
        this.h = new ConcurrentHashMap<>();
        this.i = new AtomicInteger(0);
        internalEventPublisher.b(h3.class, new IEventSubscriber() { // from class: bo.app.r0$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                r0.a(r0.this, (h3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(r0 this$0, h3 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.i.incrementAndGet();
    }

    public synchronized void b(x1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.h.putIfAbsent(event.getE(), event);
    }

    public final boolean c() {
        return Braze.INSTANCE.getOutboundNetworkRequestsOffline();
    }

    public final a2 d() {
        a2 a2Var = (a2) ChannelResult.m12704getOrNullimpl(this.f.mo12692tryReceivePtdJZtk());
        if (a2Var == null) {
            return null;
        }
        b(a2Var);
        return a2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        com.braze.support.BrazeLogger.brazelog$default(r5, r12, com.braze.support.BrazeLogger.Priority.I, (java.lang.Throwable) null, bo.app.r0.g.b, 2, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized k a() {
        try {
            Collection<x1> values = this.g.values();
            Intrinsics.checkNotNullExpressionValue(values, "brazeEventMap.values");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<x1> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x1 event = it.next();
                Intrinsics.checkNotNullExpressionValue(event, "event");
                linkedHashSet.add(event);
                values.remove(event);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new f(event), 3, (Object) null);
                    if (linkedHashSet.size() >= 32) {
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            return new k(linkedHashSet);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean b() {
        return !this.f.isEmpty();
    }

    public final synchronized a2 b(a2 brazeRequest) {
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        j.a(this.b, this.c, this.d, brazeRequest);
        if (brazeRequest.getU()) {
            a(brazeRequest);
        }
        if (brazeRequest instanceof k4) {
            brazeRequest.a(this.b.b());
        }
        return brazeRequest;
    }

    public synchronized void a(o5 sessionId) {
        try {
            try {
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                ConcurrentHashMap<String, x1> concurrentHashMap = this.h;
                if (concurrentHashMap.isEmpty()) {
                    return;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
                Collection<x1> values = concurrentHashMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "events.values");
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    ((x1) it.next()).a(sessionId);
                }
                this.g.putAll(concurrentHashMap);
                Set<String> keySet = concurrentHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "events.keys");
                Iterator<T> it2 = keySet.iterator();
                while (it2.hasNext()) {
                    this.h.remove((String) it2.next());
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // bo.app.f2
    public synchronized void a(x1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.g.putIfAbsent(event.getE(), event);
    }

    public void a(h2 internalEventPublisher, a2 request) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(request, "request");
        if (c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
            return;
        }
        if (this.i.get() >= 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(request), 2, (Object) null);
            return;
        }
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(request.l());
        request.a(internalEventPublisher);
        if (ChannelResult.m12709isSuccessimpl(this.f.mo10989trySendJP2dKIU(request))) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(prettyPrintedString), 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.E, (Throwable) null, new e(prettyPrintedString), 2, (Object) null);
            request.b(internalEventPublisher);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation<? super a2> continuation) {
        i iVar;
        int i2;
        r0 r0Var;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.e = i3 - Integer.MIN_VALUE;
                Object obj = iVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = iVar.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<a2> channel = this.f;
                    iVar.b = this;
                    iVar.e = 1;
                    obj = channel.receive(iVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r0Var = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0Var = (r0) iVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                return r0Var.b((a2) obj);
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = iVar.e;
        if (i2 != 0) {
        }
        return r0Var.b((a2) obj2);
    }

    public final synchronized void a(a2 brazeRequest) {
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        brazeRequest.c(this.b.getE());
        brazeRequest.a(this.c.getSdkFlavor());
        brazeRequest.e(this.b.a());
        k0 c2 = this.b.c();
        brazeRequest.a(c2);
        if (c2 != null && c2.getM()) {
            this.a.b(NotificationSubscriptionType.OPTED_IN);
        }
        if (c2.v()) {
            this.a.g();
        }
        brazeRequest.a(this.a.a());
        k a2 = a();
        brazeRequest.a(a2);
        if (a2.a()) {
            brazeRequest.a(this.e.b(this.c.getSdkMetadata()));
        }
    }
}
