package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarWidgetViewHolder$onWidgetCreated$3", f = "NavBarWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class NavBarWidgetViewHolder$onWidgetCreated$3 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ NavBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarWidgetViewHolder$onWidgetCreated$3(NavBarWidgetViewHolder navBarWidgetViewHolder, d<? super NavBarWidgetViewHolder$onWidgetCreated$3> dVar) {
        super(2, dVar);
        this.this$0 = navBarWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NavBarWidgetViewHolder$onWidgetCreated$3 navBarWidgetViewHolder$onWidgetCreated$3 = new NavBarWidgetViewHolder$onWidgetCreated$3(this.this$0, dVar);
        navBarWidgetViewHolder$onWidgetCreated$3.Z$0 = ((Boolean) obj).booleanValue();
        return navBarWidgetViewHolder$onWidgetCreated$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.updateState(this.Z$0);
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((NavBarWidgetViewHolder$onWidgetCreated$3) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
