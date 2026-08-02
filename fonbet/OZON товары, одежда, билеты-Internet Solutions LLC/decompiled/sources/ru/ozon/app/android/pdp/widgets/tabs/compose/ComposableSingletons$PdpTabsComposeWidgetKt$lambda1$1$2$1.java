package ru.ozon.app.android.pdp.widgets.tabs.compose;

import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.tabs.core.PdpSelectedTabChangedUpdateKey;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.ComposableSingletons$PdpTabsComposeWidgetKt$lambda-1$1$2$1, reason: invalid class name */
/* loaded from: classes13.dex */
final class ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1$2$1 extends AbstractC7737t implements Function1<PdpTabsVO.Tab, Unit> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1$2$1(l lVar, InterfaceC7851b interfaceC7851b) {
        super(1);
        this.$tokenizedAnalytics = lVar;
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpTabsVO.Tab tab) {
        invoke2(tab);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpTabsVO.Tab item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TokenizedAnalyticsExtKt.processNonViewEvents(this.$tokenizedAnalytics, item.getTokenizedEvent());
        if (item.getIsSelected()) {
            return;
        }
        this.$controller.update(new PdpSelectedTabChangedUpdateKey(item.getGroupId()));
    }
}
