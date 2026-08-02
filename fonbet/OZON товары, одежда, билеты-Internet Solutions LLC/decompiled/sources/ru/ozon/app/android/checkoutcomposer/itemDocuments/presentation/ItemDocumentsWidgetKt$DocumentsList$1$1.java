package ru.ozon.app.android.checkoutcomposer.itemDocuments.presentation;

import Sc.s;
import Wc.a;
import hd.C6915b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import n0.d0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.itemDocuments.presentation.ItemDocumentsWidgetKt$DocumentsList$1$1", f = "ItemDocumentsWidget.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ItemDocumentsWidgetKt$DocumentsList$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<Integer, Integer> $itemPositions;
    final /* synthetic */ d0 $scrollState;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ float $startPaddingPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ItemDocumentsWidgetKt$DocumentsList$1$1(int i11, Map<Integer, Integer> map, d0 d0Var, float f7, d<? super ItemDocumentsWidgetKt$DocumentsList$1$1> dVar) {
        super(2, dVar);
        this.$selectedIndex = i11;
        this.$itemPositions = map;
        this.$scrollState = d0Var;
        this.$startPaddingPx = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ItemDocumentsWidgetKt$DocumentsList$1$1(this.$selectedIndex, this.$itemPositions, this.$scrollState, this.$startPaddingPx, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            int i12 = this.$selectedIndex;
            if (i12 != -1 && (num = this.$itemPositions.get(new Integer(i12))) != null) {
                d0 d0Var = this.$scrollState;
                int intValue = num.intValue() - C6915b.c(this.$startPaddingPx);
                this.label = 1;
                if (d0Var.n(intValue, this) == aVar) {
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
        return ((ItemDocumentsWidgetKt$DocumentsList$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
