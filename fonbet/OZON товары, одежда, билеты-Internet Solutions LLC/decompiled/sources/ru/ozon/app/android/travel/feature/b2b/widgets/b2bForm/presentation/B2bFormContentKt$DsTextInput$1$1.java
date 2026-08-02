package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import S0.A1;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;
import ru.ozon.uni.atoms.af.AtomAction;
import ve.EnumC10311b;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormContentKt$DsTextInput$1$1", f = "B2bFormContent.kt", l = {264}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class B2bFormContentKt$DsTextInput$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ w0<AtomAction> $actionFlow;
    final /* synthetic */ A1<Function1<AtomAction, Unit>> $currentActionHandler$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2bFormContentKt$DsTextInput$1$1(w0<AtomAction> w0Var, A1<? extends Function1<? super AtomAction, Unit>> a12, d<? super B2bFormContentKt$DsTextInput$1$1> dVar) {
        super(2, dVar);
        this.$actionFlow = w0Var;
        this.$currentActionHandler$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bFormContentKt$DsTextInput$1$1(this.$actionFlow, this.$currentActionHandler$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0<AtomAction> w0Var = this.$actionFlow;
            b.Companion companion = b.INSTANCE;
            InterfaceC2395h n11 = C2399j.n(w0Var, c.h(500L, EnumC10311b.MILLISECONDS));
            final A1<Function1<AtomAction, Unit>> a12 = this.$currentActionHandler$delegate;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormContentKt$DsTextInput$1$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((AtomAction) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(AtomAction atomAction, d<? super Unit> dVar) {
                    Function1 DsTextInput$lambda$19;
                    DsTextInput$lambda$19 = B2bFormContentKt.DsTextInput$lambda$19(a12);
                    DsTextInput$lambda$19.invoke(atomAction);
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (n11.collect(interfaceC2397i, this) == aVar) {
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
        return ((B2bFormContentKt$DsTextInput$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
