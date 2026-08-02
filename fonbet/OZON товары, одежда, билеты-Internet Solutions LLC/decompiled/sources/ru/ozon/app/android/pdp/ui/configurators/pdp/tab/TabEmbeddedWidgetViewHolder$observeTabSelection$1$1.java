package ru.ozon.app.android.pdp.ui.configurators.pdp.tab;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.PdpTabsSelectionState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/PdpTabsSelectionState$TabGroup;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder$observeTabSelection$1$1", f = "TabEmbeddedWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TabEmbeddedWidgetViewHolder$observeTabSelection$1$1 extends j implements Function2<PdpTabsSelectionState.TabGroup, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TabEmbeddedWidgetViewHolder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabEmbeddedWidgetViewHolder$observeTabSelection$1$1(TabEmbeddedWidgetViewHolder<T> tabEmbeddedWidgetViewHolder, d<? super TabEmbeddedWidgetViewHolder$observeTabSelection$1$1> dVar) {
        super(2, dVar);
        this.this$0 = tabEmbeddedWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TabEmbeddedWidgetViewHolder$observeTabSelection$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TabEmbeddedViewObject tabEmbeddedViewObject = (TabEmbeddedViewObject) this.this$0.getBoundData();
        if (tabEmbeddedViewObject != null) {
            this.this$0.bindIfVisible(tabEmbeddedViewObject);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PdpTabsSelectionState.TabGroup tabGroup, d<? super Unit> dVar) {
        return ((TabEmbeddedWidgetViewHolder$observeTabSelection$1$1) create(tabGroup, dVar)).invokeSuspend(Unit.f71690a);
    }
}
