package com.vk.id.captcha.okhttp.a;

import We.B;
import We.L;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/vk/id/captcha/okhttp/a/a;", "LWe/B;", "", "p0", "<init>", "(Ljava/util/List;)V", "LWe/B$a;", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "a", "Ljava/util/List;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a implements B {

    @NotNull
    private final List<B> a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull List<? extends B> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.a = list;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        return new b(p02.request(), p02, this.a).proceed(p02.request());
    }
}
