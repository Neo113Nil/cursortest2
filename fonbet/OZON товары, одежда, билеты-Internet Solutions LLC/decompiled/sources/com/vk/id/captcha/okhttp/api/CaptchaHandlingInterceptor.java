package com.vk.id.captcha.okhttp.api;

import We.B;
import We.L;
import com.vk.id.captcha.okhttp.a.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/CaptchaHandlingInterceptor;", "LWe/B;", "", "", "domains", "<init>", "(Ljava/util/Set;)V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "Ljava/util/Set;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CaptchaHandlingInterceptor implements B {
    private final /* synthetic */ a $$delegate_0;

    @NotNull
    private final Set<String> domains;

    public CaptchaHandlingInterceptor(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.domains = set;
        this.$$delegate_0 = new a(C7714v.b0(new Error14HandlingInterceptor(set), new HitmanChallengeHandlingInterceptor(set)));
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return this.$$delegate_0.intercept(chain);
    }

    public CaptchaHandlingInterceptor(Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? M.f71699a : set);
    }
}
