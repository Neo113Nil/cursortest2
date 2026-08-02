package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavBarWidgetViewHolder$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ NavBarVO $item;
    final /* synthetic */ NavBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarWidgetViewHolder$bind$1(NavBarWidgetViewHolder navBarWidgetViewHolder, NavBarVO navBarVO) {
        super(0);
        this.this$0 = navBarWidgetViewHolder;
        this.$item = navBarVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        i iVar;
        iVar = this.this$0.container;
        iVar.J().r().c(new a.F(this.$item.getIsAlwaysSolid() ? 0 : this.this$0.getNavBarHeight()));
    }
}
