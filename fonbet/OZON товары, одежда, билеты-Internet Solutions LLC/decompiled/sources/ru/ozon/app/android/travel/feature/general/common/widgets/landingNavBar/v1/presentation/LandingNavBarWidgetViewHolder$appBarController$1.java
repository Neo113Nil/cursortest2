package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.ToolbarController;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.ToolbarLayoutController;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "statusBarHeight", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class LandingNavBarWidgetViewHolder$appBarController$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ LandingNavBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LandingNavBarWidgetViewHolder$appBarController$1(LandingNavBarWidgetViewHolder landingNavBarWidgetViewHolder) {
        super(1);
        this.this$0 = landingNavBarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ToolbarController toolbarController;
        ToolbarLayoutController toolbarLayoutController;
        int i12;
        int i13;
        toolbarController = this.this$0.toolbarController;
        toolbarController.updateTopPadding(i11);
        toolbarLayoutController = this.this$0.toolbarLayoutController;
        i12 = this.this$0.fixedPlaceholderHeight;
        int i14 = i12 + i11;
        i13 = this.this$0.contentPlaceholderHeight;
        toolbarLayoutController.updateToolbarLayoutHeight(i13 + i14);
    }
}
