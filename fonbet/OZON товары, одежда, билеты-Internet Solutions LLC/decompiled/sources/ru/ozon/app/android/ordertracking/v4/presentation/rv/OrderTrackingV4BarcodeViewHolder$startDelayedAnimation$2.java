package ru.ozon.app.android.ordertracking.v4.presentation.rv;

import Sc.s;
import Wc.a;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ordertracking.databinding.ItemOrderTrackingV4BarcodeBinding;
import ru.ozon.app.android.ordertracking.v4.presentation.util.BarcodeAnimation;
import ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4BarcodeViewHolder$startDelayedAnimation$2", f = "OrderTrackingV4BarcodeViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OrderTrackingV4BarcodeViewHolder$startDelayedAnimation$2 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderTrackingV4BarcodeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingV4BarcodeViewHolder$startDelayedAnimation$2(OrderTrackingV4BarcodeViewHolder orderTrackingV4BarcodeViewHolder, d<? super OrderTrackingV4BarcodeViewHolder$startDelayedAnimation$2> dVar) {
        super(2, dVar);
        this.this$0 = orderTrackingV4BarcodeViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderTrackingV4BarcodeViewHolder$startDelayedAnimation$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ItemOrderTrackingV4BarcodeBinding itemOrderTrackingV4BarcodeBinding;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        BarcodeAnimation barcodeAnimation = BarcodeAnimation.INSTANCE;
        D a11 = K.a(this.this$0);
        itemOrderTrackingV4BarcodeBinding = this.this$0.binding;
        StretchFrameLayout constraintLayout = itemOrderTrackingV4BarcodeBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        BarcodeAnimation.startWidthBounceAnimation$default(barcodeAnimation, a11, constraintLayout, 0, 2, null);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((OrderTrackingV4BarcodeViewHolder$startDelayedAnimation$2) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
