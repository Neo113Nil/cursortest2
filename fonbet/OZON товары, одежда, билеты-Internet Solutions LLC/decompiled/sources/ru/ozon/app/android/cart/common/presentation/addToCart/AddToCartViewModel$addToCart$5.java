package ru.ozon.app.android.cart.common.presentation.addToCart;

import androidx.lifecycle.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddToCartViewModel$addToCart$5 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ Map<String, String> $actionParams;
    final /* synthetic */ AddToCartViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartViewModel$addToCart$5(AddToCartViewModel addToCartViewModel, Map<String, String> map) {
        super(1);
        this.this$0 = addToCartViewModel;
        this.$actionParams = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable it) {
        V v11;
        Intrinsics.checkNotNullParameter(it, "it");
        v11 = this.this$0._state;
        v11.postValue(new AddToCartViewModel.Result(false, this.$actionParams));
        Lm0.a.f17149a.e(it);
    }
}
