package com.vk.id.internal.auth.app;

import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.I;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/app/TrustedProvidersCache;", "", "LSc/j;", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "", "clientId", "clientSecret", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "<init>", "(LSc/j;Ljava/lang/String;Ljava/lang/String;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;)V", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "fetchSilentAuthProvidersSync", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "getSilentAuthProviders", "LSc/j;", "Ljava/lang/String;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "cachedTrustedProviders", "Ljava/util/List;", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrustedProvidersCache {
    public static final int $stable;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final List<VkAuthSilentAuthProvider> DEFAULT_TRUSTED_PROVIDERS;

    @NotNull
    private final InterfaceC4008j<VKIDApiService> api;
    private List<VkAuthSilentAuthProvider> cachedTrustedProviders;

    @NotNull
    private final String clientId;

    @NotNull
    private final String clientSecret;

    @NotNull
    private final VKIDCoroutinesDispatchers dispatchers;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/vk/id/internal/auth/app/TrustedProvidersCache$Companion;", "", "<init>", "()V", "RELEASE_APP_SHA", "", "DEBUG_APP_SHA", "DEFAULT_TRUSTED_PROVIDERS", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "createBaseProviders", "appPackage", "weight", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<VkAuthSilentAuthProvider> createBaseProviders(String appPackage, int weight) {
            return C7714v.b0(new VkAuthSilentAuthProvider(appPackage, "48761eef50ee53afc4cc9c5f10e6bde7f8f5b82f", weight), new VkAuthSilentAuthProvider(appPackage, "86259288a43f6c409a922bc3ce40ba08085bbadb", weight));
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        $stable = 8;
        DEFAULT_TRUSTED_PROVIDERS = C7714v.N(C7714v.b0(companion.createBaseProviders("com.vkontakte.android", 3), companion.createBaseProviders("com.vk.im", 2), companion.createBaseProviders("com.vk.calls", 1)));
    }

    public TrustedProvidersCache(@NotNull InterfaceC4008j<VKIDApiService> api, @NotNull String clientId, @NotNull String clientSecret, @NotNull VKIDCoroutinesDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.api = api;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSilentAuthProvidersSync(d<? super List<VkAuthSilentAuthProvider>> dVar) {
        TrustedProvidersCache$fetchSilentAuthProvidersSync$1 trustedProvidersCache$fetchSilentAuthProvidersSync$1;
        int i11;
        TrustedProvidersCache trustedProvidersCache;
        Collection collection;
        if (dVar instanceof TrustedProvidersCache$fetchSilentAuthProvidersSync$1) {
            trustedProvidersCache$fetchSilentAuthProvidersSync$1 = (TrustedProvidersCache$fetchSilentAuthProvidersSync$1) dVar;
            int i12 = trustedProvidersCache$fetchSilentAuthProvidersSync$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                trustedProvidersCache$fetchSilentAuthProvidersSync$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = trustedProvidersCache$fetchSilentAuthProvidersSync$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = trustedProvidersCache$fetchSilentAuthProvidersSync$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    I io2 = this.dispatchers.getIo();
                    TrustedProvidersCache$fetchSilentAuthProvidersSync$2 trustedProvidersCache$fetchSilentAuthProvidersSync$2 = new TrustedProvidersCache$fetchSilentAuthProvidersSync$2(this, null);
                    trustedProvidersCache$fetchSilentAuthProvidersSync$1.L$0 = this;
                    trustedProvidersCache$fetchSilentAuthProvidersSync$1.label = 1;
                    obj = C10727i.f(io2, trustedProvidersCache$fetchSilentAuthProvidersSync$2, trustedProvidersCache$fetchSilentAuthProvidersSync$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    trustedProvidersCache = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    trustedProvidersCache = (TrustedProvidersCache) trustedProvidersCache$fetchSilentAuthProvidersSync$1.L$0;
                    s.b(obj);
                }
                Object f26106a = ((r) obj).getF26106a();
                collection = (List) (f26106a instanceof r.b ? null : f26106a);
                if (collection == null) {
                    collection = K.f71697a;
                }
                ArrayList p02 = C7714v.p0(DEFAULT_TRUSTED_PROVIDERS, collection);
                trustedProvidersCache.cachedTrustedProviders = p02;
                return p02;
            }
        }
        trustedProvidersCache$fetchSilentAuthProvidersSync$1 = new TrustedProvidersCache$fetchSilentAuthProvidersSync$1(this, dVar);
        Object obj2 = trustedProvidersCache$fetchSilentAuthProvidersSync$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = trustedProvidersCache$fetchSilentAuthProvidersSync$1.label;
        if (i11 != 0) {
        }
        Object f26106a2 = ((r) obj2).getF26106a();
        collection = (List) (f26106a2 instanceof r.b ? null : f26106a2);
        if (collection == null) {
        }
        ArrayList p022 = C7714v.p0(DEFAULT_TRUSTED_PROVIDERS, collection);
        trustedProvidersCache.cachedTrustedProviders = p022;
        return p022;
    }

    public final Object getSilentAuthProviders(@NotNull d<? super List<VkAuthSilentAuthProvider>> dVar) {
        List<VkAuthSilentAuthProvider> list = this.cachedTrustedProviders;
        return list == null ? fetchSilentAuthProvidersSync(dVar) : list;
    }
}
