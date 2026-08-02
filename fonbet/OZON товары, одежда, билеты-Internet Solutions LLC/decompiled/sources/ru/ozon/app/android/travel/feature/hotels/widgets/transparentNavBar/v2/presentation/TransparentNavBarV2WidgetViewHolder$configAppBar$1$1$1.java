package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import Sc.s;
import Wc.a;
import androidx.core.view.C5353y0;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.view.TransparentNavBarV2View;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2WidgetViewHolder$configAppBar$1$1$1", f = "TransparentNavBarV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TransparentNavBarV2WidgetViewHolder$configAppBar$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C5353y0 $insets;
    int label;
    final /* synthetic */ TransparentNavBarV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransparentNavBarV2WidgetViewHolder$configAppBar$1$1$1(TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder, C5353y0 c5353y0, d<? super TransparentNavBarV2WidgetViewHolder$configAppBar$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = transparentNavBarV2WidgetViewHolder;
        this.$insets = c5353y0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TransparentNavBarV2WidgetViewHolder$configAppBar$1$1$1(this.this$0, this.$insets, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TransparentNavBarV2View navbarView;
        int i11;
        Integer num;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.this$0.getLifecycle().b() == AbstractC5434v.b.STARTED) {
            num = this.this$0.topInset;
            if (num != null) {
                return Unit.f71690a;
            }
        }
        TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder = this.this$0;
        Integer num2 = new Integer(this.$insets.f(1).f42127b);
        TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder2 = this.this$0;
        int intValue = num2.intValue();
        navbarView = transparentNavBarV2WidgetViewHolder2.getNavbarView();
        i11 = transparentNavBarV2WidgetViewHolder2.dp8;
        navbarView.setPadding(navbarView.getPaddingLeft(), i11 + intValue, navbarView.getPaddingRight(), navbarView.getPaddingBottom());
        transparentNavBarV2WidgetViewHolder.topInset = num2;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TransparentNavBarV2WidgetViewHolder$configAppBar$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
