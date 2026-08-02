package com.vk.id.internal.di;

import Sc.InterfaceC4008j;
import android.content.Context;
import com.vk.id.AuthOptionsCreator;
import com.vk.id.AuthResultHandler;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.exchangetoken.VKIDTokenExchanger;
import com.vk.id.groupsubscription.GroupSubscriptionLimit;
import com.vk.id.internal.auth.AuthCallbacksHolder;
import com.vk.id.internal.auth.AuthProvidersChooser;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.id.internal.user.UserDataFetcher;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.refresh.VKIDTokenRefresher;
import com.vk.id.refreshuser.VKIDUserRefresher;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import com.vk.id.storage.InternalVKIDTokenStorage;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\tR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\tR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\tR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\tR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\tR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\tR\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002040\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\tR\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020;0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\tR\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010E\u001a\u00020D8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0004R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\tR\u0016\u0010O\u001a\u0004\u0018\u00010L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/vk/id/internal/di/VKIDDeps;", "", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "LSc/j;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "getServiceCredentials", "()LSc/j;", "serviceCredentials", "Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter", "Lcom/vk/id/tracking/core/PerformanceTracker;", "getPerformanceTracker", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "getAuthCallbacksHolder", "()Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "authCallbacksHolder", "Lcom/vk/id/AuthOptionsCreator;", "getAuthOptionsCreator", "()Lcom/vk/id/AuthOptionsCreator;", "authOptionsCreator", "Lcom/vk/id/internal/auth/AuthProvidersChooser;", "getAuthProvidersChooser", "authProvidersChooser", "Lcom/vk/id/AuthResultHandler;", "getAuthResultHandler", "authResultHandler", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "getDispatchers", "()Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "getVkSilentAuthInfoProvider", "vkSilentAuthInfoProvider", "Lcom/vk/id/internal/user/UserDataFetcher;", "getUserDataFetcher", "userDataFetcher", "Lcom/vk/id/refresh/VKIDTokenRefresher;", "getTokenRefresher", "tokenRefresher", "Lcom/vk/id/exchangetoken/VKIDTokenExchanger;", "getTokenExchanger", "tokenExchanger", "Lcom/vk/id/refreshuser/VKIDUserRefresher;", "getUserRefresher", "userRefresher", "Lcom/vk/id/logout/VKIDLoggerOut;", "getLoggerOut", "loggerOut", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "getTokenStorage", "()Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "getEncryptedSharedPreferencesStorage", "encryptedSharedPreferencesStorage", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "getStatTracker", "()Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "statTracker", "getTrackingTracker", "trackingTracker", "", "isFlutter", "()Z", "getAppContext", "appContext", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "getGroupSubscriptionApiService", "groupSubscriptionApiService", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getGroupSubscriptionLimit", "()Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "groupSubscriptionLimit", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface VKIDDeps {
    @NotNull
    Context getAppContext();

    @NotNull
    AuthCallbacksHolder getAuthCallbacksHolder();

    @NotNull
    AuthOptionsCreator getAuthOptionsCreator();

    @NotNull
    InterfaceC4008j<AuthProvidersChooser> getAuthProvidersChooser();

    @NotNull
    InterfaceC4008j<AuthResultHandler> getAuthResultHandler();

    @NotNull
    Context getContext();

    @NotNull
    CrashReporter getCrashReporter();

    @NotNull
    VKIDCoroutinesDispatchers getDispatchers();

    @NotNull
    InterfaceC4008j<InternalVKIDPreferencesStorage> getEncryptedSharedPreferencesStorage();

    @NotNull
    InterfaceC4008j<InternalVKIDGroupSubscriptionApiContract> getGroupSubscriptionApiService();

    GroupSubscriptionLimit getGroupSubscriptionLimit();

    @NotNull
    InterfaceC4008j<VKIDLoggerOut> getLoggerOut();

    @NotNull
    PerformanceTracker getPerformanceTracker();

    @NotNull
    InterfaceC4008j<ServiceCredentials> getServiceCredentials();

    @NotNull
    VKIDAnalytics.Tracker getStatTracker();

    @NotNull
    InterfaceC4008j<VKIDTokenExchanger> getTokenExchanger();

    @NotNull
    InterfaceC4008j<VKIDTokenRefresher> getTokenRefresher();

    @NotNull
    InternalVKIDTokenStorage getTokenStorage();

    @NotNull
    VKIDAnalytics.Tracker getTrackingTracker();

    @NotNull
    InterfaceC4008j<UserDataFetcher> getUserDataFetcher();

    @NotNull
    InterfaceC4008j<VKIDUserRefresher> getUserRefresher();

    @NotNull
    InterfaceC4008j<SilentAuthInfoProvider> getVkSilentAuthInfoProvider();

    /* renamed from: isFlutter */
    boolean getIsFlutter();
}
