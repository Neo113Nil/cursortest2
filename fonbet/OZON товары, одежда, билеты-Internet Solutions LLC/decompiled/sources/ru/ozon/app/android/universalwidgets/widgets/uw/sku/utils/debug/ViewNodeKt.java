package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.debug;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.Q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"toViewNodeHierarchy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/debug/ViewNode;", "Landroid/view/View;", "root", "Landroid/view/ViewGroup;", "getOffsetDescendantRectToMyCoords", "Landroid/graphics/Rect;", "ancestor", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewNodeKt {
    @NotNull
    public static final Rect getOffsetDescendantRectToMyCoords(@NotNull View view, @NotNull ViewGroup ancestor) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(ancestor, "ancestor");
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (view.equals(ancestor)) {
            return new Rect(0, 0, view.getWidth(), view.getHeight());
        }
        if (Intrinsics.d(view.getParent(), ancestor)) {
            return rect;
        }
        ancestor.offsetDescendantRectToMyCoords(view, rect);
        return rect;
    }

    @NotNull
    public static final ViewNode toViewNodeHierarchy(@NotNull View view, @NotNull ViewGroup root) {
        List list;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(root, "root");
        String simpleName = view.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        Rect offsetDescendantRectToMyCoords = getOffsetDescendantRectToMyCoords(view, root);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            IntRange o11 = h.o(0, viewGroup.getChildCount());
            ArrayList<View> arrayList = new ArrayList(C7714v.z(o11, 10));
            Iterator<Integer> it = o11.iterator();
            while (it.hasNext()) {
                arrayList.add(viewGroup.getChildAt(((Q) it).b()));
            }
            list = new ArrayList(C7714v.z(arrayList, 10));
            for (View view2 : arrayList) {
                Intrinsics.f(view2);
                list.add(toViewNodeHierarchy(view2, root));
            }
        } else {
            list = K.f71697a;
        }
        return new ViewNode(simpleName, offsetDescendantRectToMyCoords, list);
    }
}
