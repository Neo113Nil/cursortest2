package ru.ozon.uni.foundation.utils;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import m0.Y;
import t0.n;
import t0.o;
import t0.s;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.uni.foundation.utils.TransitionsKt$rememberIndicationTransition$2$1", f = "Transitions.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TransitionsKt$rememberIndicationTransition$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $debounce;
    final /* synthetic */ InterfaceC3978p0<Boolean> $needReset$delegate;
    final /* synthetic */ o $this_rememberIndicationTransition;
    final /* synthetic */ Y<Boolean> $transition;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionsKt$rememberIndicationTransition$2$1(o oVar, long j11, Y<Boolean> y11, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super TransitionsKt$rememberIndicationTransition$2$1> dVar) {
        super(2, dVar);
        this.$this_rememberIndicationTransition = oVar;
        this.$debounce = j11;
        this.$transition = y11;
        this.$needReset$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TransitionsKt$rememberIndicationTransition$2$1(this.$this_rememberIndicationTransition, this.$debounce, this.$transition, this.$needReset$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<n> interactions = this.$this_rememberIndicationTransition.getInteractions();
            long j11 = this.$debounce;
            b.INSTANCE.getClass();
            if (!b.g(j11, 0L)) {
                interactions = C2399j.n(interactions, j11);
            }
            final Y<Boolean> y11 = this.$transition;
            final InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$needReset$delegate;
            InterfaceC2397i<? super n> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.uni.foundation.utils.TransitionsKt$rememberIndicationTransition$2$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((n) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(n nVar, d<? super Unit> dVar) {
                    if (nVar instanceof s.b) {
                        if (y11.h()) {
                            y11.i(Boolean.TRUE);
                        }
                    } else if ((nVar instanceof s.c) || (nVar instanceof s.a)) {
                        if (y11.h()) {
                            y11.i(Boolean.FALSE);
                        } else {
                            TransitionsKt.rememberIndicationTransition_FbhrOv8$lambda$2(interfaceC3978p0, true);
                        }
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TransitionsKt$rememberIndicationTransition$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
