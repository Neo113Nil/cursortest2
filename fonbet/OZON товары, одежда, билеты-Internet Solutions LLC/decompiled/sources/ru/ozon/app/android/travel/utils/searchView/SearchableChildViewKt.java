package ru.ozon.app.android.travel.utils.searchView;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"findSearchableChild", "Landroid/view/View;", "Landroid/view/ViewGroup;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchableChildViewKt {
    public static final View findSearchableChild(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return findSearchableChild(viewGroup);
        }
        return null;
    }

    private static final View findSearchableChild(ViewGroup viewGroup) {
        View findSearchableChild;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof SearchableChildView) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (findSearchableChild = findSearchableChild((ViewGroup) childAt)) != null) {
                return findSearchableChild;
            }
        }
        return null;
    }
}
