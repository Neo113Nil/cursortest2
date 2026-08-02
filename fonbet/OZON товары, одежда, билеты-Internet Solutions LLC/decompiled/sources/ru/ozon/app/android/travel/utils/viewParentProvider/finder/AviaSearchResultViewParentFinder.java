package ru.ozon.app.android.travel.utils.viewParentProvider.finder;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.R$id;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/utils/viewParentProvider/finder/AviaSearchResultViewParentFinder;", "Lru/ozon/app/android/travel/utils/viewParentProvider/finder/ViewParentFinder;", "<init>", "()V", "findParentViewGroup", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "hasReachedRoot", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaSearchResultViewParentFinder implements ViewParentFinder {
    private final boolean hasReachedRoot(ViewGroup view) {
        return view.getId() == R$id.aviaSearchResultRoot;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x000e, code lost:
    
        r3 = null;
     */
    @Override // ru.ozon.app.android.travel.utils.viewParentProvider.finder.ViewParentFinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewGroup findParentViewGroup(@NotNull View view) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
            while (viewGroup != null) {
                if (hasReachedRoot(viewGroup)) {
                    return viewGroup;
                }
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                }
            }
            return null;
        }
        viewGroup = null;
    }
}
