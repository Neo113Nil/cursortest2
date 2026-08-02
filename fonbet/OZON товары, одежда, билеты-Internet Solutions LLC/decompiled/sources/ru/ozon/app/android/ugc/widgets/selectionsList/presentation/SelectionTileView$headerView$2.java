package ru.ozon.app.android.ugc.widgets.selectionsList.presentation;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views.SelectionTileHeaderView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/SelectionTileHeaderView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionTileView$headerView$2 extends AbstractC7737t implements Function0<SelectionTileHeaderView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SelectionTileView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionTileView$headerView$2(SelectionTileView selectionTileView, Context context) {
        super(0);
        this.this$0 = selectionTileView;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SelectionTileHeaderView invoke() {
        FavoriteProductDelegate favoriteProductDelegate;
        favoriteProductDelegate = this.this$0.favoriteProductMoleculeDelegate;
        if (favoriteProductDelegate == null) {
            return null;
        }
        Context context = this.$context;
        SelectionTileView selectionTileView = this.this$0;
        SelectionTileHeaderView selectionTileHeaderView = new SelectionTileHeaderView(context, favoriteProductDelegate);
        selectionTileHeaderView.setId(R$id.selectionHeaderView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        selectionTileHeaderView.setLayoutParams(bVar);
        selectionTileHeaderView.setZ(4.0f);
        selectionTileView.addView(selectionTileHeaderView);
        return selectionTileHeaderView;
    }
}
