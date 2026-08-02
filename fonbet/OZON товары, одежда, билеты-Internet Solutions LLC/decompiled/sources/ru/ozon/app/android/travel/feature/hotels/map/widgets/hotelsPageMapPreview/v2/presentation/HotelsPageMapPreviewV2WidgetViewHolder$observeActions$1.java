package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import we0.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/m;", "it", "", "<anonymous>", "(Lwe0/m;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2WidgetViewHolder$observeActions$1", f = "HotelsPageMapPreviewV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsPageMapPreviewV2WidgetViewHolder$observeActions$1 extends j implements Function2<m, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotelsPageMapPreviewV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageMapPreviewV2WidgetViewHolder$observeActions$1(HotelsPageMapPreviewV2WidgetViewHolder hotelsPageMapPreviewV2WidgetViewHolder, d<? super HotelsPageMapPreviewV2WidgetViewHolder$observeActions$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsPageMapPreviewV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsPageMapPreviewV2WidgetViewHolder$observeActions$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsPageMapPreviewV2VO.MapSettings map;
        AtomAction action;
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        HotelsPageMapPreviewV2VO boundData = this.this$0.getBoundData();
        if (boundData != null && (map = boundData.getMap()) != null && (action = map.getAction()) != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m mVar, d<? super Unit> dVar) {
        return ((HotelsPageMapPreviewV2WidgetViewHolder$observeActions$1) create(mVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
