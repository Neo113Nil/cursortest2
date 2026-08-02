package com.vk.id.internal.auth.app;

import Ca.i;
import Sc.s;
import Wc.a;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.internal.auth.AuthOptionsKt;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.app.VkAuthProviderInfo;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u0004\u0018\u00010\u000b*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006!"}, d2 = {"Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "packageManager", "", "currentPackageName", "Lcom/vk/id/internal/auth/app/TrustedProvidersCache;", "cache", "<init>", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Ljava/lang/String;Lcom/vk/id/internal/auth/app/TrustedProvidersCache;)V", "Lkotlin/sequences/Sequence;", "Lcom/vk/id/internal/auth/app/VkAuthProviderInfo;", "excludeCurrentApp", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "", "isAllowedToOpenWebAuth", "(Lcom/vk/id/internal/auth/app/VkAuthProviderInfo;)Z", "Landroid/content/pm/ServiceInfo;", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "trustedProviders", "mapToProviderInfo", "(Landroid/content/pm/ServiceInfo;Ljava/util/List;)Lcom/vk/id/internal/auth/app/VkAuthProviderInfo;", "Landroid/content/pm/ResolveInfo;", "getAppsWithSilentAuthServices", "()Ljava/util/List;", "Lcom/vk/id/internal/auth/app/SilentAuthProviderData;", "getSilentAuthServices", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "Ljava/lang/String;", "Lcom/vk/id/internal/auth/app/TrustedProvidersCache;", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SilentAuthServicesProvider {

    @NotNull
    private final TrustedProvidersCache cache;

    @NotNull
    private final String currentPackageName;

    @NotNull
    private final InternalVKIDPackageManager packageManager;
    public static final int $stable = 8;

    public SilentAuthServicesProvider(@NotNull InternalVKIDPackageManager packageManager, @NotNull String currentPackageName, @NotNull TrustedProvidersCache cache) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(currentPackageName, "currentPackageName");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.packageManager = packageManager;
        this.currentPackageName = currentPackageName;
        this.cache = cache;
    }

    private final Sequence<VkAuthProviderInfo> excludeCurrentApp(Sequence<VkAuthProviderInfo> sequence) {
        return l.h(sequence, new i(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeCurrentApp$lambda$4(SilentAuthServicesProvider silentAuthServicesProvider, VkAuthProviderInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !Intrinsics.d(it.getComponentName().getPackageName(), silentAuthServicesProvider.currentPackageName);
    }

    private final List<ResolveInfo> getAppsWithSilentAuthServices() {
        return this.packageManager.queryIntentServices(new Intent("com.vk.silentauth.action.GET_INFO"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VkAuthProviderInfo getSilentAuthServices$lambda$0(SilentAuthServicesProvider silentAuthServicesProvider, List list, ResolveInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ServiceInfo serviceInfo = it.serviceInfo;
        Intrinsics.checkNotNullExpressionValue(serviceInfo, "serviceInfo");
        return silentAuthServicesProvider.mapToProviderInfo(serviceInfo, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSilentAuthServices$lambda$1(SilentAuthServicesProvider silentAuthServicesProvider, VkAuthProviderInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return silentAuthServicesProvider.isAllowedToOpenWebAuth(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SilentAuthProviderData getSilentAuthServices$lambda$3(VkAuthProviderInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SilentAuthProviderData(it.getComponentName(), it.getWeight());
    }

    private final boolean isAllowedToOpenWebAuth(VkAuthProviderInfo vkAuthProviderInfo) {
        String packageName = vkAuthProviderInfo.getComponentName().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        ResolveInfo resolveActivity = this.packageManager.resolveActivity(new Intent("android.intent.action.VIEW", AuthOptionsKt.basicCodeFlowUri(packageName)), 0);
        ActivityInfo activityInfo = resolveActivity != null ? resolveActivity.activityInfo : null;
        return activityInfo != null && Intrinsics.d(activityInfo.packageName, vkAuthProviderInfo.getComponentName().getPackageName());
    }

    private final VkAuthProviderInfo mapToProviderInfo(ServiceInfo serviceInfo, List<VkAuthSilentAuthProvider> list) {
        Object obj;
        SilentAuthInfoUtils silentAuthInfoUtils = SilentAuthInfoUtils.INSTANCE;
        InternalVKIDPackageManager internalVKIDPackageManager = this.packageManager;
        String packageName = serviceInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String calculateDigestHex = silentAuthInfoUtils.calculateDigestHex(internalVKIDPackageManager, packageName);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            VkAuthSilentAuthProvider vkAuthSilentAuthProvider = (VkAuthSilentAuthProvider) obj;
            if (Intrinsics.d(serviceInfo.packageName, vkAuthSilentAuthProvider.getAppPackage()) && Intrinsics.d(calculateDigestHex, vkAuthSilentAuthProvider.getAppSha())) {
                break;
            }
        }
        VkAuthSilentAuthProvider vkAuthSilentAuthProvider2 = (VkAuthSilentAuthProvider) obj;
        if (vkAuthSilentAuthProvider2 != null) {
            return new VkAuthProviderInfo(new ComponentName(serviceInfo.packageName, serviceInfo.name), vkAuthSilentAuthProvider2.getWeight());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSilentAuthServices(@NotNull d<? super List<SilentAuthProviderData>> dVar) {
        SilentAuthServicesProvider$getSilentAuthServices$1 silentAuthServicesProvider$getSilentAuthServices$1;
        int i11;
        final SilentAuthServicesProvider silentAuthServicesProvider;
        if (dVar instanceof SilentAuthServicesProvider$getSilentAuthServices$1) {
            silentAuthServicesProvider$getSilentAuthServices$1 = (SilentAuthServicesProvider$getSilentAuthServices$1) dVar;
            int i12 = silentAuthServicesProvider$getSilentAuthServices$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                silentAuthServicesProvider$getSilentAuthServices$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = silentAuthServicesProvider$getSilentAuthServices$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = silentAuthServicesProvider$getSilentAuthServices$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    TrustedProvidersCache trustedProvidersCache = this.cache;
                    silentAuthServicesProvider$getSilentAuthServices$1.L$0 = this;
                    silentAuthServicesProvider$getSilentAuthServices$1.label = 1;
                    obj = trustedProvidersCache.getSilentAuthProviders(silentAuthServicesProvider$getSilentAuthServices$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    silentAuthServicesProvider = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    silentAuthServicesProvider = (SilentAuthServicesProvider) silentAuthServicesProvider$getSilentAuthServices$1.L$0;
                    s.b(obj);
                }
                final List list = (List) obj;
                return l.C(l.v(l.A(l.h(silentAuthServicesProvider.excludeCurrentApp(l.w(C7714v.w(silentAuthServicesProvider.getAppsWithSilentAuthServices()), new Function1() { // from class: oa.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        VkAuthProviderInfo silentAuthServices$lambda$0;
                        silentAuthServices$lambda$0 = SilentAuthServicesProvider.getSilentAuthServices$lambda$0(SilentAuthServicesProvider.this, list, (ResolveInfo) obj2);
                        return silentAuthServices$lambda$0;
                    }
                })), new Function1() { // from class: oa.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean silentAuthServices$lambda$1;
                        silentAuthServices$lambda$1 = SilentAuthServicesProvider.getSilentAuthServices$lambda$1(SilentAuthServicesProvider.this, (VkAuthProviderInfo) obj2);
                        return Boolean.valueOf(silentAuthServices$lambda$1);
                    }
                }), new Comparator() { // from class: com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t11) {
                        return Vc.a.b(Integer.valueOf(((VkAuthProviderInfo) t11).getWeight()), Integer.valueOf(((VkAuthProviderInfo) t2).getWeight()));
                    }
                }), new R90.d(2)));
            }
        }
        silentAuthServicesProvider$getSilentAuthServices$1 = new SilentAuthServicesProvider$getSilentAuthServices$1(this, dVar);
        Object obj2 = silentAuthServicesProvider$getSilentAuthServices$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = silentAuthServicesProvider$getSilentAuthServices$1.label;
        if (i11 != 0) {
        }
        final List list2 = (List) obj2;
        return l.C(l.v(l.A(l.h(silentAuthServicesProvider.excludeCurrentApp(l.w(C7714v.w(silentAuthServicesProvider.getAppsWithSilentAuthServices()), new Function1() { // from class: oa.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                VkAuthProviderInfo silentAuthServices$lambda$0;
                silentAuthServices$lambda$0 = SilentAuthServicesProvider.getSilentAuthServices$lambda$0(SilentAuthServicesProvider.this, list2, (ResolveInfo) obj22);
                return silentAuthServices$lambda$0;
            }
        })), new Function1() { // from class: oa.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                boolean silentAuthServices$lambda$1;
                silentAuthServices$lambda$1 = SilentAuthServicesProvider.getSilentAuthServices$lambda$1(SilentAuthServicesProvider.this, (VkAuthProviderInfo) obj22);
                return Boolean.valueOf(silentAuthServices$lambda$1);
            }
        }), new Comparator() { // from class: com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(Integer.valueOf(((VkAuthProviderInfo) t11).getWeight()), Integer.valueOf(((VkAuthProviderInfo) t2).getWeight()));
            }
        }), new R90.d(2)));
    }
}
