package ru.ozon.app.android.product.skuthinscroll.presentation;

import Sc.s;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.product.databinding.WidgetSkuThinScrollBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder$observeRefresh$2", f = "SkuThinScrollViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SkuThinScrollViewHolder$observeRefresh$2 extends j implements Function2<A00.a, kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SkuThinScrollViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuThinScrollViewHolder$observeRefresh$2(SkuThinScrollViewHolder skuThinScrollViewHolder, kotlin.coroutines.d<? super SkuThinScrollViewHolder$observeRefresh$2> dVar) {
        super(2, dVar);
        this.this$0 = skuThinScrollViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SkuThinScrollViewHolder$observeRefresh$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(A00.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((SkuThinScrollViewHolder$observeRefresh$2) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetSkuThinScrollBinding widgetSkuThinScrollBinding;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        widgetSkuThinScrollBinding = this.this$0.binding;
        RecyclerView.o layoutManager = widgetSkuThinScrollBinding.itemsRv.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
        return Unit.f71690a;
    }
}
