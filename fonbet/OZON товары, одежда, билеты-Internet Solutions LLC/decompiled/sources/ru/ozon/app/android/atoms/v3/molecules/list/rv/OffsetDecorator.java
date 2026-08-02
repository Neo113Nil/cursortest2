package ru.ozon.app.android.atoms.v3.molecules.list.rv;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/rv/OffsetDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "", "itemPosition", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "getItemOffsets", "(Landroid/graphics/Rect;ILandroidx/recyclerview/widget/RecyclerView;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffsetDecorator extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, int itemPosition, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.getItemOffsets(outRect, itemPosition, parent);
        if (itemPosition == 0) {
            outRect.left = ResourceExtKt.toPx(16);
            outRect.right = ResourceExtKt.toPx(4);
            return;
        }
        if (itemPosition == (parent.getAdapter() != null ? r5.getCardsCount() : -1) - 1) {
            outRect.right = ResourceExtKt.toPx(16);
        } else {
            outRect.right = ResourceExtKt.toPx(4);
        }
    }
}
