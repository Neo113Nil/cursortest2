package com.vk.id;

import Sc.s;
import com.vk.id.internal.auth.VKIDTokenPayload;
import com.vk.id.storage.InternalVKIDTokenStorage;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lcom/vk/id/AccessToken;", "<anonymous>", "(Lxe/M;)Lcom/vk/id/AccessToken;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.TokensHandler$handle$2$accessToken$1", f = "TokensHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TokensHandler$handle$2$accessToken$1 extends j implements Function2<M, d<? super AccessToken>, Object> {
    final /* synthetic */ VKIDUser $it;
    final /* synthetic */ VKIDTokenPayload $payload;
    final /* synthetic */ Set<String> $scopes;
    int label;
    final /* synthetic */ TokensHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TokensHandler$handle$2$accessToken$1(VKIDTokenPayload vKIDTokenPayload, TokensHandler tokensHandler, VKIDUser vKIDUser, Set<String> set, d<? super TokensHandler$handle$2$accessToken$1> dVar) {
        super(2, dVar);
        this.$payload = vKIDTokenPayload;
        this.this$0 = tokensHandler;
        this.$it = vKIDUser;
        this.$scopes = set;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TokensHandler$handle$2$accessToken$1(this.$payload, this.this$0, this.$it, this.$scopes, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j11;
        InternalVKIDTokenStorage internalVKIDTokenStorage;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String accessToken = this.$payload.getAccessToken();
        String idToken = this.$payload.getIdToken();
        String str = null;
        if (h.K(idToken)) {
            idToken = null;
        }
        if (idToken == null) {
            internalVKIDTokenStorage = this.this$0.tokenStorage;
            AccessToken accessToken$vkid_release = internalVKIDTokenStorage.getAccessToken$vkid_release();
            if (accessToken$vkid_release != null) {
                str = accessToken$vkid_release.getIdToken();
            }
        } else {
            str = idToken;
        }
        long userId = this.$payload.getUserId();
        long expiresIn = this.$payload.getExpiresIn();
        if (expiresIn > 0) {
            j11 = TimeUnit.SECONDS.toMillis(expiresIn) + System.currentTimeMillis();
        } else {
            j11 = -1;
        }
        return new AccessToken(accessToken, str, userId, j11, this.$it, this.$scopes);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AccessToken> dVar) {
        return ((TokensHandler$handle$2$accessToken$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
