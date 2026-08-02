package ru.ozon.app.android.travel.utils.viewParentProvider.provider;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.viewParentProvider.finder.AviaSearchResultViewParentFinder;
import ru.ozon.app.android.travel.utils.viewParentProvider.finder.DefaultViewParentFinder;
import ru.ozon.app.android.travel.utils.viewParentProvider.finder.ViewParentFinder;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/utils/viewParentProvider/provider/ViewParentProvider;", "", "<init>", "()V", "finders", "", "Lru/ozon/app/android/travel/utils/viewParentProvider/finder/ViewParentFinder;", "provideParentViewGroup", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewParentProvider {
    public static final int $stable = 8;

    @NotNull
    private final List<ViewParentFinder> finders = C7714v.b0(new AviaSearchResultViewParentFinder(), new DefaultViewParentFinder());

    public final ViewGroup provideParentViewGroup(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<ViewParentFinder> it = this.finders.iterator();
        while (it.hasNext()) {
            ViewGroup findParentViewGroup = it.next().findParentViewGroup(view);
            if (findParentViewGroup != null) {
                return findParentViewGroup;
            }
        }
        return null;
    }
}
