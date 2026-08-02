package com.vk.id.internal.auth.app;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.internal.auth.app.TrustedProvidersCache", f = "TrustedProvidersCache.kt", l = {54}, m = "fetchSilentAuthProvidersSync")
/* loaded from: classes9.dex */
final class TrustedProvidersCache$fetchSilentAuthProvidersSync$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrustedProvidersCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrustedProvidersCache$fetchSilentAuthProvidersSync$1(TrustedProvidersCache trustedProvidersCache, d<? super TrustedProvidersCache$fetchSilentAuthProvidersSync$1> dVar) {
        super(dVar);
        this.this$0 = trustedProvidersCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchSilentAuthProvidersSync;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        fetchSilentAuthProvidersSync = this.this$0.fetchSilentAuthProvidersSync(this);
        return fetchSilentAuthProvidersSync;
    }
}
