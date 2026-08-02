package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VariantPickerVH$contentView$2 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ VariantPickerVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariantPickerVH$contentView$2(VariantPickerVH variantPickerVH) {
        super(0);
        this.this$0 = variantPickerVH;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        VariantsListAdapter variantsListAdapter;
        RecyclerView recyclerView = new RecyclerView(this.this$0.getContext());
        VariantPickerVH variantPickerVH = this.this$0;
        recyclerView.setId(R$id.reviewVariantsListRv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.bottomMargin = dimens.getDP_32();
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), dimens.getDP_32());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        variantsListAdapter = variantPickerVH.variantsAdapter;
        recyclerView.setAdapter(variantsListAdapter);
        return recyclerView;
    }
}
