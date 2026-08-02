package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)I"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileAsyncStateMeasurer$measure$1$1$deferredResults$1$1", f = "SmallTileAsyncStateMeasurer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SmallTileAsyncStateMeasurer$measure$1$1$deferredResults$1$1 extends j implements Function2<M, d<? super Integer>, Object> {
    final /* synthetic */ List<TileContentItem> $it;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ SmallTileAsyncStateMeasurer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SmallTileAsyncStateMeasurer$measure$1$1$deferredResults$1$1(SmallTileAsyncStateMeasurer smallTileAsyncStateMeasurer, List<? extends TileContentItem> list, int i11, d<? super SmallTileAsyncStateMeasurer$measure$1$1$deferredResults$1$1> dVar) {
        super(2, dVar);
        this.this$0 = smallTileAsyncStateMeasurer;
        this.$it = list;
        this.$width = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SmallTileAsyncStateMeasurer$measure$1$1$deferredResults$1$1(this.this$0, this.$it, this.$width, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int bindAndMeasureState;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        bindAndMeasureState = this.this$0.bindAndMeasureState(this.$it, this.$width);
        return new Integer(bindAndMeasureState);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Integer> dVar) {
        return ((SmallTileAsyncStateMeasurer$measure$1$1$deferredResults$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
