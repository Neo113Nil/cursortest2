package com.vk.id.group.subscription.compose.ui;

import S0.A1;
import S0.InterfaceC3978p0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$LoadedState$1$1", f = "GroupSubscriptionSheet.kt", l = {377}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionSheetKt$LoadedState$1$1 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $once$delegate;
    final /* synthetic */ A1<Function1<kotlin.coroutines.d<? super Unit>, Object>> $rememberedSaveDisplay$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GroupSubscriptionSheetKt$LoadedState$1$1(InterfaceC3978p0<Boolean> interfaceC3978p0, A1<? extends Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>> a12, kotlin.coroutines.d<? super GroupSubscriptionSheetKt$LoadedState$1$1> dVar) {
        super(2, dVar);
        this.$once$delegate = interfaceC3978p0;
        this.$rememberedSaveDisplay$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new GroupSubscriptionSheetKt$LoadedState$1$1(this.$once$delegate, this.$rememberedSaveDisplay$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean LoadedState$lambda$36;
        Function1 LoadedState$lambda$38;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            LoadedState$lambda$36 = GroupSubscriptionSheetKt.LoadedState$lambda$36(this.$once$delegate);
            if (LoadedState$lambda$36) {
                LoadedState$lambda$38 = GroupSubscriptionSheetKt.LoadedState$lambda$38(this.$rememberedSaveDisplay$delegate);
                this.label = 1;
                if (LoadedState$lambda$38.invoke(this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        GroupSubscriptionSheetKt.LoadedState$lambda$37(this.$once$delegate, false);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((GroupSubscriptionSheetKt$LoadedState$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
