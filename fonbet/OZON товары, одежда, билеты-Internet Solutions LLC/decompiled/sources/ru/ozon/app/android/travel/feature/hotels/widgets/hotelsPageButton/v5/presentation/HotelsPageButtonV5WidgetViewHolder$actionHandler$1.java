package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsPageButtonV5WidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ i $container;
    final /* synthetic */ HotelsPageButtonV5WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageButtonV5WidgetViewHolder$actionHandler$1(i iVar, HotelsPageButtonV5WidgetViewHolder hotelsPageButtonV5WidgetViewHolder) {
        super(1);
        this.$container = iVar;
        this.this$0 = hotelsPageButtonV5WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        int scrollOffset;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z11 = false;
        if (action instanceof AtomAction.ScrollToWidgetByKey) {
            InterfaceC7851b M11 = this.$container.M();
            int widgetKey = ((AtomAction.ScrollToWidgetByKey) action).getWidgetKey();
            scrollOffset = this.this$0.getScrollOffset();
            M11.o(widgetKey, scrollOffset, true, false);
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
