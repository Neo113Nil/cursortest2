package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.AppBarController;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.ToolbarLayoutController;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "height1", "", "height2", "invoke", "(Ljava/lang/Integer;Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class LandingNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1 extends AbstractC7737t implements Function2<Integer, Integer, Unit> {
    final /* synthetic */ LandingNavBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LandingNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1(LandingNavBarWidgetViewHolder landingNavBarWidgetViewHolder) {
        super(2);
        this.this$0 = landingNavBarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke2(num, num2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num, Integer num2) {
        ToolbarLayoutController toolbarLayoutController;
        AppBarController appBarController;
        int i11;
        int i12;
        LandingNavBarWidgetViewHolder landingNavBarWidgetViewHolder = this.this$0;
        landingNavBarWidgetViewHolder.fixedPlaceholderHeight = num != null ? num.intValue() : landingNavBarWidgetViewHolder.fixedPlaceholderHeight;
        LandingNavBarWidgetViewHolder landingNavBarWidgetViewHolder2 = this.this$0;
        landingNavBarWidgetViewHolder2.contentPlaceholderHeight = num2 != null ? num2.intValue() : landingNavBarWidgetViewHolder2.contentPlaceholderHeight;
        toolbarLayoutController = this.this$0.toolbarLayoutController;
        appBarController = this.this$0.appBarController;
        int statusBarHeight = appBarController.getStatusBarHeight();
        i11 = this.this$0.fixedPlaceholderHeight;
        int i13 = i11 + statusBarHeight;
        i12 = this.this$0.contentPlaceholderHeight;
        toolbarLayoutController.updateToolbarLayoutHeight(i12 + i13);
    }
}
