package com.vk.id;

import Sc.s;
import com.vk.id.auth.VKIDAuthCallback;
import com.vk.id.auth.VKIDAuthParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.VKID$authorize$2", f = "VKID.kt", l = {420}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKID$authorize$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ VKIDAuthCallback $callback;
    final /* synthetic */ VKIDAuthParams $params;
    int label;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKID$authorize$2(VKID vkid, VKIDAuthCallback vKIDAuthCallback, VKIDAuthParams vKIDAuthParams, d<? super VKID$authorize$2> dVar) {
        super(2, dVar);
        this.this$0 = vkid;
        this.$callback = vKIDAuthCallback;
        this.$params = vKIDAuthParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VKID$authorize$2(this.this$0, this.$callback, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            VKID vkid = this.this$0;
            VKIDAuthCallback vKIDAuthCallback = this.$callback;
            VKIDAuthParams vKIDAuthParams = this.$params;
            this.label = 1;
            if (vkid.authorize(vKIDAuthCallback, vKIDAuthParams, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VKID$authorize$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
