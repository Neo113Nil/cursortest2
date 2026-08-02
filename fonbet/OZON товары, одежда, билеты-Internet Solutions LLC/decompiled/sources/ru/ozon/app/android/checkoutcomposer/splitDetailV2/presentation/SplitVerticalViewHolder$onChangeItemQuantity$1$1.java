package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitVerticalViewHolder$onChangeItemQuantity$1$1", f = "SplitVerticalViewHolder.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SplitVerticalViewHolder$onChangeItemQuantity$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $debounceDelay;
    final /* synthetic */ Map<String, String> $modifiedParams;
    final /* synthetic */ SplitDetailV2VO.Split.Vertical.QuantityControl $quantity;
    int label;
    final /* synthetic */ SplitVerticalViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplitVerticalViewHolder$onChangeItemQuantity$1$1(int i11, SplitVerticalViewHolder splitVerticalViewHolder, SplitDetailV2VO.Split.Vertical.QuantityControl quantityControl, Map<String, String> map, d<? super SplitVerticalViewHolder$onChangeItemQuantity$1$1> dVar) {
        super(2, dVar);
        this.$debounceDelay = i11;
        this.this$0 = splitVerticalViewHolder;
        this.$quantity = quantityControl;
        this.$modifiedParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SplitVerticalViewHolder$onChangeItemQuantity$1$1(this.$debounceDelay, this.this$0, this.$quantity, this.$modifiedParams, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long j11 = this.$debounceDelay;
            this.label = 1;
            if (Y.b(j11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        function1 = this.this$0.actionHandler;
        function1.invoke(AtomAction.Click.copy$default((AtomAction.Click) this.$quantity.getAction(), null, null, null, this.$modifiedParams, null, null, 55, null));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SplitVerticalViewHolder$onChangeItemQuantity$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
