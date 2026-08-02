package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryFiltersOverlayWidgetViewHolder$onStickyItemClick$1 extends AbstractC7737t implements Function2<Integer, AtomAction, Unit> {
    final /* synthetic */ HotelsGalleryFiltersOverlayWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFiltersOverlayWidgetViewHolder$onStickyItemClick$1(HotelsGalleryFiltersOverlayWidgetViewHolder hotelsGalleryFiltersOverlayWidgetViewHolder) {
        super(2);
        this.this$0 = hotelsGalleryFiltersOverlayWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, AtomAction atomAction) {
        invoke(num.intValue(), atomAction);
        return Unit.f71690a;
    }

    public final void invoke(int i11, AtomAction atomAction) {
        HotelsGalleryFiltersStickyAdapter hotelsGalleryFiltersStickyAdapter;
        Function1 function1;
        hotelsGalleryFiltersStickyAdapter = this.this$0.stickyAdapter;
        hotelsGalleryFiltersStickyAdapter.setSelectedItem(i11);
        if (atomAction != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(atomAction);
        }
    }
}
