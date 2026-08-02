package ru.ozon.app.android.travel.molecules.view.rowLinearLayout;

import B0.A0;
import Sc.C4005g;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayoutManager;", "", "<init>", "()V", "layout", "", "parent", "Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout;", "performLayout", "throwIllegalLayoutParams", "", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RowLinearLayoutManager {
    private final void performLayout(RowLinearLayout rowLinearLayout) {
        int measuredRowsMaxIndex;
        int paddingLeft = rowLinearLayout.getPaddingLeft();
        int paddingTop = rowLinearLayout.getPaddingTop();
        if (rowLinearLayout.getMeasuredRows$molecules_prodGoogleAllVendorsRelease().isEmpty() || (measuredRowsMaxIndex = rowLinearLayout.getMeasuredRowsMaxIndex()) < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            RowLinearLayout.RowInfo rowInfo = rowLinearLayout.getMeasuredRows$molecules_prodGoogleAllVendorsRelease().get(Integer.valueOf(i11));
            if (rowInfo != null && !rowInfo.getChildren().isEmpty()) {
                int rowHeight = rowInfo.getRowHeight();
                int size = rowInfo.getChildren().size();
                int i12 = paddingLeft;
                for (int i13 = 0; i13 < size; i13++) {
                    View view = (View) C7714v.Q(i13, rowInfo.getChildren());
                    if (view != null && view.getVisibility() != 8) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        RowLinearLayout.LayoutParams layoutParams2 = layoutParams instanceof RowLinearLayout.LayoutParams ? (RowLinearLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 == null) {
                            throwIllegalLayoutParams(view.getLayoutParams());
                            throw new C4005g();
                        }
                        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        int i17 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        int gravity = layoutParams2.getGravity() & 112;
                        int i18 = gravity != 16 ? gravity != 80 ? i16 + paddingTop : ((rowHeight - i17) - measuredHeight) + paddingTop : ((((rowHeight - i16) - i17) - measuredHeight) / 2) + paddingTop + i16;
                        int i19 = i12 + i14;
                        int i21 = i19 + measuredWidth;
                        view.layout(i19, i18, i21, i18 + measuredHeight);
                        i12 = i21 + i15;
                    }
                }
                paddingTop = rowLinearLayout.getRowSpacing() + rowHeight + paddingTop;
            }
            if (i11 == measuredRowsMaxIndex) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final Void throwIllegalLayoutParams(ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException(A0.b("Nested children must use RowLinearLayout.LayoutParams. Found: ", layoutParams != null ? layoutParams.getClass().getSimpleName() : null, ". Ensure child views are configured with the correct layout parameters.").toString());
    }

    public final void layout(@NotNull RowLinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        performLayout(parent);
    }
}
