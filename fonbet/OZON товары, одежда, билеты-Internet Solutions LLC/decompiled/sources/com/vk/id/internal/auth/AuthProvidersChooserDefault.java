package com.vk.id.internal.auth;

import Sc.s;
import Wc.a;
import android.content.ComponentName;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.internal.auth.app.AppAuthProvider;
import com.vk.id.internal.auth.app.SilentAuthProviderData;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.web.WebAuthProvider;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/vk/id/internal/auth/AuthProvidersChooserDefault;", "Lcom/vk/id/internal/auth/AuthProvidersChooser;", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "packageManager", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "silentAuthServicesProvider", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "activityStarter", "<init>", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;Lcom/vk/id/internal/context/InternalVKIDActivityStarter;)V", "Lcom/vk/id/auth/VKIDAuthParams;", "params", "Lcom/vk/id/internal/auth/VKIDAuthProvider;", "chooseBest", "(Lcom/vk/id/auth/VKIDAuthParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthProvidersChooserDefault implements AuthProvidersChooser {

    @NotNull
    private final InternalVKIDActivityStarter activityStarter;

    @NotNull
    private final InternalVKIDLogger logger;

    @NotNull
    private final InternalVKIDPackageManager packageManager;

    @NotNull
    private final SilentAuthServicesProvider silentAuthServicesProvider;

    public AuthProvidersChooserDefault(@NotNull InternalVKIDPackageManager packageManager, @NotNull SilentAuthServicesProvider silentAuthServicesProvider, @NotNull InternalVKIDActivityStarter activityStarter) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(silentAuthServicesProvider, "silentAuthServicesProvider");
        Intrinsics.checkNotNullParameter(activityStarter, "activityStarter");
        this.packageManager = packageManager;
        this.silentAuthServicesProvider = silentAuthServicesProvider;
        this.activityStarter = activityStarter;
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("AuthProvidersChooserDefault", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("AuthProvidersChooserDefault");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.vk.id.internal.auth.AuthProvidersChooser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object chooseBest(@NotNull VKIDAuthParams vKIDAuthParams, @NotNull d<? super VKIDAuthProvider> dVar) {
        AuthProvidersChooserDefault$chooseBest$1 authProvidersChooserDefault$chooseBest$1;
        int i11;
        AuthProvidersChooserDefault authProvidersChooserDefault;
        Iterator it;
        AppAuthProvider appAuthProvider;
        Object next;
        SilentAuthProviderData silentAuthProviderData;
        ComponentName componentName;
        String packageName;
        if (dVar instanceof AuthProvidersChooserDefault$chooseBest$1) {
            authProvidersChooserDefault$chooseBest$1 = (AuthProvidersChooserDefault$chooseBest$1) dVar;
            int i12 = authProvidersChooserDefault$chooseBest$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                authProvidersChooserDefault$chooseBest$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = authProvidersChooserDefault$chooseBest$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = authProvidersChooserDefault$chooseBest$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (!vKIDAuthParams.getUseOAuthProviderIfPossible() || vKIDAuthParams.getOAuth() != null) {
                        VKIDAnalytics.INSTANCE.trackEvent("no_auth_provider", new VKIDAnalytics.EventParam("sdk_type", "vkid", null, 4, null));
                        return new WebAuthProvider(this.packageManager, this.activityStarter);
                    }
                    SilentAuthServicesProvider silentAuthServicesProvider = this.silentAuthServicesProvider;
                    authProvidersChooserDefault$chooseBest$1.L$0 = this;
                    authProvidersChooserDefault$chooseBest$1.label = 1;
                    obj = silentAuthServicesProvider.getSilentAuthServices(authProvidersChooserDefault$chooseBest$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    authProvidersChooserDefault = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    authProvidersChooserDefault = (AuthProvidersChooserDefault) authProvidersChooserDefault$chooseBest$1.L$0;
                    s.b(obj);
                }
                it = ((Iterable) obj).iterator();
                appAuthProvider = null;
                if (it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        int weight = ((SilentAuthProviderData) next).getWeight();
                        do {
                            Object next2 = it.next();
                            int weight2 = ((SilentAuthProviderData) next2).getWeight();
                            if (weight < weight2) {
                                next = next2;
                                weight = weight2;
                            }
                        } while (it.hasNext());
                    }
                }
                silentAuthProviderData = (SilentAuthProviderData) next;
                if (silentAuthProviderData != null && (componentName = silentAuthProviderData.getComponentName()) != null && (packageName = componentName.getPackageName()) != null) {
                    authProvidersChooserDefault.logger.debug("Silent auth provider found: ".concat(packageName));
                    appAuthProvider = new AppAuthProvider(authProvidersChooserDefault.activityStarter, packageName);
                }
                if (appAuthProvider != null) {
                    VKIDAnalytics.INSTANCE.trackEvent("no_auth_provider", new VKIDAnalytics.EventParam("sdk_type", "vkid", null, 4, null));
                    return new WebAuthProvider(authProvidersChooserDefault.packageManager, authProvidersChooserDefault.activityStarter);
                }
                VKIDAnalytics.INSTANCE.trackEvent("auth_provider_used", new VKIDAnalytics.EventParam("sdk_type", "vkid", null, 4, null));
                return appAuthProvider;
            }
        }
        authProvidersChooserDefault$chooseBest$1 = new AuthProvidersChooserDefault$chooseBest$1(this, dVar);
        Object obj2 = authProvidersChooserDefault$chooseBest$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = authProvidersChooserDefault$chooseBest$1.label;
        if (i11 != 0) {
        }
        it = ((Iterable) obj2).iterator();
        appAuthProvider = null;
        if (it.hasNext()) {
        }
        silentAuthProviderData = (SilentAuthProviderData) next;
        if (silentAuthProviderData != null) {
            authProvidersChooserDefault.logger.debug("Silent auth provider found: ".concat(packageName));
            appAuthProvider = new AppAuthProvider(authProvidersChooserDefault.activityStarter, packageName);
        }
        if (appAuthProvider != null) {
        }
    }
}
