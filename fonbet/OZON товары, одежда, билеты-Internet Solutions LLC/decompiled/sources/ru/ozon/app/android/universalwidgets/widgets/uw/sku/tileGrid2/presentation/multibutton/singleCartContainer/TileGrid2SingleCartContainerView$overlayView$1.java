package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.button.ButtonOverlayView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/button/ButtonOverlayView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileGrid2SingleCartContainerView$overlayView$1 extends AbstractC7737t implements Function0<ButtonOverlayView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TileGrid2SingleCartContainerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2SingleCartContainerView$overlayView$1(Context context, TileGrid2SingleCartContainerView tileGrid2SingleCartContainerView) {
        super(0);
        this.$context = context;
        this.this$0 = tileGrid2SingleCartContainerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonOverlayView invoke() {
        ButtonOverlayView buttonOverlayView = new ButtonOverlayView(this.$context, null, 0, 6, null);
        buttonOverlayView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        buttonOverlayView.setVisibility(8);
        this.this$0.addView(buttonOverlayView);
        return buttonOverlayView;
    }
}
