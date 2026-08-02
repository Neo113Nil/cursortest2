package com.vk.id;

import Je.InterfaceC3394a;
import Sc.InterfaceC4008j;
import Sc.s;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.internal.analytics.CustomAuthAnalytics;
import com.vk.id.internal.auth.AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.VKID$authorize$6$1$onAuthResult$1", f = "VKID.kt", l = {469}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKID$authorize$6$1$onAuthResult$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ VKIDAuthParams $actualParams;
    final /* synthetic */ AuthResult $authResult;
    final /* synthetic */ String $performanceKey;
    final /* synthetic */ StatParams $statParams;
    int label;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKID$authorize$6$1$onAuthResult$1(VKID vkid, AuthResult authResult, String str, VKIDAuthParams vKIDAuthParams, StatParams statParams, d<? super VKID$authorize$6$1$onAuthResult$1> dVar) {
        super(2, dVar);
        this.this$0 = vkid;
        this.$authResult = authResult;
        this.$performanceKey = str;
        this.$actualParams = vKIDAuthParams;
        this.$statParams = statParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(VKIDAuthParams vKIDAuthParams, StatParams statParams) {
        if (!vKIDAuthParams.getInternalUse()) {
            CustomAuthAnalytics.INSTANCE.customAuthError$vkid_release(statParams);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VKID$authorize$6$1$onAuthResult$1(this.this$0, this.$authResult, this.$performanceKey, this.$actualParams, this.$statParams, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        InterfaceC3394a interfaceC3394a;
        InterfaceC3394a interfaceC3394a2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC4008j = this.this$0.authResultHandler;
            AuthResultHandler authResultHandler = (AuthResultHandler) interfaceC4008j.getValue();
            AuthResult authResult = this.$authResult;
            final VKIDAuthParams vKIDAuthParams = this.$actualParams;
            final StatParams statParams = this.$statParams;
            Function0<Unit> function0 = new Function0() { // from class: com.vk.id.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = VKID$authorize$6$1$onAuthResult$1.invokeSuspend$lambda$0(VKIDAuthParams.this, statParams);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            if (authResultHandler.handle$vkid_release(authResult, function0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.getPerformanceTracker().endTracking(this.$performanceKey);
        interfaceC3394a = this.this$0.requestMutex;
        if (interfaceC3394a.b()) {
            interfaceC3394a2 = this.this$0.requestMutex;
            interfaceC3394a2.c(null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VKID$authorize$6$1$onAuthResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
