package com.vk.id;

import Sc.s;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.logout.VKIDLogoutCallback;
import com.vk.id.logout.VKIDLogoutFail;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/vk/id/AccessToken;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.AuthResultHandler$handleOauth$5$1", f = "AuthResultHandler.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AuthResultHandler$handleOauth$5$1 extends j implements Function2<AccessToken, d<? super Unit>, Object> {
    final /* synthetic */ AccessToken $accessToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AuthResultHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthResultHandler$handleOauth$5$1(AccessToken accessToken, AuthResultHandler authResultHandler, d<? super AuthResultHandler$handleOauth$5$1> dVar) {
        super(2, dVar);
        this.$accessToken = accessToken;
        this.this$0 = authResultHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AuthResultHandler$handleOauth$5$1 authResultHandler$handleOauth$5$1 = new AuthResultHandler$handleOauth$5$1(this.$accessToken, this.this$0, dVar);
        authResultHandler$handleOauth$5$1.L$0 = obj;
        return authResultHandler$handleOauth$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccessToken accessToken, d<? super Unit> dVar) {
        return ((AuthResultHandler$handleOauth$5$1) create(accessToken, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VKIDLoggerOut vKIDLoggerOut;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            final AccessToken accessToken = (AccessToken) this.L$0;
            if (this.$accessToken != null) {
                vKIDLoggerOut = this.this$0.loggerOut;
                final AuthResultHandler authResultHandler = this.this$0;
                VKIDLogoutCallback vKIDLogoutCallback = new VKIDLogoutCallback() { // from class: com.vk.id.AuthResultHandler$handleOauth$5$1.1
                    @Override // com.vk.id.logout.VKIDLogoutCallback
                    public void onFail(VKIDLogoutFail fail) {
                        Intrinsics.checkNotNullParameter(fail, "fail");
                        AuthResultHandler.this.emitAuthSuccess(accessToken);
                    }

                    @Override // com.vk.id.logout.VKIDLogoutCallback
                    public void onSuccess() {
                        AuthResultHandler.this.emitAuthSuccess(accessToken);
                    }
                };
                String token = this.$accessToken.getToken();
                this.label = 1;
                if (VKIDLoggerOut.logout$default(vKIDLoggerOut, vKIDLogoutCallback, token, false, null, this, 8, null) == aVar) {
                    return aVar;
                }
            } else {
                this.this$0.emitAuthSuccess(accessToken);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
