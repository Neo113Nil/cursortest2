package com.vk.id.logout;

import Sc.s;
import Wc.a;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.logout.VKIDLoggerOut$logout$4$1", f = "VKIDLoggerOut.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKIDLoggerOut$logout$4$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ VKIDLoggerOut $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKIDLoggerOut$logout$4$1(VKIDLoggerOut vKIDLoggerOut, d<? super VKIDLoggerOut$logout$4$1> dVar) {
        super(2, dVar);
        this.$this_run = vKIDLoggerOut;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VKIDLoggerOut$logout$4$1(this.$this_run, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InternalVKIDTokenStorage internalVKIDTokenStorage;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        internalVKIDTokenStorage = this.$this_run.tokenStorage;
        internalVKIDTokenStorage.clear$vkid_release();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VKIDLoggerOut$logout$4$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
