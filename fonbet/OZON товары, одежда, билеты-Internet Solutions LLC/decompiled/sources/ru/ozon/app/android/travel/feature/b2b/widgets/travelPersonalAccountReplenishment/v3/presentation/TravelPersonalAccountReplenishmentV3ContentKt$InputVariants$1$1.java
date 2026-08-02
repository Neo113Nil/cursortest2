package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import Sc.s;
import Wc.a;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import n0.d0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation.TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$1$1", f = "TravelPersonalAccountReplenishmentV3Content.kt", l = {318}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ d0 $scrollState;
    final /* synthetic */ float $startPaddingPx;
    final /* synthetic */ Float $targetX;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$1$1(Float f7, float f11, d0 d0Var, d<? super TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$1$1> dVar) {
        super(2, dVar);
        this.$targetX = f7;
        this.$startPaddingPx = f11;
        this.$scrollState = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$1$1(this.$targetX, this.$startPaddingPx, this.$scrollState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Float f7 = this.$targetX;
            if (f7 != null) {
                int c11 = C6915b.c(f7.floatValue() - this.$startPaddingPx);
                if (c11 < 0) {
                    c11 = 0;
                }
                d0 d0Var = this.$scrollState;
                this.label = 1;
                if (d0.j(d0Var, c11, this) == aVar) {
                    return aVar;
                }
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
        return ((TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
