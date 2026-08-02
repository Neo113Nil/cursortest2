package com.vk.id;

import com.vk.id.fetchuser.VKIDUserInfoFetcher;
import com.vk.id.internal.auth.VKIDTokenPayload;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJZ\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/TokensHandler;", "", "Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;", "userInfoFetcher", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "<init>", "(Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;Lcom/vk/id/storage/InternalVKIDTokenStorage;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;)V", "Lcom/vk/id/internal/auth/VKIDTokenPayload;", "payload", "Lkotlin/Function2;", "Lcom/vk/id/AccessToken;", "Lkotlin/coroutines/d;", "", "onSuccess", "Lkotlin/Function1;", "", "onFailedApiCall", "", "refreshAccessToken", "handle", "(Lcom/vk/id/internal/auth/VKIDTokenPayload;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TokensHandler {

    @NotNull
    private final VKIDCoroutinesDispatchers dispatchers;

    @NotNull
    private final InternalVKIDTokenStorage tokenStorage;

    @NotNull
    private final VKIDUserInfoFetcher userInfoFetcher;

    public TokensHandler(@NotNull VKIDUserInfoFetcher userInfoFetcher, @NotNull InternalVKIDTokenStorage tokenStorage, @NotNull VKIDCoroutinesDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(userInfoFetcher, "userInfoFetcher");
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.userInfoFetcher = userInfoFetcher;
        this.tokenStorage = tokenStorage;
        this.dispatchers = dispatchers;
    }

    public static /* synthetic */ Object handle$default(TokensHandler tokensHandler, VKIDTokenPayload vKIDTokenPayload, Function2 function2, Function1 function1, boolean z11, d dVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return tokensHandler.handle(vKIDTokenPayload, function2, function1, z11, dVar);
    }

    public final Object handle(@NotNull VKIDTokenPayload vKIDTokenPayload, @NotNull Function2<? super AccessToken, ? super d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super Throwable, Unit> function1, boolean z11, @NotNull d<? super Unit> dVar) {
        Object fetch = this.userInfoFetcher.fetch(vKIDTokenPayload.getAccessToken(), new TokensHandler$handle$2(vKIDTokenPayload, this, function2, z11, null), function1, dVar);
        return fetch == Wc.a.COROUTINE_SUSPENDED ? fetch : Unit.f71690a;
    }
}
