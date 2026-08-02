package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.doubleCartButton;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.button.ButtonOverlayView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/button/ButtonOverlayView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileGrid2DoubleCartButtonView$overlayViewLazy$1 extends AbstractC7737t implements Function0<ButtonOverlayView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TileGrid2DoubleCartButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2DoubleCartButtonView$overlayViewLazy$1(Context context, TileGrid2DoubleCartButtonView tileGrid2DoubleCartButtonView) {
        super(0);
        this.$context = context;
        this.this$0 = tileGrid2DoubleCartButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonOverlayView invoke() {
        ButtonOverlayView buttonOverlayView = new ButtonOverlayView(this.$context, null, 0, 6, null);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        buttonOverlayView.setLayoutParams(bVar);
        buttonOverlayView.setVisibility(8);
        this.this$0.addView(buttonOverlayView);
        return buttonOverlayView;
    }
}
