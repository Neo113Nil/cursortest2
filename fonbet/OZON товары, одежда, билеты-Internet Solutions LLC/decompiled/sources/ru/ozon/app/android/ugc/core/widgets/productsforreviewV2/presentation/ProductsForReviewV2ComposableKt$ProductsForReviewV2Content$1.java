package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ProductsForReviewV2Content$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onCardClick;
    final /* synthetic */ Function0<Unit> $onTimerFinish;
    final /* synthetic */ ProductForReviewV2VI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$ProductsForReviewV2Content$1(ProductForReviewV2VI productForReviewV2VI, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0) {
        super(2);
        this.$state = productForReviewV2VI;
        this.$onCardClick = function1;
        this.$onTimerFinish = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            ProductsForReviewV2ComposableKt.ProductCardContent(this.$state, this.$onCardClick, this.$onTimerFinish, interfaceC3967k, 0);
        }
    }
}
