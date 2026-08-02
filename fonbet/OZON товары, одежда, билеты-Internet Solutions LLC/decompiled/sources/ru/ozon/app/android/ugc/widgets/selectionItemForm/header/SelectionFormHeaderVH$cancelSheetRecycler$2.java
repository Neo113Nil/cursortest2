package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import android.widget.LinearLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.header.cancelSheet.SheetAdapter;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionFormHeaderVH$cancelSheetRecycler$2 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ SelectionFormHeaderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormHeaderVH$cancelSheetRecycler$2(SelectionFormHeaderVH selectionFormHeaderVH) {
        super(0);
        this.this$0 = selectionFormHeaderVH;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        i iVar;
        SheetAdapter sheetAdapter;
        iVar = this.this$0.container;
        RecyclerView recyclerView = new RecyclerView(iVar.L());
        SelectionFormHeaderVH selectionFormHeaderVH = this.this$0;
        recyclerView.setId(R$id.selectionFormCancelSheetContent);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        recyclerView.setPadding(dimens.getDP_16(), recyclerView.getPaddingTop(), dimens.getDP_16(), recyclerView.getPaddingBottom());
        recyclerView.setBackgroundColor(a.getColor(recyclerView.getContext(), UniColors.LAYER_FLOOR_1.getResId()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        sheetAdapter = selectionFormHeaderVH.getSheetAdapter();
        recyclerView.setAdapter(sheetAdapter);
        return recyclerView;
    }
}
