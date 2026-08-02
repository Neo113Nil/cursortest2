package com.vk.id;

import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import com.vk.id.internal.user.UserDataFetcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LSc/r;", "Lcom/vk/id/VKIDUser;", "<anonymous>", "()LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.VKID$fetchUserData$3", f = "VKID.kt", l = {686}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKID$fetchUserData$3 extends j implements Function1<d<? super r<? extends VKIDUser>>, Object> {
    int label;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKID$fetchUserData$3(VKID vkid, d<? super VKID$fetchUserData$3> dVar) {
        super(1, dVar);
        this.this$0 = vkid;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new VKID$fetchUserData$3(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(d<? super r<? extends VKIDUser>> dVar) {
        return invoke2((d<? super r<VKIDUser>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            r.Companion companion = r.INSTANCE;
            interfaceC4008j = this.this$0.userDataFetcher;
            UserDataFetcher userDataFetcher = (UserDataFetcher) interfaceC4008j.getValue();
            this.label = 1;
            obj = userDataFetcher.fetchUserData(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return r.a(obj);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(d<? super r<VKIDUser>> dVar) {
        return ((VKID$fetchUserData$3) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
