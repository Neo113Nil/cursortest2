package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonView;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2RootView$countButton$1 extends AbstractC7737t implements Function0<CountButtonView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TileGrid2RootView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2RootView$countButton$1(Context context, TileGrid2RootView tileGrid2RootView) {
        super(0);
        this.$context = context;
        this.this$0 = tileGrid2RootView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CountButtonView invoke() {
        CountButtonView create = CountButtonView.INSTANCE.create(this.$context);
        TileGrid2RootView tileGrid2RootView = this.this$0;
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(tileGrid2Constants.getCountButtonSize(), tileGrid2Constants.getCountButtonSize());
        bVar.f41658v = 0;
        bVar.f41642l = tileGrid2RootView.getGalleryViewDelegate().getContainerId();
        create.setLayoutParams(bVar);
        this.this$0.addView(create);
        return create;
    }
}
