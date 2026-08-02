package com.vk.id.internal.ipc;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.internal.ipc.VkSilentAuthInfoProvider", f = "VkSilentAuthInfoProvider.kt", l = {90}, m = "getSilentAuthInfos")
/* loaded from: classes9.dex */
final class VkSilentAuthInfoProvider$getSilentAuthInfos$1 extends c {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VkSilentAuthInfoProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VkSilentAuthInfoProvider$getSilentAuthInfos$1(VkSilentAuthInfoProvider vkSilentAuthInfoProvider, d<? super VkSilentAuthInfoProvider$getSilentAuthInfos$1> dVar) {
        super(dVar);
        this.this$0 = vkSilentAuthInfoProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getSilentAuthInfos(0L, this);
    }
}
