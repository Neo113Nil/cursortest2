package ru.ozon.app.android.travel.utils.viewParentProvider.finder;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/utils/viewParentProvider/finder/DefaultViewParentFinder;", "Lru/ozon/app/android/travel/utils/viewParentProvider/finder/ViewParentFinder;", "<init>", "()V", "findParentViewGroup", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultViewParentFinder implements ViewParentFinder {
    @Override // ru.ozon.app.android.travel.utils.viewParentProvider.finder.ViewParentFinder
    public ViewGroup findParentViewGroup(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }
}
