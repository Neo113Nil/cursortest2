package com.vk.id;

import Sc.s;
import com.vk.id.internal.auth.VKIDTokenPayload;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.storage.InternalVKIDTokenStorage;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import xe.C10727i;
import xe.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/vk/id/VKIDUser;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.TokensHandler$handle$2", f = "TokensHandler.kt", l = {28, 42, 46}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TokensHandler$handle$2 extends j implements Function2<VKIDUser, d<? super Unit>, Object> {
    final /* synthetic */ Function2<AccessToken, d<? super Unit>, Object> $onSuccess;
    final /* synthetic */ VKIDTokenPayload $payload;
    final /* synthetic */ boolean $refreshAccessToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TokensHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.TokensHandler$handle$2$1", f = "TokensHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vk.id.TokensHandler$handle$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AccessToken $accessToken;
        final /* synthetic */ boolean $refreshAccessToken;
        final /* synthetic */ RefreshToken $refreshToken;
        int label;
        final /* synthetic */ TokensHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z11, TokensHandler tokensHandler, AccessToken accessToken, RefreshToken refreshToken, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$refreshAccessToken = z11;
            this.this$0 = tokensHandler;
            this.$accessToken = accessToken;
            this.$refreshToken = refreshToken;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$refreshAccessToken, this.this$0, this.$accessToken, this.$refreshToken, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InternalVKIDTokenStorage internalVKIDTokenStorage;
            InternalVKIDTokenStorage internalVKIDTokenStorage2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (this.$refreshAccessToken) {
                internalVKIDTokenStorage2 = this.this$0.tokenStorage;
                internalVKIDTokenStorage2.setAccessToken$vkid_release(this.$accessToken);
            }
            internalVKIDTokenStorage = this.this$0.tokenStorage;
            internalVKIDTokenStorage.setRefreshToken$vkid_release(this.$refreshToken);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TokensHandler$handle$2(VKIDTokenPayload vKIDTokenPayload, TokensHandler tokensHandler, Function2<? super AccessToken, ? super d<? super Unit>, ? extends Object> function2, boolean z11, d<? super TokensHandler$handle$2> dVar) {
        super(2, dVar);
        this.$payload = vKIDTokenPayload;
        this.this$0 = tokensHandler;
        this.$onSuccess = function2;
        this.$refreshAccessToken = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TokensHandler$handle$2 tokensHandler$handle$2 = new TokensHandler$handle$2(this.$payload, this.this$0, this.$onSuccess, this.$refreshAccessToken, dVar);
        tokensHandler$handle$2.L$0 = obj;
        return tokensHandler$handle$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(VKIDUser vKIDUser, d<? super Unit> dVar) {
        return ((TokensHandler$handle$2) create(vKIDUser, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        if (r13.invoke(r0, r12) != r2) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers;
        Set set;
        VKIDCoroutinesDispatchers vKIDCoroutinesDispatchers2;
        AccessToken accessToken;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            VKIDUser vKIDUser = (VKIDUser) this.L$0;
            Set Y02 = C7714v.Y0(h.l(this.$payload.getScope(), new char[]{' '}, 0, 6));
            vKIDCoroutinesDispatchers = this.this$0.dispatchers;
            I io2 = vKIDCoroutinesDispatchers.getIo();
            TokensHandler$handle$2$accessToken$1 tokensHandler$handle$2$accessToken$1 = new TokensHandler$handle$2$accessToken$1(this.$payload, this.this$0, vKIDUser, Y02, null);
            this.L$0 = Y02;
            this.label = 1;
            obj = C10727i.f(io2, tokensHandler$handle$2$accessToken$1, this);
            if (obj != aVar) {
                set = Y02;
            }
            return aVar;
        }
        if (i11 == 1) {
            set = (Set) this.L$0;
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            accessToken = (AccessToken) this.L$0;
            s.b(obj);
            Function2<AccessToken, d<? super Unit>, Object> function2 = this.$onSuccess;
            this.L$0 = null;
            this.label = 3;
        }
        AccessToken accessToken2 = (AccessToken) obj;
        RefreshToken refreshToken = new RefreshToken(this.$payload.getRefreshToken(), set);
        vKIDCoroutinesDispatchers2 = this.this$0.dispatchers;
        I io3 = vKIDCoroutinesDispatchers2.getIo();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$refreshAccessToken, this.this$0, accessToken2, refreshToken, null);
        this.L$0 = accessToken2;
        this.label = 2;
        if (C10727i.f(io3, anonymousClass1, this) != aVar) {
            accessToken = accessToken2;
            Function2<AccessToken, d<? super Unit>, Object> function22 = this.$onSuccess;
            this.L$0 = null;
            this.label = 3;
        }
        return aVar;
    }
}
