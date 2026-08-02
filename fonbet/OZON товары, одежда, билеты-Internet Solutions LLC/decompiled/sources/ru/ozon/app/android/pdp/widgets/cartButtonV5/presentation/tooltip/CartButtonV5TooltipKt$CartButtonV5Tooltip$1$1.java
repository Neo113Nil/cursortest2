package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.tooltip;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.tooltip.CartButtonV5TooltipKt$CartButtonV5Tooltip$1$1", f = "CartButtonV5Tooltip.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CartButtonV5TooltipKt$CartButtonV5Tooltip$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CartButtonV5DTO.CartButton.Button.Tooltip $dto;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5TooltipKt$CartButtonV5Tooltip$1$1(boolean z11, CartButtonV5DTO.CartButton.Button.Tooltip tooltip, Function0<Unit> function0, d<? super CartButtonV5TooltipKt$CartButtonV5Tooltip$1$1> dVar) {
        super(2, dVar);
        this.$isVisible = z11;
        this.$dto = tooltip;
        this.$onDismissRequest = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartButtonV5TooltipKt$CartButtonV5Tooltip$1$1(this.$isVisible, this.$dto, this.$onDismissRequest, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (!this.$isVisible) {
                return Unit.f71690a;
            }
            long tooltipDuration = this.$dto.getTooltipDuration();
            this.label = 1;
            if (Y.b(tooltipDuration, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Function0<Unit> function0 = this.$onDismissRequest;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartButtonV5TooltipKt$CartButtonV5Tooltip$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
