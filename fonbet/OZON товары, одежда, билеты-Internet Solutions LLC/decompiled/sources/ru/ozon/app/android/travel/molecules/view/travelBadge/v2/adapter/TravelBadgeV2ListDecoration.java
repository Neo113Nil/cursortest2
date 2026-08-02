package ru.ozon.app.android.travel.molecules.view.travelBadge.v2.adapter;

import Nh.a;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelBadge/v2/adapter/TravelBadgeV2ListDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "clearanceSize", "orientation", "<init>", "(II)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelBadgeV2ListDecoration extends RecyclerView.n {
    private final int clearanceSize;
    private final int orientation;

    public TravelBadgeV2ListDecoration(int i11, int i12) {
        this.clearanceSize = i11;
        this.orientation = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = a.a(parent, "parent", state, "state", view);
        if (a11 == -1 || state.b() < 2) {
            return;
        }
        if (a11 == 0) {
            int i11 = this.orientation;
            if (i11 == 0) {
                outRect.right = this.clearanceSize;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                outRect.bottom = this.clearanceSize;
                return;
            }
        }
        if (a11 == state.b() - 1) {
            int i12 = this.orientation;
            if (i12 == 0) {
                outRect.left = this.clearanceSize;
                return;
            } else {
                if (i12 != 1) {
                    return;
                }
                outRect.top = this.clearanceSize;
                return;
            }
        }
        int i13 = this.orientation;
        if (i13 == 0) {
            int i14 = this.clearanceSize;
            outRect.set(i14, 0, i14, 0);
        } else {
            if (i13 != 1) {
                return;
            }
            int i15 = this.clearanceSize;
            outRect.set(0, i15, 0, i15);
        }
    }
}
