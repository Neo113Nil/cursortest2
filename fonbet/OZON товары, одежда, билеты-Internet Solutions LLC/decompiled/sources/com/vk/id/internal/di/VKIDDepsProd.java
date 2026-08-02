package com.vk.id.internal.di;

import B30.o;
import B50.e;
import B50.n;
import B80.c;
import B90.C2620w;
import B90.m0;
import F90.d;
import J90.i;
import N50.a;
import Q90.l;
import Sc.InterfaceC4008j;
import Sc.k;
import T7.Z;
import U50.m;
import We.B;
import We.E;
import aa.C4987a;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.vk.id.AuthOptionsCreator;
import com.vk.id.AuthResultHandler;
import com.vk.id.TokensHandler;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.analytics.stat.StatTracker;
import com.vk.id.exchangetoken.VKIDTokenExchanger;
import com.vk.id.fetchuser.VKIDUserInfoFetcher;
import com.vk.id.groupsubscription.GroupSubscriptionLimit;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.internal.auth.AuthCallbacksHolder;
import com.vk.id.internal.auth.AuthProvidersChooser;
import com.vk.id.internal.auth.AuthProvidersChooserDefault;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.app.TrustedProvidersCache;
import com.vk.id.internal.auth.device.DeviceIdPrefs;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.auth.pkce.PkceGeneratorSHA256;
import com.vk.id.internal.captcha.ForceError14Interceptor;
import com.vk.id.internal.captcha.HitmanChallengeInterceptor;
import com.vk.id.internal.concurrent.CoroutinesDispatchersProd;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.context.AndroidPackageManager;
import com.vk.id.internal.context.DefaultActivityStarter;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.id.internal.ipc.VkSilentAuthInfoProvider;
import com.vk.id.internal.state.StateGenerator;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import com.vk.id.internal.user.UserDataFetcher;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.network.InternalVKIDApiContract;
import com.vk.id.network.InternalVKIDRealApi;
import com.vk.id.network.OkHttpClientProvider;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApi;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService;
import com.vk.id.refresh.VKIDTokenRefresher;
import com.vk.id.refreshuser.VKIDUserRefresher;
import com.vk.id.storage.InternalVKIDEncryptedSharedPreferencesStorage;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import com.vk.id.storage.InternalVKIDTokenStorage;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import com.vk.id.tracking.tracer.TrackingDeps;
import d70.f;
import d70.g;
import d80.C6101b;
import fa.b;
import i70.C7018a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010 R\u001a\u00105\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010 \u001a\u0004\bD\u0010ER \u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010 \u001a\u0004\bI\u0010\"R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010 R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010 R \u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010 \u001a\u0004\bP\u0010\"R \u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010 \u001a\u0004\bS\u0010\"R \u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010 \u001a\u0004\bV\u0010\"R\u001b\u0010[\u001a\u00020W8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bX\u0010 \u001a\u0004\bY\u0010ZR\u001a\u0010]\u001a\u00020\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010 \u001a\u0004\bc\u0010\"R \u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010 \u001a\u0004\bf\u0010\"R \u0010h\u001a\b\u0012\u0004\u0012\u00020g0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010 \u001a\u0004\bi\u0010\"R \u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010 \u001a\u0004\bl\u0010\"R \u0010n\u001a\b\u0012\u0004\u0012\u00020m0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010 \u001a\u0004\bo\u0010\"R \u0010q\u001a\b\u0012\u0004\u0012\u00020p0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010 \u001a\u0004\br\u0010\"R\u001b\u0010w\u001a\u00020s8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bt\u0010 \u001a\u0004\bu\u0010vR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020x0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010 R\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020z0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010 R\u001c\u0010\u0080\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010 \u001a\u0004\b~\u0010\u007fR$\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010 \u001a\u0005\b\u0083\u0001\u0010\"R$\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010 \u001a\u0005\b\u0086\u0001\u0010\"R\u001d\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010 R\u001d\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010 R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010 \u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010 \u001a\u0005\b\u0092\u0001\u0010\"R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0097\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u0099\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/vk/id/internal/di/VKIDDepsProd;", "Lcom/vk/id/internal/di/VKIDDeps;", "Landroid/content/Context;", "appContext", "", "isFlutter", "", "captchaRedirectUri", "forceError14", "forceHitmanChallenge", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "groupSubscriptionLimit", "<init>", "(Landroid/content/Context;ZLjava/lang/String;ZZLcom/vk/id/groupsubscription/GroupSubscriptionLimit;)V", "Landroid/content/ComponentName;", "componentName", "Landroid/content/pm/ActivityInfo;", "getActivityInfo", "(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "Z", "()Z", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getGroupSubscriptionLimit", "()Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "context", "getContext", "LSc/j;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "LSc/j;", "getServiceCredentials", "()LSc/j;", "Lcom/vk/id/tracking/tracer/TrackingDeps;", "trackingDeps$delegate", "getTrackingDeps", "()Lcom/vk/id/tracking/tracer/TrackingDeps;", "trackingDeps", "Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter$delegate", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter", "Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker$delegate", "getPerformanceTracker", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "silentAuthServicesProvider", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "vkidPackageManager", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "getVkidPackageManager", "()Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "activityStarter", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "getActivityStarter", "()Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "", "LWe/B;", "additionalInterceptors", "Ljava/util/List;", "LWe/E;", "okHttpClient$delegate", "getOkHttpClient", "()LWe/E;", "okHttpClient", "Lcom/vk/id/network/InternalVKIDApiContract;", "api", "getApi", "Lcom/vk/id/internal/api/VKIDApiService;", "apiService", "Lcom/vk/id/internal/auth/app/TrustedProvidersCache;", "trustedProvidersCache", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "vkSilentAuthInfoProvider", "getVkSilentAuthInfoProvider", "Lcom/vk/id/internal/user/UserDataFetcher;", "userDataFetcher", "getUserDataFetcher", "Lcom/vk/id/internal/auth/AuthProvidersChooser;", "authProvidersChooser", "getAuthProvidersChooser", "Lcom/vk/id/AuthOptionsCreator;", "authOptionsCreator$delegate", "getAuthOptionsCreator", "()Lcom/vk/id/AuthOptionsCreator;", "authOptionsCreator", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "authCallbacksHolder", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "getAuthCallbacksHolder", "()Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "Lcom/vk/id/AuthResultHandler;", "authResultHandler", "getAuthResultHandler", "Lcom/vk/id/refresh/VKIDTokenRefresher;", "tokenRefresher", "getTokenRefresher", "Lcom/vk/id/exchangetoken/VKIDTokenExchanger;", "tokenExchanger", "getTokenExchanger", "Lcom/vk/id/refreshuser/VKIDUserRefresher;", "userRefresher", "getUserRefresher", "Lcom/vk/id/logout/VKIDLoggerOut;", "loggerOut", "getLoggerOut", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "encryptedSharedPreferencesStorage", "getEncryptedSharedPreferencesStorage", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage$delegate", "getTokenStorage", "()Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;", "userInfoFetcher", "Lcom/vk/id/TokensHandler;", "tokensHandler", "Lcom/vk/id/internal/state/StateGenerator;", "stateGenerator$delegate", "getStateGenerator", "()Lcom/vk/id/internal/state/StateGenerator;", "stateGenerator", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "getPrefsStore", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "deviceIdStorage", "getDeviceIdStorage", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;", "pkceGenerator", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "groupSubscriptionApi$delegate", "getGroupSubscriptionApi", "()Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "groupSubscriptionApi", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "groupSubscriptionApiService", "getGroupSubscriptionApiService", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "getDispatchers", "()Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "getStatTracker", "()Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "statTracker", "getTrackingTracker", "trackingTracker", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public class VKIDDepsProd implements VKIDDeps {

    @NotNull
    private final InternalVKIDActivityStarter activityStarter;

    @NotNull
    private final List<B> additionalInterceptors;

    @NotNull
    private final InterfaceC4008j<InternalVKIDApiContract> api;

    @NotNull
    private final InterfaceC4008j<VKIDApiService> apiService;

    @NotNull
    private final Context appContext;

    @NotNull
    private final AuthCallbacksHolder authCallbacksHolder;

    /* renamed from: authOptionsCreator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j authOptionsCreator;

    @NotNull
    private final InterfaceC4008j<AuthProvidersChooser> authProvidersChooser;

    @NotNull
    private final InterfaceC4008j<AuthResultHandler> authResultHandler;

    @NotNull
    private final Context context;

    /* renamed from: crashReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j crashReporter;

    @NotNull
    private final InterfaceC4008j<InternalVKIDDeviceIdProvider> deviceIdProvider;

    @NotNull
    private final InterfaceC4008j<InternalVKIDDeviceIdProvider.DeviceIdStorage> deviceIdStorage;

    @NotNull
    private final InterfaceC4008j<InternalVKIDPreferencesStorage> encryptedSharedPreferencesStorage;

    /* renamed from: groupSubscriptionApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j groupSubscriptionApi;

    @NotNull
    private final InterfaceC4008j<InternalVKIDGroupSubscriptionApiContract> groupSubscriptionApiService;
    private final GroupSubscriptionLimit groupSubscriptionLimit;
    private final boolean isFlutter;

    @NotNull
    private final InterfaceC4008j<VKIDLoggerOut> loggerOut;

    /* renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j okHttpClient;

    /* renamed from: performanceTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j performanceTracker;

    @NotNull
    private final InterfaceC4008j<PkceGeneratorSHA256> pkceGenerator;

    @NotNull
    private final InterfaceC4008j<InternalVKIDPrefsStore> prefsStore;

    @NotNull
    private final InterfaceC4008j<ServiceCredentials> serviceCredentials;

    @NotNull
    private final InterfaceC4008j<SilentAuthServicesProvider> silentAuthServicesProvider;

    /* renamed from: stateGenerator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j stateGenerator;

    @NotNull
    private final InterfaceC4008j<VKIDTokenExchanger> tokenExchanger;

    @NotNull
    private final InterfaceC4008j<VKIDTokenRefresher> tokenRefresher;

    /* renamed from: tokenStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tokenStorage;

    @NotNull
    private final InterfaceC4008j<TokensHandler> tokensHandler;

    /* renamed from: trackingDeps$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j trackingDeps;

    @NotNull
    private final InterfaceC4008j<TrustedProvidersCache> trustedProvidersCache;

    @NotNull
    private final InterfaceC4008j<UserDataFetcher> userDataFetcher;

    @NotNull
    private final InterfaceC4008j<VKIDUserInfoFetcher> userInfoFetcher;

    @NotNull
    private final InterfaceC4008j<VKIDUserRefresher> userRefresher;

    @NotNull
    private final InterfaceC4008j<SilentAuthInfoProvider> vkSilentAuthInfoProvider;

    @NotNull
    private final InternalVKIDPackageManager vkidPackageManager;

    public VKIDDepsProd(@NotNull Context appContext, boolean z11, String str, boolean z12, boolean z13, GroupSubscriptionLimit groupSubscriptionLimit) {
        int i11 = 4;
        int i12 = 5;
        int i13 = 2;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.isFlutter = z11;
        this.groupSubscriptionLimit = groupSubscriptionLimit;
        this.context = getAppContext();
        int i14 = 3;
        this.serviceCredentials = k.b(new a(this, i14));
        this.trackingDeps = k.b(new B50.a(this, 7));
        int i15 = 1;
        this.crashReporter = k.b(new C4987a(this, i15));
        this.performanceTracker = k.b(new n(this, i14));
        this.silentAuthServicesProvider = k.b(new Function0() { // from class: pa.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SilentAuthServicesProvider silentAuthServicesProvider$lambda$4;
                silentAuthServicesProvider$lambda$4 = VKIDDepsProd.silentAuthServicesProvider$lambda$4(VKIDDepsProd.this);
                return silentAuthServicesProvider$lambda$4;
            }
        });
        PackageManager packageManager = getAppContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        this.vkidPackageManager = new AndroidPackageManager(packageManager);
        this.activityStarter = new DefaultActivityStarter(getAppContext());
        B[] elements = {z13 ? new HitmanChallengeInterceptor() : null, z12 ? new ForceError14Interceptor(str) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.additionalInterceptors = C7705l.B(elements);
        this.okHttpClient = k.b(new b(this, i13));
        this.api = k.b(new o(this, i12));
        this.apiService = k.b(new l(this, i13));
        this.trustedProvidersCache = k.b(new f(this, i14));
        this.vkSilentAuthInfoProvider = k.b(new g(this, i13));
        this.userDataFetcher = k.b(new P70.a(this, i13));
        this.authProvidersChooser = k.b(new R70.a(this, i14));
        this.authOptionsCreator = k.b(new A50.a(this, i13));
        this.authCallbacksHolder = new AuthCallbacksHolder();
        this.authResultHandler = k.b(new A50.b(this, i11));
        this.tokenRefresher = k.b(new c(this, i15));
        this.tokenExchanger = k.b(new C6101b(this, i14));
        this.userRefresher = k.b(new i(this, i15));
        this.loggerOut = k.b(new m0(this, i12));
        this.encryptedSharedPreferencesStorage = k.b(new d(this, i12));
        this.tokenStorage = k.b(new K70.c(this, i14));
        this.userInfoFetcher = k.b(new B50.b(this, i11));
        this.tokensHandler = k.b(new m(this, i13));
        this.stateGenerator = k.b(new e(this, i12));
        this.prefsStore = k.b(new B50.f(this, i13));
        this.deviceIdStorage = k.b(new B50.g(this, i14));
        this.deviceIdProvider = k.b(new C2620w(this, i13));
        this.pkceGenerator = k.b(new pa.b());
        this.groupSubscriptionApi = k.b(new B50.k(this, i15));
        this.groupSubscriptionApiService = k.b(new C7018a(this, i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDRealApi api$lambda$8(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDRealApi(vKIDDepsProd.getOkHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDApiService apiService$lambda$9(VKIDDepsProd vKIDDepsProd) {
        return new VKIDApiService(vKIDDepsProd.getApi().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthOptionsCreator authOptionsCreator_delegate$lambda$14(VKIDDepsProd vKIDDepsProd) {
        return new AuthOptionsCreator(vKIDDepsProd.getAppContext(), vKIDDepsProd.pkceGenerator, vKIDDepsProd.getPrefsStore(), vKIDDepsProd.getServiceCredentials(), vKIDDepsProd.getStateGenerator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthProvidersChooserDefault authProvidersChooser$lambda$13(VKIDDepsProd vKIDDepsProd) {
        InternalVKIDPackageManager vkidPackageManager = vKIDDepsProd.getVkidPackageManager();
        InternalVKIDPackageManager vkidPackageManager2 = vKIDDepsProd.getVkidPackageManager();
        String packageName = vKIDDepsProd.getAppContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return new AuthProvidersChooserDefault(vkidPackageManager, new SilentAuthServicesProvider(vkidPackageManager2, packageName, vKIDDepsProd.trustedProvidersCache.getValue()), vKIDDepsProd.getActivityStarter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthResultHandler authResultHandler$lambda$15(VKIDDepsProd vKIDDepsProd) {
        return new AuthResultHandler(vKIDDepsProd.getDispatchers(), vKIDDepsProd.getAuthCallbacksHolder(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getPrefsStore().getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.apiService.getValue(), vKIDDepsProd.tokensHandler.getValue(), vKIDDepsProd.getLoggerOut().getValue(), vKIDDepsProd.getTokenStorage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrashReporter crashReporter_delegate$lambda$2(VKIDDepsProd vKIDDepsProd) {
        return vKIDDepsProd.getTrackingDeps().getCrashReporter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDDeviceIdProvider deviceIdProvider$lambda$27(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDDeviceIdProvider(vKIDDepsProd.getAppContext(), vKIDDepsProd.getDeviceIdStorage().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceIdPrefs deviceIdStorage$lambda$26(VKIDDepsProd vKIDDepsProd) {
        return new DeviceIdPrefs(vKIDDepsProd.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDEncryptedSharedPreferencesStorage encryptedSharedPreferencesStorage$lambda$20(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDEncryptedSharedPreferencesStorage(vKIDDepsProd.getAppContext());
    }

    @SuppressLint({"WrongConstant"})
    private final ActivityInfo getActivityInfo(ComponentName componentName) {
        PackageManager.ComponentInfoFlags of2;
        ActivityInfo activityInfo;
        if (Build.VERSION.SDK_INT < 33) {
            ActivityInfo activityInfo2 = getAppContext().getPackageManager().getActivityInfo(componentName, 129);
            Intrinsics.f(activityInfo2);
            return activityInfo2;
        }
        try {
            PackageManager packageManager = getAppContext().getPackageManager();
            of2 = PackageManager.ComponentInfoFlags.of(129);
            activityInfo = packageManager.getActivityInfo(componentName, of2);
            return activityInfo;
        } catch (Throwable unused) {
            return getAppContext().getPackageManager().getActivityInfo(componentName, 129);
        }
    }

    private final InternalVKIDGroupSubscriptionApi getGroupSubscriptionApi() {
        return (InternalVKIDGroupSubscriptionApi) this.groupSubscriptionApi.getValue();
    }

    private final E getOkHttpClient() {
        return (E) this.okHttpClient.getValue();
    }

    private final StateGenerator getStateGenerator() {
        return (StateGenerator) this.stateGenerator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingDeps getTrackingDeps() {
        return (TrackingDeps) this.trackingDeps.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDGroupSubscriptionApiService groupSubscriptionApiService$lambda$31(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDGroupSubscriptionApiService(vKIDDepsProd.getGroupSubscriptionApi());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDGroupSubscriptionApi groupSubscriptionApi_delegate$lambda$30(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDGroupSubscriptionApi(vKIDDepsProd.getOkHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDLoggerOut loggerOut$lambda$19(VKIDDepsProd vKIDDepsProd) {
        return new VKIDLoggerOut(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.getTokenStorage(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getDispatchers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E okHttpClient_delegate$lambda$7(VKIDDepsProd vKIDDepsProd) {
        return new OkHttpClientProvider(vKIDDepsProd.getAppContext()).provide(vKIDDepsProd.additionalInterceptors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceTracker performanceTracker_delegate$lambda$3(VKIDDepsProd vKIDDepsProd) {
        return vKIDDepsProd.getTrackingDeps().getPerformanceTracker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PkceGeneratorSHA256 pkceGenerator$lambda$28() {
        return new PkceGeneratorSHA256();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDPrefsStore prefsStore$lambda$25(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDPrefsStore(vKIDDepsProd.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServiceCredentials serviceCredentials$lambda$0(VKIDDepsProd vKIDDepsProd) {
        int intOrThrow;
        String stringOrThrow;
        String stringOrThrow2;
        String stringOrThrow3;
        ActivityInfo activityInfo = vKIDDepsProd.getActivityInfo(new ComponentName(vKIDDepsProd.getAppContext(), (Class<?>) AuthActivity.class));
        Bundle metaData = activityInfo.metaData;
        Intrinsics.checkNotNullExpressionValue(metaData, "metaData");
        intOrThrow = VKIDDepsProdKt.getIntOrThrow(metaData, "VKIDClientID");
        String valueOf = String.valueOf(intOrThrow);
        Bundle metaData2 = activityInfo.metaData;
        Intrinsics.checkNotNullExpressionValue(metaData2, "metaData");
        stringOrThrow = VKIDDepsProdKt.getStringOrThrow(metaData2, "VKIDClientSecret");
        Bundle metaData3 = activityInfo.metaData;
        Intrinsics.checkNotNullExpressionValue(metaData3, "metaData");
        stringOrThrow2 = VKIDDepsProdKt.getStringOrThrow(metaData3, "VKIDRedirectScheme");
        Bundle metaData4 = activityInfo.metaData;
        Intrinsics.checkNotNullExpressionValue(metaData4, "metaData");
        stringOrThrow3 = VKIDDepsProdKt.getStringOrThrow(metaData4, "VKIDRedirectHost");
        return new ServiceCredentials(valueOf, stringOrThrow, Z.a(stringOrThrow2, "://", stringOrThrow3, "/blank.html"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SilentAuthServicesProvider silentAuthServicesProvider$lambda$4(VKIDDepsProd vKIDDepsProd) {
        InternalVKIDPackageManager vkidPackageManager = vKIDDepsProd.getVkidPackageManager();
        String packageName = vKIDDepsProd.getAppContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return new SilentAuthServicesProvider(vkidPackageManager, packageName, vKIDDepsProd.trustedProvidersCache.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateGenerator stateGenerator_delegate$lambda$24(VKIDDepsProd vKIDDepsProd) {
        return new StateGenerator(vKIDDepsProd.getPrefsStore().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDTokenExchanger tokenExchanger$lambda$17(VKIDDepsProd vKIDDepsProd) {
        return new VKIDTokenExchanger(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getStateGenerator(), vKIDDepsProd.tokensHandler.getValue(), vKIDDepsProd.getDispatchers(), vKIDDepsProd.getPrefsStore().getValue(), vKIDDepsProd.pkceGenerator.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDTokenRefresher tokenRefresher$lambda$16(VKIDDepsProd vKIDDepsProd) {
        return new VKIDTokenRefresher(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.getTokenStorage(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getStateGenerator(), vKIDDepsProd.tokensHandler.getValue(), vKIDDepsProd.getDispatchers(), vKIDDepsProd.getPrefsStore().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalVKIDTokenStorage tokenStorage_delegate$lambda$21(VKIDDepsProd vKIDDepsProd) {
        return new InternalVKIDTokenStorage(vKIDDepsProd.getEncryptedSharedPreferencesStorage().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokensHandler tokensHandler$lambda$23(VKIDDepsProd vKIDDepsProd) {
        return new TokensHandler(vKIDDepsProd.userInfoFetcher.getValue(), vKIDDepsProd.getTokenStorage(), vKIDDepsProd.getDispatchers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackingDeps trackingDeps_delegate$lambda$1(VKIDDepsProd vKIDDepsProd) {
        return new TrackingDeps(vKIDDepsProd.getAppContext(), vKIDDepsProd.getServiceCredentials().getValue().getClientID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedProvidersCache trustedProvidersCache$lambda$10(VKIDDepsProd vKIDDepsProd) {
        ServiceCredentials value = vKIDDepsProd.getServiceCredentials().getValue();
        return new TrustedProvidersCache(vKIDDepsProd.apiService, value.getClientID(), value.getClientSecret(), vKIDDepsProd.getDispatchers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserDataFetcher userDataFetcher$lambda$12(VKIDDepsProd vKIDDepsProd) {
        return new UserDataFetcher(vKIDDepsProd.getDispatchers(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getVkSilentAuthInfoProvider().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDUserInfoFetcher userInfoFetcher$lambda$22(VKIDDepsProd vKIDDepsProd) {
        return new VKIDUserInfoFetcher(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getDispatchers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDUserRefresher userRefresher$lambda$18(VKIDDepsProd vKIDDepsProd) {
        return new VKIDUserRefresher(vKIDDepsProd.apiService.getValue(), vKIDDepsProd.getTokenStorage(), vKIDDepsProd.deviceIdProvider.getValue(), vKIDDepsProd.getServiceCredentials().getValue(), vKIDDepsProd.getDispatchers(), vKIDDepsProd.getTokenRefresher().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VkSilentAuthInfoProvider vkSilentAuthInfoProvider$lambda$11(VKIDDepsProd vKIDDepsProd) {
        return new VkSilentAuthInfoProvider(vKIDDepsProd.getAppContext(), vKIDDepsProd.silentAuthServicesProvider.getValue(), vKIDDepsProd.deviceIdProvider.getValue(), 0L, 8, null);
    }

    @NotNull
    public InternalVKIDActivityStarter getActivityStarter() {
        return this.activityStarter;
    }

    @NotNull
    public InterfaceC4008j<InternalVKIDApiContract> getApi() {
        return this.api;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public Context getAppContext() {
        return this.appContext;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public AuthCallbacksHolder getAuthCallbacksHolder() {
        return this.authCallbacksHolder;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public AuthOptionsCreator getAuthOptionsCreator() {
        return (AuthOptionsCreator) this.authOptionsCreator.getValue();
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<AuthProvidersChooser> getAuthProvidersChooser() {
        return this.authProvidersChooser;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<AuthResultHandler> getAuthResultHandler() {
        return this.authResultHandler;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public Context getContext() {
        return this.context;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public CrashReporter getCrashReporter() {
        return (CrashReporter) this.crashReporter.getValue();
    }

    @NotNull
    public InterfaceC4008j<InternalVKIDDeviceIdProvider.DeviceIdStorage> getDeviceIdStorage() {
        return this.deviceIdStorage;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public VKIDCoroutinesDispatchers getDispatchers() {
        return new CoroutinesDispatchersProd();
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<InternalVKIDPreferencesStorage> getEncryptedSharedPreferencesStorage() {
        return this.encryptedSharedPreferencesStorage;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<InternalVKIDGroupSubscriptionApiContract> getGroupSubscriptionApiService() {
        return this.groupSubscriptionApiService;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    public GroupSubscriptionLimit getGroupSubscriptionLimit() {
        return this.groupSubscriptionLimit;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<VKIDLoggerOut> getLoggerOut() {
        return this.loggerOut;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public PerformanceTracker getPerformanceTracker() {
        return (PerformanceTracker) this.performanceTracker.getValue();
    }

    @NotNull
    public InterfaceC4008j<InternalVKIDPrefsStore> getPrefsStore() {
        return this.prefsStore;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<ServiceCredentials> getServiceCredentials() {
        return this.serviceCredentials;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public VKIDAnalytics.Tracker getStatTracker() {
        ServiceCredentials value = getServiceCredentials().getValue();
        return new StatTracker(value.getClientID(), value.getClientSecret(), getApi(), getDispatchers().getIo(), getAppContext());
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<VKIDTokenExchanger> getTokenExchanger() {
        return this.tokenExchanger;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<VKIDTokenRefresher> getTokenRefresher() {
        return this.tokenRefresher;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InternalVKIDTokenStorage getTokenStorage() {
        return (InternalVKIDTokenStorage) this.tokenStorage.getValue();
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public VKIDAnalytics.Tracker getTrackingTracker() {
        return new VKIDAnalytics.Tracker() { // from class: com.vk.id.internal.di.VKIDDepsProd$trackingTracker$1
            @Override // com.vk.id.analytics.VKIDAnalytics.Tracker
            public void trackEvent(String accessToken, String name, VKIDAnalytics.EventParam... params) {
                TrackingDeps trackingDeps;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(params, "params");
                trackingDeps = VKIDDepsProd.this.getTrackingDeps();
                trackingDeps.getAnalyticsTracking().log(name + " " + C7705l.P(params, null, null, null, null, 63));
            }
        };
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<UserDataFetcher> getUserDataFetcher() {
        return this.userDataFetcher;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<VKIDUserRefresher> getUserRefresher() {
        return this.userRefresher;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    @NotNull
    public InterfaceC4008j<SilentAuthInfoProvider> getVkSilentAuthInfoProvider() {
        return this.vkSilentAuthInfoProvider;
    }

    @NotNull
    public InternalVKIDPackageManager getVkidPackageManager() {
        return this.vkidPackageManager;
    }

    @Override // com.vk.id.internal.di.VKIDDeps
    /* renamed from: isFlutter, reason: from getter */
    public boolean getIsFlutter() {
        return this.isFlutter;
    }
}
