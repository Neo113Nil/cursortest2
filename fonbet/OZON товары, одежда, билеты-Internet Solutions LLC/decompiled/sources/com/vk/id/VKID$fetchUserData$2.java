package com.vk.id;

import Sc.r;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "LSc/r;", "Lcom/vk/id/VKIDUser;", "<anonymous>", "(Ljava/lang/Throwable;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.VKID$fetchUserData$2", f = "VKID.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKID$fetchUserData$2 extends j implements Function2<Throwable, d<? super r<? extends VKIDUser>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    VKID$fetchUserData$2(d<? super VKID$fetchUserData$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VKID$fetchUserData$2 vKID$fetchUserData$2 = new VKID$fetchUserData$2(dVar);
        vKID$fetchUserData$2.L$0 = obj;
        return vKID$fetchUserData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Throwable th2, d<? super r<? extends VKIDUser>> dVar) {
        return invoke2(th2, (d<? super r<VKIDUser>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Throwable th2 = (Throwable) this.L$0;
        r.Companion companion = r.INSTANCE;
        return r.a(s.a(th2));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Throwable th2, d<? super r<VKIDUser>> dVar) {
        return ((VKID$fetchUserData$2) create(th2, dVar)).invokeSuspend(Unit.f71690a);
    }
}
