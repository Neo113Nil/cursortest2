package ru.ozon.app.android.action;

import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/action/DismissAndRefreshAndScroll;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class WidgetActionHandlerKt$WidgetActionHandlerBuilder$9 extends AbstractC7737t implements Function1<DismissAndRefreshAndScroll, Unit> {
    final /* synthetic */ Tg.a $actionNavigator;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ ComposerNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetActionHandlerKt$WidgetActionHandlerBuilder$9(ComposerNavigator composerNavigator, C4911f c4911f, Tg.a aVar) {
        super(1);
        this.$navigator = composerNavigator;
        this.$container = c4911f;
        this.$actionNavigator = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DismissAndRefreshAndScroll dismissAndRefreshAndScroll) {
        invoke2(dismissAndRefreshAndScroll);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DismissAndRefreshAndScroll action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$navigator.popBackStack();
        ComposerExtKt.sendRefreshToTargetFragment$default(this.$container, action.getLink(), null, this.$actionNavigator, action.getScrollTo(), 2, null);
    }
}
