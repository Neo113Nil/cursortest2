package ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import t0.n;
import t0.q;
import t0.s;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.presentation.AviaAddBonusCardFormContentKt$AirlineInput$1$1", f = "AviaAddBonusCardFormContent.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaAddBonusCardFormContentKt$AirlineInput$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ CommonInputV2VO.SelectorV2 $airline;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ Function0<Unit> $onHideKeyboard;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AviaAddBonusCardFormContentKt$AirlineInput$1$1(q qVar, Function0<Unit> function0, CommonInputV2VO.SelectorV2 selectorV2, Function1<? super AtomAction, Unit> function1, d<? super AviaAddBonusCardFormContentKt$AirlineInput$1$1> dVar) {
        super(2, dVar);
        this.$interactionSource = qVar;
        this.$onHideKeyboard = function0;
        this.$airline = selectorV2;
        this.$actionHandler = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AviaAddBonusCardFormContentKt$AirlineInput$1$1(this.$interactionSource, this.$onHideKeyboard, this.$airline, this.$actionHandler, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<n> interactions = this.$interactionSource.getInteractions();
            final Function0<Unit> function0 = this.$onHideKeyboard;
            final CommonInputV2VO.SelectorV2 selectorV2 = this.$airline;
            final Function1<AtomAction, Unit> function1 = this.$actionHandler;
            InterfaceC2397i<? super n> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.presentation.AviaAddBonusCardFormContentKt$AirlineInput$1$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((n) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(n nVar, d<? super Unit> dVar) {
                    if (nVar instanceof s.c) {
                        function0.invoke();
                        AtomAction onClick = selectorV2.getOnClick();
                        if (onClick != null) {
                            function1.invoke(onClick);
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
        return ((AviaAddBonusCardFormContentKt$AirlineInput$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
