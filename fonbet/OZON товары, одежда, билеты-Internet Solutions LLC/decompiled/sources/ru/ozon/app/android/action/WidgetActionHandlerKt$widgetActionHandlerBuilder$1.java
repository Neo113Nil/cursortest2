package ru.ozon.app.android.action;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.C7854a;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll20/a;", "invoke", "()Ll20/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class WidgetActionHandlerKt$widgetActionHandlerBuilder$1 extends AbstractC7737t implements Function0<C7854a> {
    final /* synthetic */ k<?> $this_widgetActionHandlerBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetActionHandlerKt$widgetActionHandlerBuilder$1(k<?> kVar) {
        super(0);
        this.$this_widgetActionHandlerBuilder = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7854a invoke() {
        l viewItem = this.$this_widgetActionHandlerBuilder.getViewItem();
        if (viewItem != null) {
            return viewItem;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
