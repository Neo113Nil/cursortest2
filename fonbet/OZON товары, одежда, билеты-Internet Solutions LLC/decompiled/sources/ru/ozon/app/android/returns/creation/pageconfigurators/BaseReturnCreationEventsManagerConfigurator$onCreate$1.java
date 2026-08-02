package ru.ozon.app.android.returns.creation.pageconfigurators;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Sc.InterfaceC4003e;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEvent;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.pageconfigurators.BaseReturnCreationEventsManagerConfigurator$onCreate$1", f = "BaseReturnCreationEventsManagerConfigurator.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BaseReturnCreationEventsManagerConfigurator$onCreate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseReturnCreationEventsManagerConfigurator<T> this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.pageconfigurators.BaseReturnCreationEventsManagerConfigurator$onCreate$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 implements InterfaceC2397i, InterfaceC7732n {
        final /* synthetic */ BaseReturnCreationEventsManagerConfigurator<T> $tmp0;

        AnonymousClass1(BaseReturnCreationEventsManagerConfigurator<T> baseReturnCreationEventsManagerConfigurator) {
            this.$tmp0 = baseReturnCreationEventsManagerConfigurator;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((ReturnCreationEvent) obj, (d<? super Unit>) dVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return new C7719a(2, this.$tmp0, BaseReturnCreationEventsManagerConfigurator.class, "onEventsReceived", "onEventsReceived(Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final Object emit(ReturnCreationEvent returnCreationEvent, d<? super Unit> dVar) {
            Object invokeSuspend$onEventsReceived = BaseReturnCreationEventsManagerConfigurator$onCreate$1.invokeSuspend$onEventsReceived(this.$tmp0, returnCreationEvent, dVar);
            return invokeSuspend$onEventsReceived == a.COROUTINE_SUSPENDED ? invokeSuspend$onEventsReceived : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseReturnCreationEventsManagerConfigurator$onCreate$1(BaseReturnCreationEventsManagerConfigurator<T> baseReturnCreationEventsManagerConfigurator, d<? super BaseReturnCreationEventsManagerConfigurator$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = baseReturnCreationEventsManagerConfigurator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$onEventsReceived(BaseReturnCreationEventsManagerConfigurator baseReturnCreationEventsManagerConfigurator, ReturnCreationEvent returnCreationEvent, d dVar) {
        baseReturnCreationEventsManagerConfigurator.onEventsReceived(returnCreationEvent);
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseReturnCreationEventsManagerConfigurator$onCreate$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReturnCreationEventManager returnCreationEventManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            returnCreationEventManager = ((BaseReturnCreationEventsManagerConfigurator) this.this$0).returnCreationEventManager;
            B0<ReturnCreationEvent> events = returnCreationEventManager.getEvents();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (events.collect(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BaseReturnCreationEventsManagerConfigurator$onCreate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
