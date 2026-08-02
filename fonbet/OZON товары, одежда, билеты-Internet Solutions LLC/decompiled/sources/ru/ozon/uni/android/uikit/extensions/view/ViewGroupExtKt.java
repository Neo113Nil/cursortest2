package ru.ozon.uni.android.uikit.extensions.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\t\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0005\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroid/view/ViewGroup;", "", "l", "Landroid/view/View;", "inflate", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "layoutId", "", "attachToRoot", "(Landroid/view/ViewGroup;IZ)Landroid/view/View;", "", "children", "(Landroid/view/ViewGroup;)Ljava/lang/Iterable;", "i", "get", "child", "", "plusAssign", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "first", "(Landroid/view/ViewGroup;)Landroid/view/View;", "last", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewGroupExtKt {
    @NotNull
    public static final Iterable<View> children(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return new ViewGroupExtKt$children$1(viewGroup);
    }

    public static final View first(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return get(viewGroup, 0);
    }

    public static final View get(@NotNull ViewGroup viewGroup, int i11) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return viewGroup.getChildAt(i11);
    }

    @NotNull
    public static final View inflate(@NotNull ViewGroup viewGroup, int i11) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public static final View last(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return get(viewGroup, viewGroup.getChildCount() - 1);
    }

    public static final void plusAssign(@NotNull ViewGroup viewGroup, @NotNull View child) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        viewGroup.addView(child);
    }

    @NotNull
    public static final View inflate(@NotNull ViewGroup viewGroup, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, z11);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
