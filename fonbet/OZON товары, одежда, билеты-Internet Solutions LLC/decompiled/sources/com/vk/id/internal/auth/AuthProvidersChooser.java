package com.vk.id.internal.auth;

import com.vk.id.auth.VKIDAuthParams;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/internal/auth/AuthProvidersChooser;", "", "Lcom/vk/id/auth/VKIDAuthParams;", "params", "Lcom/vk/id/internal/auth/VKIDAuthProvider;", "chooseBest", "(Lcom/vk/id/auth/VKIDAuthParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface AuthProvidersChooser {
    Object chooseBest(@NotNull VKIDAuthParams vKIDAuthParams, @NotNull d<? super VKIDAuthProvider> dVar);
}
