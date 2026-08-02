package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollUpdate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "update", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1", f = "HotelsPageButtonV5WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1 extends j implements Function2<ScrollUpdate, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsPageButtonV5WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1(HotelsPageButtonV5WidgetViewHolder hotelsPageButtonV5WidgetViewHolder, d<? super HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsPageButtonV5WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1 hotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1 = new HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1(this.this$0, dVar);
        hotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1.L$0 = obj;
        return hotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.handleScrollUpdate((ScrollUpdate) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollUpdate scrollUpdate, d<? super Unit> dVar) {
        return ((HotelsPageButtonV5WidgetViewHolder$onWidgetCreated$1) create(scrollUpdate, dVar)).invokeSuspend(Unit.f71690a);
    }
}
