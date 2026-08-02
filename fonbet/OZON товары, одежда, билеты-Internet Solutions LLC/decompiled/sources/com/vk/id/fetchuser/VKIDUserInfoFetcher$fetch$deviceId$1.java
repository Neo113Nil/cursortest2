package com.vk.id.fetchuser;

import Sc.s;
import Wc.a;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.fetchuser.VKIDUserInfoFetcher$fetch$deviceId$1", f = "VKIDUserInfoFetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKIDUserInfoFetcher$fetch$deviceId$1 extends j implements Function2<M, d<? super String>, Object> {
    int label;
    final /* synthetic */ VKIDUserInfoFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKIDUserInfoFetcher$fetch$deviceId$1(VKIDUserInfoFetcher vKIDUserInfoFetcher, d<? super VKIDUserInfoFetcher$fetch$deviceId$1> dVar) {
        super(2, dVar);
        this.this$0 = vKIDUserInfoFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VKIDUserInfoFetcher$fetch$deviceId$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        internalVKIDDeviceIdProvider = this.this$0.deviceIdProvider;
        return internalVKIDDeviceIdProvider.getDeviceId$vkid_release();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super String> dVar) {
        return ((VKIDUserInfoFetcher$fetch$deviceId$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
