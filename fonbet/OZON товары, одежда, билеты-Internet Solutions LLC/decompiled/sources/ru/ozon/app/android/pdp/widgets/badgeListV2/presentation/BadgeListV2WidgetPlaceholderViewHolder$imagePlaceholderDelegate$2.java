package ru.ozon.app.android.pdp.widgets.badgeListV2.presentation;

import Sc.InterfaceC4008j;
import Vg.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2Binder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BadgeListV2WidgetPlaceholderViewHolder$imagePlaceholderDelegate$2 extends AbstractC7737t implements Function0<BadgeListV2Binder> {
    final /* synthetic */ i $container;
    final /* synthetic */ d $customActionHandlersStoreFactory;
    final /* synthetic */ WidgetImagePlaceholderAdapter $widgetImagePlaceholderAdapter;
    final /* synthetic */ BadgeListV2WidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeListV2WidgetPlaceholderViewHolder$imagePlaceholderDelegate$2(BadgeListV2WidgetPlaceholderViewHolder badgeListV2WidgetPlaceholderViewHolder, WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, i iVar, d dVar) {
        super(0);
        this.this$0 = badgeListV2WidgetPlaceholderViewHolder;
        this.$widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.$container = iVar;
        this.$customActionHandlersStoreFactory = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BadgeListV2Binder invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.this$0.mainView;
        return new BadgeListV2Binder(this.this$0, this.$widgetImagePlaceholderAdapter, this.$container, (RecyclerView) interfaceC4008j.getValue(), this.$customActionHandlersStoreFactory);
    }
}
