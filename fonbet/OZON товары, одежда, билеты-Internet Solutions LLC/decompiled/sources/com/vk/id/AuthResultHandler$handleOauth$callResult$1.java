package com.vk.id;

import Sc.r;
import Sc.s;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.VKIDTokenPayload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "LSc/r;", "Lcom/vk/id/internal/auth/VKIDTokenPayload;", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.AuthResultHandler$handleOauth$callResult$1", f = "AuthResultHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AuthResultHandler$handleOauth$callResult$1 extends j implements Function2<M, d<? super r<? extends VKIDTokenPayload>>, Object> {
    final /* synthetic */ String $codeVerifier;
    final /* synthetic */ AuthResult.Success $oauth;
    final /* synthetic */ String $realState;
    int label;
    final /* synthetic */ AuthResultHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthResultHandler$handleOauth$callResult$1(AuthResultHandler authResultHandler, AuthResult.Success success, String str, String str2, d<? super AuthResultHandler$handleOauth$callResult$1> dVar) {
        super(2, dVar);
        this.this$0 = authResultHandler;
        this.$oauth = success;
        this.$codeVerifier = str;
        this.$realState = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AuthResultHandler$handleOauth$callResult$1(this.this$0, this.$oauth, this.$codeVerifier, this.$realState, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends VKIDTokenPayload>> dVar) {
        return invoke2(m11, (d<? super r<VKIDTokenPayload>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VKIDApiService vKIDApiService;
        ServiceCredentials serviceCredentials;
        ServiceCredentials serviceCredentials2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        vKIDApiService = this.this$0.api;
        String code = this.$oauth.getOauth().getCode();
        String str = this.$codeVerifier;
        serviceCredentials = this.this$0.serviceCredentials;
        String clientID = serviceCredentials.getClientID();
        String deviceId = this.$oauth.getDeviceId();
        serviceCredentials2 = this.this$0.serviceCredentials;
        return r.a(vKIDApiService.getToken(code, str, clientID, deviceId, serviceCredentials2.getRedirectUri(), this.$realState).mo52executed1pmJ48());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<VKIDTokenPayload>> dVar) {
        return ((AuthResultHandler$handleOauth$callResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
