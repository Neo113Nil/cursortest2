package com.vk.id.internal.auth.app;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.internal.auth.app.SilentAuthServicesProvider", f = "SilentAuthServicesProvider.kt", l = {19}, m = "getSilentAuthServices")
/* loaded from: classes9.dex */
final class SilentAuthServicesProvider$getSilentAuthServices$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SilentAuthServicesProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SilentAuthServicesProvider$getSilentAuthServices$1(SilentAuthServicesProvider silentAuthServicesProvider, d<? super SilentAuthServicesProvider$getSilentAuthServices$1> dVar) {
        super(dVar);
        this.this$0 = silentAuthServicesProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getSilentAuthServices(this);
    }
}
