package ru.ozon.app.android.action;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class WidgetActionHandlerKt$WidgetActionHandlerBuilder$3 extends AbstractC7737t implements Function1<AtomAction.OpenNestedPage, Unit> {
    final /* synthetic */ ComposerNavigator $navigator;
    final /* synthetic */ ComposerScreenConfig.BottomSheetConfig $sheetConfig;
    final /* synthetic */ Function0<C7854a> $widgetViewItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WidgetActionHandlerKt$WidgetActionHandlerBuilder$3(ComposerNavigator composerNavigator, Function0<? extends C7854a> function0, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        super(1);
        this.$navigator = composerNavigator;
        this.$widgetViewItem = function0;
        this.$sheetConfig = bottomSheetConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.OpenNestedPage openNestedPage) {
        invoke2(openNestedPage);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.OpenNestedPage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WidgetActionHandlerKt.openNestedPage(this.$navigator, it, this.$widgetViewItem.invoke(), this.$sheetConfig);
    }
}
