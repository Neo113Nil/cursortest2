package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.footer;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views.ProductMediaStackView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/footer/SelectionInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/widget/LinearLayout;", "root", "<init>", "(Landroid/widget/LinearLayout;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionInfo;", "item", "", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$SelectionInfo;)V", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/ProductMediaStackView;", "productMediaStackView", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/ProductMediaStackView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionInfoViewHolder extends RecyclerView.C {

    @NotNull
    private final ProductMediaStackView productMediaStackView;

    @NotNull
    private final LinearLayout root;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionInfoViewHolder(@NotNull LinearLayout root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ProductMediaStackView productMediaStackView = new ProductMediaStackView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(Dimens.INSTANCE.getDP_8());
        productMediaStackView.setLayoutParams(layoutParams);
        root.addView(productMediaStackView);
        this.productMediaStackView = productMediaStackView;
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        root.addView(textAtomV2View);
        this.title = textAtomV2View;
    }

    public final void bind(@NotNull SelectionsListVI.TileFooterContent.SelectionInfo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ProductMediaStackView productMediaStackView = this.productMediaStackView;
        List<ProductMediaDTO> productImages = item.getProductImages();
        if (productImages == null) {
            productImages = K.f71697a;
        }
        productMediaStackView.setItems(productImages);
        TextHolderKt.bind$default(this.title, item.getTitle(), null, 2, null);
    }
}
