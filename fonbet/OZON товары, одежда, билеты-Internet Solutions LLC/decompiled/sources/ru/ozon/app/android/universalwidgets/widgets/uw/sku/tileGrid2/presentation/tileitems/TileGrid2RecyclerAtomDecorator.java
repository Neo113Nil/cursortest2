package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.tileitems;

import Sc.InterfaceC4008j;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/tileitems/TileGrid2RecyclerAtomDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "rect", "", "margin", "", "setRectAllMargins", "(Landroid/graphics/Rect;I)V", "setRectVerticalMargins", "leftMargin", "rightMargin", "setRectHorizontalMargins", "(Landroid/graphics/Rect;II)V", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "dp2$delegate", "LSc/j;", "getDp2", "()I", "dp2", "dp26$delegate", "getDp26", "dp26", "", "needRightOffsetForFirstItem", "Z", "getNeedRightOffsetForFirstItem", "()Z", "setNeedRightOffsetForFirstItem", "(Z)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2RecyclerAtomDecorator extends RecyclerView.n {

    /* renamed from: dp2$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp2 = LazyUtilsKt.unsafeLazy(TileGrid2RecyclerAtomDecorator$dp2$2.INSTANCE);

    /* renamed from: dp26$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp26 = LazyUtilsKt.unsafeLazy(TileGrid2RecyclerAtomDecorator$dp26$2.INSTANCE);
    private boolean needRightOffsetForFirstItem;

    private final int getDp2() {
        return ((Number) this.dp2.getValue()).intValue();
    }

    private final int getDp26() {
        return ((Number) this.dp26.getValue()).intValue();
    }

    private final void setRectAllMargins(Rect rect, int margin) {
        rect.left = margin;
        rect.top = margin;
        rect.right = margin;
        rect.bottom = margin;
    }

    private final void setRectHorizontalMargins(Rect rect, int leftMargin, int rightMargin) {
        rect.left = leftMargin;
        rect.right = rightMargin;
    }

    private final void setRectVerticalMargins(Rect rect, int margin) {
        rect.top = margin;
        rect.bottom = margin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.C childViewHolder = parent.getChildViewHolder(view);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (this.needRightOffsetForFirstItem && childAdapterPosition == 0) {
            setRectHorizontalMargins(outRect, getDp2(), getDp26());
            return;
        }
        boolean z11 = childViewHolder instanceof AtomItemViewHolder;
        if (z11) {
            AtomItemViewHolder atomItemViewHolder = (AtomItemViewHolder) childViewHolder;
            if (atomItemViewHolder.getAtom().getData() instanceof LabelListAtom) {
                AtomDTO data = atomItemViewHolder.getAtom().getData();
                Intrinsics.g(data, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.labelList.LabelListAtom");
                LabelListAtom.Label label = (LabelListAtom.Label) C7714v.M(((LabelListAtom) data).getItems());
                if ((label != null ? label.getIcon() : null) == null) {
                    setRectHorizontalMargins(outRect, getDp2(), getDp2());
                }
                setRectVerticalMargins(outRect, getDp2());
                return;
            }
        }
        if (z11 && (((AtomItemViewHolder) childViewHolder).getAtom().getData() instanceof StockBar)) {
            setRectAllMargins(outRect, getDp2());
        } else {
            setRectHorizontalMargins(outRect, getDp2(), getDp2());
        }
    }

    public final void setNeedRightOffsetForFirstItem(boolean z11) {
        this.needRightOffsetForFirstItem = z11;
    }
}
