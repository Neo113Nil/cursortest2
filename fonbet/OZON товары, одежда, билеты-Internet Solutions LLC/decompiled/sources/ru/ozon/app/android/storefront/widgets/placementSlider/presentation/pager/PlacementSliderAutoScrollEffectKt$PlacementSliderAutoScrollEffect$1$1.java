package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.A1;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.M;
import y0.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1", f = "PlacementSliderAutoScrollEffect.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ A1<Boolean> $isDragged$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isManualScrollInProgress$delegate;
    final /* synthetic */ b0 $pagerState;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Boolean> {
        final /* synthetic */ b0 $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(b0 b0Var) {
            super(0);
            this.$pagerState = b0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$pagerState.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1(A1<Boolean> a12, InterfaceC3978p0<Boolean> interfaceC3978p0, b0 b0Var, d<? super PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1> dVar) {
        super(2, dVar);
        this.$isDragged$delegate = a12;
        this.$isManualScrollInProgress$delegate = interfaceC3978p0;
        this.$pagerState = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1(this.$isDragged$delegate, this.$isManualScrollInProgress$delegate, this.$pagerState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean PlacementSliderAutoScrollEffect$lambda$0;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            PlacementSliderAutoScrollEffect$lambda$0 = PlacementSliderAutoScrollEffectKt.PlacementSliderAutoScrollEffect$lambda$0(this.$isDragged$delegate);
            if (PlacementSliderAutoScrollEffect$lambda$0) {
                PlacementSliderAutoScrollEffectKt.PlacementSliderAutoScrollEffect$lambda$4(this.$isManualScrollInProgress$delegate, true);
                return Unit.f71690a;
            }
            InterfaceC2395h m11 = n1.m(new AnonymousClass1(this.$pagerState));
            final InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$isManualScrollInProgress$delegate;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit(((Boolean) obj2).booleanValue(), (d<? super Unit>) dVar);
                }

                public final Object emit(boolean z11, d<? super Unit> dVar) {
                    if (!z11) {
                        PlacementSliderAutoScrollEffectKt.PlacementSliderAutoScrollEffect$lambda$4(interfaceC3978p0, false);
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (((AbstractC2381a) m11).collect(interfaceC2397i, this) == aVar) {
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
        return ((PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
