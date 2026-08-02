package com.vk.id.network.useragent;

import Ek.a;
import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/id/network/useragent/UserAgentInterceptor;", "LWe/B;", "Lcom/vk/id/network/useragent/UserAgentProvider;", "userAgentProvider", "<init>", "(Lcom/vk/id/network/useragent/UserAgentProvider;)V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "Lcom/vk/id/network/useragent/UserAgentProvider;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UserAgentInterceptor implements B {

    @NotNull
    private final UserAgentProvider userAgentProvider;

    public UserAgentInterceptor(@NotNull UserAgentProvider userAgentProvider) {
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.userAgentProvider = userAgentProvider;
    }

    @Override // We.B
    @NotNull
    public L intercept(@NotNull B.a chain) {
        G.a aVar = new G.a(a.a(chain, "chain"));
        aVar.d("User-Agent", this.userAgentProvider.getUserAgent$network_release());
        return chain.proceed(aVar.b());
    }
}
