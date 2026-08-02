package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.view;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/view/HotelsHorizontalShelvesPlaceholderView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsHorizontalShelvesView$placeholderView$2 extends AbstractC7737t implements Function0<HotelsHorizontalShelvesPlaceholderView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ HotelsHorizontalShelvesView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsHorizontalShelvesView$placeholderView$2(Context context, HotelsHorizontalShelvesView hotelsHorizontalShelvesView) {
        super(0);
        this.$context = context;
        this.this$0 = hotelsHorizontalShelvesView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HotelsHorizontalShelvesPlaceholderView invoke() {
        HotelsHorizontalShelvesPlaceholderView hotelsHorizontalShelvesPlaceholderView = new HotelsHorizontalShelvesPlaceholderView(this.$context);
        hotelsHorizontalShelvesPlaceholderView.setId(R$id.hotelsHorizontalShelvesPlaceholder);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        hotelsHorizontalShelvesPlaceholderView.setLayoutParams(bVar);
        hotelsHorizontalShelvesPlaceholderView.setVisibility(8);
        this.this$0.addView(hotelsHorizontalShelvesPlaceholderView);
        return hotelsHorizontalShelvesPlaceholderView;
    }
}
