package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/UserLegalEntitiesItemDecorationV2;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "getTopOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "pos", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "adapter", "", "isValidPos", "(ILandroidx/recyclerview/widget/RecyclerView$g;)Z", "Landroid/graphics/Rect;", "outRect", "view", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "topOffset", "I", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserLegalEntitiesItemDecorationV2 extends RecyclerView.n {
    private final int topOffset = Dimens.INSTANCE.getDP_8();

    private final int getTopOffset(RecyclerView parent, View child) {
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(child));
        int intValue = valueOf.intValue();
        Integer num = null;
        if (!isValidPos(intValue, parent.getAdapter()) || !isValidPos(intValue - 1, parent.getAdapter())) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        int intValue2 = valueOf.intValue();
        Object adapter = parent.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar != null) {
            l lVar2 = lVar.a(intValue2) ? lVar : null;
            c b11 = lVar2 != null ? lVar2.b(intValue2) : null;
            int i11 = intValue2 - 1;
            if (!lVar.a(i11)) {
                lVar = null;
            }
            c b12 = lVar != null ? lVar.b(i11) : null;
            if ((b11 instanceof LegalsItemVOV2) && (b12 instanceof LegalsItemVOV2)) {
                num = Integer.valueOf(this.topOffset);
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final boolean isValidPos(int pos, RecyclerView.g<? extends RecyclerView.C> adapter) {
        if (adapter != null) {
            int cardsCount = adapter.getCardsCount();
            if (pos >= 0 && pos < cardsCount) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.top = getTopOffset(parent, view);
    }
}
