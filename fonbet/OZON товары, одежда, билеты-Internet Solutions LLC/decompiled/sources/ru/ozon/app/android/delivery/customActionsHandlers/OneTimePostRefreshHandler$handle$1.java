package ru.ozon.app.android.delivery.customActionsHandlers;

import A00.a;
import Ae.AbstractC2381a;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.lifecycle.C5429p;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler$handle$1", f = "OneTimePostRefreshHandler.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OneTimePostRefreshHandler$handle$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneTimePostRefreshHandler this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAe/i;", "LA00/a;", "it", "", "<anonymous>", "(LAe/i;LA00/a;)Z"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler$handle$1$1", f = "OneTimePostRefreshHandler.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler$handle$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<InterfaceC2397i<? super a>, a, d<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super a> interfaceC2397i, a aVar, d<? super Boolean> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = interfaceC2397i;
            anonymousClass1.L$1 = aVar;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
                a aVar3 = (a) this.L$1;
                this.L$0 = aVar3;
                this.label = 1;
                if (interfaceC2397i.emit(aVar3, this) == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.L$0;
                s.b(obj);
            }
            return Boolean.valueOf(!Intrinsics.d(aVar, a.C2370k.f211a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneTimePostRefreshHandler$handle$1(OneTimePostRefreshHandler oneTimePostRefreshHandler, d<? super OneTimePostRefreshHandler$handle$1> dVar) {
        super(2, dVar);
        this.this$0 = oneTimePostRefreshHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OneTimePostRefreshHandler$handle$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            composerReferences = this.this$0.refs;
            InterfaceC2395h R11 = C2399j.R(C5429p.a(composerReferences.getController().getEvents()), new AnonymousClass1(null));
            InterfaceC2397i<a> onRefreshEvents = this.this$0.getOnRefreshEvents();
            this.label = 1;
            if (((AbstractC2381a) R11).collect(onRefreshEvents, this) == aVar) {
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
        return ((OneTimePostRefreshHandler$handle$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
