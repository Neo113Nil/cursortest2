package ru.ozon.app.android.ugc.widgets.selectionsList.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views.PassThroughRecyclerView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/PassThroughRecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionTileView$footerRecycler$2 extends AbstractC7737t implements Function0<PassThroughRecyclerView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SelectionTileView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionTileView$footerRecycler$2(Context context, SelectionTileView selectionTileView) {
        super(0);
        this.$context = context;
        this.this$0 = selectionTileView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PassThroughRecyclerView invoke() {
        PassThroughRecyclerView passThroughRecyclerView = new PassThroughRecyclerView(this.$context, null, 0, 6, null);
        Context context = this.$context;
        passThroughRecyclerView.setId(R$id.selectionFooterView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = Dimens.INSTANCE.getDP_10();
        passThroughRecyclerView.setLayoutParams(bVar);
        passThroughRecyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        passThroughRecyclerView.setOverScrollMode(2);
        passThroughRecyclerView.setZ(4.0f);
        this.this$0.addView(passThroughRecyclerView);
        return passThroughRecyclerView;
    }
}
