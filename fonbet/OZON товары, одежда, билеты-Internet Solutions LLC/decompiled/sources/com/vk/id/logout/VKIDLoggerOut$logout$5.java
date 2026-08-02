package com.vk.id.logout;

import Sc.r;
import Sc.s;
import Wc.a;
import com.vk.id.internal.api.VKIDApiService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "LSc/r;", "", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.logout.VKIDLoggerOut$logout$5", f = "VKIDLoggerOut.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKIDLoggerOut$logout$5 extends j implements Function2<M, d<? super r<? extends Unit>>, Object> {
    final /* synthetic */ String $clientId;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ VKIDLoggerOut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKIDLoggerOut$logout$5(VKIDLoggerOut vKIDLoggerOut, String str, String str2, String str3, d<? super VKIDLoggerOut$logout$5> dVar) {
        super(2, dVar);
        this.this$0 = vKIDLoggerOut;
        this.$token = str;
        this.$clientId = str2;
        this.$deviceId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VKIDLoggerOut$logout$5(this.this$0, this.$token, this.$clientId, this.$deviceId, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends Unit>> dVar) {
        return invoke2(m11, (d<? super r<Unit>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VKIDApiService vKIDApiService;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        vKIDApiService = this.this$0.api;
        return r.a(vKIDApiService.logout(this.$token, this.$clientId, this.$deviceId).mo52executed1pmJ48());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<Unit>> dVar) {
        return ((VKIDLoggerOut$logout$5) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
