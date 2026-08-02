package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.databinding.ViewHotelsPageHeaderShimmersBinding;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetHotelsPageHeaderBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/databinding/ViewHotelsPageHeaderShimmersBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsPageHeaderWidgetViewHolder$shimmersBinding$2 extends AbstractC7737t implements Function0<ViewHotelsPageHeaderShimmersBinding> {
    final /* synthetic */ HotelsPageHeaderWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageHeaderWidgetViewHolder$shimmersBinding$2(HotelsPageHeaderWidgetViewHolder hotelsPageHeaderWidgetViewHolder) {
        super(0);
        this.this$0 = hotelsPageHeaderWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewHotelsPageHeaderShimmersBinding invoke() {
        WidgetHotelsPageHeaderBinding widgetHotelsPageHeaderBinding;
        widgetHotelsPageHeaderBinding = this.this$0.binding;
        ViewHotelsPageHeaderShimmersBinding bind = ViewHotelsPageHeaderShimmersBinding.bind(widgetHotelsPageHeaderBinding.hotelsPageHeaderShimmersVS.inflate());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return bind;
    }
}
