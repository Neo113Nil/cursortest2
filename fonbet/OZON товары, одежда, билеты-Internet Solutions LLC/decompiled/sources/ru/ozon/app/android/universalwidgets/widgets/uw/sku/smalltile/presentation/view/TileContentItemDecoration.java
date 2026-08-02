package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/TileContentItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "additionalItemPadding", "I", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileContentItemDecoration extends RecyclerView.n {
    private final int additionalItemPadding = Dimens.INSTANCE.getDP_2();

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.C findContainingViewHolder = parent.findContainingViewHolder(view);
        AtomItemViewHolder atomItemViewHolder = findContainingViewHolder instanceof AtomItemViewHolder ? (AtomItemViewHolder) findContainingViewHolder : null;
        if (atomItemViewHolder == null) {
            outRect.setEmpty();
            return;
        }
        AtomDTO data = atomItemViewHolder.getAtom().getData();
        boolean z11 = data instanceof LabelListAtom;
        if (z11 && ((LabelListAtom.Label) C7714v.K(((LabelListAtom) data).getItems())).getIcon() == null) {
            int i11 = this.additionalItemPadding;
            outRect.set(0, i11, 0, i11);
            return;
        }
        if (z11 && ((LabelListAtom.Label) C7714v.K(((LabelListAtom) data).getItems())).getIcon() != null) {
            int i12 = this.additionalItemPadding;
            outRect.set(-i12, i12, 0, i12);
            return;
        }
        if (data instanceof TextDTO) {
            TextDTO textDTO = (TextDTO) data;
            if (textDTO.getIcon() != null && textDTO.getIconPosition() == CommonAtomLabelDTO.IconPosition.START) {
                outRect.set(-this.additionalItemPadding, 0, 0, 0);
                return;
            }
        }
        outRect.setEmpty();
    }
}
