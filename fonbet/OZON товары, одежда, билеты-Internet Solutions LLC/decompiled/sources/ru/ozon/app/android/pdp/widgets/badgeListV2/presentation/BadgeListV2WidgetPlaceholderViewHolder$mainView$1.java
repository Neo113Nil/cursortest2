package ru.ozon.app.android.pdp.widgets.badgeListV2.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2ItemDecorator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BadgeListV2WidgetPlaceholderViewHolder$mainView$1 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ BadgeListV2ItemDecorator.PaddingConfig $decoratorConfig;
    final /* synthetic */ BadgeListV2WidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeListV2WidgetPlaceholderViewHolder$mainView$1(BadgeListV2WidgetPlaceholderViewHolder badgeListV2WidgetPlaceholderViewHolder, BadgeListV2ItemDecorator.PaddingConfig paddingConfig) {
        super(0);
        this.this$0 = badgeListV2WidgetPlaceholderViewHolder;
        this.$decoratorConfig = paddingConfig;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        return BadgeListV2WidgetViewHolder.INSTANCE.createView(this.this$0.getContext(), this.$decoratorConfig);
    }
}
