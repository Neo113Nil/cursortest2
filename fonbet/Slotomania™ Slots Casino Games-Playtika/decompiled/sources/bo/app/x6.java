package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.support.BrazeLogger;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {}, d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u0010m\u001a\u00020l\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010q\u001a\u00020p\u0012\u0006\u0010s\u001a\u00020r\u0012\u0006\u0010u\u001a\u00020t\u0012\u0006\u0010w\u001a\u00020v\u0012\u0006\u0010y\u001a\u00020x\u0012\u0006\u0010z\u001a\u00020x¢\u0006\u0004\b{\u0010|J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u0003\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010M\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010W\u001a\u00020V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\\\u001a\u00020[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010a\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010f\u001a\u00020e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i¨\u0006}"}, d2 = {"Lbo/app/x6;", "Lbo/app/z2;", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/k5;", "serverConfigStorageProvider", "Lbo/app/k5;", "e", "()Lbo/app/k5;", "Lbo/app/w6;", "userCache", "Lbo/app/w6;", "b", "()Lbo/app/w6;", "(Lbo/app/w6;)V", "Lbo/app/l0;", "deviceCache", "Lbo/app/l0;", "c", "()Lbo/app/l0;", "(Lbo/app/l0;)V", "Lbo/app/b1;", "internalEventPublisher", "Lbo/app/b1;", "m", "()Lbo/app/b1;", "Lbo/app/f;", "automaticDispatchManager", "Lbo/app/f;", "o", "()Lbo/app/f;", "Lbo/app/a1;", "eventListenerFactory", "Lbo/app/a1;", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "()Lbo/app/a1;", "Lbo/app/i0;", "dataRefreshPolicyProvider", "Lbo/app/i0;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Lbo/app/i0;", "Lbo/app/u;", "brazeSessionManager", "Lbo/app/u;", "u", "()Lbo/app/u;", "Lbo/app/d1;", "eventStorageManager", "Lbo/app/d1;", "f", "()Lbo/app/d1;", "Lbo/app/l4;", "pushMaxManager", "Lbo/app/l4;", "g", "()Lbo/app/l4;", "Lbo/app/d2;", "deviceDataProvider", "Lbo/app/d2;", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "()Lbo/app/d2;", "Lbo/app/e5;", "sdkAuthenticationCache", "Lbo/app/e5;", "p", "()Lbo/app/e5;", "Lbo/app/q;", "brazeMessagingSessionManager", "Lbo/app/q;", Constants.BRAZE_PUSH_TITLE_KEY, "()Lbo/app/q;", "Lbo/app/z1;", "brazeManager", "Lbo/app/z1;", "n", "()Lbo/app/z1;", "Lbo/app/n6;", "triggerManager", "Lbo/app/n6;", "l", "()Lbo/app/n6;", "Lcom/braze/managers/BrazeGeofenceManager;", "geofenceManager", "Lcom/braze/managers/BrazeGeofenceManager;", "j", "()Lcom/braze/managers/BrazeGeofenceManager;", "Lbo/app/o;", "brazeLocationManager", "Lbo/app/o;", "i", "()Lbo/app/o;", "Lbo/app/g1;", "featureFlagsManager", "Lbo/app/g1;", "q", "()Lbo/app/g1;", "Lbo/app/m1;", "feedStorageProvider", "Lbo/app/m1;", "h", "()Lbo/app/m1;", "Lbo/app/b0;", "contentCardsStorageProvider", "Lbo/app/b0;", "k", "()Lbo/app/b0;", "Landroid/content/Context;", "applicationContext", "Lbo/app/s3;", "offlineUserStorageProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lbo/app/h2;", "externalEventPublisher", "Lbo/app/e2;", "deviceIdProvider", "Lbo/app/k2;", "registrationDataProvider", "Lbo/app/j4;", "pushDeliveryManager", "", "disableAllNetworkRequests", "disableAutomaticNetworkRequests", "<init>", "(Landroid/content/Context;Lbo/app/s3;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/h2;Lbo/app/e2;Lbo/app/k2;Lbo/app/j4;ZZ)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class x6 implements z2 {
    private final g1 A;
    private final m1 B;
    private final b0 C;
    private final n2 D;
    private final String a;
    private final String b;
    private final f5 c;
    private final u0 d;
    private final k5 e;
    public w6 f;
    public l0 g;
    private final b1 h;
    private final f i;
    private final u5 j;
    private final y0 k;
    private final a1 l;
    private final i0 m;
    private final u n;
    private final t5 o;
    private final c1 p;
    private final d1 q;
    private final l4 r;
    private final d2 s;
    private final e5 t;
    private final q u;
    private final g5 v;
    private final z1 w;
    private final n6 x;
    private final BrazeGeofenceManager y;
    private final o z;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.managers.UserDependencyManager$requestClose$1", f = "UserDependencyManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;
        private /* synthetic */ Object c;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.x6$a$a, reason: collision with other inner class name */
        static final class C0089a extends Lambda implements Function0<String> {
            public static final C0089a b = new C0089a();

            C0089a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "User cache was locked, waiting.";
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
                return "User cache notified. Continuing UserDependencyManager shutdown";
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
                return "Device cache was locked, waiting.";
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
                return "Device cache notified. Continuing UserDependencyManager shutdown";
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
                return "Exception while shutting down dispatch manager. Continuing.";
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
                return "Exception while stopping data sync. Continuing.";
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = x6.this.new a(continuation);
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
            try {
                if (x6.this.b().b()) {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, coroutineScope, BrazeLogger.Priority.I, (Throwable) null, C0089a.b, 2, (Object) null);
                    x6.this.b().c();
                    BrazeLogger.brazelog$default(brazeLogger, coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
                }
                if (x6.this.c().b()) {
                    BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger2, coroutineScope, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
                    x6.this.c().c();
                    BrazeLogger.brazelog$default(brazeLogger2, coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
                }
                x6.this.getI().a(x6.this.getH());
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(coroutineScope, BrazeLogger.Priority.W, e2, e.b);
            }
            try {
                x6.this.getM().f();
            } catch (Exception e3) {
                BrazeLogger.INSTANCE.brazelog(coroutineScope, BrazeLogger.Priority.W, e3, f.b);
            }
            x6.this.getH().a((b1) new x(), (Class<b1>) x.class);
            return Unit.INSTANCE;
        }
    }

    public x6(Context applicationContext, s3 offlineUserStorageProvider, BrazeConfigurationProvider configurationProvider, h2 externalEventPublisher, e2 deviceIdProvider, k2 registrationDataProvider, j4 pushDeliveryManager, boolean z, boolean z2) {
        Context context;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(offlineUserStorageProvider, "offlineUserStorageProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(registrationDataProvider, "registrationDataProvider");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        String a2 = offlineUserStorageProvider.a();
        this.a = a2;
        String iVar = configurationProvider.getBrazeApiKey().toString();
        this.b = iVar;
        f5 f5Var = new f5(applicationContext);
        this.c = f5Var;
        u0 u0Var = new u0(applicationContext);
        this.d = u0Var;
        this.e = new k5(applicationContext, iVar);
        this.h = new b1(f5Var);
        u5 u5Var = new u5(applicationContext, a2, iVar);
        this.j = u5Var;
        y0 y0Var = new y0(u5Var, getH());
        this.k = y0Var;
        this.m = new i0(applicationContext, getH(), new h0(applicationContext));
        b1 h = getH();
        Object systemService = applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        }
        this.n = new u(applicationContext, y0Var, h, externalEventPublisher, (AlarmManager) systemService, configurationProvider.getSessionTimeoutSeconds(), configurationProvider.isSessionStartBasedTimeoutEnabled());
        t5 t5Var = new t5(applicationContext, a2, iVar);
        this.o = t5Var;
        c1 c1Var = new c1(t5Var, getH());
        this.p = c1Var;
        this.q = new d1(c1Var);
        this.r = new l4(applicationContext, iVar, a2, getH(), getE());
        this.t = new e5(applicationContext, a2, iVar);
        this.u = new q(applicationContext, getH(), getE());
        g5 g5Var = new g5(applicationContext, a2, iVar);
        this.v = g5Var;
        this.w = new p(applicationContext, a2, iVar, getN(), getH(), configurationProvider, getE(), getQ(), z2, getU(), f5Var, getR(), pushDeliveryManager);
        this.x = new n6(applicationContext, getW(), getH(), externalEventPublisher, configurationProvider, a2, iVar);
        this.y = new BrazeGeofenceManager(applicationContext, iVar, getW(), configurationProvider, getE(), getH());
        this.z = new o(applicationContext, getW(), configurationProvider);
        this.A = new g1(applicationContext, iVar, a2, getH(), getE(), getW());
        this.B = new m1(applicationContext, a2, getW());
        this.C = new b0(applicationContext, a2, iVar, getW(), null, 16, null);
        w4 w4Var = new w4(u1.a(), getH(), externalEventPublisher, getB(), getE(), getC(), getW(), u0Var);
        this.D = w4Var;
        if (Intrinsics.areEqual(a2, "")) {
            a(new w6(applicationContext, registrationDataProvider, f5Var, null, null, 24, null));
            a(new l0(applicationContext, null, null, 6, null));
            context = applicationContext;
        } else {
            context = applicationContext;
            a(new w6(applicationContext, registrationDataProvider, f5Var, a2, iVar));
            a(new l0(context, a2, iVar));
        }
        this.s = new m0(context, configurationProvider, deviceIdProvider, c());
        r0 r0Var = new r0(b(), getS(), configurationProvider, getT(), g5Var, getH());
        getM().a(z2);
        this.i = new f(configurationProvider, getH(), w4Var, r0Var, z);
        this.l = new a1(applicationContext, getZ(), getI(), getW(), b(), c(), getX(), getX().getH(), getQ(), getY(), externalEventPublisher, configurationProvider, getC(), g5Var, getE(), getA(), pushDeliveryManager);
    }

    public void a(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        this.f = w6Var;
    }

    @Override // bo.app.z2
    public w6 b() {
        w6 w6Var = this.f;
        if (w6Var != null) {
            return w6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userCache");
        return null;
    }

    @Override // bo.app.z2
    public l0 c() {
        l0 l0Var = this.g;
        if (l0Var != null) {
            return l0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
        return null;
    }

    @Override // bo.app.z2
    /* renamed from: d, reason: from getter */
    public i0 getM() {
        return this.m;
    }

    @Override // bo.app.z2
    /* renamed from: e, reason: from getter */
    public k5 getE() {
        return this.e;
    }

    @Override // bo.app.z2
    /* renamed from: f, reason: from getter */
    public d1 getQ() {
        return this.q;
    }

    @Override // bo.app.z2
    /* renamed from: g, reason: from getter */
    public l4 getR() {
        return this.r;
    }

    @Override // bo.app.z2
    /* renamed from: h, reason: from getter */
    public m1 getB() {
        return this.B;
    }

    @Override // bo.app.z2
    /* renamed from: i, reason: from getter */
    public o getZ() {
        return this.z;
    }

    @Override // bo.app.z2
    /* renamed from: j, reason: from getter */
    public BrazeGeofenceManager getY() {
        return this.y;
    }

    @Override // bo.app.z2
    /* renamed from: k, reason: from getter */
    public b0 getC() {
        return this.C;
    }

    @Override // bo.app.z2
    /* renamed from: l, reason: from getter */
    public n6 getX() {
        return this.x;
    }

    @Override // bo.app.z2
    /* renamed from: m, reason: from getter */
    public b1 getH() {
        return this.h;
    }

    @Override // bo.app.z2
    /* renamed from: n, reason: from getter */
    public z1 getW() {
        return this.w;
    }

    @Override // bo.app.z2
    /* renamed from: o, reason: from getter */
    public f getI() {
        return this.i;
    }

    @Override // bo.app.z2
    /* renamed from: p, reason: from getter */
    public e5 getT() {
        return this.t;
    }

    @Override // bo.app.z2
    /* renamed from: q, reason: from getter */
    public g1 getA() {
        return this.A;
    }

    @Override // bo.app.z2
    /* renamed from: r, reason: from getter */
    public a1 getL() {
        return this.l;
    }

    @Override // bo.app.z2
    /* renamed from: s, reason: from getter */
    public d2 getS() {
        return this.s;
    }

    /* renamed from: t, reason: from getter */
    public q getU() {
        return this.u;
    }

    /* renamed from: u, reason: from getter */
    public u getN() {
        return this.n;
    }

    public void a(l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<set-?>");
        this.g = l0Var;
    }

    @Override // bo.app.z2
    public void a() {
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new a(null), 3, null);
    }
}
