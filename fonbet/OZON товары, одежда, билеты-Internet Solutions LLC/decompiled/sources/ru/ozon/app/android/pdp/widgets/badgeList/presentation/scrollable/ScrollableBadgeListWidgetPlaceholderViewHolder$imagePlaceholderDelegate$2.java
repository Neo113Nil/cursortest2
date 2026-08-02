package ru.ozon.app.android.pdp.widgets.badgeList.presentation.scrollable;

import Sc.InterfaceC4008j;
import Vg.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/badgeList/presentation/scrollable/ScrollableBadgeListBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ScrollableBadgeListWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2 extends AbstractC7737t implements Function0<ScrollableBadgeListBinder> {
    final /* synthetic */ d $customActionHandlersStoreFactory;
    final /* synthetic */ WidgetImagePlaceholderAdapter $widgetImagePlaceholderAdapter;
    final /* synthetic */ ScrollableBadgeListWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableBadgeListWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2(ScrollableBadgeListWidgetPlaceholderViewHolder scrollableBadgeListWidgetPlaceholderViewHolder, WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, d dVar) {
        super(0);
        this.this$0 = scrollableBadgeListWidgetPlaceholderViewHolder;
        this.$widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.$customActionHandlersStoreFactory = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScrollableBadgeListBinder invoke() {
        InterfaceC4008j interfaceC4008j;
        ComposerReferences composerReferences;
        interfaceC4008j = this.this$0.mainView;
        RecyclerView recyclerView = (RecyclerView) interfaceC4008j.getValue();
        composerReferences = this.this$0.refs;
        return new ScrollableBadgeListBinder(this.this$0, this.$widgetImagePlaceholderAdapter, recyclerView, this.$customActionHandlersStoreFactory, composerReferences);
    }
}
