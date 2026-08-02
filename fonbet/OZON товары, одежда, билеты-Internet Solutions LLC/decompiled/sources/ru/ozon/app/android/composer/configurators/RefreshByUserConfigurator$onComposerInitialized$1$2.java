package ru.ozon.app.android.composer.configurators;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.authEvents.AlreadyAuthEvents;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$2", f = "RefreshByUserConfigurator.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class RefreshByUserConfigurator$onComposerInitialized$1$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ RefreshByUserConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshByUserConfigurator$onComposerInitialized$1$2(RefreshByUserConfigurator refreshByUserConfigurator, d<? super RefreshByUserConfigurator$onComposerInitialized$1$2> dVar) {
        super(2, dVar);
        this.this$0 = refreshByUserConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RefreshByUserConfigurator$onComposerInitialized$1$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AlreadyAuthEvents alreadyAuthEvents;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            alreadyAuthEvents = this.this$0.alreadyAuthEvents;
            InterfaceC2395h a11 = C5427n.a(alreadyAuthEvents.getFlow(), this.this$0.getOwner().getLifecycle(), AbstractC5434v.b.CREATED);
            final RefreshByUserConfigurator refreshByUserConfigurator = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$2.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Unit) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(Unit unit, d<? super Unit> dVar) {
                    RefreshByUserConfigurator.this.refreshPage();
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
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
        return ((RefreshByUserConfigurator$onComposerInitialized$1$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
