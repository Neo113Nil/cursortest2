package com.vk.id.onetap.compose.button;

import com.vk.id.VKIDUser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/onetap/compose/button/OnFetchingProgress;", "", "", "onPreFetch", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/vk/id/VKIDUser;", "user", "onFetched", "(Lcom/vk/id/VKIDUser;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onDispose", "()V", "onetap-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface OnFetchingProgress {
    void onDispose();

    Object onFetched(VKIDUser vKIDUser, @NotNull d<? super Unit> dVar);

    Object onPreFetch(@NotNull d<? super Unit> dVar);
}
