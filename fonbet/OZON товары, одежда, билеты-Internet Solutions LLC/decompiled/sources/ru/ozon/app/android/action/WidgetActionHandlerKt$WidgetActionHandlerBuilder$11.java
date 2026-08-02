package ru.ozon.app.android.action;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ScrollToWidgetByKey;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class WidgetActionHandlerKt$WidgetActionHandlerBuilder$11 extends AbstractC7737t implements Function1<AtomAction.ScrollToWidgetByKey, Unit> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ FeatureChecker $featureChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetActionHandlerKt$WidgetActionHandlerBuilder$11(FeatureChecker featureChecker, InterfaceC7851b interfaceC7851b) {
        super(1);
        this.$featureChecker = featureChecker;
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ScrollToWidgetByKey scrollToWidgetByKey) {
        invoke2(scrollToWidgetByKey);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ScrollToWidgetByKey action) {
        Intrinsics.checkNotNullParameter(action, "action");
        WidgetActionHandlerKt.scrollToWidgetByKey(this.$featureChecker, this.$controller, action.getWidgetKey());
    }
}
