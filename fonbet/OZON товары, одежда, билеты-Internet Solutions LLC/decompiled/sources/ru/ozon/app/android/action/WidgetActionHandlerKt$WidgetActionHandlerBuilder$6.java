package ru.ozon.app.android.action;

import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/action/RefreshAndScroll;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class WidgetActionHandlerKt$WidgetActionHandlerBuilder$6 extends AbstractC7737t implements Function1<RefreshAndScroll, Unit> {
    final /* synthetic */ Tg.a $actionNavigator;
    final /* synthetic */ InterfaceC7851b $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetActionHandlerKt$WidgetActionHandlerBuilder$6(InterfaceC7851b interfaceC7851b, Tg.a aVar) {
        super(1);
        this.$controller = interfaceC7851b;
        this.$actionNavigator = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RefreshAndScroll refreshAndScroll) {
        invoke2(refreshAndScroll);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RefreshAndScroll action) {
        h.b scrollOneTimePostProcessing;
        Intrinsics.checkNotNullParameter(action, "action");
        InterfaceC7851b interfaceC7851b = this.$controller;
        String link = action.getLink();
        scrollOneTimePostProcessing = WidgetActionHandlerKt.getScrollOneTimePostProcessing(this.$actionNavigator, action.getScrollTo());
        InterfaceC7851b.a.a(interfaceC7851b, link, null, null, scrollOneTimePostProcessing, 6);
    }
}
