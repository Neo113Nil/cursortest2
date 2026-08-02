package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavBarWidgetViewHolder$bind$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ k $vh;
    final /* synthetic */ NavBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarWidgetViewHolder$bind$2$1$1(NavBarWidgetViewHolder navBarWidgetViewHolder, k kVar) {
        super(0);
        this.this$0 = navBarWidgetViewHolder;
        this.$vh = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View view;
        view = this.this$0.gradientView;
        k kVar = this.$vh;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.width;
        int measuredHeight = kVar.itemView.getMeasuredHeight();
        layoutParams.height = measuredHeight;
        if (i11 == measuredHeight && i12 == layoutParams.width) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }
}
