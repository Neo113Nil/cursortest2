package ru.ozon.uni.android.uikit.extensions.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u001a\u001a\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"layoutLeftTop", "", "Landroid/view/View;", "left", "", "top", "layoutRightTop", "right", "layoutLeftBottom", "bottom", "layoutRightBottom", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LayoutExtKt {
    public static final void layoutLeftBottom(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.layout(i11, i12 - view.getMeasuredHeight(), view.getMeasuredWidth() + i11, i12);
    }

    public static final void layoutLeftTop(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.layout(i11, i12, view.getMeasuredWidth() + i11, view.getMeasuredHeight() + i12);
    }

    public static final void layoutRightBottom(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.layout(i11 - view.getMeasuredWidth(), i12 - view.getMeasuredHeight(), i11, i12);
    }

    public static final void layoutRightTop(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.layout(i11 - view.getMeasuredWidth(), i12, i11, view.getMeasuredHeight() + i12);
    }
}
