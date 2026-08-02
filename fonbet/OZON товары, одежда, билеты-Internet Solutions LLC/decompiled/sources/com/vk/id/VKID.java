package com.vk.id;

import A30.f;
import B30.o;
import Je.InterfaceC3394a;
import Je.e;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import aa.C4987a;
import aa.C4988b;
import aa.C4989c;
import android.content.Context;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.auth.VKIDAuthCallback;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.exchangetoken.VKIDTokenExchanger;
import com.vk.id.groupsubscription.GroupSubscriptionLimit;
import com.vk.id.internal.auth.AuthCallbacksHolder;
import com.vk.id.internal.auth.AuthProvidersChooser;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.di.VKIDDeps;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.id.internal.user.UserDataFetcher;
import com.vk.id.logger.InternalVKIDAndroidLogcatLogEngine;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import com.vk.id.logger.LogEngine;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.refresh.VKIDTokenRefresher;
import com.vk.id.refreshuser.VKIDUserRefresher;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import com.vk.id.storage.InternalVKIDTokenStorage;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 s2\u00020\u0001:\u0001sB\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000fJ\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001eR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001eR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001eR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001eR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001eR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001eR\u001a\u00107\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u001eR \u0010>\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR \u0010E\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010C\u001a\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010O\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010C\u001a\u0004\bQ\u0010RR(\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0T8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010C\u001a\u0004\bX\u0010YR\"\u0010\\\u001a\u0004\u0018\u00010[8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010C\u001a\u0004\b^\u0010_R \u0010b\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bb\u0010c\u0012\u0004\bf\u0010C\u001a\u0004\bd\u0010eR\u001a\u0010j\u001a\u00020;8FX\u0087\u0004¢\u0006\f\u0012\u0004\bi\u0010C\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020K8FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010C\u001a\u0004\bk\u0010lR\u0013\u0010r\u001a\u0004\u0018\u00010o8F¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/vk/id/VKID;", "", "Lcom/vk/id/internal/di/VKIDDeps;", "deps", "<init>", "(Lcom/vk/id/internal/di/VKIDDeps;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lcom/vk/id/auth/VKIDAuthCallback;", "callback", "Lcom/vk/id/auth/VKIDAuthParams;", "params", "", "authorize", "(Landroidx/lifecycle/J;Lcom/vk/id/auth/VKIDAuthCallback;Lcom/vk/id/auth/VKIDAuthParams;)V", "(Lcom/vk/id/auth/VKIDAuthCallback;Lcom/vk/id/auth/VKIDAuthParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LSc/r;", "Lcom/vk/id/VKIDUser;", "fetchUserData-IoAF18A", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "fetchUserData", "LJe/a;", "requestMutex", "LJe/a;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "LSc/j;", "Lcom/vk/id/internal/auth/AuthProvidersChooser;", "authProvidersChooser", "LSc/j;", "Lcom/vk/id/AuthOptionsCreator;", "authOptionsCreator", "Lcom/vk/id/AuthOptionsCreator;", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "authCallbacksHolder", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "Lcom/vk/id/AuthResultHandler;", "authResultHandler", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "vkSilentAuthInfoProvider", "Lcom/vk/id/internal/user/UserDataFetcher;", "userDataFetcher", "Lcom/vk/id/refresh/VKIDTokenRefresher;", "tokenRefresher", "Lcom/vk/id/exchangetoken/VKIDTokenExchanger;", "tokenExchanger", "Lcom/vk/id/refreshuser/VKIDUserRefresher;", "userRefresher", "Lcom/vk/id/logout/VKIDLoggerOut;", "loggerOut", "Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker", "Lcom/vk/id/tracking/core/PerformanceTracker;", "getPerformanceTracker$vkid_release", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "groupSubscriptionApiServiceInternal", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "getTokenStorage", "()Lcom/vk/id/storage/InternalVKIDTokenStorage;", "getTokenStorage$annotations", "()V", "Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter", "Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter$annotations", "Lkotlin/Function0;", "", "clientIdProvider", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getContext$annotations", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/Locale;", "internalVKIDLocale", "Ljava/util/concurrent/atomic/AtomicReference;", "getInternalVKIDLocale", "()Ljava/util/concurrent/atomic/AtomicReference;", "getInternalVKIDLocale$annotations", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "groupSubscriptionLimit", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getGroupSubscriptionLimit", "()Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getGroupSubscriptionLimit$annotations", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "prefsStorage", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "getPrefsStorage", "()Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "getPrefsStorage$annotations", "getGroupSubscriptionApiService", "()Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "getGroupSubscriptionApiService$annotations", "groupSubscriptionApiService", "getClientId", "()Ljava/lang/String;", "getClientId$annotations", "clientId", "Lcom/vk/id/AccessToken;", "getAccessToken", "()Lcom/vk/id/AccessToken;", "accessToken", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKID {
    private static volatile VKID _instance;

    @NotNull
    private final AuthCallbacksHolder authCallbacksHolder;

    @NotNull
    private final AuthOptionsCreator authOptionsCreator;

    @NotNull
    private final InterfaceC4008j<AuthProvidersChooser> authProvidersChooser;

    @NotNull
    private final InterfaceC4008j<AuthResultHandler> authResultHandler;

    @NotNull
    private final Function0<String> clientIdProvider;

    @NotNull
    private final Context context;

    @NotNull
    private final CrashReporter crashReporter;

    @NotNull
    private final VKIDCoroutinesDispatchers dispatchers;

    @NotNull
    private final InterfaceC4008j<InternalVKIDGroupSubscriptionApiContract> groupSubscriptionApiServiceInternal;
    private final GroupSubscriptionLimit groupSubscriptionLimit;

    @NotNull
    private final AtomicReference<Locale> internalVKIDLocale;

    @NotNull
    private final InternalVKIDLogger logger;

    @NotNull
    private final InterfaceC4008j<VKIDLoggerOut> loggerOut;

    @NotNull
    private final PerformanceTracker performanceTracker;

    @NotNull
    private final InternalVKIDPreferencesStorage prefsStorage;

    @NotNull
    private final InterfaceC3394a requestMutex;

    @NotNull
    private final InterfaceC4008j<VKIDTokenExchanger> tokenExchanger;

    @NotNull
    private final InterfaceC4008j<VKIDTokenRefresher> tokenRefresher;

    @NotNull
    private final InternalVKIDTokenStorage tokenStorage;

    @NotNull
    private final InterfaceC4008j<UserDataFetcher> userDataFetcher;

    @NotNull
    private final InterfaceC4008j<VKIDUserRefresher> userRefresher;

    @NotNull
    private final InterfaceC4008j<SilentAuthInfoProvider> vkSilentAuthInfoProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static LogEngine logEngine = new InternalVKIDAndroidLogcatLogEngine();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0007\u0010\rJC\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/vk/id/VKID$Companion;", "", "<init>", "()V", "Lcom/vk/id/VKID;", "vkid", "", "init", "(Lcom/vk/id/VKID;)V", "Landroid/content/Context;", "context", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "groupSubscriptionLimit", "(Landroid/content/Context;Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;)V", "", "isFlutter", "", "captchaRedirectUri", "forceError14", "forceHitmanChallenge", "(Landroid/content/Context;ZLjava/lang/String;ZZLcom/vk/id/groupsubscription/GroupSubscriptionLimit;)V", "getInstance", "()Lcom/vk/id/VKID;", "instance", "_instance", "Lcom/vk/id/VKID;", "analyticsDebugTracker", "Ljava/lang/Object;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void init(VKID vkid) {
            synchronized (this) {
                if (VKID._instance != null) {
                    throw new IllegalStateException("You've already initialized VKID");
                }
                VKID._instance = vkid;
                Unit unit = Unit.f71690a;
            }
        }

        public static /* synthetic */ void init$default(Companion companion, Context context, GroupSubscriptionLimit groupSubscriptionLimit, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                groupSubscriptionLimit = new GroupSubscriptionLimit(0, 0, 3, null);
            }
            companion.init(context, groupSubscriptionLimit);
        }

        @NotNull
        public final VKID getInstance() {
            VKID vkid;
            VKID vkid2 = VKID._instance;
            if (vkid2 != null) {
                return vkid2;
            }
            synchronized (this) {
                vkid = VKID._instance;
            }
            if (vkid != null) {
                return vkid;
            }
            throw new IllegalStateException("VKID is not initialized");
        }

        private Companion() {
        }

        public final void init(@NotNull Context context, GroupSubscriptionLimit groupSubscriptionLimit) {
            Intrinsics.checkNotNullParameter(context, "context");
            init(context, false, null, false, false, groupSubscriptionLimit);
        }

        public final void init(@NotNull Context context, boolean isFlutter, String captchaRedirectUri, boolean forceError14, boolean forceHitmanChallenge, GroupSubscriptionLimit groupSubscriptionLimit) {
            Intrinsics.checkNotNullParameter(context, "context");
            init(new VKID(new VKIDDepsProd(context, isFlutter, captchaRedirectUri, forceError14, forceHitmanChallenge, groupSubscriptionLimit)));
        }
    }

    public VKID(@NotNull VKIDDeps deps) {
        Intrinsics.checkNotNullParameter(deps, "deps");
        this.requestMutex = e.a();
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("VKID", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("VKID");
        this.internalVKIDLocale = new AtomicReference<>(null);
        this.authProvidersChooser = deps.getAuthProvidersChooser();
        this.authOptionsCreator = deps.getAuthOptionsCreator();
        this.authCallbacksHolder = deps.getAuthCallbacksHolder();
        this.authResultHandler = deps.getAuthResultHandler();
        this.dispatchers = deps.getDispatchers();
        this.vkSilentAuthInfoProvider = deps.getVkSilentAuthInfoProvider();
        this.userDataFetcher = deps.getUserDataFetcher();
        this.tokenRefresher = deps.getTokenRefresher();
        this.tokenExchanger = deps.getTokenExchanger();
        this.userRefresher = deps.getUserRefresher();
        this.loggerOut = deps.getLoggerOut();
        this.tokenStorage = deps.getTokenStorage();
        CrashReporter crashReporter = deps.getCrashReporter();
        this.crashReporter = crashReporter;
        this.performanceTracker = deps.getPerformanceTracker();
        this.groupSubscriptionApiServiceInternal = deps.getGroupSubscriptionApiService();
        this.clientIdProvider = new C4987a(deps, 0);
        this.context = deps.getContext();
        this.groupSubscriptionLimit = deps.getGroupSubscriptionLimit();
        this.prefsStorage = deps.getEncryptedSharedPreferencesStorage().getValue();
        crashReporter.runReportingCrashes(new f(1), new C4988b(0, deps, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessToken _get_accessToken_$lambda$14(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessToken _get_accessToken_$lambda$15(VKID vkid) {
        return vkid.tokenStorage.getAccessToken$vkid_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(VKIDDeps vKIDDeps) {
        return vKIDDeps.getServiceCredentials().getValue().getClientID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(VKIDDeps vKIDDeps, VKID vkid) {
        String str;
        VKIDAnalytics.Companion companion = VKIDAnalytics.INSTANCE;
        companion.addTracker(vKIDDeps.getStatTracker());
        companion.addTracker(vKIDDeps.getTrackingTracker());
        vkid.logger.info(h.F0("\n                    |VKID initialized\n                    |Version name: 2.9.0\n                    |CI build: " + BuildConfig.CI_BUILD_NUMBER + " \n                "));
        GroupSubscriptionLimit groupSubscriptionLimit = vKIDDeps.getGroupSubscriptionLimit();
        if (groupSubscriptionLimit != null) {
            str = groupSubscriptionLimit.getMaxSubscriptionsToShow() + ";" + groupSubscriptionLimit.getPeriodInDays();
        } else {
            str = null;
        }
        companion.trackEvent("vkid_sdk_init", new VKIDAnalytics.EventParam("wrapper_sdk_type", vKIDDeps.getIsFlutter() ? "flutter" : DevicePublicKeyStringDef.NONE, null, 4, null), new VKIDAnalytics.EventParam("limit_settings", str, null, 4, null));
        VKCaptcha.INSTANCE.init(vKIDDeps.getAppContext());
        return Unit.f71690a;
    }

    public final void authorize(@NotNull J lifecycleOwner, @NotNull VKIDAuthCallback callback, @NotNull VKIDAuthParams params) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(params, "params");
        C10727i.c(K.a(lifecycleOwner), null, null, new VKID$authorize$2(this, callback, params, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: fetchUserData-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m45fetchUserDataIoAF18A(@NotNull d<? super r<VKIDUser>> dVar) {
        VKID$fetchUserData$1 vKID$fetchUserData$1;
        int i11;
        if (dVar instanceof VKID$fetchUserData$1) {
            vKID$fetchUserData$1 = (VKID$fetchUserData$1) dVar;
            int i12 = vKID$fetchUserData$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vKID$fetchUserData$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = vKID$fetchUserData$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = vKID$fetchUserData$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    CrashReporter crashReporter = this.crashReporter;
                    VKID$fetchUserData$2 vKID$fetchUserData$2 = new VKID$fetchUserData$2(null);
                    VKID$fetchUserData$3 vKID$fetchUserData$3 = new VKID$fetchUserData$3(this, null);
                    vKID$fetchUserData$1.label = 1;
                    obj = crashReporter.runReportingCrashesSuspend(vKID$fetchUserData$2, vKID$fetchUserData$3, vKID$fetchUserData$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((r) obj).getF26106a();
            }
        }
        vKID$fetchUserData$1 = new VKID$fetchUserData$1(this, dVar);
        Object obj2 = vKID$fetchUserData$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = vKID$fetchUserData$1.label;
        if (i11 != 0) {
        }
        return ((r) obj2).getF26106a();
    }

    public final AccessToken getAccessToken() {
        return (AccessToken) this.crashReporter.runReportingCrashes(new C4989c(0), new o(this, 3));
    }

    @NotNull
    public final String getClientId() {
        return this.clientIdProvider.invoke();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final CrashReporter getCrashReporter() {
        return this.crashReporter;
    }

    @NotNull
    public final InternalVKIDGroupSubscriptionApiContract getGroupSubscriptionApiService() {
        return this.groupSubscriptionApiServiceInternal.getValue();
    }

    public final GroupSubscriptionLimit getGroupSubscriptionLimit() {
        return this.groupSubscriptionLimit;
    }

    @NotNull
    public final AtomicReference<Locale> getInternalVKIDLocale() {
        return this.internalVKIDLocale;
    }

    @NotNull
    /* renamed from: getPerformanceTracker$vkid_release, reason: from getter */
    public final PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    @NotNull
    public final InternalVKIDPreferencesStorage getPrefsStorage() {
        return this.prefsStorage;
    }

    @NotNull
    public final InternalVKIDTokenStorage getTokenStorage() {
        return this.tokenStorage;
    }

    public final Object authorize(@NotNull VKIDAuthCallback vKIDAuthCallback, @NotNull VKIDAuthParams vKIDAuthParams, @NotNull d<? super Unit> dVar) {
        Object runReportingCrashesSuspend = this.crashReporter.runReportingCrashesSuspend(new VKID$authorize$5(null), new VKID$authorize$6(vKIDAuthParams, this, vKIDAuthCallback, null), dVar);
        return runReportingCrashesSuspend == Wc.a.COROUTINE_SUSPENDED ? runReportingCrashesSuspend : Unit.f71690a;
    }
}
