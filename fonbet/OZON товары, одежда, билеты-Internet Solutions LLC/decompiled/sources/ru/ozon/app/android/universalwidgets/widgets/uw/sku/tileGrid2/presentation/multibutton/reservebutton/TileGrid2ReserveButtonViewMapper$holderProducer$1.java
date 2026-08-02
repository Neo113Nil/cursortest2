package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.reservebutton;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.ReserveButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ReserveButtonViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TileGrid2ReserveButtonViewHolder> {
    final /* synthetic */ TileGrid2ReserveButtonViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ReserveButtonViewMapper$holderProducer$1(TileGrid2ReserveButtonViewMapper tileGrid2ReserveButtonViewMapper) {
        super(2);
        this.this$0 = tileGrid2ReserveButtonViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TileGrid2ReserveButtonViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        TileGrid2ReserveButtonView tileGrid2ReserveButtonView = (TileGrid2ReserveButtonView) view;
        TileOverlayBinder tileOverlayBinder = new TileOverlayBinder(null, refs, false, tileGrid2ReserveButtonView.getOverlayView());
        return new TileGrid2ReserveButtonViewHolder(tileGrid2ReserveButtonView, refs, new ReserveButtonBinder(this.this$0.component().getFavoriteReserveButtonDelegateProvider().get(refs)), this.this$0.component().getFrameBinder(), tileOverlayBinder, this.this$0.component().getWishlistServiceLazy());
    }
}
