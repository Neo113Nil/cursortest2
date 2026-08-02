package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;
import we0.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/m;", "it", "", "<anonymous>", "(Lwe0/m;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation.HotelsPageMapPreviewWidgetViewHolder$observeActions$1", f = "HotelsPageMapPreviewWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsPageMapPreviewWidgetViewHolder$observeActions$1 extends j implements Function2<m, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotelsPageMapPreviewWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageMapPreviewWidgetViewHolder$observeActions$1(HotelsPageMapPreviewWidgetViewHolder hotelsPageMapPreviewWidgetViewHolder, d<? super HotelsPageMapPreviewWidgetViewHolder$observeActions$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsPageMapPreviewWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsPageMapPreviewWidgetViewHolder$observeActions$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomAction selectAction;
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        HotelsPageMapPreviewVO boundData = this.this$0.getBoundData();
        if (boundData != null && (selectAction = boundData.getSelectAction()) != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(selectAction);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m mVar, d<? super Unit> dVar) {
        return ((HotelsPageMapPreviewWidgetViewHolder$observeActions$1) create(mVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
