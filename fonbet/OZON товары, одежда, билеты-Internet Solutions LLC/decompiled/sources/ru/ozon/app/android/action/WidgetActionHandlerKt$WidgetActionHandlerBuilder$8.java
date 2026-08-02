package ru.ozon.app.android.action;

import a00.C4911f;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$DismissRefresh;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class WidgetActionHandlerKt$WidgetActionHandlerBuilder$8 extends AbstractC7737t implements Function1<AtomAction.DismissRefresh, Unit> {
    final /* synthetic */ Tg.a $actionNavigator;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ ComposerNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetActionHandlerKt$WidgetActionHandlerBuilder$8(ComposerNavigator composerNavigator, C4911f c4911f, Tg.a aVar) {
        super(1);
        this.$navigator = composerNavigator;
        this.$container = c4911f;
        this.$actionNavigator = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.DismissRefresh dismissRefresh) {
        invoke2(dismissRefresh);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.DismissRefresh action) {
        h.b scrollOneTimePostProcessing;
        Intrinsics.checkNotNullParameter(action, "action");
        this.$navigator.popBackStack();
        C4911f c4911f = this.$container;
        String link = action.getLink();
        scrollOneTimePostProcessing = WidgetActionHandlerKt.getScrollOneTimePostProcessing(this.$actionNavigator, action.getScrollPosition());
        ComposerExtKt.sendRefreshToTargetFragment$default(c4911f, link, scrollOneTimePostProcessing, null, null, 12, null);
    }
}
