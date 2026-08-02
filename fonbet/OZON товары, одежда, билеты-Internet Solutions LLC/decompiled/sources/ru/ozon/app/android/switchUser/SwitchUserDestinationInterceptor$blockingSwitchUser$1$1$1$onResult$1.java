package ru.ozon.app.android.switchUser;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import od0.InterfaceC8695a;
import ru.ozon.app.android.account.authEvents.data.AuthStatusRepository;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lod0/a;", "it", "", "invoke", "(Lod0/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1$onResult$1 extends AbstractC7737t implements Function1<InterfaceC8695a, Unit> {
    final /* synthetic */ d<InterfaceC8695a> $continuation;
    final /* synthetic */ SwitchUserDestinationInterceptor this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1$onResult$1$1", f = "SwitchUserDestinationInterceptor.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1$onResult$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ SwitchUserDestinationInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SwitchUserDestinationInterceptor switchUserDestinationInterceptor, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = switchUserDestinationInterceptor;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AuthStatusRepository userStatusRepository;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                userStatusRepository = this.this$0.getUserStatusRepository();
                this.label = 1;
                if (userStatusRepository.m455syncOnSwitchUserIoAF18A(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                ((r) obj).getClass();
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1$onResult$1(SwitchUserDestinationInterceptor switchUserDestinationInterceptor, d<? super InterfaceC8695a> dVar) {
        super(1);
        this.this$0 = switchUserDestinationInterceptor;
        this.$continuation = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8695a interfaceC8695a) {
        invoke2(interfaceC8695a);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8695a it) {
        M coroutineScope;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof InterfaceC8695a.d) {
            coroutineScope = this.this$0.getCoroutineScope();
            C10727i.c(coroutineScope, null, null, new AnonymousClass1(this.this$0, null), 3);
        }
        d<InterfaceC8695a> dVar = this.$continuation;
        r.Companion companion = r.INSTANCE;
        dVar.resumeWith(it);
    }
}
