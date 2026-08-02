package ru.ozon.app.android.travel.molecules.view.rowLinearLayout;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout;", "Landroid/view/View;", "view", "", "addToFirstRow", "(Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout;Landroid/view/View;)V", "addToSecondRow", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RowLinearLayoutUtilsKt {
    public static final void addToFirstRow(@NotNull RowLinearLayout rowLinearLayout, @NotNull View view) {
        Intrinsics.checkNotNullParameter(rowLinearLayout, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout.LayoutParams");
        }
        RowLinearLayout.LayoutParams layoutParams2 = (RowLinearLayout.LayoutParams) layoutParams;
        layoutParams2.setRow(0);
        view.setLayoutParams(layoutParams2);
        rowLinearLayout.addView(view);
    }

    public static final void addToSecondRow(@NotNull RowLinearLayout rowLinearLayout, @NotNull View view) {
        Intrinsics.checkNotNullParameter(rowLinearLayout, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout.LayoutParams");
        }
        RowLinearLayout.LayoutParams layoutParams2 = (RowLinearLayout.LayoutParams) layoutParams;
        layoutParams2.setRow(1);
        view.setLayoutParams(layoutParams2);
        rowLinearLayout.addView(view);
    }
}
